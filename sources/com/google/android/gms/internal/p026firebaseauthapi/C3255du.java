package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.du */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3255du {
    /* renamed from: a */
    public static void m25446a(String str, C3320ft ftVar, C3156au auVar, Type type, C3452jt jtVar) {
        BufferedOutputStream bufferedOutputStream;
        try {
            C4141r.m28221k(ftVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = ftVar.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            jtVar.mo16233a(httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.close();
            m25447b(httpURLConnection, auVar, type);
            return;
        } catch (SocketTimeoutException unused) {
            auVar.mo15755f("TIMEOUT");
            return;
        } catch (UnknownHostException unused2) {
            auVar.mo15755f("<<Network Error>>");
            return;
        } catch (IOException | NullPointerException | JSONException e) {
            auVar.mo15755f(e.getMessage());
            return;
        } catch (Throwable th) {
            C3222cu.m25360a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private static void m25447b(HttpURLConnection httpURLConnection, C3156au auVar, Type type) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (m25448c(responseCode)) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (!m25448c(responseCode)) {
                auVar.mo15755f((String) C3287et.m25533a(sb2, String.class));
            } else {
                auVar.mo15754c((C3353gt) C3287et.m25533a(sb2, type));
            }
            httpURLConnection.disconnect();
            return;
        } catch (SocketTimeoutException unused) {
            auVar.mo15755f("TIMEOUT");
            httpURLConnection.disconnect();
            return;
        } catch (C3219cr | IOException e) {
            try {
                auVar.mo15755f(e.getMessage());
                return;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (Throwable th) {
            C3222cu.m25360a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    private static final boolean m25448c(int i) {
        return i >= 200 && i < 300;
    }
}
