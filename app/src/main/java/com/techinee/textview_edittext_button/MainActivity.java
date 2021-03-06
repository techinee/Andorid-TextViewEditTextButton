package com.techinee.textview_edittext_button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText addData;
    Button addBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"You Click ME !!",Toast.LENGTH_LONG).show();
            }
        });
        addData = (EditText) findViewById(R.id.addData);
        addData.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String text = addData.getText().toString();
                Toast.makeText(MainActivity.this, "onChanged : " + text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        addBtn = (Button)findViewById(R.id.addBtn);
        addBtn.setOnClickListener(this);
    }





    @Override
    public void onClick(View v) {
        String text = addData.getText().toString();
        Toast.makeText(this, "You Clicked Add data button : " + text, Toast.LENGTH_SHORT).show();
    }
}