package com.androidtechpoint.customview.CustomComponents;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidtechpoint.customview.R;

import java.util.zip.Inflater;

/**
 * Created by hp on 8/9/2017.
 */

public class CustomComponent extends LinearLayout {
    public CustomComponent(Context context, AttributeSet attr){
        super(context,attr);

        TypedArray attributes = context.obtainStyledAttributes(attr, R.styleable.CustomComponent);
        String caption = attributes.getString(R.styleable.CustomComponent_caption);
        Drawable drawable = attributes.getDrawable(R.styleable.CustomComponent_img_src);

        attributes.recycle();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.image_with_caption, this, true);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageDrawable(drawable);

        TextView textView = (TextView) findViewById(R.id.caption);
        textView.setText(caption);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.e("Custom Component", "onAttachToWindow()");
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e("Custom Component", "onMeasure()");

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        Log.e("Custom Component", "OnLayout()");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e("Custom Component", "onDraw()");

    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.e("Custom Component", "onDetachFromWindow()");
    }
}
