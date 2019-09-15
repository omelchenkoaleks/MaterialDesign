package com.omelchenkoaleks.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omelchenkoaleks.materialdesign._001_fab.FabActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.fab_button:
                Intent fabIntent = new Intent(this, FabActivity.class);
                startActivity(fabIntent);
                break;
        }
    }
}
