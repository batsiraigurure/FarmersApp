package gapps.com.farmersapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String USERNAME = "USERNAME";
    public static final String EMAIL = "EMAIL";
    EditText firstname;
    EditText email;
    Button loginButton;

    String username;
    String emailaddress;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstname = (EditText) findViewById(R.id.firstnameEditText);
        email = (EditText)findViewById(R.id.emailEditText);
        loginButton = (Button)findViewById(R.id.loginButton);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = firstname.getText().toString();
                emailaddress = email.getText().toString();

                Intent intent = new Intent(MainActivity.this, NavigationActivity.class);
                intent.putExtra(USERNAME, username);
                intent.putExtra(EMAIL, emailaddress);
                startActivity(intent);
            }
        });
    }
}
