package com.google.android.gms.measurement.internal;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import p033d5.C4141r;
import p402y5.C13018a;

/* renamed from: com.google.android.gms.measurement.internal.w2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7537w2 extends C7538w3 {

    /* renamed from: c */
    private String f33137c;

    /* renamed from: d */
    private String f33138d;

    /* renamed from: e */
    private int f33139e;

    /* renamed from: f */
    private String f33140f;

    /* renamed from: g */
    private String f33141g;

    /* renamed from: h */
    private long f33142h;

    /* renamed from: i */
    private final long f33143i;

    /* renamed from: j */
    private List f33144j;

    /* renamed from: k */
    private String f33145k;

    /* renamed from: l */
    private int f33146l;

    /* renamed from: m */
    private String f33147m;

    /* renamed from: n */
    private String f33148n;

    /* renamed from: o */
    private String f33149o;

    /* renamed from: p */
    private long f33150p = 0;

    /* renamed from: q */
    private String f33151q = null;

    C7537w2(C7397j4 j4Var, long j) {
        super(j4Var);
        this.f33143i = j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018b A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0194 A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01bc A[Catch:{ IllegalStateException -> 0x01db }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x024c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24731j() {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.j4 r0 = r11.f32389a
            android.content.Context r0 = r0.mo24121d()
            java.lang.String r0 = r0.getPackageName()
            com.google.android.gms.measurement.internal.j4 r1 = r11.f32389a
            android.content.Context r1 = r1.mo24121d()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r4 = ""
            r5 = 0
            java.lang.String r6 = "unknown"
            if (r1 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24256q()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.mo24209b(r9, r8)
        L_0x0032:
            r8 = r2
            goto L_0x009b
        L_0x0035:
            java.lang.String r6 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x003a }
            goto L_0x004d
        L_0x003a:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24256q()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.mo24209b(r9, r8)
        L_0x004d:
            if (r6 != 0) goto L_0x0052
            java.lang.String r6 = "manual_install"
            goto L_0x005b
        L_0x0052:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x005b
            r6 = r4
        L_0x005b:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.Context r7 = r7.mo24121d()     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0085 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r5)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r7 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0085 }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x0085 }
            if (r9 != 0) goto L_0x007c
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x0085 }
            goto L_0x007d
        L_0x007c:
            r8 = r2
        L_0x007d:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0082 }
            int r3 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0082 }
            goto L_0x009b
        L_0x0082:
            r7 = r2
            r2 = r8
            goto L_0x0086
        L_0x0085:
            r7 = r2
        L_0x0086:
            com.google.android.gms.measurement.internal.j4 r8 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r8 = r8.mo24135l()
            com.google.android.gms.measurement.internal.d3 r8 = r8.mo24256q()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.mo24210c(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x009b:
            r11.f33137c = r0
            r11.f33140f = r6
            r11.f33138d = r2
            r11.f33139e = r3
            r11.f33141g = r8
            r2 = 0
            r11.f33142h = r2
            com.google.android.gms.measurement.internal.j4 r2 = r11.f32389a
            java.lang.String r2 = r2.mo24424O()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r3 = 1
            if (r2 != 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.j4 r2 = r11.f32389a
            java.lang.String r2 = r2.mo24425P()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00c6
            r2 = 1
            goto L_0x00c7
        L_0x00c6:
            r2 = 0
        L_0x00c7:
            com.google.android.gms.measurement.internal.j4 r6 = r11.f32389a
            int r6 = r6.mo24441x()
            switch(r6) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0141;
                case 2: goto L_0x0131;
                case 3: goto L_0x0121;
                case 4: goto L_0x0111;
                case 5: goto L_0x0101;
                case 6: goto L_0x00f1;
                case 7: goto L_0x00e1;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24259u()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            r7.mo24208a(r8)
            goto L_0x0160
        L_0x00e1:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24259u()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            r7.mo24208a(r8)
            goto L_0x0160
        L_0x00f1:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24262x()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r7.mo24208a(r8)
            goto L_0x0160
        L_0x0101:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24260v()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            r7.mo24208a(r8)
            goto L_0x0160
        L_0x0111:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24259u()
            java.lang.String r8 = "App measurement disabled via the manifest"
            r7.mo24208a(r8)
            goto L_0x0160
        L_0x0121:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24259u()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r7.mo24208a(r8)
            goto L_0x0160
        L_0x0131:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24260v()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            r7.mo24208a(r8)
            goto L_0x0160
        L_0x0141:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24259u()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            r7.mo24208a(r8)
            goto L_0x0160
        L_0x0151:
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r7 = r7.mo24135l()
            com.google.android.gms.measurement.internal.d3 r7 = r7.mo24260v()
            java.lang.String r8 = "App measurement collection enabled"
            r7.mo24208a(r8)
        L_0x0160:
            r11.f33147m = r4
            r11.f33148n = r4
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a
            r7.mo24118b()
            if (r2 == 0) goto L_0x0173
            com.google.android.gms.measurement.internal.j4 r2 = r11.f32389a
            java.lang.String r2 = r2.mo24424O()
            r11.f33148n = r2
        L_0x0173:
            com.google.android.gms.measurement.internal.j4 r2 = r11.f32389a     // Catch:{ IllegalStateException -> 0x01db }
            android.content.Context r2 = r2.mo24121d()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.j4 r7 = r11.f32389a     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r7 = r7.mo24427R()     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r8 = "google_app_id"
            java.lang.String r2 = p402y5.C13046x.m61372b(r2, r8, r7)     // Catch:{ IllegalStateException -> 0x01db }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01db }
            if (r3 == r7) goto L_0x018c
            r4 = r2
        L_0x018c:
            r11.f33147m = r4     // Catch:{ IllegalStateException -> 0x01db }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x01db }
            if (r2 != 0) goto L_0x01ba
            com.google.android.gms.measurement.internal.j4 r2 = r11.f32389a     // Catch:{ IllegalStateException -> 0x01db }
            android.content.Context r2 = r2.mo24121d()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.j4 r3 = r11.f32389a     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r3 = r3.mo24427R()     // Catch:{ IllegalStateException -> 0x01db }
            p033d5.C4141r.m28221k(r2)     // Catch:{ IllegalStateException -> 0x01db }
            android.content.res.Resources r4 = r2.getResources()     // Catch:{ IllegalStateException -> 0x01db }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalStateException -> 0x01db }
            if (r7 != 0) goto L_0x01ae
            goto L_0x01b2
        L_0x01ae:
            java.lang.String r3 = p402y5.C13035m.m61349a(r2)     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01b2:
            java.lang.String r2 = "admob_app_id"
            java.lang.String r2 = p402y5.C13035m.m61350b(r2, r4, r3)     // Catch:{ IllegalStateException -> 0x01db }
            r11.f33148n = r2     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01ba:
            if (r6 != 0) goto L_0x01ef
            com.google.android.gms.measurement.internal.j4 r2 = r11.f32389a     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.f3 r2 = r2.mo24135l()     // Catch:{ IllegalStateException -> 0x01db }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo24260v()     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r4 = r11.f33137c     // Catch:{ IllegalStateException -> 0x01db }
            java.lang.String r6 = r11.f33147m     // Catch:{ IllegalStateException -> 0x01db }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ IllegalStateException -> 0x01db }
            if (r6 == 0) goto L_0x01d5
            java.lang.String r6 = r11.f33148n     // Catch:{ IllegalStateException -> 0x01db }
            goto L_0x01d7
        L_0x01d5:
            java.lang.String r6 = r11.f33147m     // Catch:{ IllegalStateException -> 0x01db }
        L_0x01d7:
            r2.mo24210c(r3, r4, r6)     // Catch:{ IllegalStateException -> 0x01db }
            goto L_0x01ef
        L_0x01db:
            r2 = move-exception
            com.google.android.gms.measurement.internal.j4 r3 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24256q()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C7352f3.m41475z(r0)
            java.lang.String r4 = "Fetching Google App Id failed with exception. appId"
            r3.mo24210c(r4, r0, r2)
        L_0x01ef:
            r0 = 0
            r11.f33144j = r0
            com.google.android.gms.measurement.internal.j4 r0 = r11.f32389a
            r0.mo24118b()
            com.google.android.gms.measurement.internal.j4 r0 = r11.f32389a
            com.google.android.gms.measurement.internal.h r0 = r0.mo24443z()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.mo24300y(r2)
            if (r0 != 0) goto L_0x0206
            goto L_0x023b
        L_0x0206:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x021c
            com.google.android.gms.measurement.internal.j4 r0 = r11.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24262x()
            java.lang.String r2 = "Safelisted event list is empty. Ignoring"
            r0.mo24208a(r2)
            goto L_0x023d
        L_0x021c:
            java.util.Iterator r2 = r0.iterator()
        L_0x0220:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x023b
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.j4 r4 = r11.f32389a
            com.google.android.gms.measurement.internal.i9 r4 = r4.mo24423N()
            java.lang.String r6 = "safelisted event"
            boolean r3 = r4.mo24380Q(r6, r3)
            if (r3 != 0) goto L_0x0220
            goto L_0x023d
        L_0x023b:
            r11.f33144j = r0
        L_0x023d:
            if (r1 == 0) goto L_0x024c
            com.google.android.gms.measurement.internal.j4 r0 = r11.f32389a
            android.content.Context r0 = r0.mo24121d()
            boolean r0 = p081k5.C4886a.m31066a(r0)
            r11.f33146l = r0
            return
        L_0x024c:
            r11.f33146l = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7537w2.mo24731j():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo24349m() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final int mo24732n() {
        mo24741g();
        return this.f33146l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo24733o() {
        mo24741g();
        return this.f33139e;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x026e  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.C7446n9 mo24734p(java.lang.String r37) {
        /*
            r36 = this;
            r1 = r36
            r36.mo24189f()
            com.google.android.gms.measurement.internal.n9 r33 = new com.google.android.gms.measurement.internal.n9
            java.lang.String r3 = r36.mo24736r()
            java.lang.String r4 = r36.mo24737t()
            r36.mo24741g()
            java.lang.String r5 = r1.f33138d
            r36.mo24741g()
            int r0 = r1.f33139e
            long r6 = (long) r0
            r36.mo24741g()
            java.lang.String r0 = r1.f33140f
            p033d5.C4141r.m28221k(r0)
            java.lang.String r8 = r1.f33140f
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a
            com.google.android.gms.measurement.internal.h r0 = r0.mo24443z()
            r0.mo24292p()
            r36.mo24741g()
            r36.mo24189f()
            long r9 = r1.f33142h
            r2 = 0
            r11 = 0
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a
            com.google.android.gms.measurement.internal.i9 r9 = r0.mo24423N()
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a
            android.content.Context r0 = r0.mo24121d()
            com.google.android.gms.measurement.internal.j4 r10 = r1.f32389a
            android.content.Context r10 = r10.mo24121d()
            java.lang.String r10 = r10.getPackageName()
            r9.mo24189f()
            p033d5.C4141r.m28221k(r0)
            p033d5.C4141r.m28217g(r10)
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            java.security.MessageDigest r14 = com.google.android.gms.measurement.internal.C7391i9.m41603t()
            r15 = -1
            if (r14 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.j4 r0 = r9.f32389a
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24256q()
            java.lang.String r9 = "Could not get MD5 instance"
            r0.mo24208a(r9)
        L_0x0076:
            r9 = r15
            goto L_0x00ce
        L_0x0078:
            if (r13 == 0) goto L_0x00cd
            boolean r10 = r9.mo24385V(r0, r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 != 0) goto L_0x00bb
            k5.b r0 = p081k5.C4888c.m31075a(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.j4 r10 = r9.f32389a     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.Context r10 = r10.mo24121d()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ NameNotFoundException -> 0x00bd }
            r13 = 64
            android.content.pm.PackageInfo r0 = r0.mo18673f(r10, r13)     // Catch:{ NameNotFoundException -> 0x00bd }
            android.content.pm.Signature[] r0 = r0.signatures     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r0 == 0) goto L_0x00ab
            int r10 = r0.length     // Catch:{ NameNotFoundException -> 0x00bd }
            if (r10 <= 0) goto L_0x00ab
            r0 = r0[r2]     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r0.toByteArray()     // Catch:{ NameNotFoundException -> 0x00bd }
            byte[] r0 = r14.digest(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            long r9 = com.google.android.gms.measurement.internal.C7391i9.m41602q0(r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            r15 = r9
            goto L_0x0076
        L_0x00ab:
            com.google.android.gms.measurement.internal.j4 r0 = r9.f32389a     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.f3 r0 = r0.mo24135l()     // Catch:{ NameNotFoundException -> 0x00bd }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo24261w()     // Catch:{ NameNotFoundException -> 0x00bd }
            java.lang.String r10 = "Could not get signatures"
            r0.mo24208a(r10)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x0076
        L_0x00bb:
            r15 = r11
            goto L_0x0076
        L_0x00bd:
            r0 = move-exception
            com.google.android.gms.measurement.internal.j4 r9 = r9.f32389a
            com.google.android.gms.measurement.internal.f3 r9 = r9.mo24135l()
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo24256q()
            java.lang.String r10 = "Package name not found"
            r9.mo24209b(r10, r0)
        L_0x00cd:
            r9 = r11
        L_0x00ce:
            r1.f33142h = r9
        L_0x00d0:
            r13 = r9
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a
            boolean r0 = r0.mo24436n()
            com.google.android.gms.measurement.internal.j4 r9 = r1.f32389a
            com.google.android.gms.measurement.internal.s3 r9 = r9.mo24416F()
            boolean r9 = r9.f32959q
            r10 = 1
            r15 = r9 ^ 1
            r36.mo24189f()
            com.google.android.gms.measurement.internal.j4 r9 = r1.f32389a
            boolean r9 = r9.mo24436n()
            r11 = 0
            if (r9 != 0) goto L_0x00f2
        L_0x00ee:
            r20 = r11
            goto L_0x0178
        L_0x00f2:
            com.google.android.gms.internal.measurement.C7112oe.m40539b()
            com.google.android.gms.measurement.internal.j4 r9 = r1.f32389a
            com.google.android.gms.measurement.internal.h r9 = r9.mo24443z()
            com.google.android.gms.measurement.internal.t2 r12 = com.google.android.gms.measurement.internal.C7516u2.f33043c0
            boolean r9 = r9.mo24279B(r11, r12)
            if (r9 == 0) goto L_0x0113
            com.google.android.gms.measurement.internal.j4 r9 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r9 = r9.mo24135l()
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo24260v()
            java.lang.String r12 = "Disabled IID for tests."
            r9.mo24208a(r12)
            goto L_0x00ee
        L_0x0113:
            com.google.android.gms.measurement.internal.j4 r9 = r1.f32389a     // Catch:{ ClassNotFoundException -> 0x0176 }
            android.content.Context r9 = r9.mo24121d()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0176 }
            java.lang.String r12 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r9 = r9.loadClass(r12)     // Catch:{ ClassNotFoundException -> 0x0176 }
            if (r9 != 0) goto L_0x0126
            goto L_0x00ee
        L_0x0126:
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0167 }
            java.lang.Class<android.content.Context> r18 = android.content.Context.class
            r12[r2] = r18     // Catch:{ Exception -> 0x0167 }
            java.lang.String r11 = "getInstance"
            java.lang.reflect.Method r11 = r9.getDeclaredMethod(r11, r12)     // Catch:{ Exception -> 0x0167 }
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.measurement.internal.j4 r10 = r1.f32389a     // Catch:{ Exception -> 0x0167 }
            android.content.Context r10 = r10.mo24121d()     // Catch:{ Exception -> 0x0167 }
            r12[r2] = r10     // Catch:{ Exception -> 0x0167 }
            r10 = 0
            java.lang.Object r11 = r11.invoke(r10, r12)     // Catch:{ Exception -> 0x0167 }
            if (r11 != 0) goto L_0x0144
            goto L_0x0176
        L_0x0144:
            java.lang.String r10 = "getFirebaseInstanceId"
            java.lang.Class[] r12 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r10, r12)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r9 = r9.invoke(r11, r10)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0157 }
            r20 = r9
            goto L_0x0178
        L_0x0157:
            com.google.android.gms.measurement.internal.j4 r9 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r9 = r9.mo24135l()
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo24262x()
            java.lang.String r10 = "Failed to retrieve Firebase Instance Id"
            r9.mo24208a(r10)
            goto L_0x0176
        L_0x0167:
            com.google.android.gms.measurement.internal.j4 r9 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r9 = r9.mo24135l()
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo24263y()
            java.lang.String r10 = "Failed to obtain Firebase Analytics instance"
            r9.mo24208a(r10)
        L_0x0176:
            r20 = 0
        L_0x0178:
            com.google.android.gms.measurement.internal.j4 r9 = r1.f32389a
            com.google.android.gms.measurement.internal.s3 r10 = r9.mo24416F()
            com.google.android.gms.measurement.internal.p3 r10 = r10.f32947e
            long r10 = r10.mo24604a()
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x0190
            long r9 = r9.f32614G
            r12 = r3
            r22 = r9
            goto L_0x0199
        L_0x0190:
            r12 = r3
            long r2 = r9.f32614G
            long r2 = java.lang.Math.min(r2, r10)
            r22 = r2
        L_0x0199:
            r36.mo24741g()
            int r11 = r1.f33146l
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a
            com.google.android.gms.measurement.internal.h r2 = r2.mo24443z()
            boolean r24 = r2.mo24278A()
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo24416F()
            r2.mo24189f()
            android.content.SharedPreferences r2 = r2.mo24642n()
            java.lang.String r3 = "deferred_analytics_collection"
            r9 = 0
            boolean r25 = r2.getBoolean(r3, r9)
            r36.mo24741g()
            java.lang.String r3 = r1.f33148n
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a
            com.google.android.gms.measurement.internal.h r2 = r2.mo24443z()
            java.lang.String r9 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r2 = r2.mo24295t(r9)
            if (r2 != 0) goto L_0x01d2
            r26 = 0
            goto L_0x01de
        L_0x01d2:
            boolean r2 = r2.booleanValue()
            r9 = 1
            r2 = r2 ^ r9
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r26 = r2
        L_0x01de:
            long r9 = r1.f33143i
            java.util.List r2 = r1.f33144j
            r19 = r2
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a
            com.google.android.gms.measurement.internal.s3 r2 = r2.mo24416F()
            y5.b r2 = r2.mo24644p()
            java.lang.String r30 = r2.mo38072h()
            java.lang.String r2 = r1.f33145k
            if (r2 != 0) goto L_0x021b
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a
            com.google.android.gms.measurement.internal.h r2 = r2.mo24443z()
            r21 = r3
            com.google.android.gms.measurement.internal.t2 r3 = com.google.android.gms.measurement.internal.C7516u2.f33073r0
            r27 = r9
            r9 = 0
            boolean r2 = r2.mo24279B(r9, r3)
            if (r2 == 0) goto L_0x0216
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a
            com.google.android.gms.measurement.internal.i9 r2 = r2.mo24423N()
            java.lang.String r2 = r2.mo24396p()
            r1.f33145k = r2
            goto L_0x021f
        L_0x0216:
            java.lang.String r2 = ""
            r1.f33145k = r2
            goto L_0x021f
        L_0x021b:
            r21 = r3
            r27 = r9
        L_0x021f:
            java.lang.String r3 = r1.f33145k
            com.google.android.gms.internal.measurement.C7016ie.m40214b()
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a
            com.google.android.gms.measurement.internal.h r2 = r2.mo24443z()
            com.google.android.gms.measurement.internal.t2 r9 = com.google.android.gms.measurement.internal.C7516u2.f33067o0
            r10 = 0
            boolean r2 = r2.mo24279B(r10, r9)
            if (r2 == 0) goto L_0x026e
            r36.mo24189f()
            long r9 = r1.f33150p
            r16 = 0
            int r2 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x0241
            r16 = r3
            goto L_0x0262
        L_0x0241:
            com.google.android.gms.measurement.internal.j4 r2 = r1.f32389a
            i5.e r2 = r2.mo24116a()
            long r9 = r2.mo18370a()
            r16 = r3
            long r2 = r1.f33150p
            long r9 = r9 - r2
            java.lang.String r2 = r1.f33149o
            if (r2 == 0) goto L_0x0262
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r17 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r17 <= 0) goto L_0x0262
            java.lang.String r2 = r1.f33151q
            if (r2 != 0) goto L_0x0262
            r36.mo24739v()
        L_0x0262:
            java.lang.String r2 = r1.f33149o
            if (r2 != 0) goto L_0x0269
            r36.mo24739v()
        L_0x0269:
            java.lang.String r2 = r1.f33149o
            r32 = r2
            goto L_0x0272
        L_0x026e:
            r16 = r3
            r32 = r10
        L_0x0272:
            r9 = 74029(0x1212d, double:3.6575E-319)
            r17 = 0
            r29 = 0
            r31 = r19
            r2 = r33
            r35 = r16
            r34 = r21
            r3 = r12
            r21 = r11
            r11 = r13
            r13 = r37
            r14 = r0
            r16 = r20
            r19 = r22
            r22 = r24
            r23 = r25
            r24 = r34
            r25 = r26
            r26 = r27
            r28 = r31
            r31 = r35
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (java.lang.String) r8, (long) r9, (long) r11, (java.lang.String) r13, (boolean) r14, (boolean) r15, (java.lang.String) r16, (long) r17, (long) r19, (int) r21, (boolean) r22, (boolean) r23, (java.lang.String) r24, (java.lang.Boolean) r25, (long) r26, (java.util.List) r28, (java.lang.String) r29, (java.lang.String) r30, (java.lang.String) r31, (java.lang.String) r32)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7537w2.mo24734p(java.lang.String):com.google.android.gms.measurement.internal.n9");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final String mo24735q() {
        mo24741g();
        return this.f33148n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final String mo24736r() {
        mo24741g();
        C4141r.m28221k(this.f33137c);
        return this.f33137c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final String mo24737t() {
        mo24189f();
        mo24741g();
        C4141r.m28221k(this.f33147m);
        return this.f33147m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final List mo24738u() {
        return this.f33144j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo24739v() {
        String str;
        mo24189f();
        if (!this.f32389a.mo24416F().mo24644p().mo38074i(C13018a.ANALYTICS_STORAGE)) {
            this.f32389a.mo24135l().mo24255p().mo24208a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            this.f32389a.mo24423N().mo24403u().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        C7330d3 p = this.f32389a.mo24135l().mo24255p();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        p.mo24208a(String.format("Resetting session stitching token to %s", objArr));
        this.f33149o = str;
        this.f33150p = this.f32389a.mo24116a().mo18370a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final boolean mo24740w(String str) {
        String str2 = this.f33151q;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f33151q = str;
        return z;
    }
}
