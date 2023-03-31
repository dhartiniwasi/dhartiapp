package p044f2;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p037e2.C4190a0;
import p037e2.C4192b0;
import p037e2.C4199e;
import p037e2.C4200e0;
import p037e2.C4215l;
import p037e2.C4216m;
import p037e2.C4217n;
import p037e2.C4221r;
import p161w3.C5917a;
import p161w3.C5953m0;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: f2.b */
/* compiled from: AmrExtractor */
public final class C4254b implements C4215l {

    /* renamed from: p */
    public static final C4221r f23616p = C10124a.f40228b;

    /* renamed from: q */
    private static final int[] f23617q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r */
    private static final int[] f23618r;

    /* renamed from: s */
    private static final byte[] f23619s = C5953m0.m35145m0("#!AMR\n");

    /* renamed from: t */
    private static final byte[] f23620t = C5953m0.m35145m0("#!AMR-WB\n");

    /* renamed from: u */
    private static final int f23621u;

    /* renamed from: a */
    private final byte[] f23622a;

    /* renamed from: b */
    private final int f23623b;

    /* renamed from: c */
    private boolean f23624c;

    /* renamed from: d */
    private long f23625d;

    /* renamed from: e */
    private int f23626e;

    /* renamed from: f */
    private int f23627f;

    /* renamed from: g */
    private boolean f23628g;

    /* renamed from: h */
    private long f23629h;

    /* renamed from: i */
    private int f23630i;

    /* renamed from: j */
    private int f23631j;

    /* renamed from: k */
    private long f23632k;

    /* renamed from: l */
    private C4217n f23633l;

    /* renamed from: m */
    private C4200e0 f23634m;

    /* renamed from: n */
    private C4192b0 f23635n;

    /* renamed from: o */
    private boolean f23636o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f23618r = iArr;
        f23621u = iArr[8];
    }

    public C4254b() {
        this(0);
    }

    /* renamed from: f */
    private void m28653f() {
        C5917a.m34875h(this.f23634m);
        C5953m0.m35138j(this.f23633l);
    }

    /* renamed from: g */
    private static int m28654g(int i, long j) {
        return (int) (((((long) i) * 8) * 1000000) / j);
    }

    /* renamed from: i */
    private C4192b0 m28655i(long j, boolean z) {
        return new C4199e(j, this.f23629h, m28654g(this.f23630i, 20000), this.f23630i, z);
    }

    /* renamed from: j */
    private int m28656j(int i) throws C6249m2 {
        if (m28658l(i)) {
            return this.f23624c ? f23618r[i] : f23617q[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f23624c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C6249m2.m36661a(sb.toString(), (Throwable) null);
    }

    /* renamed from: k */
    private boolean m28657k(int i) {
        return !this.f23624c && (i < 12 || i > 14);
    }

    /* renamed from: l */
    private boolean m28658l(int i) {
        return i >= 0 && i <= 15 && (m28659m(i) || m28657k(i));
    }

    /* renamed from: m */
    private boolean m28659m(int i) {
        return this.f23624c && (i < 10 || i > 13);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ C4215l[] m28660n() {
        return new C4215l[]{new C4254b()};
    }

    /* renamed from: o */
    private void m28661o() {
        if (!this.f23636o) {
            this.f23636o = true;
            boolean z = this.f23624c;
            this.f23634m.mo6845e(new C6272r1.C6274b().mo21517e0(z ? "audio/amr-wb" : "audio/3gpp").mo21509W(f23621u).mo21494H(1).mo21518f0(z ? 16000 : 8000).mo21491E());
        }
    }

    /* renamed from: p */
    private void m28662p(long j, int i) {
        int i2;
        if (!this.f23628g) {
            int i3 = this.f23623b;
            if ((i3 & 1) == 0 || j == -1 || !((i2 = this.f23630i) == -1 || i2 == this.f23626e)) {
                C4192b0.C4194b bVar = new C4192b0.C4194b(-9223372036854775807L);
                this.f23635n = bVar;
                this.f23633l.mo6781l(bVar);
                this.f23628g = true;
            } else if (this.f23631j >= 20 || i == -1) {
                C4192b0 i4 = m28655i(j, (i3 & 2) != 0);
                this.f23635n = i4;
                this.f23633l.mo6781l(i4);
                this.f23628g = true;
            }
        }
    }

    /* renamed from: q */
    private static boolean m28663q(C4216m mVar, byte[] bArr) throws IOException {
        mVar.mo17560j();
        byte[] bArr2 = new byte[bArr.length];
        mVar.mo17563p(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: r */
    private int m28664r(C4216m mVar) throws IOException {
        mVar.mo17560j();
        mVar.mo17563p(this.f23622a, 0, 1);
        byte b = this.f23622a[0];
        if ((b & 131) <= 0) {
            return m28656j((b >> 3) & 15);
        }
        throw C6249m2.m36661a("Invalid padding bits for frame header " + b, (Throwable) null);
    }

    /* renamed from: s */
    private boolean m28665s(C4216m mVar) throws IOException {
        byte[] bArr = f23619s;
        if (m28663q(mVar, bArr)) {
            this.f23624c = false;
            mVar.mo17561k(bArr.length);
            return true;
        }
        byte[] bArr2 = f23620t;
        if (!m28663q(mVar, bArr2)) {
            return false;
        }
        this.f23624c = true;
        mVar.mo17561k(bArr2.length);
        return true;
    }

    /* renamed from: t */
    private int m28666t(C4216m mVar) throws IOException {
        if (this.f23627f == 0) {
            try {
                int r = m28664r(mVar);
                this.f23626e = r;
                this.f23627f = r;
                if (this.f23630i == -1) {
                    this.f23629h = mVar.mo17554c();
                    this.f23630i = this.f23626e;
                }
                if (this.f23630i == this.f23626e) {
                    this.f23631j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int b = this.f23634m.mo6840b(mVar, this.f23627f, true);
        if (b == -1) {
            return -1;
        }
        int i = this.f23627f - b;
        this.f23627f = i;
        if (i > 0) {
            return 0;
        }
        this.f23634m.mo6838a(this.f23632k + this.f23625d, 1, this.f23626e, 0, (C4200e0.C4201a) null);
        this.f23625d += 20000;
        return 0;
    }

    /* renamed from: a */
    public void mo17579a() {
    }

    /* renamed from: c */
    public void mo17580c(long j, long j2) {
        this.f23625d = 0;
        this.f23626e = 0;
        this.f23627f = 0;
        if (j != 0) {
            C4192b0 b0Var = this.f23635n;
            if (b0Var instanceof C4199e) {
                this.f23632k = ((C4199e) b0Var).mo17549c(j);
                return;
            }
        }
        this.f23632k = 0;
    }

    /* renamed from: d */
    public void mo17581d(C4217n nVar) {
        this.f23633l = nVar;
        this.f23634m = nVar.mo6778f(0, 1);
        nVar.mo6782n();
    }

    /* renamed from: e */
    public int mo17582e(C4216m mVar, C4190a0 a0Var) throws IOException {
        m28653f();
        if (mVar.mo17554c() != 0 || m28665s(mVar)) {
            m28661o();
            int t = m28666t(mVar);
            m28662p(mVar.mo17553b(), t);
            return t;
        }
        throw C6249m2.m36661a("Could not find AMR header.", (Throwable) null);
    }

    /* renamed from: h */
    public boolean mo17583h(C4216m mVar) throws IOException {
        return m28665s(mVar);
    }

    public C4254b(int i) {
        this.f23623b = (i & 2) != 0 ? i | 1 : i;
        this.f23622a = new byte[1];
        this.f23630i = -1;
    }
}
