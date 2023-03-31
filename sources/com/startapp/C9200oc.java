package com.startapp;

/* renamed from: com.startapp.oc */
/* compiled from: Sta */
public class C9200oc {

    /* renamed from: a */
    public final C9202b f38010a = new C9202b();

    /* renamed from: b */
    public final long f38011b;

    /* renamed from: c */
    public final double f38012c;

    /* renamed from: d */
    public final C8894cc f38013d;

    /* renamed from: e */
    public double f38014e;

    /* renamed from: f */
    public double f38015f;

    /* renamed from: g */
    public double f38016g;

    /* renamed from: h */
    public long f38017h;

    /* renamed from: i */
    public long f38018i;

    /* renamed from: j */
    public double f38019j;

    /* renamed from: k */
    public long f38020k;

    /* renamed from: l */
    public long f38021l;

    /* renamed from: m */
    public C9201a f38022m;

    /* renamed from: n */
    public C9201a f38023n;

    /* renamed from: o */
    public int f38024o;

    /* renamed from: p */
    public double f38025p;

    /* renamed from: q */
    public double f38026q;

    /* renamed from: r */
    public double f38027r;

    /* renamed from: com.startapp.oc$a */
    /* compiled from: Sta */
    public static class C9201a {

        /* renamed from: a */
        public C9201a f38028a;

        /* renamed from: b */
        public long f38029b;

        /* renamed from: c */
        public long f38030c;

        /* renamed from: d */
        public int f38031d;

        /* renamed from: e */
        public double f38032e;
    }

    /* renamed from: com.startapp.oc$b */
    /* compiled from: Sta */
    public static class C9202b {

        /* renamed from: a */
        public C9201a f38033a;
    }

    public C9200oc(double d, double d2, C8894cc ccVar) {
        this.f38011b = (long) (d * 1.0E9d);
        this.f38012c = d2;
        this.f38013d = ccVar;
    }

    /* renamed from: a */
    public void mo29801a(long j, double d) {
        C9201a aVar;
        this.f38014e = this.f38015f;
        this.f38015f = this.f38016g;
        this.f38016g = d;
        this.f38017h = this.f38018i;
        this.f38018i = j;
        long j2 = j - this.f38011b;
        while (true) {
            C9201a aVar2 = this.f38022m;
            if (aVar2 == null || aVar2.f38029b >= j2 || (aVar = aVar2.f38028a) == null || aVar.f38029b >= j2) {
                C9202b bVar = this.f38010a;
                C9201a aVar3 = bVar.f38033a;
            } else {
                this.f38022m = aVar;
                this.f38024o -= aVar2.f38031d;
                this.f38027r -= aVar2.f38032e;
                C9202b bVar2 = this.f38010a;
                aVar2.f38028a = bVar2.f38033a;
                bVar2.f38033a = aVar2;
            }
        }
        C9202b bVar3 = this.f38010a;
        C9201a aVar32 = bVar3.f38033a;
        if (aVar32 == null) {
            aVar32 = new C9201a();
        } else {
            bVar3.f38033a = aVar32.f38028a;
            aVar32.f38028a = null;
            aVar32.f38029b = 0;
            aVar32.f38030c = 0;
            aVar32.f38031d = 0;
            aVar32.f38032e = 0.0d;
        }
        aVar32.f38029b = this.f38018i;
        aVar32.f38030c = this.f38021l;
        double a = this.f38013d.mo29284a();
        double d2 = this.f38014e;
        double d3 = this.f38015f;
        if (d2 < d3 && d3 > this.f38016g) {
            double d4 = d3 - a;
            if (d4 > this.f38012c) {
                this.f38019j = d4;
                this.f38020k = this.f38017h;
            }
        }
        if (d3 > a && a > this.f38016g && this.f38020k > this.f38021l) {
            this.f38021l = this.f38018i;
            aVar32.f38031d = 1;
            aVar32.f38032e = this.f38019j;
        }
        int i = this.f38024o + aVar32.f38031d;
        this.f38024o = i;
        double d5 = this.f38027r + aVar32.f38032e;
        this.f38027r = d5;
        C9201a aVar4 = this.f38023n;
        if (aVar4 != null) {
            aVar4.f38028a = aVar32;
        }
        this.f38023n = aVar32;
        if (this.f38022m == null) {
            this.f38022m = aVar32;
        }
        long j3 = this.f38021l - this.f38022m.f38030c;
        if (j3 > 0) {
            this.f38025p = ((double) i) / (((double) j3) / 1.0E9d);
        }
        if (i > 0) {
            this.f38026q = d5 / ((double) i);
        } else {
            this.f38026q = 0.0d;
        }
    }
}
