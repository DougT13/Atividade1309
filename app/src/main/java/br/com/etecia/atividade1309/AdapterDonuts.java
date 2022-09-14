package br.com.etecia.atividade1309;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterDonuts extends RecyclerView.Adapter<AdapterDonuts.ViewHolder>
{
    private Context context;
    private List<Donuts> donuts;

    public AdapterDonuts() {

    }

    public AdapterDonuts(Context context, List<Donuts> donuts) {
        this.context = context;
        this.donuts = donuts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.cafemodelo, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.descricao.setText(donuts.get(position).getDescricao());
        holder.titulo.setText(donuts.get(position).getTitulo());
        holder.imgCafe.setImageResource(donuts.get(position).getImgCafe());

        holder.idCardCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click ativo", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return donuts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        CardView idCardCafe;
        TextView descricao, titulo;
        ImageView imgCafe;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idCardCafe = itemView.findViewById(R.id.idCardCafe);
            descricao = itemView.findViewById(R.id.txtDescrever);
            titulo = itemView.findViewById(R.id.txtCafe);
            imgCafe = itemView.findViewById(R.id.imgCafe);
        }
    }
}