package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.ja */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2506ja extends FilterInputStream {

    /* renamed from: a */
    private final long f11283a;

    /* renamed from: b */
    private long f11284b;

    C2506ja(InputStream inputStream, long j) {
        super(inputStream);
        this.f11283a = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo11346a() {
        return this.f11283a - this.f11284b;
    }

    public final int read() throws IOException {
        int read = super.read();
        if (read != -1) {
            this.f11284b++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f11284b += (long) read;
        }
        return read;
    }
}
