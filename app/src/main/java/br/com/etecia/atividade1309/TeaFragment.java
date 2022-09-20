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

public class TeaFragment extends Fragment {

    RecyclerView listaTea;

    List<Tea> tea;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tea, container, false);

        listaTea = view.findViewById(R.id.idRecyclerViewTea);

        tea = new ArrayList<>();

        tea.add(new Tea("Tea de Camomila", "Te deixa brisado kkk", "10.0" ,R.drawable.teacamomila));
        tea.add(new Tea("Tea de Chocolate", "De chocolate", "6.0" ,R.drawable.teachocolate));
        tea.add(new Tea("Tea de Canela", "Muito ruim slk", "02.0" ,R.drawable.teacanela));
        tea.add(new Tea("Tea de Morango", "É gostoso e tem gosto de morango", "09.9" ,R.drawable.teamorango));
        tea.add(new Tea("Tea de Limão", "É azedin", "10.0" ,R.drawable.tealimao));

        AdapterTea adapterTea = new AdapterTea(getContext(), tea);

        listaTea.setLayoutManager(new GridLayoutManager(getContext(), 2));

        listaTea.hasFixedSize();

        listaTea.setAdapter(adapterTea);


        return view;
    }
}