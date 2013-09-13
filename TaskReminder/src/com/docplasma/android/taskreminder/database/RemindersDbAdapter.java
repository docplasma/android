//package com.docplasma.android.taskreminder;
package com.docplasma.android.taskreminder.database;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class RemindersDbAdapter {
	
	private static final String DATABASE_NAME = "data";
	private static final String DATABASE_TABLE = "reminders";
	private static final String DATABASE_VERSION = "1";
	
	private static final String KEY_TITLE = "title";
	private static final String KEY_BODY = "body";
	private static final String KEY_DATE_TIME = "reminder_date_time";
	private static final String KEY_ROWID = "_id";
	
	private DatabaseHelper mDbHelper;
	private SQLiteDatabase mDb;
	
	private static final String DATABASE_CREATE = "create table " + DATABASE_TABLE + " (" +
			KEY_ROWID + " integer primary key autoincrement, " +
			KEY_TITLE + " text not null" +
			KEY_BODY + " text not null" +
			KEY_DATE_TIME + " text not null);";
	
	private final Context mCtx;
	
	public RemindersDbAdapter(Context ctx) {
		
		this.mCtx = ctx;
	}
}
