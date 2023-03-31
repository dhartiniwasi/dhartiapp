package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2772qg extends C2513jh {

    /* renamed from: i */
    private final Map f16366i;

    /* renamed from: j */
    private final View f16367j;

    public C2772qg(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2, Map map, View view) {
        super(wfVar, "RKC3mFMqGi7xOgQ7s39JMoZe9bnzGCFipcdUUf0vlgHDkBg7SvMkVmBGpwLs06ia", "8Xr1ilYJHo+oWZQAYAG91DIHBuqEmXK8yHtxL6KkyfU=", ybVar, i, 85);
        this.f16366i = map;
        this.f16367j = view;
    }

    /* renamed from: c */
    private final long m19201c(int i) {
        Map map = this.f16366i;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return ((Long) this.f16366i.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object[]} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8332a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r10 = this;
            r0 = 2
            long[] r1 = new long[r0]
            r2 = 1
            long r3 = r10.m19201c(r2)
            r5 = 0
            r1[r5] = r3
            long r3 = r10.m19201c(r0)
            r1[r2] = r3
            java.lang.reflect.Method r3 = r10.f11604f
            r4 = 3
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r5] = r1
            com.google.android.gms.internal.ads.wf r1 = r10.f11600b
            android.content.Context r1 = r1.mo14902b()
            r6[r2] = r1
            android.view.View r1 = r10.f16367j
            r6[r0] = r1
            r1 = 0
            java.lang.Object r1 = r3.invoke(r1, r6)
            long[] r1 = (long[]) r1
            r5 = r1[r5]
            java.util.Map r3 = r10.f16366i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = r1[r2]
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r3.put(r7, r2)
            r2 = r1[r0]
            java.util.Map r7 = r10.f16366i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = r1[r4]
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r7.put(r0, r1)
            com.google.android.gms.internal.ads.yb r0 = r10.f11603e
            monitor-enter(r0)
            com.google.android.gms.internal.ads.yb r1 = r10.f11603e     // Catch:{ all -> 0x005c }
            r1.mo15409v0(r5)     // Catch:{ all -> 0x005c }
            com.google.android.gms.internal.ads.yb r1 = r10.f11603e     // Catch:{ all -> 0x005c }
            r1.mo15407u0(r2)     // Catch:{ all -> 0x005c }
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            return
        L_0x005c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2772qg.mo8332a():void");
    }
}
