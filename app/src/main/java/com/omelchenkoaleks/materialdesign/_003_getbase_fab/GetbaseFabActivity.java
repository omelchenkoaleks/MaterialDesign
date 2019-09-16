package com.omelchenkoaleks.materialdesign._003_getbase_fab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.omelchenkoaleks.materialdesign.R;

public class GetbaseFabActivity extends AppCompatActivity {
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_003_getbase_fab);

        mToolbar = findViewById(R.id.toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }

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
