package com.mogere.shofar;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MembersAdapterArray extends ArrayAdapter {

    private Context mContext;
    private String[] mMembers;
    private String[] mInfo;

    public MembersAdapterArray(Context mContext, int resource, String[] mMembers, String[] mInfo){
        super(mContext, resource);
        this.mContext = mContext;
        this.mMembers = mMembers;
        this.mInfo=mInfo;
    }

    @Override
    public Object getItem(int position) {
        String restaurant = mMembers[position];
        return restaurant;
    }

    @Override
    public int getCount() {
        return mMembers.length;
    }
}
