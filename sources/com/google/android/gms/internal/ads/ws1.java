package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ws1 {

    /* renamed from: a */
    private final Map f19768a = new HashMap();

    ws1() {
    }

    /* renamed from: a */
    public final synchronized vs1 mo14984a(String str) {
        return (vs1) this.f19768a.get(str);
    }

    /* renamed from: b */
    public final vs1 mo14985b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vs1 a = mo14984a((String) it.next());
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.f19230b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo14986c(java.lang.String r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.ads.vs1 r1 = r0.mo14984a(r1)
            if (r1 == 0) goto L_0x0010
            com.google.android.gms.internal.ads.wd0 r1 = r1.f19230b
            if (r1 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0010:
            java.lang.String r1 = ""
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws1.mo14986c(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x003a */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0019 A[SYNTHETIC, Splitter:B:15:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo14987d(java.lang.String r7, com.google.android.gms.internal.ads.au2 r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.Map r0 = r6.f19768a     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.containsKey(r7)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r6)
            return
        L_0x000b:
            com.google.android.gms.internal.ads.vs1 r0 = new com.google.android.gms.internal.ads.vs1     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r8 != 0) goto L_0x0012
        L_0x0010:
            r2 = r1
            goto L_0x0016
        L_0x0012:
            com.google.android.gms.internal.ads.wd0 r2 = r8.mo8544h()     // Catch:{ jt2 -> 0x0010 }
        L_0x0016:
            if (r8 != 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            com.google.android.gms.internal.ads.wd0 r1 = r8.mo8545i()     // Catch:{ jt2 -> 0x001d }
        L_0x001d:
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14496Z7     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.lz r4 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r3 = r4.mo12227b(r3)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0044 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0044 }
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0033
        L_0x0031:
            r4 = 1
            goto L_0x003a
        L_0x0033:
            if (r8 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            r8.mo8537a()     // Catch:{ jt2 -> 0x003a }
            goto L_0x0031
        L_0x003a:
            r0.<init>(r7, r2, r1, r4)     // Catch:{ all -> 0x0044 }
            java.util.Map r8 = r6.f19768a     // Catch:{ all -> 0x0044 }
            r8.put(r7, r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)
            return
        L_0x0044:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ws1.mo14987d(java.lang.String, com.google.android.gms.internal.ads.au2):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo14988e(String str, kd0 kd0) {
        if (!this.f19768a.containsKey(str)) {
            try {
                this.f19768a.put(str, new vs1(str, kd0.mo11086T(), kd0.mo11089c(), true));
            } catch (Throwable unused) {
            }
        }
    }
}
