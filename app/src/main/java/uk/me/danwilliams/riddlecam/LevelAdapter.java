package uk.me.danwilliams.riddlecam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Daniel on 26/07/2016.
 */
public class LevelAdapter extends ArrayAdapter<Level> {

    public LevelAdapter(Context context, ArrayList<Level> levels) {
        super(context, 0, levels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.level_list_item, parent, false);
        }

        Level currentLevel = getItem(position);

        TextView questionTextView = (TextView) listItemView.findViewById(R.id.question_text_view);
        questionTextView.setText(currentLevel.getQuestion());

        TextView scoreTextView = (TextView) listItemView.findViewById(R.id.score_textView);
        scoreTextView.setText(currentLevel.getScore() + "%");

        // Find the ImageView in the grid_list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.level_imageView);
        imageView.setImageResource(currentLevel.getImageResourceId());


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
