package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public void clicked(View view){
        EditText edittext =findViewById(R.id.editText);
        double inr = 71.90 * Double.valueOf(edittext.getText().toString());
        ImageView imggg= (ImageView) findViewById(R.id.imageView);
        imggg.setImageResource(R.drawable.d2r);
        if(Double.valueOf(edittext.getText().toString())<0){
            Toast.makeText(this,"Should be greater than Zero",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,""+inr,Toast.LENGTH_LONG).show();
            imggg.setImageResource(R.drawable.rupi);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
