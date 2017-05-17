package com.ashuguy.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dell on 5/9/2017.
 */

class CustomAdapter extends ArrayAdapter<Contact> {


    ArrayList<Contact> contactsList = new ArrayList<>();
    public CustomAdapter(@NonNull Context context, int textViewId, ArrayList<Contact> contacts) {
        super(context,textViewId,contacts);
        contactsList = contacts;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (v==null)
        {

            v = inflater.inflate(R.layout.custom_row, null);
        }


        TextView textView = (TextView) v.findViewById(R.id.contact_name);
        ImageView imageView = (ImageView) v.findViewById(R.id.contact_image);
        textView.setText(contactsList.get(position).getContactName());
        imageView.setImageResource(contactsList.get(position).getContactImg());
        return v;
    }
}
