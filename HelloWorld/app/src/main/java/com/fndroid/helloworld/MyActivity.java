package com.fndroid.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2016/5/15.
 */
public class MyActivity extends Activity {
	private static final String TAG = "MyActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my);
		String message = getIntent().getStringExtra("message");
		Log.d(TAG, message);
	}
}
