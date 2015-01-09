package com.example.actioncontentlistitem;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListView listview = (ListView) findViewById(R.id.activity_main_lsitview);
		ListitemAdapter adapter = new ListitemAdapter(this);
		listview.setAdapter(adapter);
	}

}
