package com.my.app;

import com.example.testgit.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
		Toast.makeText(this, "我的项目", Toast.LENGTH_SHORT).show();
		
	}

}
