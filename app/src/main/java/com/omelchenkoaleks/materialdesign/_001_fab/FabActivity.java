package com.omelchenkoaleks.materialdesign._001_fab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omelchenkoaleks.materialdesign.R;

import java.util.ArrayList;
import java.util.List;

public class FabActivity extends AppCompatActivity {
    private List<Number> mNumbers;
    private ListView mListView;
    private LayoutInflater mLayoutInflater;
    private FloatingActionButton mFloatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_001_fab);


        mListView = findViewById(R.id.list_view);
        mNumbers = getNumbers();
        mLayoutInflater = getLayoutInflater();
        NumberAdapter adapter = new NumberAdapter(mNumbers, mLayoutInflater);
        mListView.setAdapter(adapter);


        mFloatingActionButton = findViewById(R.id.fab);
        mFloatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FabActivity.this, "Pressed", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private List<Number> getNumbers() {
        List<Number> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add(new Number(i + 1));
        }
        return numbers;
    }
}
