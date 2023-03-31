package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import p007a5.C0106c;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2096i implements C0106c.C0107a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f6205a;

    /* renamed from: b */
    final /* synthetic */ C2102k f6206b;

    C2096i(C2102k kVar, BasePendingResult basePendingResult) {
        this.f6206b = kVar;
        this.f6205a = basePendingResult;
    }

    /* renamed from: a */
    public final void mo255a(Status status) {
        this.f6206b.f6229a.remove(this.f6205a);
    }
}
