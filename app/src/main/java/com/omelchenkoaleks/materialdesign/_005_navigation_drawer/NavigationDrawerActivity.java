package com.omelchenkoaleks.materialdesign._005_navigation_drawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IProfile;
import com.omelchenkoaleks.materialdesign.R;

public class NavigationDrawerActivity extends AppCompatActivity {

    /*
        ИСПОЛЬЗОВАЛИ БИБЛИОТЕКУ ХОРОШУЮ:
        // https://github.com/mikepenz/MaterialDrawer/tree/v6.1.2
        implementation "com.mikepenz:materialdrawer:6.1.2"
     */

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_005_navigation_drawer);

        mToolbar = findViewById(R.id.toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }

        PrimaryDrawerItem item_1 = new PrimaryDrawerItem()
                .withIdentifier(1)
                .withName("Home");

        SecondaryDrawerItem item_2 = new SecondaryDrawerItem()
                .withIdentifier(2)
                .withName("Settings");

        AccountHeader header = new AccountHeaderBuilder()
                .withActivity(this)
                .addProfiles(
                        new ProfileDrawerItem().withName("Andrew")
                        .withEmail("alounarod@gmail.com")
                        .withIcon(getResources()
                        .getDrawable(R.drawable.oa)))
                .withOnAccountHeaderListener(new AccountHeader.OnAccountHeaderListener() {
                    @Override
                    public boolean onProfileChanged(View view, IProfile profile, boolean current) {
                        return false;
                    }
                }).build();

        DrawerBuilder builder = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(mToolbar)
                .withAccountHeader(header)
                .addDrawerItems(item_1,
                        new DividerDrawerItem(),
                        item_2,
                        new SecondaryDrawerItem().withName("Settings"))
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        Toast.makeText(NavigationDrawerActivity.this,
                                "Drawer: " + position, Toast.LENGTH_SHORT).show();
                        return false;
                    }
                });
        Drawer drawer = builder.build();
    }
}
