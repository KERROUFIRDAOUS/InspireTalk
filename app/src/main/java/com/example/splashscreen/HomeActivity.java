package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_home);

        TextView txtName = findViewById(R.id.txtView);
        TextView txtAge = findViewById(R.id.txtView2);
        TextView txtSubject = findViewById(R.id.txtView3);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String age = bundle.getString("age");
        String subject = bundle.getString("subject");
        String txtViewName = bundle.getString("txtName");
        String txtViewAge = bundle.getString("txtAge");
        String txtViewSubject = bundle.getString("txtSubject");

        txtName.setText(txtViewName + " : " + name + "\n");
        txtAge.setText(txtViewAge + " : " + age + "\n");
        txtSubject.setText(txtViewSubject + " : " + subject);
    }

    public void buReturn(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
