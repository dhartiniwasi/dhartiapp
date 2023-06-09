package com.startapp.networkTest.net;

import com.startapp.C9032id;
import com.startapp.C9053jd;
import com.startapp.C9258r5;
import com.startapp.C9632x2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* compiled from: Sta */
public abstract class WebApiClient {

    /* renamed from: a */
    private static final String f37857a = "WebApiClient";

    /* renamed from: b */
    private static final int f37858b = 10000;

    /* compiled from: Sta */
    public enum RequestMethod {
        POST,
        GET,
        PUT,
        DELETE
    }

    /* renamed from: com.startapp.networkTest.net.WebApiClient$a */
    /* compiled from: Sta */
    public class C9165a implements X509TrustManager {
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: a */
    public static C9053jd m49036a(RequestMethod requestMethod, String str) throws IOException {
        return m49037a(requestMethod, str, (Object) null);
    }

    /* renamed from: a */
    public static C9053jd m49037a(RequestMethod requestMethod, String str, Object obj) throws IOException {
        return m49038a(requestMethod, str, obj, new C9032id[]{new C9032id("Content-Type", "application/json; charset=UTF-8"), new C9032id("Accept", "application/json")});
    }

    /* renamed from: a */
    public static C9053jd m49038a(RequestMethod requestMethod, String str, Object obj, C9032id[] idVarArr) throws IOException {
        return m49039a(requestMethod, str, obj, idVarArr, false);
    }

    /* renamed from: a */
    public static C9053jd m49039a(RequestMethod requestMethod, String str, Object obj, C9032id[] idVarArr, boolean z) throws IOException {
        HttpsURLConnection httpsURLConnection;
        C9053jd jdVar = new C9053jd();
        URL url = new URL(str);
        URL url2 = new URL(str);
        if (!z || !url2.getProtocol().toLowerCase().equals("https")) {
            httpsURLConnection = (HttpURLConnection) url.openConnection();
        } else {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) url.openConnection();
            m49040a(httpsURLConnection2);
            httpsURLConnection2.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            httpsURLConnection = httpsURLConnection2;
        }
        httpsURLConnection.setRequestMethod(requestMethod.toString());
        if (idVarArr != null) {
            for (C9032id idVar : idVarArr) {
                httpsURLConnection.setRequestProperty(idVar.f36971a, idVar.f36972b);
            }
        }
        httpsURLConnection.setConnectTimeout(f37858b);
        httpsURLConnection.setReadTimeout(f37858b);
        if (obj != null) {
            if (requestMethod.equals(RequestMethod.GET) || requestMethod.equals(RequestMethod.DELETE)) {
                throw new IOException("GET and DELETE does not support a body");
            }
            httpsURLConnection.setDoOutput(true);
            String a = C9258r5.m49219a(obj);
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(a.getBytes());
            outputStream.flush();
            outputStream.close();
        }
        jdVar.f37024a = httpsURLConnection.getResponseCode();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        }
        httpsURLConnection.disconnect();
        jdVar.f37025b = sb.toString();
        return jdVar;
    }

    /* renamed from: a */
    private static void m49040a(HttpsURLConnection httpsURLConnection) {
        TrustManager[] trustManagerArr = {new C9165a()};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, trustManagerArr, new SecureRandom());
            httpsURLConnection.setSSLSocketFactory(instance.getSocketFactory());
        } catch (Throwable th) {
            C9632x2.m50510a(th);
        }
    }
}
