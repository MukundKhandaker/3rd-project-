package com.example.third_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.li);
        EditText et = new EditText(this);
        et.setHint("");
        linearLayout.addView(et);
    }
    protected void onCreate1(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.Rg);
        RadioButton rd = new RadioButton(this);
        rd.setText("MAD");
        rd.setChecked(true);
        linearLayout.addView(rd);

    }

}