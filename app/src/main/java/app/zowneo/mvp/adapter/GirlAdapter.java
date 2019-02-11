package app.zowneo.mvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import app.zowneo.mvp.R;
import app.zowneo.mvp.bean.Girl;

public class GirlAdapter extends BaseAdapter {
    private List<Girl> girls;
    private LayoutInflater inflater;

    public GirlAdapter(Context context, List<Girl> girs) {
        inflater = LayoutInflater.from(context);
        this.girls = girs;
    }


    @Override
    public int getCount() {
        return girls.size();
    }

    @Override
    public Object getItem(int position) {
        return girls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.item, null);
        Girl g = girls.get(position);
        ImageView iv_icon = view.findViewById(R.id.iv_icon);
        iv_icon.setImageResource(g.icon);

        TextView tv_like = view.findViewById(R.id.tv_like);
        tv_like.setText("喜欢程度："+g.like);

        TextView tv_style = view.findViewById(R.id.tv_style);
        tv_style.setText(g.style);
        return view;
    }
}
