package com.example.carsdescription;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private RecyclerView rvCarsDescription;
    private ArrayList<String> carsDescriptionList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCarsDescription = requireActivity().findViewById(R.id.rv_cars_description);
        loadData();
        CarsDescriptionAdapter adapter = new CarsDescriptionAdapter(carsDescriptionList);
        rvCarsDescription.setAdapter(adapter);
    }

    private void loadData() {
        carsDescriptionList.add("Mercedes-Benz: W124");
        carsDescriptionList.add("Toyota: Camry: XV70");
        carsDescriptionList.add("Audi: TT 8J");
        carsDescriptionList.add("Honda: Civic Type R");
        carsDescriptionList.add("KIA: K5");
        carsDescriptionList.add("Chevrolet: Camaro 1969");
        carsDescriptionList.add("Volvo: S40");
        carsDescriptionList.add("Nissan: Skyline GTR");
        carsDescriptionList.add("Subaru: B4");
        carsDescriptionList.add("BMW: E90");
        carsDescriptionList.add("Hyundai: Santa Fe");
        carsDescriptionList.add("Dodge: Challenger 1970");
        carsDescriptionList.add("Lexus: LX 570");
    }
}