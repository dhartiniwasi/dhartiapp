package com.startapp;

import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.i4 */
/* compiled from: Sta */
public class C9023i4 {

    /* renamed from: a */
    public final C9043j4 f36949a;

    /* renamed from: b */
    public final long f36950b;

    /* renamed from: c */
    public String f36951c;

    /* renamed from: d */
    public String f36952d;

    /* renamed from: e */
    public String f36953e;

    /* renamed from: f */
    public Object f36954f;

    /* renamed from: g */
    public String f36955g;

    /* renamed from: h */
    public Long f36956h;

    /* renamed from: i */
    public String f36957i;

    /* renamed from: j */
    public boolean f36958j;

    /* renamed from: k */
    public String f36959k;

    public C9023i4(C9043j4 j4Var) {
        if (j4Var != C9043j4.f36995f) {
            this.f36949a = j4Var;
        } else {
            this.f36949a = C9043j4.f36994e;
        }
        C9043j4 j4Var2 = this.f36949a;
        if (j4Var2 == C9043j4.f36994e || j4Var2 == C9043j4.f36993d) {
            this.f36957i = C9605vb.m50451a(C9605vb.m50445a(0));
        }
        this.f36950b = 0;
    }

    /* renamed from: a */
    public void mo29471a() {
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.f39020L.f39542a;
            if (componentLocator != null) {
                componentLocator.mo31177m().mo29787a(this, (C9147n4) null);
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public void mo29472a(C9147n4 n4Var) {
        try {
            ComponentLocator componentLocator = (ComponentLocator) ComponentLocator.f39020L.f39542a;
            if (componentLocator != null) {
                componentLocator.mo31177m().mo29787a(this, (C9147n4) null);
            } else {
                n4Var.mo29453a(this, 3);
            }
        } catch (Throwable unused) {
        }
    }

    public C9023i4(Throwable th) {
        this.f36949a = C9043j4.f36995f;
        this.f36953e = C9605vb.m50470b(th);
        this.f36952d = C9605vb.m50451a(C9605vb.m50446a(th));
        this.f36957i = C9605vb.m50451a(C9605vb.m50445a(1));
        this.f36950b = 0;
    }

    /* renamed from: a */
    public static void m48681a(Throwable th) {
        try {
            new C9023i4(th).mo29471a();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m48682a(Throwable th, C9043j4 j4Var) {
        try {
            new C9023i4(th, j4Var).mo29471a();
        } catch (Throwable unused) {
        }
    }

    public C9023i4(Throwable th, C9043j4 j4Var) {
        boolean z = j4Var == C9043j4.f36997h;
        this.f36949a = j4Var;
        this.f36953e = C9605vb.m50470b(th);
        this.f36952d = C9605vb.m50451a(C9605vb.m50446a(th));
        this.f36957i = z ? th.getClass().getName() : C9605vb.m50451a(C9605vb.m50445a(1));
        this.f36950b = 0;
    }

    public C9023i4(C9043j4 j4Var, long j) {
        this.f36949a = j4Var;
        this.f36950b = j;
    }
}
