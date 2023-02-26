package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this,SplashActivity.class);
    }

    public void buSubmit(View view) {
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText subject = findViewById(R.id.subject);

        TextView txtName = findViewById(R.id.txtName);
        TextView txtAge = findViewById(R.id.txtAge);
        TextView txtSubject = findViewById(R.id.txtSubject);

        Intent intent = new Intent(this,HomeActivity.class);
        Bundle bundle = new Bundle();

        bundle.putString("name",name.getText().toString());
        bundle.putString("txtName",txtName.getText().toString());
        bundle.putString("age",age.getText().toString());
        bundle.putString("txtAge",txtAge.getText().toString());
        bundle.putString("subject",subject.getText().toString());
        bundle.putString("txtSubject",txtSubject.getText().toString());

        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();
    }

}