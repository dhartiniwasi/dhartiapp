package p060h4;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.a80;
import com.google.android.gms.internal.ads.b80;
import com.google.android.gms.internal.ads.jb0;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.s70;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p033d5.C4141r;
import p046f4.C4279a;
import p046f4.C4281b;
import p046f4.C4282c;
import p088l5.C4956b;
import p179z3.C6325c;
import p179z3.C6347q;
import p179z3.C6351u;

/* renamed from: h4.d3 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4492d3 {

    /* renamed from: i */
    private static C4492d3 f24826i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f24827a = new Object();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ArrayList f24828b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f24829c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f24830d = false;

    /* renamed from: e */
    private final Object f24831e = new Object();

    /* renamed from: f */
    private C4538l1 f24832f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6347q f24833g = null;

    /* renamed from: h */
    private C6351u f24834h = new C6351u.C6352a().mo21721a();

    private C4492d3() {
    }

    /* renamed from: e */
    public static C4492d3 m29601e() {
        C4492d3 d3Var;
        synchronized (C4492d3.class) {
            if (f24826i == null) {
                f24826i = new C4492d3();
            }
            d3Var = f24826i;
        }
        return d3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static C4281b m29606s(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s70 s70 = (s70) it.next();
            hashMap.put(s70.f17285a, new a80(s70.f17286b ? C4279a.C4280a.READY : C4279a.C4280a.NOT_READY, s70.f17288d, s70.f17287c));
        }
        return new b80(hashMap);
    }

    /* renamed from: t */
    private final void m29607t(Context context, String str, C4282c cVar) {
        try {
            jb0.m14797a().mo11374b(context, (String) null);
            this.f24832f.mo10688W();
            this.f24832f.mo10697i4((String) null, C4956b.m31385o3(null));
        } catch (RemoteException e) {
            pm0.m18668h("MobileAdsSettingManager initialization failed", e);
        }
    }

    /* renamed from: u */
    private final void m29608u(Context context) {
        if (this.f24832f == null) {
            this.f24832f = (C4538l1) new C4548n(C4584t.m30035a(), context).mo18139d(context, false);
        }
    }

    /* renamed from: v */
    private final void m29609v(C6351u uVar) {
        try {
            this.f24832f.mo10681E5(new C4618y3(uVar));
        } catch (RemoteException e) {
            pm0.m18665e("Unable to set request configuration parcel.", e);
        }
    }

    /* renamed from: b */
    public final C6351u mo18027b() {
        return this.f24834h;
    }

    /* renamed from: d */
    public final C4281b mo18028d() {
        C4281b s;
        synchronized (this.f24831e) {
            C4141r.m28225o(this.f24832f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            try {
                s = m29606s(this.f24832f.mo10692c());
            } catch (RemoteException unused) {
                pm0.m18664d("Unable to get Initialization status.");
                return new C4593u2(this);
            }
        }
        return s;
    }

    /* renamed from: j */
    public final void mo18029j(Context context) {
        synchronized (this.f24831e) {
            m29608u(context);
            try {
                this.f24832f.mo10687V();
            } catch (RemoteException unused) {
                pm0.m18664d("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        if (r4 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r5 = r3.f24831e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        m29608u(r4);
        r3.f24832f.mo10685S2(new p060h4.C4486c3(r3, (p060h4.C4480b3) null));
        r3.f24832f.mo10680A4(new com.google.android.gms.internal.ads.nb0());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r3.f24834h.mo21717b() != -1) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r3.f24834h.mo21718c() == -1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        m29609v(r3.f24834h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        com.google.android.gms.internal.ads.pm0.m18668h("MobileAdsSettingManager initialization failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        throw new java.lang.IllegalArgumentException("Context cannot be null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18030k(android.content.Context r4, java.lang.String r5, p046f4.C4282c r6) {
        /*
            r3 = this;
            java.lang.Object r5 = r3.f24827a
            monitor-enter(r5)
            boolean r0 = r3.f24829c     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0010
            if (r6 == 0) goto L_0x000e
            java.util.ArrayList r4 = r3.f24828b     // Catch:{ all -> 0x00d8 }
            r4.add(r6)     // Catch:{ all -> 0x00d8 }
        L_0x000e:
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            return
        L_0x0010:
            boolean r0 = r3.f24830d     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x001f
            if (r6 == 0) goto L_0x001d
            f4.b r4 = r3.mo18028d()     // Catch:{ all -> 0x00d8 }
            r6.mo17708a(r4)     // Catch:{ all -> 0x00d8 }
        L_0x001d:
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            return
        L_0x001f:
            r0 = 1
            r3.f24829c = r0     // Catch:{ all -> 0x00d8 }
            if (r6 == 0) goto L_0x0029
            java.util.ArrayList r0 = r3.f24828b     // Catch:{ all -> 0x00d8 }
            r0.add(r6)     // Catch:{ all -> 0x00d8 }
        L_0x0029:
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r5 = r3.f24831e
            monitor-enter(r5)
            r0 = 0
            r3.m29608u(r4)     // Catch:{ RemoteException -> 0x0060 }
            h4.l1 r1 = r3.f24832f     // Catch:{ RemoteException -> 0x0060 }
            h4.c3 r2 = new h4.c3     // Catch:{ RemoteException -> 0x0060 }
            r2.<init>(r3, r0)     // Catch:{ RemoteException -> 0x0060 }
            r1.mo10685S2(r2)     // Catch:{ RemoteException -> 0x0060 }
            h4.l1 r1 = r3.f24832f     // Catch:{ RemoteException -> 0x0060 }
            com.google.android.gms.internal.ads.nb0 r2 = new com.google.android.gms.internal.ads.nb0     // Catch:{ RemoteException -> 0x0060 }
            r2.<init>()     // Catch:{ RemoteException -> 0x0060 }
            r1.mo10680A4(r2)     // Catch:{ RemoteException -> 0x0060 }
            z3.u r1 = r3.f24834h     // Catch:{ RemoteException -> 0x0060 }
            int r1 = r1.mo21717b()     // Catch:{ RemoteException -> 0x0060 }
            r2 = -1
            if (r1 != r2) goto L_0x0058
            z3.u r1 = r3.f24834h     // Catch:{ RemoteException -> 0x0060 }
            int r1 = r1.mo21718c()     // Catch:{ RemoteException -> 0x0060 }
            if (r1 == r2) goto L_0x0066
        L_0x0058:
            z3.u r1 = r3.f24834h     // Catch:{ RemoteException -> 0x0060 }
            r3.m29609v(r1)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0066
        L_0x005e:
            r4 = move-exception
            goto L_0x00ce
        L_0x0060:
            r1 = move-exception
            java.lang.String r2 = "MobileAdsSettingManager initialization failed"
            com.google.android.gms.internal.ads.pm0.m18668h(r2, r1)     // Catch:{ all -> 0x005e }
        L_0x0066:
            com.google.android.gms.internal.ads.C2679nz.m17343c(r4)     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.q00 r1 = com.google.android.gms.internal.ads.c10.f7555a     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r1.mo13438e()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0099
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14361L8     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo12227b(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0099
            java.lang.String r1 = "Initializing on bg thread"
            com.google.android.gms.internal.ads.pm0.m18662b(r1)     // Catch:{ all -> 0x005e }
            java.util.concurrent.ThreadPoolExecutor r1 = com.google.android.gms.internal.ads.em0.f8845a     // Catch:{ all -> 0x005e }
            h4.v2 r2 = new h4.v2     // Catch:{ all -> 0x005e }
            r2.<init>(r3, r4, r0, r6)     // Catch:{ all -> 0x005e }
            r1.execute(r2)     // Catch:{ all -> 0x005e }
            goto L_0x00cc
        L_0x0099:
            com.google.android.gms.internal.ads.q00 r1 = com.google.android.gms.internal.ads.c10.f7556b     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r1.mo13438e()     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x00c4
            com.google.android.gms.internal.ads.ez r1 = com.google.android.gms.internal.ads.C2679nz.f14361L8     // Catch:{ all -> 0x005e }
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x005e }
            java.lang.Object r1 = r2.mo12227b(r1)     // Catch:{ all -> 0x005e }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x005e }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x00c4
            java.util.concurrent.ExecutorService r1 = com.google.android.gms.internal.ads.em0.f8846b     // Catch:{ all -> 0x005e }
            h4.w2 r2 = new h4.w2     // Catch:{ all -> 0x005e }
            r2.<init>(r3, r4, r0, r6)     // Catch:{ all -> 0x005e }
            r1.execute(r2)     // Catch:{ all -> 0x005e }
            goto L_0x00cc
        L_0x00c4:
            java.lang.String r1 = "Initializing on calling thread"
            com.google.android.gms.internal.ads.pm0.m18662b(r1)     // Catch:{ all -> 0x005e }
            r3.m29607t(r4, r0, r6)     // Catch:{ all -> 0x005e }
        L_0x00cc:
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            return
        L_0x00ce:
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            throw r4
        L_0x00d0:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Context cannot be null."
            r4.<init>(r5)
            throw r4
        L_0x00d8:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d8 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4492d3.mo18030k(android.content.Context, java.lang.String, f4.c):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo18031l(Context context, String str, C4282c cVar) {
        synchronized (this.f24831e) {
            m29607t(context, (String) null, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo18032m(Context context, String str, C4282c cVar) {
        synchronized (this.f24831e) {
            m29607t(context, (String) null, cVar);
        }
    }

    /* renamed from: n */
    public final void mo18033n(Context context, C6347q qVar) {
        synchronized (this.f24831e) {
            m29608u(context);
            this.f24833g = qVar;
            try {
                this.f24832f.mo10699t4(new C4474a3((C4617y2) null));
            } catch (RemoteException unused) {
                pm0.m18664d("Unable to open the ad inspector.");
                if (qVar != null) {
                    qVar.mo21714a(new C6325c(0, "Ad inspector had an internal error.", "com.google.android.gms.ads"));
                }
            }
        }
    }

    /* renamed from: o */
    public final void mo18034o(Context context, String str) {
        synchronized (this.f24831e) {
            C4141r.m28225o(this.f24832f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f24832f.mo10696h5(C4956b.m31385o3(context), str);
            } catch (RemoteException e) {
                pm0.m18665e("Unable to open debug menu.", e);
            }
        }
    }

    /* renamed from: p */
    public final void mo18035p(boolean z) {
        synchronized (this.f24831e) {
            C4141r.m28225o(this.f24832f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f24832f.mo10684Q5(z);
            } catch (RemoteException e) {
                pm0.m18665e("Unable to set app mute state.", e);
            }
        }
    }

    /* renamed from: q */
    public final void mo18036q(float f) {
        boolean z = true;
        C4141r.m28212b(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f24831e) {
            if (this.f24832f == null) {
                z = false;
            }
            C4141r.m28225o(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f24832f.mo10689X5(f);
            } catch (RemoteException e) {
                pm0.m18665e("Unable to set app volume.", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18037r(p179z3.C6351u r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0004
            r0 = 1
            goto L_0x0005
        L_0x0004:
            r0 = 0
        L_0x0005:
            java.lang.String r1 = "Null passed to setRequestConfiguration."
            p033d5.C4141r.m28212b(r0, r1)
            java.lang.Object r0 = r4.f24831e
            monitor-enter(r0)
            z3.u r1 = r4.f24834h     // Catch:{ all -> 0x0030 }
            r4.f24834h = r5     // Catch:{ all -> 0x0030 }
            h4.l1 r2 = r4.f24832f     // Catch:{ all -> 0x0030 }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0017:
            int r2 = r1.mo21717b()     // Catch:{ all -> 0x0030 }
            int r3 = r5.mo21717b()     // Catch:{ all -> 0x0030 }
            if (r2 != r3) goto L_0x002b
            int r1 = r1.mo21718c()     // Catch:{ all -> 0x0030 }
            int r2 = r5.mo21718c()     // Catch:{ all -> 0x0030 }
            if (r1 == r2) goto L_0x002e
        L_0x002b:
            r4.m29609v(r5)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p060h4.C4492d3.mo18037r(z3.u):void");
    }
}
