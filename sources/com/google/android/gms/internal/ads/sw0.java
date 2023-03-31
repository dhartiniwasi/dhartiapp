package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class sw0 implements an2 {

    /* renamed from: a */
    private final dw0 f17679a;

    /* renamed from: b */
    private Context f17680b;

    /* renamed from: c */
    private String f17681c;

    /* synthetic */ sw0(dw0 dw0, rw0 rw0) {
        this.f17679a = dw0;
    }

    /* renamed from: a */
    public final /* synthetic */ an2 mo8439a(Context context) {
        Objects.requireNonNull(context);
        this.f17680b = context;
        return this;
    }

    /* renamed from: e */
    public final bn2 mo8440e() {
        j44.m14700c(this.f17680b, Context.class);
        j44.m14700c(this.f17681c, String.class);
        return new uw0(this.f17679a, this.f17680b, this.f17681c, (tw0) null);
    }

    /* renamed from: f */
    public final /* synthetic */ an2 mo8441f(String str) {
        Objects.requireNonNull(str);
        this.f17681c = str;
        return this;
    }
}
