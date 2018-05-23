package com.task.android.wangyiyun;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;

import com.task.android.wangyiyun.adapter.MyFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private MyFragmentPagerAdapter myFragmentPagerAdapter;

    private TabLayout.Tab yinyue;
    private TabLayout.Tab wangyiyun;
    private TabLayout.Tab pengyou;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();//隐藏掉整个ActionBar
        setContentView(R.layout.activity_main);

        //初始化视图
        initViews();
    }

    private void initViews() {

        //使用适配器将ViewPager与Fragment绑定在一起
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        myFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(myFragmentPagerAdapter);

        //将TabLayout与ViewPager绑定在一起
        mTabLayout = findViewById(R.id.tabLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        //指定Tab的位置
        yinyue = mTabLayout.getTabAt(0);
        wangyiyun = mTabLayout.getTabAt(1);
        pengyou = mTabLayout.getTabAt(2);


        //设置Tab的图标
        yinyue.setIcon(R.drawable.yinyue_fragment_selector);
        wangyiyun.setIcon(R.drawable.wangyiyun_fragment_selector);
        pengyou.setIcon(R.drawable.pengyou_fragment_selector);

    }
}

