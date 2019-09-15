package com.omelchenkoaleks.materialdesign._002_melnykov_fab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;
import com.omelchenkoaleks.materialdesign.R;

import java.util.ArrayList;
import java.util.List;

public class MelnykovFabActivity extends AppCompatActivity {
    private List<Number> mNumbers;
    private LayoutInflater mLayoutInflater;
    private NumberFabAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_002_melnykov_fab);

        ListView listView = findViewById(R.id.melnykov_fab_list_view);
        mNumbers = getNumbers();
        mLayoutInflater = getLayoutInflater();
        mAdapter = new NumberFabAdapter(mNumbers, mLayoutInflater);
        listView.setAdapter(mAdapter);

        FloatingActionButton fab = findViewById(R.id.melnykov_fab);
        fab.attachToListView(listView);
    }

    private List<Number> getNumbers() {
        List<Number> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            numbers.add(new Number(i + 1));
        }

        return numbers;
    }
}
