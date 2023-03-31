package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C3755t2 {

    /* renamed from: c */
    private static final C3852w1 f22722c = C3852w1.f22855b;

    /* renamed from: a */
    protected volatile C3591o3 f22723a;

    /* renamed from: b */
    private volatile C3325g1 f22724b;

    /* renamed from: a */
    public final int mo16791a() {
        if (this.f22724b != null) {
            return ((C3193c1) this.f22724b).f21797e.length;
        }
        if (this.f22723a != null) {
            return this.f22723a.mo16201d0();
        }
        return 0;
    }

    /* renamed from: b */
    public final C3325g1 mo16792b() {
        if (this.f22724b != null) {
            return this.f22724b;
        }
        synchronized (this) {
            if (this.f22724b != null) {
                C3325g1 g1Var = this.f22724b;
                return g1Var;
            }
            if (this.f22723a == null) {
                this.f22724b = C3325g1.f22056b;
            } else {
                this.f22724b = this.f22723a.mo16477Y();
            }
            C3325g1 g1Var2 = this.f22724b;
            return g1Var2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16793c(com.google.android.gms.internal.p026firebaseauthapi.C3591o3 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.firebase-auth-api.o3 r0 = r1.f22723a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.firebase-auth-api.o3 r0 = r1.f22723a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f22723a = r2     // Catch:{ r2 -> 0x0011 }
            com.google.android.gms.internal.firebase-auth-api.g1 r0 = com.google.android.gms.internal.p026firebaseauthapi.C3325g1.f22056b     // Catch:{ r2 -> 0x0011 }
            r1.f22724b = r0     // Catch:{ r2 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f22723a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.firebase-auth-api.g1 r2 = com.google.android.gms.internal.p026firebaseauthapi.C3325g1.f22056b     // Catch:{ all -> 0x001b }
            r1.f22724b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p026firebaseauthapi.C3755t2.mo16793c(com.google.android.gms.internal.firebase-auth-api.o3):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3755t2)) {
            return false;
        }
        C3755t2 t2Var = (C3755t2) obj;
        C3591o3 o3Var = this.f22723a;
        C3591o3 o3Var2 = t2Var.f22723a;
        if (o3Var == null && o3Var2 == null) {
            return mo16792b().equals(t2Var.mo16792b());
        }
        if (o3Var != null && o3Var2 != null) {
            return o3Var.equals(o3Var2);
        }
        if (o3Var != null) {
            t2Var.mo16793c(o3Var.mo16198I());
            return o3Var.equals(t2Var.f22723a);
        }
        mo16793c(o3Var2.mo16198I());
        return this.f22723a.equals(o3Var2);
    }

    public int hashCode() {
        return 1;
    }
}
