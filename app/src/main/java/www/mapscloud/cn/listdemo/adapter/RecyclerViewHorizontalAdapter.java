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
 * Created by wangyongcan on 2018/7/3.
 *
 *  控制层
 */

public class RecyclerViewHorizontalAdapter extends RecyclerView.Adapter<RecyclerViewHorizontalAdapter.RecyclerViewHorizontalViewHolder> {

    private final Context mContext;
    private final List<String> names;

    public RecyclerViewHorizontalAdapter(Context context, List names){
        this.mContext = context;
        this.names = names;
    }

    @Override
    public RecyclerViewHorizontalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHorizontalViewHolder recyclerViewHorizontalViewHolder = new RecyclerViewHorizontalViewHolder(LayoutInflater.from(mContext)
                .inflate(R.layout.item_recyclerviewhorizontaladapter, null));
        return recyclerViewHorizontalViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHorizontalViewHolder holder, final int position) {

        holder.tv_showContent.setText(names.get(position));
        holder.iv_showImage.setImageResource(R.drawable.ic_launcher_background);

        View itemView = holder.itemView;
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return names.size();
    }


    class RecyclerViewHorizontalViewHolder extends RecyclerView.ViewHolder {

        private final TextView tv_showContent;
        private final ImageView iv_showImage;

        public RecyclerViewHorizontalViewHolder(View itemView) {
            super(itemView);
            tv_showContent = (TextView) itemView.findViewById(R.id.tv_showContent);
            iv_showImage = (ImageView) itemView.findViewById(R.id.iv_showImage);
        }

    }
}
