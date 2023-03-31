package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ch0 {

    /* renamed from: A */
    private int f7719A;

    /* renamed from: B */
    private final String f7720B;

    /* renamed from: C */
    private boolean f7721C;

    /* renamed from: a */
    private int f7722a;

    /* renamed from: b */
    private boolean f7723b;

    /* renamed from: c */
    private boolean f7724c;

    /* renamed from: d */
    private int f7725d;

    /* renamed from: e */
    private int f7726e;

    /* renamed from: f */
    private int f7727f;

    /* renamed from: g */
    private String f7728g;

    /* renamed from: h */
    private int f7729h;

    /* renamed from: i */
    private int f7730i;

    /* renamed from: j */
    private int f7731j;

    /* renamed from: k */
    private boolean f7732k;

    /* renamed from: l */
    private int f7733l;

    /* renamed from: m */
    private double f7734m;

    /* renamed from: n */
    private boolean f7735n;

    /* renamed from: o */
    private String f7736o;

    /* renamed from: p */
    private String f7737p;

    /* renamed from: q */
    private final boolean f7738q;

    /* renamed from: r */
    private final boolean f7739r;

    /* renamed from: s */
    private final String f7740s;

    /* renamed from: t */
    private final boolean f7741t;

    /* renamed from: u */
    private final boolean f7742u;

    /* renamed from: v */
    private final boolean f7743v;

    /* renamed from: w */
    private final String f7744w;

    /* renamed from: x */
    private final String f7745x;

    /* renamed from: y */
    private float f7746y;

    /* renamed from: z */
    private int f7747z;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a A[Catch:{ Exception -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ch0(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            com.google.android.gms.internal.ads.C2679nz.m17343c(r7)
            r6.m10934c(r7)
            r6.m10936e(r7)
            r6.m10935d(r7)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r2 = m10933b(r0, r2)
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0023
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            r6.f7738q = r2
            java.lang.String r2 = "http://www.google.com"
            android.content.pm.ResolveInfo r2 = m10933b(r0, r2)
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            r6.f7739r = r3
            java.lang.String r2 = r1.getCountry()
            r6.f7740s = r2
            p053g4.C4409t.m29326r()
            p060h4.C4584t.m30036b()
            boolean r2 = com.google.android.gms.internal.ads.im0.m14412s()
            r6.f7741t = r2
            boolean r2 = p067i5.C4695i.m30394c(r7)
            r6.f7742u = r2
            boolean r2 = p067i5.C4695i.m30395d(r7)
            r6.f7743v = r2
            java.lang.String r1 = r1.getLanguage()
            r6.f7744w = r1
            java.lang.String r1 = "market://details?id=com.google.android.gms.ads"
            android.content.pm.ResolveInfo r0 = m10933b(r0, r1)
            java.lang.String r1 = "."
            r2 = 0
            if (r0 != 0) goto L_0x0063
        L_0x0061:
            r0 = r2
            goto L_0x008a
        L_0x0063:
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            if (r0 != 0) goto L_0x0068
            goto L_0x0061
        L_0x0068:
            k5.b r3 = p081k5.C4888c.m31075a(r7)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r5 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.pm.PackageInfo r3 = r3.mo18673f(r5, r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r3 == 0) goto L_0x0061
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0061 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0061 }
            r4.append(r3)     // Catch:{ NameNotFoundException -> 0x0061 }
            r4.append(r1)     // Catch:{ NameNotFoundException -> 0x0061 }
            r4.append(r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r0 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0061 }
        L_0x008a:
            r6.f7745x = r0
            k5.b r0 = p081k5.C4888c.m31075a(r7)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r3 = "com.android.vending"
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r0.mo18673f(r3, r4)     // Catch:{ Exception -> 0x00b1 }
            if (r0 == 0) goto L_0x00b2
            int r3 = r0.versionCode     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x00b1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
            r4.<init>()     // Catch:{ Exception -> 0x00b1 }
            r4.append(r3)     // Catch:{ Exception -> 0x00b1 }
            r4.append(r1)     // Catch:{ Exception -> 0x00b1 }
            r4.append(r0)     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            r6.f7720B = r2
            android.content.res.Resources r7 = r7.getResources()
            if (r7 != 0) goto L_0x00bb
            return
        L_0x00bb:
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            if (r7 != 0) goto L_0x00c2
            return
        L_0x00c2:
            float r0 = r7.density
            r6.f7746y = r0
            int r0 = r7.widthPixels
            r6.f7747z = r0
            int r7 = r7.heightPixels
            r6.f7719A = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ch0.<init>(android.content.Context):void");
    }

    /* renamed from: b */
    private static ResolveInfo m10933b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            C4409t.m29325q().mo15126t(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    /* renamed from: c */
    private final void m10934c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f7722a = audioManager.getMode();
                this.f7723b = audioManager.isMusicActive();
                this.f7724c = audioManager.isSpeakerphoneOn();
                this.f7725d = audioManager.getStreamVolume(3);
                this.f7726e = audioManager.getRingerMode();
                this.f7727f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                C4409t.m29325q().mo15126t(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f7722a = -2;
        this.f7723b = false;
        this.f7724c = false;
        this.f7725d = 0;
        this.f7726e = 2;
        this.f7727f = 0;
    }

    /* renamed from: d */
    private final void m10935d(Context context) {
        Intent intent;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14291E8)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            intent = context.registerReceiver((BroadcastReceiver) null, intentFilter);
        } else {
            intent = context.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
        }
        boolean z = false;
        if (intent != null) {
            int intExtra = intent.getIntExtra("status", -1);
            this.f7734m = (double) (((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.f7735n = z;
            return;
        }
        this.f7734m = -1.0d;
        this.f7735n = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0050  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10936e(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.f7728g = r2
            boolean r2 = p067i5.C4699m.m30421l()
            r3 = 0
            if (r2 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.ez r2 = com.google.android.gms.internal.ads.C2679nz.f14635n7
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()
            java.lang.Object r2 = r4.mo12227b(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0031
            r2 = 0
            goto L_0x0035
        L_0x0031:
            int r2 = r0.getNetworkType()
        L_0x0035:
            r5.f7730i = r2
            int r0 = r0.getPhoneType()
            r5.f7731j = r0
            r0 = -2
            r5.f7729h = r0
            r5.f7732k = r3
            r0 = -1
            r5.f7733l = r0
            p053g4.C4409t.m29326r()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = p073j4.C4751b2.m30603U(r6, r2)
            if (r6 == 0) goto L_0x006f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L_0x0067
            int r0 = r6.getType()
            r5.f7729h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.f7733l = r6
            goto L_0x0069
        L_0x0067:
            r5.f7729h = r0
        L_0x0069:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.f7732k = r6
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ch0.m10936e(android.content.Context):void");
    }

    /* renamed from: a */
    public final dh0 mo9166a() {
        return new dh0(this.f7722a, this.f7738q, this.f7739r, this.f7728g, this.f7740s, this.f7741t, this.f7742u, this.f7743v, this.f7723b, this.f7724c, this.f7744w, this.f7745x, this.f7720B, this.f7725d, this.f7729h, this.f7730i, this.f7731j, this.f7726e, this.f7727f, this.f7746y, this.f7747z, this.f7719A, this.f7734m, this.f7735n, this.f7732k, this.f7733l, this.f7736o, this.f7721C, this.f7737p);
    }

    public ch0(Context context, dh0 dh0) {
        C2679nz.m17343c(context);
        m10934c(context);
        m10936e(context);
        m10935d(context);
        this.f7736o = Build.FINGERPRINT;
        this.f7737p = Build.DEVICE;
        this.f7721C = m00.m16334g(context);
        this.f7738q = dh0.f8256a;
        this.f7739r = dh0.f8257b;
        this.f7740s = dh0.f8259d;
        this.f7741t = dh0.f8260e;
        this.f7742u = dh0.f8261f;
        this.f7743v = dh0.f8262g;
        this.f7744w = dh0.f8263h;
        this.f7745x = dh0.f8264i;
        this.f7720B = dh0.f8265j;
        this.f7746y = dh0.f8268m;
        this.f7747z = dh0.f8269n;
        this.f7719A = dh0.f8270o;
    }
}
