package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class hy3 {

    /* renamed from: c */
    private static final ex3 f10540c = ex3.m12308a();

    /* renamed from: a */
    protected volatile cz3 f10541a;

    /* renamed from: b */
    private volatile jw3 f10542b;

    /* renamed from: a */
    public final int mo10969a() {
        if (this.f10542b != null) {
            return ((fw3) this.f10542b).f9568e.length;
        }
        if (this.f10541a != null) {
            return this.f10541a.mo9404l();
        }
        return 0;
    }

    /* renamed from: b */
    public final jw3 mo10970b() {
        if (this.f10542b != null) {
            return this.f10542b;
        }
        synchronized (this) {
            if (this.f10542b != null) {
                jw3 jw3 = this.f10542b;
                return jw3;
            }
            if (this.f10541a == null) {
                this.f10542b = jw3.f11808b;
            } else {
                this.f10542b = this.f10541a.mo9402e();
            }
            jw3 jw32 = this.f10542b;
            return jw32;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10971c(com.google.android.gms.internal.ads.cz3 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.ads.cz3 r0 = r1.f10541a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.ads.cz3 r0 = r1.f10541a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f10541a = r2     // Catch:{ ey3 -> 0x0011 }
            com.google.android.gms.internal.ads.jw3 r0 = com.google.android.gms.internal.ads.jw3.f11808b     // Catch:{ ey3 -> 0x0011 }
            r1.f10542b = r0     // Catch:{ ey3 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f10541a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.ads.jw3 r2 = com.google.android.gms.internal.ads.jw3.f11808b     // Catch:{ all -> 0x001b }
            r1.f10542b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hy3.mo10971c(com.google.android.gms.internal.ads.cz3):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy3)) {
            return false;
        }
        hy3 hy3 = (hy3) obj;
        cz3 cz3 = this.f10541a;
        cz3 cz32 = hy3.f10541a;
        if (cz3 == null && cz32 == null) {
            return mo10970b().equals(hy3.mo10970b());
        }
        if (cz3 != null && cz32 != null) {
            return cz3.equals(cz32);
        }
        if (cz3 != null) {
            hy3.mo10971c(cz3.mo9745c());
            return cz3.equals(hy3.f10541a);
        }
        mo10971c(cz32.mo9745c());
        return this.f10541a.equals(cz32);
    }

    public int hashCode() {
        return 1;
    }
}
