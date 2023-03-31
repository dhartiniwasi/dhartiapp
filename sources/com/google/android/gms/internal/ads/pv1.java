package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p053g4.C4409t;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pv1 {

    /* renamed from: a */
    private final C4800p1 f16048a;

    /* renamed from: b */
    private final List f16049b = new ArrayList();

    /* renamed from: c */
    private boolean f16050c = false;

    /* renamed from: d */
    private boolean f16051d = false;

    /* renamed from: e */
    private final String f16052e;

    /* renamed from: f */
    private final lv1 f16053f;

    public pv1(String str, lv1 lv1) {
        this.f16052e = str;
        this.f16053f = lv1;
        this.f16048a = C4409t.m29325q().mo15117h();
    }

    /* renamed from: g */
    private final Map m18920g() {
        String str;
        Map f = this.f16053f.mo12155f();
        f.put("tms", Long.toString(C4409t.m29310b().mo18371b(), 10));
        if (this.f16048a.mo18501f0()) {
            str = "";
        } else {
            str = this.f16052e;
        }
        f.put("tid", str);
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13396a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14374N1     // Catch:{ all -> 0x0041 }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r0.mo12227b(r3)     // Catch:{ all -> 0x0041 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0041 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x003f
            com.google.android.gms.internal.ads.ez r3 = com.google.android.gms.internal.ads.C2679nz.f14685s7     // Catch:{ all -> 0x0041 }
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r0.mo12227b(r3)     // Catch:{ all -> 0x0041 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0041 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0026
            goto L_0x003f
        L_0x0026:
            java.util.Map r3 = r2.m18920g()     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "action"
            java.lang.String r1 = "aaia"
            r3.put(r0, r1)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = "aair"
            java.lang.String r1 = "MalformedJson"
            r3.put(r0, r1)     // Catch:{ all -> 0x0041 }
            java.util.List r0 = r2.f16049b     // Catch:{ all -> 0x0041 }
            r0.add(r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r2)
            return
        L_0x003f:
            monitor-exit(r2)
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pv1.mo13396a(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13397b(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14374N1     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14685s7     // Catch:{ all -> 0x0044 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x0044 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            java.util.Map r0 = r3.m18920g()     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r4 = "rqe"
            r0.put(r4, r5)     // Catch:{ all -> 0x0044 }
            java.util.List r4 = r3.f16049b     // Catch:{ all -> 0x0044 }
            r4.add(r0)     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)
            return
        L_0x0042:
            monitor-exit(r3)
            return
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pv1.mo13397b(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13398c(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14374N1     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14685s7     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            java.util.Map r0 = r3.m18920g()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x003f }
            java.util.List r4 = r3.f16049b     // Catch:{ all -> 0x003f }
            r4.add(r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return
        L_0x003d:
            monitor-exit(r3)
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pv1.mo13398c(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13399d(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14374N1     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14685s7     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x003f }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x003f }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x003f }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0026
            goto L_0x003d
        L_0x0026:
            java.util.Map r0 = r3.m18920g()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "action"
            java.lang.String r2 = "adapter_init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "ancn"
            r0.put(r1, r4)     // Catch:{ all -> 0x003f }
            java.util.List r4 = r3.f16049b     // Catch:{ all -> 0x003f }
            r4.add(r0)     // Catch:{ all -> 0x003f }
            monitor-exit(r3)
            return
        L_0x003d:
            monitor-exit(r3)
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pv1.mo13399d(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13400e() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14374N1     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0059
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14685s7     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x005b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0026
            goto L_0x0059
        L_0x0026:
            boolean r0 = r3.f16051d     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0057
            java.util.Map r0 = r3.m18920g()     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_finished"
            r0.put(r1, r2)     // Catch:{ all -> 0x005b }
            java.util.List r1 = r3.f16049b     // Catch:{ all -> 0x005b }
            r1.add(r0)     // Catch:{ all -> 0x005b }
            java.util.List r0 = r3.f16049b     // Catch:{ all -> 0x005b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x005b }
        L_0x0040:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x005b }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.ads.lv1 r2 = r3.f16053f     // Catch:{ all -> 0x005b }
            r2.mo12717e(r1)     // Catch:{ all -> 0x005b }
            goto L_0x0040
        L_0x0052:
            r0 = 1
            r3.f16051d = r0     // Catch:{ all -> 0x005b }
            monitor-exit(r3)
            return
        L_0x0057:
            monitor-exit(r3)
            return
        L_0x0059:
            monitor-exit(r3)
            return
        L_0x005b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pv1.mo13400e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo13401f() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14374N1     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14685s7     // Catch:{ all -> 0x0043 }
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r1.mo12227b(r0)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0043 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0026
            goto L_0x0041
        L_0x0026:
            boolean r0 = r3.f16050c     // Catch:{ all -> 0x0043 }
            if (r0 != 0) goto L_0x003f
            java.util.Map r0 = r3.m18920g()     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "init_started"
            r0.put(r1, r2)     // Catch:{ all -> 0x0043 }
            java.util.List r1 = r3.f16049b     // Catch:{ all -> 0x0043 }
            r1.add(r0)     // Catch:{ all -> 0x0043 }
            r0 = 1
            r3.f16050c = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)
            return
        L_0x003f:
            monitor-exit(r3)
            return
        L_0x0041:
            monitor-exit(r3)
            return
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pv1.mo13401f():void");
    }
}
