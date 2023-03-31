package com.startapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.sdk.ads.banner.banner3d.Banner3DAd;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.interstitials.ReturnAd;
import com.startapp.sdk.ads.nativead.NativeAd;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.ads.splash.SplashAd;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: com.startapp.vb */
/* compiled from: Sta */
public class C9605vb {

    /* renamed from: a */
    public static Map<Activity, Integer> f39316a = new WeakHashMap();

    /* renamed from: b */
    public static volatile Intent f39317b;

    /* renamed from: c */
    public static volatile Boolean f39318c;

    /* renamed from: com.startapp.vb$a */
    /* compiled from: Sta */
    public interface C9606a {
        /* renamed from: a */
        void mo29863a(int i, String str);

        /* renamed from: a */
        void mo29864a(boolean z, long j, long j2, boolean z2);
    }

    /* renamed from: com.startapp.vb$b */
    /* compiled from: Sta */
    public static class C9607b {
        /* renamed from: a */
        public static StackTraceElement[] m50485a() {
            return Thread.currentThread().getStackTrace();
        }
    }

    /* renamed from: a */
    public static String m50448a(Drawable drawable, int i, int i2, Bitmap.Config config) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Drawable mutate = drawable.mutate();
        mutate.setBounds(0, 0, i, i2);
        mutate.draw(new Canvas(createBitmap));
        C9653y2 y2Var = new C9653y2(i * i2);
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, y2Var);
        return new String(Base64.encode(y2Var.mo31381a(), 0, y2Var.mo31382b(), 2));
    }

    /* renamed from: b */
    public static <T> boolean m50473b(T t, T t2) {
        Object obj;
        boolean z = false;
        try {
            Class<?> cls = t2.getClass();
            LinkedList<Field> linkedList = new LinkedList<>();
            linkedList.addAll(Arrays.asList(cls.getDeclaredFields()));
            if (cls.getSuperclass() != null) {
                m50455a((List<Field>) linkedList, (Class<?>) cls.getSuperclass());
            }
            for (Field field : linkedList) {
                int modifiers = field.getModifiers();
                if (!Modifier.isTransient(modifiers)) {
                    if (!Modifier.isStatic(modifiers)) {
                        field.setAccessible(true);
                        if (field.get(t) == null && (obj = field.get(t2)) != null) {
                            field.set(t, obj);
                            z = true;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return z;
    }

    /* renamed from: c */
    public static String m50474c(Context context) {
        ComponentName component;
        Intent a = m50444a(context, (String) null);
        if (a == null || (component = a.getComponent()) == null) {
            return null;
        }
        return component.getClassName();
    }

    /* renamed from: d */
    public static boolean m50476d(Context context) {
        boolean z = false;
        try {
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            boolean z2 = false;
            int i = 0;
            while (!z2) {
                try {
                    if (i >= activityInfoArr.length) {
                        return z2;
                    }
                    int i2 = i + 1;
                    ActivityInfo activityInfo = activityInfoArr[i];
                    if (activityInfo.name.equals(OverlayActivity.class.getName())) {
                        int i3 = activityInfo.flags & 512;
                        i = i2;
                        z2 = i3 == 0;
                    } else {
                        i = i2;
                    }
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                    z = z2;
                    return z;
                }
            }
            return z2;
        } catch (PackageManager.NameNotFoundException | Exception unused2) {
            return z;
        }
    }

    /* renamed from: e */
    public static boolean m50479e(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next != null && next.importance == 100 && packageName.equals(next.processName)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            if (!m50466a(th, (Class<? extends Throwable>) SecurityException.class) && !m50466a(th, (Class<? extends Throwable>) RemoteException.class)) {
                C9023i4.m48681a(th);
            }
        }
    }

    /* renamed from: f */
    public static boolean m50480f(Context context) {
        Boolean bool = f39318c;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo != null) {
                bool = Boolean.valueOf((applicationInfo.flags & 2) != 0);
            }
        } catch (Throwable unused) {
        }
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        f39318c = bool;
        return bool.booleanValue();
    }

    /* renamed from: g */
    public static boolean m50482g(Context context) {
        return ComponentLocator.m50248a(context).mo31169e().mo29241a();
    }

    /* renamed from: c */
    public static String m50475c(String str) throws IOException {
        return Base64.encodeToString(C8811a.m48224a(m50467a(str)), 10);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m50444a(android.content.Context r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = r8.getPackageName()     // Catch:{ all -> 0x0009 }
            goto L_0x000a
        L_0x0009:
            r1 = r0
        L_0x000a:
            if (r9 != 0) goto L_0x000d
            r9 = r1
        L_0x000d:
            if (r9 != 0) goto L_0x0010
            return r0
        L_0x0010:
            boolean r2 = r9.equals(r1)
            if (r2 == 0) goto L_0x0020
            android.content.Intent r2 = f39317b
            if (r2 == 0) goto L_0x0020
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r2)
            return r8
        L_0x0020:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            if (r2 != r3) goto L_0x0031
            r2 = 100
            goto L_0x0033
        L_0x0031:
            r2 = 5000(0x1388, double:2.4703E-320)
        L_0x0033:
            r4 = 1
            android.content.Intent[] r4 = new android.content.Intent[r4]
            r5 = 0
            r4[r5] = r0
            monitor-enter(r4)
            java.lang.Thread r6 = new java.lang.Thread     // Catch:{ all -> 0x004a }
            com.startapp.ub r7 = new com.startapp.ub     // Catch:{ all -> 0x004a }
            r7.<init>(r4, r8, r9)     // Catch:{ all -> 0x004a }
            r6.<init>(r7)     // Catch:{ all -> 0x004a }
            r6.start()     // Catch:{ all -> 0x004a }
            r4.wait(r2)     // Catch:{ all -> 0x004a }
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            r8 = r4[r5]
            if (r8 == 0) goto L_0x005e
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x005d
            f39317b = r8
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r8)
            return r9
        L_0x005d:
            return r8
        L_0x005e:
            return r0
        L_0x005f:
            r8 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9605vb.m50444a(android.content.Context, java.lang.String):android.content.Intent");
    }

    /* renamed from: d */
    public static boolean m50477d(String str) {
        if (str == null) {
            return false;
        }
        try {
            String[] split = new URL(MetaData.f38952k.mo31021d()).getHost().split("\\.");
            if (split.length > 1) {
                Locale locale = Locale.ENGLISH;
                return str.toLowerCase(locale).contains(split[1].toLowerCase(locale));
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    /* renamed from: e */
    public static long m50478e(String str) {
        long j;
        if (str == null || str.length() < 1) {
            return 0;
        }
        int length = str.length() - 1;
        long j2 = 0;
        long j3 = 0;
        char c = 0;
        boolean z = true;
        while (length >= 0) {
            char charAt = str.charAt(length);
            if (charAt < '0' || charAt > '9') {
                if (charAt == 'm' && c == 's') {
                    j3 = 1;
                    length--;
                    c = charAt;
                } else if (z) {
                    if (charAt == 's') {
                        j = 1000;
                    } else if (charAt == 'm') {
                        j = 60000;
                    } else if (charAt == 'h') {
                        j = 3600000;
                    } else if (charAt == 'd') {
                        j = 86400000;
                    }
                    j3 = j;
                    z = false;
                    length--;
                    c = charAt;
                }
            } else if (j3 != 0) {
                j2 += ((long) (charAt - '0')) * j3;
                j3 *= 10;
                z = true;
                length--;
                c = charAt;
            }
            return (long) (~length);
        }
        return j2;
    }

    /* renamed from: f */
    public static int[][] m50481f(String str) {
        int i;
        int i2;
        ArrayList arrayList = null;
        for (String str2 : str.split(",")) {
            int indexOf = str2.indexOf("..");
            if (indexOf < 0) {
                i2 = Integer.parseInt(str2);
                i = i2;
            } else {
                String substring = str2.substring(0, indexOf);
                int parseInt = substring.length() > 0 ? Integer.parseInt(substring) : RecyclerView.UNDEFINED_DURATION;
                String substring2 = str2.substring(indexOf + 2);
                if (substring2.length() > 0) {
                    i = Integer.parseInt(substring2);
                    i2 = parseInt;
                } else {
                    i2 = parseInt;
                    i = Integer.MAX_VALUE;
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add(new int[]{Math.min(i2, i), Math.max(i2, i)});
        }
        if (arrayList != null) {
            return (int[][]) arrayList.toArray(new int[0][]);
        }
        return null;
    }

    /* renamed from: b */
    public static String m50469b(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        return r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        return r7.getMessage();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0029 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m50470b(java.lang.Throwable r7) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0029 }
            r0.<init>()     // Catch:{ all -> 0x0029 }
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0029 }
            java.util.zip.DeflaterOutputStream r2 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0029 }
            android.util.Base64OutputStream r3 = new android.util.Base64OutputStream     // Catch:{ all -> 0x0029 }
            r4 = 10
            r3.<init>(r0, r4)     // Catch:{ all -> 0x0029 }
            java.util.zip.Deflater r4 = new java.util.zip.Deflater     // Catch:{ all -> 0x0029 }
            r5 = 9
            r6 = 1
            r4.<init>(r5, r6)     // Catch:{ all -> 0x0029 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0029 }
            r1.<init>(r2)     // Catch:{ all -> 0x0029 }
            m50461a((java.lang.Throwable) r7, (java.io.PrintWriter) r1)     // Catch:{ all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x0029 }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0029 }
            return r7
        L_0x0029:
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x002e }
            return r7
        L_0x002e:
            java.lang.String r7 = r7.getMessage()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9605vb.m50470b(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: a */
    public static String m50452a(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (str == null || str2 == null || str3 == null || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + indexOf, indexOf2);
    }

    /* renamed from: b */
    public static boolean m50472b(Context context, String str) {
        if (Build.VERSION.SDK_INT < 15) {
            return false;
        }
        if (str.startsWith("sms:") || str.startsWith("smsto:")) {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            try {
                context.startActivity(intent);
                return true;
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static int m50442a(Activity activity, int i, boolean z) {
        if (z) {
            if (!((WeakHashMap) f39316a).containsKey(activity)) {
                ((WeakHashMap) f39316a).put(activity, Integer.valueOf(activity.getRequestedOrientation()));
            }
            if (i == activity.getResources().getConfiguration().orientation) {
                return C8837b0.m48294a(activity, i, false);
            }
            return C8837b0.m48294a(activity, i, true);
        }
        int i2 = -1;
        if (((WeakHashMap) f39316a).containsKey(activity)) {
            i2 = ((Integer) ((WeakHashMap) f39316a).get(activity)).intValue();
            int i3 = C8837b0.f36438a;
            try {
                activity.setRequestedOrientation(i2);
            } catch (Throwable unused) {
            }
            ((WeakHashMap) f39316a).remove(activity);
        }
        return i2;
    }

    /* renamed from: b */
    public static <T> List<T> m50471b(List<T> list) {
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    /* renamed from: b */
    public static String m50468b(Context context) {
        PackageManager packageManager;
        String str = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable unused) {
            packageManager = null;
        }
        if (packageManager == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT > 29) {
            try {
                InstallSourceInfo installSourceInfo = packageManager.getInstallSourceInfo(context.getPackageName());
                if (installSourceInfo != null) {
                    str = installSourceInfo.getInstallingPackageName();
                }
            } catch (Throwable unused2) {
            }
        }
        if (str != null) {
            return str;
        }
        try {
            return packageManager.getInstallerPackageName(context.getPackageName());
        } catch (Throwable unused3) {
            return str;
        }
    }

    /* renamed from: a */
    public static void m50456a(Activity activity, boolean z) {
        m50442a(activity, activity.getResources().getConfiguration().orientation, z);
    }

    /* renamed from: a */
    public static List<Field> m50455a(List<Field> list, Class<?> cls) {
        list.addAll(Arrays.asList(cls.getDeclaredFields()));
        if (cls.getSuperclass() != null) {
            m50455a(list, (Class<?>) cls.getSuperclass());
        }
        return list;
    }

    /* renamed from: a */
    public static String m50447a(Context context) {
        ActivityInfo activityInfo;
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
                return "";
            }
            String str = activityInfo.packageName;
            return str != null ? str.toLowerCase() : str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static void m50458a(WebView webView, boolean z, String str, Object... objArr) {
        if (webView != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("(");
                if (objArr != null) {
                    for (int i = 0; i < objArr.length; i++) {
                        if (!z || !(objArr[i] instanceof String)) {
                            sb.append(objArr[i]);
                        } else {
                            sb.append("\"");
                            sb.append(objArr[i]);
                            sb.append("\"");
                        }
                        if (i < objArr.length - 1) {
                            sb.append(",");
                        }
                    }
                }
                sb.append(")");
                webView.loadUrl("javascript:" + sb.toString());
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m50463a(Context context, Class<? extends Activity> cls) {
        try {
            for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                if (activityInfo.name.equals(cls.getName())) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static <T> boolean m50465a(T t, T t2) {
        if (t == null) {
            return t2 == null;
        }
        return t.equals(t2);
    }

    /* renamed from: a */
    public static byte[] m50467a(String str) throws IOException {
        byte[] bytes = str.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, new Deflater(9, true));
        deflaterOutputStream.write(bytes);
        deflaterOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public static boolean m50464a(WebView webView, String str) {
        try {
            webView.loadDataWithBaseURL(MetaData.f38952k.mo31035p(), str, "text/html", "utf-8", (String) null);
            return true;
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static String m50453a(int... iArr) {
        int length = iArr.length;
        char[] cArr = new char[length];
        char c = (char) length;
        for (int i = 0; i < length; i++) {
            c = (char) (c + iArr[i]);
            cArr[i] = c;
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static void m50459a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static <T> String m50450a(Iterable<T> iterable, String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (T next : iterable) {
            if (z) {
                sb.append(str);
            }
            sb.append(next);
            z = true;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static StackTraceElement m50445a(int i) {
        if (i < 0) {
            i = 0;
        }
        StackTraceElement[] a = C9607b.m50485a();
        if (a == null) {
            return null;
        }
        String name = C9607b.class.getName();
        int length = a.length;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElement stackTraceElement = a[i2];
            if (stackTraceElement != null && name.equals(stackTraceElement.getClassName())) {
                int i3 = i2 + 3 + i;
                if (i3 < length) {
                    return a[i3];
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m50451a(StackTraceElement stackTraceElement) {
        if (stackTraceElement == null) {
            return "null";
        }
        return stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName() + "()";
    }

    /* renamed from: a */
    public static List<String> m50454a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (m50477d(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m50457a(Context context, int i, String str, boolean z) {
        Log.println(i, "StartAppSDK", str);
        if (z) {
            if (m50480f(context) || C8837b0.m48309c(context)) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                i4Var.f36952d = "Log for a publisher";
                i4Var.f36953e = str;
                i4Var.mo29471a();
            }
        }
    }

    /* renamed from: a */
    public static String m50449a(C9381Ad ad) {
        if (ad instanceof VideoEnabledAd) {
            VideoEnabledAd videoEnabledAd = (VideoEnabledAd) ad;
            if (videoEnabledAd.getType() == C9381Ad.AdType.VIDEO) {
                return "VIDEO";
            }
            return videoEnabledAd.getType() == C9381Ad.AdType.REWARDED_VIDEO ? "REWARDED_VIDEO" : "INTERSTITIAL";
        } else if (ad instanceof ReturnAd) {
            return "RETURN";
        } else {
            if (ad instanceof OfferWallAd) {
                return "OFFER_WALL";
            }
            if (ad instanceof OfferWall3DAd) {
                return "OFFER_WALL_3D";
            }
            if (ad instanceof BannerStandardAd) {
                BannerStandardAd bannerStandardAd = (BannerStandardAd) ad;
                if (bannerStandardAd.mo30069u() == 0) {
                    return AdPreferences.TYPE_BANNER;
                }
                if (bannerStandardAd.mo30069u() == 1) {
                    return "MREC";
                }
                return bannerStandardAd.mo30069u() == 2 ? "COVER" : "BANNER_UNDEFINED";
            } else if (ad instanceof Banner3DAd) {
                return "BANNER_3D";
            } else {
                if (ad instanceof NativeAd) {
                    return "NATIVE";
                }
                return ad instanceof SplashAd ? "SPLASH" : "UNDEFINED";
            }
        }
    }

    /* renamed from: a */
    public static boolean m50462a(int i, int[][] iArr) {
        if (iArr != null) {
            for (int[] iArr2 : iArr) {
                if (iArr2 != null && iArr2.length > 1 && iArr2[0] <= i && i <= iArr2[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m50460a(Object obj, Throwable th) {
        if (obj.getClass().getName().startsWith("com.startapp.")) {
            C9023i4.m48681a(th);
        }
    }

    /* renamed from: a */
    public static void m50461a(Throwable th, PrintWriter printWriter) {
        String className;
        C9585ua uaVar = new C9585ua(th);
        while (uaVar.hasNext()) {
            Throwable a = uaVar.next();
            if (uaVar.f39260d) {
                printWriter.println('-');
            }
            printWriter.println(a.toString().trim());
            StackTraceElement[] stackTrace = a.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                StackTraceElement stackTraceElement = null;
                int i = 0;
                int i2 = 0;
                boolean z = false;
                while (i < length) {
                    StackTraceElement stackTraceElement2 = stackTrace[i];
                    if (!(stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null)) {
                        boolean z2 = i < 3;
                        boolean startsWith = className.startsWith("com.startapp.");
                        if (z2 || startsWith || z) {
                            if (i2 > 0) {
                                printWriter.print(' ');
                                printWriter.println(i2);
                                i2 = 0;
                            }
                            if (stackTraceElement != null) {
                                printWriter.print(' ');
                                printWriter.print(stackTraceElement.getClassName());
                                printWriter.print('.');
                                printWriter.print(stackTraceElement.getMethodName());
                                printWriter.println("()");
                                stackTraceElement = null;
                            }
                            printWriter.print(' ');
                            printWriter.print(stackTraceElement2.getClassName());
                            printWriter.print('.');
                            printWriter.print(stackTraceElement2.getMethodName());
                            printWriter.println("()");
                        } else {
                            if (stackTraceElement != null) {
                                i2++;
                            }
                            stackTraceElement = stackTraceElement2;
                        }
                        z = startsWith;
                    }
                    i++;
                }
                if (stackTraceElement != null) {
                    i2++;
                }
                if (i2 > 0) {
                    printWriter.print(' ');
                    printWriter.println(i2);
                }
            }
        }
    }

    /* renamed from: a */
    public static StackTraceElement m50446a(Throwable th) {
        String className;
        Throwable th2 = th;
        while (true) {
            StackTraceElement stackTraceElement = null;
            if (th2 == null) {
                return null;
            }
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i];
                        if (stackTraceElement2 != null && (className = stackTraceElement2.getClassName()) != null && className.startsWith("com.startapp.")) {
                            stackTraceElement = stackTraceElement2;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (stackTraceElement != null) {
                return stackTraceElement;
            }
            th2 = th2.getCause();
        }
    }

    /* renamed from: a */
    public static boolean m50466a(Throwable th, Class<? extends Throwable> cls) {
        while (th != null) {
            if (cls.isInstance(th)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: a */
    public static long m50443a() {
        if (Build.VERSION.SDK_INT < 17) {
            return SystemClock.elapsedRealtime() * 1000000;
        }
        return SystemClock.elapsedRealtimeNanos();
    }
}
