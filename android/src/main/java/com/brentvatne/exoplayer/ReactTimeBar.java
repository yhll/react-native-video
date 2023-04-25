package com.brentvatne.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.Nullable;

import com.google.android.exoplayer2.ui.DefaultTimeBar;

/**
 * @author alan.liu
 * @version 1.0
 * @description: 自定义时间组件
 * @date 2023/4/24 16:49
 */
public class ReactTimeBar extends DefaultTimeBar {
    private boolean enableSeek = true;
    public void resetEnableSeek (){
        this.enableSeek = true;
    }
    public ReactTimeBar(Context context) {
        super(context);
    }

    public ReactTimeBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ReactTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ReactTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet timebarAttrs) {
        super(context, attrs, defStyleAttr, timebarAttrs);
    }

    public ReactTimeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr, @Nullable AttributeSet timebarAttrs, int defStyleRes) {
        super(context, attrs, defStyleAttr, timebarAttrs, defStyleRes);
    }

    @Override
    public void setPosition(long position) {
        super.setPosition(position);
    }

    @Override
    public void setEnabled(boolean enabled) {
        if(this.enableSeek == false){
            super.setEnabled(false);
        }else{
            this.enableSeek = enabled;
            super.setEnabled(enabled);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(this.enableSeek == false){
            return false;
        }
        return super.onTouchEvent(event);
    }
}
