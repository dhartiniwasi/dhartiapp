package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.va */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7220va {

    /* renamed from: c */
    private static final C7220va f32149c = new C7220va();

    /* renamed from: a */
    private final C7284za f32150a = new C6962fa();

    /* renamed from: b */
    private final ConcurrentMap f32151b = new ConcurrentHashMap();

    private C7220va() {
    }

    /* renamed from: a */
    public static C7220va m41045a() {
        return f32149c;
    }

    /* renamed from: b */
    public final C7268ya mo23957b(Class cls) {
        C7107o9.m40533f(cls, "messageType");
        C7268ya yaVar = (C7268ya) this.f32151b.get(cls);
        if (yaVar == null) {
            yaVar = this.f32150a.mo23418c(cls);
            C7107o9.m40533f(cls, "messageType");
            C7107o9.m40533f(yaVar, "schema");
            C7268ya yaVar2 = (C7268ya) this.f32151b.putIfAbsent(cls, yaVar);
            return yaVar2 == null ? yaVar : yaVar2;
        }
    }
}
