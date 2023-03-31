package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class sb2 implements cd2 {

    /* renamed from: a */
    final /* synthetic */ tb2 f17340a;

    sb2(tb2 tb2) {
        this.f17340a = tb2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo9127c(Object obj) {
        r31 r31 = (r31) obj;
        synchronized (this.f17340a) {
            tb2 tb2 = this.f17340a;
            if (tb2.f17938h != null) {
                tb2.f17938h.mo11305a();
            }
            this.f17340a.f17938h = r31;
            this.f17340a.f17938h.mo8205b();
        }
    }

    public final void zza() {
        synchronized (this.f17340a) {
            this.f17340a.f17938h = null;
        }
    }
}
