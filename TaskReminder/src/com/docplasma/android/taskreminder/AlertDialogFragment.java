package com.docplasma.android.taskreminder;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;

public class AlertDialogFragment extends DialogFragment {

	/*@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		
		final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setMessage(R.string.reminder_edit_alert_dialog_confirm).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int id) {
				// TODO Save the item
				
			}
		}).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int id) {
				((AlertDialogFragment)getActivity()).doNegativeClick();

				
			}
		});
		
		return builder.create();
		
	}*/
	
	@Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //int title = getArguments().getInt("title");

        return new AlertDialog.Builder(getActivity())
                //.setIcon(R.drawable.alert_dialog_icon)
                //.setTitle(title)
                .setPositiveButton(R.string.confirm,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            ((FragmentAlertDialog)getActivity()).doPositiveClick();
                        }
                    }
                )
                .setNegativeButton(R.string.cancel,
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            ((FragmentAlertDialog)getActivity()).doNegativeClick();
                        }
                    }
                )
                .create();
    }


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alert_dialog, menu);
		return true;
	}

}
