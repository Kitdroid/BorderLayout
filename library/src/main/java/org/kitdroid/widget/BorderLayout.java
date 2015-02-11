package org.kitdroid.widget;/**
 * Created by huiyh on 15/2/11.
 */

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION_CODES;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewStub;

/**
 * Created by huiyh on 15/2/11.
 */
public class BorderLayout extends ViewGroup {

    private ViewStub mLeftStub;
    private ViewStub mTopStub;
    private ViewStub mRightStub;
    private ViewStub mBottomStub;

    public BorderLayout(Context context) {
        super(context);
        initContent();
    }

    public BorderLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initContent();
    }

    public BorderLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initContent();
    }

    @TargetApi(VERSION_CODES.LOLLIPOP)
    public BorderLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initContent();
    }

    private void initContent(){
        mLeftStub = new ViewStub(getContext());
        mTopStub = new ViewStub(getContext());
        mRightStub = new ViewStub(getContext());
        mBottomStub = new ViewStub(getContext());
    }

    /**
     * onMeasure中依次调用Child的measure方法
     *
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        final int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        final int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        // 1.顶部的测量
        // 2.底部的测量
        // 3.中间的测量
            // 3.1.左侧测量
            // 3.2.右侧测量
            // 3.3.中间测量
            // 3.4 三者中的最大值

        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    /**
     * onMeasure中依次调用Child的layout方法
     *
     * @param changed
     * @param l
     * @param t
     * @param r
     * @param b
     */
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        // 1.顶部的位置
        // 2.中间的位置
            // 2.1.左侧位置
            // 2.2.中间位置
            // 2.3.右侧位置
        // 3.底部的位置
    }
}
