package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pl0 {

    /* renamed from: a */
    private long f15895a = -1;

    /* renamed from: b */
    private long f15896b = -1;

    /* renamed from: c */
    final /* synthetic */ ql0 f15897c;

    public pl0(ql0 ql0) {
        this.f15897c = ql0;
    }

    /* renamed from: a */
    public final long mo13296a() {
        return this.f15896b;
    }

    /* renamed from: b */
    public final Bundle mo13297b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f15895a);
        bundle.putLong("tclose", this.f15896b);
        return bundle;
    }

    /* renamed from: c */
    public final void mo13298c() {
        this.f15896b = this.f15897c.f16452a.mo18371b();
    }

    /* renamed from: d */
    public final void mo13299d() {
        this.f15895a = this.f15897c.f16452a.mo18371b();
    }
}
