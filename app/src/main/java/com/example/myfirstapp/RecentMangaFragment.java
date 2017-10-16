package com.example.myfirstapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class RecentMangaFragment extends Fragment {


    public RecentMangaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.manga_grid, container, false);

        final ArrayList<Manga> manga = new ArrayList<Manga>();
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5));

        MangaAdapter adapter = new MangaAdapter(getActivity(), manga);

        GridView gridView = (GridView) rootView.findViewById(R.id.manga_grid);
        gridView.setAdapter(adapter);

        return rootView;
    }


}
