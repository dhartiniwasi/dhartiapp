package com.startapp;

/* renamed from: com.startapp.x */
/* compiled from: Sta */
public class C9628x implements C8894cc {

    /* renamed from: a */
    public final double f39342a;

    /* renamed from: b */
    public final double f39343b;

    /* renamed from: c */
    public final double f39344c;

    /* renamed from: d */
    public final double f39345d;

    /* renamed from: e */
    public final double f39346e;

    /* renamed from: f */
    public final double f39347f;

    /* renamed from: g */
    public double f39348g;

    /* renamed from: h */
    public long f39349h;

    /* renamed from: i */
    public double f39350i;

    public C9628x(double d, double d2, double d3, double d4, double d5) {
        double d6 = d + d2;
        this.f39342a = d / d6;
        this.f39343b = d2 / d6;
        this.f39344c = d3;
        this.f39345d = d4;
        this.f39346e = d5;
        this.f39347f = C9624wb.m50496a(0.0d, d4, d5);
    }

    /* renamed from: a */
    public static double m50499a(long j, long j2, double d, double d2, double d3, double d4) {
        double max = ((double) Math.max(0, j - j2)) / d;
        if (d3 > 0.0d) {
            return C9624wb.m50497a(max, d2, d3, d4);
        }
        if (d3 < 0.0d) {
            return C9624wb.m50496a(max, d2, d3) / d4;
        }
        return C9624wb.m50496a(max, d2, d3);
    }

    /* renamed from: a */
    public void mo31353a(long j, double d) {
        double a = this.f39348g * m50499a(j, this.f39349h, this.f39344c, this.f39345d, this.f39346e, this.f39347f);
        double d2 = (this.f39343b * d) + (this.f39342a * a);
        this.f39350i = d2;
        if (a < d2) {
            this.f39348g = d2;
            this.f39349h = j;
        }
    }

    /* renamed from: a */
    public double mo29284a() {
        return this.f39350i;
    }
}
