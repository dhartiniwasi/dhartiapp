package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C7186t8 {

    /* renamed from: b */
    private static volatile C7186t8 f32110b;

    /* renamed from: c */
    static final C7186t8 f32111c = new C7186t8(true);

    /* renamed from: a */
    private final Map f32112a;

    C7186t8() {
        this.f32112a = new HashMap();
    }

    /* renamed from: a */
    public static C7186t8 m40946a() {
        Class<C7186t8> cls = C7186t8.class;
        C7186t8 t8Var = f32110b;
        if (t8Var != null) {
            return t8Var;
        }
        synchronized (cls) {
            C7186t8 t8Var2 = f32110b;
            if (t8Var2 != null) {
                return t8Var2;
            }
            C7186t8 b = C6893b9.m39662b(cls);
            f32110b = b;
            return b;
        }
    }

    /* renamed from: b */
    public final C6978g9 mo23884b(C7092na naVar, int i) {
        return (C6978g9) this.f32112a.get(new C7170s8(naVar, i));
    }

    C7186t8(boolean z) {
        this.f32112a = Collections.emptyMap();
    }
}
