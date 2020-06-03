package www.mapscloud.cn.listdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import www.mapscloud.cn.listdemo.R;
import www.mapscloud.cn.listdemo.adapter.ListViewAdapter;

/**
 * Created by wangyongcan on 2018/7/2.
 */

public class ListViewActivity extends Activity{

    private ListView lv_listview;
    private int[] ints = new int[11];
    // 数据源
    private String[] strs = new String[]{"赵","钱","孙","李","周","吴","郑","王"};
    private List<String> names = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        initView();
        addData();

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
        lv_listview = (ListView) findViewById(R.id.lv_listview);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, names);
        // 显示层
        lv_listview.setAdapter(listViewAdapter);
    }
}
