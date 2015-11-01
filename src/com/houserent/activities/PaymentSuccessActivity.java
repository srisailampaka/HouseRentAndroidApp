package com.houserent.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PaymentSuccessActivity extends Activity {
private Button homeButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_payment_success);
		homeButton = (Button) findViewById(R.id.home_button);

		homeButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PaymentSuccessActivity.this,MainActivity.class);
				startActivity(intent);

			}
		});
	}

	
}
