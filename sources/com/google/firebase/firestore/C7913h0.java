package com.google.firebase.firestore;

import p413z7.C13468e;

/* renamed from: com.google.firebase.firestore.h0 */
/* compiled from: LoadBundleTaskProgress */
public final class C7913h0 {

    /* renamed from: g */
    static final C7913h0 f34345g = new C7913h0(0, 0, 0, 0, (Exception) null, C7914a.SUCCESS);

    /* renamed from: a */
    private final int f34346a;

    /* renamed from: b */
    private final int f34347b;

    /* renamed from: c */
    private final long f34348c;

    /* renamed from: d */
    private final long f34349d;

    /* renamed from: e */
    private final C7914a f34350e;

    /* renamed from: f */
    private final Exception f34351f;

    /* renamed from: com.google.firebase.firestore.h0$a */
    /* compiled from: LoadBundleTaskProgress */
    public enum C7914a {
        ERROR,
        RUNNING,
        SUCCESS
    }

    public C7913h0(int i, int i2, long j, long j2, Exception exc, C7914a aVar) {
        this.f34346a = i;
        this.f34347b = i2;
        this.f34348c = j;
        this.f34349d = j2;
        this.f34350e = aVar;
        this.f34351f = exc;
    }

    /* renamed from: a */
    public static C7913h0 m43739a(C13468e eVar) {
        return new C7913h0(0, eVar.mo38568e(), 0, eVar.mo38567d(), (Exception) null, C7914a.RUNNING);
    }

    /* renamed from: b */
    public static C7913h0 m43740b(C13468e eVar) {
        return new C7913h0(eVar.mo38568e(), eVar.mo38568e(), eVar.mo38567d(), eVar.mo38567d(), (Exception) null, C7914a.SUCCESS);
    }

    /* renamed from: c */
    public long mo26374c() {
        return this.f34348c;
    }

    /* renamed from: d */
    public int mo26375d() {
        return this.f34346a;
    }

    /* renamed from: e */
    public C7914a mo26376e() {
        return this.f34350e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7913h0.class != obj.getClass()) {
            return false;
        }
        C7913h0 h0Var = (C7913h0) obj;
        if (this.f34346a != h0Var.f34346a || this.f34347b != h0Var.f34347b || this.f34348c != h0Var.f34348c || this.f34349d != h0Var.f34349d || this.f34350e != h0Var.f34350e) {
            return false;
        }
        Exception exc = this.f34351f;
        Exception exc2 = h0Var.f34351f;
        if (exc != null) {
            return exc.equals(exc2);
        }
        if (exc2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public long mo26378f() {
        return this.f34349d;
    }

    /* renamed from: g */
    public int mo26379g() {
        return this.f34347b;
    }

    public int hashCode() {
        long j = this.f34348c;
        long j2 = this.f34349d;
        int hashCode = ((((((((this.f34346a * 31) + this.f34347b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f34350e.hashCode()) * 31;
        Exception exc = this.f34351f;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }
}
