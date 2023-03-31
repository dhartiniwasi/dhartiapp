package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3396i6 {

    /* renamed from: b */
    private static final Logger f22138b = Logger.getLogger(C3396i6.class.getName());

    /* renamed from: a */
    private final ConcurrentMap f22139a;

    C3396i6() {
        this.f22139a = new ConcurrentHashMap();
    }

    /* renamed from: g */
    private final C3165b6 m25774g(String str, Class cls) throws GeneralSecurityException {
        C3363h6 h = m25775h(str);
        if (cls == null) {
            return h.mo16019d();
        }
        if (h.mo16016a().contains(cls)) {
            return h.mo16018c(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(h.mo16020e());
        Set<Class> a = h.mo16016a();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : a) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    /* renamed from: h */
    private final synchronized C3363h6 m25775h(String str) throws GeneralSecurityException {
        if (this.f22139a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (C3363h6) this.f22139a.get(str);
    }

    /* renamed from: i */
    private final synchronized void m25776i(C3363h6 h6Var, boolean z) throws GeneralSecurityException {
        String a = h6Var.mo16019d().mo15780a();
        C3363h6 h6Var2 = (C3363h6) this.f22139a.get(a);
        if (h6Var2 != null) {
            if (!h6Var2.mo16020e().equals(h6Var.mo16020e())) {
                f22138b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(a));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{a, h6Var2.mo16020e().getName(), h6Var.mo16020e().getName()}));
            }
        }
        if (!z) {
            this.f22139a.putIfAbsent(a, h6Var);
        } else {
            this.f22139a.put(a, h6Var);
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: a */
    public final C3165b6 mo16160a(String str) throws GeneralSecurityException {
        return m25774g(str, (Class) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C3165b6 mo16161b(String str, Class cls) throws GeneralSecurityException {
        return m25774g(str, cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C3165b6 mo16162c(String str) throws GeneralSecurityException {
        return m25775h(str).mo16019d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo16163d(C3369hc hcVar, C3533mb mbVar) throws GeneralSecurityException {
        Class b;
        int f = mbVar.mo16384f();
        if (!C3201c9.m25322a(1)) {
            String valueOf = String.valueOf(hcVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (C3201c9.m25322a(f)) {
            String d = hcVar.mo15789d();
            String d2 = mbVar.mo15789d();
            if (!(!this.f22139a.containsKey(d) || ((C3363h6) this.f22139a.get(d)).mo16017b() == null || (b = ((C3363h6) this.f22139a.get(d)).mo16017b()) == null)) {
                if (!b.getName().equals(mbVar.getClass().getName())) {
                    Logger logger = f22138b;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + d + " with inconsistent public key type " + d2);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{hcVar.getClass().getName(), b.getName(), mbVar.getClass().getName()}));
                }
            }
            m25776i(new C3330g6(hcVar, mbVar), true);
            m25776i(new C3297f6(mbVar), false);
        } else {
            String valueOf2 = String.valueOf(mbVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo16164e(C3533mb mbVar) throws GeneralSecurityException {
        if (C3201c9.m25322a(mbVar.mo16384f())) {
            m25776i(new C3297f6(mbVar), false);
        } else {
            String valueOf = String.valueOf(mbVar.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo16165f(String str) {
        return this.f22139a.containsKey(str);
    }

    C3396i6(C3396i6 i6Var) {
        this.f22139a = new ConcurrentHashMap(i6Var.f22139a);
    }
}
