package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.zb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
abstract class C7285zb {

    /* renamed from: a */
    final Unsafe f32287a;

    C7285zb(Unsafe unsafe) {
        this.f32287a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo23994a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo23995b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo23996c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo23997d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo23998e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo23999f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo24000g(Object obj, long j);

    /* renamed from: h */
    public final int mo24034h(Class cls) {
        return this.f32287a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo24035i(Class cls) {
        return this.f32287a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo24036j(Object obj, long j) {
        return this.f32287a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo24037k(Object obj, long j) {
        return this.f32287a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo24038l(Field field) {
        return this.f32287a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo24039m(Object obj, long j) {
        return this.f32287a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo24040n(Object obj, long j, int i) {
        this.f32287a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo24041o(Object obj, long j, long j2) {
        this.f32287a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo24042p(Object obj, long j, Object obj2) {
        this.f32287a.putObject(obj, j, obj2);
    }
}
