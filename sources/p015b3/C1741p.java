package p015b3;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p155v3.C5828l;
import p155v3.C5837p;
import p155v3.C5840p0;
import p161w3.C5917a;
import p161w3.C5918a0;

/* renamed from: b3.p */
/* compiled from: IcyDataSource */
final class C1741p implements C5828l {

    /* renamed from: a */
    private final C5828l f5159a;

    /* renamed from: b */
    private final int f5160b;

    /* renamed from: c */
    private final C1742a f5161c;

    /* renamed from: d */
    private final byte[] f5162d;

    /* renamed from: e */
    private int f5163e;

    /* renamed from: b3.p$a */
    /* compiled from: IcyDataSource */
    public interface C1742a {
        /* renamed from: a */
        void mo6785a(C5918a0 a0Var);
    }

    public C1741p(C5828l lVar, int i, C1742a aVar) {
        C5917a.m34868a(i > 0);
        this.f5159a = lVar;
        this.f5160b = i;
        this.f5161c = aVar;
        this.f5162d = new byte[1];
        this.f5163e = i;
    }

    /* renamed from: q */
    private boolean m8171q() throws IOException {
        if (this.f5159a.read(this.f5162d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f5162d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.f5159a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f5161c.mo6785a(new C5918a0(bArr, i));
        }
        return true;
    }

    public void close() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public Map<String, List<String>> mo6816i() {
        return this.f5159a.mo6816i();
    }

    /* renamed from: m */
    public Uri mo6817m() {
        return this.f5159a.mo6817m();
    }

    /* renamed from: n */
    public void mo6818n(C5840p0 p0Var) {
        C5917a.m34872e(p0Var);
        this.f5159a.mo6818n(p0Var);
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) {
        throw new UnsupportedOperationException();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f5163e == 0) {
            if (!m8171q()) {
                return -1;
            }
            this.f5163e = this.f5160b;
        }
        int read = this.f5159a.read(bArr, i, Math.min(this.f5163e, i2));
        if (read != -1) {
            this.f5163e -= read;
        }
        return read;
    }
}
