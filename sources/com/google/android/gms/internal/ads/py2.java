package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Iterator;
import p053g4.C4409t;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class py2 implements ny2 {

    /* renamed from: a */
    private final Context f16081a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f16082b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f16083c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f16084d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f16085e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f16086f = "";
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f16087g = "";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f16088h = "";
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f16089i = "";

    /* renamed from: j */
    private boolean f16090j = false;

    /* renamed from: k */
    private boolean f16091k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f16092l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f16093m = 2;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f16094n = 2;

    py2(Context context, int i) {
        this.f16081a = context;
        this.f16092l = i;
    }

    /* renamed from: G */
    public final /* bridge */ /* synthetic */ ny2 mo11826G(boolean z) {
        mo13431o(z);
        return this;
    }

    /* renamed from: H */
    public final /* bridge */ /* synthetic */ ny2 mo11827H(int i) {
        mo13426b(i);
        return this;
    }

    /* renamed from: T */
    public final /* bridge */ /* synthetic */ ny2 mo11828T() {
        mo13432p();
        return this;
    }

    /* renamed from: U */
    public final synchronized boolean mo11829U() {
        return this.f16091k;
    }

    /* renamed from: V */
    public final boolean mo11830V() {
        return !TextUtils.isEmpty(this.f16088h);
    }

    /* renamed from: W */
    public final synchronized ry2 mo11831W() {
        if (this.f16090j) {
            return null;
        }
        this.f16090j = true;
        if (!this.f16091k) {
            mo13432p();
        }
        if (this.f16083c < 0) {
            mo13433q();
        }
        return new ry2(this, (qy2) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ ny2 mo11832a(ts2 ts2) {
        mo13428l(ts2);
        return this;
    }

    /* renamed from: b */
    public final synchronized py2 mo13426b(int i) {
        this.f16093m = i;
        return this;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ ny2 mo11833c() {
        mo13433q();
        return this;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ ny2 mo11834g(C4623z2 z2Var) {
        mo13427k(z2Var);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return r2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.py2 mo13427k(p060h4.C4623z2 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.IBinder r3 = r3.f25066e     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0007
            monitor-exit(r2)
            return r2
        L_0x0007:
            com.google.android.gms.internal.ads.o91 r3 = (com.google.android.gms.internal.ads.o91) r3     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r3.mo12864X()     // Catch:{ all -> 0x0023 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x0015
            r2.f16086f = r0     // Catch:{ all -> 0x0023 }
        L_0x0015:
            java.lang.String r3 = r3.mo12862V()     // Catch:{ all -> 0x0023 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0023 }
            if (r0 != 0) goto L_0x0021
            r2.f16087g = r3     // Catch:{ all -> 0x0023 }
        L_0x0021:
            monitor-exit(r2)
            return r2
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.py2.mo13427k(h4.z2):com.google.android.gms.internal.ads.py2");
    }

    /* renamed from: l */
    public final synchronized py2 mo13428l(ts2 ts2) {
        if (!TextUtils.isEmpty(ts2.f18244b.f12930b)) {
            this.f16086f = ts2.f18244b.f12930b;
        }
        Iterator it = ts2.f18243a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            is2 is2 = (is2) it.next();
            if (!TextUtils.isEmpty(is2.f10973c0)) {
                this.f16087g = is2.f10973c0;
                break;
            }
        }
        return this;
    }

    /* renamed from: m */
    public final synchronized py2 mo13429m(String str) {
        this.f16088h = str;
        return this;
    }

    /* renamed from: n */
    public final synchronized py2 mo13430n(String str) {
        this.f16089i = str;
        return this;
    }

    /* renamed from: o */
    public final synchronized py2 mo13431o(boolean z) {
        this.f16084d = z;
        return this;
    }

    /* renamed from: p */
    public final synchronized py2 mo13432p() {
        this.f16085e = C4409t.m29327s().mo18428j(this.f16081a);
        Resources resources = this.f16081a.getResources();
        int i = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.f16094n = i;
        this.f16082b = C4409t.m29310b().mo18371b();
        this.f16091k = true;
        return this;
    }

    /* renamed from: q */
    public final synchronized py2 mo13433q() {
        this.f16083c = C4409t.m29310b().mo18371b();
        return this;
    }

    /* renamed from: x */
    public final /* bridge */ /* synthetic */ ny2 mo11835x(String str) {
        mo13429m(str);
        return this;
    }

    /* renamed from: z */
    public final /* bridge */ /* synthetic */ ny2 mo11836z(String str) {
        mo13430n(str);
        return this;
    }
}
