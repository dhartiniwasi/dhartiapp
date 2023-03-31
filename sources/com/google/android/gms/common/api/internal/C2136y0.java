package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import p007a5.C0108d;
import p007a5.C0111g;
import p007a5.C0112h;
import p007a5.C0113i;
import p007a5.C0114j;
import p007a5.C0115k;
import p017b5.C1790c0;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.common.api.internal.y0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2136y0<R extends C0111g> extends C0115k<R> implements C0112h<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0114j<? super R, ? extends C0111g> f6302a;

    /* renamed from: b */
    private C2136y0<? extends C0111g> f6303b;

    /* renamed from: c */
    private volatile C0113i<? super R> f6304c;

    /* renamed from: d */
    private final Object f6305d;

    /* renamed from: e */
    private Status f6306e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<GoogleApiClient> f6307f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2132w0 f6308g;

    /* renamed from: g */
    private final void m9473g(Status status) {
        synchronized (this.f6305d) {
            this.f6306e = status;
            m9474h(status);
        }
    }

    /* renamed from: h */
    private final void m9474h(Status status) {
        synchronized (this.f6305d) {
            C0114j<? super R, ? extends C0111g> jVar = this.f6302a;
            if (jVar != null) {
                ((C2136y0) C4141r.m28221k(this.f6303b)).m9473g((Status) C4141r.m28222l(jVar.mo263a(status), "onFailure must not return null"));
            } else if (m9475i()) {
                ((C0113i) C4141r.m28221k(this.f6304c)).mo261b(status);
            }
        }
    }

    /* renamed from: i */
    private final boolean m9475i() {
        return (this.f6304c == null || ((GoogleApiClient) this.f6307f.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m9476j(C0111g gVar) {
        if (gVar instanceof C0108d) {
            try {
                ((C0108d) gVar).mo256a();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(gVar)), e);
            }
        }
    }

    /* renamed from: a */
    public final void mo260a(R r) {
        synchronized (this.f6305d) {
            if (!r.mo259d1().mo7953M1()) {
                m9473g(r.mo259d1());
                m9476j(r);
            } else if (this.f6302a != null) {
                C1790c0.m8424a().submit(new C2130v0(this, r));
            } else if (m9475i()) {
                ((C0113i) C4141r.m28221k(this.f6304c)).mo262c(r);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo8124f() {
        this.f6304c = null;
    }
}
