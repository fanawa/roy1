package com.example.myapplication_roy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

public class ContactActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contact);


		WebView wv = findViewById(R.id.wvContact);
		wv.loadUrl("https://royhargroveofficial.com/contact");

		Log.i("log", "onCreate_StoreActivity");
	}

	public void btnClose_onclick(View view){

		finish();

	}
}