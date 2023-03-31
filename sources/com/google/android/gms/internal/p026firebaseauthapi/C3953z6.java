package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3953z6 {

    /* renamed from: a */
    private final ConcurrentMap f22978a;

    /* renamed from: b */
    private final C3825v6 f22979b;

    /* renamed from: c */
    private final Class f22980c;

    /* renamed from: d */
    private final C3635pe f22981d;

    /* synthetic */ C3953z6(ConcurrentMap concurrentMap, C3825v6 v6Var, C3635pe peVar, Class cls, C3921y6 y6Var) {
        this.f22978a = concurrentMap;
        this.f22979b = v6Var;
        this.f22980c = cls;
        this.f22981d = peVar;
    }

    /* renamed from: a */
    public final C3825v6 mo17094a() {
        return this.f22979b;
    }

    /* renamed from: b */
    public final C3635pe mo17095b() {
        return this.f22981d;
    }

    /* renamed from: c */
    public final Class mo17096c() {
        return this.f22980c;
    }

    /* renamed from: d */
    public final Collection mo17097d() {
        return this.f22978a.values();
    }

    /* renamed from: e */
    public final List mo17098e(byte[] bArr) {
        List list = (List) this.f22978a.get(new C3889x6(bArr, (C3857w6) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    /* renamed from: f */
    public final boolean mo17099f() {
        return !this.f22981d.mo16543a().isEmpty();
    }
}
