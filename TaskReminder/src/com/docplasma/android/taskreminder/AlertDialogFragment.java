package com.docplasma.android.taskreminder;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

public class AlertDialogFragment extends DialogFragment {

	int mNum;
	
	
	static AlertDialogFragment newInstance(int num) {
		AlertDialogFragment f = new AlertDialogFragment();
		
		Bundle args = new Bundle();
		args.putInt("num", num);
		f.setArguments(args);
		
		return f;
		
	}

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
