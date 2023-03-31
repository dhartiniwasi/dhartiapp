package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import p007a5.C0111g;
import p017b5.C1813o;
import p033d5.C4141r;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.p */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2117p implements C1813o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2097i0 f6262a;

    /* renamed from: b */
    private boolean f6263b = false;

    public C2117p(C2097i0 i0Var) {
        this.f6262a = i0Var;
    }

    /* renamed from: a */
    public final void mo6970a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo6971b() {
        if (this.f6263b) {
            this.f6263b = false;
            this.f6262a.mo8078m(new C2114o(this, this));
        }
    }

    /* renamed from: c */
    public final void mo6972c(C6362b bVar, C2051a<?> aVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo6973d(int i) {
        this.f6262a.mo8077l((C6362b) null);
        this.f6262a.f6221w.mo6999c(i, this.f6263b);
    }

    /* renamed from: e */
    public final void mo6974e() {
    }

    /* renamed from: f */
    public final <A extends C2051a.C2053b, R extends C0111g, T extends C2073b<R, A>> T mo6975f(T t) {
        mo6977h(t);
        return t;
    }

    /* renamed from: g */
    public final boolean mo6976g() {
        if (this.f6263b) {
            return false;
        }
        Set<C2136y0> set = this.f6262a.f6220v.f6172w;
        if (set == null || set.isEmpty()) {
            this.f6262a.mo8077l((C6362b) null);
            return true;
        }
        this.f6263b = true;
        for (C2136y0 f : set) {
            f.mo8124f();
        }
        return false;
    }

    /* renamed from: h */
    public final <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo6977h(T t) {
        try {
            this.f6262a.f6220v.f6173x.mo8023a(t);
            C2087f0 f0Var = this.f6262a.f6220v;
            C2051a.C2060f fVar = f0Var.f6164o.get(t.mo8027r());
            C4141r.m28222l(fVar, "Appropriate Api was not requested.");
            if (fVar.mo6930a() || !this.f6262a.f6213g.containsKey(t.mo8027r())) {
                t.mo8029t(fVar);
            } else {
                t.mo8030v(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f6262a.mo8078m(new C2111n(this, this));
        }
        return t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo8115j() {
        if (this.f6263b) {
            this.f6263b = false;
            this.f6262a.f6220v.f6173x.mo8024b();
            mo6976g();
        }
    }
}
