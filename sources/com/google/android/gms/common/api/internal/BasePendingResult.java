package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p007a5.C0106c;
import p007a5.C0108d;
import p007a5.C0111g;
import p007a5.C0112h;
import p017b5.C1804j0;
import p033d5.C4118k;
import p033d5.C4141r;
import p123q5.C5412j;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class BasePendingResult<R extends C0111g> extends C0106c<R> {

    /* renamed from: p */
    static final ThreadLocal<Boolean> f6066p = new C2107l1();

    /* renamed from: q */
    public static final /* synthetic */ int f6067q = 0;

    /* renamed from: a */
    private final Object f6068a;

    /* renamed from: b */
    protected final C2068a<R> f6069b;

    /* renamed from: c */
    protected final WeakReference<GoogleApiClient> f6070c;

    /* renamed from: d */
    private final CountDownLatch f6071d;

    /* renamed from: e */
    private final ArrayList<C0106c.C0107a> f6072e;

    /* renamed from: f */
    private C0112h<? super R> f6073f;

    /* renamed from: g */
    private final AtomicReference<C2138z0> f6074g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public R f6075h;

    /* renamed from: i */
    private Status f6076i;

    /* renamed from: j */
    private volatile boolean f6077j;

    /* renamed from: k */
    private boolean f6078k;

    /* renamed from: l */
    private boolean f6079l;

    /* renamed from: m */
    private C4118k f6080m;
    @KeepName
    private C2110m1 mResultGuardian;

    /* renamed from: n */
    private volatile C2136y0<R> f6081n;

    /* renamed from: o */
    private boolean f6082o;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C2068a<R extends C0111g> extends C5412j {
        public C2068a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo7998a(C0112h<? super R> hVar, R r) {
            int i = BasePendingResult.f6067q;
            sendMessage(obtainMessage(1, new Pair((C0112h) C4141r.m28221k(hVar), r)));
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C0112h hVar = (C0112h) pair.first;
                C0111g gVar = (C0111g) pair.second;
                try {
                    hVar.mo260a(gVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m9117m(gVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo7991e(Status.f6037r);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f6068a = new Object();
        this.f6071d = new CountDownLatch(1);
        this.f6072e = new ArrayList<>();
        this.f6074g = new AtomicReference<>();
        this.f6082o = false;
        this.f6069b = new C2068a<>(Looper.getMainLooper());
        this.f6070c = new WeakReference<>((Object) null);
    }

    /* renamed from: i */
    private final R m9114i() {
        R r;
        synchronized (this.f6068a) {
            C4141r.m28225o(!this.f6077j, "Result has already been consumed.");
            C4141r.m28225o(mo7993g(), "Result is not ready.");
            r = this.f6075h;
            this.f6075h = null;
            this.f6073f = null;
            this.f6077j = true;
        }
        C2138z0 andSet = this.f6074g.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f6310a.f6111a.remove(this);
        }
        return (C0111g) C4141r.m28221k(r);
    }

    /* renamed from: j */
    private final void m9115j(R r) {
        this.f6075h = r;
        this.f6076i = r.mo259d1();
        this.f6080m = null;
        this.f6071d.countDown();
        if (this.f6078k) {
            this.f6073f = null;
        } else {
            C0112h<? super R> hVar = this.f6073f;
            if (hVar != null) {
                this.f6069b.removeMessages(2);
                this.f6069b.mo7998a(hVar, m9114i());
            } else if (this.f6075h instanceof C0108d) {
                this.mResultGuardian = new C2110m1(this, (C1804j0) null);
            }
        }
        ArrayList<C0106c.C0107a> arrayList = this.f6072e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo255a(this.f6076i);
        }
        this.f6072e.clear();
    }

    /* renamed from: m */
    public static void m9117m(C0111g gVar) {
        if (gVar instanceof C0108d) {
            try {
                ((C0108d) gVar).mo256a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(gVar)), e);
            }
        }
    }

    /* renamed from: a */
    public final void mo253a(C0106c.C0107a aVar) {
        C4141r.m28212b(aVar != null, "Callback cannot be null.");
        synchronized (this.f6068a) {
            if (mo7993g()) {
                aVar.mo255a(this.f6076i);
            } else {
                this.f6072e.add(aVar);
            }
        }
    }

    /* renamed from: b */
    public final R mo254b(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C4141r.m28220j("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C4141r.m28225o(!this.f6077j, "Result has already been consumed.");
        if (this.f6081n != null) {
            z = false;
        }
        C4141r.m28225o(z, "Cannot await if then() has been called.");
        try {
            if (!this.f6071d.await(j, timeUnit)) {
                mo7991e(Status.f6037r);
            }
        } catch (InterruptedException unused) {
            mo7991e(Status.f6035h);
        }
        C4141r.m28225o(mo7993g(), "Result is not ready.");
        return m9114i();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7989c() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f6068a
            monitor-enter(r0)
            boolean r1 = r2.f6078k     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.f6077j     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            d5.k r1 = r2.f6080m     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            R r1 = r2.f6075h     // Catch:{ all -> 0x0028 }
            m9117m(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.f6078k = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f6038s     // Catch:{ all -> 0x0028 }
            a5.g r1 = r2.mo7990d(r1)     // Catch:{ all -> 0x0028 }
            r2.m9115j(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.mo7989c():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract R mo7990d(Status status);

    @Deprecated
    /* renamed from: e */
    public final void mo7991e(Status status) {
        synchronized (this.f6068a) {
            if (!mo7993g()) {
                mo7994h(mo7990d(status));
                this.f6079l = true;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo7992f() {
        boolean z;
        synchronized (this.f6068a) {
            z = this.f6078k;
        }
        return z;
    }

    /* renamed from: g */
    public final boolean mo7993g() {
        return this.f6071d.getCount() == 0;
    }

    /* renamed from: h */
    public final void mo7994h(R r) {
        synchronized (this.f6068a) {
            if (this.f6079l || this.f6078k) {
                m9117m(r);
                return;
            }
            mo7993g();
            C4141r.m28225o(!mo7993g(), "Results have already been set");
            C4141r.m28225o(!this.f6077j, "Result has already been consumed");
            m9115j(r);
        }
    }

    /* renamed from: l */
    public final void mo7995l() {
        boolean z = true;
        if (!this.f6082o && !f6066p.get().booleanValue()) {
            z = false;
        }
        this.f6082o = z;
    }

    /* renamed from: n */
    public final boolean mo7996n() {
        boolean f;
        synchronized (this.f6068a) {
            if (((GoogleApiClient) this.f6070c.get()) == null || !this.f6082o) {
                mo7989c();
            }
            f = mo7992f();
        }
        return f;
    }

    /* renamed from: o */
    public final void mo7997o(C2138z0 z0Var) {
        this.f6074g.set(z0Var);
    }

    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.f6068a = new Object();
        this.f6071d = new CountDownLatch(1);
        this.f6072e = new ArrayList<>();
        this.f6074g = new AtomicReference<>();
        this.f6082o = false;
        this.f6069b = new C2068a<>(googleApiClient != null ? googleApiClient.mo6991g() : Looper.getMainLooper());
        this.f6070c = new WeakReference<>(googleApiClient);
    }
}
