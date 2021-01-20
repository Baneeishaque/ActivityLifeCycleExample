package com.techblogon.activitylifecycleexample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        	super.onCreate(savedInstanceState);
        	setContentView(R.layout.main);
        	Toast.makeText(this, "On Create Called In First Activity", Toast.LENGTH_LONG).show();
        	Log.i("FirstActivity", "Inside onCreate");   	 
    }   
    @Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Toast.makeText(this, "On Start Called In First Activity", Toast.LENGTH_LONG).show();
		Log.i("FirstActivity", "Inside onStart");
	}   
    @Override
	protected void onResume()
	{
		// TODO Auto-generated method stub
		super.onResume();
		
		Toast.makeText(this, "On Resume Called In First Activity", Toast.LENGTH_LONG).show();
		Log.i("FirstActivity", "Inside onResume");
	} 
 @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Toast.makeText(this, "On Pause Called In First Activity", Toast.LENGTH_LONG).show();
		Log.i("FirstActivity", "Inside onPause");
	}
   @Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
		Toast.makeText(this, "On Stop Called In First Activity", Toast.LENGTH_LONG).show();
		Log.i("FirstActivity", "Inside onStop");
	}
   @Override
	protected void onDestroy() 
	{
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(this, "On Destroy Called In First Activity", Toast.LENGTH_LONG).show();
		Log.i("FirstActivity", "Inside onDestroy");
		
	}
	public void startSecondActivity(View V)
    {
    	// create an new Intent and Start Second Activity
    	Intent intent=new Intent(this,SecondActivity.class);
    	startActivity(intent);
	}
}
