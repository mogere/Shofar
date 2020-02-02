package com.mogere.shofar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MemberInfo extends AppCompatActivity {

    @BindView(R.id.name) TextView mName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_info);

        ButterKnife.bind(this);
        Intent intent = getIntent();
        String memberName = intent.getStringExtra("Member");
        mName.setText(memberName);
    }
}
