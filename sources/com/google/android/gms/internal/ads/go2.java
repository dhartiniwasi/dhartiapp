package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class go2 implements cd2 {

    /* renamed from: a */
    final /* synthetic */ ho2 f10017a;

    go2(ho2 ho2) {
        this.f10017a = ho2;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo9127c(Object obj) {
        j31 j31 = (j31) obj;
        synchronized (this.f10017a) {
            j31 j312 = this.f10017a.f10442r;
            if (j312 != null) {
                j312.mo11305a();
            }
            ho2 ho2 = this.f10017a;
            ho2.f10442r = j31;
            j31.mo11307i(ho2);
            ho2 ho22 = this.f10017a;
            ho22.f10438f.mo15630j(new k31(j31, ho22, ho22.f10438f));
            j31.mo8205b();
        }
    }

    public final void zza() {
        synchronized (this.f10017a) {
            this.f10017a.f10442r = null;
        }
    }
}
