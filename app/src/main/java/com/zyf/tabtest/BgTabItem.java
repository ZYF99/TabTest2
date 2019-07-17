package com.zyf.tabtest;

import android.content.Context;
import android.support.design.widget.TabItem;
import android.util.AttributeSet;

public class BgTabItem extends TabItem {
    public BgTabItem(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.setBackgroundResource(R.drawable.ic_launcher_background);
    }


}
