package com.houserent.activities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class PaymentActivity extends Activity {
private Button confirmButton;
private EditText expire;
private  DatePickerDialog fromDatePickerDialog;
private SimpleDateFormat dateFormatter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_payment);
		confirmButton = (Button) findViewById(R.id.confirm_button);
		expire=(EditText)findViewById(R.id.etExpire);
		Calendar newCalendar = Calendar.getInstance();
		 dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
		expire.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				  fromDatePickerDialog.show();
				return false;
			}
		});
		 fromDatePickerDialog = new DatePickerDialog(this, new OnDateSetListener() {
			 
	            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
	                Calendar newDate = Calendar.getInstance();
	                newDate.set(year, monthOfYear, dayOfMonth);
	                expire.setText(dateFormatter.format(newDate.getTime()));
	            }
	 
	        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
		confirmButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(PaymentActivity.this,PaymentSuccessActivity.class);
				startActivity(intent);

			}
		});
	}

	
}
