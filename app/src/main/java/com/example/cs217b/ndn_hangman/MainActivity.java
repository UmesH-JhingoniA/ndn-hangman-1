package com.example.cs217b.ndn_hangman;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_new = (Button) findViewById(R.id.button_ai);
        button_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "New Game button clicked");
                Intent intent = new Intent(MainActivity.this, NewGameActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button button_join = (Button) findViewById(R.id.button_join);
        button_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "Join Game button clicked");
                Intent intent = new Intent(MainActivity.this, JoinGameActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
