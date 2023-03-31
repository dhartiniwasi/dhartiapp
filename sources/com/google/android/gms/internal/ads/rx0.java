package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rx0 implements pw1 {

    /* renamed from: a */
    private final dw0 f17121a;

    /* renamed from: b */
    private Context f17122b;

    /* renamed from: c */
    private a70 f17123c;

    /* synthetic */ rx0(dw0 dw0, qx0 qx0) {
        this.f17121a = dw0;
    }

    /* renamed from: a */
    public final /* synthetic */ pw1 mo13414a(Context context) {
        Objects.requireNonNull(context);
        this.f17122b = context;
        return this;
    }

    /* renamed from: b */
    public final /* synthetic */ pw1 mo13415b(a70 a70) {
        Objects.requireNonNull(a70);
        this.f17123c = a70;
        return this;
    }

    /* renamed from: e */
    public final qw1 mo13416e() {
        j44.m14700c(this.f17122b, Context.class);
        j44.m14700c(this.f17123c, a70.class);
        return new tx0(this.f17121a, this.f17122b, this.f17123c, (sx0) null);
    }
}
