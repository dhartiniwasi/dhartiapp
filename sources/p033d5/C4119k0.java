package p033d5;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p123q5.C5412j;

/* renamed from: d5.k0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4119k0 implements Handler.Callback {

    /* renamed from: a */
    private final C4116j0 f23337a;

    /* renamed from: b */
    private final ArrayList<GoogleApiClient.C2049b> f23338b = new ArrayList<>();

    /* renamed from: c */
    final ArrayList<GoogleApiClient.C2049b> f23339c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<GoogleApiClient.C2050c> f23340d = new ArrayList<>();

    /* renamed from: e */
    private volatile boolean f23341e = false;

    /* renamed from: f */
    private final AtomicInteger f23342f = new AtomicInteger(0);

    /* renamed from: g */
    private boolean f23343g = false;

    /* renamed from: h */
    private final Handler f23344h;

    /* renamed from: i */
    private final Object f23345i = new Object();

    public C4119k0(Looper looper, C4116j0 j0Var) {
        this.f23337a = j0Var;
        this.f23344h = new C5412j(looper, this);
    }

    /* renamed from: a */
    public final void mo17411a() {
        this.f23341e = false;
        this.f23342f.incrementAndGet();
    }

    /* renamed from: b */
    public final void mo17412b() {
        this.f23341e = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17413c(p180z4.C6362b r6) {
        /*
            r5 = this;
            android.os.Handler r0 = r5.f23344h
            java.lang.String r1 = "onConnectionFailure must only be called on the Handler thread"
            p033d5.C4141r.m28215e(r0, r1)
            android.os.Handler r0 = r5.f23344h
            r1 = 1
            r0.removeMessages(r1)
            java.lang.Object r0 = r5.f23345i
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x004a }
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$c> r2 = r5.f23340d     // Catch:{ all -> 0x004a }
            r1.<init>(r2)     // Catch:{ all -> 0x004a }
            java.util.concurrent.atomic.AtomicInteger r2 = r5.f23342f     // Catch:{ all -> 0x004a }
            int r2 = r2.get()     // Catch:{ all -> 0x004a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004a }
        L_0x0021:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004a }
            com.google.android.gms.common.api.GoogleApiClient$c r3 = (com.google.android.gms.common.api.GoogleApiClient.C2050c) r3     // Catch:{ all -> 0x004a }
            boolean r4 = r5.f23341e     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicInteger r4 = r5.f23342f     // Catch:{ all -> 0x004a }
            int r4 = r4.get()     // Catch:{ all -> 0x004a }
            if (r4 == r2) goto L_0x003a
            goto L_0x0046
        L_0x003a:
            java.util.ArrayList<com.google.android.gms.common.api.GoogleApiClient$c> r4 = r5.f23340d     // Catch:{ all -> 0x004a }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0021
            r3.mo6954B0(r6)     // Catch:{ all -> 0x004a }
            goto L_0x0021
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p033d5.C4119k0.mo17413c(z4.b):void");
    }

    /* renamed from: d */
    public final void mo17414d(Bundle bundle) {
        C4141r.m28215e(this.f23344h, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f23345i) {
            C4141r.m28224n(!this.f23343g);
            this.f23344h.removeMessages(1);
            this.f23343g = true;
            C4141r.m28224n(this.f23339c.isEmpty());
            ArrayList arrayList = new ArrayList(this.f23338b);
            int i = this.f23342f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.C2049b bVar = (GoogleApiClient.C2049b) it.next();
                if (!this.f23341e || !this.f23337a.mo8048a()) {
                    break;
                } else if (this.f23342f.get() != i) {
                    break;
                } else if (!this.f23339c.contains(bVar)) {
                    bVar.mo6918P0(bundle);
                }
            }
            this.f23339c.clear();
            this.f23343g = false;
        }
    }

    /* renamed from: e */
    public final void mo17415e(int i) {
        C4141r.m28215e(this.f23344h, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f23344h.removeMessages(1);
        synchronized (this.f23345i) {
            this.f23343g = true;
            ArrayList arrayList = new ArrayList(this.f23338b);
            int i2 = this.f23342f.get();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GoogleApiClient.C2049b bVar = (GoogleApiClient.C2049b) it.next();
                if (!this.f23341e) {
                    break;
                } else if (this.f23342f.get() != i2) {
                    break;
                } else if (this.f23338b.contains(bVar)) {
                    bVar.mo6919p(i);
                }
            }
            this.f23339c.clear();
            this.f23343g = false;
        }
    }

    /* renamed from: f */
    public final void mo17416f(GoogleApiClient.C2049b bVar) {
        C4141r.m28221k(bVar);
        synchronized (this.f23345i) {
            if (this.f23338b.contains(bVar)) {
                String valueOf = String.valueOf(bVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 62);
                sb.append("registerConnectionCallbacks(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f23338b.add(bVar);
            }
        }
        if (this.f23337a.mo8048a()) {
            Handler handler = this.f23344h;
            handler.sendMessage(handler.obtainMessage(1, bVar));
        }
    }

    /* renamed from: g */
    public final void mo17417g(GoogleApiClient.C2050c cVar) {
        C4141r.m28221k(cVar);
        synchronized (this.f23345i) {
            if (this.f23340d.contains(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 67);
                sb.append("registerConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" is already registered");
                Log.w("GmsClientEvents", sb.toString());
            } else {
                this.f23340d.add(cVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo17418h(GoogleApiClient.C2050c cVar) {
        C4141r.m28221k(cVar);
        synchronized (this.f23345i) {
            if (!this.f23340d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
                Log.w("GmsClientEvents", sb.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            GoogleApiClient.C2049b bVar = (GoogleApiClient.C2049b) message.obj;
            synchronized (this.f23345i) {
                if (this.f23341e && this.f23337a.mo8048a() && this.f23338b.contains(bVar)) {
                    bVar.mo6918P0((Bundle) null);
                }
            }
            return true;
        }
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(i);
        Log.wtf("GmsClientEvents", sb.toString(), new Exception());
        return false;
    }
}
