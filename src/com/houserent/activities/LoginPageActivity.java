package com.houserent.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPageActivity extends Activity {

	private Button loginButton, registerButton;
	private EditText etId;
	private EditText etPassword;
	private String user, password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loginpage);

		etId = (EditText) findViewById(R.id.loginpage_id);
		etPassword = (EditText) findViewById(R.id.loginpage_password);
		loginButton = (Button) findViewById(R.id.login_button);

		loginButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				user = etId.getText().toString().trim();
				password = etPassword.getText().toString().trim();
				if (user.equalsIgnoreCase("user")
						&& password.equalsIgnoreCase("1234")) {
					Intent intent = new Intent(LoginPageActivity.this,
							MainActivity.class);
					startActivity(intent);
				} else {
					Toast.makeText(getApplicationContext(),
							"Pleae check the credentials", Toast.LENGTH_LONG)
							.show();
				}
			}
		});

	}
}
