package p174y4;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p033d5.C4141r;
import p061h5.C4626a;
import p130r5.C5468f;

/* renamed from: y4.r */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
final class C6161r implements ServiceConnection {

    /* renamed from: a */
    int f29609a = 0;

    /* renamed from: b */
    final Messenger f29610b = new Messenger(new C5468f(Looper.getMainLooper(), new C6154k(this)));

    /* renamed from: c */
    C6162s f29611c;

    /* renamed from: d */
    final Queue<C6164u<?>> f29612d = new ArrayDeque();

    /* renamed from: e */
    final SparseArray<C6164u<?>> f29613e = new SparseArray<>();

    /* renamed from: f */
    final /* synthetic */ C6167x f29614f;

    /* synthetic */ C6161r(C6167x xVar, C6160q qVar) {
        this.f29614f = xVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo21029a(int i, String str) {
        mo21030b(i, str, (Throwable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo21030b(int i, String str, Throwable th) {
        String str2;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Disconnected: ".concat(valueOf);
            } else {
                str2 = new String("Disconnected: ");
            }
            Log.d("MessengerIpcClient", str2);
        }
        int i2 = this.f29609a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f29609a = 4;
            C4626a.m30143b().mo18192c(this.f29614f.f29622a, this);
            C6165v vVar = new C6165v(i, str, th);
            for (C6164u c : this.f29612d) {
                c.mo21041c(vVar);
            }
            this.f29612d.clear();
            for (int i3 = 0; i3 < this.f29613e.size(); i3++) {
                this.f29613e.valueAt(i3).mo21041c(vVar);
            }
            this.f29613e.clear();
        } else if (i2 == 3) {
            this.f29609a = 4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo21031c() {
        this.f29614f.f29623b.execute(new C6156m(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo21032d() {
        if (this.f29609a == 1) {
            mo21029a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo21033e(int i) {
        C6164u uVar = this.f29613e.get(i);
        if (uVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f29613e.remove(i);
            uVar.mo21041c(new C6165v(3, "Timed out waiting for response", (Throwable) null));
            mo21034f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo21034f() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f29609a     // Catch:{ all -> 0x0039 }
            r1 = 2
            if (r0 != r1) goto L_0x0037
            java.util.Queue<y4.u<?>> r0 = r2.f29612d     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            android.util.SparseArray<y4.u<?>> r0 = r2.f29613e     // Catch:{ all -> 0x0039 }
            int r0 = r0.size()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r1 = "Finished handling requests, unbinding"
            android.util.Log.v(r0, r1)     // Catch:{ all -> 0x0039 }
        L_0x0025:
            r0 = 3
            r2.f29609a = r0     // Catch:{ all -> 0x0039 }
            h5.a r0 = p061h5.C4626a.m30143b()     // Catch:{ all -> 0x0039 }
            y4.x r1 = r2.f29614f     // Catch:{ all -> 0x0039 }
            android.content.Context r1 = r1.f29622a     // Catch:{ all -> 0x0039 }
            r0.mo18192c(r1, r2)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0037:
            monitor-exit(r2)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174y4.C6161r.mo21034f():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean mo21035g(C6164u<?> uVar) {
        int i = this.f29609a;
        if (i == 0) {
            this.f29612d.add(uVar);
            C4141r.m28224n(this.f29609a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f29609a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                if (!C4626a.m30143b().mo18191a(this.f29614f.f29622a, intent, this, 1)) {
                    mo21029a(0, "Unable to bind to service");
                } else {
                    this.f29614f.f29623b.schedule(new C6157n(this), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e) {
                mo21030b(0, "Unable to bind to service", e);
            }
        } else if (i == 1) {
            this.f29612d.add(uVar);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f29612d.add(uVar);
            mo21031c();
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f29614f.f29623b.execute(new C6158o(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f29614f.f29623b.execute(new C6155l(this));
    }
}
