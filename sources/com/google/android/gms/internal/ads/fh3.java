package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fh3 {

    /* renamed from: a */
    private final rs3 f9284a;

    private fh3(rs3 rs3) {
        this.f9284a = rs3;
    }

    /* renamed from: d */
    public static fh3 m12616d() {
        return new fh3(us3.m21841I());
    }

    /* renamed from: e */
    private final synchronized int m12617e() {
        int a;
        a = um3.m21730a();
        while (m12619g(a)) {
            a = um3.m21730a();
        }
        return a;
    }

    /* renamed from: f */
    private final synchronized ts3 m12618f(ms3 ms3) throws GeneralSecurityException {
        return m12620h(xh3.m23218c(ms3), ms3.mo12434N());
    }

    /* renamed from: g */
    private final synchronized boolean m12619g(int i) {
        boolean z;
        Iterator it = this.f9284a.mo13879s().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((ts3) it.next()).mo14377G() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    /* renamed from: h */
    private final synchronized ts3 m12620h(gs3 gs3, int i) throws GeneralSecurityException {
        ss3 I;
        int e = m12617e();
        if (i != 2) {
            I = ts3.m21216I();
            I.mo14130p(gs3);
            I.mo14131r(e);
            I.mo14133u(3);
            I.mo14132s(i);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (ts3) I.mo13423m();
    }

    @Deprecated
    /* renamed from: a */
    public final synchronized int mo10163a(ms3 ms3, boolean z) throws GeneralSecurityException {
        ts3 f;
        f = m12618f(ms3);
        this.f9284a.mo13877p(f);
        this.f9284a.mo13878r(f.mo14377G());
        return f.mo14377G();
    }

    /* renamed from: b */
    public final synchronized eh3 mo10164b() throws GeneralSecurityException {
        return eh3.m12109a((us3) this.f9284a.mo13423m());
    }

    @Deprecated
    /* renamed from: c */
    public final synchronized fh3 mo10165c(ms3 ms3) throws GeneralSecurityException {
        mo10163a(ms3, true);
        return this;
    }
}
