package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.y9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7267y9 extends C6894ba {
    /* synthetic */ C7267y9(C7251x9 x9Var) {
        super((C7283z9) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo23128a(Object obj, long j) {
        ((C7091n9) C6879ac.m39545k(obj, j)).mo23697d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23129b(Object obj, Object obj2, long j) {
        C7091n9 n9Var = (C7091n9) C6879ac.m39545k(obj, j);
        C7091n9 n9Var2 = (C7091n9) C6879ac.m39545k(obj2, j);
        int size = n9Var.size();
        int size2 = n9Var2.size();
        if (size > 0 && size2 > 0) {
            if (!n9Var.mo23698e()) {
                n9Var = n9Var.mo23012h(size2 + size);
            }
            n9Var.addAll(n9Var2);
        }
        if (size > 0) {
            n9Var2 = n9Var;
        }
        C6879ac.m39558x(obj, j, n9Var2);
    }
}
