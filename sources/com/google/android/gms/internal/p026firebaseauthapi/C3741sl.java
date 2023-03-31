package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3741sl {

    /* renamed from: b */
    private static final Logger f22684b = Logger.getLogger(C3741sl.class.getName());

    /* renamed from: c */
    private static final List f22685c;

    /* renamed from: d */
    private static final boolean f22686d;

    /* renamed from: e */
    public static final C3741sl f22687e = new C3741sl(new C3807ul());

    /* renamed from: f */
    public static final C3741sl f22688f = new C3741sl(new C3936yl());

    /* renamed from: g */
    public static final C3741sl f22689g = new C3741sl(new C3148am());

    /* renamed from: h */
    public static final C3741sl f22690h = new C3741sl(new C3968zl());

    /* renamed from: i */
    public static final C3741sl f22691i = new C3741sl(new C3840vl());

    /* renamed from: j */
    public static final C3741sl f22692j = new C3741sl(new C3904xl());

    /* renamed from: k */
    public static final C3741sl f22693k = new C3741sl(new C3872wl());

    /* renamed from: a */
    private final C3181bm f22694a;

    static {
        if (C3234d9.m25412b()) {
            f22685c = m26926b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f22686d = false;
        } else if (C3511lm.m26124a()) {
            f22685c = m26926b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f22686d = true;
        } else {
            f22685c = new ArrayList();
            f22686d = true;
        }
    }

    public C3741sl(C3181bm bmVar) {
        this.f22694a = bmVar;
    }

    /* renamed from: b */
    public static List m26926b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f22684b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object mo16763a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : f22685c) {
            try {
                return this.f22694a.mo15745a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f22686d) {
            return this.f22694a.mo15745a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
