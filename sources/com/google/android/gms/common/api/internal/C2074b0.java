package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C2051a;
import java.util.Collections;
import p007a5.C0111g;
import p017b5.C1813o;
import p180z4.C6362b;

/* renamed from: com.google.android.gms.common.api.internal.b0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C2074b0 implements C1813o {

    /* renamed from: a */
    private final C2097i0 f6115a;

    public C2074b0(C2097i0 i0Var) {
        this.f6115a = i0Var;
    }

    /* renamed from: a */
    public final void mo6970a(Bundle bundle) {
    }

    /* renamed from: b */
    public final void mo6971b() {
        this.f6115a.mo8076k();
    }

    /* renamed from: c */
    public final void mo6972c(C6362b bVar, C2051a<?> aVar, boolean z) {
    }

    /* renamed from: d */
    public final void mo6973d(int i) {
    }

    /* renamed from: e */
    public final void mo6974e() {
        for (C2051a.C2060f e : this.f6115a.f6212f.values()) {
            e.mo6935e();
        }
        this.f6115a.f6220v.f6165p = Collections.emptySet();
    }

    /* renamed from: f */
    public final <A extends C2051a.C2053b, R extends C0111g, T extends C2073b<R, A>> T mo6975f(T t) {
        this.f6115a.f6220v.f6157h.add(t);
        return t;
    }

    /* renamed from: g */
    public final boolean mo6976g() {
        return true;
    }

    /* renamed from: h */
    public final <A extends C2051a.C2053b, T extends C2073b<? extends C0111g, A>> T mo6977h(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
