package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16,16,16,16);

        Bundle arguments = getIntent().getExtras();

        User user;
        if (arguments!=null){
            user = (User) arguments.getParcelable(User.class.getSimpleName());
            textView.setText("Имя: " + user.getName() + "\nОрганизация: " + user.getCompany() + "\nВозраст: " + String.valueOf(user.getAge()) );

        }
        setContentView(textView);
    }
}

