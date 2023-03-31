package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class mp2 implements q73 {

    /* renamed from: a */
    final /* synthetic */ qp2 f13447a;

    mp2(qp2 qp2) {
        this.f13447a = qp2;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        pm0.m18665e("", (g12) obj);
        C4794n1.m30693k("Failed to get a cache key, reverting to legacy flow.");
        qp2 qp2 = this.f13447a;
        qp2.f16497d = new pp2((yg0) null, qp2.m19326e(), (op2) null);
        return this.f13447a.f16497d;
    }
}
