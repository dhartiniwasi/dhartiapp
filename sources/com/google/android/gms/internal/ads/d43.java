package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class d43 {

    /* renamed from: g */
    private static final HashMap f8050g = new HashMap();

    /* renamed from: a */
    private final Context f8051a;

    /* renamed from: b */
    private final e43 f8052b;

    /* renamed from: c */
    private final e23 f8053c;

    /* renamed from: d */
    private final z13 f8054d;

    /* renamed from: e */
    private s33 f8055e;

    /* renamed from: f */
    private final Object f8056f = new Object();

    public d43(Context context, e43 e43, e23 e23, z13 z13) {
        this.f8051a = context;
        this.f8052b = e43;
        this.f8053c = e23;
        this.f8054d = z13;
    }

    /* renamed from: d */
    private final synchronized Class m11310d(t33 t33) throws c43 {
        String P = t33.mo14199a().mo13800P();
        HashMap hashMap = f8050g;
        Class cls = (Class) hashMap.get(P);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.f8054d.mo15534a(t33.mo14201c())) {
                File b = t33.mo14200b();
                if (!b.exists()) {
                    b.mkdirs();
                }
                Class loadClass = new DexClassLoader(t33.mo14201c().getAbsolutePath(), b.getAbsolutePath(), (String) null, this.f8051a.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                hashMap.put(P, loadClass);
                return loadClass;
            }
            throw new c43(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e) {
            throw new c43(2026, (Throwable) e);
        } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
            throw new c43((int) AdError.REMOTE_ADS_SERVICE_ERROR, e2);
        }
    }

    /* renamed from: a */
    public final i23 mo9432a() {
        s33 s33;
        synchronized (this.f8056f) {
            s33 = this.f8055e;
        }
        return s33;
    }

    /* renamed from: b */
    public final t33 mo9433b() {
        synchronized (this.f8056f) {
            s33 s33 = this.f8055e;
            if (s33 == null) {
                return null;
            }
            t33 f = s33.mo13945f();
            return f;
        }
    }

    /* renamed from: c */
    public final boolean mo9434c(t33 t33) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Class d = m11310d(t33);
            s33 s33 = new s33(d.getDeclaredConstructor(new Class[]{Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE}).newInstance(new Object[]{this.f8051a, "msa-r", t33.mo14203e(), null, new Bundle(), 2}), t33, this.f8052b, this.f8053c);
            if (s33.mo13947h()) {
                int e = s33.mo13944e();
                if (e == 0) {
                    synchronized (this.f8056f) {
                        s33 s332 = this.f8055e;
                        if (s332 != null) {
                            try {
                                s332.mo13946g();
                            } catch (c43 e2) {
                                this.f8053c.mo9788c(e2.mo9018a(), -1, e2);
                            }
                        }
                        this.f8055e = s33;
                    }
                    this.f8053c.mo9789d(3000, System.currentTimeMillis() - currentTimeMillis);
                    return true;
                }
                throw new c43(4001, "ci: " + e);
            }
            throw new c43(4000, "init failed");
        } catch (Exception e3) {
            throw new c43((int) AdError.INTERNAL_ERROR_2004, (Throwable) e3);
        } catch (c43 e4) {
            this.f8053c.mo9788c(e4.mo9018a(), System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.f8053c.mo9788c(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }
}
