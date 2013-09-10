package com.docplasma.android.taskreminder;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class ReminderEditActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reminder_edit);
		if(getIntent() !=null) {
			
			Bundle extras = getIntent().getExtras();
			int rowId = extras !=null ? extras.getInt("RowId") : -1;
			Log.w("taskreminder", "onCreate was loaded!!");
			//Do stuff with the row id here
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reminder_edit, menu);
		return true;
	}
	
	
	public void showEditDateDialog(View v) {
		Log.w("show_date_picker", "Button was clicked!!");
	    DialogFragment newFragment = new DatePickerFragment();
	    newFragment.show(getFragmentManager(), "datePicker");
	    //updateDateButtonText();
	    //updateTimeButtonText();
	}
	
	public void showEditTimeDialog(View v) {
		Log.w("show_time_picker", "Button was clicked!!");
	    DialogFragment newFragment = new TimePickerFragment();
	    newFragment.show(getFragmentManager(), "timePicker");
	    //updateDateButtonText();
	    //updateTimeButtonText();
	}
}
