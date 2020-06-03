package www.mapscloud.cn.listdemo.activity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import www.mapscloud.cn.listdemo.R;
import www.mapscloud.cn.listdemo.adapter.RecyclerViewVerticalAdapter;

/**
 * Created by wangyongcan on 2018/7/3.
 */
@SuppressLint("WrongViewCast")
public class RecyclerViewActivity extends Activity implements View.OnClickListener{


    private Button bt_recyclerview_vertical;
    private Button bt_recyclerview_horizontal;
    private Button bt_recyclerview_grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        initView();
        setViewOnClikListener();


    }



    private void setViewOnClikListener() {
        bt_recyclerview_vertical.setOnClickListener(this);
        bt_recyclerview_horizontal.setOnClickListener(this);
        bt_recyclerview_grid.setOnClickListener(this);
    }



    private void initView() {
        bt_recyclerview_vertical = (Button) findViewById(R.id.bt_recyclerview_vertical);
        bt_recyclerview_horizontal = (Button) findViewById(R.id.bt_recyclerview_horizontal);
        bt_recyclerview_grid = (Button) findViewById(R.id.bt_recyclerview_grid);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_recyclerview_vertical:
                startActivity(new Intent(this, RecyclerviewVerticalActivity.class));
                break;


            case R.id.bt_recyclerview_horizontal:
                startActivity(new Intent(this, RecyclerviewHorizontalActivity.class));
                break;

            case R.id.bt_recyclerview_grid:
                startActivity(new Intent(this, RecyclerViewGridViewActivity.class));
                break;

        }
    }
}
