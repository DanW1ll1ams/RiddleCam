package uk.me.danwilliams.riddlecam;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Daniel on 26/07/2016.
 */
public class CategoryAdapter extends ArrayAdapter<Category> {

    public CategoryAdapter(Context context,  ArrayList<Category> categories) {
        super(context, 0, categories);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Category currentCategory = getItem(position);

        // Find the TextView in the grid_list_item.xml layout with the ID title_textView.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_textView);
        titleTextView.setText(currentCategory.getCategoryTitleId());

        TextView levelsCompletedTextView = (TextView) listItemView.findViewById(R.id.level_completed_textView);
        levelsCompletedTextView.setText("0/" + currentCategory.getLevelsCount());



        // Find the ImageView in the grid_list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentCategory.getImageResourceId());




        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
