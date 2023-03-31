package p037e2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p155v3.C5819i;
import p161w3.C5953m0;
import p177z1.C6260o1;

/* renamed from: e2.f */
/* compiled from: DefaultExtractorInput */
public final class C4202f implements C4216m {

    /* renamed from: a */
    private final byte[] f23504a = new byte[4096];

    /* renamed from: b */
    private final C5819i f23505b;

    /* renamed from: c */
    private final long f23506c;

    /* renamed from: d */
    private long f23507d;

    /* renamed from: e */
    private byte[] f23508e = new byte[65536];

    /* renamed from: f */
    private int f23509f;

    /* renamed from: g */
    private int f23510g;

    static {
        C6260o1.m36802a("goog.exo.extractor");
    }

    public C4202f(C5819i iVar, long j, long j2) {
        this.f23505b = iVar;
        this.f23507d = j;
        this.f23506c = j2;
    }

    /* renamed from: q */
    private void m28396q(int i) {
        if (i != -1) {
            this.f23507d += (long) i;
        }
    }

    /* renamed from: r */
    private void m28397r(int i) {
        int i2 = this.f23509f + i;
        byte[] bArr = this.f23508e;
        if (i2 > bArr.length) {
            this.f23508e = Arrays.copyOf(this.f23508e, C5953m0.m35152q(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: s */
    private int m28398s(byte[] bArr, int i, int i2) {
        int i3 = this.f23510g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f23508e, 0, bArr, i, min);
        m28401w(min);
        return min;
    }

    /* renamed from: t */
    private int m28399t(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f23505b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: u */
    private int m28400u(int i) {
        int min = Math.min(this.f23510g, i);
        m28401w(min);
        return min;
    }

    /* renamed from: w */
    private void m28401w(int i) {
        int i2 = this.f23510g - i;
        this.f23510g = i2;
        this.f23509f = 0;
        byte[] bArr = this.f23508e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f23508e = bArr2;
    }

    /* renamed from: a */
    public int mo17552a(int i) throws IOException {
        int u = m28400u(i);
        if (u == 0) {
            byte[] bArr = this.f23504a;
            u = m28399t(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m28396q(u);
        return u;
    }

    /* renamed from: b */
    public long mo17553b() {
        return this.f23506c;
    }

    /* renamed from: c */
    public long mo17554c() {
        return this.f23507d;
    }

    /* renamed from: d */
    public boolean mo17555d(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int s = m28398s(bArr, i, i2);
        while (s < i2 && s != -1) {
            s = m28399t(bArr, i, i2, s, z);
        }
        m28396q(s);
        return s != -1;
    }

    /* renamed from: e */
    public boolean mo17556e(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!mo17562l(i2, z)) {
            return false;
        }
        System.arraycopy(this.f23508e, this.f23509f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: f */
    public long mo17557f() {
        return this.f23507d + ((long) this.f23509f);
    }

    /* renamed from: g */
    public void mo17558g(int i) throws IOException {
        mo17562l(i, false);
    }

    /* renamed from: h */
    public int mo17559h(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        m28397r(i2);
        int i4 = this.f23510g;
        int i5 = this.f23509f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = m28399t(this.f23508e, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.f23510g += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.f23508e, this.f23509f, bArr, i, i3);
        this.f23509f += i3;
        return i3;
    }

    /* renamed from: j */
    public void mo17560j() {
        this.f23509f = 0;
    }

    /* renamed from: k */
    public void mo17561k(int i) throws IOException {
        mo17565v(i, false);
    }

    /* renamed from: l */
    public boolean mo17562l(int i, boolean z) throws IOException {
        m28397r(i);
        int i2 = this.f23510g - this.f23509f;
        while (i2 < i) {
            i2 = m28399t(this.f23508e, this.f23509f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f23510g = this.f23509f + i2;
        }
        this.f23509f += i;
        return true;
    }

    /* renamed from: p */
    public void mo17563p(byte[] bArr, int i, int i2) throws IOException {
        mo17556e(bArr, i, i2, false);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int s = m28398s(bArr, i, i2);
        if (s == 0) {
            s = m28399t(bArr, i, i2, 0, true);
        }
        m28396q(s);
        return s;
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        mo17555d(bArr, i, i2, false);
    }

    /* renamed from: v */
    public boolean mo17565v(int i, boolean z) throws IOException {
        int u = m28400u(i);
        while (u < i && u != -1) {
            u = m28399t(this.f23504a, -u, Math.min(i, this.f23504a.length + u), u, z);
        }
        m28396q(u);
        return u != -1;
    }
}
