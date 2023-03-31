package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class jv2 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ mv2 f11804a;

    /* renamed from: b */
    final /* synthetic */ nv2 f11805b;

    jv2(nv2 nv2, mv2 mv2) {
        this.f11805b = nv2;
        this.f11804a = mv2;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        synchronized (this.f11805b) {
            this.f11805b.f14213e = null;
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.f11805b) {
            this.f11805b.f14213e = null;
            this.f11805b.f14212d.addFirst(this.f11804a);
            nv2 nv2 = this.f11805b;
            if (nv2.f14214f == 1) {
                nv2.m17288h();
            }
        }
    }
}
