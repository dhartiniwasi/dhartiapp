package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3265e7 {

    /* renamed from: a */
    private static final Logger f21976a = Logger.getLogger(C3265e7.class.getName());

    /* renamed from: b */
    private static final AtomicReference f21977b = new AtomicReference(new C3396i6());

    /* renamed from: c */
    private static final ConcurrentMap f21978c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap f21979d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap f21980e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap f21981f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ConcurrentMap f21982g = new ConcurrentHashMap();

    private C3265e7() {
    }

    @Deprecated
    /* renamed from: a */
    public static C3165b6 m25470a(String str) throws GeneralSecurityException {
        return ((C3396i6) f21977b.get()).mo16160a(str);
    }

    /* renamed from: b */
    public static C3165b6 m25471b(String str) throws GeneralSecurityException {
        return ((C3396i6) f21977b.get()).mo16162c(str);
    }

    /* renamed from: c */
    public static synchronized C3442jj m25472c(C3607oj ojVar) throws GeneralSecurityException {
        C3442jj f;
        synchronized (C3265e7.class) {
            C3165b6 b = m25471b(ojVar.mo16512E());
            if (((Boolean) f21979d.get(ojVar.mo16512E())).booleanValue()) {
                f = b.mo15784f(ojVar.mo16511D());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(ojVar.mo16512E())));
            }
        }
        return f;
    }

    /* renamed from: d */
    public static synchronized C3591o3 m25473d(C3607oj ojVar) throws GeneralSecurityException {
        C3591o3 e;
        synchronized (C3265e7.class) {
            C3165b6 b = m25471b(ojVar.mo16512E());
            if (((Boolean) f21979d.get(ojVar.mo16512E())).booleanValue()) {
                e = b.mo15783e(ojVar.mo16511D());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(ojVar.mo16512E())));
            }
        }
        return e;
    }

    /* renamed from: e */
    public static Class m25474e(Class cls) {
        C3133a7 a7Var = (C3133a7) f21981f.get(cls);
        if (a7Var == null) {
            return null;
        }
        return a7Var.zza();
    }

    @Deprecated
    /* renamed from: f */
    public static Object m25475f(C3442jj jjVar) throws GeneralSecurityException {
        String E = jjVar.mo16226E();
        return ((C3396i6) f21977b.get()).mo16160a(E).mo15782d(jjVar.mo16225D());
    }

    /* renamed from: g */
    public static Object m25476g(C3442jj jjVar, Class cls) throws GeneralSecurityException {
        return m25477h(jjVar.mo16226E(), jjVar.mo16225D(), cls);
    }

    /* renamed from: h */
    public static Object m25477h(String str, C3325g1 g1Var, Class cls) throws GeneralSecurityException {
        return ((C3396i6) f21977b.get()).mo16161b(str, cls).mo15782d(g1Var);
    }

    /* renamed from: i */
    public static Object m25478i(String str, C3591o3 o3Var, Class cls) throws GeneralSecurityException {
        return ((C3396i6) f21977b.get()).mo16161b(str, cls).mo15781b(o3Var);
    }

    /* renamed from: j */
    public static Object m25479j(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return m25477h(str, C3325g1.m25613u(bArr), cls);
    }

    /* renamed from: k */
    public static Object m25480k(C3953z6 z6Var, Class cls) throws GeneralSecurityException {
        C3133a7 a7Var = (C3133a7) f21981f.get(cls);
        if (a7Var == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(z6Var.mo17096c().getName()));
        } else if (a7Var.zza().equals(z6Var.mo17096c())) {
            return a7Var.mo15717a(z6Var);
        } else {
            String obj = a7Var.zza().toString();
            String obj2 = z6Var.mo17096c().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    /* renamed from: l */
    static synchronized Map m25481l() {
        Map unmodifiableMap;
        synchronized (C3265e7.class) {
            unmodifiableMap = Collections.unmodifiableMap(f21982g);
        }
        return unmodifiableMap;
    }

    /* renamed from: m */
    public static synchronized void m25482m(C3369hc hcVar, C3533mb mbVar, boolean z) throws GeneralSecurityException {
        synchronized (C3265e7.class) {
            AtomicReference atomicReference = f21977b;
            C3396i6 i6Var = new C3396i6((C3396i6) atomicReference.get());
            i6Var.mo16163d(hcVar, mbVar);
            String d = hcVar.mo15789d();
            String d2 = mbVar.mo15789d();
            m25485p(d, hcVar.mo15786a().mo15722c(), true);
            m25485p(d2, Collections.emptyMap(), false);
            if (!((C3396i6) atomicReference.get()).mo16165f(d)) {
                f21978c.put(d, new C3232d7(hcVar));
                m25486q(hcVar.mo15789d(), hcVar.mo15786a().mo15722c());
            }
            ConcurrentMap concurrentMap = f21979d;
            concurrentMap.put(d, Boolean.TRUE);
            concurrentMap.put(d2, Boolean.FALSE);
            atomicReference.set(i6Var);
        }
    }

    /* renamed from: n */
    public static synchronized void m25483n(C3533mb mbVar, boolean z) throws GeneralSecurityException {
        synchronized (C3265e7.class) {
            AtomicReference atomicReference = f21977b;
            C3396i6 i6Var = new C3396i6((C3396i6) atomicReference.get());
            i6Var.mo16164e(mbVar);
            String d = mbVar.mo15789d();
            m25485p(d, mbVar.mo15786a().mo15722c(), true);
            if (!((C3396i6) atomicReference.get()).mo16165f(d)) {
                f21978c.put(d, new C3232d7(mbVar));
                m25486q(d, mbVar.mo15786a().mo15722c());
            }
            f21979d.put(d, Boolean.TRUE);
            atomicReference.set(i6Var);
        }
    }

    /* renamed from: o */
    public static synchronized void m25484o(C3133a7 a7Var) throws GeneralSecurityException {
        synchronized (C3265e7.class) {
            if (a7Var != null) {
                Class d = a7Var.mo15718d();
                ConcurrentMap concurrentMap = f21981f;
                if (concurrentMap.containsKey(d)) {
                    C3133a7 a7Var2 = (C3133a7) concurrentMap.get(d);
                    if (!a7Var.getClass().getName().equals(a7Var2.getClass().getName())) {
                        f21976a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(d.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{d.getName(), a7Var2.getClass().getName(), a7Var.getClass().getName()}));
                    }
                }
                concurrentMap.put(d, a7Var);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: p */
    private static synchronized void m25485p(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (C3265e7.class) {
            if (z) {
                ConcurrentMap concurrentMap = f21979d;
                if (concurrentMap.containsKey(str)) {
                    if (!((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((C3396i6) f21977b.get()).mo16165f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f21982g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f21982g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.android.gms.internal.firebase-auth-api.o3, java.lang.Object] */
    /* renamed from: q */
    private static void m25486q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f21982g.put((String) entry.getKey(), C3462k6.m25983e(str, ((C3467kb) entry.getValue()).f22290a.mo16478h(), ((C3467kb) entry.getValue()).f22291b));
        }
    }
}
