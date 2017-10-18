package com.example.myfirstapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfirstapp.objects.Manga;
import com.example.myfirstapp.adapters.MangaAdapter;
import com.example.myfirstapp.R;

import java.util.ArrayList;

public class NewMangaFragment extends Fragment {


    public NewMangaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.manga_grid, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        GridLayoutManager llm = new GridLayoutManager(getContext(), 3);
        rv.setLayoutManager(llm);

        final ArrayList<Manga> manga = getAllManga();

        MangaAdapter adapter = new MangaAdapter(getActivity(), manga);

        rv.setAdapter(adapter);

        return rootView;
    }

    private ArrayList<Manga> getAllManga() {
        ArrayList<Manga> manga = new ArrayList<Manga>();
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));
        manga.add(new Manga("Shokugeki No Souma", "Misaki", "Food things.", 5.5, R.drawable.cover));

        return manga;
    }

}
