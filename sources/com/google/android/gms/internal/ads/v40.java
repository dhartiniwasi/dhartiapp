package com.google.android.gms.internal.ads;

import p023c4.C1865f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class v40 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1865f.C1867b f18910a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1865f.C1866a f18911b;

    /* renamed from: c */
    private C1865f f18912c;

    public v40(C1865f.C1867b bVar, C1865f.C1866a aVar) {
        this.f18910a = bVar;
        this.f18911b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final synchronized C1865f m21972f(j30 j30) {
        C1865f fVar = this.f18912c;
        if (fVar != null) {
            return fVar;
        }
        k30 k30 = new k30(j30);
        this.f18912c = k30;
        return k30;
    }

    /* renamed from: d */
    public final u30 mo14670d() {
        if (this.f18911b == null) {
            return null;
        }
        return new s40(this, (r40) null);
    }

    /* renamed from: e */
    public final x30 mo14671e() {
        return new u40(this, (t40) null);
    }
}
