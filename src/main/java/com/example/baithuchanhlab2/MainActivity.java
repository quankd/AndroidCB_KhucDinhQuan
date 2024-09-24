package com.example.baithuchanhlab2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final int[] imageIds = {R.drawable.penguin, R.drawable.dog_1998627, R.drawable.zebra};
    private final int[] colorIds = {R.color.purple_200, R.color.purple_500, R.color.purple_700};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ImageView imgAnimal = findViewById(R.id.imgAnimal);
        LinearLayout rootLayout = findViewById(R.id.rootLayout);
        TextView txtAnimal = findViewById(R.id.txtAnimal);

        Random random = new Random();
        int imageId = imageIds[random.nextInt(imageIds.length)];
        int colorId = colorIds[random.nextInt(colorIds.length)];

        imgAnimal.setImageResource(imageId);
        rootLayout.setBackgroundColor(getResources().getColor(colorId));

    }
}