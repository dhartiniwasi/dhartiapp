package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class qa4 {

    /* renamed from: a */
    private final dq0 f16323a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ua3 f16324b = ua3.m21508w();

    /* renamed from: c */
    private xa3 f16325c = xa3.m23155e();

    /* renamed from: d */
    private mg4 f16326d;

    /* renamed from: e */
    private mg4 f16327e;

    /* renamed from: f */
    private mg4 f16328f;

    public qa4(dq0 dq0) {
        this.f16323a = dq0;
    }

    /* renamed from: j */
    private static mg4 m19127j(zl0 zl0, ua3 ua3, mg4 mg4, dq0 dq0) {
        gt0 a0 = zl0.mo9053a0();
        int c = zl0.mo9055c();
        Object f = a0.mo10643o() ? null : a0.mo8904f(c);
        int c2 = (zl0.mo9057d0() || a0.mo10643o()) ? -1 : a0.mo8902d(c, dq0, false).mo9652c(gb2.m13168f0(zl0.mo9051Z()));
        for (int i = 0; i < ua3.size(); i++) {
            mg4 mg42 = (mg4) ua3.get(i);
            if (m19130m(mg42, f, zl0.mo9057d0(), zl0.mo9054b(), zl0.mo9052a(), c2)) {
                return mg42;
            }
        }
        if (ua3.isEmpty() && mg4 != null) {
            if (m19130m(mg4, f, zl0.mo9057d0(), zl0.mo9054b(), zl0.mo9052a(), c2)) {
                return mg4;
            }
        }
        return null;
    }

    /* renamed from: k */
    private final void m19128k(wa3 wa3, mg4 mg4, gt0 gt0) {
        if (mg4 != null) {
            if (gt0.mo8899a(mg4.f12629a) != -1) {
                wa3.mo14881a(mg4, gt0);
                return;
            }
            gt0 gt02 = (gt0) this.f16325c.get(mg4);
            if (gt02 != null) {
                wa3.mo14881a(mg4, gt02);
            }
        }
    }

    /* renamed from: l */
    private final void m19129l(gt0 gt0) {
        wa3 wa3 = new wa3();
        if (this.f16324b.isEmpty()) {
            m19128k(wa3, this.f16327e, gt0);
            if (!w73.m22614a(this.f16328f, this.f16327e)) {
                m19128k(wa3, this.f16328f, gt0);
            }
            if (!w73.m22614a(this.f16326d, this.f16327e) && !w73.m22614a(this.f16326d, this.f16328f)) {
                m19128k(wa3, this.f16326d, gt0);
            }
        } else {
            for (int i = 0; i < this.f16324b.size(); i++) {
                m19128k(wa3, (mg4) this.f16324b.get(i), gt0);
            }
            if (!this.f16324b.contains(this.f16326d)) {
                m19128k(wa3, this.f16326d, gt0);
            }
        }
        this.f16325c = wa3.mo14883c();
    }

    /* renamed from: m */
    private static boolean m19130m(mg4 mg4, Object obj, boolean z, int i, int i2, int i3) {
        if (!mg4.f12629a.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(mg4.f12630b == i && mg4.f12631c == i2)) {
                return false;
            }
        } else if (!(mg4.f12630b == -1 && mg4.f12633e == i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final gt0 mo13501a(mg4 mg4) {
        return (gt0) this.f16325c.get(mg4);
    }

    /* renamed from: b */
    public final mg4 mo13502b() {
        return this.f16326d;
    }

    /* renamed from: c */
    public final mg4 mo13503c() {
        Object obj;
        Object next;
        if (this.f16324b.isEmpty()) {
            return null;
        }
        ua3 ua3 = this.f16324b;
        if (!(ua3 instanceof List)) {
            Iterator it = ua3.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        } else if (!ua3.isEmpty()) {
            obj = ua3.get(ua3.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (mg4) obj;
    }

    /* renamed from: d */
    public final mg4 mo13504d() {
        return this.f16327e;
    }

    /* renamed from: e */
    public final mg4 mo13505e() {
        return this.f16328f;
    }

    /* renamed from: g */
    public final void mo13506g(zl0 zl0) {
        this.f16326d = m19127j(zl0, this.f16324b, this.f16327e, this.f16323a);
    }

    /* renamed from: h */
    public final void mo13507h(List list, mg4 mg4, zl0 zl0) {
        this.f16324b = ua3.m21506u(list);
        if (!list.isEmpty()) {
            this.f16327e = (mg4) list.get(0);
            Objects.requireNonNull(mg4);
            this.f16328f = mg4;
        }
        if (this.f16326d == null) {
            this.f16326d = m19127j(zl0, this.f16324b, this.f16327e, this.f16323a);
        }
        m19129l(zl0.mo9053a0());
    }

    /* renamed from: i */
    public final void mo13508i(zl0 zl0) {
        this.f16326d = m19127j(zl0, this.f16324b, this.f16327e, this.f16323a);
        m19129l(zl0.mo9053a0());
    }
}
