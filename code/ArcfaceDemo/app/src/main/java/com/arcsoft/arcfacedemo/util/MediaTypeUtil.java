package com.arcsoft.arcfacedemo.util;

import java.net.FileNameMap;
import java.net.URLConnection;

import okhttp3.MediaType;

public class MediaTypeUtil {

    public static MediaType guessMimeType(String path) {
        FileNameMap fileNameMap = URLConnection.getFileNameMap();
        path = path.replace("#", ""); // 文件名不能含有#号
        String contentType = fileNameMap.getContentTypeFor(path);
        if (contentType == null) {
            contentType = "application/octet-stream";
        }
        return MediaType.parse(contentType);
    }

}
