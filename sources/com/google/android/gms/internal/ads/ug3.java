package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class ug3 implements sg3 {

    /* renamed from: a */
    private final ul3 f18528a;

    /* renamed from: b */
    private final Class f18529b;

    public ug3(ul3 ul3, Class cls) {
        if (ul3.mo14538j().contains(cls) || Void.class.equals(cls)) {
            this.f18528a = ul3;
            this.f18529b = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{ul3.toString(), cls.getName()}));
    }

    /* renamed from: f */
    private final tg3 m21624f() {
        return new tg3(this.f18528a.mo9607a());
    }

    /* renamed from: g */
    private final Object m21625g(cz3 cz3) throws GeneralSecurityException {
        if (!Void.class.equals(this.f18529b)) {
            this.f18528a.mo9610d(cz3);
            return this.f18528a.mo14537i(cz3, this.f18529b);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    /* renamed from: T */
    public final String mo13995T() {
        return this.f18528a.mo9609c();
    }

    /* renamed from: a */
    public final Object mo13996a(jw3 jw3) throws GeneralSecurityException {
        try {
            return m21625g(this.f18528a.mo9608b(jw3));
        } catch (ey3 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f18528a.mo14536h().getName()), e);
        }
    }

    /* renamed from: b */
    public final Object mo13997b(cz3 cz3) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(this.f18528a.mo14536h().getName());
        if (this.f18528a.mo14536h().isInstance(cz3)) {
            return m21625g(cz3);
        }
        throw new GeneralSecurityException(concat);
    }

    /* renamed from: c */
    public final cz3 mo13998c(jw3 jw3) throws GeneralSecurityException {
        try {
            return m21624f().mo14303a(jw3);
        } catch (ey3 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f18528a.mo9607a().mo14323e().getName()), e);
        }
    }

    /* renamed from: d */
    public final gs3 mo13999d(jw3 jw3) throws GeneralSecurityException {
        try {
            cz3 a = m21624f().mo14303a(jw3);
            fs3 G = gs3.m13499G();
            G.mo10292p(this.f18528a.mo9609c());
            G.mo10293r(a.mo9402e());
            G.mo10294s(this.f18528a.mo9611f());
            return (gs3) G.mo13423m();
        } catch (ey3 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: e */
    public final Class mo14000e() {
        return this.f18529b;
    }
}
