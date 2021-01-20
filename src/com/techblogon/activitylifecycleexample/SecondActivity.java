package com.techblogon.activitylifecycleexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends Activity
{
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        	super.onCreate(savedInstanceState);
        	setContentView(R.layout.layout2);
        	Toast.makeText(this, "On Create Called In Second Activity", Toast.LENGTH_LONG).show();
        	Log.i("SecondActivity", "Inside onCreate");
        	 
    }   
    @Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Toast.makeText(this, "On Start Called In Second Activity", Toast.LENGTH_LONG).show();
		Log.i("SecondActivity", "Inside onStart");
	}  
    @Override
	protected void onResume()
	{
		// TODO Auto-generated method stub
		super.onResume();
		
		Toast.makeText(this, "On Resume Called In Second Activity", Toast.LENGTH_LONG).show();
		Log.i("SecondActivity", "Inside onResume");
	}  
 @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Toast.makeText(this, "On Pause Called In Second Activity", Toast.LENGTH_LONG).show();
		Log.i("SecondActivity", "Inside onPause");
	}
   @Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		
		Toast.makeText(this, "On Stop Called In Second Activity", Toast.LENGTH_LONG).show();
		Log.i("SecondActivity", "Inside onStop");
	}
   @Override
	protected void onDestroy() 
	{
		// TODO Auto-generated method stub
		super.onDestroy();
		Toast.makeText(this, "On Destroy Called In Second Activity", Toast.LENGTH_LONG).show();
		Log.i("SecondActivity", "Inside onDestroy");	
	}
}