package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7010i8 extends C7042k8 {

    /* renamed from: b */
    private final byte[] f31751b;

    /* renamed from: c */
    private int f31752c;

    /* renamed from: d */
    private int f31753d;

    /* renamed from: e */
    private int f31754e = Integer.MAX_VALUE;

    /* synthetic */ C7010i8(byte[] bArr, int i, int i2, boolean z, C6994h8 h8Var) {
        super((C7026j8) null);
        this.f31751b = bArr;
        this.f31752c = 0;
    }

    /* renamed from: c */
    public final int mo23525c(int i) throws C7139q9 {
        int i2 = this.f31754e;
        this.f31754e = 0;
        int i3 = this.f31752c + this.f31753d;
        this.f31752c = i3;
        if (i3 > 0) {
            this.f31753d = i3;
            this.f31752c = i3 - i3;
        } else {
            this.f31753d = 0;
        }
        return i2;
    }
}
