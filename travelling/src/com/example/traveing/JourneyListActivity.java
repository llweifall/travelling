package com.example.traveing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Build;

public class JourneyListActivity extends Activity {
	private List<Map<String, Object>> mList;
	private ListView mListView; 
	private SimpleAdapter mListAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_journey_list);
		ActionBar actionBar=getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setTitle("北京");

		mList  = new ArrayList<Map<String,Object>>();
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("item_image", R.drawable.logo); 
		map.put("item_description",  "第一天出发"); 
		mList.add(map);
		mList.add(map);
		mList.add(map);
		mListAdapter = new SimpleAdapter(this, mList, R.layout.journey_item, 
				new String[]{"item_image", "item_description"}, 
				new int[]{R.id.item_image, R.id.item_description}); 
				
				mListView = (ListView) findViewById(R.id.listView_journey);
		mListView.setAdapter(mListAdapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.journey_list, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}


}