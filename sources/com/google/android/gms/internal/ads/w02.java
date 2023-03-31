package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class w02 {

    /* renamed from: e */
    private static w02 f19405e;

    /* renamed from: a */
    private final Handler f19406a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList f19407b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final Object f19408c = new Object();

    /* renamed from: d */
    private int f19409d = 0;

    private w02(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        gb2.m13157a(context, new vz1(this, (uy1) null), intentFilter);
    }

    /* renamed from: b */
    public static synchronized w02 m22517b(Context context) {
        w02 w02;
        synchronized (w02.class) {
            if (f19405e == null) {
                f19405e = new w02(context);
            }
            w02 = f19405e;
        }
        return w02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = (java.lang.ref.WeakReference) r0.next();
        r2 = (com.google.android.gms.internal.ads.ok4) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.f15179a.m19251g(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        r3.f19407b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f19407b.iterator();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m22518c(com.google.android.gms.internal.ads.w02 r3, int r4) {
        /*
            java.lang.Object r0 = r3.f19408c
            monitor-enter(r0)
            int r1 = r3.f19409d     // Catch:{ all -> 0x0033 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            r3.f19409d = r4     // Catch:{ all -> 0x0033 }
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r3.f19407b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            com.google.android.gms.internal.ads.ok4 r2 = (com.google.android.gms.internal.ads.ok4) r2
            if (r2 == 0) goto L_0x002c
            com.google.android.gms.internal.ads.qk4 r1 = r2.f15179a
            r1.m19251g(r4)
            goto L_0x0012
        L_0x002c:
            java.util.concurrent.CopyOnWriteArrayList r2 = r3.f19407b
            r2.remove(r1)
            goto L_0x0012
        L_0x0032:
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w02.m22518c(com.google.android.gms.internal.ads.w02, int):void");
    }

    /* renamed from: a */
    public final int mo14853a() {
        int i;
        synchronized (this.f19408c) {
            i = this.f19409d;
        }
        return i;
    }

    /* renamed from: d */
    public final void mo14854d(ok4 ok4) {
        Iterator it = this.f19407b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f19407b.remove(weakReference);
            }
        }
        this.f19407b.add(new WeakReference(ok4));
        this.f19406a.post(new rw1(this, ok4, (byte[]) null));
    }
}
