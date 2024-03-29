package com.smartdo.suxin.allinv2;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by suxin on 10/14/16.
 */

public class SpaceItemDecorationForGrid extends RecyclerView.ItemDecoration {
    private int space;

    public SpaceItemDecorationForGrid(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;

        // Add top margin only for the first item to avoid double space between items
        if (parent.getChildAdapterPosition(view) == 0 || parent.getChildAdapterPosition(view) == 1) {
            outRect.top = space;
        }
    }
}
