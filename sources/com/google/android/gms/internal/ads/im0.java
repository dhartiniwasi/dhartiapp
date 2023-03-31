package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p006a4.C0097b;
import p006a4.C0098c;
import p060h4.C4571q4;
import p060h4.C4596v;
import p080k4.C4883a;
import p143t4.C5526b;
import p179z3.C6331f;
import p179z3.C6337h;
import p179z3.C6340j;
import p180z4.C6370f;
import p180z4.C6378j;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class im0 {

    /* renamed from: b */
    public static final Handler f10857b = new b53(Looper.getMainLooper());

    /* renamed from: c */
    private static final String f10858c = C6340j.class.getName();

    /* renamed from: d */
    private static final String f10859d = C4883a.class.getName();

    /* renamed from: e */
    private static final String f10860e = C0097b.class.getName();

    /* renamed from: f */
    private static final String f10861f = C0098c.class.getName();

    /* renamed from: g */
    private static final String f10862g = C5526b.class.getName();

    /* renamed from: h */
    private static final String f10863h = C6331f.class.getName();

    /* renamed from: a */
    private float f10864a = -1.0f;

    /* renamed from: A */
    private final JSONArray m14400A(Collection collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object B : collection) {
            m14401B(jSONArray, B);
        }
        return jSONArray;
    }

    /* renamed from: B */
    private final void m14401B(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(mo11159j((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(mo11160k((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m14400A((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(mo11158i((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private final void m14402a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        Boolean[] boolArr;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14667r)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, mo11159j((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, mo11160k((Map) obj));
        } else if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), m14400A((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m14400A(Arrays.asList((Object[]) obj)));
        } else {
            int i = 0;
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                if (iArr == null) {
                    numArr = new Integer[0];
                } else {
                    int length = iArr.length;
                    Integer[] numArr2 = new Integer[length];
                    while (i < length) {
                        numArr2[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                    numArr = numArr2;
                }
                jSONObject.put(str, mo11158i(numArr));
            } else if (obj instanceof double[]) {
                double[] dArr2 = (double[]) obj;
                if (dArr2 == null) {
                    dArr = new Double[0];
                } else {
                    int length2 = dArr2.length;
                    Double[] dArr3 = new Double[length2];
                    while (i < length2) {
                        dArr3[i] = Double.valueOf(dArr2[i]);
                        i++;
                    }
                    dArr = dArr3;
                }
                jSONObject.put(str, mo11158i(dArr));
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                if (jArr == null) {
                    lArr = new Long[0];
                } else {
                    int length3 = jArr.length;
                    Long[] lArr2 = new Long[length3];
                    while (i < length3) {
                        lArr2[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                    lArr = lArr2;
                }
                jSONObject.put(str, mo11158i(lArr));
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                if (zArr == null) {
                    boolArr = new Boolean[0];
                } else {
                    int length4 = zArr.length;
                    Boolean[] boolArr2 = new Boolean[length4];
                    while (i < length4) {
                        boolArr2[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                    boolArr = boolArr2;
                }
                jSONObject.put(str, mo11158i(boolArr));
            } else {
                jSONObject.put(str, obj);
            }
        }
    }

    /* renamed from: b */
    private static final void m14403b(ViewGroup viewGroup, C4571q4 q4Var, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int y = m14418y(context, 3);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(q4Var.f24977f - y, q4Var.f24974c - y, 17));
            viewGroup.addView(frameLayout, q4Var.f24977f, q4Var.f24974c);
        }
    }

    /* renamed from: c */
    public static int m14404c(Context context, int i) {
        DisplayMetrics displayMetrics;
        Configuration configuration;
        if (context == null) {
            return -1;
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null || (configuration = resources.getConfiguration()) == null) {
            return -1;
        }
        int i2 = configuration.orientation;
        if (i == 0) {
            i = i2;
        }
        if (i == i2) {
            return Math.round(((float) displayMetrics.heightPixels) / displayMetrics.density);
        }
        return Math.round(((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    /* renamed from: e */
    public static C6337h m14405e(Context context, int i, int i2, int i3) {
        int c = m14404c(context, i3);
        if (c == -1) {
            return C6337h.f30526q;
        }
        return new C6337h(i, Math.max(Math.min(i > 655 ? Math.round((((float) i) / 728.0f) * 90.0f) : i > 632 ? 81 : i > 526 ? Math.round((((float) i) / 468.0f) * 60.0f) : i > 432 ? 68 : Math.round((((float) i) / 320.0f) * 50.0f), Math.min(90, Math.round(((float) c) * 0.15f))), 50));
    }

    /* renamed from: f */
    public static String m14406f() {
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(byteArray);
                instance.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(instance.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return bigInteger;
    }

    /* renamed from: g */
    public static String m14407g(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, instance.digest())});
            } catch (NoSuchAlgorithmException unused) {
                i++;
            } catch (ArithmeticException unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static Throwable m14408h(Throwable th) {
        if (((Boolean) n10.f13755f.mo13438e()).booleanValue()) {
            return th;
        }
        LinkedList linkedList = new LinkedList();
        while (th != null) {
            linkedList.push(th);
            th = th.getCause();
        }
        Throwable th2 = null;
        while (!linkedList.isEmpty()) {
            Throwable th3 = (Throwable) linkedList.pop();
            StackTraceElement[] stackTrace = th3.getStackTrace();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
            boolean z = false;
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (m14409p(stackTraceElement.getClassName())) {
                    arrayList.add(stackTraceElement);
                    z = true;
                } else {
                    String className = stackTraceElement.getClassName();
                    if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                        arrayList.add(stackTraceElement);
                    } else {
                        arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                    }
                }
            }
            if (z) {
                if (th2 == null) {
                    th2 = new Throwable(th3.getMessage());
                } else {
                    th2 = new Throwable(th3.getMessage(), th2);
                }
                th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
        }
        return th2;
    }

    /* renamed from: p */
    public static boolean m14409p(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) n10.f13753d.mo13438e());
    }

    /* renamed from: q */
    public static final int m14410q(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: r */
    public static final String m14411r(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        String str2;
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i >= stackTraceElementArr.length) {
                str2 = null;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            String className = stackTraceElement.getClassName();
            if (!"loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) || (!f10858c.equalsIgnoreCase(className) && !f10859d.equalsIgnoreCase(className) && !f10860e.equalsIgnoreCase(className) && !f10861f.equalsIgnoreCase(className) && !f10862g.equalsIgnoreCase(className) && !f10863h.equalsIgnoreCase(className))) {
                i2 = i;
            }
        }
        str2 = stackTraceElementArr[i].getClassName();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            StringBuilder sb = new StringBuilder();
            if (stringTokenizer.hasMoreElements()) {
                sb.append(stringTokenizer.nextToken());
                int i3 = 2;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0 || !stringTokenizer.hasMoreElements()) {
                        str = sb.toString();
                    } else {
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i3 = i4;
                    }
                }
                str = sb.toString();
            }
            if (str2 == null || str2.contains(str)) {
                return null;
            }
            return str2;
        }
        return null;
    }

    /* renamed from: s */
    public static final boolean m14412s() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator");
    }

    /* renamed from: t */
    public static final boolean m14413t(Context context, int i) {
        return C6370f.m37437h().mo21777j(context, i) == 0;
    }

    /* renamed from: u */
    public static final boolean m14414u(Context context) {
        int j = C6370f.m37437h().mo21777j(context, C6378j.f30617a);
        return j == 0 || j == 2;
    }

    /* renamed from: v */
    public static final boolean m14415v() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: w */
    public static final int m14416w(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: x */
    public static final void m14417x(Context context, String str, String str2, Bundle bundle, boolean z, hm0 hm0) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            str = C6370f.m37437h().mo21796b(context) + ".223104000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        hm0.mo9501f(appendQueryParameter.toString());
    }

    /* renamed from: y */
    public static final int m14418y(Context context, int i) {
        return m14410q(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: z */
    public static final String m14419z(Context context) {
        String str;
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        if (str == null || m14412s()) {
            str = "emulator";
        }
        return m14407g(str);
    }

    /* renamed from: d */
    public final int mo11157d(Context context, int i) {
        if (this.f10864a < 0.0f) {
            synchronized (this) {
                if (this.f10864a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.f10864a = displayMetrics.density;
                }
            }
        }
        return Math.round(((float) i) / this.f10864a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final JSONArray mo11158i(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object B : objArr) {
            m14401B(jSONArray, B);
        }
        return jSONArray;
    }

    /* renamed from: j */
    public final JSONObject mo11159j(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m14402a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: k */
    public final JSONObject mo11160k(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m14402a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* renamed from: l */
    public final JSONObject mo11161l(Bundle bundle, JSONObject jSONObject) {
        if (bundle == null) {
            return null;
        }
        try {
            return mo11159j(bundle);
        } catch (JSONException e) {
            pm0.m18665e("Error converting Bundle to JSON", e);
            return null;
        }
    }

    /* renamed from: m */
    public final void mo11162m(ViewGroup viewGroup, C4571q4 q4Var, String str, String str2) {
        if (str2 != null) {
            pm0.m18667g(str2);
        }
        m14403b(viewGroup, q4Var, str, -65536, -16777216);
    }

    /* renamed from: n */
    public final void mo11163n(ViewGroup viewGroup, C4571q4 q4Var, String str) {
        m14403b(viewGroup, q4Var, "Ads by Google", -16777216, -1);
    }

    /* renamed from: o */
    public final void mo11164o(Context context, String str, String str2, Bundle bundle, boolean z) {
        m14417x(context, str, "gmob-apps", bundle, true, new fm0(this));
    }
}
