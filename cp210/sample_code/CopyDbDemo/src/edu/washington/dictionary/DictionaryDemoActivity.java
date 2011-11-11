package edu.washington.dictionary;

import java.io.IOException;

import edu.washington.dictionary.DatabaseHelper;
import android.app.Activity;
import android.database.SQLException;
import android.os.Bundle;

public class DictionaryDemoActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		DatabaseHelper myDbHelper = new DatabaseHelper(this);
		myDbHelper = new DatabaseHelper(this);

		try {

			myDbHelper.createDataBase();

		} catch (IOException ioe) {

			throw new Error("Unable to create database");

		}

		try {

			myDbHelper.openDataBase();

		} catch (SQLException sqle) {

			throw sqle;

		}

	}
}