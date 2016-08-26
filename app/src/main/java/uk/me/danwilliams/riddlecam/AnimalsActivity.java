package uk.me.danwilliams.riddlecam;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Daniel on 26/07/2016.
 */
public class AnimalsActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_list);

        // Create a list of words
        final ArrayList<Level> levels = new ArrayList<Level>();
        levels.add(new Level("I am animal of three letters. My 1st 2 letters indicates an element and last 2 letters indicates a preposition. Who am I? ",
                R.drawable.placeholder, 80));
        levels.add(new Level("That furry little monster crawling everywhere. One step then two steps then it licks you everywhere?",
                R.drawable.placeholder, 80));
        levels.add(new Level("I have four legs but no tail. Usually I am only heard at night. what am I?",
                R.drawable.placeholder, 80));
        levels.add(new Level("I create my lair with earthen string and dispatch my prey with a biting sting. what am I?", R.drawable.placeholder, 80));
        levels.add(new Level("CAT", R.drawable.placeholder, 80));
        levels.add(new Level("CAT", R.drawable.placeholder, 80));
        levels.add(new Level("CAT", R.drawable.placeholder, 80));
        levels.add(new Level("CAT", R.drawable.placeholder, 80));

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new LevelAdapter(this, levels));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Level level = levels.get(position);
                Toast.makeText(AnimalsActivity.this, level.getQuestion(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
