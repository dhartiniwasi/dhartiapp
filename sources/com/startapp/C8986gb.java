package com.startapp;

/* renamed from: com.startapp.gb */
/* compiled from: Sta */
public class C8986gb {

    /* renamed from: a */
    public final C9596v3 f36860a;

    /* renamed from: b */
    public final C9596v3 f36861b;

    /* renamed from: c */
    public final C9616w3 f36862c;

    /* renamed from: d */
    public final C9156nc f36863d;

    /* renamed from: e */
    public final C8955fc f36864e = new C8955fc();

    /* renamed from: f */
    public final C9616w3 f36865f;

    /* renamed from: g */
    public final C9628x f36866g;

    /* renamed from: h */
    public final C8933ec f36867h;

    /* renamed from: i */
    public final C9628x f36868i;

    /* renamed from: j */
    public final C9196o8 f36869j;

    /* renamed from: k */
    public final C9628x f36870k;

    /* renamed from: l */
    public long f36871l;

    /* renamed from: m */
    public long f36872m;

    public C8986gb(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = d;
        double d18 = d2;
        C9596v3 v3Var = new C9596v3(new C9616w3(d), new C9616w3(d), new C9616w3(d));
        this.f36860a = v3Var;
        this.f36861b = new C9596v3(new C9616w3(d2), new C9616w3(d2), new C9616w3(d2));
        double d19 = d3;
        this.f36862c = new C9616w3(d3);
        double d20 = d5;
        double d21 = d6;
        this.f36863d = new C9156nc(new C9200oc(d20, d21, v3Var.mo31325b()), new C9200oc(d20, d21, v3Var.mo31326c()), new C9200oc(d20, d21, v3Var.mo31327d()));
        this.f36865f = new C9616w3(d4);
        double d22 = d12;
        double d23 = d13;
        double d24 = d14;
        double d25 = d15;
        double d26 = d16;
        this.f36866g = new C9628x(d22, d23, d24, d25, d26);
        this.f36867h = new C8933ec();
        this.f36868i = new C9628x(d22, d23, d24, d25, d26);
        this.f36869j = new C9196o8(5.0d, false);
        this.f36870k = new C9628x(d7, d8, d9, d10, d11);
    }

    /* renamed from: a */
    public void mo29436a(double d, long j) {
        this.f36870k.f39348g = Math.min(Math.max(0.0d, d), 1.0d);
        this.f36870k.f39349h = j;
    }

    /* renamed from: a */
    public void mo29437a(long j, long j2, double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        double d7;
        double exp;
        long j3 = j;
        long j4 = j2;
        double d8 = d;
        double d9 = d2;
        double d10 = d3;
        if (this.f36872m < j4) {
            if (this.f36871l <= 0) {
                this.f36871l = j4;
            }
            C9596v3 v3Var = this.f36860a;
            double d11 = v3Var.f39283a.f39326c;
            double d12 = v3Var.f39284b.f39326c;
            double d13 = v3Var.f39285c.f39326c;
            double d14 = d10;
            v3Var.mo31324a(d, d2, d3);
            C9596v3 v3Var2 = this.f36860a;
            double d15 = v3Var2.f39283a.f39326c - d11;
            double d16 = v3Var2.f39284b.f39326c - d12;
            double d17 = v3Var2.f39285c.f39326c - d13;
            double d18 = d17 * d17;
            double d19 = d18 + (d16 * d16) + (d15 * d15);
            this.f36866g.mo31353a(j3, C9624wb.m50496a(d19, 1.5d, 4.0d));
            this.f36868i.mo31353a(j3, C9624wb.m50496a(d19, 0.01d, 1000.0d));
            C9596v3 v3Var3 = this.f36861b;
            C9596v3 v3Var4 = this.f36860a;
            v3Var3.mo31324a(d8 - v3Var4.f39283a.f39326c, d9 - v3Var4.f39284b.f39326c, d14 - v3Var4.f39285c.f39326c);
            this.f36862c.mo31342a(this.f36861b.f39286d);
            C9156nc ncVar = this.f36863d;
            double d20 = d14;
            long j5 = j2;
            ncVar.f37354a.mo29801a(j5, d8);
            ncVar.f37355b.mo29801a(j5, d9);
            ncVar.f37356c.mo29801a(j5, d20);
            C9200oc ocVar = ncVar.f37354a;
            double d21 = ocVar.f38026q;
            C9200oc ocVar2 = ncVar.f37355b;
            double d22 = ocVar2.f38026q;
            C9200oc ocVar3 = ncVar.f37356c;
            double d23 = ocVar3.f38026q;
            double d24 = d21 + d22 + d23;
            double d25 = 1.0d - this.f36866g.f39350i;
            if (d24 > 0.0d) {
                ncVar.f37357d = ((ocVar.f38025p * d21) / d24) + ((ocVar2.f38025p * d22) / d24) + ((ocVar3.f38025p * d23) / d24);
                ncVar.f37358e = d24 / 3.0d;
            } else {
                ncVar.f37357d = 0.0d;
                ncVar.f37358e = 0.0d;
            }
            double a = C9624wb.m50496a(((double) (j5 - this.f36871l)) / 1.0E9d, 10.0d, 1.0d);
            C8955fc fcVar = this.f36864e;
            C9156nc ncVar2 = this.f36863d;
            double d26 = ncVar2.f37357d;
            double d27 = ncVar2.f37358e;
            double d28 = this.f36862c.f39326c;
            fcVar.f36788a = (Math.min(Math.exp((-Math.pow(d26 - 7.0d, 2.0d)) / 1.0d) * 2.0d, 1.0d) * 1.0d) + (fcVar.f36788a * 0.0d);
            double d29 = fcVar.f36789b * 0.0d;
            if (d27 < 0.0d) {
                d5 = 1.0d;
                d4 = 0.0d;
            } else {
                if (d27 < 0.5d) {
                    d4 = Math.pow(d27 * 2.0d, 4.0d);
                } else if (d27 > 2.0d) {
                    d4 = Math.exp((2.0d - d27) * 6.0d);
                } else {
                    d5 = 1.0d;
                    d4 = 1.0d;
                }
                d5 = 1.0d;
            }
            fcVar.f36789b = (d4 * d5) + d29;
            double d30 = fcVar.f36790c * 0.0d;
            if (d28 < 0.0d) {
                d7 = 1.0d;
                d6 = 0.0d;
            } else {
                if (d28 < 0.5d) {
                    exp = Math.pow(d28 * 2.0d, 4.0d);
                } else if (d28 > 5.0d) {
                    exp = Math.exp((5.0d - d28) * 4.0d);
                } else {
                    d7 = 1.0d;
                    d6 = 1.0d;
                }
                d6 = exp;
                d7 = 1.0d;
            }
            double d31 = (d6 * d7) + d30;
            fcVar.f36790c = d31;
            double d32 = (d31 * 100.0d) / 270.0d;
            fcVar.f36791d = d32 + ((fcVar.f36789b * 70.0d) / 270.0d) + ((fcVar.f36788a * 100.0d) / 270.0d);
            this.f36865f.mo31342a(a * d25 * this.f36864e.f36791d);
            double d33 = this.f36865f.f39326c;
            C8933ec ecVar = this.f36867h;
            C9156nc ncVar3 = this.f36863d;
            double d34 = ncVar3.f37357d;
            double d35 = ncVar3.f37358e;
            this.f36869j.getClass();
            this.f36869j.getClass();
            ecVar.f36734a = (d34 * 0.050000000000000044d) + (ecVar.f36734a * 0.95d);
            ecVar.f36735b = (d35 * 0.050000000000000044d) + (ecVar.f36735b * 0.95d);
            ecVar.f36736c = (Math.abs(0.0d) * 0.0050000000000000044d) + (ecVar.f36736c * 0.995d);
            ecVar.f36737d = (Math.abs(0.0d) * 0.0050000000000000044d) + (ecVar.f36737d * 0.995d);
            ecVar.f36738e = ((((C9624wb.m50497a(ecVar.f36737d, 0.4d, 5.0d, C8933ec.f36733i) * 1000.0d) / 5000.0d) + ((C9624wb.m50497a(ecVar.f36736c, 0.2d, 6.0d, C8933ec.f36732h) * 1000.0d) / 5000.0d) + ((C9624wb.m50497a(ecVar.f36735b, 0.2d, 20.0d, C8933ec.f36731g) * 1000.0d) / 5000.0d) + ((C9624wb.m50497a(ecVar.f36734a, 8.0d, 2.0d, C8933ec.f36730f) * 2000.0d) / 5000.0d)) * 4.999999999999449E-4d) + (ecVar.f36738e * 0.9995d);
            C9628x xVar = this.f36870k;
            double d36 = this.f36868i.f39350i;
            double d37 = (1.0d - d36) * a * this.f36867h.f36738e;
            xVar.mo31353a(j, d37 + (d33 * d36));
            this.f36872m = j2;
        }
    }
}
