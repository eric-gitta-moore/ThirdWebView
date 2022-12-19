package com.example.jingbin.webviewstudy;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jingbin.webviewstudy.tencentx5.X5WebViewActivity;

public class EnterActivity extends AppCompatActivity {
    private static final int sleepTime = 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        init();
    }

    public void init() {
        new Thread(new Runnable() {
            public void run() {
                long start = System.currentTimeMillis();
                long costTime = System.currentTimeMillis() - start;
                if (sleepTime - costTime > 0) {
                    try {
                        Thread.sleep(sleepTime - costTime);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //进入主页面
//                startActivity(new Intent(EnterActivity.this, X5WebViewActivity.class));
                startActivity(new Intent(EnterActivity.this, MainActivity.class));
                finish();
            }
        }).start();
    }
}
