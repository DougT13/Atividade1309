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

public class MuffinFragment extends Fragment {

    RecyclerView listaMuffin;

    List<Muffin> muffin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_muffin, container, false);

        listaMuffin = view.findViewById(R.id.idRecyclerViewMuffin);

        muffin = new ArrayList<>();

        muffin.add(new Muffin("Muffin de Banana", "é de banana", "07.0" ,R.drawable.muffinbanana));
        muffin.add(new Muffin("Muffin de Chocolate", "é de chocolate", "10.0" ,R.drawable.muffinchocolate));
        muffin.add(new Muffin("Muffin de Leite Ninho", "é de leite ninho", "08.0" ,R.drawable.muffinleiteninho));
        muffin.add(new Muffin("Muffin de Morango", "é de morango", "06.5" ,R.drawable.muffinmorango));
        muffin.add(new Muffin("Muffin de Nutella", "é de nutella", "10.0" ,R.drawable.muffinnutella));

        AdapterMuffin adapterMuffin = new AdapterMuffin(getContext(), muffin);

        listaMuffin.setLayoutManager(new GridLayoutManager(getContext(), 2));

        listaMuffin.hasFixedSize();

        listaMuffin.setAdapter(adapterMuffin);


        return view;
    }
}