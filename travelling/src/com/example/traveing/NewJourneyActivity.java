package com.example.traveing;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NewJourneyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_journey);
		//getActionBar().setDisplayHomeAsUpEnabled(true);
		ActionBar actionBar=getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setTitle("新建旅程");
		actionBar.setDisplayShowHomeEnabled(false);
	}
	
	public void finish(View view) {
		Intent intent = new Intent(this, JourneyListActivity.class);
        startActivity(intent);
	} 
}
