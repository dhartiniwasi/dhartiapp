package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ah3 {

    /* renamed from: b */
    private static final Logger f6563b = Logger.getLogger(ah3.class.getName());

    /* renamed from: a */
    private final ConcurrentMap f6564a;

    ah3() {
        this.f6564a = new ConcurrentHashMap();
    }

    /* renamed from: g */
    private final synchronized zg3 m9726g(String str) throws GeneralSecurityException {
        if (this.f6564a.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zg3) this.f6564a.get(str);
    }

    /* renamed from: h */
    private final synchronized void m9727h(zg3 zg3, boolean z) throws GeneralSecurityException {
        String T = zg3.mo14749d().mo13995T();
        zg3 zg32 = (zg3) this.f6564a.get(T);
        if (zg32 != null) {
            if (!zg32.mo14750e().equals(zg3.mo14750e())) {
                f6563b.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(T));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{T, zg32.mo14750e().getName(), zg3.mo14750e().getName()}));
            }
        }
        if (!z) {
            this.f6564a.putIfAbsent(T, zg3);
        } else {
            this.f6564a.put(T, zg3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final sg3 mo8342a(String str, Class cls) throws GeneralSecurityException {
        zg3 g = m9726g(str);
        if (g.mo14746a().contains(cls)) {
            return g.mo14748c(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(g.mo14750e());
        Set<Class> a = g.mo14746a();
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

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final sg3 mo8343b(String str) throws GeneralSecurityException {
        return m9726g(str).mo14749d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo8344c(km3 km3, ul3 ul3) throws GeneralSecurityException {
        Class b;
        int e = ul3.mo10546e();
        if (!tj3.m21050a(1)) {
            String valueOf = String.valueOf(km3.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (tj3.m21050a(e)) {
            String c = km3.mo9609c();
            String c2 = ul3.mo9609c();
            if (!(!this.f6564a.containsKey(c) || ((zg3) this.f6564a.get(c)).mo14747b() == null || (b = ((zg3) this.f6564a.get(c)).mo14747b()) == null)) {
                if (!b.getName().equals(ul3.getClass().getName())) {
                    Logger logger = f6563b;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + c + " with inconsistent public key type " + c2);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{km3.getClass().getName(), b.getName(), ul3.getClass().getName()}));
                }
            }
            m9727h(new xg3(km3, ul3), true);
            m9727h(new wg3(ul3), false);
        } else {
            String valueOf2 = String.valueOf(ul3.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo8345d(sg3 sg3) throws GeneralSecurityException {
        if (tj3.m21050a(1)) {
            m9727h(new vg3(sg3), false);
        } else {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo8346e(ul3 ul3) throws GeneralSecurityException {
        if (tj3.m21050a(ul3.mo10546e())) {
            m9727h(new wg3(ul3), false);
        } else {
            String valueOf = String.valueOf(ul3.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo8347f(String str) {
        return this.f6564a.containsKey(str);
    }

    ah3(ah3 ah3) {
        this.f6564a = new ConcurrentHashMap(ah3.f6564a);
    }
}
