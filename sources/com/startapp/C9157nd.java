package com.startapp;

import android.content.Context;
import android.net.ConnectivityManager;
import com.startapp.networkTest.data.WifiInfo;
import com.startapp.networkTest.enums.WifiStates;
import java.lang.reflect.Method;

/* renamed from: com.startapp.nd */
/* compiled from: Sta */
public class C9157nd {

    /* renamed from: h */
    private static final String f37359h = "nd";

    /* renamed from: i */
    private static final boolean f37360i = false;

    /* renamed from: j */
    public static final int f37361j = -1;

    /* renamed from: a */
    private WifiStates f37362a;

    /* renamed from: b */
    private ConnectivityManager f37363b;

    /* renamed from: c */
    private boolean f37364c = false;

    /* renamed from: d */
    private Context f37365d;

    /* renamed from: e */
    private String f37366e = "";

    /* renamed from: f */
    private boolean f37367f;

    /* renamed from: g */
    private Method f37368g;

    /* renamed from: com.startapp.nd$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C9158a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37369a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.startapp.networkTest.enums.AnonymizationLevel[] r0 = com.startapp.networkTest.enums.AnonymizationLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37369a = r0
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Full     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37369a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.Anonymized     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37369a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.networkTest.enums.AnonymizationLevel r1 = com.startapp.networkTest.enums.AnonymizationLevel.None     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C9157nd.C9158a.<clinit>():void");
        }
    }

    public C9157nd(Context context) {
        this.f37365d = context.getApplicationContext();
        this.f37363b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f37362a = WifiStates.Unknown;
        m49005a();
    }

    /* renamed from: a */
    private String m49004a(String str) {
        int i;
        if (str.length() == 0 || (i = C9158a.f37369a[C8821a5.m48254b().WIFIINFO_BSSID_RECORDTYPE().ordinal()]) == 1) {
            return str;
        }
        if (i != 2) {
            return "";
        }
        if (str.length() != 17) {
            return "xx:xx:xx:xx:xx:xx";
        }
        return str.substring(0, 9) + "xx:xx:xx";
    }

    /* renamed from: a */
    private void m49005a() {
    }

    /* renamed from: b */
    private String m49006b(String str) {
        return (str.length() == 0 || C9158a.f37369a[C8821a5.m48254b().WIFIINFO_SSID_RECORDTYPE().ordinal()] == 1) ? str : "";
    }

    /* renamed from: c */
    public WifiInfo mo29716c() {
        WifiInfo wifiInfo = new WifiInfo();
        wifiInfo.MissingPermission = true;
        try {
            this.f37365d.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE");
            return wifiInfo;
        } catch (Throwable th) {
            C9632x2.m50510a(th);
            return wifiInfo;
        }
    }

    /* renamed from: d */
    public long mo29717d() {
        if (this.f37366e.length() == 0) {
            mo29716c();
        }
        if (this.f37366e.length() == 0) {
            return -1;
        }
        return C8954fb.m48585a(this.f37366e);
    }

    /* renamed from: e */
    public long mo29718e() {
        String str = this.f37366e;
        if (str == null || str.length() == 0) {
            mo29716c();
        }
        String str2 = this.f37366e;
        if (str2 == null || str2.length() == 0) {
            return -1;
        }
        return C8954fb.m48588b(this.f37366e);
    }

    /* renamed from: f */
    public void mo29719f() {
    }

    /* renamed from: g */
    public void mo29720g() {
    }

    /* renamed from: b */
    private int[] m49007b() {
        int[] iArr = {-1, 0};
        if (this.f37367f) {
            return iArr;
        }
        String[] a = C9622w9.m50493a("/proc/net/wireless");
        if (a.length == 0) {
            this.f37367f = true;
            return iArr;
        }
        if (a.length > 2) {
            int i = 2;
            while (i < a.length) {
                String[] a2 = C9135ma.m48972a(a[i].trim().split(" "));
                if (a2.length <= 4 || !a2[0].equals("wlan0:")) {
                    i++;
                } else {
                    try {
                        return new int[]{Integer.parseInt(a2[2].replace(".", "")), Integer.parseInt(a2[3].replace(".", ""))};
                    } catch (NumberFormatException unused) {
                        return iArr;
                    }
                }
            }
        }
        return iArr;
    }
}
