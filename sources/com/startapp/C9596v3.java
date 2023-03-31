package com.startapp;

/* renamed from: com.startapp.v3 */
/* compiled from: Sta */
public class C9596v3 implements C8894cc {

    /* renamed from: a */
    public final C9616w3 f39283a;

    /* renamed from: b */
    public final C9616w3 f39284b;

    /* renamed from: c */
    public final C9616w3 f39285c;

    /* renamed from: d */
    public double f39286d;

    public C9596v3(C9616w3 w3Var, C9616w3 w3Var2, C9616w3 w3Var3) {
        this.f39283a = w3Var;
        this.f39284b = w3Var2;
        this.f39285c = w3Var3;
    }

    /* renamed from: a */
    public void mo31324a(double d, double d2, double d3) {
        this.f39283a.mo31342a(d);
        this.f39284b.mo31342a(d2);
        this.f39285c.mo31342a(d3);
        double d4 = this.f39283a.f39326c;
        double d5 = this.f39284b.f39326c;
        double d6 = (d5 * d5) + (d4 * d4);
        double d7 = this.f39285c.f39326c;
        this.f39286d = Math.sqrt((d7 * d7) + d6);
    }

    /* renamed from: b */
    public C9616w3 mo31325b() {
        return this.f39283a;
    }

    /* renamed from: c */
    public C9616w3 mo31326c() {
        return this.f39284b;
    }

    /* renamed from: d */
    public C9616w3 mo31327d() {
        return this.f39285c;
    }

    /* renamed from: a */
    public double mo29284a() {
        return this.f39286d;
    }
}
