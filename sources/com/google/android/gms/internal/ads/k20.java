package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import p023c4.C1861c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class k20 extends C1861c {

    /* renamed from: a */
    private final j20 f11874a;

    /* renamed from: b */
    private final List f11875b = new ArrayList();

    /* renamed from: c */
    private String f11876c;

    /* JADX WARNING: type inference failed for: r2v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k20(com.google.android.gms.internal.ads.j20 r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.f11875b = r1
            r4.f11874a = r5
            java.lang.String r1 = r5.mo8184c()     // Catch:{ RemoteException -> 0x0015 }
            r4.f11876c = r1     // Catch:{ RemoteException -> 0x0015 }
            goto L_0x001b
        L_0x0015:
            r1 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r1)
            r4.f11876c = r0
        L_0x001b:
            java.util.List r5 = r5.mo8181U()     // Catch:{ RemoteException -> 0x0058 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RemoteException -> 0x0058 }
        L_0x0023:
            boolean r1 = r5.hasNext()     // Catch:{ RemoteException -> 0x0058 }
            if (r1 == 0) goto L_0x0057
            java.lang.Object r1 = r5.next()     // Catch:{ RemoteException -> 0x0058 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0058 }
            r3 = 0
            if (r2 == 0) goto L_0x004a
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0058 }
            if (r1 != 0) goto L_0x0037
            goto L_0x004a
        L_0x0037:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0058 }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.r20     // Catch:{ RemoteException -> 0x0058 }
            if (r3 == 0) goto L_0x0045
            r3 = r2
            com.google.android.gms.internal.ads.r20 r3 = (com.google.android.gms.internal.ads.r20) r3     // Catch:{ RemoteException -> 0x0058 }
            goto L_0x004a
        L_0x0045:
            com.google.android.gms.internal.ads.p20 r3 = new com.google.android.gms.internal.ads.p20     // Catch:{ RemoteException -> 0x0058 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0058 }
        L_0x004a:
            if (r3 == 0) goto L_0x0023
            java.util.List r1 = r4.f11875b     // Catch:{ RemoteException -> 0x0058 }
            com.google.android.gms.internal.ads.s20 r2 = new com.google.android.gms.internal.ads.s20     // Catch:{ RemoteException -> 0x0058 }
            r2.<init>(r3)     // Catch:{ RemoteException -> 0x0058 }
            r1.add(r2)     // Catch:{ RemoteException -> 0x0058 }
            goto L_0x0023
        L_0x0057:
            return
        L_0x0058:
            r5 = move-exception
            com.google.android.gms.internal.ads.pm0.m18665e(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k20.<init>(com.google.android.gms.internal.ads.j20):void");
    }
}
