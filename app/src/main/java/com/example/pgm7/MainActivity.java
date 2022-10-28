package com.example.pgm7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "File selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Edit selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sitem1:
                Toast.makeText(getApplicationContext(), "Cut selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sitem2:
                Toast.makeText(getApplicationContext(), "Copy selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sitem3:
                Toast.makeText(getApplicationContext(), "Paste selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(getApplicationContext(), "View selected", Toast.LENGTH_SHORT).show();
                break;
        }
            return super.onOptionsItemSelected(item);
    }
}