package com.example.androidloadimagefromurl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageview);

        //Now Loading Image From Url using Picasso first

//        Picasso.with(MainActivity.this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBxTEtIzTykWwckXBAk9Z0GKePebU8A452-tR51ZgGnqXm6pqf")
//                .placeholder(R.drawable.bg_grey)
//                .into(imageView);

        //Now Lets Used another Library which is glide.

        RequestOptions requestOptions=new RequestOptions();
        requestOptions.placeholder(R.drawable.bg_grey);
        requestOptions.error(R.drawable.bg_grey);

        Glide.with(MainActivity.this)
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBxTEtIzTykWwckXBAk9Z0GKePebU8A452-tR51ZgGnqXm6pqf")
                .apply(requestOptions)
                .into(imageView);

        //it Works so it depend on Us What we Used glide or Picaso some forum and Other Say GLide is Best it has Less size than picaso and load faster.
    }
}
