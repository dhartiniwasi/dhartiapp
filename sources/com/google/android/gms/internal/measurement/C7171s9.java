package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C7171s9 {

    /* renamed from: c */
    private static final C7186t8 f32055c = C7186t8.f32111c;

    /* renamed from: a */
    protected volatile C7092na f32056a;

    /* renamed from: b */
    private volatile C6977g8 f32057b;

    /* renamed from: a */
    public final int mo23875a() {
        if (this.f32057b != null) {
            return ((C6926d8) this.f32057b).f31644e.length;
        }
        if (this.f32056a != null) {
            return this.f32056a.mo23488d();
        }
        return 0;
    }

    /* renamed from: b */
    public final C6977g8 mo23876b() {
        if (this.f32057b != null) {
            return this.f32057b;
        }
        synchronized (this) {
            if (this.f32057b != null) {
                C6977g8 g8Var = this.f32057b;
                return g8Var;
            }
            if (this.f32056a == null) {
                this.f32057b = C6977g8.f31702b;
            } else {
                this.f32057b = this.f32056a.mo23699a();
            }
            C6977g8 g8Var2 = this.f32057b;
            return g8Var2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23877c(com.google.android.gms.internal.measurement.C7092na r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.na r0 = r1.f32056a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.na r0 = r1.f32056a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f32056a = r2     // Catch:{ q9 -> 0x0011 }
            com.google.android.gms.internal.measurement.g8 r0 = com.google.android.gms.internal.measurement.C6977g8.f31702b     // Catch:{ q9 -> 0x0011 }
            r1.f32057b = r0     // Catch:{ q9 -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f32056a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.g8 r2 = com.google.android.gms.internal.measurement.C6977g8.f31702b     // Catch:{ all -> 0x001b }
            r1.f32057b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7171s9.mo23877c(com.google.android.gms.internal.measurement.na):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7171s9)) {
            return false;
        }
        C7171s9 s9Var = (C7171s9) obj;
        C7092na naVar = this.f32056a;
        C7092na naVar2 = s9Var.f32056a;
        if (naVar == null && naVar2 == null) {
            return mo23876b().equals(s9Var.mo23876b());
        }
        if (naVar != null && naVar2 != null) {
            return naVar.equals(naVar2);
        }
        if (naVar != null) {
            s9Var.mo23877c(naVar.mo23489e());
            return naVar.equals(s9Var.f32056a);
        }
        mo23877c(naVar2.mo23489e());
        return this.f32056a.equals(naVar2);
    }

    public int hashCode() {
        return 1;
    }
}
