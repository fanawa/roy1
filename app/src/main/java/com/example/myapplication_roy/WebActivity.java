package com.example.myapplication_roy;


import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web);

		WebView wv = findViewById(R.id.wvTop);
		wv.loadUrl("https://royhargroveofficial.com/home");

		Log.i("log", "onCreate_WEbActivity");
	}


	public void btnClose_onclick(View view){

		finish();

	}
}