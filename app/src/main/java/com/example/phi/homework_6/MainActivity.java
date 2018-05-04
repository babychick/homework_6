package com.example.phi.homework_6;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CheckBox chb = (CheckBox) findViewById(R.id.chb);
        final AnalogClock clock = (AnalogClock) findViewById(R.id.clock);
        Button btnCtx = (Button) findViewById(R.id.btnCtx);
        Button btnThoat = (Button) findViewById(R.id.btnThoat);
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });
        chb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (chb.isChecked())
                    clock.setVisibility(View.VISIBLE);
                else
                    clock.setVisibility(View.INVISIBLE);
            }
        });

        registerForContextMenu(btnCtx);
    }
    @Override
    public void onCreateContextMenu(ContextMenu m, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(m, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, m);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.itemChanLe:
                Intent chanle = new Intent(MainActivity.this, ChanLe.class);
                startActivity(chanle);
                break;
            case R.id.itemDec2Bin:
                Intent decbin = new Intent(MainActivity.this, DecBin.class);
                startActivity(decbin);
                break;
            case R.id.itemSum:
                Intent total = new Intent(MainActivity.this, Total.class);
                startActivity(total);
                break;
        }
        return true;
    }
}
