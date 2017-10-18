package com.example.myfirstapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myfirstapp.activities.MangaDetail;
import com.example.myfirstapp.objects.Manga;
import com.example.myfirstapp.R;

import java.util.ArrayList;

import static android.R.attr.value;

public class MangaAdapter extends RecyclerView.Adapter<MangaAdapter.ViewHolder> {

    private ArrayList<Manga> mangaList;
    private Context context;

    public MangaAdapter(Context context, ArrayList<Manga> itemList) {
        this.mangaList = itemList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.manga_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MangaAdapter.ViewHolder holder, int position) {
        Manga manga_item = (Manga) mangaList.get(position);
        holder.title.setText(manga_item.getTitle());
        holder.subtitle.setText(manga_item.getAuthor());

        if (manga_item.getImageResourceId() != -1) {
            holder.cover.setImageResource(manga_item.getImageResourceId());
        }
    }

    @Override
    public int getItemCount() {
        return this.mangaList.size();
    }

    // stores and recycles views as they are scrolled off screen
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final Context context;

        TextView title;
        TextView subtitle;
        ImageView cover;

        ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(this);
            title = (TextView) itemView.findViewById(R.id.manga_title);
            subtitle = (TextView) itemView.findViewById(R.id.manga_subtitle);
            cover = (ImageView) itemView.findViewById(R.id.manga_cover);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent myIntent = new Intent(context, MangaDetail.class);
            myIntent.putExtra("manga", mangaList.get(getAdapterPosition())); //Optional parameters
            context.startActivity(myIntent);
        }
    }
}
