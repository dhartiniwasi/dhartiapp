package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.bf */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6899bf extends C7017j {

    /* renamed from: c */
    private final Callable f31595c;

    public C6899bf(String str, Callable callable) {
        super("internal.appMetadata");
        this.f31595c = callable;
    }

    /* renamed from: a */
    public final C7129q mo23023a(C7262y4 y4Var, List list) {
        try {
            return C6874a7.m39470b(this.f31595c.call());
        } catch (Exception unused) {
            return C7129q.f31955m;
        }
    }
}
