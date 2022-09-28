package br.com.etecia.atividade1309;

import android.content.Context;
import android.content.Intent;
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
        holder.avaliacao.setText(donuts.get(position).getAvaliacao());
        holder.imgCafe.setImageResource(donuts.get(position).getImgCafe());

        holder.idCardCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(context, ClickActivity.class);

                intent.putExtra("Titulo", donuts.get(position).getTitulo());
                intent.putExtra("Descricao", donuts.get(position).getDescricao());
                intent.putExtra("avaliacao", donuts.get(position).getAvaliacao());
                intent.putExtra("Miniatura", donuts.get(position).getImgCafe());

                context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
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
        TextView descricao, titulo, avaliacao;
        ImageView imgCafe;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idCardCafe = itemView.findViewById(R.id.idCardCafe);
            descricao = itemView.findViewById(R.id.txtDescrever);
            titulo = itemView.findViewById(R.id.txtCafe);
            avaliacao = itemView.findViewById(R.id.txtRating);
            imgCafe = itemView.findViewById(R.id.imgCafe);
        }
    }
}
