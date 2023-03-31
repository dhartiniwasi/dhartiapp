package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6900c {

    /* renamed from: a */
    private C6883b f31596a;

    /* renamed from: b */
    private C6883b f31597b;

    /* renamed from: c */
    private final List f31598c;

    public C6900c() {
        this.f31596a = new C6883b("", 0, (Map) null);
        this.f31597b = new C6883b("", 0, (Map) null);
        this.f31598c = new ArrayList();
    }

    /* renamed from: a */
    public final C6883b mo23132a() {
        return this.f31596a;
    }

    /* renamed from: b */
    public final C6883b mo23133b() {
        return this.f31597b;
    }

    /* renamed from: c */
    public final List mo23134c() {
        return this.f31598c;
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        C6900c cVar = new C6900c(this.f31596a.clone());
        for (C6883b b : this.f31598c) {
            cVar.f31598c.add(b.clone());
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo23136d(C6883b bVar) {
        this.f31596a = bVar;
        this.f31597b = bVar.clone();
        this.f31598c.clear();
    }

    /* renamed from: e */
    public final void mo23137e(String str, long j, Map map) {
        this.f31598c.add(new C6883b(str, j, map));
    }

    /* renamed from: f */
    public final void mo23138f(C6883b bVar) {
        this.f31597b = bVar;
    }

    public C6900c(C6883b bVar) {
        this.f31596a = bVar;
        this.f31597b = bVar.clone();
        this.f31598c = new ArrayList();
    }
}
