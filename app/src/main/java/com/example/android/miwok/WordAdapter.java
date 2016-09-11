package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ahsanferoz on 09/09/16.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    //Resource id for the background color of the list item
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textview);
        // Get the version name from the current Word object and
        // set this text on the miwok TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_textview);
        // Get the version number from the current Word object and
        // set this text on the default TextView
        defaultTextView.setText(currentWord.getmDefaultTranslation());

        //Find the imageview in the list_item.xml layout
        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image);

        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getmImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        //Find the color that the resource id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //set the background color
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
