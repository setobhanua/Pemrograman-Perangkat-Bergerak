package com.example.myrecyclerview;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListHmj extends AppCompatActivity {
    private int presiden_id;
    ImageView imgDetail;
    TextView tvName,tvDesc;
    private ArrayList<Hmj> listHmj = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_hmj);

        presiden_id = getIntent().getIntExtra("presiden_id", 0);
        tvName = findViewById(R.id.presiden_indonesia);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listHmj.addAll(HmjData.getListData());

        setLayout();
    }

    private void setLayout() {
        tvName.setText(listHmj.get(presiden_id).getName());
        tvDesc.setText(listHmj.get(presiden_id).getDescription());
        Glide.with(this)
                .load(listHmj.get(presiden_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }
}
