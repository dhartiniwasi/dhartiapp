package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ra */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7156ra implements C7268ya {

    /* renamed from: a */
    private final C7092na f32024a;

    /* renamed from: b */
    private final C7141qb f32025b;

    /* renamed from: c */
    private final boolean f32026c;

    /* renamed from: d */
    private final C7202u8 f32027d;

    private C7156ra(C7141qb qbVar, C7202u8 u8Var, C7092na naVar) {
        this.f32025b = qbVar;
        this.f32026c = u8Var.mo23930c(naVar);
        this.f32027d = u8Var;
        this.f32024a = naVar;
    }

    /* renamed from: j */
    static C7156ra m40803j(C7141qb qbVar, C7202u8 u8Var, C7092na naVar) {
        return new C7156ra(qbVar, u8Var, naVar);
    }

    /* renamed from: a */
    public final Object mo23782a() {
        C7092na naVar = this.f32024a;
        if (naVar instanceof C6995h9) {
            return ((C6995h9) naVar).mo23493j();
        }
        return naVar.mo23487c().mo23362q();
    }

    /* renamed from: b */
    public final int mo23783b(Object obj) {
        C7141qb qbVar = this.f32025b;
        int b = qbVar.mo23792b(qbVar.mo23794d(obj));
        if (!this.f32026c) {
            return b;
        }
        this.f32027d.mo23928a(obj);
        throw null;
    }

    /* renamed from: c */
    public final int mo23784c(Object obj) {
        int hashCode = this.f32025b.mo23794d(obj).hashCode();
        if (!this.f32026c) {
            return hashCode;
        }
        this.f32027d.mo23928a(obj);
        throw null;
    }

    /* renamed from: d */
    public final boolean mo23785d(Object obj) {
        this.f32027d.mo23928a(obj);
        throw null;
    }

    /* renamed from: e */
    public final void mo23786e(Object obj) {
        this.f32025b.mo23797g(obj);
        this.f32027d.mo23929b(obj);
    }

    /* renamed from: f */
    public final void mo23787f(Object obj, Object obj2) {
        C6878ab.m39509f(this.f32025b, obj, obj2);
        if (this.f32026c) {
            C6878ab.m39508e(this.f32027d, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo23788g(Object obj, Object obj2) {
        if (!this.f32025b.mo23794d(obj).equals(this.f32025b.mo23794d(obj2))) {
            return false;
        }
        if (!this.f32026c) {
            return true;
        }
        this.f32027d.mo23928a(obj);
        this.f32027d.mo23928a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final void mo23789h(Object obj, C7030jc jcVar) throws IOException {
        this.f32027d.mo23928a(obj);
        throw null;
    }

    /* renamed from: i */
    public final void mo23790i(Object obj, byte[] bArr, int i, int i2, C7169s7 s7Var) throws IOException {
        C6995h9 h9Var = (C6995h9) obj;
        if (h9Var.zzc == C7157rb.m40813c()) {
            h9Var.zzc = C7157rb.m40815f();
        }
        C6961f9 f9Var = (C6961f9) obj;
        throw null;
    }
}
