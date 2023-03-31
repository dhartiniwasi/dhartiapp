package com.google.android.gms.internal.p026firebaseauthapi;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.b5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3164b5 {

    /* renamed from: a */
    final Unsafe f21773a;

    C3164b5(Unsafe unsafe) {
        this.f21773a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo15709a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo15710b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo15711c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo15712d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo15713e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo15714f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo15715g(Object obj, long j);

    /* renamed from: h */
    public final int mo15771h(Class cls) {
        return this.f21773a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo15772i(Class cls) {
        return this.f21773a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo15773j(Object obj, long j) {
        return this.f21773a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo15774k(Object obj, long j) {
        return this.f21773a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo15775l(Field field) {
        return this.f21773a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo15776m(Object obj, long j) {
        return this.f21773a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo15777n(Object obj, long j, int i) {
        this.f21773a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo15778o(Object obj, long j, long j2) {
        this.f21773a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo15779p(Object obj, long j, Object obj2) {
        this.f21773a.putObject(obj, j, obj2);
    }
}
