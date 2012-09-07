package com.example.samplephonegap;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.IPlugin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;

public class CordovaViewActivity extends Activity implements CordovaInterface {
    CordovaWebView cwv;
    /* Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cwv = (CordovaWebView) findViewById(R.id.tutorialView);
        cwv.loadUrl("file:///android_asset/www/index.html");
    }
	@Deprecated
	public void cancelLoadUrl() {
		// TODO Auto-generated method stub
		
	}
	public Activity getActivity() {
		// TODO Auto-generated method stub
		return this;
	}
	@Deprecated
	public Context getContext() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object onMessage(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	public void setActivityResultCallback(IPlugin arg0) {
		// TODO Auto-generated method stub
		
	}
	public void startActivityForResult(IPlugin arg0, Intent arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
}