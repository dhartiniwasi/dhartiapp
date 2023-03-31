package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ic */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3402ic implements C3501lc {

    /* renamed from: a */
    private final String f22152a;

    /* renamed from: b */
    private final C3643pm f22153b;

    /* renamed from: c */
    private final C3325g1 f22154c;

    /* renamed from: d */
    private final C3409ij f22155d;

    /* renamed from: e */
    private final C3674qk f22156e;

    /* renamed from: f */
    private final Integer f22157f;

    private C3402ic(String str, C3325g1 g1Var, C3409ij ijVar, C3674qk qkVar, Integer num) {
        this.f22152a = str;
        this.f22153b = C3798uc.m27130b(str);
        this.f22154c = g1Var;
        this.f22155d = ijVar;
        this.f22156e = qkVar;
        this.f22157f = num;
    }

    /* renamed from: a */
    public static C3402ic m25793a(String str, C3325g1 g1Var, C3409ij ijVar, C3674qk qkVar, Integer num) throws GeneralSecurityException {
        if (qkVar == C3674qk.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C3402ic(str, g1Var, ijVar, qkVar, num);
    }

    /* renamed from: b */
    public final C3643pm mo16168b() {
        return this.f22153b;
    }

    /* renamed from: c */
    public final C3409ij mo16169c() {
        return this.f22155d;
    }

    /* renamed from: d */
    public final C3674qk mo16170d() {
        return this.f22156e;
    }

    /* renamed from: e */
    public final C3325g1 mo16171e() {
        return this.f22154c;
    }

    /* renamed from: f */
    public final Integer mo16172f() {
        return this.f22157f;
    }

    /* renamed from: g */
    public final String mo16173g() {
        return this.f22152a;
    }
}
