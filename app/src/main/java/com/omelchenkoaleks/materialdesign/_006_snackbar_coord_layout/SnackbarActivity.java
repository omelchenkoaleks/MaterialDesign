package com.omelchenkoaleks.materialdesign._006_snackbar_coord_layout;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.omelchenkoaleks.materialdesign.R;

public class SnackbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_006_snackbar);

        /*
            для того, чтобы кнопка fab не накладывалась на Snackbar
            нужно поместить его в CoordinatorLayout ...
         */

        final CoordinatorLayout coordinator = findViewById(R.id.coordinator_layout);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(coordinator, "omelchenkoaleks", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
