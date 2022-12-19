package com.example.webview;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webview.R;
import com.example.webview.tencentx5.X5WebViewActivity;
import com.example.webview.utils.StatusBarUtil;

public class EnterActivity extends AppCompatActivity {
    private static final int sleepTime = 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        StatusBarUtil.toggleFullscreen(this);
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
                startActivity(new Intent(EnterActivity.this, X5WebViewActivity.class));
//                startActivity(new Intent(EnterActivity.this, MainActivity.class));
                finish();
            }
        }).start();
    }
}
