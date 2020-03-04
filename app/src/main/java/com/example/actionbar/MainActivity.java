package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_TITLE|ActionBar.DISPLAY_SHOW_HOME);
        actionBar.setIcon(R.drawable.send);
        actionBar.setTitle(" Welcome");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.refresh:
                Toast.makeText(MainActivity.this,"Refresh button pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.download :
                Toast.makeText(MainActivity.this,"Download button pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.send :
                Toast.makeText(MainActivity.this,"Send button pressed", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(this, Main2Activity.class));
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
