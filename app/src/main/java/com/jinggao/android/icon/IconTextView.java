package com.jinggao.android.icon;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/**
 * @author jing.gao
 * @version 1.0
 * @date 2020/9/10 21:54
 */
public class IconTextView extends AppCompatTextView {
    public IconTextView(Context context) {
        super(context);
        init(context);
    }

    public IconTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public IconTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        //设置字体文件
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"iconfont.ttf"));
    }
}
