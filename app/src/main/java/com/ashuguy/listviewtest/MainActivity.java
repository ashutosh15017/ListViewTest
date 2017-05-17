package com.ashuguy.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ArrayList<Contact> contacts = new ArrayList<>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        contacts.add(new Contact("Ashu",R.drawable.a));
        contacts.add(new Contact("Ayan",R.drawable.b));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Contact contact = ((Contact) adapterView.getItemAtPosition(i));
                String name = String.valueOf(contact.getContactName());
                Toast.makeText(MainActivity.this,name,Toast.LENGTH_LONG).show();
            }
        });

        CustomAdapter adapter = new CustomAdapter(this,R.layout.custom_row,contacts);
        listView.setAdapter(adapter);


        }



}






