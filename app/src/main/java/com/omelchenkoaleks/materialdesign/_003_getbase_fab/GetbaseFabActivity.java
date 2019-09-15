package com.omelchenkoaleks.materialdesign._003_getbase_fab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.omelchenkoaleks.materialdesign.R;

public class GetbaseFabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_003_getbase_fab);

        final FloatingActionButton fab = findViewById(R.id.fab_1_child);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GetbaseFabActivity.this, "Floating action button clicked", Toast.LENGTH_SHORT).show();
                fab.setTitle("First action clicked");
            }
        });
    }
}
