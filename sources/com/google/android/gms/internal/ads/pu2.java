package com.google.android.gms.internal.ads;

import java.util.LinkedList;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pu2 {

    /* renamed from: a */
    private final LinkedList f16043a = new LinkedList();

    /* renamed from: b */
    private final int f16044b;

    /* renamed from: c */
    private final int f16045c;

    /* renamed from: d */
    private final pv2 f16046d;

    public pu2(int i, int i2) {
        this.f16044b = i;
        this.f16045c = i2;
        this.f16046d = new pv2();
    }

    /* renamed from: i */
    private final void m18906i() {
        while (!this.f16043a.isEmpty() && C4409t.m29310b().mo18370a() - ((zu2) this.f16043a.getFirst()).f21283d >= ((long) this.f16045c)) {
            this.f16046d.mo13408g();
            this.f16043a.remove();
        }
    }

    /* renamed from: a */
    public final int mo13384a() {
        return this.f16046d.mo13402a();
    }

    /* renamed from: b */
    public final int mo13385b() {
        m18906i();
        return this.f16043a.size();
    }

    /* renamed from: c */
    public final long mo13386c() {
        return this.f16046d.mo13403b();
    }

    /* renamed from: d */
    public final long mo13387d() {
        return this.f16046d.mo13404c();
    }

    /* renamed from: e */
    public final zu2 mo13388e() {
        this.f16046d.mo13407f();
        m18906i();
        if (this.f16043a.isEmpty()) {
            return null;
        }
        zu2 zu2 = (zu2) this.f16043a.remove();
        if (zu2 != null) {
            this.f16046d.mo13409h();
        }
        return zu2;
    }

    /* renamed from: f */
    public final ov2 mo13389f() {
        return this.f16046d.mo13405d();
    }

    /* renamed from: g */
    public final String mo13390g() {
        return this.f16046d.mo13406e();
    }

    /* renamed from: h */
    public final boolean mo13391h(zu2 zu2) {
        this.f16046d.mo13407f();
        m18906i();
        if (this.f16043a.size() == this.f16044b) {
            return false;
        }
        this.f16043a.add(zu2);
        return true;
    }
}
