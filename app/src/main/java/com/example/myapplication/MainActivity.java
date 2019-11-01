package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img1, R.drawable.img2};
    String string[] = {"Image 1", "Image 2", "Image 3", "Image 4", "Image 5", "Image 6", "Image 1", "Image 2"};
    String string1[] = {"Text 1", "Text 2", "Text 3", "Text 4", "Text 5", "Text 6", "Text 1", "Text 2"};

    private RecyclerView.LayoutManager layoutManager;
    private AdapterCls adapterCls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        adapterCls = new AdapterCls(images, this, string, string1);
        recyclerView.setAdapter(adapterCls);

    }
}
