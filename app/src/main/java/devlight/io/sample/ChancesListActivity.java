package devlight.io.sample;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import java.util.ArrayList;
import java.util.Random;

import devlight.io.library.ntb.NavigationTabBar;

public class ChancesListActivity extends AppCompatActivity {

    LinearLayout chance1Layout;
    LinearLayout chance2Layout;
    LinearLayout chance3Layout;
    LinearLayout chance4Layout;
    LinearLayout chance5Layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chances_list);
        initUI();
    }

    private void initUI() {
        LayoutInflater inflater = LayoutInflater.from(this);
        View parentView = findViewById(android.R.id.content);
        View zoologistFragment = inflater.inflate(R.layout.zoologist_chances_list, (ViewGroup) parentView);

        zoologistFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

//        final ViewPager viewPager = (ViewPager) findViewById(R.id.chanses_rv_container);
//        viewPager.setAdapter(new PagerAdapter() {
//            @Override
//            public int getCount() {
//                return 5;
//            }
//
//            @Override
//            public boolean isViewFromObject(final View view, final Object object) {
//                return view.equals(object);
//            }
//
//            @Override
//            public void destroyItem(final View container, final int position, final Object object) {
//                ((ViewPager) container).removeView((View) object);
//            }
//
//            @Override
//            public Object instantiateItem(final ViewGroup container, final int position) {
//                final View view = LayoutInflater.from(
//                        getBaseContext()).inflate(R.layout.item_vp_list, null, false);
//
//                final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv);
//                recyclerView.setHasFixedSize(true);
//                recyclerView.setLayoutManager(new LinearLayoutManager(
//                                getBaseContext(), LinearLayoutManager.VERTICAL, false
//                        )
//                );
//                recyclerView.setAdapter(new ChancesListActivity.RecycleAdapter());
//
//                container.addView(view);
//                return view;
//            }
//        });
//
//        final String[] colors = getResources().getStringArray(R.array.default_preview);

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

        chance4Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent rhinoIntent = getPackageManager().getLaunchIntentForPackage("com.unity.arfoundation.samplesrino");
                startActivity(rhinoIntent);
            }
        });

        chance3Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(
                        new Intent(ChancesListActivity.this, ChanceDetailActivity.class)
                );

            }
        });



    }
    public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
            final View view = LayoutInflater.from(getBaseContext()).inflate(R.layout.chance_item, parent, false);
            return new ChancesListActivity.RecycleAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            //holder.txt.setText(String.format("Navigation Item #%d", position));
        }

        @Override
        public int getItemCount() {
            return 5;
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView txt;

            public ViewHolder(final View itemView) {
                super(itemView);
                //txt = (TextView) itemView.findViewById(R.id.txt_vp_item_list);
            }
        }
    }
}
