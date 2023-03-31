package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C2051a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p007a5.C0111g;
import p017b5.C1809m;
import p017b5.C1813o;
import p017b5.C1815p;
import p033d5.C4093c0;
import p033d5.C4095d;
import p033d5.C4114j;
import p033d5.C4141r;
import p033d5.C4148t0;
import p180z4.C6362b;
import p180z4.C6370f;
import p189b6.C6606a;
import p189b6.C6611f;
import p198c6.C6763l;

/* renamed from: com.google.android.gms.common.api.internal.a0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2071a0 implements C1813o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2097i0 f6089a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f6090b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f6091c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6370f f6092d;

    /* renamed from: e */
    private C6362b f6093e;

    /* renamed from: f */
    private int f6094f;

    /* renamed from: g */
    private int f6095g = 0;

    /* renamed from: h */
    private int f6096h;

    /* renamed from: i */
    private final Bundle f6097i = new Bundle();

    /* renamed from: j */
    private final Set<C2051a.C2054c> f6098j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C6611f f6099k;

    /* renamed from: l */
    private boolean f6100l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f6101m;

    /* renamed from: n */
    private boolean f6102n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C4114j f6103o;

    /* renamed from: p */
    private boolean f6104p;

    /* renamed from: q */
    private boolean f6105q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C4095d f6106r;

    /* renamed from: s */
    private final Map<C2051a<?>, Boolean> f6107s;

    /* renamed from: t */
    private final C2051a.C2052a<? extends C6611f, C6606a> f6108t;

    /* renamed from: u */
    private final ArrayList<Future<?>> f6109u = new ArrayList<>();

    public C2071a0(C2097i0 i0Var, C4095d dVar, Map<C2051a<?>, Boolean> map, C6370f fVar, C2051a.C2052a<? extends C6611f, C6606a> aVar, Lock lock, Context context) {
        this.f6089a = i0Var;
        this.f6106r = dVar;
        this.f6107s = map;
        this.f6092d = fVar;
        this.f6108t = aVar;
        this.f6090b = lock;
        this.f6091c = context;
    }

    /* renamed from: B */
    static /* bridge */ /* synthetic */ void m9149B(C2071a0 a0Var, C6763l lVar) {
        if (a0Var.m9164o(0)) {
            C6362b I1 = lVar.mo22682I1();
            if (I1.mo21755M1()) {
                C4148t0 t0Var = (C4148t0) C4141r.m28221k(lVar.mo22683J1());
                C6362b I12 = t0Var.mo17469I1();
                if (!I12.mo21755M1()) {
                    String valueOf = String.valueOf(I12);
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                    a0Var.m9161l(I12);
                    return;
                }
                a0Var.f6102n = true;
                a0Var.f6103o = (C4114j) C4141r.m28221k(t0Var.mo17470J1());
                a0Var.f6104p = t0Var.mo17471K1();
                a0Var.f6105q = t0Var.mo17472L1();
                a0Var.m9163n();
            } else if (a0Var.m9166q(I1)) {
                a0Var.m9158i();
                a0Var.m9163n();
            } else {
                a0Var.m9161l(I1);
            }
        }
    }

    /* renamed from: J */
    private final void m9157J() {
        ArrayList<Future<?>> arrayList = this.f6109u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.f6109u.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m9158i() {
        this.f6101m = false;
        this.f6089a.f6220v.f6165p = Collections.emptySet();
        for (C2051a.C2054c next : this.f6098j) {
            if (!this.f6089a.f6213g.containsKey(next)) {
                this.f6089a.f6213g.put(next, new C6362b(17, (PendingIntent) null));
            }
        }
    }

    /* renamed from: j */
    private final void m9159j(boolean z) {
        C6611f fVar = this.f6099k;
        if (fVar != null) {
            if (fVar.mo6930a() && z) {
                fVar.mo22241o();
            }
            fVar.mo6935e();
            C4095d dVar = (C4095d) C4141r.m28221k(this.f6106r);
            this.f6103o = null;
        }
    }

    /* renamed from: k */
    private final void m9160k() {
        Bundle bundle;
        this.f6089a.mo8075j();
        C1815p.m8489a().execute(new C2119q(this));
        C6611f fVar = this.f6099k;
        if (fVar != null) {
            if (this.f6104p) {
                fVar.mo22240k((C4114j) C4141r.m28221k(this.f6103o), this.f6105q);
            }
            m9159j(false);
        }
        for (C2051a.C2054c<?> cVar : this.f6089a.f6213g.keySet()) {
            ((C2051a.C2060f) C4141r.m28221k(this.f6089a.f6212f.get(cVar))).mo6935e();
        }
        if (this.f6097i.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f6097i;
        }
        this.f6089a.f6221w.mo6997a(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m9161l(C6362b bVar) {
        m9157J();
        m9159j(!bVar.mo21754L1());
        this.f6089a.mo8077l(bVar);
        this.f6089a.f6221w.mo6998b(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final void m9162m(C6362b bVar, C2051a<?> aVar, boolean z) {
        int b = aVar.mo7961c().mo7968b();
        if ((!z || bVar.mo21754L1() || this.f6092d.mo21797c(bVar.mo21751I1()) != null) && (this.f6093e == null || b < this.f6094f)) {
            this.f6093e = bVar;
            this.f6094f = b;
        }
        this.f6089a.f6213g.put(aVar.mo7960b(), bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m9163n() {
        if (this.f6096h == 0) {
            if (!this.f6101m || this.f6102n) {
                ArrayList arrayList = new ArrayList();
                this.f6095g = 1;
                this.f6096h = this.f6089a.f6212f.size();
                for (C2051a.C2054c next : this.f6089a.f6212f.keySet()) {
                    if (!this.f6089a.f6213g.containsKey(next)) {
                        arrayList.add(this.f6089a.f6212f.get(next));
                    } else if (m9165p()) {
                        m9160k();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f6109u.add(C1815p.m8489a().submit(new C2129v(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final boolean m9164o(int i) {
        if (this.f6095g == i) {
            return true;
        }
        Log.w("GACConnecting", this.f6089a.f6220v.mo8055n());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.f6096h;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        Log.w("GACConnecting", sb.toString());
        String r = m9167r(this.f6095g);
        String r2 = m9167r(i);
        StringBuilder sb2 = new StringBuilder(r.length() + 70 + r2.length());
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(r);
        sb2.append(" but received callback for step ");
        sb2.append(r2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        m9161l(new C6362b(8, (PendingIntent) null));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m9165p() {
        int i = this.f6096h - 1;
        this.f6096h = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f6089a.f6220v.mo8055n());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m9161l(new C6362b(8, (PendingIntent) null));
            return false;
        }
        C6362b bVar = this.f6093e;
        if (bVar == null) {
            return true;
        }
        this.f6089a.f6219u = this.f6094f;
        m9161l(bVar);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final boolean m9166q(C6362b bVar) {
        return this.f6100l && !bVar.mo21754L1();
    }

    /* renamed from: r */
    private static final String m9167r(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: y */
    static /* bridge */ /* synthetic */ Set m9174y(C2071a0 a0Var) {
        C4095d dVar = a0Var.f6106r;
        if (dVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(dVar.mo17363e());
        Map<C2051a<?>, C4093c0> i = a0Var.f6106r.mo17367i();
        for (C2051a next : i.keySet()) {
            if (!a0Var.f6089a.f6213g.containsKey(next.mo7960b())) {
                hashSet.addAll(i.get(next).f23269a);
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo6970a(Bundle bundle) {
        if (m9164o(1)) {
            if (bundle != null) {
                this.f6097i.putAll(bundle);
            }
            if (m9165p()) {
                m9160k();
            }
        }
    }

    /* renamed from: b */
    public final void mo6971b() {
    }

    /* renamed from: c */
    public final void mo6972c(C6362b bVar, C2051a<?> aVar, boolean z) {
        if (m9164o(1)) {
            m9162m(bVar, aVar, z);
            if (m9165p()) {
                m9160k();
            }
        }
    }

    /* renamed from: d */
    public final void mo6973d(int i) {
        m9161l(new C6362b(8, (PendingIntent) null));
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [b6.f, com.google.android.gms.common.api.a$f] */
    /* renamed from: e */
    public final void mo6974e() {
        this.f6089a.f6213g.clear();
        this.f6101m = false;
        this.f6093e = null;
        this.f6095g = 0;
        this.f6100l = true;
        this.f6102n = false;
        this.f6104p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C2051a next : this.f6107s.keySet()) {
            C2051a.C2060f fVar = (C2051a.C2060f) C4141r.m28221k(this.f6089a.f6212f.get(next.mo7960b()));
            z |= next.mo7961c().mo7968b() == 1;
            boolean booleanValue = this.f6107s.get(next).booleanValue();
            if (fVar.mo6948s()) {
                this.f6101m = true;
                if (booleanValue) {
                    this.f6098j.add(next.mo7960b());
                } else {
                    this.f6100l = false;
                }
            }
            hashMap.put(fVar, new C2121r(this, next, booleanValue));
        }
        if (z) {
            this.f6101m = false;
        }
        if (this.f6101m) {
            C4141r.m28221k(this.f6106r);
            C4141r.m28221k(this.f6108t);
            this.f6106r.mo17368j(Integer.valueOf(System.identityHashCode(this.f6089a.f6220v)));
            C2135y yVar = new C2135y(this, (C1809m) null);
            C2051a.C2052a aVar = this.f6108t;
            Context context = this.f6091c;
            Looper g = this.f6089a.f6220v.mo6991g();
            C4095d dVar = this.f6106r;
            this.f6099k = aVar.mo7964d(context, g, dVar, dVar.mo17364f(), yVar, yVar);
        }
        this.f6096h = this.f6089a.f6212f.size();
        this.f6109u.add(C1815p.m8489a().submit(new C2127u(this, hashMap)));
    }

    /* renamed from: f */
    public final <A extends C2051a.C2053b, R extends C0111g, T extends C2073b<R, A>> T mo6975f(T t) {
        this.f6089a.f6220v.f6157h.add(t);
        return t;
    }

    /* renamed from: g */
    public final boolean mo6976g() {
        m9157J();
        m9159j(true);
        this.f6089a.mo8077l((C6362b) null);
        return true;
    }

    /* renamed from: h */
    public final <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo6977h(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
