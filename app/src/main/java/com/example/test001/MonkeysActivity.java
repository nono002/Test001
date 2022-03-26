package com.example.test001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MonkeysActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnMonkeyNoHear, btnMonkeyNoSee, btnMonkeyNoSay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monkeys);

        btnMonkeyNoHear = (ImageButton) findViewById(R.id.imageNoHear);
        btnMonkeyNoSay = (ImageButton) findViewById(R.id.imageNoSay);
        btnMonkeyNoSee = (ImageButton) findViewById(R.id.imageNoSee);

        btnMonkeyNoHear.setOnClickListener(this);
        btnMonkeyNoSay.setOnClickListener(this);
        btnMonkeyNoSee.setOnClickListener(this);
    }


    public void onClick(View v){

        Toast toast;

        switch (v.getId()){
            case R.id.imageNoHear:
                toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.str_monkey_noHear), Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.imageNoSee:
                toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.str_monkey_noSee), Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.imageNoSay:
                toast = Toast.makeText(getApplicationContext(), getResources().getString(R.string.str_monkey_noSay), Toast.LENGTH_LONG);
                toast.show();
                break;
            default:
                break;
        }
    }
}