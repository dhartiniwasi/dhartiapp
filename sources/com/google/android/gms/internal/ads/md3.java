package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fd3;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class md3 extends gd3 {
    /* synthetic */ md3(fd3.C2360a aVar) {
        super((fd3.C2360a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final jd3 mo10479a(fd3 fd3, jd3 jd3) {
        jd3 m;
        synchronized (fd3) {
            m = fd3.f9234b;
            if (m != jd3) {
                jd3 unused = fd3.f9234b = jd3;
            }
        }
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final qd3 mo10480b(fd3 fd3, qd3 qd3) {
        qd3 o;
        synchronized (fd3) {
            o = fd3.f9235c;
            if (o != qd3) {
                qd3 unused = fd3.f9235c = qd3;
            }
        }
        return o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo10481c(qd3 qd3, qd3 qd32) {
        qd3.f16349b = qd32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo10482d(qd3 qd3, Thread thread) {
        qd3.f16348a = thread;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo10483e(fd3 fd3, jd3 jd3, jd3 jd32) {
        synchronized (fd3) {
            if (fd3.f9234b != jd3) {
                return false;
            }
            jd3 unused = fd3.f9234b = jd32;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final boolean mo10484f(fd3 fd3, Object obj, Object obj2) {
        synchronized (fd3) {
            if (fd3.f9233a != obj) {
                return false;
            }
            Object unused = fd3.f9233a = obj2;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo10485g(fd3 fd3, qd3 qd3, qd3 qd32) {
        synchronized (fd3) {
            if (fd3.f9235c != qd3) {
                return false;
            }
            qd3 unused = fd3.f9235c = qd32;
            return true;
        }
    }
}
