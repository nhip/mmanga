package com.example.myfirstapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfirstapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MangaDetailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MangaDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MangaDetailFragment extends Fragment {

    public MangaDetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MangaDetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MangaDetailFragment newInstance(String param1, String param2) {
        MangaDetailFragment fragment = new MangaDetailFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_manga_detail2, container, false);
    }

}
