package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p033d5.C4141r;
import p053g4.C4409t;
import p060h4.C4532k1;
import p060h4.C4596v;
import p060h4.C4604w1;
import p060h4.C4618y3;
import p073j4.C4751b2;
import p073j4.C4810t;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gz0 extends C4532k1 {

    /* renamed from: a */
    private final Context f10109a;

    /* renamed from: b */
    private final vm0 f10110b;

    /* renamed from: c */
    private final zs1 f10111c;

    /* renamed from: d */
    private final f52 f10112d;

    /* renamed from: e */
    private final jb2 f10113e;

    /* renamed from: f */
    private final kx1 f10114f;

    /* renamed from: g */
    private final sk0 f10115g;

    /* renamed from: h */
    private final et1 f10116h;

    /* renamed from: i */
    private final ey1 f10117i;

    /* renamed from: r */
    private final y10 f10118r;

    /* renamed from: s */
    private final az2 f10119s;

    /* renamed from: t */
    private final xt2 f10120t;

    /* renamed from: u */
    private boolean f10121u = false;

    gz0(Context context, vm0 vm0, zs1 zs1, f52 f52, jb2 jb2, kx1 kx1, sk0 sk0, et1 et1, ey1 ey1, y10 y10, az2 az2, xt2 xt2) {
        this.f10109a = context;
        this.f10110b = vm0;
        this.f10111c = zs1;
        this.f10112d = f52;
        this.f10113e = jb2;
        this.f10114f = kx1;
        this.f10115g = sk0;
        this.f10116h = et1;
        this.f10117i = ey1;
        this.f10118r = y10;
        this.f10119s = az2;
        this.f10120t = xt2;
    }

    /* renamed from: A4 */
    public final void mo10680A4(qb0 qb0) throws RemoteException {
        this.f10120t.mo15245e(qb0);
    }

    /* renamed from: E5 */
    public final void mo10681E5(C4618y3 y3Var) throws RemoteException {
        this.f10115g.mo14039v(this.f10109a, y3Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I6 */
    public final void mo10682I6(Runnable runnable) {
        C4141r.m28216f("Adapters must be initialized on the main thread.");
        Map e = C4409t.m29325q().mo15117h().mo18486U().mo13845e();
        if (!e.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    pm0.m18668h("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.f10111c.mo15658d()) {
                HashMap hashMap = new HashMap();
                for (lb0 lb0 : e.values()) {
                    for (kb0 kb0 : lb0.f12718a) {
                        String str = kb0.f11997k;
                        for (String str2 : kb0.f11989c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        g52 a = this.f10112d.mo10073a(str3, jSONObject);
                        if (a != null) {
                            au2 au2 = (au2) a.f9705b;
                            if (!au2.mo8537a() && au2.mo8536C()) {
                                au2.mo8549m(this.f10109a, (a72) a.f9706c, (List) entry.getValue());
                                pm0.m18662b("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (jt2 e2) {
                        pm0.m18668h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e2);
                    }
                }
            }
        }
    }

    /* renamed from: M */
    public final void mo10683M(String str) {
        this.f10113e.mo11379f(str);
    }

    /* renamed from: Q5 */
    public final synchronized void mo10684Q5(boolean z) {
        C4409t.m29328t().mo18440c(z);
    }

    /* renamed from: S2 */
    public final void mo10685S2(z70 z70) throws RemoteException {
        this.f10114f.mo11810s(z70);
    }

    /* renamed from: T */
    public final String mo10686T() {
        return this.f10110b.f19150a;
    }

    /* renamed from: V */
    public final void mo10687V() {
        this.f10114f.mo11803l();
    }

    /* renamed from: W */
    public final synchronized void mo10688W() {
        if (this.f10121u) {
            pm0.m18667g("Mobile ads is initialized already.");
            return;
        }
        C2679nz.m17343c(this.f10109a);
        C4409t.m29325q().mo15124r(this.f10109a, this.f10110b);
        C4409t.m29313e().mo9353i(this.f10109a);
        this.f10121u = true;
        this.f10114f.mo11809r();
        this.f10113e.mo11377d();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14551f3)).booleanValue()) {
            this.f10116h.mo10008c();
        }
        this.f10117i.mo10036g();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14440T7)).booleanValue()) {
            dn0.f8325a.execute(new cz0(this));
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14261B8)).booleanValue()) {
            dn0.f8325a.execute(new bz0(this));
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14660q2)).booleanValue()) {
            dn0.f8325a.execute(new dz0(this));
        }
    }

    /* renamed from: X5 */
    public final synchronized void mo10689X5(float f) {
        C4409t.m29328t().mo18441d(f);
    }

    /* renamed from: a */
    public final synchronized float mo10690a() {
        return C4409t.m29328t().mo18439a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo10691b() {
        hu2.m14048b(this.f10109a, true);
    }

    /* renamed from: c */
    public final List mo10692c() throws RemoteException {
        return this.f10114f.mo11802g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        return;
     */
    /* renamed from: c6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo10693c6(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            android.content.Context r0 = r7.f10109a     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.C2679nz.m17343c(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x002f
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14541e3     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0031 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0031 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            g4.e r1 = p053g4.C4409t.m29311c()     // Catch:{ all -> 0x0031 }
            android.content.Context r2 = r7.f10109a     // Catch:{ all -> 0x0031 }
            com.google.android.gms.internal.ads.vm0 r3 = r7.f10110b     // Catch:{ all -> 0x0031 }
            r5 = 0
            com.google.android.gms.internal.ads.az2 r6 = r7.f10119s     // Catch:{ all -> 0x0031 }
            r4 = r8
            r1.mo17899a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0031 }
            monitor-exit(r7)
            return
        L_0x002f:
            monitor-exit(r7)
            return
        L_0x0031:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gz0.mo10693c6(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10694d() {
        if (C4409t.m29325q().mo15117h().mo18504i()) {
            if (!C4409t.m29329u().mo18563j(this.f10109a, C4409t.m29325q().mo15117h().mo18491Z(), this.f10110b.f19150a)) {
                C4409t.m29325q().mo15117h().mo18511p(false);
                C4409t.m29325q().mo15117h().mo18500f("");
            }
        }
    }

    /* renamed from: g */
    public final synchronized boolean mo10695g() {
        return C4409t.m29328t().mo18442e();
    }

    /* renamed from: h5 */
    public final void mo10696h5(C4954a aVar, String str) {
        if (aVar == null) {
            pm0.m18664d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C4956b.m31384P0(aVar);
        if (context == null) {
            pm0.m18664d("Context is null. Failed to open debug menu.");
            return;
        }
        C4810t tVar = new C4810t(context);
        tVar.mo18544n(str);
        tVar.mo18545o(this.f10110b.f19150a);
        tVar.mo18548r();
    }

    /* renamed from: i4 */
    public final void mo10697i4(String str, C4954a aVar) {
        String str2;
        ez0 ez0;
        C2679nz.m17343c(this.f10109a);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14571h3)).booleanValue()) {
            C4409t.m29326r();
            str2 = C4751b2.m30594L(this.f10109a);
        } else {
            str2 = "";
        }
        boolean z = true;
        String str3 = true != TextUtils.isEmpty(str2) ? str2 : str;
        if (!TextUtils.isEmpty(str3)) {
            boolean booleanValue = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14541e3)).booleanValue();
            C2344ez ezVar = C2679nz.f14343K0;
            boolean booleanValue2 = booleanValue | ((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue();
            if (((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
                ez0 = new ez0(this, (Runnable) C4956b.m31384P0(aVar));
            } else {
                ez0 = null;
                z = booleanValue2;
            }
            ez0 ez02 = ez0;
            if (z) {
                C4409t.m29311c().mo17899a(this.f10109a, this.f10110b, str3, ez02, this.f10119s);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo10698j() {
        this.f10118r.mo15273a(new fg0());
    }

    /* renamed from: t4 */
    public final void mo10699t4(C4604w1 w1Var) throws RemoteException {
        this.f10117i.mo10037h(w1Var, dy1.API);
    }
}
