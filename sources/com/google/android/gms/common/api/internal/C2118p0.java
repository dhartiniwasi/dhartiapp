package com.google.android.gms.common.api.internal;

import p017b5.C1787b;
import p017b5.C1819r;
import p033d5.C4133p;
import p180z4.C6366d;

/* renamed from: com.google.android.gms.common.api.internal.p0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2118p0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1787b<?> f6264a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6366d f6265b;

    /* synthetic */ C2118p0(C1787b bVar, C6366d dVar, C1819r rVar) {
        this.f6264a = bVar;
        this.f6265b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2118p0)) {
            C2118p0 p0Var = (C2118p0) obj;
            if (!C4133p.m28193a(this.f6264a, p0Var.f6264a) || !C4133p.m28193a(this.f6265b, p0Var.f6265b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C4133p.m28194b(this.f6264a, this.f6265b);
    }

    public final String toString() {
        return C4133p.m28195c(this).mo17442a("key", this.f6264a).mo17442a("feature", this.f6265b).toString();
    }
}
