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

public class AdapterTea extends RecyclerView.Adapter<AdapterTea.ViewHolder>
{
    private Context context;
    private List<Tea> tea;

    public AdapterTea() {

    }

    public AdapterTea(Context context, List<Tea> tea) {
        this.context = context;
        this.tea= tea;
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
        holder.descricao.setText(tea.get(position).getDescricao());
        holder.titulo.setText(tea.get(position).getTitulo());
        holder.avaliacao.setText(tea.get(position).getAvaliacao());
        holder.imgCafe.setImageResource(tea.get(position).getImgCafe());

        holder.idCardCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click ativo", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return tea.size();
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
