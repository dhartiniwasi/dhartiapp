package p174y4;

import android.os.Handler;

/* renamed from: y4.k */
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final /* synthetic */ class C6154k implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C6161r f29601a;

    public /* synthetic */ C6154k(C6161r rVar) {
        this.f29601a = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0060, code lost:
        r2.mo21041c(new p174y4.C6165v(4, "Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        r2.mo21039a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            y4.r r0 = r4.f29601a
            int r1 = r5.arg1
            java.lang.String r2 = "MessengerIpcClient"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 41
            r2.<init>(r3)
            java.lang.String r3 = "Received response to request: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r3 = "MessengerIpcClient"
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        L_0x0025:
            monitor-enter(r0)
            android.util.SparseArray<y4.u<?>> r2 = r0.f29613e     // Catch:{ all -> 0x0072 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0072 }
            y4.u r2 = (p174y4.C6164u) r2     // Catch:{ all -> 0x0072 }
            if (r2 != 0) goto L_0x004a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0072 }
            r2 = 50
            r5.<init>(r2)     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "Received response for unknown request: "
            r5.append(r2)     // Catch:{ all -> 0x0072 }
            r5.append(r1)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "MessengerIpcClient"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0072 }
            android.util.Log.w(r1, r5)     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x0070
        L_0x004a:
            android.util.SparseArray<y4.u<?>> r3 = r0.f29613e     // Catch:{ all -> 0x0072 }
            r3.remove(r1)     // Catch:{ all -> 0x0072 }
            r0.mo21034f()     // Catch:{ all -> 0x0072 }
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x006d
            y4.v r5 = new y4.v
            r0 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            r3 = 0
            r5.<init>(r0, r1, r3)
            r2.mo21041c(r5)
            goto L_0x0070
        L_0x006d:
            r2.mo21039a(r5)
        L_0x0070:
            r5 = 1
            return r5
        L_0x0072:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p174y4.C6154k.handleMessage(android.os.Message):boolean");
    }
}
