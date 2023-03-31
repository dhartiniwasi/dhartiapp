package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mu1 implements lx2 {

    /* renamed from: a */
    private final Map f13506a;

    /* renamed from: b */
    private final C2971vu f13507b;

    mu1(C2971vu vuVar, Map map) {
        this.f13506a = map;
        this.f13507b = vuVar;
    }

    /* renamed from: a */
    public final void mo8191a(ex2 ex2, String str) {
        if (this.f13506a.containsKey(ex2)) {
            this.f13507b.mo14820c(((lu1) this.f13506a.get(ex2)).f12954a);
        }
    }

    /* renamed from: d */
    public final void mo8192d(ex2 ex2, String str) {
    }

    /* renamed from: h */
    public final void mo8193h(ex2 ex2, String str) {
        if (this.f13506a.containsKey(ex2)) {
            this.f13507b.mo14820c(((lu1) this.f13506a.get(ex2)).f12955b);
        }
    }

    /* renamed from: k */
    public final void mo8194k(ex2 ex2, String str, Throwable th) {
        if (this.f13506a.containsKey(ex2)) {
            this.f13507b.mo14820c(((lu1) this.f13506a.get(ex2)).f12956c);
        }
    }
}
