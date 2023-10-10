package com.example.semi_final.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
//import com.example.semi_final.Activities.DetailActivity;
import com.example.semi_final.Domain.ProductDomain;
import com.example.semi_final.R;

import java.util.ArrayList;

public class ProductListAdapter extends RecyclerView.Adapter<ProductListAdapter.Viewholder> {

    ArrayList<ProductDomain> items;
    Context context;

    public ProductListAdapter(ArrayList<ProductDomain> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ProductListAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_pop_list,parent,false);
        context=parent.getContext();
        return new Viewholder(inflate);
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView Title,Price;
        ImageView pic;
        public Viewholder(@NonNull View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.txtProductName);
            Price = itemView.findViewById(R.id.txtProductPrice);
            pic = itemView.findViewById(R.id.imgProductPic);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ProductListAdapter.Viewholder holder, int position) {
        holder.Title.setText(items.get(position).getTitle());
        holder.Price.setText("$"+items.get(position).getPrice());

        int drawableResourceId=holder.itemView.getResources().getIdentifier(items.get(position).getPicUrl(),
                "drawable", holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .transform(new GranularRoundedCorners(30, 30, 0, 0))
                .into(holder.pic);

        holder.itemView.setOnClickListener(view -> {
            Intent intent =new Intent(holder.itemView.getContext(), DetailActivity.class);
            intent.putExtra("object", String.valueOf(items.get(position)));
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    private class DetailActivity {
    }
}
