package com.rana.listdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter {

	String strNames[] = { "Item", "Item", "Item", "Item", "Item", "Item",
			"Item", "Item", "Item", "Item", "Item", "Item", "Item", "Item",
			"Item", "Item", "Item", "Item", "Item", "Item", "Item", "Item",
			"Item", "Item", "Item", "Item", "Item", "Item" };
	Context mContext;

	public ListViewAdapter(Context context) {
		this.mContext = (MainActivity) context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return strNames.length;
	}

	@Override
	public Object getItem(int arg0) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = LayoutInflater.from(mContext);
		convertView = inflater.inflate(R.layout.list_element, null);
		TextView textViewName = (TextView) convertView
				.findViewById(R.id.textViewName);
		textViewName.setText(strNames[position]);
		return convertView;
	}
}
