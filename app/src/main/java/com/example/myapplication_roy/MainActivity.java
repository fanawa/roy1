package com.example.myapplication_roy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i("log", "onCreate");
	}



	//[[メニューバー]] p280
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_bar, menu);

		Log.i("log", "onCreateOptionsMenu");

		return true;
	}


	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {

		switch (item.getItemId()) {
			case R.id.top:
				Intent i = new Intent(getApplication(), WebActivity.class);
				startActivity(i);
				break;

			case R.id.store:
				Intent i2 = new Intent(getApplication(), StoreActivity.class);
				startActivity(i2);
				break;

			case R.id.contact:
				Intent i3 = new Intent(getApplication(), ContactActivity.class);
				startActivity(i3);
				break;
		}

		Log.i("log", "onCreateOptionsItemSelected");

		return true;
	}
}