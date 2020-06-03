package www.mapscloud.cn.listdemo.adapter;

import android.content.Context;
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

public class RecyclerViewGridAdapter extends RecyclerView.Adapter<RecyclerViewGridAdapter.RecyclerViewGridViewHolder> {


    private final Context mContext;
    private final List<String> names;

    public RecyclerViewGridAdapter(Context context, List list) {
        this.mContext = context;
        this.names = list;
    }

    @Override
    public RecyclerViewGridViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        RecyclerViewGridViewHolder recyclerViewGridViewHolder = new RecyclerViewGridViewHolder(LayoutInflater.from(mContext)
                .inflate(R.layout.item_recyclerviewgridadapter, null));

        return recyclerViewGridViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewGridViewHolder holder, final int position) {

        holder.tv_showContent.setText(names.get(position));
        holder.iv_showImage.setImageResource(R.drawable.ic_launcher_background);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, ""+position, Toast.LENGTH_LONG).show();
            }
        });

    }



    @Override
    public int getItemCount() {
        return names.size();
    }


    class RecyclerViewGridViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_showContent;
        private final ImageView iv_showImage;

        public RecyclerViewGridViewHolder(View itemView) {
            super(itemView);
            tv_showContent = (TextView) itemView.findViewById(R.id.tv_showContent);
            iv_showImage = (ImageView) itemView.findViewById(R.id.iv_showImage);
        }
    }

}
