package com.example.ex05_recyclerview01a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class SceneAdapter extends RecyclerView.Adapter<SceneAdapter.ViewHolder>{
    private ArrayList<SceneInfo> listdata;

    // RecyclerView recyclerView;
    public SceneAdapter(ArrayList<SceneInfo> listdata) {
        this.listdata = listdata;
    }

    public void setListData(ArrayList<SceneInfo> listdata){
        this.listdata = listdata;
    }
    @NonNull
    @NotNull
    @Override
    public SceneAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull @NotNull SceneAdapter.ViewHolder holder, int position) {
        final SceneInfo sceneInfo = listdata.get(position);
        holder.textView.setText(sceneInfo.getDescription());
        holder.imageView.setImageResource(sceneInfo.getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+ sceneInfo.getDescription(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public TextView textView2;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            this.textView2 = (TextView) itemView.findViewById(R.id.textView2);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}
