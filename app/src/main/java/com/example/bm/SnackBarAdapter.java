package com.example.bm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SnackBarAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private ArrayList<SnackBarItem> data;
    private int layout;

    public SnackBarAdapter(Context context, int layout, ArrayList<SnackBarItem> data){
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position).getSnackBarInfo();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(layout, parent, false);
        }
        SnackBarItem snackBarItem = data.get(position);

        //이미지파일 연동
        ImageView profile = (ImageView)convertView.findViewById(R.id.profile);
        profile.setImageResource(snackBarItem.getSnackBarProfile());

        //이름 등 정보 연동
        TextView info = (TextView)convertView.findViewById(R.id.info);
        info.setText(snackBarItem.getSnackBarInfo());

        //전화번호 연동
        TextView phone = (TextView)convertView.findViewById(R.id.phone);
        phone.setText(snackBarItem.getSnackBarPhone());

        return convertView;

    }
}
