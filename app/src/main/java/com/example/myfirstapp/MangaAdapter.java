package com.example.myfirstapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by nhi on 2017-10-13.
 */

public class MangaAdapter extends ArrayAdapter {

    public MangaAdapter(@NonNull Context context, ArrayList<Manga> manga) {
        super(context, 0, manga);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View gridtItemView = convertView;
        if(gridtItemView == null){
            gridtItemView = LayoutInflater.from(getContext()).inflate(R.layout.manga_item, parent, false);
        }

        Manga manga_item = (Manga) getItem(position);

        TextView title = (TextView) gridtItemView.findViewById(R.id.manga_title);
        title.setText(manga_item.getTitle());

        TextView subtitle = (TextView) gridtItemView.findViewById(R.id.manga_subtitle);
        subtitle.setText(manga_item.getAuthor());

        return gridtItemView;
    }
}
