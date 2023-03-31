package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class w04 extends x04 {
    w04(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final byte mo14647a(long j) {
        return Memory.peekByte(j);
    }

    /* renamed from: b */
    public final double mo14648b(Object obj, long j) {
        return Double.longBitsToDouble(mo15020m(obj, j));
    }

    /* renamed from: c */
    public final float mo14649c(Object obj, long j) {
        return Float.intBitsToFloat(mo15019l(obj, j));
    }

    /* renamed from: d */
    public final void mo14650d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    /* renamed from: e */
    public final void mo14651e(Object obj, long j, boolean z) {
        if (y04.f20422i) {
            y04.m23657g(obj, j, r3 ? (byte) 1 : 0);
        } else {
            y04.m23658h(obj, j, r3 ? (byte) 1 : 0);
        }
    }

    /* renamed from: f */
    public final void mo14652f(Object obj, long j, byte b) {
        if (y04.f20422i) {
            y04.m23657g(obj, j, b);
        } else {
            y04.m23658h(obj, j, b);
        }
    }

    /* renamed from: g */
    public final void mo14653g(Object obj, long j, double d) {
        mo15024q(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: h */
    public final void mo14654h(Object obj, long j, float f) {
        mo15023p(obj, j, Float.floatToIntBits(f));
    }

    /* renamed from: i */
    public final boolean mo14655i(Object obj, long j) {
        if (y04.f20422i) {
            return y04.m23647E(obj, j);
        }
        return y04.m23648F(obj, j);
    }
}
