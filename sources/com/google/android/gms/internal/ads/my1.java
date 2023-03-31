package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4390a;
import p053g4.C4391b;
import p053g4.C4401l;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4596v;
import p060h4.C4604w1;
import p060h4.C4623z2;
import p066i4.C4665e0;
import p066i4.C4679s;
import p066i4.C4680t;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class my1 implements C4680t, iu0 {

    /* renamed from: a */
    private final Context f13720a;

    /* renamed from: b */
    private final vm0 f13721b;

    /* renamed from: c */
    private ey1 f13722c;

    /* renamed from: d */
    private vs0 f13723d;

    /* renamed from: e */
    private boolean f13724e;

    /* renamed from: f */
    private boolean f13725f;

    /* renamed from: g */
    private long f13726g;

    /* renamed from: h */
    private C4604w1 f13727h;

    /* renamed from: i */
    private boolean f13728i;

    my1(Context context, vm0 vm0) {
        this.f13720a = context;
        this.f13721b = vm0;
    }

    /* renamed from: i */
    private final synchronized boolean m16812i(C4604w1 w1Var) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue()) {
            pm0.m18667g("Ad inspector had an internal error.");
            try {
                w1Var.mo8986j4(eu2.m12271d(16, (String) null, (C4623z2) null));
            } catch (RemoteException unused) {
            }
        } else if (this.f13722c == null) {
            pm0.m18667g("Ad inspector had an internal error.");
            try {
                w1Var.mo8986j4(eu2.m12271d(16, (String) null, (C4623z2) null));
            } catch (RemoteException unused2) {
            }
        } else {
            if (!this.f13724e && !this.f13725f) {
                if (C4409t.m29310b().mo18370a() >= this.f13726g + ((long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14320H7)).intValue())) {
                    return true;
                }
            }
            pm0.m18667g("Ad inspector cannot be opened because it is already open.");
            try {
                w1Var.mo8986j4(eu2.m12271d(19, (String) null, (C4623z2) null));
            } catch (RemoteException unused3) {
            }
        }
        return false;
        return false;
        return false;
    }

    /* renamed from: a */
    public final void mo8931a() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|10|11|12|(1:14)|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0025 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10295b(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            if (r4 == 0) goto L_0x0012
            java.lang.String r4 = "Ad inspector loaded."
            p073j4.C4794n1.m30693k(r4)     // Catch:{ all -> 0x002e }
            r3.f13724e = r0     // Catch:{ all -> 0x002e }
            java.lang.String r4 = ""
            r3.mo12471h(r4)     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x0012:
            java.lang.String r4 = "Ad inspector failed to load."
            com.google.android.gms.internal.ads.pm0.m18667g(r4)     // Catch:{ all -> 0x002e }
            h4.w1 r4 = r3.f13727h     // Catch:{ RemoteException -> 0x0025 }
            if (r4 == 0) goto L_0x0025
            r1 = 17
            r2 = 0
            h4.z2 r1 = com.google.android.gms.internal.ads.eu2.m12271d(r1, r2, r2)     // Catch:{ RemoteException -> 0x0025 }
            r4.mo8986j4(r1)     // Catch:{ RemoteException -> 0x0025 }
        L_0x0025:
            r3.f13728i = r0     // Catch:{ all -> 0x002e }
            com.google.android.gms.internal.ads.vs0 r4 = r3.f13723d     // Catch:{ all -> 0x002e }
            r4.destroy()     // Catch:{ all -> 0x002e }
            monitor-exit(r3)
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.my1.mo10295b(boolean):void");
    }

    /* renamed from: c */
    public final Activity mo12467c() {
        vs0 vs0 = this.f13723d;
        if (vs0 == null || vs0.mo12132q1()) {
            return null;
        }
        return this.f13723d.mo8461X();
    }

    /* renamed from: d */
    public final synchronized void mo8932d() {
        this.f13725f = true;
        mo12471h("");
    }

    /* renamed from: e */
    public final void mo12468e(ey1 ey1) {
        this.f13722c = ey1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo12469f(String str) {
        JSONObject e = this.f13722c.mo10034e();
        if (!TextUtils.isEmpty(str)) {
            try {
                e.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f13723d.mo9089k("window.inspectorInfo", e.toString());
    }

    /* renamed from: g */
    public final synchronized void mo12470g(C4604w1 w1Var, f60 f60, r60 r60) {
        C4604w1 w1Var2 = w1Var;
        synchronized (this) {
            if (m16812i(w1Var)) {
                try {
                    C4409t.m29308B();
                    vs0 a = it0.m14546a(this.f13720a, mu0.m16708a(), "", false, false, (C2955ve) null, (n00) null, this.f13721b, (c00) null, (C4401l) null, (C4390a) null, C2971vu.m22435a(), (is2) null, (ls2) null);
                    this.f13723d = a;
                    ku0 f0 = a.mo12108f0();
                    if (f0 == null) {
                        pm0.m18667g("Failed to obtain a web view for the ad inspector");
                        try {
                            w1Var2.mo8986j4(eu2.m12271d(17, "Failed to obtain a web view for the ad inspector", (C4623z2) null));
                        } catch (RemoteException unused) {
                        }
                    } else {
                        this.f13727h = w1Var2;
                        f0.mo9308g0((C4470a) null, (y40) null, (C4680t) null, (a50) null, (C4665e0) null, false, (h60) null, (C4391b) null, (me0) null, (nj0) null, (o42) null, (rz2) null, (gv1) null, (ux2) null, f60, (qh1) null, new x60(this.f13720a), r60);
                        f0.mo9283G(this);
                        this.f13723d.loadUrl((String) C4596v.m30088c().mo12227b(C2679nz.f14300F7));
                        C4409t.m29319k();
                        C4679s.m30352a(this.f13720a, new AdOverlayInfoParcel(this, this.f13723d, 1, this.f13721b), true);
                        this.f13726g = C4409t.m29310b().mo18370a();
                    }
                } catch (ht0 e) {
                    pm0.m18668h("Failed to obtain a web view for the ad inspector", e);
                    try {
                        w1Var2.mo8986j4(eu2.m12271d(17, "Failed to obtain a web view for the ad inspector", (C4623z2) null));
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12471h(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f13724e     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0016
            boolean r0 = r2.f13725f     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            com.google.android.gms.internal.ads.mf3 r0 = com.google.android.gms.internal.ads.dn0.f8329e     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.ads.ly1 r1 = new com.google.android.gms.internal.ads.ly1     // Catch:{ all -> 0x0018 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0018 }
            r0.execute(r1)     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return
        L_0x0016:
            monitor-exit(r2)
            return
        L_0x0018:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.my1.mo12471h(java.lang.String):void");
    }

    /* renamed from: i5 */
    public final void mo8933i5() {
    }

    /* renamed from: o3 */
    public final void mo8934o3() {
    }

    /* renamed from: p */
    public final synchronized void mo8935p(int i) {
        this.f13723d.destroy();
        if (!this.f13728i) {
            C4794n1.m30693k("Inspector closed.");
            C4604w1 w1Var = this.f13727h;
            if (w1Var != null) {
                try {
                    w1Var.mo8986j4((C4623z2) null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f13725f = false;
        this.f13724e = false;
        this.f13726g = 0;
        this.f13728i = false;
        this.f13727h = null;
    }

    /* renamed from: r6 */
    public final void mo8936r6() {
    }
}
