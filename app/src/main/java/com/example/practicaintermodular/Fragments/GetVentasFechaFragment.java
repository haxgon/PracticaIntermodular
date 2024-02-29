package com.example.practicaintermodular.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practicaintermodular.R;
import com.example.practicaintermodular.Recycler.Venta;
import com.example.practicaintermodular.Recycler.VentasAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GetVentasFechaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GetVentasFechaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private RecyclerView recyclerView;
    private VentasAdapter ventasAdapter;
    private List<Venta> listaDeVentas = new ArrayList<Venta>();
    ///////////////////////////////////////////////////
    public GetVentasFechaFragment() {
    }
    ///////////////////////////////////////////////////
     public static GetVentasFechaFragment newInstance(String param1, String param2) {
        GetVentasFechaFragment fragment = new GetVentasFechaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    ///////////////////////////////////////////////////
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    ///////////////////////////////////////////////////
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_get_ventas_fecha, container, false);
        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ventasAdapter = new VentasAdapter(listaDeVentas);
        recyclerView.setAdapter(ventasAdapter);
        return rootView;
    }
    ///////////////////////////////////////////////////
}