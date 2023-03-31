package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.C2051a.C2055d;
import com.google.android.gms.common.api.C2063c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2079d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p007a5.C0116l;
import p017b5.C1787b;
import p017b5.C1788b0;
import p017b5.C1798g0;
import p017b5.C1802i0;
import p017b5.C1808l0;
import p017b5.C1819r;
import p017b5.C1825w;
import p033d5.C4133p;
import p033d5.C4141r;
import p047f5.C4287e;
import p067i5.C4688b;
import p124r.C5413a;
import p180z4.C6362b;
import p180z4.C6366d;
import p218e6.C9977j;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2115o0<O extends C2051a.C2055d> implements GoogleApiClient.C2049b, GoogleApiClient.C2050c, C1808l0 {

    /* renamed from: a */
    private final Queue<C2085e1> f6248a = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2051a.C2060f f6249b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1787b<O> f6250c;

    /* renamed from: d */
    private final C2102k f6251d;

    /* renamed from: e */
    private final Set<C1802i0> f6252e = new HashSet();

    /* renamed from: f */
    private final Map<C2079d.C2080a<?>, C1788b0> f6253f = new HashMap();

    /* renamed from: g */
    private final int f6254g;

    /* renamed from: h */
    private final C1798g0 f6255h;

    /* renamed from: i */
    private boolean f6256i;

    /* renamed from: r */
    private final List<C2118p0> f6257r = new ArrayList();

    /* renamed from: s */
    private C6362b f6258s = null;

    /* renamed from: t */
    private int f6259t = 0;

    /* renamed from: u */
    final /* synthetic */ C2076c f6260u;

    public C2115o0(C2076c cVar, C2063c<O> cVar2) {
        this.f6260u = cVar;
        C2051a.C2060f n = cVar2.mo7981n(cVar.f6136x.getLooper(), this);
        this.f6249b = n;
        this.f6250c = cVar2.mo7977j();
        this.f6251d = new C2102k();
        this.f6254g = cVar2.mo7980m();
        if (n.mo6948s()) {
            this.f6255h = cVar2.mo7982o(cVar.f6127g, cVar.f6136x);
        } else {
            this.f6255h = null;
        }
    }

    /* renamed from: A */
    static /* bridge */ /* synthetic */ void m9384A(C2115o0 o0Var, C2118p0 p0Var) {
        C6366d[] g;
        if (o0Var.f6257r.remove(p0Var)) {
            o0Var.f6260u.f6136x.removeMessages(15, p0Var);
            o0Var.f6260u.f6136x.removeMessages(16, p0Var);
            C6366d a = p0Var.f6265b;
            ArrayList arrayList = new ArrayList(o0Var.f6248a.size());
            for (C2085e1 e1Var : o0Var.f6248a) {
                if ((e1Var instanceof C1825w) && (g = ((C1825w) e1Var).mo7001g(o0Var)) != null && C4688b.m30368c(g, a)) {
                    arrayList.add(e1Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2085e1 e1Var2 = (C2085e1) arrayList.get(i);
                o0Var.f6248a.remove(e1Var2);
                e1Var2.mo8032b(new C0116l(a));
            }
        }
    }

    /* renamed from: b */
    private final C6366d m9386b(C6366d[] dVarArr) {
        if (!(dVarArr == null || dVarArr.length == 0)) {
            C6366d[] n = this.f6249b.mo6943n();
            if (n == null) {
                n = new C6366d[0];
            }
            C5413a aVar = new C5413a(r3);
            for (C6366d dVar : n) {
                aVar.put(dVar.mo21764I1(), Long.valueOf(dVar.mo21765J1()));
            }
            for (C6366d dVar2 : dVarArr) {
                Long l = (Long) aVar.get(dVar2.mo21764I1());
                if (l == null || l.longValue() < dVar2.mo21765J1()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m9387c(C6362b bVar) {
        for (C1802i0 b : this.f6252e) {
            b.mo6961b(this.f6250c, bVar, C4133p.m28193a(bVar, C6362b.f30577e) ? this.f6249b.mo6937g() : null);
        }
        this.f6252e.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m9388d(Status status) {
        C4141r.m28214d(this.f6260u.f6136x);
        m9389e(status, (Exception) null, false);
    }

    /* renamed from: e */
    private final void m9389e(Status status, Exception exc, boolean z) {
        C4141r.m28214d(this.f6260u.f6136x);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f6248a.iterator();
            while (it.hasNext()) {
                C2085e1 e1Var = (C2085e1) it.next();
                if (!z || e1Var.f6150a == 2) {
                    if (status != null) {
                        e1Var.mo8031a(status);
                    } else {
                        e1Var.mo8032b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* renamed from: f */
    private final void m9390f() {
        ArrayList arrayList = new ArrayList(this.f6248a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C2085e1 e1Var = (C2085e1) arrayList.get(i);
            if (this.f6249b.mo6930a()) {
                if (m9396l(e1Var)) {
                    this.f6248a.remove(e1Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m9391g() {
        mo8097B();
        m9387c(C6362b.f30577e);
        m9395k();
        Iterator<C1788b0> it = this.f6253f.values().iterator();
        if (!it.hasNext()) {
            m9390f();
            m9393i();
            return;
        }
        C2086f<C2051a.C2053b, ?> fVar = it.next().f5316a;
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m9392h(int i) {
        mo8097B();
        this.f6256i = true;
        this.f6251d.mo8083e(i, this.f6249b.mo6946p());
        C2076c cVar = this.f6260u;
        cVar.f6136x.sendMessageDelayed(Message.obtain(cVar.f6136x, 9, this.f6250c), this.f6260u.f6121a);
        C2076c cVar2 = this.f6260u;
        cVar2.f6136x.sendMessageDelayed(Message.obtain(cVar2.f6136x, 11, this.f6250c), this.f6260u.f6122b);
        this.f6260u.f6129i.mo17423c();
        for (C1788b0 b0Var : this.f6253f.values()) {
            b0Var.f5317b.run();
        }
    }

    /* renamed from: i */
    private final void m9393i() {
        this.f6260u.f6136x.removeMessages(12, this.f6250c);
        C2076c cVar = this.f6260u;
        cVar.f6136x.sendMessageDelayed(cVar.f6136x.obtainMessage(12, this.f6250c), this.f6260u.f6123c);
    }

    /* renamed from: j */
    private final void m9394j(C2085e1 e1Var) {
        e1Var.mo8034d(this.f6251d, mo8108N());
        try {
            e1Var.mo8033c(this);
        } catch (DeadObjectException unused) {
            mo6919p(1);
            this.f6249b.mo6933d("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: k */
    private final void m9395k() {
        if (this.f6256i) {
            this.f6260u.f6136x.removeMessages(11, this.f6250c);
            this.f6260u.f6136x.removeMessages(9, this.f6250c);
            this.f6256i = false;
        }
    }

    /* renamed from: l */
    private final boolean m9396l(C2085e1 e1Var) {
        if (!(e1Var instanceof C1825w)) {
            m9394j(e1Var);
            return true;
        }
        C1825w wVar = (C1825w) e1Var;
        C6366d b = m9386b(wVar.mo7001g(this));
        if (b == null) {
            m9394j(e1Var);
            return true;
        }
        String name = this.f6249b.getClass().getName();
        String I1 = b.mo21764I1();
        long J1 = b.mo21765J1();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(I1).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(I1);
        sb.append(", ");
        sb.append(J1);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f6260u.f6137y || !wVar.mo7000f(this)) {
            wVar.mo8032b(new C0116l(b));
            return true;
        }
        C2118p0 p0Var = new C2118p0(this.f6250c, b, (C1819r) null);
        int indexOf = this.f6257r.indexOf(p0Var);
        if (indexOf >= 0) {
            C2118p0 p0Var2 = this.f6257r.get(indexOf);
            this.f6260u.f6136x.removeMessages(15, p0Var2);
            C2076c cVar = this.f6260u;
            cVar.f6136x.sendMessageDelayed(Message.obtain(cVar.f6136x, 15, p0Var2), this.f6260u.f6121a);
            return false;
        }
        this.f6257r.add(p0Var);
        C2076c cVar2 = this.f6260u;
        cVar2.f6136x.sendMessageDelayed(Message.obtain(cVar2.f6136x, 15, p0Var), this.f6260u.f6121a);
        C2076c cVar3 = this.f6260u;
        cVar3.f6136x.sendMessageDelayed(Message.obtain(cVar3.f6136x, 16, p0Var), this.f6260u.f6122b);
        C6362b bVar = new C6362b(2, (PendingIntent) null);
        if (m9397m(bVar)) {
            return false;
        }
        this.f6260u.mo8044g(bVar, this.f6254g);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return false;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m9397m(p180z4.C6362b r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.google.android.gms.common.api.internal.C2076c.f6118B
            monitor-enter(r0)
            com.google.android.gms.common.api.internal.c r1 = r3.f6260u     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.l r2 = r1.f6133u     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0027
            java.util.Set r1 = r1.f6134v     // Catch:{ all -> 0x002a }
            b5.b<O> r2 = r3.f6250c     // Catch:{ all -> 0x002a }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0027
            com.google.android.gms.common.api.internal.c r1 = r3.f6260u     // Catch:{ all -> 0x002a }
            com.google.android.gms.common.api.internal.l r1 = r1.f6133u     // Catch:{ all -> 0x002a }
            int r2 = r3.f6254g     // Catch:{ all -> 0x002a }
            r1.mo8088s(r4, r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 1
            return r4
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            r4 = 0
            return r4
        L_0x002a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2115o0.m9397m(z4.b):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m9398n(boolean z) {
        C4141r.m28214d(this.f6260u.f6136x);
        if (!this.f6249b.mo6930a() || this.f6253f.size() != 0) {
            return false;
        }
        if (this.f6251d.mo8085g()) {
            if (z) {
                m9393i();
            }
            return false;
        }
        this.f6249b.mo6933d("Timing out service connection.");
        return true;
    }

    /* renamed from: z */
    static /* bridge */ /* synthetic */ void m9404z(C2115o0 o0Var, C2118p0 p0Var) {
        if (!o0Var.f6257r.contains(p0Var) || o0Var.f6256i) {
            return;
        }
        if (!o0Var.f6249b.mo6930a()) {
            o0Var.mo8098C();
        } else {
            o0Var.m9390f();
        }
    }

    /* renamed from: B */
    public final void mo8097B() {
        C4141r.m28214d(this.f6260u.f6136x);
        this.f6258s = null;
    }

    /* renamed from: B0 */
    public final void mo6954B0(C6362b bVar) {
        mo8101F(bVar, (Exception) null);
    }

    /* renamed from: C */
    public final void mo8098C() {
        C4141r.m28214d(this.f6260u.f6136x);
        if (!this.f6249b.mo6930a() && !this.f6249b.mo6936f()) {
            try {
                C2076c cVar = this.f6260u;
                int b = cVar.f6129i.mo17422b(cVar.f6127g, this.f6249b);
                if (b != 0) {
                    C6362b bVar = new C6362b(b, (PendingIntent) null);
                    String name = this.f6249b.getClass().getName();
                    String obj = bVar.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + obj.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(obj);
                    Log.w("GoogleApiManager", sb.toString());
                    mo8101F(bVar, (Exception) null);
                    return;
                }
                C2076c cVar2 = this.f6260u;
                C2051a.C2060f fVar = this.f6249b;
                C2122r0 r0Var = new C2122r0(cVar2, fVar, this.f6250c);
                if (fVar.mo6948s()) {
                    ((C1798g0) C4141r.m28221k(this.f6255h)).mo6955H6(r0Var);
                }
                try {
                    this.f6249b.mo6938h(r0Var);
                } catch (SecurityException e) {
                    mo8101F(new C6362b(10), e);
                }
            } catch (IllegalStateException e2) {
                mo8101F(new C6362b(10), e2);
            }
        }
    }

    /* renamed from: D */
    public final void mo8099D(C2085e1 e1Var) {
        C4141r.m28214d(this.f6260u.f6136x);
        if (!this.f6249b.mo6930a()) {
            this.f6248a.add(e1Var);
            C6362b bVar = this.f6258s;
            if (bVar == null || !bVar.mo21754L1()) {
                mo8098C();
            } else {
                mo8101F(this.f6258s, (Exception) null);
            }
        } else if (m9396l(e1Var)) {
            m9393i();
        } else {
            this.f6248a.add(e1Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final void mo8100E() {
        this.f6259t++;
    }

    /* renamed from: F */
    public final void mo8101F(C6362b bVar, Exception exc) {
        C4141r.m28214d(this.f6260u.f6136x);
        C1798g0 g0Var = this.f6255h;
        if (g0Var != null) {
            g0Var.mo6956I6();
        }
        mo8097B();
        this.f6260u.f6129i.mo17423c();
        m9387c(bVar);
        if ((this.f6249b instanceof C4287e) && bVar.mo21751I1() != 24) {
            this.f6260u.f6124d = true;
            C2076c cVar = this.f6260u;
            cVar.f6136x.sendMessageDelayed(cVar.f6136x.obtainMessage(19), 300000);
        }
        if (bVar.mo21751I1() == 4) {
            m9388d(C2076c.f6117A);
        } else if (this.f6248a.isEmpty()) {
            this.f6258s = bVar;
        } else if (exc != null) {
            C4141r.m28214d(this.f6260u.f6136x);
            m9389e((Status) null, exc, false);
        } else if (this.f6260u.f6137y) {
            m9389e(C2076c.m9209h(this.f6250c, bVar), (Exception) null, true);
            if (!this.f6248a.isEmpty() && !m9397m(bVar) && !this.f6260u.mo8044g(bVar, this.f6254g)) {
                if (bVar.mo21751I1() == 18) {
                    this.f6256i = true;
                }
                if (this.f6256i) {
                    C2076c cVar2 = this.f6260u;
                    cVar2.f6136x.sendMessageDelayed(Message.obtain(cVar2.f6136x, 9, this.f6250c), this.f6260u.f6121a);
                    return;
                }
                m9388d(C2076c.m9209h(this.f6250c, bVar));
            }
        } else {
            m9388d(C2076c.m9209h(this.f6250c, bVar));
        }
    }

    /* renamed from: G */
    public final void mo8102G(C6362b bVar) {
        C4141r.m28214d(this.f6260u.f6136x);
        C2051a.C2060f fVar = this.f6249b;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.mo6933d(sb.toString());
        mo8101F(bVar, (Exception) null);
    }

    /* renamed from: H */
    public final void mo8103H(C1802i0 i0Var) {
        C4141r.m28214d(this.f6260u.f6136x);
        this.f6252e.add(i0Var);
    }

    /* renamed from: I */
    public final void mo8104I() {
        C4141r.m28214d(this.f6260u.f6136x);
        if (this.f6256i) {
            mo8098C();
        }
    }

    /* renamed from: J */
    public final void mo8105J() {
        C4141r.m28214d(this.f6260u.f6136x);
        m9388d(C2076c.f6120z);
        this.f6251d.mo8084f();
        for (C2079d.C2080a d1Var : (C2079d.C2080a[]) this.f6253f.keySet().toArray(new C2079d.C2080a[0])) {
            mo8099D(new C2082d1(d1Var, new C9977j()));
        }
        m9387c(new C6362b(4));
        if (this.f6249b.mo6930a()) {
            this.f6249b.mo6940j(new C2112n0(this));
        }
    }

    /* renamed from: K */
    public final void mo8106K() {
        Status status;
        C4141r.m28214d(this.f6260u.f6136x);
        if (this.f6256i) {
            m9395k();
            C2076c cVar = this.f6260u;
            if (cVar.f6128h.mo21776i(cVar.f6127g) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m9388d(status);
            this.f6249b.mo6933d("Timing out connection while resuming.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo8107M() {
        return this.f6249b.mo6930a();
    }

    /* renamed from: N */
    public final boolean mo8108N() {
        return this.f6249b.mo6948s();
    }

    /* renamed from: P0 */
    public final void mo6918P0(Bundle bundle) {
        if (Looper.myLooper() == this.f6260u.f6136x.getLooper()) {
            m9391g();
        } else {
            this.f6260u.f6136x.post(new C2103k0(this));
        }
    }

    /* renamed from: a */
    public final boolean mo8109a() {
        return m9398n(true);
    }

    /* renamed from: o */
    public final int mo8110o() {
        return this.f6254g;
    }

    /* renamed from: o3 */
    public final void mo6969o3(C6362b bVar, C2051a<?> aVar, boolean z) {
        throw null;
    }

    /* renamed from: p */
    public final void mo6919p(int i) {
        if (Looper.myLooper() == this.f6260u.f6136x.getLooper()) {
            m9392h(i);
        } else {
            this.f6260u.f6136x.post(new C2106l0(this, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo8111q() {
        return this.f6259t;
    }

    /* renamed from: r */
    public final C6362b mo8112r() {
        C4141r.m28214d(this.f6260u.f6136x);
        return this.f6258s;
    }

    /* renamed from: t */
    public final C2051a.C2060f mo8113t() {
        return this.f6249b;
    }

    /* renamed from: v */
    public final Map<C2079d.C2080a<?>, C1788b0> mo8114v() {
        return this.f6253f;
    }
}
