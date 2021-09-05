package com.example.recyclerview_barshathapa;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    ArrayList<Country> lists1;
    ArrayList<CountryDetails> lists2;
    Context context;

    public MyAdapter(ArrayList<Country> lists1, ArrayList<CountryDetails> lists2, Context context) {
        this.lists1 = lists1;
        this.lists2 = lists2;
        this.context = context;

    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.first_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolder holder, int position) {
        holder.ccode.setText(lists1.get(position).getCcode());
        holder.CountryName.setText(lists1.get(position).getCountryName());
        holder.flagid.setImageResource(lists1.get(position).getFlagid());

        final CountryDetails details = lists2.get(position);


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, country_details.class);
                intent.putExtra("cnameID", details.getCname());
                intent.putExtra("areaID", details.getAreaa());
                intent.putExtra("relID", details.getRel());
                intent.putExtra("popID", details.getPop());
                intent.putExtra("detID", details.getDetails());
                intent.putExtra("flagID", details.getFlag());
                intent.putExtra("animID", details.getAnim());
                intent.putExtra("birdID", details.getBird());

                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return lists1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView ccode, CountryName;
        ImageView flagid;
        View view;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            view = itemView;
             ccode = itemView.findViewById(R.id.ccode);
             CountryName = itemView.findViewById(R.id.CountryName);
             flagid = itemView.findViewById(R.id.flagid);
        }

    }

}
