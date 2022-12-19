package com.example.webview.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConfigUtil {
    private final static ConfigUtil INSTANCE = new ConfigUtil();

    private ConfigUtil() {

    }

    public static ConfigUtil getInstance() {
        return INSTANCE;
    }

    public boolean getSplashIsFullScreen(Context context) throws IOException {
        ConfigUtil configUtil = ConfigUtil.getInstance();
        JSONObject data = configUtil.getConfig(context);
        JSONObject config = data.getJSONObject("Splash");
        return config.getBooleanValue("IsFullScreen");
    }

    public boolean getWebViewIsFullScreen(Context context) throws IOException {
        ConfigUtil configUtil = ConfigUtil.getInstance();
        JSONObject data = configUtil.getConfig(context);
        JSONObject config = data.getJSONObject("WebView");
        return config.getBooleanValue("IsFullScreen");
    }

    public String getHomeURL(Context context) throws IOException {
        ConfigUtil configUtil = ConfigUtil.getInstance();
        JSONObject config = configUtil.getConfig(context);
        return config.getString("homeURL");
    }

    public JSONObject getConfig(Context context) throws IOException {
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open("config/config.json");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder builder = new StringBuilder();
        String jsonLine = "";
        while ((jsonLine = bufferedReader.readLine()) != null) {
            builder.append(jsonLine);
        }
        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();
        String json = builder.toString();

        JSONObject data = JSON.parseObject(json);
        return data;
    }
}
