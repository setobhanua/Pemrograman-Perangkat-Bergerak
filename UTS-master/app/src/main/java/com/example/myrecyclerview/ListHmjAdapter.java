package com.example.myrecyclerview;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


    public class ListHmjAdapter extends RecyclerView.Adapter<ListHmjAdapter.ListViewHolder> {
        private ArrayList<Hmj> listHmj;
        private Context context;

        public ListHmjAdapter(Context context, ArrayList<Hmj> listHmj) {
            this.listHmj = listHmj;
            this.context = context;
        }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hmj, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Hmj hmj = listHmj.get(position);

        Glide.with(holder.itemView.getContext())
                .load(hmj.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgPhoto);

        holder.tvName.setText(hmj.getName());
        holder.tvDesc.setText(hmj.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        holder.cv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, DetailListHmj.class);
                intent.putExtra("presiden_id",hmj.getId());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listHmj.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDesc;
        CardView cv;

        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_presiden_list);
            tvName = itemView.findViewById(R.id.nama_presiden_list);
            tvDesc = itemView.findViewById(R.id.desc_presiden_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
