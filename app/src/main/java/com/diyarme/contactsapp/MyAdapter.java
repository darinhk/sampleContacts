package com.diyarme.contactsapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by D.Kablaoui on 3/19/2017.
 */

public class MyAdapter extends BaseAdapter {
    private Context context;

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewholder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.contactsrecyclerview_activity, parent, false);
            viewholder = new ViewHolder(convertView);
            convertView.setTag(viewholder);
        } else {
            viewholder = (ViewHolder) convertView.getTag();
        }

        return convertView;
    }

    public MyAdapter(Context context) {
        this.context = context;
    }

    public class ViewHolder {

        public TextView mTextViewName;
        public ImageView mImageViewPhoto;


        public ViewHolder(View view) {

            mTextViewName = (TextView) view.findViewById(R.id.tv_name);
            mImageViewPhoto = (ImageView) view.findViewById(R.id.iv_photo);

        }

    }

}


