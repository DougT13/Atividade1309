package br.com.etecia.atividade1309;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class DonutsFragment extends Fragment {

    RecyclerView listaDonuts;

    List<Donuts> donuts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_donuts, container, false);

        listaDonuts = view.findViewById(R.id.idRecyclerViewDonuts);

        donuts = new ArrayList<>();

        donuts.add(new Donuts("Donut Homer", "igual da série dos simpsons", "10.0",R.drawable.donuthomer));
        donuts.add(new Donuts("Donut Glazed", "é gostoso po kkkkk", "07.5",R.drawable.donutsglazed));
        donuts.add(new Donuts("Donut Nutella", "recheado com nutella", "10.0",R.drawable.donutnutella));
        donuts.add(new Donuts("Donut KitKat", "tem kitkats", "10.0",R.drawable.donutskitkat));
        donuts.add(new Donuts("Donut Maracujá", "dá sono depois do consumo", "09.0",R.drawable.donutmaracuja));

        AdapterDonuts adapterDonuts = new AdapterDonuts(getContext(), donuts);

        listaDonuts.setLayoutManager(new GridLayoutManager(getContext(), 2));

        listaDonuts.hasFixedSize();

        listaDonuts.setAdapter(adapterDonuts);

        return view;
    }
}