package wy.com.myapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class MySimpleLayout extends ViewGroup {
    public MySimpleLayout(Context context, AttributeSet attr) {
        this(context, attr, 0);
    }

    public MySimpleLayout(Context context, AttributeSet attr, int defStyle) {
        super(context, attr, defStyle);
    }

    int marginTop = 20;
    int marginHorizontal = 20;

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        final int len = getChildCount();
        final int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = 0, row = 1, maxWidth = width;
        int maxRowHeight = 0;

        for(int i = 0; i < len; ++i) {
            View child = getChildAt(i);
            final ViewGroup.LayoutParams lp = child.getLayoutParams();
            final int childWidthSpec = MeasureSpec.makeMeasureSpec(width - marginHorizontal, MeasureSpec.AT_MOST/*lp.height, MeasureSpec.EXACTLY*/);
            final int childHeightSpec = MeasureSpec.makeMeasureSpec(0, MeasureSpec.UNSPECIFIED/*lp.width, MeasureSpec.EXACTLY*/);
//            child.measure(childWidthSpec, childHeightSpec);
            measureChild(child,childWidthSpec, childHeightSpec);
            final int childWidth = child.getMeasuredWidth();
            final int childHeight = child.getMeasuredHeight();
            if(maxWidth < childWidth) {

                row++;
                height += maxRowHeight;
                maxRowHeight = 0;
                maxWidth = width;
            }
            maxRowHeight = Math.max(maxRowHeight, childHeight);
            maxWidth = maxWidth - childWidth - marginHorizontal;
        }
        height += maxRowHeight;
        height += (row - 1) * marginTop;

        setMeasuredDimension(width, height);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        final int len = getChildCount();
        final int width = r - l;
        int top = 0, maxWidth = width, left = 0;
        int maxRowHeight = 0;

        for(int i = 0; i < len; ++i) {
            View child = getChildAt(i);
            final int childWidth = child.getMeasuredWidth();
            final int childHeight = child.getMeasuredHeight();
            if(maxWidth < childWidth) {
                top += maxRowHeight + marginTop;
                maxRowHeight = 0;
                maxWidth = width;
                left = 0;
            }
            maxRowHeight = Math.max(maxRowHeight, childHeight);
            child.layout(left, top, left + childWidth, top + childHeight);

            left += childWidth + marginHorizontal;
            maxWidth = maxWidth - childWidth - marginHorizontal;
        }
    }

    public void setAxisPadding(int x, int y) {
        if(y >= 0) {
            marginTop = y;
        }
        if(x >= 0) {
            marginHorizontal = x;
        }
        //invalidate();
    }
}
