package com.example.myapplication_roy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

public class StoreActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_store);


		WebView wv = findViewById(R.id.wvStore);
		wv.loadUrl("https://royhargroveofficial.com/store");

		Log.i("log", "onCreate_StoreActivity");
	}

	public void btnClose_onclick(View view){

		finish();

	}
}