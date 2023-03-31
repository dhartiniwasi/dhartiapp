package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.s3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3723s3 implements C3130a4 {

    /* renamed from: a */
    private final C3591o3 f22665a;

    /* renamed from: b */
    private final C3724s4 f22666b;

    /* renamed from: c */
    private final boolean f22667c;

    /* renamed from: d */
    private final C3884x1 f22668d;

    private C3723s3(C3724s4 s4Var, C3884x1 x1Var, C3591o3 o3Var) {
        this.f22666b = s4Var;
        this.f22667c = x1Var.mo17025h(o3Var);
        this.f22668d = x1Var;
        this.f22665a = o3Var;
    }

    /* renamed from: k */
    static C3723s3 m26856k(C3724s4 s4Var, C3884x1 x1Var, C3591o3 o3Var) {
        return new C3723s3(s4Var, x1Var, o3Var);
    }

    /* renamed from: a */
    public final Object mo15699a() {
        C3591o3 o3Var = this.f22665a;
        if (o3Var instanceof C3425j2) {
            return ((C3425j2) o3Var).mo16214v();
        }
        return o3Var.mo16208l0().mo16058X();
    }

    /* renamed from: b */
    public final int mo15700b(Object obj) {
        C3724s4 s4Var = this.f22666b;
        int b = s4Var.mo16732b(s4Var.mo16734d(obj));
        if (!this.f22667c) {
            return b;
        }
        this.f22668d.mo17018a(obj);
        throw null;
    }

    /* renamed from: c */
    public final int mo15701c(Object obj) {
        int hashCode = this.f22666b.mo16734d(obj).hashCode();
        if (!this.f22667c) {
            return hashCode;
        }
        this.f22668d.mo17018a(obj);
        throw null;
    }

    /* renamed from: d */
    public final boolean mo15702d(Object obj) {
        this.f22668d.mo17018a(obj);
        throw null;
    }

    /* renamed from: e */
    public final void mo15703e(Object obj) {
        this.f22666b.mo16743m(obj);
        this.f22668d.mo17022e(obj);
    }

    /* renamed from: f */
    public final void mo15704f(Object obj, Object obj2) {
        C3196c4.m25267f(this.f22666b, obj, obj2);
        if (this.f22667c) {
            C3196c4.m25266e(this.f22668d, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo15705g(Object obj, Object obj2) {
        if (!this.f22666b.mo16734d(obj).equals(this.f22666b.mo16734d(obj2))) {
            return false;
        }
        if (!this.f22667c) {
            return true;
        }
        this.f22668d.mo17018a(obj);
        this.f22668d.mo17018a(obj2);
        throw null;
    }

    /* renamed from: h */
    public final void mo15706h(Object obj, byte[] bArr, int i, int i2, C3720s0 s0Var) throws IOException {
        C3425j2 j2Var = (C3425j2) obj;
        if (j2Var.zzc == C3757t4.m26978c()) {
            j2Var.zzc = C3757t4.m26980f();
        }
        C3359h2 h2Var = (C3359h2) obj;
        throw null;
    }

    /* renamed from: i */
    public final void mo15707i(Object obj, C3721s1 s1Var) throws IOException {
        this.f22668d.mo17018a(obj);
        throw null;
    }

    /* renamed from: j */
    public final void mo15708j(Object obj, C3950z3 z3Var, C3852w1 w1Var) throws IOException {
        boolean z;
        C3724s4 s4Var = this.f22666b;
        C3884x1 x1Var = this.f22668d;
        Object c = s4Var.mo16733c(obj);
        C3161b2 b = x1Var.mo17019b(obj);
        while (z3Var.mo16298e() != Integer.MAX_VALUE) {
            int b2 = z3Var.mo16292b();
            if (b2 != 11) {
                if ((b2 & 7) == 2) {
                    Object c2 = x1Var.mo17020c(w1Var, this.f22665a, b2 >>> 3);
                    if (c2 != null) {
                        x1Var.mo17023f(z3Var, c2, w1Var, b);
                    } else {
                        z = s4Var.mo16746p(c, z3Var);
                    }
                } else {
                    z = z3Var.mo16303i();
                }
                if (!z) {
                    s4Var.mo16744n(obj, c);
                    return;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                C3325g1 g1Var = null;
                while (true) {
                    try {
                        if (z3Var.mo16298e() == Integer.MAX_VALUE) {
                            break;
                        }
                        int b3 = z3Var.mo16292b();
                        if (b3 == 16) {
                            i = z3Var.mo16286W();
                            obj2 = x1Var.mo17020c(w1Var, this.f22665a, i);
                        } else if (b3 == 26) {
                            if (obj2 != null) {
                                x1Var.mo17023f(z3Var, obj2, w1Var, b);
                            } else {
                                g1Var = z3Var.mo16293b0();
                            }
                        } else if (!z3Var.mo16303i()) {
                            break;
                        }
                    } catch (Throwable th) {
                        s4Var.mo16744n(obj, c);
                        throw th;
                    }
                }
                if (z3Var.mo16292b() != 12) {
                    throw C3689r2.m26697b();
                } else if (g1Var != null) {
                    if (obj2 != null) {
                        x1Var.mo17024g(g1Var, obj2, w1Var, b);
                    } else {
                        s4Var.mo16741k(c, i, g1Var);
                    }
                }
            }
        }
        s4Var.mo16744n(obj, c);
    }
}
