package www.mapscloud.cn.listdemo.activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import www.mapscloud.cn.listdemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_listview;
    private Button bt_recyclerview;
    private Button bt_gridview;
    private Button bt_viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setViewOnClicListener();

    }


    private void setViewOnClicListener() {
        bt_listview.setOnClickListener(this);
        bt_recyclerview.setOnClickListener(this);
        bt_gridview.setOnClickListener(this);
        bt_viewpager.setOnClickListener(this);
    }


    private void initView() {
        bt_listview = (Button) findViewById(R.id.bt_listview);
        bt_recyclerview = (Button) findViewById(R.id.bt_recyclerview);
        bt_gridview = (Button) findViewById(R.id.bt_gridview);
        bt_viewpager = (Button) findViewById(R.id.bt_viewpager);
    }





    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.bt_listview:
                startActivity(new Intent(this, ListViewActivity.class));
                break;

            case R.id.bt_recyclerview:
                startActivity(new Intent(this, RecyclerViewActivity.class));
                break;

            case R.id.bt_gridview:
                startActivity(new Intent(this, GridViewActivity.class));
                break;


            case R.id.bt_viewpager:
                startActivity(new Intent(this, ViewPagerActivity.class));
                break;


        }

    }
}
