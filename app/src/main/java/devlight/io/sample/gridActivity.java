package devlight.io.sample;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import devlight.io.library.ntb.NavigationTabBar;

import java.util.ArrayList;
import java.util.Random;

/**
 * Activity for grid
 */
public class gridActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
        initUI();
    }

    private void initUI() {

        Toast.makeText(getApplicationContext(), "we init grid UI !", Toast.LENGTH_LONG).show();

        /*
        LayoutInflater inflater = LayoutInflater.from(this);
        View parentView = findViewById(android.R.id.content);
        View zoologistFragment = inflater.inflate(R.layout.zoologist_chances_list, (ViewGroup) parentView);

        zoologistFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
*/

        /*
        chance1Layout = (LinearLayout)findViewById(R.id.chance1_layout);
        chance2Layout = (LinearLayout)findViewById(R.id.chance2_layout);
        chance3Layout = (LinearLayout)findViewById(R.id.chance3_layout);
        chance4Layout = (LinearLayout)findViewById(R.id.chance4_layout);
        chance5Layout = (LinearLayout)findViewById(R.id.chance5_layout);

        chance1Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "u clicked on chance !", Toast.LENGTH_LONG).show();
            }
        });
        */


    };


}


