package com.geeks.tilek_talaibekov_hw_3_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFood;
    private ArrayList<String> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
        FoodAdapter adapter = new FoodAdapter(foodList);
        rvFood.setAdapter(adapter);
    }

    private void loadData() {
        foodList.add("Manti");
        foodList.add("Oromo");
        foodList.add("Lagman");
        foodList.add("Shashlik");
        foodList.add("Pizza");
        foodList.add("Samsi");
        foodList.add("Belyash");
        foodList.add("Sandvich");
        foodList.add("Plov");
        foodList.add("Kurdak");
        foodList.add("Hinkali");
    }

    private void initView() {
        rvFood = findViewById(R.id.rv_food);
    }
}