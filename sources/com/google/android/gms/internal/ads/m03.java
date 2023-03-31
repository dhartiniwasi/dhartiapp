package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class m03 {

    /* renamed from: c */
    private static final m03 f13146c = new m03();

    /* renamed from: a */
    private final ArrayList f13147a = new ArrayList();

    /* renamed from: b */
    private final ArrayList f13148b = new ArrayList();

    private m03() {
    }

    /* renamed from: a */
    public static m03 m16344a() {
        return f13146c;
    }

    /* renamed from: b */
    public final Collection mo12244b() {
        return Collections.unmodifiableCollection(this.f13148b);
    }

    /* renamed from: c */
    public final Collection mo12245c() {
        return Collections.unmodifiableCollection(this.f13147a);
    }

    /* renamed from: d */
    public final void mo12246d(a03 a03) {
        this.f13147a.add(a03);
    }

    /* renamed from: e */
    public final void mo12247e(a03 a03) {
        boolean g = mo12249g();
        this.f13147a.remove(a03);
        this.f13148b.remove(a03);
        if (g && !mo12249g()) {
            s03.m20100b().mo13921f();
        }
    }

    /* renamed from: f */
    public final void mo12248f(a03 a03) {
        boolean g = mo12249g();
        this.f13148b.add(a03);
        if (!g) {
            s03.m20100b().mo13920e();
        }
    }

    /* renamed from: g */
    public final boolean mo12249g() {
        return this.f13148b.size() > 0;
    }
}
