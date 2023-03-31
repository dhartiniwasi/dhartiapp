package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C6906c5;
import com.google.android.gms.internal.measurement.C7150r4;
import java.util.ArrayList;
import java.util.List;
import p033d5.C4141r;
import p402y5.C13019a0;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7563y8 {

    /* renamed from: a */
    C6906c5 f33208a;

    /* renamed from: b */
    List f33209b;

    /* renamed from: c */
    List f33210c;

    /* renamed from: d */
    long f33211d;

    /* renamed from: e */
    final /* synthetic */ C7303a9 f33212e;

    /* synthetic */ C7563y8(C7303a9 a9Var, C13019a0 a0Var) {
        this.f33212e = a9Var;
    }

    /* renamed from: b */
    private static final long m42037b(C7150r4 r4Var) {
        return ((r4Var.mo23810F() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean mo24766a(long j, C7150r4 r4Var) {
        C4141r.m28221k(r4Var);
        if (this.f33210c == null) {
            this.f33210c = new ArrayList();
        }
        if (this.f33209b == null) {
            this.f33209b = new ArrayList();
        }
        if (!this.f33210c.isEmpty() && m42037b((C7150r4) this.f33210c.get(0)) != m42037b(r4Var)) {
            return false;
        }
        long d = this.f33211d + ((long) r4Var.mo23488d());
        this.f33212e.mo24110U();
        if (d >= ((long) Math.max(0, ((Integer) C7516u2.f33056j.mo24669a((Object) null)).intValue()))) {
            return false;
        }
        this.f33211d = d;
        this.f33210c.add(r4Var);
        this.f33209b.add(Long.valueOf(j));
        int size = this.f33210c.size();
        this.f33212e.mo24110U();
        if (size >= Math.max(1, ((Integer) C7516u2.f33058k.mo24669a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }
}
