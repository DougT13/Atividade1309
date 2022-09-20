package br.com.etecia.atividade1309;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CoffeFragment extends Fragment {

    RecyclerView listaCoffe;

    List<Cafe> cafe;
   // Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_coffe, container, false);

        listaCoffe = view.findViewById(R.id.idRecyclerViewCoffe);

        cafe = new ArrayList<>();

        cafe.add(new Cafe("Café Expresso", "Um ótimo café", "10.0" ,R.drawable.cafeexpresso));
        cafe.add(new Cafe("Café Americano", "Um café bem americanizado", "10.0" ,R.drawable.cafeamericano));
        cafe.add(new Cafe("Café Breve", "Um café rápido", "10.0" ,R.drawable.cafebreve));
        cafe.add(new Cafe("Café com Leite", "Um café tradicional (mas com leite)", "10.0" ,R.drawable.cafecomleite));
        cafe.add(new Cafe("Café Irlandês", "Um café gringo", "10.0" ,R.drawable.cafeirlandes));

        AdapterCoffe adapterCoffe = new AdapterCoffe(getContext(), cafe);

        listaCoffe.setLayoutManager(new GridLayoutManager(getContext(), 2));

        listaCoffe.hasFixedSize();

        listaCoffe.setAdapter(adapterCoffe);

        return view;
    }
}