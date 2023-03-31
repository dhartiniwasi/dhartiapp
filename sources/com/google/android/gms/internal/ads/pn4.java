package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pn4 implements C2792r {

    /* renamed from: a */
    private final byte[] f15934a = new byte[4096];

    /* renamed from: a */
    public final /* synthetic */ int mo8819a(cf4 cf4, int i, boolean z) {
        return C2717p.m18260a(this, cf4, i, z);
    }

    /* renamed from: b */
    public final int mo8820b(cf4 cf4, int i, boolean z, int i2) throws IOException {
        int c = cf4.mo8792c(this.f15934a, 0, Math.min(4096, i));
        if (c != -1) {
            return c;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo8821c(y22 y22, int i) {
        C2717p.m18261b(this, y22, i);
    }

    /* renamed from: d */
    public final void mo8822d(y22 y22, int i, int i2) {
        y22.mo15294g(i);
    }

    /* renamed from: e */
    public final void mo8823e(C2388g4 g4Var) {
    }

    /* renamed from: f */
    public final void mo8824f(long j, int i, int i2, int i3, C2755q qVar) {
    }
}
