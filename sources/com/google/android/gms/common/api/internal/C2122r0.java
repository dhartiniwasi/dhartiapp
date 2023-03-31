package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.C2051a;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p017b5.C1787b;
import p017b5.C1796f0;
import p033d5.C4087c;
import p033d5.C4114j;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.r0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2122r0 implements C4087c.C4090c, C1796f0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2051a.C2060f f6272a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1787b<?> f6273b;

    /* renamed from: c */
    private C4114j f6274c = null;

    /* renamed from: d */
    private Set<Scope> f6275d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f6276e = false;

    /* renamed from: f */
    final /* synthetic */ C2076c f6277f;

    public C2122r0(C2076c cVar, C2051a.C2060f fVar, C1787b<?> bVar) {
        this.f6277f = cVar;
        this.f6272a = fVar;
        this.f6273b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m9448h() {
        C4114j jVar;
        if (this.f6276e && (jVar = this.f6274c) != null) {
            this.f6272a.mo6939i(jVar, this.f6275d);
        }
    }

    /* renamed from: a */
    public final void mo6952a(C6362b bVar) {
        C2115o0 o0Var = (C2115o0) this.f6277f.f6132t.get(this.f6273b);
        if (o0Var != null) {
            o0Var.mo8102G(bVar);
        }
    }

    /* renamed from: b */
    public final void mo6953b(C4114j jVar, Set<Scope> set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo6952a(new C6362b(4));
            return;
        }
        this.f6274c = jVar;
        this.f6275d = set;
        m9448h();
    }

    /* renamed from: c */
    public final void mo8121c(C6362b bVar) {
        this.f6277f.f6136x.post(new C2120q0(this, bVar));
    }
}
