package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.sb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7173sb extends C7141qb {
    C7173sb() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ int mo23791a(Object obj) {
        return ((C7157rb) obj).mo23819a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ int mo23792b(Object obj) {
        return ((C7157rb) obj).mo23820b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo23793c(Object obj) {
        C6995h9 h9Var = (C6995h9) obj;
        C7157rb rbVar = h9Var.zzc;
        if (rbVar != C7157rb.m40813c()) {
            return rbVar;
        }
        C7157rb f = C7157rb.m40815f();
        h9Var.zzc = f;
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Object mo23794d(Object obj) {
        return ((C6995h9) obj).zzc;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo23795e(Object obj, Object obj2) {
        if (C7157rb.m40813c().equals(obj2)) {
            return obj;
        }
        if (C7157rb.m40813c().equals(obj)) {
            return C7157rb.m40814e((C7157rb) obj, (C7157rb) obj2);
        }
        ((C7157rb) obj).mo23821d((C7157rb) obj2);
        return obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo23796f(Object obj, int i, long j) {
        ((C7157rb) obj).mo23827j(i << 3, Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo23797g(Object obj) {
        ((C6995h9) obj).zzc.mo23824h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo23798h(Object obj, Object obj2) {
        ((C6995h9) obj).zzc = (C7157rb) obj2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo23799i(Object obj, C7030jc jcVar) throws IOException {
        ((C7157rb) obj).mo23828k(jcVar);
    }
}
