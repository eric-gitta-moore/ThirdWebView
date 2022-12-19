package com.example.webview;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.webview.R;
import com.example.webview.tencentx5.X5WebViewActivity;
import com.example.webview.utils.StatusBarUtil;

import java.io.IOException;
import java.io.InputStream;

public class EnterActivity extends AppCompatActivity {
    private static final int sleepTime = 2000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        setSplash();
        StatusBarUtil.toggleFullscreen(this);
        init();
    }

    private void setSplash() {
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        try {
            AssetManager assetManager = getAssets();
            InputStream inputStream = assetManager.open("config/splash.png");
            Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
            imageView.setImageBitmap(bitmap);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
