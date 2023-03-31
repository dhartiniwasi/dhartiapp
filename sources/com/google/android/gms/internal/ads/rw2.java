package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rw2 {

    /* renamed from: a */
    private final Object f17118a;

    /* renamed from: b */
    private final List f17119b;

    /* renamed from: c */
    final /* synthetic */ bx2 f17120c;

    /* synthetic */ rw2(bx2 bx2, Object obj, List list, qw2 qw2) {
        this.f17120c = bx2;
        this.f17118a = obj;
        this.f17119b = list;
    }

    /* renamed from: a */
    public final ax2 mo13884a(Callable callable) {
        bf3 c = cf3.m10905c(this.f17119b);
        lf3 a = c.mo8777a(pw2.f16061a, dn0.f8330f);
        bx2 bx2 = this.f17120c;
        return new ax2(bx2, this.f17118a, (String) null, a, this.f17119b, c.mo8777a(callable, bx2.f7514a), (zw2) null);
    }
}
