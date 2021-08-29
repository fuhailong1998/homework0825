package com.fxkxb.homework20210825;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;
import android.widget.TextView;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.MapView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private ViewPager vpContent;
    private Fragment[] fragments = new Fragment[3];
    private ItemViewModel viewModel;
    private MapView mMapView = null;
    private TabHost tabhost;

    public void logText(String s) {
        TextView t = findViewById(R.id.logarea);
        t.setMovementMethod(ScrollingMovementMethod.getInstance());
        Date day = new Date();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        t.append(df.format(day) + " " + s + "\n");

        int line = t.getLineCount();
        if (line > 14) {
            int offset = (t.getLineCount() - 2) * t.getLineHeight();
            t.scrollTo(0, offset - t.getHeight() + t.getLineHeight());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SDKInitializer.initialize(getApplicationContext());

        mMapView = (MapView) findViewById(R.id.bmapView);



        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.hide();
        }
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        setContentView(R.layout.activity_main);


        tabhost = (TabHost) findViewById(R.id.tabhost);
        //调用 TabHost.setup()
        tabhost.setup();
        //创建Tab标签
        tabhost.addTab(tabhost.newTabSpec("one").setIndicator("1").setContent(R.id.widget_layout_red));
        tabhost.addTab(tabhost.newTabSpec("two").setIndicator("2").setContent(R.id.widget_layout_yellow));
        tabhost.addTab(tabhost.newTabSpec("three").setIndicator("3").setContent(R.id.widget_layout_blue));



        vpContent = (ViewPager) findViewById(R.id.viewpager);
        fragments[0] = new Fragment1();
        fragments[1] = new Fragment2();
        fragments[2] = new Fragment3();

        viewModel = new ViewModelProvider(this).get(ItemViewModel.class);

        viewModel.getSelectedItem().observe(this, item -> {
            logText((String) item.getText());
        });


        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), fragments);
        vpContent.setAdapter(adapter);

        tabhost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                if(tabhost!=null&&tabhost!=null){
                    //写法1
                    vpContent.setCurrentItem(tabhost.getCurrentTab());
                }
            }
        });

        vpContent.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(tabhost!=null){
                    tabhost.setCurrentTab(position);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}