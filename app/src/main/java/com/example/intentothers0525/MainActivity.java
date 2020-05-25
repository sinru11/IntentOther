package com.example.intentothers0525;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        Intent  intent = new Intent(Intent.ACTION_VIEW);
        switch (view.getId()){
            case R.id.btnEmail:
                intent.setData(Uri.parse("candy871121@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT,"好久不見!");
                intent.putExtra(Intent.EXTRA_TEXT,"最近好嗎?");

                break;
            case R.id.btnWeb:
                intent.setData(Uri.parse("http://www.csim.hk.edu.tw/main.php"));

                break;
            case R.id.btnMap:
                intent.setData(Uri.parse("https://goo.gl/maps/Y6P9sWxqNwKd2hMLA"));

                break;
            case R.id.btnWebSearch:
                intent.setAction(Intent.ACTION_WEB_SEARCH);
                intent.putExtra(SearchManager.QUERY,"弘光科技大學");

                break;

        }
        startActivity(intent);
    }
}
