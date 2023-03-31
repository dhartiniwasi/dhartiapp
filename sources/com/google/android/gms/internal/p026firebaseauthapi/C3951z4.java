package com.google.android.gms.internal.p026firebaseauthapi;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3951z4 extends C3164b5 {
    C3951z4(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final double mo15709a(Object obj, long j) {
        return Double.longBitsToDouble(mo15774k(obj, j));
    }

    /* renamed from: b */
    public final float mo15710b(Object obj, long j) {
        return Float.intBitsToFloat(mo15773j(obj, j));
    }

    /* renamed from: c */
    public final void mo15711c(Object obj, long j, boolean z) {
        if (C3197c5.f21868h) {
            C3197c5.m25296d(obj, j, r3 ? (byte) 1 : 0);
        } else {
            C3197c5.m25297e(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: d */
    public final void mo15712d(Object obj, long j, byte b) {
        if (C3197c5.f21868h) {
            C3197c5.m25296d(obj, j, b);
        } else {
            C3197c5.m25297e(obj, j, b);
        }
    }

    /* renamed from: e */
    public final void mo15713e(Object obj, long j, double d) {
        mo15778o(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: f */
    public final void mo15714f(Object obj, long j, float f) {
        mo15777n(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: g */
    public final boolean mo15715g(Object obj, long j) {
        if (C3197c5.f21868h) {
            return C3197c5.m25317y(obj, j);
        }
        return C3197c5.m25318z(obj, j);
    }
}
