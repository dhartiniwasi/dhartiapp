package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fy0 implements bs2 {

    /* renamed from: a */
    private final dw0 f9575a;

    /* renamed from: b */
    private Context f9576b;

    /* renamed from: c */
    private String f9577c;

    /* synthetic */ fy0(dw0 dw0, ey0 ey0) {
        this.f9575a = dw0;
    }

    /* renamed from: a */
    public final /* synthetic */ bs2 mo8925a(Context context) {
        Objects.requireNonNull(context);
        this.f9576b = context;
        return this;
    }

    /* renamed from: e */
    public final cs2 mo8926e() {
        j44.m14700c(this.f9576b, Context.class);
        return new hy0(this.f9575a, this.f9576b, this.f9577c, (gy0) null);
    }

    /* renamed from: f */
    public final /* synthetic */ bs2 mo8927f(String str) {
        this.f9577c = str;
        return this;
    }
}
