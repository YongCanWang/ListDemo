package www.mapscloud.cn.listdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import www.mapscloud.cn.listdemo.R;

/**
 * Created by wangyongcan on 2018/7/2.
 *      控制层
 */

public class ListViewAdapter extends BaseAdapter {

    private final List<String> list;
    private final Context mContext;
    private View inflate;
    private ViewHodler viewHodler;

    public ListViewAdapter(Context mContext,List<String> list){
        this.mContext = mContext;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        String item = (String)getItem(position);
        View view = null;
        if (convertView == null) {

            view = LayoutInflater.from(mContext).inflate(R.layout.item_listviewactivity, null);

            viewHodler = new ViewHodler();
            viewHodler.tv_content = (TextView) view.findViewById(R.id.tv_showContent);
            viewHodler.iv_imager = (ImageView) view.findViewById(R.id.iv_showImage);

            view.setTag(viewHodler);

        } else {
            view = convertView;
        }


        viewHodler.tv_content.setText(item);
        viewHodler.iv_imager.setImageResource(R.drawable.ic_launcher_background);



        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, ""+position, Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }


    class ViewHodler {

    public TextView tv_content;
    public ImageView iv_imager;

    }
}
