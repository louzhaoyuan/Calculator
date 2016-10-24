package com.example.calculator;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by 招远 on 2016/8/16.
 */
public class FocusTextView extends TextView {
    public FocusTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public FocusTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FocusTextView(Context context) {
        super(context);
    }

    //永远能够拿到焦点
    @Override
    public boolean isFocused() {
        return true;
    }
}
