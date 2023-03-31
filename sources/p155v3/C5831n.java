package p155v3;

import java.io.IOException;
import java.io.InputStream;
import p161w3.C5917a;

/* renamed from: v3.n */
/* compiled from: DataSourceInputStream */
public final class C5831n extends InputStream {

    /* renamed from: a */
    private final C5828l f28859a;

    /* renamed from: b */
    private final C5837p f28860b;

    /* renamed from: c */
    private final byte[] f28861c;

    /* renamed from: d */
    private boolean f28862d = false;

    /* renamed from: e */
    private boolean f28863e = false;

    /* renamed from: f */
    private long f28864f;

    public C5831n(C5828l lVar, C5837p pVar) {
        this.f28859a = lVar;
        this.f28860b = pVar;
        this.f28861c = new byte[1];
    }

    /* renamed from: a */
    private void m34614a() throws IOException {
        if (!this.f28862d) {
            this.f28859a.mo6819o(this.f28860b);
            this.f28862d = true;
        }
    }

    /* renamed from: b */
    public void mo20354b() throws IOException {
        m34614a();
    }

    public void close() throws IOException {
        if (!this.f28863e) {
            this.f28859a.close();
            this.f28863e = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f28861c) == -1) {
            return -1;
        }
        return this.f28861c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C5917a.m34873f(!this.f28863e);
        m34614a();
        int read = this.f28859a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f28864f += (long) read;
        return read;
    }
}
