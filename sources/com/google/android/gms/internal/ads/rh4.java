package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rh4 implements lg4 {

    /* renamed from: a */
    private final pk2 f16953a;

    /* renamed from: b */
    private int f16954b = 1048576;

    /* renamed from: c */
    private final qh4 f16955c;

    /* renamed from: d */
    private final rk4 f16956d;

    /* renamed from: e */
    private final id4 f16957e;

    public rh4(pk2 pk2, qh4 qh4, byte[] bArr) {
        id4 id4 = new id4();
        rk4 rk4 = new rk4(-1);
        this.f16953a = pk2;
        this.f16955c = qh4;
        this.f16957e = id4;
        this.f16956d = rk4;
    }

    /* renamed from: a */
    public final rh4 mo13802a(int i) {
        this.f16954b = i;
        return this;
    }

    /* renamed from: b */
    public final th4 mo13803b(C2453hw hwVar) {
        Objects.requireNonNull(hwVar.f10509b);
        return new th4(hwVar, this.f16953a, this.f16955c, rd4.f16925a, this.f16956d, this.f16954b, (sh4) null, (byte[]) null);
    }
}
