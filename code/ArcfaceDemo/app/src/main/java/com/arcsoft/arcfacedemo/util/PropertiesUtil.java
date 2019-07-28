package com.arcsoft.arcfacedemo.util;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取Properties文件工具类
 */
public class PropertiesUtil {

    public static Properties loadProperties(Context context) {
        Properties properties = new Properties();
        try {
            InputStream in = context.getAssets().open("config.properties");
            properties.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return properties;
    }

}