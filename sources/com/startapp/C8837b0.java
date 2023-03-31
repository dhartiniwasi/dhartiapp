package com.startapp;

import android.app.Activity;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Paint;
import android.os.Build;
import android.provider.Settings;
import android.webkit.WebView;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.startapp.b0 */
/* compiled from: Sta */
public class C8837b0 {

    /* renamed from: a */
    public static final /* synthetic */ int f36438a = 0;

    /* renamed from: com.startapp.b0$a */
    /* compiled from: Sta */
    public class C8838a implements Comparator<Signature> {
        public int compare(Object obj, Object obj2) {
            return ((Signature) obj).toCharsString().compareTo(((Signature) obj2).toCharsString());
        }
    }

    /* renamed from: com.startapp.b0$b */
    /* compiled from: Sta */
    public interface C8839b {
    }

    static {
        m48296a((Class<?>) C8837b0.class);
    }

    /* renamed from: a */
    public static String m48296a(Class<?> cls) {
        StringBuilder a = C8870c1.m48422a("startapp.");
        a.append(cls.getSimpleName());
        return a.toString();
    }

    /* renamed from: b */
    public static boolean m48308b(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            if (i < 17 || i >= 21) {
                if (Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1) {
                    return true;
                }
                return false;
            } else if (Settings.Global.getInt(context.getContentResolver(), "install_non_market_apps") != 1) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m48309c(Context context) {
        try {
            if (C9595v2.f39280k == null) {
                if (C9595v2.f39279j == null) {
                    Context a = C9058k0.m48718a(context);
                    if (a != null) {
                        context = a;
                    }
                    C9595v2.f39279j = new C9595v2(context);
                }
                C9595v2.f39280k = Boolean.valueOf(C9595v2.f39279j.mo31323c());
            }
            return C9595v2.f39280k.booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m48294a(Activity activity, int i, boolean z) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i2 = 8;
        if (i != 1) {
            if (i == 2) {
                if (Build.VERSION.SDK_INT <= 8 || z || rotation == 0 || rotation == 1) {
                    i2 = 0;
                }
                activity.setRequestedOrientation(i2);
                return i2;
            }
        } else if (Build.VERSION.SDK_INT > 8 && !z && (rotation == 1 || rotation == 2)) {
            i2 = 9;
            activity.setRequestedOrientation(i2);
            return i2;
        }
        i2 = 1;
        try {
            activity.setRequestedOrientation(i2);
        } catch (Throwable unused) {
        }
        return i2;
    }

    /* renamed from: b */
    public static void m48307b(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.onResume();
            return;
        }
        try {
            Class.forName("android.webkit.WebView").getMethod("onResume", new Class[0]).invoke(webView, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static boolean m48303a() {
        return Build.VERSION.SDK_INT >= 14;
    }

    /* renamed from: a */
    public static void m48300a(WebView webView) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.onPause();
            return;
        }
        try {
            Class.forName("android.webkit.WebView").getMethod("onPause", new Class[0]).invoke(webView, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m48301a(WebView webView, Paint paint) {
        if (Build.VERSION.SDK_INT >= 11) {
            webView.setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: a */
    public static boolean m48304a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (context.checkSelfPermission(str) == 0) {
                    return true;
                }
                return false;
            } else if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static int m48293a(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            return i;
        }
        if (i == 16) {
            return 0;
        }
        if (i == 17) {
            return 1;
        }
        if (i == 20) {
            return 9;
        }
        if (i == 21) {
            return 11;
        }
        if (i != 8388611) {
            if (i == 8388613 && i2 < 14) {
                return 5;
            }
            return i;
        } else if (i2 < 14) {
            return 3;
        } else {
            return i;
        }
    }

    /* renamed from: a */
    public static String m48297a(String str, Context context) throws FileNotFoundException {
        String str2;
        int i;
        try {
            str2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).sourceDir;
        } catch (Throwable unused) {
            str2 = null;
        }
        if (str2 == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(str2);
        StringBuilder sb = new StringBuilder();
        try {
            byte[] bArr = new byte[8192];
            MessageDigest instance = MessageDigest.getInstance(str);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else if (read > 0) {
                    instance.update(bArr, 0, read);
                }
            }
            for (byte b : instance.digest()) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
        } catch (Throwable unused2) {
        }
        m48302a((Closeable) fileInputStream);
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }

    /* renamed from: a */
    public static boolean m48306a(PackageInfo packageInfo) {
        int i = packageInfo.applicationInfo.flags;
        return ((i & 1) == 0 && (i & 128) == 0) ? false : true;
    }

    /* renamed from: a */
    public static boolean m48305a(Context context, String str, int i) {
        try {
            if (context.getPackageManager().getPackageInfo(str, 128).versionCode >= i) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static List<PackageInfo> m48298a(PackageManager packageManager) throws Exception {
        return (List) packageManager.getClass().getMethod("getInstalledPackages", new Class[]{Integer.TYPE}).invoke(packageManager, new Object[]{8192});
    }

    /* renamed from: a */
    public static String m48295a(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return null;
            }
            if (signatureArr.length == 1) {
                return signatureArr[0].toCharsString();
            }
            Arrays.sort(signatureArr, new C8838a());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < signatureArr.length; i++) {
                sb.append(signatureArr[i].toCharsString());
                if (i < signatureArr.length - 1) {
                    sb.append(';');
                }
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m48302a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m48299a(Context context, ServiceConnection serviceConnection) {
        if (serviceConnection != null) {
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
