package www.mapscloud.cn.listdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import www.mapscloud.cn.listdemo.R;
import www.mapscloud.cn.listdemo.adapter.RecyclerViewHorizontalAdapter;
import www.mapscloud.cn.listdemo.adapter.RecyclerViewVerticalAdapter;

/**
 * Created by wangyongcan on 2018/7/3.
 */

public class RecyclerviewHorizontalActivity extends Activity {


    private RecyclerView rv_recyclerviewhorizontal;
    // 数据源
    private List<String> names = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerviewhorizontal);
        initView();
        addData();
        setView();
    }



    private void setView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rv_recyclerviewhorizontal.setLayoutManager(linearLayoutManager);
        RecyclerViewHorizontalAdapter recyclerViewHorizontalAdapter = new RecyclerViewHorizontalAdapter(this, names);
        // 显示层
        rv_recyclerviewhorizontal.setAdapter(recyclerViewHorizontalAdapter);

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
        rv_recyclerviewhorizontal = (RecyclerView) findViewById(R.id.rv_recyclerviewhorizontal);
    }
}
