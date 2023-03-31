package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p007a5.C0111g;
import p017b5.C1806k0;
import p017b5.C1823u;
import p017b5.C1824v;
import p017b5.C1826x;
import p033d5.C4095d;
import p033d5.C4116j0;
import p033d5.C4119k0;
import p033d5.C4141r;
import p067i5.C4690d;
import p180z4.C6362b;
import p180z4.C6368e;
import p189b6.C6606a;
import p189b6.C6611f;

/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2087f0 extends GoogleApiClient implements C1824v {

    /* renamed from: b */
    private final Lock f6151b;

    /* renamed from: c */
    private final C4119k0 f6152c;

    /* renamed from: d */
    private C1826x f6153d = null;

    /* renamed from: e */
    private final int f6154e;

    /* renamed from: f */
    private final Context f6155f;

    /* renamed from: g */
    private final Looper f6156g;

    /* renamed from: h */
    final Queue<C2073b<?, ?>> f6157h = new LinkedList();

    /* renamed from: i */
    private volatile boolean f6158i;

    /* renamed from: j */
    private long f6159j;

    /* renamed from: k */
    private long f6160k;

    /* renamed from: l */
    private final C2081d0 f6161l;

    /* renamed from: m */
    private final C6368e f6162m;

    /* renamed from: n */
    C1823u f6163n;

    /* renamed from: o */
    final Map<C2051a.C2054c<?>, C2051a.C2060f> f6164o;

    /* renamed from: p */
    Set<Scope> f6165p;

    /* renamed from: q */
    final C4095d f6166q;

    /* renamed from: r */
    final Map<C2051a<?>, Boolean> f6167r;

    /* renamed from: s */
    final C2051a.C2052a<? extends C6611f, C6606a> f6168s;

    /* renamed from: t */
    private final C2083e f6169t;

    /* renamed from: u */
    private final ArrayList<C1806k0> f6170u;

    /* renamed from: v */
    private Integer f6171v;

    /* renamed from: w */
    Set<C2136y0> f6172w;

    /* renamed from: x */
    final C2072a1 f6173x;

    /* renamed from: y */
    private final C4116j0 f6174y;

    public C2087f0(Context context, Lock lock, Looper looper, C4095d dVar, C6368e eVar, C2051a.C2052a<? extends C6611f, C6606a> aVar, Map<C2051a<?>, Boolean> map, List<GoogleApiClient.C2049b> list, List<GoogleApiClient.C2050c> list2, Map<C2051a.C2054c<?>, C2051a.C2060f> map2, int i, int i2, ArrayList<C1806k0> arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.f6159j = true != C4690d.m30374a() ? 120000 : 10000;
        this.f6160k = 5000;
        this.f6165p = new HashSet();
        this.f6169t = new C2083e();
        this.f6171v = null;
        this.f6172w = null;
        C2077c0 c0Var = new C2077c0(this);
        this.f6174y = c0Var;
        this.f6155f = context;
        this.f6151b = lock;
        this.f6152c = new C4119k0(looper, c0Var);
        this.f6156g = looper2;
        this.f6161l = new C2081d0(this, looper);
        this.f6162m = eVar;
        this.f6154e = i3;
        if (i3 >= 0) {
            this.f6171v = Integer.valueOf(i2);
        }
        this.f6167r = map;
        this.f6164o = map2;
        this.f6170u = arrayList;
        this.f6173x = new C2072a1();
        for (GoogleApiClient.C2049b f : list) {
            this.f6152c.mo17416f(f);
        }
        for (GoogleApiClient.C2050c g : list2) {
            this.f6152c.mo17417g(g);
        }
        this.f6166q = dVar;
        this.f6168s = aVar;
    }

    /* renamed from: m */
    public static int m9257m(Iterable<C2051a.C2060f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C2051a.C2060f next : iterable) {
            z2 |= next.mo6948s();
            z3 |= next.mo6931b();
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* renamed from: o */
    static String m9258o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* renamed from: p */
    static /* bridge */ /* synthetic */ void m9259p(C2087f0 f0Var) {
        f0Var.f6151b.lock();
        try {
            if (f0Var.f6158i) {
                f0Var.m9262t();
            }
        } finally {
            f0Var.f6151b.unlock();
        }
    }

    /* renamed from: q */
    static /* bridge */ /* synthetic */ void m9260q(C2087f0 f0Var) {
        f0Var.f6151b.lock();
        try {
            if (f0Var.mo8056r()) {
                f0Var.m9262t();
            }
        } finally {
            f0Var.f6151b.unlock();
        }
    }

    /* renamed from: s */
    private final void m9261s(int i) {
        Integer num = this.f6171v;
        if (num == null) {
            this.f6171v = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String o = m9258o(i);
            String o2 = m9258o(this.f6171v.intValue());
            StringBuilder sb = new StringBuilder(o.length() + 51 + o2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(o);
            sb.append(". Mode was already set to ");
            sb.append(o2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f6153d == null) {
            boolean z = false;
            boolean z2 = false;
            for (C2051a.C2060f next : this.f6164o.values()) {
                z |= next.mo6948s();
                z2 |= next.mo6931b();
            }
            int intValue = this.f6171v.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    this.f6153d = C2093h.m9305n(this.f6155f, this, this.f6151b, this.f6156g, this.f6162m, this.f6164o, this.f6166q, this.f6167r, this.f6168s, this.f6170u);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.f6153d = new C2097i0(this.f6155f, this, this.f6151b, this.f6156g, this.f6162m, this.f6164o, this.f6166q, this.f6167r, this.f6168s, this.f6170u, this);
        }
    }

    /* renamed from: t */
    private final void m9262t() {
        this.f6152c.mo17412b();
        ((C1826x) C4141r.m28221k(this.f6153d)).mo7002a();
    }

    /* renamed from: a */
    public final void mo6997a(Bundle bundle) {
        while (!this.f6157h.isEmpty()) {
            mo6990f(this.f6157h.remove());
        }
        this.f6152c.mo17414d(bundle);
    }

    /* renamed from: b */
    public final void mo6998b(C6362b bVar) {
        if (!this.f6162m.mo21799k(this.f6155f, bVar.mo21751I1())) {
            mo8056r();
        }
        if (!this.f6158i) {
            this.f6152c.mo17413c(bVar);
            this.f6152c.mo17411a();
        }
    }

    /* renamed from: c */
    public final void mo6999c(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f6158i) {
                this.f6158i = true;
                if (this.f6163n == null && !C4690d.m30374a()) {
                    try {
                        this.f6163n = this.f6162m.mo21785v(this.f6155f.getApplicationContext(), new C2084e0(this));
                    } catch (SecurityException unused) {
                    }
                }
                C2081d0 d0Var = this.f6161l;
                d0Var.sendMessageDelayed(d0Var.obtainMessage(1), this.f6159j);
                C2081d0 d0Var2 = this.f6161l;
                d0Var2.sendMessageDelayed(d0Var2.obtainMessage(2), this.f6160k);
            }
            i = 1;
        }
        for (BasePendingResult e : (BasePendingResult[]) this.f6173x.f6111a.toArray(new BasePendingResult[0])) {
            e.mo7991e(C2072a1.f6110c);
        }
        this.f6152c.mo17415e(i);
        this.f6152c.mo17411a();
        if (i == 2) {
            m9262t();
        }
    }

    public final void connect() {
        this.f6151b.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f6154e >= 0) {
                C4141r.m28225o(this.f6171v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f6171v;
                if (num == null) {
                    this.f6171v = Integer.valueOf(m9257m(this.f6164o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int intValue = ((Integer) C4141r.m28221k(this.f6171v)).intValue();
            this.f6151b.lock();
            if (intValue == 3 || intValue == 1) {
                i = intValue;
            } else if (intValue != 2) {
                i = intValue;
                StringBuilder sb = new StringBuilder(33);
                sb.append("Illegal sign-in mode: ");
                sb.append(i);
                C4141r.m28212b(z, sb.toString());
                m9261s(i);
                m9262t();
            }
            z = true;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("Illegal sign-in mode: ");
            sb2.append(i);
            C4141r.m28212b(z, sb2.toString());
            m9261s(i);
            m9262t();
        } catch (Throwable th) {
            throw th;
        } finally {
            this.f6151b.unlock();
        }
    }

    /* renamed from: d */
    public final void mo6964d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f6155f);
        printWriter.append(str).append("mResuming=").print(this.f6158i);
        printWriter.append(" mWorkQueue.size()=").print(this.f6157h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f6173x.f6111a.size());
        C1826x xVar = this.f6153d;
        if (xVar != null) {
            xVar.mo7008g(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void disconnect() {
        Lock lock;
        this.f6151b.lock();
        try {
            this.f6173x.mo8024b();
            C1826x xVar = this.f6153d;
            if (xVar != null) {
                xVar.mo7007f();
            }
            this.f6169t.mo8054a();
            for (C2073b bVar : this.f6157h) {
                bVar.mo7997o((C2138z0) null);
                bVar.mo7989c();
            }
            this.f6157h.clear();
            if (this.f6153d == null) {
                lock = this.f6151b;
            } else {
                mo8056r();
                this.f6152c.mo17411a();
                lock = this.f6151b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f6151b.unlock();
            throw th;
        }
    }

    /* renamed from: e */
    public final <A extends C2051a.C2053b, R extends C0111g, T extends C2073b<R, A>> T mo6989e(T t) {
        Lock lock;
        C2051a<?> q = t.mo8026q();
        boolean containsKey = this.f6164o.containsKey(t.mo8027r());
        String d = q != null ? q.mo7962d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        C4141r.m28212b(containsKey, sb.toString());
        this.f6151b.lock();
        try {
            C1826x xVar = this.f6153d;
            if (xVar == null) {
                this.f6157h.add(t);
                lock = this.f6151b;
            } else {
                t = xVar.mo7003b(t);
                lock = this.f6151b;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.f6151b.unlock();
            throw th;
        }
    }

    /* renamed from: f */
    public final <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo6990f(T t) {
        Lock lock;
        C2051a<?> q = t.mo8026q();
        boolean containsKey = this.f6164o.containsKey(t.mo8027r());
        String d = q != null ? q.mo7962d() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(d);
        sb.append(" required for this call.");
        C4141r.m28212b(containsKey, sb.toString());
        this.f6151b.lock();
        try {
            C1826x xVar = this.f6153d;
            if (xVar != null) {
                if (this.f6158i) {
                    this.f6157h.add(t);
                    while (!this.f6157h.isEmpty()) {
                        C2073b remove = this.f6157h.remove();
                        this.f6173x.mo8023a(remove);
                        remove.mo8030v(Status.f6036i);
                    }
                    lock = this.f6151b;
                } else {
                    t = xVar.mo7005d(t);
                    lock = this.f6151b;
                }
                lock.unlock();
                return t;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        } catch (Throwable th) {
            this.f6151b.unlock();
            throw th;
        }
    }

    /* renamed from: g */
    public final Looper mo6991g() {
        return this.f6156g;
    }

    /* renamed from: h */
    public final boolean mo6966h() {
        C1826x xVar = this.f6153d;
        return xVar != null && xVar.mo7004c();
    }

    /* renamed from: i */
    public final void mo6967i(GoogleApiClient.C2050c cVar) {
        this.f6152c.mo17417g(cVar);
    }

    /* renamed from: j */
    public final void mo6968j(GoogleApiClient.C2050c cVar) {
        this.f6152c.mo17418h(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6992k(com.google.android.gms.common.api.internal.C2136y0 r3) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.f6151b
            r0.lock()
            java.util.Set<com.google.android.gms.common.api.internal.y0> r0 = r2.f6172w     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "GoogleApiClientImpl"
            if (r0 != 0) goto L_0x0016
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Attempted to remove pending transform when no transforms are registered."
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0016:
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x0027
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ all -> 0x0057 }
            r3.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "Failed to remove pending transform - this may lead to memory leaks!"
            android.util.Log.wtf(r1, r0, r3)     // Catch:{ all -> 0x0057 }
            goto L_0x004a
        L_0x0027:
            java.util.concurrent.locks.Lock r3 = r2.f6151b     // Catch:{ all -> 0x0057 }
            r3.lock()     // Catch:{ all -> 0x0057 }
            java.util.Set<com.google.android.gms.common.api.internal.y0> r3 = r2.f6172w     // Catch:{ all -> 0x0050 }
            if (r3 != 0) goto L_0x0036
            java.util.concurrent.locks.Lock r3 = r2.f6151b     // Catch:{ all -> 0x0057 }
            r3.unlock()     // Catch:{ all -> 0x0057 }
            goto L_0x0043
        L_0x0036:
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0050 }
            r3 = r3 ^ 1
            java.util.concurrent.locks.Lock r0 = r2.f6151b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x004a
        L_0x0043:
            b5.x r3 = r2.f6153d     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x004a
            r3.mo7006e()     // Catch:{ all -> 0x0057 }
        L_0x004a:
            java.util.concurrent.locks.Lock r3 = r2.f6151b
            r3.unlock()
            return
        L_0x0050:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f6151b     // Catch:{ all -> 0x0057 }
            r0.unlock()     // Catch:{ all -> 0x0057 }
            throw r3     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r3 = move-exception
            java.util.concurrent.locks.Lock r0 = r2.f6151b
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C2087f0.mo6992k(com.google.android.gms.common.api.internal.y0):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final String mo8055n() {
        StringWriter stringWriter = new StringWriter();
        mo6964d("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo8056r() {
        if (!this.f6158i) {
            return false;
        }
        this.f6158i = false;
        this.f6161l.removeMessages(2);
        this.f6161l.removeMessages(1);
        C1823u uVar = this.f6163n;
        if (uVar != null) {
            uVar.mo6995b();
            this.f6163n = null;
        }
        return true;
    }
}
