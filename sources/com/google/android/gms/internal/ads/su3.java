package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class su3 {

    /* renamed from: b */
    private static final Logger f17663b = Logger.getLogger(su3.class.getName());

    /* renamed from: c */
    private static final List f17664c;

    /* renamed from: d */
    private static final boolean f17665d;

    /* renamed from: e */
    public static final su3 f17666e = new su3(new tu3());

    /* renamed from: f */
    public static final su3 f17667f = new su3(new xu3());

    /* renamed from: g */
    public static final su3 f17668g = new su3(new zu3());

    /* renamed from: h */
    public static final su3 f17669h = new su3(new yu3());

    /* renamed from: i */
    public static final su3 f17670i = new su3(new uu3());

    /* renamed from: j */
    public static final su3 f17671j = new su3(new wu3());

    /* renamed from: k */
    public static final su3 f17672k = new su3(new vu3());

    /* renamed from: a */
    private final av3 f17673a;

    static {
        if (uj3.m21664b()) {
            f17664c = m20646b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f17665d = false;
        } else if (kv3.m15635b()) {
            f17664c = m20646b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f17665d = true;
        } else {
            f17664c = new ArrayList();
            f17665d = true;
        }
    }

    public su3(av3 av3) {
        this.f17673a = av3;
    }

    /* renamed from: b */
    public static List m20646b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f17663b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object mo14144a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : f17664c) {
            try {
                return this.f17673a.mo8568a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f17665d) {
            return this.f17673a.mo8568a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
