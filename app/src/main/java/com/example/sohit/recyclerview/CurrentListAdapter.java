package com.example.sohit.recyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.List;

/**
 * Created by sohit on 17/03/16.
 */
public class CurrentListAdapter extends RecyclerView.Adapter<CurrentListAdapter.ListViewHolder> {

    List<ViewData> datalist;

    public CurrentListAdapter(List<ViewData> datalist)

    {
        this.datalist=datalist;
    }


    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.current_list_card_view, parent, false);
        ListViewHolder pvh = new ListViewHolder(v);
        return pvh;


    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, final int position) {


        holder.textViewTitle.setText(datalist.get(position).getTitle());
        holder.textViewDescription.setText(datalist.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public static class  ListViewHolder extends RecyclerView.ViewHolder{

        CardView cv;
        TextView textViewTitle;
        TextView textViewDescription;

        public ListViewHolder(View itemview)
        {
            super(itemview);
            textViewTitle=(TextView)itemview.findViewById(R.id.title_name);
            textViewDescription=(TextView)itemview.findViewById(R.id.tdescription);



        }



    }

}
