package com.docplasma.android.taskreminder;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ReminderListActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reminder_list);
		String[] items = new String[] {"Foo", "Bar", "Fizz", "Bin" };
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.reminder_row, R.id.text1, items);
		setListAdapter(adapter);
		registerForContextMenu(getListView());
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Intent i = new Intent(this, ReminderEditActivity.class);
		i.putExtra("RowId", id);
		startActivity(i);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
		
		super.onCreateContextMenu(menu, v, menuInfo);
		
		MenuInflater mi = getMenuInflater();
		
		mi.inflate(R.menu.reminder_list_item_longpress, menu);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater inflater = getMenuInflater();
		
		inflater.inflate(R.menu.reminder_list, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		
		switch(item.getItemId()) {
		
			case R.id.reminder_list_add_reminder:
				createReminder();
				return true;
			default:
				return super.onOptionsItemSelected(item);
		
		}
		
	}

	private static final int ACTIVITY_CREATE = 0;
	
	private void createReminder() {
		
		Intent i = new Intent(this, ReminderEditActivity.class);
		startActivityForResult(i, ACTIVITY_CREATE);
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
		
		super.onActivityResult(requestCode, resultCode, intent);
		//reload the list here
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		
		switch(item.getItemId()) {
		
			case R.id.reminder_list_menu_delete:
				//Delete the task
				return true;
			default:
				return super.onOptionsItemSelected(item);
		
		}
	}

}
