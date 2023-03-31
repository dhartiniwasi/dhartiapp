package com.google.firebase.messaging;

import java.util.Map;
import java.util.concurrent.Executor;
import p124r.C5413a;
import p218e6.C9975i;

/* renamed from: com.google.firebase.messaging.r0 */
/* compiled from: RequestDeduplicator */
class C8068r0 {

    /* renamed from: a */
    private final Executor f34755a;

    /* renamed from: b */
    private final Map<String, C9975i<String>> f34756b = new C5413a();

    /* renamed from: com.google.firebase.messaging.r0$a */
    /* compiled from: RequestDeduplicator */
    interface C8069a {
        C9975i<String> start();
    }

    C8068r0(Executor executor) {
        this.f34755a = executor;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ C9975i m44420c(String str, C9975i iVar) throws Exception {
        synchronized (this) {
            this.f34756b.remove(str);
        }
        return iVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p218e6.C9975i<java.lang.String> mo26729b(java.lang.String r4, com.google.firebase.messaging.C8068r0.C8069a r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Map<java.lang.String, e6.i<java.lang.String>> r0 = r3.f34756b     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0060 }
            e6.i r0 = (p218e6.C9975i) r0     // Catch:{ all -> 0x0060 }
            r1 = 3
            if (r0 == 0) goto L_0x002c
            java.lang.String r5 = "FirebaseMessaging"
            boolean r5 = android.util.Log.isLoggable(r5, r1)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x002a
            java.lang.String r5 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Joining ongoing request for: "
            r1.append(r2)     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.d(r5, r4)     // Catch:{ all -> 0x0060 }
        L_0x002a:
            monitor-exit(r3)
            return r0
        L_0x002c:
            java.lang.String r0 = "FirebaseMessaging"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "Making new request for: "
            r1.append(r2)     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0060 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x0060 }
        L_0x004a:
            e6.i r5 = r5.start()     // Catch:{ all -> 0x0060 }
            java.util.concurrent.Executor r0 = r3.f34755a     // Catch:{ all -> 0x0060 }
            com.google.firebase.messaging.q0 r1 = new com.google.firebase.messaging.q0     // Catch:{ all -> 0x0060 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0060 }
            e6.i r5 = r5.mo26356k(r0, r1)     // Catch:{ all -> 0x0060 }
            java.util.Map<java.lang.String, e6.i<java.lang.String>> r0 = r3.f34756b     // Catch:{ all -> 0x0060 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)
            return r5
        L_0x0060:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C8068r0.mo26729b(java.lang.String, com.google.firebase.messaging.r0$a):e6.i");
    }
}
