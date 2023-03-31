package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ud3 implements ql2 {

    /* renamed from: a */
    private final ql2 f18502a;

    /* renamed from: b */
    private long f18503b;

    /* renamed from: c */
    private Uri f18504c = Uri.EMPTY;

    /* renamed from: d */
    private Map f18505d = Collections.emptyMap();

    public ud3(ql2 ql2) {
        Objects.requireNonNull(ql2);
        this.f18502a = ql2;
    }

    /* renamed from: a */
    public final Map mo8790a() {
        return this.f18502a.mo8790a();
    }

    /* renamed from: b */
    public final void mo8791b() throws IOException {
        this.f18502a.mo8791b();
    }

    /* renamed from: c */
    public final int mo8792c(byte[] bArr, int i, int i2) throws IOException {
        int c = this.f18502a.mo8792c(bArr, i, i2);
        if (c != -1) {
            this.f18503b += (long) c;
        }
        return c;
    }

    /* renamed from: e */
    public final Uri mo8793e() {
        return this.f18502a.mo8793e();
    }

    /* renamed from: f */
    public final long mo8794f(wq2 wq2) throws IOException {
        this.f18504c = wq2.f19753a;
        this.f18505d = Collections.emptyMap();
        long f = this.f18502a.mo8794f(wq2);
        Uri e = mo8793e();
        Objects.requireNonNull(e);
        this.f18504c = e;
        this.f18505d = mo8790a();
        return f;
    }

    /* renamed from: k */
    public final void mo8795k(ve3 ve3) {
        Objects.requireNonNull(ve3);
        this.f18502a.mo8795k(ve3);
    }

    /* renamed from: m */
    public final long mo14493m() {
        return this.f18503b;
    }

    /* renamed from: n */
    public final Uri mo14494n() {
        return this.f18504c;
    }

    /* renamed from: o */
    public final Map mo14495o() {
        return this.f18505d;
    }
}
