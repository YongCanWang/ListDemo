package www.mapscloud.cn.listdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import www.mapscloud.cn.listdemo.R;
import www.mapscloud.cn.listdemo.adapter.RecyclerViewGridAdapter;


/**
 * Created by wangyongcan on 2018/7/4.
 */

public class RecyclerViewGridViewActivity extends Activity {

    private RecyclerView rv_recyclerviewgrid;
    // 数据源
    private List<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerviewgridview);
        initView();
        addData();
        setView();

    }



    private void setView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        rv_recyclerviewgrid.setLayoutManager(gridLayoutManager);
        RecyclerViewGridAdapter recyclerViewGridAdapter = new RecyclerViewGridAdapter(this, names);
        rv_recyclerviewgrid.setAdapter(recyclerViewGridAdapter);
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
        rv_recyclerviewgrid = (RecyclerView) findViewById(R.id.rv_recyclerviewgrid);
    }
}
