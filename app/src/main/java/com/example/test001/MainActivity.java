package com.example.test001;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnMonkeys, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMonkeys = (Button) findViewById(R.id.btnMonkeys);
        btnExit = (Button) findViewById(R.id.btnExit);

        btnMonkeys.setOnClickListener(this);
        btnExit.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnMonkeys:
                Intent intent = new Intent(this, MonkeysActivity.class);
                startActivity(intent);
                break;
            case R.id.btnExit:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Quit message!")
                        .setIcon(R.drawable.britainflag)
                        .setMessage("Are you sure want to exit?")
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
                AlertDialog alert = builder.create();
                alert.show();
                break;
            default:
                break;
        }
    }
}