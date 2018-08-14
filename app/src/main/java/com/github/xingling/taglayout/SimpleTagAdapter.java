package com.github.xingling.taglayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.github.xingling.taglayoutlib.BaseTagLayout;
import com.github.xingling.taglayoutlib.TagAdapter;

import java.util.List;

public class SimpleTagAdapter extends TagAdapter<String> {
    LayoutInflater inflater;
    Context mContext;

    public SimpleTagAdapter(Context mContext, List<String> datas) {
        super(datas);
        this.mContext = mContext;
        inflater = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(BaseTagLayout parent, int position, String s) {
        TextView tv = (TextView) inflater.inflate(R.layout.item_tag, null);
        tv.setText(s);
        return tv;
    }
}
