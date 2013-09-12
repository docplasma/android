package com.docplasma.android.taskreminder;

<<<<<<< HEAD
import android.app.AlertDialog;
=======
>>>>>>> 50e5a6c2ead14e3a8a226474664d071291b33888
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

public class AlertDialogFragment extends DialogFragment {

<<<<<<< HEAD
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

=======
	int mNum;
	
	
	static AlertDialogFragment newInstance(int num) {
		AlertDialogFragment f = new AlertDialogFragment();
		
		Bundle args = new Bundle();
		args.putInt("num", num);
		f.setArguments(args);
		
		return f;
		
	}
>>>>>>> 50e5a6c2ead14e3a8a226474664d071291b33888

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		mNum = getArguments().getInt("num");
		
		int style = DialogFragment.STYLE_NORMAL, theme = 0;
		switch ((mNum-1) % 6) {
		
		case 1: style = DialogFragment.STYLE_NO_TITLE; break;
		case 2: style = DialogFragment.STYLE_NO_FRAME; break;
		case 3: style = DialogFragment.STYLE_NO_INPUT; break;
		case 4: style = DialogFragment.STYLE_NORMAL; break;
		case 5: style = DialogFragment.STYLE_NORMAL; break;
		case 6: style = DialogFragment.STYLE_NORMAL; break;
		case 7: style = DialogFragment.STYLE_NO_FRAME; break;
		case 8: style = DialogFragment.STYLE_NORMAL; break;
		
		}
		
		switch ((mNum-1)%6) {
		//case4: theme = android.R.style.Theme_Holo; break;
		//case5: theme = android.R.style.Theme_Holo_Light_Dialog; break;
		
		
		}
	}

}
