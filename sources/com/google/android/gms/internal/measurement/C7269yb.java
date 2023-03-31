package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.yb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7269yb extends C7285zb {
    C7269yb(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo23994a(Object obj, long j) {
        return Double.longBitsToDouble(mo24037k(obj, j));
    }

    /* renamed from: b */
    public final float mo23995b(Object obj, long j) {
        return Float.intBitsToFloat(mo24036j(obj, j));
    }

    /* renamed from: c */
    public final void mo23996c(Object obj, long j, boolean z) {
        if (C6879ac.f31572h) {
            C6879ac.m39538d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C6879ac.m39539e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo23997d(Object obj, long j, byte b) {
        if (C6879ac.f31572h) {
            C6879ac.m39538d(obj, j, b);
        } else {
            C6879ac.m39539e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo23998e(Object obj, long j, double d) {
        mo24041o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo23999f(Object obj, long j, float f) {
        mo24040n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo24000g(Object obj, long j) {
        if (C6879ac.f31572h) {
            return C6879ac.m39559y(obj, j);
        }
        return C6879ac.m39560z(obj, j);
    }
}
