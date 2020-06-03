package www.mapscloud.cn.listdemo.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import www.mapscloud.cn.listdemo.R;

/**
 * Created by wangyongcan on 2018/7/4.
 */

public class ViewPagerAdapter extends PagerAdapter{


    private final Context mContext;
    private final List<String> names;
    private TextView tv_showContent;
    private ImageView iv_showImage;

    public ViewPagerAdapter(Context mContext, List names) {

        this.mContext = mContext;
        this.names = names;
    }


    /**
     * 返回有效视图的数量。
     * @return
     */
    @Override
    public int getCount() {
        return names.size();
    }

    /**
     *  决定一个页面view是否与instantiateItem(ViewGroup, int)方法返回的具体key对象相关联。
     *  viewpager不直接处理每一个视图而是将各个视图与一个键联系起来。这个键用来跟踪且唯一代表一个页面，不仅如此，该键还独立于这个页面所在adapter的位置。当pageradapter将要改变的时候他会调用startUpdate函数，接下来会调用一次或多次的instantiateItem或者destroyItem。最后在更新的后期会调用finishUpdate。当finishUpdate返回时instantiateItem返回的对象应该添加到父ViewGroup，destroyItem返回的对象应该被ViewGroup删除。isViewFromObject(View, Object)代表了当前的页面是否与给定的键相关联。
     *  自定义Key示例-简单的将位置position最为key
     * @param view
     * @param object
     * @return
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }


    /**
     *   创建指定位置的页面视图。适配器有责任增加即将创建的View视图到给定的container中，确保在finishUpdate(viewGroup)返回时，增加视图的事情已经完成。
     *   该方法的返回值是新增视图页面的Object（Key），这里没必要非要返回视图本身，也可以是这个页面的其它容器，它可以返回和视图相关联的任何值。
     * @param container
     * @param position
     * @return
     */
    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
//        return super.instantiateItem(container, position);
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_viewpageradapter,null);

        tv_showContent = (TextView) view.findViewById(R.id.tv_showContent);
        iv_showImage = (ImageView) view.findViewById(R.id.iv_showImage);
        tv_showContent.setText(names.get(position));
        iv_showImage.setImageResource(R.drawable.ic_launcher_background);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "instantiateItem:"+ position, Toast.LENGTH_LONG).show();
            }
        });

        container.addView(view);


        return view;
    }

    /**
     * 移除给定位置的view，适配器有责任将该view从container中移除，确保在finishUpdate(viewGroup)返回时，移除视图的事情已经完成。
     * @param container
     * @param position
     * @param object
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        super.destroyItem(container, position, object);
        container.removeView((View)object);
    }



    /**
     *
     *  当宿主视图尝试判断一项的位置是否改变时调用。如果给定项的位置没有改变则返回POSITION_UNCHANGED，如果该项不再存在于适配器中则返回POSITION_NONE。
     *  在ViewPager.dataSetChanged()中将对该函数的返回值进行判断，如果返回POSITION_NONE则调用destroyItem(ViewGroup container, int position, Object object)方法将该视图销毁，如果返回POSITION_UNCHANGED则不做任何改变，如果数据改变，则触发PagerAdapter.instantiateItem(ViewGroup container, int position)方法改变视图。
     *  PagerAdapter中该方法的默认返回值是 POSITION_UNCHANGED。如果没有重载该函数，而导致调用PagerAdapter.notifyDataSetChanged() 后，什么都没有发生。
     *
     * @param object
     * @return
     */
    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }



}
