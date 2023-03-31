package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ua */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2914ua extends ByteArrayOutputStream {

    /* renamed from: a */
    private final C2394ga f18468a;

    public C2914ua(C2394ga gaVar, int i) {
        this.f18468a = gaVar;
        this.buf = gaVar.mo10443b(Math.max(i, 256));
    }

    /* renamed from: a */
    private final void m21496a(int i) {
        int i2 = this.count;
        if (i2 + i > this.buf.length) {
            int i3 = i2 + i;
            byte[] b = this.f18468a.mo10443b(i3 + i3);
            System.arraycopy(this.buf, 0, b, 0, this.count);
            this.f18468a.mo10442a(this.buf);
            this.buf = b;
        }
    }

    public final void close() throws IOException {
        this.f18468a.mo10442a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.f18468a.mo10442a(this.buf);
    }

    public final synchronized void write(int i) {
        m21496a(1);
        super.write(i);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        m21496a(i2);
        super.write(bArr, i, i2);
    }
}
