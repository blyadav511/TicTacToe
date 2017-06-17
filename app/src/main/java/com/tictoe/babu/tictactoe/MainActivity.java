package com.tictoe.babu.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int turn;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        turn = 1;
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b4);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b5);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b6);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b7);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b8);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(b9);
            }
        });


    }

    void endGame(){
        String a,b,c,d,e,f,g,h,i;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if(a == b && a == c && a != ""){
            declareResuld(a);
        }
        if(a == e && a == i && a != ""){
            declareResuld(a);
        }
        if(a == d && a == g && a != ""){
            declareResuld(a);
        }

        if(b == e && b == h && b != ""){
            declareResuld(b);
        }

        if(c == e && c == g && c != ""){
            declareResuld(c);
        }
        if(c == f && c == i && c != ""){
            declareResuld(c);
        }

        if(d == e && d == f && d != ""){
            declareResuld(d);
        }

        if(g == h && g == i && g != "") {
            declareResuld(g);
        }
    }

    void  reset(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

    }

    void declareResuld(String str){
        if(str.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
        }else if(str.equals("O")){
            Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
        }
        reset();
    }

    void onButtonClick(Button b){
        if(b.getText().toString().equals("")){
            if(turn == 1){
                b.setText("X");
                b.setBackgroundColor(getResources().getColor(R.color.red));
                turn = 2;
            }else{
                b.setText("O");
                b.setBackgroundColor(getResources().getColor(R.color.green));
                turn = 1;
            }
            b.setEnabled(false);
        }
        endGame();
    }
}
