package com.startapp;

import com.startapp.sdk.adsbase.remoteconfig.AnalyticsCategoryConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.k4 */
/* compiled from: Sta */
public class C9063k4 {

    /* renamed from: a */
    public final double f37038a;

    /* renamed from: b */
    public final int f37039b;

    /* renamed from: c */
    public final int f37040c;

    /* renamed from: d */
    public final boolean f37041d;

    /* renamed from: e */
    public final long f37042e;

    /* renamed from: f */
    public final long f37043f;

    /* renamed from: g */
    public final List<C9128m4> f37044g;

    /* renamed from: com.startapp.k4$a */
    /* compiled from: Sta */
    public static class C9064a {

        /* renamed from: a */
        public double f37045a = 1.0d;

        /* renamed from: b */
        public int f37046b;

        /* renamed from: c */
        public int f37047c;

        /* renamed from: d */
        public boolean f37048d;

        /* renamed from: e */
        public String f37049e;

        /* renamed from: f */
        public String f37050f;

        /* renamed from: g */
        public List<C9128m4> f37051g;

        /* renamed from: a */
        public double mo29535a() {
            return this.f37045a;
        }

        /* renamed from: b */
        public List<C9128m4> mo29537b() {
            return this.f37051g;
        }

        /* renamed from: c */
        public String mo29538c() {
            return this.f37050f;
        }

        /* renamed from: d */
        public int mo29539d() {
            return this.f37046b;
        }

        /* renamed from: e */
        public int mo29540e() {
            return this.f37047c;
        }

        /* renamed from: f */
        public String mo29541f() {
            return this.f37049e;
        }

        /* renamed from: g */
        public boolean mo29542g() {
            return this.f37048d;
        }

        /* renamed from: a */
        public C9064a mo29536a(C9128m4 m4Var) {
            if (this.f37051g == null) {
                this.f37051g = new ArrayList();
            }
            this.f37051g.add(m4Var);
            return this;
        }
    }

    public C9063k4(C9064a aVar) {
        this.f37038a = aVar.mo29535a();
        this.f37039b = aVar.mo29539d();
        this.f37040c = aVar.mo29540e();
        this.f37041d = aVar.mo29542g();
        this.f37042e = Math.max(60000, C9605vb.m50478e(aVar.mo29541f()));
        this.f37043f = Math.max(0, C9605vb.m50478e(aVar.mo29538c()));
        this.f37044g = C9605vb.m50471b(aVar.mo29537b());
    }

    /* renamed from: a */
    public static <T> T m48738a(T t, T t2) {
        return t2 != null ? t2 : t;
    }

    /* renamed from: a */
    public double mo29528a() {
        return this.f37038a;
    }

    /* renamed from: b */
    public List<C9128m4> mo29529b() {
        return this.f37044g;
    }

    /* renamed from: c */
    public long mo29530c() {
        return this.f37043f;
    }

    /* renamed from: d */
    public int mo29531d() {
        return this.f37039b;
    }

    /* renamed from: e */
    public int mo29532e() {
        return this.f37040c;
    }

    /* renamed from: f */
    public long mo29533f() {
        return this.f37042e;
    }

    /* renamed from: g */
    public boolean mo29534g() {
        return this.f37041d;
    }

    public C9063k4(C9063k4 k4Var, AnalyticsCategoryConfig analyticsCategoryConfig) {
        this.f37038a = ((Double) m48738a(Double.valueOf(k4Var.mo29528a()), analyticsCategoryConfig.mo30922a())).doubleValue();
        this.f37039b = ((Integer) m48738a(Integer.valueOf(k4Var.mo29531d()), analyticsCategoryConfig.mo30925d())).intValue();
        this.f37040c = ((Integer) m48738a(Integer.valueOf(k4Var.mo29532e()), analyticsCategoryConfig.mo30926e())).intValue();
        this.f37041d = ((Boolean) m48738a(Boolean.valueOf(k4Var.mo29534g()), analyticsCategoryConfig.mo30928f())).booleanValue();
        this.f37042e = analyticsCategoryConfig.mo30929g() == null ? k4Var.mo29533f() : Math.max(60000, C9605vb.m50478e(analyticsCategoryConfig.mo30929g()));
        this.f37043f = analyticsCategoryConfig.mo30924c() == null ? k4Var.mo29530c() : Math.max(0, C9605vb.m50478e(analyticsCategoryConfig.mo30924c()));
        this.f37044g = (List) m48738a(k4Var.mo29529b(), C9128m4.m48956a(analyticsCategoryConfig.mo30923b()));
    }
}
