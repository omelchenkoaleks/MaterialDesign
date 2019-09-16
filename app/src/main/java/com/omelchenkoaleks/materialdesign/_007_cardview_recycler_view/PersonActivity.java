package com.omelchenkoaleks.materialdesign._007_cardview_recycler_view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.omelchenkoaleks.materialdesign.R;

import java.util.ArrayList;
import java.util.List;

public class PersonActivity extends AppCompatActivity implements View.OnClickListener {

    private PersonAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private FloatingActionButton mFab;
    private List<Person> mPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_007_person);

        mRecyclerView = findViewById(R.id.recycler_view);
        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mPeople = initData();
        mAdapter = new PersonAdapter(mPeople, getLayoutInflater());
        mRecyclerView.setAdapter(mAdapter);

        mFab = findViewById(R.id.fab_person);
        mFab.setOnClickListener(this);
    }

    @Override
    public void onClick(final View v) {
        final View view = getLayoutInflater().inflate(R.layout.dialog_text_007, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setView(view)
                .setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        String name = ((EditText) view.findViewById(R.id.name_edit_text)).getText().toString();
                        String age = ((EditText) view.findViewById(R.id.age_edit_text)).getText().toString();
                        String position = ((EditText) view.findViewById(R.id.position_edit_text)).getText().toString();

                        Person person = new Person(name, Integer.parseInt(age), position);
                        mAdapter.addData(person);

                    }
                }).setNegativeButton("No", null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private List<Person> initData() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Aleksandr", 43, "Junior"));
        people.add(new Person("Max", 23, "senor"));

        return people;
    }
}
