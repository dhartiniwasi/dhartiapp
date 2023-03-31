package com.startapp;

import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

/* renamed from: com.startapp.e9 */
/* compiled from: Sta */
public abstract class C8930e9 extends HttpURLConnection {
    /* renamed from: a */
    public static HttpURLConnection m48551a(String str, String str2) throws IOException {
        boolean z;
        try {
            URLDecoder.decode(str, "UTF-8");
            z = false;
        } catch (UnsupportedEncodingException unused) {
            z = true;
        }
        if (!z) {
            try {
                str = m48550a(str);
            } catch (Exception unused2) {
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (!TextUtils.isEmpty(str2)) {
                httpURLConnection.setRequestProperty("User-Agent", str2);
            }
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            return httpURLConnection;
        }
        throw new UnsupportedEncodingException(str);
    }

    /* renamed from: a */
    public static String m48550a(String str) throws Exception {
        boolean z;
        URI uri;
        try {
            new URI(str);
            z = false;
        } catch (URISyntaxException unused) {
            z = true;
        }
        if (z) {
            URL url = new URL(str);
            uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        } else {
            uri = new URI(str);
        }
        return uri.toURL().toString();
    }
}
