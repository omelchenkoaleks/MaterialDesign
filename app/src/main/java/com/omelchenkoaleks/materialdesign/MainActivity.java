package com.omelchenkoaleks.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.omelchenkoaleks.materialdesign._001_fab.FabActivity;
import com.omelchenkoaleks.materialdesign._002_melnykov_fab.MelnykovFabActivity;
import com.omelchenkoaleks.materialdesign._003_getbase_fab.GetbaseFabActivity;
import com.omelchenkoaleks.materialdesign._004_toolbar.ToolbarActivity;
import com.omelchenkoaleks.materialdesign._005_navigation_drawer.NavigationDrawerActivity;

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

            case R.id.melnykov_fab_button:
                Intent melnykovFabIntent = new Intent(this, MelnykovFabActivity.class);
                startActivity(melnykovFabIntent);
                break;

            case R.id.getbase_fab_button:
                Intent getbaseFabIntent = new Intent(this, GetbaseFabActivity.class);
                startActivity(getbaseFabIntent);
                break;

            case R.id.toolbar_button:
                Intent toolbarIntent = new Intent(this, ToolbarActivity.class);
                startActivity(toolbarIntent);
                break;

            case R.id.navigation_drawer_button:
                Intent navigationDrawerIntent = new Intent(this, NavigationDrawerActivity.class);
                startActivity(navigationDrawerIntent);
                break;
        }
    }
}
