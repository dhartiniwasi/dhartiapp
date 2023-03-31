package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class C3015x0 {

    /* renamed from: a */
    protected final C2792r f19920a;

    protected C3015x0(C2792r rVar) {
        this.f19920a = rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo13915a(y22 y22) throws ea0;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo13916b(y22 y22, long j) throws ea0;

    /* renamed from: c */
    public final boolean mo15014c(y22 y22, long j) throws ea0 {
        return mo13915a(y22) && mo13916b(y22, j);
    }
}
