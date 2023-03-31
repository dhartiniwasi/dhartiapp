package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yl0 {

    /* renamed from: a */
    long f20669a = -1;

    /* renamed from: b */
    long f20670b = -1;

    /* renamed from: c */
    int f20671c = -1;

    /* renamed from: d */
    int f20672d = -1;

    /* renamed from: e */
    long f20673e = 0;

    /* renamed from: f */
    private final Object f20674f = new Object();

    /* renamed from: g */
    final String f20675g;

    /* renamed from: h */
    private final C4800p1 f20676h;

    /* renamed from: i */
    int f20677i = 0;

    /* renamed from: j */
    int f20678j = 0;

    public yl0(String str, C4800p1 p1Var) {
        this.f20675g = str;
        this.f20676h = p1Var;
    }

    /* renamed from: g */
    private final void m24027g() {
        if (((Boolean) k10.f11863a.mo13438e()).booleanValue()) {
            synchronized (this.f20674f) {
                this.f20671c--;
                this.f20672d--;
            }
        }
    }

    /* renamed from: a */
    public final Bundle mo15448a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f20674f) {
            bundle = new Bundle();
            if (!this.f20676h.mo18501f0()) {
                bundle.putString("session_id", this.f20675g);
            }
            bundle.putLong("basets", this.f20670b);
            bundle.putLong("currts", this.f20669a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f20671c);
            bundle.putInt("preqs_in_session", this.f20672d);
            bundle.putLong("time_in_session", this.f20673e);
            bundle.putInt("pclick", this.f20677i);
            bundle.putInt("pimp", this.f20678j);
            Context a = mh0.m16529a(context);
            int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            boolean z = false;
            if (identifier == 0) {
                pm0.m18666f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                        z = true;
                    } else {
                        pm0.m18666f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    pm0.m18667g("Fail to fetch AdActivity theme");
                    pm0.m18666f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo15449b() {
        synchronized (this.f20674f) {
            this.f20677i++;
        }
    }

    /* renamed from: c */
    public final void mo15450c() {
        synchronized (this.f20674f) {
            this.f20678j++;
        }
    }

    /* renamed from: d */
    public final void mo15451d() {
        m24027g();
    }

    /* renamed from: e */
    public final void mo15452e() {
        m24027g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15453f(p060h4.C4541l4 r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f20674f
            monitor-enter(r0)
            j4.p1 r1 = r10.f20676h     // Catch:{ all -> 0x0074 }
            long r1 = r1.mo18493b()     // Catch:{ all -> 0x0074 }
            i5.e r3 = p053g4.C4409t.m29310b()     // Catch:{ all -> 0x0074 }
            long r3 = r3.mo18370a()     // Catch:{ all -> 0x0074 }
            long r5 = r10.f20670b     // Catch:{ all -> 0x0074 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.ez r5 = com.google.android.gms.internal.ads.C2679nz.f14373N0     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.ads.lz r6 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0074 }
            java.lang.Object r5 = r6.mo12227b(r5)     // Catch:{ all -> 0x0074 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0074 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0074 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f20672d = r1     // Catch:{ all -> 0x0074 }
            goto L_0x003b
        L_0x0033:
            j4.p1 r1 = r10.f20676h     // Catch:{ all -> 0x0074 }
            int r1 = r1.mo18499e()     // Catch:{ all -> 0x0074 }
            r10.f20672d = r1     // Catch:{ all -> 0x0074 }
        L_0x003b:
            r10.f20670b = r12     // Catch:{ all -> 0x0074 }
            r10.f20669a = r12     // Catch:{ all -> 0x0074 }
            goto L_0x0042
        L_0x0040:
            r10.f20669a = r12     // Catch:{ all -> 0x0074 }
        L_0x0042:
            android.os.Bundle r11 = r11.f24891c     // Catch:{ all -> 0x0074 }
            r12 = 1
            if (r11 == 0) goto L_0x0053
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0074 }
            if (r11 == r12) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0053:
            int r11 = r10.f20671c     // Catch:{ all -> 0x0074 }
            int r11 = r11 + r12
            r10.f20671c = r11     // Catch:{ all -> 0x0074 }
            int r11 = r10.f20672d     // Catch:{ all -> 0x0074 }
            int r11 = r11 + r12
            r10.f20672d = r11     // Catch:{ all -> 0x0074 }
            if (r11 != 0) goto L_0x0069
            r11 = 0
            r10.f20673e = r11     // Catch:{ all -> 0x0074 }
            j4.p1 r11 = r10.f20676h     // Catch:{ all -> 0x0074 }
            r11.mo18521z(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x0069:
            j4.p1 r11 = r10.f20676h     // Catch:{ all -> 0x0074 }
            long r11 = r11.mo18492a()     // Catch:{ all -> 0x0074 }
            long r3 = r3 - r11
            r10.f20673e = r3     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            return
        L_0x0074:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0074 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yl0.mo15453f(h4.l4, long):void");
    }
}
