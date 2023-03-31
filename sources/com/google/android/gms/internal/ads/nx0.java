package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nx0 implements hw1 {

    /* renamed from: a */
    private final dw0 f14223a;

    /* renamed from: b */
    private final tx0 f14224b;

    /* renamed from: c */
    private Long f14225c;

    /* renamed from: d */
    private String f14226d;

    /* synthetic */ nx0(dw0 dw0, tx0 tx0, mx0 mx0) {
        this.f14223a = dw0;
        this.f14224b = tx0;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ hw1 mo10957c(long j) {
        this.f14225c = Long.valueOf(j);
        return this;
    }

    /* renamed from: e */
    public final iw1 mo10958e() {
        j44.m14700c(this.f14225c, Long.class);
        j44.m14700c(this.f14226d, String.class);
        return new px0(this.f14223a, this.f14224b, this.f14225c, this.f14226d, (ox0) null);
    }

    /* renamed from: f */
    public final /* synthetic */ hw1 mo10959f(String str) {
        Objects.requireNonNull(str);
        this.f14226d = str;
        return this;
    }
}
