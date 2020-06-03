package www.mapscloud.cn.listdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import www.mapscloud.cn.listdemo.R;
import www.mapscloud.cn.listdemo.adapter.ViewPagerAdapter;

/**
 * Created by wangyongcan on 2018/7/4.
 */

public class ViewPagerActivity extends Activity {

    private ViewPager vp_viewpager;
    private List<String> names = new ArrayList<>();
    private String TAG = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        initView();
        addData();
        setView();

    }



    private void setView() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, names);
        vp_viewpager.setAdapter(viewPagerAdapter);
        vp_viewpager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ViewPagerActivity.this, "activity"+ v.getId(), Toast.LENGTH_LONG).show();
            }
        });
        vp_viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.e(TAG, "onPageScrolled:" + position  +"==="+ positionOffset);
           }

            @Override
            public void onPageSelected(int position) {
                Log.e(TAG, "onPageSelected:" + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                Log.e(TAG, "onPageScrollStateChanged:" + state);
            }
        });
    }


    private void addData() {
        names.add("赵");
        names.add("钱");
        names.add("孙");
        names.add("李");
        names.add("周");
        names.add("吴");
        names.add("郑");
        names.add("王");
    }

    private void initView() {
        vp_viewpager = (ViewPager) findViewById(R.id.vp_viewpager);
    }
}
