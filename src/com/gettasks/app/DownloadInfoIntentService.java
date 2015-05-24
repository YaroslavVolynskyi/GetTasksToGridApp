package com.gettasks.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;

public class DownloadInfoIntentService extends IntentService {

	public static final String RESULT_KEY = "resultkey";
	
	public static final String INFO_KEY = "infokey";
	
	public static final String URL_KEY = "urlkey";
	
	public static final String COUNT_KEY = "countKey";
	
	public static final String INTENT_FILTER = "com.gettasks.app";
	
	private int result = Activity.RESULT_CANCELED;
	
	public DownloadInfoIntentService() {
		super("download service");
	}
	
	public DownloadInfoIntentService(String name) {
		super(name);
	}

	private String getParamsString(String userId, String startDate, String expStartDate, 
			int rowVersion, int stateId, int count) {
		List<NameValuePair> params = new ArrayList<>();
		params.add(new BasicNameValuePair(Constants.PARAM_USER_ID, userId));
		params.add(new BasicNameValuePair(Constants.PARAM_START_DATE, startDate));
		params.add(new BasicNameValuePair(Constants.PARAM_EXPIRATION_START_DATE, expStartDate));
		params.add(new BasicNameValuePair(Constants.PARAM_ROW_VERSION, String.valueOf(rowVersion)));
		params.add(new BasicNameValuePair(Constants.PARAM_STATE_ID, String.valueOf(stateId)));
		params.add(new BasicNameValuePair(Constants.PARAM_COUNT, String.valueOf(count)));
		return URLEncodedUtils.format(params, "utf-8");
	}
	
	@Override
	protected void onHandleIntent(Intent intent) {
		String userCredentials = new StringBuffer(Constants.LOGIN).append("@").
				append(Constants.COMPANY_ID).append(":").append(Constants.PASSWORD).toString();

		int count = intent.getIntExtra(COUNT_KEY, 10);
		String params = getParamsString(null, null, null, 0, 4, count);
		StringBuffer urlPath = new StringBuffer(intent.getStringExtra(URL_KEY))
			.append("?").append(params);
		HttpUriRequest request = new HttpGet(urlPath.toString());
		request.addHeader("Authorization", "Basic " + Base64.encodeToString(userCredentials.getBytes(), Base64.NO_WRAP));
		request.addHeader(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
		
		HttpClient client = new DefaultHttpClient();
		HttpResponse response = null;
		String responseString = null;
		try {
			response = client.execute(request);
			HttpEntity entity = response.getEntity();
			responseString = EntityUtils.toString(entity, "UTF-8");
		} catch (ClientProtocolException e) {
			Log.e("protocol exc", e.getMessage());
		} catch (IOException e) {
			Log.e("io exc", e.getMessage());
		}
		result = Activity.RESULT_OK;
		publishResult(responseString, result);
	}
	
	private void publishResult(String text, int result) {
		Intent intent = new Intent(INTENT_FILTER);
		intent.putExtra(RESULT_KEY, result);
		intent.putExtra(INFO_KEY, text);
		sendBroadcast(intent);
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		return super.onStartCommand(intent, flags, startId);
	}
}