package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterCls extends RecyclerView.Adapter<AdapterCls.ImageViewHolder> {

    private int[] image;
    private Context context;
    String string[];
    String string1[];

    private static final String KEY1 = "com.example.myapplication.KEY1";
    private static final String KEY2 = "com.example.myapplication.KEY2";
    private static final String KEY3 = "com.example.myapplication.KEY3";

    public AdapterCls(int[] image, Context context, String srting[], String string1[]) {
        this.image = image;
        this.context = context;
        this.string = srting;
        this.string1 = string1;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_layout, parent, false);
        ImageViewHolder imageViewHolder = new ImageViewHolder(view,context,image,string,string1);
        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        int image_id = image[position];
        String s = string[position];
        String s1 = string1[position];

        holder.layout_image.setImageResource(image_id);
        holder.layout_title.setText(s);
        holder.layout_new.setText(s1);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView layout_image;
        TextView layout_title;
        TextView layout_new;
        Context context;
        int[] images;
        String string[];
        String string1[];

        public ImageViewHolder(View itemView, Context context, int[] images,String string[],String string1[]) {
            super(itemView);
            layout_image = itemView.findViewById(R.id.imageView);
            layout_title = itemView.findViewById(R.id.textView1);
            layout_new = itemView.findViewById(R.id.textView2);

            itemView.setOnClickListener(this);

            this.context = context;
            this.images = images;
            this.string = string;
            this.string1 = string1;
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context,ViewDataActivity.class);
            intent.putExtra(KEY1,images[getAdapterPosition()]);
            intent.putExtra(KEY2,string[getAdapterPosition()]);
            intent.putExtra(KEY3,string1[getAdapterPosition()]);
            context.startActivity(intent);
        }
    }
}
