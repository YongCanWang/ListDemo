package www.mapscloud.cn.listdemo.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
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
 * Created by wangyongcan on 2018/7/3.
 */

public class GridAdapter extends BaseAdapter{

    private final Context mContext;
    private final List<String> apps;
    private ViewHodler viewHodler;

    public GridAdapter(Context context, List apps) {

        this.mContext = context;
        this.apps = apps;

    }

    @Override
    public int getCount() {
        return apps.size();
    }

    @Override
    public Object getItem(int position) {
        return apps.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.item_gridview, null);
            viewHodler = new ViewHodler();
            viewHodler.tv_content = view.findViewById(R.id.tv_showContent);
            viewHodler.iv_imager = view.findViewById(R.id.iv_showImage);
            viewHodler.iv_imager.setTag(position);
            view.setTag(viewHodler);
        } else {
            view = convertView;
        }

        viewHodler.tv_content.setText(apps.get(position));
        if ((Integer)viewHodler.iv_imager.getTag() == position)
        viewHodler.iv_imager.setImageResource(R.drawable.ic_launcher_background);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, ""+ position, Toast.LENGTH_LONG).show();
            }
        });


        return view;
    }




    class ViewHodler {
        public TextView tv_content;
        public ImageView iv_imager;
    }
}
