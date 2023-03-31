package com.startapp;

/* renamed from: com.startapp.w3 */
/* compiled from: Sta */
public class C9616w3 implements C8894cc {

    /* renamed from: a */
    public final double f39324a;

    /* renamed from: b */
    public final double f39325b;

    /* renamed from: c */
    public double f39326c;

    public C9616w3(double d) {
        double d2 = d + 1.0d;
        this.f39324a = d / d2;
        this.f39325b = 1.0d / d2;
    }

    /* renamed from: a */
    public void mo31342a(double d) {
        this.f39326c = (d * this.f39325b) + (this.f39324a * this.f39326c);
    }

    /* renamed from: a */
    public double mo29284a() {
        return this.f39326c;
    }
}
