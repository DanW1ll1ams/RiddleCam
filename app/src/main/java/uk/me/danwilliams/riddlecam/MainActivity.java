package uk.me.danwilliams.riddlecam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of words
        final ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category(R.string.category_animals, R.drawable.placeholder, 20, AnimalsActivity.class));
        categories.add(new Category(R.string.category_food, R.drawable.placeholder, 20, AnimalsActivity.class));
        categories.add(new Category(R.string.category_home, R.drawable.placeholder, 20, AnimalsActivity.class));
        categories.add(new Category(R.string.category_music, R.drawable.placeholder, 20, AnimalsActivity.class));
        categories.add(new Category(R.string.category_places, R.drawable.placeholder, 20, AnimalsActivity.class));
        categories.add(new Category(R.string.category_random, R.drawable.placeholder, 20, AnimalsActivity.class));
        categories.add(new Category(R.string.category_sports, R.drawable.placeholder, 20, AnimalsActivity.class));

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new CategoryAdapter(this, categories));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@link Word} object at the given position the user clicked on
                Category category = categories.get(position);
                Toast.makeText(MainActivity.this, category.getCategoryTitleId(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, category.getClassName());
                startActivity(intent);
            }
        });


    }
}
