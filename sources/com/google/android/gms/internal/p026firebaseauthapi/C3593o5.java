package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.o5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3593o5 extends C3626p5 {

    /* renamed from: c */
    final transient int f22440c;

    /* renamed from: d */
    final transient int f22441d;

    /* renamed from: e */
    final /* synthetic */ C3626p5 f22442e;

    C3593o5(C3626p5 p5Var, int i, int i2) {
        this.f22442e = p5Var;
        this.f22440c = i;
        this.f22441d = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo16368c() {
        return this.f22442e.mo16370f() + this.f22440c + this.f22441d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo16370f() {
        return this.f22442e.mo16370f() + this.f22440c;
    }

    public final Object get(int i) {
        C3782tt.m27047a(i, this.f22441d, "index");
        return this.f22442e.get(i + this.f22440c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object[] mo16371i() {
        return this.f22442e.mo16371i();
    }

    /* renamed from: j */
    public final C3626p5 mo16494j(int i, int i2) {
        C3782tt.m27049c(i, i2, this.f22441d);
        C3626p5 p5Var = this.f22442e;
        int i3 = this.f22440c;
        return p5Var.subList(i + i3, i2 + i3);
    }

    public final int size() {
        return this.f22441d;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
