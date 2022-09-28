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

public class AdapterMuffin extends RecyclerView.Adapter<AdapterMuffin.ViewHolder>
{
    private Context context;
    private List<Muffin> muffin;

    public AdapterMuffin() {

    }

    public AdapterMuffin(Context context, List<Muffin> muffin) {
        this.context = context;
        this.muffin = muffin;
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
        holder.descricao.setText(muffin.get(position).getDescricao());
        holder.titulo.setText(muffin.get(position).getTitulo());
        holder.avaliacao.setText(muffin.get(position).getAvaliacao());
        holder.imgCafe.setImageResource(muffin.get(position).getCafe());

        holder.idCardCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ClickActivity.class);

                intent.putExtra("Titulo", muffin.get(position).getTitulo());
                intent.putExtra("Descricao", muffin.get(position).getDescricao());
                intent.putExtra("avaliacao", muffin.get(position).getAvaliacao());
                intent.putExtra("Miniatura", muffin.get(position).getCafe());

                context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
            }
        });
    }

    @Override
    public int getItemCount() {
        return muffin.size();
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
