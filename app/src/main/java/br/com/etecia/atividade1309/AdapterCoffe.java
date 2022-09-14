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

public class AdapterCoffe extends RecyclerView.Adapter<AdapterCoffe.ViewHolder>
{
    private Context context;
    private List<Cafe> cafe;

    public AdapterCoffe() {

    }

    public AdapterCoffe(Context context, List<Cafe> cafe) {
        this.context = context;
        this.cafe = cafe;
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
        holder.descricao.setText(cafe.get(position).getDescricao());
        holder.titulo.setText(cafe.get(position).getTitulo());
        holder.imgCafe.setImageResource(cafe.get(position).getImgCafe());

        holder.idCardCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Click ativo", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return cafe.size();
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
