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
                if(b1.getText().toString().equals("")){
                    if(turn == 1){
                        b1.setText("X");
                        b1.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b1.setText("O");
                        b1.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b1.setEnabled(false);
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals("")){
                    if(turn == 1){
                        b2.setText("X");
                        b2.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b2.setText("O");
                        b2.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b2.setEnabled(false);
                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals("")){
                    if(turn == 1){
                        b3.setText("X");
                        b3.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b3.setText("O");
                        b3.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b3.setEnabled(false);
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals("")){
                    if(turn == 1){
                        b4.setText("X");
                        b4.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b4.setText("O");
                        b4.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b4.setEnabled(false);
                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals("")){
                    if(turn == 1){
                        b5.setText("X");
                        b5.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b5.setText("O");
                        b5.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b5.setEnabled(false);
                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals("")){
                    if(turn == 1){
                        b6.setText("X");
                        b6.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b6.setText("O");
                        b6.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b6.setEnabled(false);
                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals("")){
                    if(turn == 1){
                        b7.setText("X");
                        b7.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b7.setText("O");
                        b7.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b7.setEnabled(false);
                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals("")){
                    if(turn == 1){
                        b8.setText("X");
                        b8.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b8.setText("O");
                        b8.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b8.setEnabled(false);
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals("")){
                    if(turn == 1){
                        b9.setText("X");
                        b9.setBackgroundColor(getResources().getColor(R.color.red));
                        turn = 2;
                    }else{
                        b9.setText("O");
                        b9.setBackgroundColor(getResources().getColor(R.color.green));
                        turn = 1;
                    }
                    b9.setEnabled(false);
                }
                endGame();
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

        if(a == b && a == c){
            if(a.equals("X")){
                Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            }else if(a.equals("O")){
                Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            }
            if(!a.equals("")){
                reset();
            }
        }
        if(a == e && a == i){
            if(a.equals("X")){
                Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            }else if(a.equals("O")){
                Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            }
            if(!a.equals("")){
                reset();
            }
        }
        if(a == d && a == g){
            if(a.equals("X")){
                Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            }else if(a.equals("O")){
                Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            }
            if(!a.equals("")){
                reset();
            }
        }

        if(b == e && b == h){
            if(b.equals("X")){
                Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            }else if(b.equals("O")){
                Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            }
            if(!b.equals("")){
                reset();
            }
        }

        if(c == e && c == g){
            if(c.equals("X")){
                Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            }else if(c.equals("O")){
                Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            }
            if(!c.equals("")){
                reset();
            }
        }
        if(c == f && c == i){
            if(c.equals("X")){
                Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            }else if(c.equals("O")){
                Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            }
            if(!c.equals("")){
                reset();
            }
        }

        if(d == e && d == f){
            if(d.equals("X")){
                Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            }else if(d.equals("O")){
                Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            }
            if(!d.equals("")){
                reset();
            }
        }

        if(g == h && g == i){
            if(g.equals("X")){
                Toast.makeText(MainActivity.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            }else if(g.equals("O")){
                Toast.makeText(MainActivity.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            }
            if(!g.equals("")){
                reset();
            }
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
}
