package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xh3 {

    /* renamed from: a */
    private static final Logger f20100a = Logger.getLogger(xh3.class.getName());

    /* renamed from: b */
    private static final AtomicReference f20101b = new AtomicReference(new ah3());

    /* renamed from: c */
    private static final ConcurrentMap f20102c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap f20103d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap f20104e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap f20105f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final ConcurrentMap f20106g = new ConcurrentHashMap();

    private xh3() {
    }

    @Deprecated
    /* renamed from: a */
    public static lg3 m23216a(String str) throws GeneralSecurityException {
        if (str != null) {
            ConcurrentMap concurrentMap = f20104e;
            Locale locale = Locale.US;
            lg3 lg3 = (lg3) concurrentMap.get(str.toLowerCase(locale));
            if (lg3 != null) {
                return lg3;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase(locale).startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tinkpublickeysign") || str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase(locale).startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: b */
    public static sg3 m23217b(String str) throws GeneralSecurityException {
        return ((ah3) f20101b.get()).mo8343b(str);
    }

    /* renamed from: c */
    public static synchronized gs3 m23218c(ms3 ms3) throws GeneralSecurityException {
        gs3 d;
        synchronized (xh3.class) {
            sg3 b = m23217b(ms3.mo12433K());
            if (((Boolean) f20103d.get(ms3.mo12433K())).booleanValue()) {
                d = b.mo13999d(ms3.mo12432J());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(ms3.mo12433K())));
            }
        }
        return d;
    }

    /* renamed from: d */
    public static synchronized cz3 m23219d(ms3 ms3) throws GeneralSecurityException {
        cz3 c;
        synchronized (xh3.class) {
            sg3 b = m23217b(ms3.mo12433K());
            if (((Boolean) f20103d.get(ms3.mo12433K())).booleanValue()) {
                c = b.mo13998c(ms3.mo12432J());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(ms3.mo12433K())));
            }
        }
        return c;
    }

    /* renamed from: e */
    public static Class m23220e(Class cls) {
        uh3 uh3 = (uh3) f20105f.get(cls);
        if (uh3 == null) {
            return null;
        }
        return uh3.zza();
    }

    /* renamed from: f */
    public static Object m23221f(gs3 gs3, Class cls) throws GeneralSecurityException {
        return m23222g(gs3.mo10635K(), gs3.mo10634J(), cls);
    }

    /* renamed from: g */
    public static Object m23222g(String str, jw3 jw3, Class cls) throws GeneralSecurityException {
        return ((ah3) f20101b.get()).mo8342a(str, cls).mo13996a(jw3);
    }

    /* renamed from: h */
    public static Object m23223h(String str, cz3 cz3, Class cls) throws GeneralSecurityException {
        return ((ah3) f20101b.get()).mo8342a(str, cls).mo13997b(cz3);
    }

    /* renamed from: i */
    public static Object m23224i(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return m23222g(str, jw3.m15086K(bArr), cls);
    }

    /* renamed from: j */
    public static Object m23225j(th3 th3, Class cls) throws GeneralSecurityException {
        uh3 uh3 = (uh3) f20105f.get(cls);
        if (uh3 == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(th3.mo14308c().getName()));
        } else if (uh3.zza().equals(th3.mo14308c())) {
            return uh3.mo8420a(th3);
        } else {
            String obj = uh3.zza().toString();
            String obj2 = th3.mo14308c().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    /* renamed from: k */
    static synchronized Map m23226k() {
        Map unmodifiableMap;
        synchronized (xh3.class) {
            unmodifiableMap = Collections.unmodifiableMap(f20106g);
        }
        return unmodifiableMap;
    }

    /* renamed from: l */
    public static synchronized void m23227l(km3 km3, ul3 ul3, boolean z) throws GeneralSecurityException {
        synchronized (xh3.class) {
            AtomicReference atomicReference = f20101b;
            ah3 ah3 = new ah3((ah3) atomicReference.get());
            ah3.mo8344c(km3, ul3);
            String c = km3.mo9609c();
            String c2 = ul3.mo9609c();
            m23231p(c, km3.mo9607a().mo8859c(), true);
            m23231p(c2, Collections.emptyMap(), false);
            if (!((ah3) atomicReference.get()).mo8347f(c)) {
                f20102c.put(c, new wh3(km3));
                m23232q(km3.mo9609c(), km3.mo9607a().mo8859c());
            }
            ConcurrentMap concurrentMap = f20103d;
            concurrentMap.put(c, Boolean.TRUE);
            concurrentMap.put(c2, Boolean.FALSE);
            atomicReference.set(ah3);
        }
    }

    /* renamed from: m */
    public static synchronized void m23228m(sg3 sg3, boolean z) throws GeneralSecurityException {
        synchronized (xh3.class) {
            if (sg3 != null) {
                try {
                    AtomicReference atomicReference = f20101b;
                    ah3 ah3 = new ah3((ah3) atomicReference.get());
                    ah3.mo8345d(sg3);
                    if (tj3.m21050a(1)) {
                        String T = sg3.mo13995T();
                        m23231p(T, Collections.emptyMap(), z);
                        f20103d.put(T, Boolean.valueOf(z));
                        atomicReference.set(ah3);
                    } else {
                        throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: n */
    public static synchronized void m23229n(ul3 ul3, boolean z) throws GeneralSecurityException {
        synchronized (xh3.class) {
            AtomicReference atomicReference = f20101b;
            ah3 ah3 = new ah3((ah3) atomicReference.get());
            ah3.mo8346e(ul3);
            String c = ul3.mo9609c();
            m23231p(c, ul3.mo9607a().mo8859c(), true);
            if (!((ah3) atomicReference.get()).mo8347f(c)) {
                f20102c.put(c, new wh3(ul3));
                m23232q(c, ul3.mo9607a().mo8859c());
            }
            f20103d.put(c, Boolean.TRUE);
            atomicReference.set(ah3);
        }
    }

    /* renamed from: o */
    public static synchronized void m23230o(uh3 uh3) throws GeneralSecurityException {
        synchronized (xh3.class) {
            if (uh3 != null) {
                Class d = uh3.mo8421d();
                ConcurrentMap concurrentMap = f20105f;
                if (concurrentMap.containsKey(d)) {
                    uh3 uh32 = (uh3) concurrentMap.get(d);
                    if (!uh3.getClass().getName().equals(uh32.getClass().getName())) {
                        f20100a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(d.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{d.getName(), uh32.getClass().getName(), uh3.getClass().getName()}));
                    }
                }
                concurrentMap.put(d, uh3);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    /* renamed from: p */
    private static synchronized void m23231p(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (xh3.class) {
            if (z) {
                ConcurrentMap concurrentMap = f20103d;
                if (concurrentMap.containsKey(str)) {
                    if (!((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((ah3) f20101b.get()).mo8347f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f20106g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f20106g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.ads.cz3] */
    /* renamed from: q */
    private static void m23232q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f20106g.put((String) entry.getKey(), ch3.m10939e(str, ((sl3) entry.getValue()).f17549a.mo9400b(), ((sl3) entry.getValue()).f17550b));
        }
    }
}
