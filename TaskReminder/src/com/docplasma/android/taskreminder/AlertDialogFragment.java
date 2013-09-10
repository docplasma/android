package com.docplasma.android.taskreminder;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Menu;

public class AlertDialogFragment extends DialogFragment {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_alert_dialog_fragment);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alert_dialog, menu);
		return true;
	}

}
