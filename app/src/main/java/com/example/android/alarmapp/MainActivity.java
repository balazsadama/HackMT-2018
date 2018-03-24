package com.example.android.alarmapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_layout);

        // Add items
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("reggeli", 10));
        items.add(new Item("zuhanyzas", 25));
/*        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));
        items.add(new Item("random", 7));*/

        ItemAdapter itemAdapter = new s(this, items);
        System.out.println("itt");
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemAdapter);
        // add on click listener here
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_item_one) {

            // Do something
            return true;
        }
        if (id == R.id.action_item_two) {

            // Do something
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
