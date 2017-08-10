package com.androidtechpoint.customview.CustomComponents;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.androidtechpoint.customview.R;
import com.androidtechpoint.customview.SquareImage;

/**
 * Created by farooq on 8/9/2017.
 */

public class Card extends LinearLayout {
    String title;
    String description;
    String navigationText;
    int imgSrc;

    TextView _title, _description, _navigate;
    SquareImage _imageView;

    public Card(Context context) {
        super(context, null);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.single_card, this, true);

        _imageView = (SquareImage) findViewById(R.id.card_image);
        _title = (TextView) findViewById(R.id.title);
        _description = (TextView) findViewById(R.id.description);
        _navigate = (TextView) findViewById(R.id.navigate);

    }

    public Card(Context context, AttributeSet attr) {
        super(context, attr);

        TypedArray attributes = context.obtainStyledAttributes(attr, R.styleable.card);
        title = attributes.getString(R.styleable.card_title);
        description = attributes.getString(R.styleable.card_description);
        navigationText = attributes.getString(R.styleable.card_navigation_text);
        Drawable drawable = attributes.getDrawable(R.styleable.card_src);

        attributes.recycle();

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.single_card, this, true);

        _imageView = (SquareImage) findViewById(R.id.card_image);
        _imageView.setImageDrawable(drawable);

        _title = (TextView) findViewById(R.id.title);
        _title.setText(title);

        _description = (TextView) findViewById(R.id.description);
        _description.setText(description);

        _navigate = (TextView) findViewById(R.id.navigate);
        _navigate.setText(navigationText);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        _title.setText(title);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        _description.setText(description);
    }

    public String getNavigationText() {
        return navigationText;
    }

    public void setNavigationText(String navigationText) {
        this.navigationText = navigationText;
        _navigate.setText(navigationText);
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
        _imageView.setImageResource(imgSrc);
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
