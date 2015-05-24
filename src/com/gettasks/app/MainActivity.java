package com.gettasks.app;

import java.util.List;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends Activity implements InfoParsedListener {

	private ProgressBar progressBar;
	private EditText countEditText;
	private GridView tasksGridView;
	
	private TaskGridAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		countEditText = (EditText) findViewById(R.id.countEditText);
		progressBar = (ProgressBar) findViewById(R.id.mainProgressBar);
		tasksGridView = (GridView) findViewById(R.id.tasksGridView);
		
		if (TasksHolder.getInstance().tasksDownloaded()) {
			adapter = new TaskGridAdapter(TasksHolder.getInstance().getTasksList(), this);
			tasksGridView.setAdapter(adapter);
			adapter.notifyDataSetChanged();
		}
		
		Button getInfoButton = (Button) findViewById(R.id.getInfoButton);
		getInfoButton.setOnClickListener(getInfoButtonClickListener);
	}
	
	private OnClickListener getInfoButtonClickListener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			if (InternetConnection.isInternetConnected(MainActivity.this)) {
				String count = countEditText.getText().toString();
				if (count != null && count.length() > 0) {
					getInfo(Integer.parseInt(count));
				} else {
					Toast.makeText(MainActivity.this, 
							MainActivity.this.getResources().getString(R.string.entercount), 
							Toast.LENGTH_SHORT).show();
				}
			} else {
				Toast.makeText(MainActivity.this, 
						MainActivity.this.getResources().getString(R.string.nointernet), 
						Toast.LENGTH_SHORT).show();
			}
		}
	};
	
	private BroadcastReceiver receiver = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {
			Bundle bundle = intent.getExtras();
			if (bundle != null) {
				String result = bundle
						.getString(DownloadInfoIntentService.INFO_KEY);
				int resultCode = bundle
						.getInt(DownloadInfoIntentService.RESULT_KEY);
				if (resultCode == RESULT_OK) {
					InfoParser parser = new InfoParser(MainActivity.this);
					parser.parseInfo(result);
				} else {
					Toast.makeText(MainActivity.this, 
							MainActivity.this.getResources().getString(R.string.try_again), Toast.LENGTH_SHORT).show();
				}
			}
		}
	};
	
	private void getInfo(int count) {
		progressBar.setVisibility(View.VISIBLE);
		Intent downloadService = new Intent(this,
				DownloadInfoIntentService.class);
		downloadService.putExtra(DownloadInfoIntentService.URL_KEY, Constants.INFO_URL);
		downloadService.putExtra(DownloadInfoIntentService.COUNT_KEY, count);
		startService(downloadService);
	}

	@Override
	public void infoParsed(List<TaskEntity> tasksList) {
		progressBar.setVisibility(View.GONE);
		TasksHolder.getInstance().setTasksList(tasksList);
		if (adapter == null) {
			adapter = new TaskGridAdapter(tasksList, this);
			tasksGridView.setAdapter(adapter);
		} else {
			adapter.setTasksList(tasksList);
			adapter.notifyDataSetChanged();
		}
		TasksHolder.getInstance().setTasksDownloaded(true);
	}

	@Override
	protected void onResume() {
		super.onResume();
		registerReceiver(receiver, new IntentFilter(
				DownloadInfoIntentService.INTENT_FILTER));
	}

	@Override
	protected void onPause() {
		super.onPause();
		unregisterReceiver(receiver);
	}
	
	
}
