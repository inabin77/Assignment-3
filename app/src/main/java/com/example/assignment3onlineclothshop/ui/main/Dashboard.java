package com.example.assignment3onlineclothshop.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.assignment3onlineclothshop.R;

public class Dashboard extends AppCompatActivity {

    Button addItem, showItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        addItem = findViewById(R.id.btnAdd);
        showItems = findViewById(R.id.btnShowItems);


        addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddItemActivity.class));

            }
        });

        showItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ShowItemsActivity.class));
            }
        });

    }


}
