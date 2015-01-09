package com.example.actioncontentlistitem;

import shared.ui.actionscontentview.ActionsContentView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class ListitemAdapter extends BaseAdapter
{
	Context context;
	
	ListitemAdapter(Context context)
	{
		this.context = context;
	}
	
	@Override
	public int getCount()
	{
		return 40;
	}

	@Override
	public Object getItem(int position)
	{
		return position;
	}

	@Override
	public long getItemId(int position)
	{
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
		final ActionsContentView viewActionsContentView = (ActionsContentView) convertView.findViewById(R.id.actions_contentview);
		
		TextView topTextview = (TextView) convertView.findViewById(R.id.top_layout_textview);
		
		Button showButton = (Button) convertView.findViewById(R.id.top_button);
		showButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v)
			{
				viewActionsContentView.showActions();
				
			}
			
		});
		
		Button bottomButton = (Button) convertView.findViewById(R.id.bottom_button);
		bottomButton.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v)
			{
				viewActionsContentView.showContent();
			}
			
		} );
		
		return convertView;
	}

}
