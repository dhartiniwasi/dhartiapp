package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.tu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2897tu {

    /* renamed from: a */
    private final InputStream f18247a;

    /* renamed from: b */
    private final boolean f18248b;

    /* renamed from: c */
    private final boolean f18249c;

    /* renamed from: d */
    private final long f18250d;

    /* renamed from: e */
    private final boolean f18251e;

    private C2897tu(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.f18247a = inputStream;
        this.f18248b = z;
        this.f18249c = z2;
        this.f18250d = j;
        this.f18251e = z3;
    }

    /* renamed from: b */
    public static C2897tu m21239b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new C2897tu(inputStream, z, z2, j, z3);
    }

    /* renamed from: a */
    public final long mo14385a() {
        return this.f18250d;
    }

    /* renamed from: c */
    public final InputStream mo14386c() {
        return this.f18247a;
    }

    /* renamed from: d */
    public final boolean mo14387d() {
        return this.f18248b;
    }

    /* renamed from: e */
    public final boolean mo14388e() {
        return this.f18251e;
    }

    /* renamed from: f */
    public final boolean mo14389f() {
        return this.f18249c;
    }
}
