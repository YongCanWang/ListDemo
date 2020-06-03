package www.mapscloud.cn.listdemo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import www.mapscloud.cn.listdemo.R;
import www.mapscloud.cn.listdemo.adapter.GridAdapter;

/**
 * Created by wangyongcan on 2018/7/3.
 */

public class GridViewActivity extends Activity{

    private GridView gv_gridview;
    private List<String> apps = new ArrayList<>();


    /**
     *
     *
     * stretchMode 可选值：
     * columnWidth 如果列有空闲空间就加宽列
     * spacingWidth 如果列有空闲空间就加宽各列间距
     * none 没有任何动作
     * spacingWidthUniform 平均分配空间
     * 上图使用spacingWidthUniform
     * @param savedInstanceState
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        initView();
        addData();
        setView();


    }



    private void setView() {
        GridAdapter gridAdapter = new GridAdapter(this, apps);
        // 显示层
        gv_gridview.setAdapter(gridAdapter);
    }


    private void addData() {
        apps.add("通讯录");
        apps.add("日历");
        apps.add("照相机");
        apps.add("电话");
        apps.add("时钟");
        apps.add("游戏");
        apps.add("短信");
        apps.add("铃声");
        apps.add("设置");
        apps.add("语音");
        apps.add("天气");
        apps.add("浏览器");
        apps.add("视频");
        apps.add("音乐");

    }


    private void initView() {
        gv_gridview = (GridView) findViewById(R.id.gv_gridview);
    }
}
