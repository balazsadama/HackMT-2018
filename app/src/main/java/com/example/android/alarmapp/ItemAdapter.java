package com.example.android.alarmapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Adam on 3/24/2018.
 */

public class ItemAdapter extends ArrayAdapter<Item> {


    public ItemAdapter(Activity context, ArrayList<Item> arrayList){
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the @Word object located at this position in the list
        Item currentWord = getItem(position);

        TextView item_name = (TextView)listItemView.findViewById(R.id.item_name);
        item_name.setText(currentWord.getItemName());

        EditText edit_text = (EditText)listItemView.findViewById(R.id.item_time);
        edit_text.setText(currentWord.getDuration());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.trash_icon);
        imageView.setImageResource(R.drawable.ic_trash);


/*        // Find the view the color needs to be applied onto
        LinearLayout linearLayout = (LinearLayout)listItemView.findViewById(R.id.translations_layout);
        // Apply the color
        linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceId));*/




        return listItemView;
    }
}
