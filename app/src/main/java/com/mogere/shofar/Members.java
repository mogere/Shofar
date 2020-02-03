package com.mogere.shofar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Members extends AppCompatActivity {

    @BindView(R.id.listView) ListView mListView;
    private String[] members = new String[] {"Justice Nyaga", "Lauren Mokonoi",
            "Paul Nyaga", "Michael James", "Sheila Moraa", "Sheryl Kerubo", "Kim Wangai"};
    private String[] info = new String[] {"Tenor", "Soprano",
            "Tenor", "Bass", "Alto", "Alto", "bass"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);

        ButterKnife.bind(this);

        MembersAdapterArray adapter = new MembersAdapterArray(this, android.R.layout.simple_list_item_1, members, info);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String member = ((TextView)view).getText().toString();
                Toast.makeText(Members.this, member, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Members.this,MemberInfo.class);
                intent.putExtra("Member", member);
                startActivity(intent);
            }
        });

    }
}
