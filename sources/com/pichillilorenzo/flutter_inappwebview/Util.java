package com.pichillilorenzo.flutter_inappwebview;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.pichillilorenzo.flutter_inappwebview.types.Size2D;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p186ac.C6556k;
import p186ac.C6565o;
import p244ge.C10351a0;

public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";

    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey2, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey2;
            this.certificates = x509CertificateArr;
        }
    }

    public static class WaitFlutterResult {
        public String error;
        public Object result;

        public WaitFlutterResult(Object obj, String str) {
            this.result = obj;
            this.error = str;
        }
    }

    private Util() {
    }

    public static String JSONStringify(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString();
        }
        if (obj instanceof List) {
            return new JSONArray((List) obj).toString();
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        return JSONObject.wrap(obj).toString();
    }

    public static C10351a0 getBasicOkHttpClient() {
        C10351a0.C10353b bVar = new C10351a0.C10353b();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return bVar.mo33237b(15, timeUnit).mo33239d(15, timeUnit).mo33238c(15, timeUnit).mo33236a();
    }

    public static InputStream getFileAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
        C6565o oVar = inAppWebViewFlutterPlugin.registrar;
        return inAppWebViewFlutterPlugin.applicationContext.getResources().getAssets().open(oVar != null ? oVar.mo22171f(str) : inAppWebViewFlutterPlugin.flutterAssets.mo34110a(str));
    }

    public static Size2D getFullscreenSize(Context context) {
        Size2D size2D = new Size2D(-1.0d, -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
                int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
                int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
                Rect bounds = currentWindowMetrics.getBounds();
                size2D.setWidth((double) (bounds.width() - i));
                size2D.setHeight((double) (bounds.height() - i2));
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                size2D.setWidth((double) displayMetrics.widthPixels);
                size2D.setHeight((double) displayMetrics.heightPixels);
            }
        }
        return size2D;
    }

    public static Object getOrDefault(Map map, String str, Object obj) {
        return map.containsKey(str) ? map.get(str) : obj;
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
        C6565o oVar = inAppWebViewFlutterPlugin.registrar;
        String f = oVar != null ? oVar.mo22171f(str) : inAppWebViewFlutterPlugin.flutterAssets.mo34110a(str);
        IOException e = null;
        InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
        if (fileAsset != null) {
            try {
                fileAsset.close();
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e == null) {
            return ANDROID_ASSET_URL + f;
        }
        throw e;
    }

    public static X509Certificate getX509CertFromSslCertHack(SslCertificate sslCertificate) {
        byte[] byteArray = SslCertificate.saveState(sslCertificate).getByteArray("x509-certificate");
        if (byteArray == null) {
            return null;
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(byteArray));
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static WaitFlutterResult invokeMethodAndWait(C6556k kVar, String str, Object obj) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HashMap hashMap = new HashMap();
        hashMap.put("result", (Object) null);
        hashMap.put("error", (Object) null);
        final C6556k kVar2 = kVar;
        final String str2 = str;
        final Object obj2 = obj;
        final HashMap hashMap2 = hashMap;
        final CountDownLatch countDownLatch2 = countDownLatch;
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                C6556k.this.mo22160d(str2, obj2, new C6556k.C6561d() {
                    public void error(String str, String str2, Object obj) {
                        Map map = hashMap2;
                        map.put("error", "ERROR: " + str + " " + str2);
                        hashMap2.put("result", obj);
                        countDownLatch2.countDown();
                    }

                    public void notImplemented() {
                        countDownLatch2.countDown();
                    }

                    public void success(Object obj) {
                        hashMap2.put("result", obj);
                        countDownLatch2.countDown();
                    }
                });
            }
        });
        countDownLatch.await();
        return new WaitFlutterResult(hashMap.get("result"), (String) hashMap.get("error"));
    }

    public static <O> Object invokeMethodIfExists(O o, String str, Object... objArr) {
        Method[] methods = o.getClass().getMethods();
        int length = methods.length;
        int i = 0;
        while (i < length) {
            Method method = methods[i];
            if (method.getName().equals(str)) {
                try {
                    return method.invoke(o, objArr);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            } else {
                i++;
            }
        }
        return null;
    }

    public static boolean isClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIPv6(String str) {
        try {
            Inet6Address.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static PrivateKeyAndCertificates loadPrivateKeyAndCertificate(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, String str2, String str3) {
        FileInputStream fileInputStream;
        PrivateKeyAndCertificates privateKeyAndCertificates = null;
        try {
            fileInputStream = getFileAsset(inAppWebViewFlutterPlugin, str);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        if (fileInputStream == null) {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(LOG_TAG, e.getMessage());
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        Log.e(LOG_TAG, e2.getMessage());
                    }
                }
                throw th;
            }
        }
        KeyStore instance = KeyStore.getInstance(str3);
        instance.load(fileInputStream, (str2 != null ? str2 : "").toCharArray());
        String nextElement = instance.aliases().nextElement();
        if (str2 == null) {
            str2 = "";
        }
        Key key = instance.getKey(nextElement, str2.toCharArray());
        if (key instanceof PrivateKey) {
            privateKeyAndCertificates = new PrivateKeyAndCertificates((PrivateKey) key, new X509Certificate[]{(X509Certificate) instance.getCertificate(nextElement)});
        }
        fileInputStream.close();
        try {
            fileInputStream.close();
        } catch (IOException e3) {
            e3.printStackTrace();
            Log.e(LOG_TAG, e3.getMessage());
        }
        return privateKeyAndCertificates;
    }

    public static void log(String str, String str2) {
        int min;
        int length = str2.length();
        int i = 0;
        while (i < length) {
            int indexOf = str2.indexOf(10, i);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i + 4000);
                Log.d(str, str2.substring(i, min));
                if (min >= indexOf) {
                    break;
                }
                i = min;
            }
            i = min + 1;
        }
    }

    public static String normalizeIPv6(String str) throws Exception {
        if (isIPv6(str)) {
            return InetAddress.getByName(str).getCanonicalHostName();
        }
        throw new Exception("Invalid address: " + str);
    }

    public static boolean objEquals(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }
}
