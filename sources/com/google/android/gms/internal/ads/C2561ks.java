package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p053g4.C4409t;

/* renamed from: com.google.android.gms.internal.ads.ks */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2561ks {

    /* renamed from: a */
    private final Object f12260a = new Object();

    /* renamed from: b */
    int f12261b;

    /* renamed from: c */
    private final List f12262c = new LinkedList();

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2524js mo11785a(boolean r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f12260a
            monitor-enter(r0)
            java.util.List r1 = r8.f12262c     // Catch:{ all -> 0x0061 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0061 }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            java.lang.String r9 = "Queue empty"
            com.google.android.gms.internal.ads.pm0.m18662b(r9)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x0013:
            java.util.List r1 = r8.f12262c     // Catch:{ all -> 0x0061 }
            int r1 = r1.size()     // Catch:{ all -> 0x0061 }
            r3 = 2
            r4 = 0
            if (r1 < r3) goto L_0x004c
            java.util.List r9 = r8.f12262c     // Catch:{ all -> 0x0061 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0061 }
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
        L_0x0026:
            boolean r5 = r9.hasNext()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.js r5 = (com.google.android.gms.internal.ads.C2524js) r5     // Catch:{ all -> 0x0061 }
            int r6 = r5.mo11489b()     // Catch:{ all -> 0x0061 }
            if (r6 <= r1) goto L_0x0039
            r4 = r3
        L_0x0039:
            if (r6 <= r1) goto L_0x003d
            r7 = r6
            goto L_0x003e
        L_0x003d:
            r7 = r1
        L_0x003e:
            if (r6 <= r1) goto L_0x0041
            r2 = r5
        L_0x0041:
            int r3 = r3 + 1
            r1 = r7
            goto L_0x0026
        L_0x0045:
            java.util.List r9 = r8.f12262c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r2
        L_0x004c:
            java.util.List r1 = r8.f12262c     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0061 }
            com.google.android.gms.internal.ads.js r1 = (com.google.android.gms.internal.ads.C2524js) r1     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x005c
            java.util.List r9 = r8.f12262c     // Catch:{ all -> 0x0061 }
            r9.remove(r4)     // Catch:{ all -> 0x0061 }
            goto L_0x005f
        L_0x005c:
            r1.mo11498i()     // Catch:{ all -> 0x0061 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0061:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2561ks.mo11785a(boolean):com.google.android.gms.internal.ads.js");
    }

    /* renamed from: b */
    public final void mo11786b(C2524js jsVar) {
        synchronized (this.f12260a) {
            if (this.f12262c.size() >= 10) {
                int size = this.f12262c.size();
                pm0.m18662b("Queue is full, current size = " + size);
                this.f12262c.remove(0);
            }
            int i = this.f12261b;
            this.f12261b = i + 1;
            jsVar.mo11499j(i);
            jsVar.mo11503n();
            this.f12262c.add(jsVar);
        }
    }

    /* renamed from: c */
    public final boolean mo11787c(C2524js jsVar) {
        synchronized (this.f12260a) {
            Iterator it = this.f12262c.iterator();
            while (it.hasNext()) {
                C2524js jsVar2 = (C2524js) it.next();
                if (!C4409t.m29325q().mo15117h().mo18520y()) {
                    if (!jsVar.equals(jsVar2) && jsVar2.mo11491d().equals(jsVar.mo11491d())) {
                        it.remove();
                        return true;
                    }
                } else if (!C4409t.m29325q().mo15117h().mo18508m() && !jsVar.equals(jsVar2) && jsVar2.mo11494f().equals(jsVar.mo11494f())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo11788d(C2524js jsVar) {
        synchronized (this.f12260a) {
            if (this.f12262c.contains(jsVar)) {
                return true;
            }
            return false;
        }
    }
}
