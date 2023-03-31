package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class x04 {

    /* renamed from: a */
    final Unsafe f19930a;

    x04(Unsafe unsafe) {
        this.f19930a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo14647a(long j);

    /* renamed from: b */
    public abstract double mo14648b(Object obj, long j);

    /* renamed from: c */
    public abstract float mo14649c(Object obj, long j);

    /* renamed from: d */
    public abstract void mo14650d(long j, byte[] bArr, long j2, long j3);

    /* renamed from: e */
    public abstract void mo14651e(Object obj, long j, boolean z);

    /* renamed from: f */
    public abstract void mo14652f(Object obj, long j, byte b);

    /* renamed from: g */
    public abstract void mo14653g(Object obj, long j, double d);

    /* renamed from: h */
    public abstract void mo14654h(Object obj, long j, float f);

    /* renamed from: i */
    public abstract boolean mo14655i(Object obj, long j);

    /* renamed from: j */
    public final int mo15017j(Class cls) {
        return this.f19930a.arrayBaseOffset(cls);
    }

    /* renamed from: k */
    public final int mo15018k(Class cls) {
        return this.f19930a.arrayIndexScale(cls);
    }

    /* renamed from: l */
    public final int mo15019l(Object obj, long j) {
        return this.f19930a.getInt(obj, j);
    }

    /* renamed from: m */
    public final long mo15020m(Object obj, long j) {
        return this.f19930a.getLong(obj, j);
    }

    /* renamed from: n */
    public final long mo15021n(Field field) {
        return this.f19930a.objectFieldOffset(field);
    }

    /* renamed from: o */
    public final Object mo15022o(Object obj, long j) {
        return this.f19930a.getObject(obj, j);
    }

    /* renamed from: p */
    public final void mo15023p(Object obj, long j, int i) {
        this.f19930a.putInt(obj, j, i);
    }

    /* renamed from: q */
    public final void mo15024q(Object obj, long j, long j2) {
        this.f19930a.putLong(obj, j, j2);
    }

    /* renamed from: r */
    public final void mo15025r(Object obj, long j, Object obj2) {
        this.f19930a.putObject(obj, j, obj2);
    }
}
