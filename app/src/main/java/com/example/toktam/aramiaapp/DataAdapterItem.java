package com.example.toktam.aramiaapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DataAdapterItem extends RecyclerView.Adapter<DataAdapterItem.ViewHolder> {

    private Context context;
    private List<DataItem> data_list;
    public DataAdapterItem (Context context, List<DataItem> data_list )
    {
        this.context=context;
        this.data_list=data_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_recyclere_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        DataItem dataItem=data_list.get(i);
        viewHolder.image_item_VH.setImageDrawable(dataItem.getImage());
        viewHolder.title_item_VH.setText(dataItem.getTitle());


    }

    @Override
    public int getItemCount() {
        return data_list.size();
    }

    /**************/
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image_item_VH;
        TextView title_item_VH;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image_item_VH =(ImageView) itemView.findViewById(R.id.list_item_img);
            title_item_VH =(TextView) itemView.findViewById(R.id.list_item_title);
        }
    }
}
