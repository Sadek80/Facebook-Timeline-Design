package com.example.facebooktimeline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.facebooktimeline.Adapter.PostAdapter;
import com.example.facebooktimeline.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Post> posts = new ArrayList<Post>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();

        posts.add(new Post(R.drawable.profile,"Mohamed Sadek", "3h", "public", "Guess who's coming",
                R.drawable.image_1, "1.5k", "50 Comments"));

        posts.add(new Post(R.drawable.profile2,"Ahmed Salem", "1d", "friends", "Guess who's coming",
                R.drawable.image_3, "201", "10 Comments"));

        posts.add(new Post(R.drawable.profile,"Mohamed Saeed", "5m", "public", "Guess who's coming",
                R.drawable.image_2, "1.5k", "2 Comments"));

        posts.add(new Post(R.drawable.profile2,"Mohamed Sadek", "21h", "friends",
                R.drawable.image_1, "1.5k", "2 Comments"));

        posts.add(new Post(R.drawable.profile,"Ali Yasser", "3h", "public", "Guess who's coming",
                 "1.5k", "50 Comments"));

        posts.add(new Post(R.drawable.profile2,"Ziyad E.Ahmed", "3h", "public",
                R.drawable.profile2, "1.5k", "50 Comments"));

        posts.add(new Post(R.drawable.profile,"Mohamed Sadek", "3h", "public", "Guess who's coming",
                R.drawable.profile,"1.5k", "50 Comments"));


        PostAdapter adapter = new PostAdapter(posts);

        RecyclerView postList = findViewById(R.id.recycler_posts);

        postList.setAdapter(adapter);


    }
}