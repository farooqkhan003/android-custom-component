package com.androidtechpoint.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.androidtechpoint.customview.CustomComponents.Card;

import java.util.zip.Inflater;

public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        Card card = (Card) new Card(this);

        card.setTitle("title");
        card.setDescription("desc");
        card.setImgSrc(R.drawable.image);
        card.setNavigationText("Read More >");

        LinearLayout layout = (LinearLayout) findViewById(R.id.parent);
        layout.addView(card);
    }
}
