package com.example.recyclerviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView image_avatarAC = findViewById(R.id.img_avatarAc);
        TextView txt_topicAC = findViewById(R.id.txt_topicAc);
        TextView txt_detailAc = findViewById(R.id.txt_detailAc);

        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            return;
        }
        Paper paper = (Paper) bundle.get("object_paper");

        image_avatarAC.setImageResource(paper.getResourceId());
        txt_topicAC.setText(paper.getTopic());
        txt_detailAc.setText(paper.getDetail());
    }
}