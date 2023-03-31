package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.bb */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2209bb extends l34 {

    /* renamed from: i */
    private static final t34 f7191i = t34.m20792b(C2209bb.class);

    public C2209bb(m34 m34, C2172ab abVar) throws IOException {
        mo11891m(m34, m34.mo12272e(), abVar);
    }

    public final void close() throws IOException {
    }

    public final String toString() {
        String obj = this.f12641b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
