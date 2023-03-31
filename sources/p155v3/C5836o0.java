package p155v3;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p161w3.C5917a;

/* renamed from: v3.o0 */
/* compiled from: StatsDataSource */
public final class C5836o0 implements C5828l {

    /* renamed from: a */
    private final C5828l f28877a;

    /* renamed from: b */
    private long f28878b;

    /* renamed from: c */
    private Uri f28879c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f28880d = Collections.emptyMap();

    public C5836o0(C5828l lVar) {
        this.f28877a = (C5828l) C5917a.m34872e(lVar);
    }

    public void close() throws IOException {
        this.f28877a.close();
    }

    /* renamed from: i */
    public Map<String, List<String>> mo6816i() {
        return this.f28877a.mo6816i();
    }

    /* renamed from: m */
    public Uri mo6817m() {
        return this.f28877a.mo6817m();
    }

    /* renamed from: n */
    public void mo6818n(C5840p0 p0Var) {
        C5917a.m34872e(p0Var);
        this.f28877a.mo6818n(p0Var);
    }

    /* renamed from: o */
    public long mo6819o(C5837p pVar) throws IOException {
        this.f28879c = pVar.f28881a;
        this.f28880d = Collections.emptyMap();
        long o = this.f28877a.mo6819o(pVar);
        this.f28879c = (Uri) C5917a.m34872e(mo6817m());
        this.f28880d = mo6816i();
        return o;
    }

    /* renamed from: q */
    public long mo20362q() {
        return this.f28878b;
    }

    /* renamed from: r */
    public Uri mo20363r() {
        return this.f28879c;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f28877a.read(bArr, i, i2);
        if (read != -1) {
            this.f28878b += (long) read;
        }
        return read;
    }

    /* renamed from: s */
    public Map<String, List<String>> mo20364s() {
        return this.f28880d;
    }

    /* renamed from: t */
    public void mo20365t() {
        this.f28878b = 0;
    }
}
