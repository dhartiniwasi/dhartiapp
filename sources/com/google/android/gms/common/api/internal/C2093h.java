package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import p007a5.C0111g;
import p017b5.C1801i;
import p017b5.C1806k0;
import p017b5.C1810m0;
import p017b5.C1812n0;
import p017b5.C1826x;
import p033d5.C4095d;
import p033d5.C4141r;
import p123q5.C5407e;
import p124r.C5413a;
import p180z4.C6362b;
import p180z4.C6370f;
import p189b6.C6606a;
import p189b6.C6611f;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2093h implements C1826x {

    /* renamed from: a */
    private final Context f6188a;

    /* renamed from: b */
    private final C2087f0 f6189b;

    /* renamed from: c */
    private final Looper f6190c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2097i0 f6191d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2097i0 f6192e;

    /* renamed from: f */
    private final Map<C2051a.C2054c<?>, C2097i0> f6193f;

    /* renamed from: g */
    private final Set<C1801i> f6194g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: h */
    private final C2051a.C2060f f6195h;

    /* renamed from: i */
    private Bundle f6196i;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C6362b f6197r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6362b f6198s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f6199t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final Lock f6200u;

    /* renamed from: v */
    private int f6201v = 0;

    private C2093h(Context context, C2087f0 f0Var, Lock lock, Looper looper, C6370f fVar, Map<C2051a.C2054c<?>, C2051a.C2060f> map, Map<C2051a.C2054c<?>, C2051a.C2060f> map2, C4095d dVar, C2051a.C2052a<? extends C6611f, C6606a> aVar, C2051a.C2060f fVar2, ArrayList<C1806k0> arrayList, ArrayList<C1806k0> arrayList2, Map<C2051a<?>, Boolean> map3, Map<C2051a<?>, Boolean> map4) {
        this.f6188a = context;
        this.f6189b = f0Var;
        this.f6200u = lock;
        this.f6190c = looper;
        this.f6195h = fVar2;
        Context context2 = context;
        C2087f0 f0Var2 = f0Var;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C6370f fVar3 = fVar;
        C2097i0 i0Var = r3;
        C2097i0 i0Var2 = new C2097i0(context2, f0Var2, lock2, looper2, fVar3, map2, (C4095d) null, map4, (C2051a.C2052a<? extends C6611f, C6606a>) null, arrayList2, new C2113n1(this, (C1810m0) null));
        this.f6191d = i0Var;
        this.f6192e = new C2097i0(context2, f0Var2, lock2, looper2, fVar3, map, dVar, map3, aVar, arrayList, new C2116o1(this, (C1812n0) null));
        C5413a aVar2 = new C5413a();
        for (C2051a.C2054c<?> put : map2.keySet()) {
            aVar2.put(put, this.f6191d);
        }
        for (C2051a.C2054c<?> put2 : map.keySet()) {
            aVar2.put(put2, this.f6192e);
        }
        this.f6193f = Collections.unmodifiableMap(aVar2);
    }

    /* renamed from: h */
    private final void m9299h(C6362b bVar) {
        int i = this.f6201v;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f6201v = 0;
            }
            this.f6189b.mo6998b(bVar);
        }
        m9300i();
        this.f6201v = 0;
    }

    /* renamed from: i */
    private final void m9300i() {
        for (C1801i a : this.f6194g) {
            a.mo6959a();
        }
        this.f6194g.clear();
    }

    /* renamed from: j */
    private final boolean m9301j() {
        C6362b bVar = this.f6198s;
        return bVar != null && bVar.mo21751I1() == 4;
    }

    /* renamed from: k */
    private final boolean m9302k(C2073b<? extends C0111g, ? extends C2051a.C2053b> bVar) {
        C2097i0 i0Var = this.f6193f.get(bVar.mo8027r());
        C4141r.m28222l(i0Var, "GoogleApiClient is not configured to use the API required for this call.");
        return i0Var.equals(this.f6192e);
    }

    /* renamed from: l */
    private static boolean m9303l(C6362b bVar) {
        return bVar != null && bVar.mo21755M1();
    }

    /* renamed from: n */
    public static C2093h m9305n(Context context, C2087f0 f0Var, Lock lock, Looper looper, C6370f fVar, Map<C2051a.C2054c<?>, C2051a.C2060f> map, C4095d dVar, Map<C2051a<?>, Boolean> map2, C2051a.C2052a<? extends C6611f, C6606a> aVar, ArrayList<C1806k0> arrayList) {
        Map<C2051a<?>, Boolean> map3 = map2;
        C5413a aVar2 = new C5413a();
        C5413a aVar3 = new C5413a();
        C2051a.C2060f fVar2 = null;
        for (Map.Entry next : map.entrySet()) {
            C2051a.C2060f fVar3 = (C2051a.C2060f) next.getValue();
            if (true == fVar3.mo6931b()) {
                fVar2 = fVar3;
            }
            if (fVar3.mo6948s()) {
                aVar2.put((C2051a.C2054c) next.getKey(), fVar3);
            } else {
                aVar3.put((C2051a.C2054c) next.getKey(), fVar3);
            }
        }
        C4141r.m28225o(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C5413a aVar4 = new C5413a();
        C5413a aVar5 = new C5413a();
        for (C2051a next2 : map2.keySet()) {
            C2051a.C2054c<?> b = next2.mo7960b();
            if (aVar2.containsKey(b)) {
                aVar4.put(next2, map3.get(next2));
            } else if (aVar3.containsKey(b)) {
                aVar5.put(next2, map3.get(next2));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1806k0 k0Var = arrayList.get(i);
            if (aVar4.containsKey(k0Var.f5348a)) {
                arrayList2.add(k0Var);
            } else if (aVar5.containsKey(k0Var.f5348a)) {
                arrayList3.add(k0Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new C2093h(context, f0Var, lock, looper, fVar, aVar2, aVar3, dVar, aVar, fVar2, arrayList2, arrayList3, aVar4, aVar5);
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ void m9312u(C2093h hVar, int i, boolean z) {
        hVar.f6189b.mo6999c(i, z);
        hVar.f6198s = null;
        hVar.f6197r = null;
    }

    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m9313v(C2093h hVar, Bundle bundle) {
        Bundle bundle2 = hVar.f6196i;
        if (bundle2 == null) {
            hVar.f6196i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: w */
    static /* bridge */ /* synthetic */ void m9314w(C2093h hVar) {
        C6362b bVar;
        if (m9303l(hVar.f6197r)) {
            if (m9303l(hVar.f6198s) || hVar.m9301j()) {
                int i = hVar.f6201v;
                if (i != 1) {
                    if (i != 2) {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                        hVar.f6201v = 0;
                        return;
                    }
                    ((C2087f0) C4141r.m28221k(hVar.f6189b)).mo6997a(hVar.f6196i);
                }
                hVar.m9300i();
                hVar.f6201v = 0;
                return;
            }
            C6362b bVar2 = hVar.f6198s;
            if (bVar2 == null) {
                return;
            }
            if (hVar.f6201v == 1) {
                hVar.m9300i();
                return;
            }
            hVar.m9299h(bVar2);
            hVar.f6191d.mo7007f();
        } else if (hVar.f6197r == null || !m9303l(hVar.f6198s)) {
            C6362b bVar3 = hVar.f6197r;
            if (bVar3 != null && (bVar = hVar.f6198s) != null) {
                if (hVar.f6192e.f6219u < hVar.f6191d.f6219u) {
                    bVar3 = bVar;
                }
                hVar.m9299h(bVar3);
            }
        } else {
            hVar.f6192e.mo7007f();
            hVar.m9299h((C6362b) C4141r.m28221k(hVar.f6197r));
        }
    }

    /* renamed from: y */
    private final PendingIntent m9316y() {
        if (this.f6195h == null) {
            return null;
        }
        return C5407e.m33158a(this.f6188a, System.identityHashCode(this.f6189b), this.f6195h.mo6947r(), C5407e.f27632a | 134217728);
    }

    /* renamed from: a */
    public final void mo7002a() {
        this.f6201v = 2;
        this.f6199t = false;
        this.f6198s = null;
        this.f6197r = null;
        this.f6191d.mo7002a();
        this.f6192e.mo7002a();
    }

    /* renamed from: b */
    public final <A extends C2051a.C2053b, R extends C0111g, T extends C2073b<R, A>> T mo7003b(T t) {
        if (!m9302k(t)) {
            this.f6191d.mo7003b(t);
            return t;
        } else if (m9301j()) {
            t.mo8030v(new Status(4, (String) null, m9316y()));
            return t;
        } else {
            this.f6192e.mo7003b(t);
            return t;
        }
    }

    /* renamed from: c */
    public final boolean mo7004c() {
        this.f6200u.lock();
        try {
            boolean z = false;
            if (this.f6191d.mo7004c() && (this.f6192e.mo7004c() || m9301j() || this.f6201v == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f6200u.unlock();
        }
    }

    /* renamed from: d */
    public final <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo7005d(T t) {
        if (!m9302k(t)) {
            return this.f6191d.mo7005d(t);
        }
        if (!m9301j()) {
            return this.f6192e.mo7005d(t);
        }
        t.mo8030v(new Status(4, (String) null, m9316y()));
        return t;
    }

    /* renamed from: e */
    public final void mo7006e() {
        this.f6191d.mo7006e();
        this.f6192e.mo7006e();
    }

    /* renamed from: f */
    public final void mo7007f() {
        this.f6198s = null;
        this.f6197r = null;
        this.f6201v = 0;
        this.f6191d.mo7007f();
        this.f6192e.mo7007f();
        m9300i();
    }

    /* renamed from: g */
    public final void mo7008g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f6192e.mo7008g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f6191d.mo7008g(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }
}
