package p381vc;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.startapp.C8843b4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p336qe.C12231c;
import p336qe.C12234e;
import p336qe.C12235f;
import p336qe.C12241l;
import p336qe.C12252t;

/* renamed from: vc.f */
/* compiled from: Hpack */
final class C12876f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C12235f f47019a = C12235f.m58766o(":");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C12874d[] f47020b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<C12235f, Integer> f47021c = m60887f();

    /* renamed from: vc.f$a */
    /* compiled from: Hpack */
    static final class C12877a {

        /* renamed from: a */
        private final List<C12874d> f47022a;

        /* renamed from: b */
        private final C12234e f47023b;

        /* renamed from: c */
        private int f47024c;

        /* renamed from: d */
        private int f47025d;

        /* renamed from: e */
        C12874d[] f47026e;

        /* renamed from: f */
        int f47027f;

        /* renamed from: g */
        int f47028g;

        /* renamed from: h */
        int f47029h;

        C12877a(int i, C12252t tVar) {
            this(i, i, tVar);
        }

        /* renamed from: a */
        private void m60888a() {
            int i = this.f47025d;
            int i2 = this.f47029h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m60889b();
            } else {
                m60891d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m60889b() {
            Arrays.fill(this.f47026e, (Object) null);
            this.f47027f = this.f47026e.length - 1;
            this.f47028g = 0;
            this.f47029h = 0;
        }

        /* renamed from: c */
        private int m60890c(int i) {
            return this.f47027f + 1 + i;
        }

        /* renamed from: d */
        private int m60891d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f47026e.length;
                while (true) {
                    length--;
                    i2 = this.f47027f;
                    if (length < i2 || i <= 0) {
                        C12874d[] dVarArr = this.f47026e;
                        System.arraycopy(dVarArr, i2 + 1, dVarArr, i2 + 1 + i3, this.f47028g);
                        this.f47027f += i3;
                    } else {
                        C12874d[] dVarArr2 = this.f47026e;
                        i -= dVarArr2[length].f47013c;
                        this.f47029h -= dVarArr2[length].f47013c;
                        this.f47028g--;
                        i3++;
                    }
                }
                C12874d[] dVarArr3 = this.f47026e;
                System.arraycopy(dVarArr3, i2 + 1, dVarArr3, i2 + 1 + i3, this.f47028g);
                this.f47027f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private C12235f m60892f(int i) throws IOException {
            if (m60894i(i)) {
                return C12876f.f47020b[i].f47011a;
            }
            int c = m60890c(i - C12876f.f47020b.length);
            if (c >= 0) {
                C12874d[] dVarArr = this.f47026e;
                if (c < dVarArr.length) {
                    return dVarArr[c].f47011a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: h */
        private void m60893h(int i, C12874d dVar) {
            this.f47022a.add(dVar);
            int i2 = dVar.f47013c;
            if (i != -1) {
                i2 -= this.f47026e[m60890c(i)].f47013c;
            }
            int i3 = this.f47025d;
            if (i2 > i3) {
                m60889b();
                return;
            }
            int d = m60891d((this.f47029h + i2) - i3);
            if (i == -1) {
                int i4 = this.f47028g + 1;
                C12874d[] dVarArr = this.f47026e;
                if (i4 > dVarArr.length) {
                    C12874d[] dVarArr2 = new C12874d[(dVarArr.length * 2)];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f47027f = this.f47026e.length - 1;
                    this.f47026e = dVarArr2;
                }
                int i5 = this.f47027f;
                this.f47027f = i5 - 1;
                this.f47026e[i5] = dVar;
                this.f47028g++;
            } else {
                this.f47026e[i + m60890c(i) + d] = dVar;
            }
            this.f47029h += i2;
        }

        /* renamed from: i */
        private boolean m60894i(int i) {
            return i >= 0 && i <= C12876f.f47020b.length - 1;
        }

        /* renamed from: j */
        private int m60895j() throws IOException {
            return this.f47023b.readByte() & 255;
        }

        /* renamed from: m */
        private void m60896m(int i) throws IOException {
            if (m60894i(i)) {
                this.f47022a.add(C12876f.f47020b[i]);
                return;
            }
            int c = m60890c(i - C12876f.f47020b.length);
            if (c >= 0) {
                C12874d[] dVarArr = this.f47026e;
                if (c <= dVarArr.length - 1) {
                    this.f47022a.add(dVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: o */
        private void m60897o(int i) throws IOException {
            m60893h(-1, new C12874d(m60892f(i), mo37893k()));
        }

        /* renamed from: p */
        private void m60898p() throws IOException {
            m60893h(-1, new C12874d(C12876f.m60886e(mo37893k()), mo37893k()));
        }

        /* renamed from: q */
        private void m60899q(int i) throws IOException {
            this.f47022a.add(new C12874d(m60892f(i), mo37893k()));
        }

        /* renamed from: r */
        private void m60900r() throws IOException {
            this.f47022a.add(new C12874d(C12876f.m60886e(mo37893k()), mo37893k()));
        }

        /* renamed from: e */
        public List<C12874d> mo37891e() {
            ArrayList arrayList = new ArrayList(this.f47022a);
            this.f47022a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo37892g(int i) {
            this.f47024c = i;
            this.f47025d = i;
            m60888a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C12235f mo37893k() throws IOException {
            int j = m60895j();
            boolean z = (j & 128) == 128;
            int n = mo37895n(j, 127);
            if (z) {
                return C12235f.m58767r(C12884h.m60959f().mo37906c(this.f47023b.mo36785Z0((long) n)));
            }
            return this.f47023b.mo36762B((long) n);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo37894l() throws IOException {
            while (!this.f47023b.mo36784Z()) {
                byte readByte = this.f47023b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & C8843b4.f36445d) == 128) {
                    m60896m(mo37895n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m60898p();
                } else if ((readByte & 64) == 64) {
                    m60897o(mo37895n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n = mo37895n(readByte, 31);
                    this.f47025d = n;
                    if (n < 0 || n > this.f47024c) {
                        throw new IOException("Invalid dynamic table size update " + this.f47025d);
                    }
                    m60888a();
                } else if (readByte == 16 || readByte == 0) {
                    m60900r();
                } else {
                    m60899q(mo37895n(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo37895n(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int j = m60895j();
                if ((j & 128) == 0) {
                    return i2 + (j << i4);
                }
                i2 += (j & 127) << i4;
                i4 += 7;
            }
        }

        C12877a(int i, int i2, C12252t tVar) {
            this.f47022a = new ArrayList();
            C12874d[] dVarArr = new C12874d[8];
            this.f47026e = dVarArr;
            this.f47027f = dVarArr.length - 1;
            this.f47028g = 0;
            this.f47029h = 0;
            this.f47024c = i;
            this.f47025d = i2;
            this.f47023b = C12241l.m58807b(tVar);
        }
    }

    /* renamed from: vc.f$b */
    /* compiled from: Hpack */
    static final class C12878b {

        /* renamed from: a */
        private final C12231c f47030a;

        /* renamed from: b */
        private boolean f47031b;

        /* renamed from: c */
        int f47032c;

        /* renamed from: d */
        private int f47033d;

        /* renamed from: e */
        private boolean f47034e;

        /* renamed from: f */
        private int f47035f;

        /* renamed from: g */
        C12874d[] f47036g;

        /* renamed from: h */
        int f47037h;

        /* renamed from: i */
        private int f47038i;

        /* renamed from: j */
        private int f47039j;

        C12878b(C12231c cVar) {
            this(4096, false, cVar);
        }

        /* renamed from: a */
        private void m60906a() {
            Arrays.fill(this.f47036g, (Object) null);
            this.f47038i = this.f47036g.length - 1;
            this.f47037h = 0;
            this.f47039j = 0;
        }

        /* renamed from: b */
        private int m60907b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f47036g.length;
                while (true) {
                    length--;
                    i2 = this.f47038i;
                    if (length < i2 || i <= 0) {
                        C12874d[] dVarArr = this.f47036g;
                        System.arraycopy(dVarArr, i2 + 1, dVarArr, i2 + 1 + i3, this.f47037h);
                        this.f47038i += i3;
                    } else {
                        C12874d[] dVarArr2 = this.f47036g;
                        i -= dVarArr2[length].f47013c;
                        this.f47039j -= dVarArr2[length].f47013c;
                        this.f47037h--;
                        i3++;
                    }
                }
                C12874d[] dVarArr3 = this.f47036g;
                System.arraycopy(dVarArr3, i2 + 1, dVarArr3, i2 + 1 + i3, this.f47037h);
                this.f47038i += i3;
            }
            return i3;
        }

        /* renamed from: c */
        private void m60908c(C12874d dVar) {
            int i = dVar.f47013c;
            int i2 = this.f47035f;
            if (i > i2) {
                m60906a();
                return;
            }
            m60907b((this.f47039j + i) - i2);
            int i3 = this.f47037h + 1;
            C12874d[] dVarArr = this.f47036g;
            if (i3 > dVarArr.length) {
                C12874d[] dVarArr2 = new C12874d[(dVarArr.length * 2)];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f47038i = this.f47036g.length - 1;
                this.f47036g = dVarArr2;
            }
            int i4 = this.f47038i;
            this.f47038i = i4 - 1;
            this.f47036g[i4] = dVar;
            this.f47037h++;
            this.f47039j += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37896d(C12235f fVar) throws IOException {
            if (!this.f47031b || C12884h.m60959f().mo37908e(fVar.mo36831A()) >= fVar.mo36846w()) {
                mo37898f(fVar.mo36846w(), 127, 0);
                this.f47030a.mo36777S(fVar);
                return;
            }
            C12231c cVar = new C12231c();
            C12884h.m60959f().mo37907d(fVar.mo36831A(), cVar.mo36808p());
            C12235f x = cVar.mo36823x();
            mo37898f(x.mo36846w(), 127, 128);
            this.f47030a.mo36777S(x);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo37897e(List<C12874d> list) throws IOException {
            int i;
            int i2;
            if (this.f47034e) {
                int i3 = this.f47033d;
                if (i3 < this.f47035f) {
                    mo37898f(i3, 31, 32);
                }
                this.f47034e = false;
                this.f47033d = Integer.MAX_VALUE;
                mo37898f(this.f47035f, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C12874d dVar = list.get(i4);
                C12235f z = dVar.f47011a.mo36849z();
                C12235f fVar = dVar.f47012b;
                Integer num = (Integer) C12876f.f47021c.get(z);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 >= 2 && i2 <= 7) {
                        if (C12876f.f47020b[i2 - 1].f47012b.equals(fVar)) {
                            i = i2;
                        } else if (C12876f.f47020b[i2].f47012b.equals(fVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f47038i;
                    while (true) {
                        i5++;
                        C12874d[] dVarArr = this.f47036g;
                        if (i5 >= dVarArr.length) {
                            break;
                        } else if (dVarArr[i5].f47011a.equals(z)) {
                            if (this.f47036g[i5].f47012b.equals(fVar)) {
                                i2 = C12876f.f47020b.length + (i5 - this.f47038i);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f47038i) + C12876f.f47020b.length;
                            }
                        }
                    }
                }
                if (i2 != -1) {
                    mo37898f(i2, 127, 128);
                } else if (i == -1) {
                    this.f47030a.mo36787a0(64);
                    mo37896d(z);
                    mo37896d(fVar);
                    m60908c(dVar);
                } else if (!z.mo36847x(C12876f.f47019a) || C12874d.f47008h.equals(z)) {
                    mo37898f(i, 63, 64);
                    mo37896d(fVar);
                    m60908c(dVar);
                } else {
                    mo37898f(i, 15, 0);
                    mo37896d(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo37898f(int i, int i2, int i3) throws IOException {
            if (i < i2) {
                this.f47030a.mo36787a0(i | i3);
                return;
            }
            this.f47030a.mo36787a0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f47030a.mo36787a0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f47030a.mo36787a0(i4);
        }

        C12878b(int i, boolean z, C12231c cVar) {
            this.f47033d = Integer.MAX_VALUE;
            C12874d[] dVarArr = new C12874d[8];
            this.f47036g = dVarArr;
            this.f47038i = dVarArr.length - 1;
            this.f47032c = i;
            this.f47035f = i;
            this.f47031b = z;
            this.f47030a = cVar;
        }
    }

    static {
        C12235f fVar = C12874d.f47005e;
        C12235f fVar2 = C12874d.f47006f;
        C12235f fVar3 = C12874d.f47007g;
        C12235f fVar4 = C12874d.f47004d;
        f47020b = new C12874d[]{new C12874d(C12874d.f47008h, ""), new C12874d(fVar, "GET"), new C12874d(fVar, "POST"), new C12874d(fVar2, "/"), new C12874d(fVar2, "/index.html"), new C12874d(fVar3, "http"), new C12874d(fVar3, "https"), new C12874d(fVar4, "200"), new C12874d(fVar4, "204"), new C12874d(fVar4, "206"), new C12874d(fVar4, "304"), new C12874d(fVar4, "400"), new C12874d(fVar4, "404"), new C12874d(fVar4, "500"), new C12874d("accept-charset", ""), new C12874d("accept-encoding", "gzip, deflate"), new C12874d("accept-language", ""), new C12874d("accept-ranges", ""), new C12874d("accept", ""), new C12874d("access-control-allow-origin", ""), new C12874d("age", ""), new C12874d("allow", ""), new C12874d("authorization", ""), new C12874d("cache-control", ""), new C12874d("content-disposition", ""), new C12874d("content-encoding", ""), new C12874d("content-language", ""), new C12874d("content-length", ""), new C12874d("content-location", ""), new C12874d("content-range", ""), new C12874d("content-type", ""), new C12874d("cookie", ""), new C12874d("date", ""), new C12874d("etag", ""), new C12874d("expect", ""), new C12874d("expires", ""), new C12874d("from", ""), new C12874d((String) URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new C12874d("if-match", ""), new C12874d("if-modified-since", ""), new C12874d("if-none-match", ""), new C12874d("if-range", ""), new C12874d("if-unmodified-since", ""), new C12874d("last-modified", ""), new C12874d("link", ""), new C12874d("location", ""), new C12874d("max-forwards", ""), new C12874d("proxy-authenticate", ""), new C12874d("proxy-authorization", ""), new C12874d("range", ""), new C12874d("referer", ""), new C12874d("refresh", ""), new C12874d("retry-after", ""), new C12874d("server", ""), new C12874d("set-cookie", ""), new C12874d("strict-transport-security", ""), new C12874d("transfer-encoding", ""), new C12874d("user-agent", ""), new C12874d("vary", ""), new C12874d("via", ""), new C12874d("www-authenticate", "")};
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static C12235f m60886e(C12235f fVar) throws IOException {
        int w = fVar.mo36846w();
        int i = 0;
        while (i < w) {
            byte p = fVar.mo36839p(i);
            if (p < 65 || p > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.mo36832B());
            }
        }
        return fVar;
    }

    /* renamed from: f */
    private static Map<C12235f, Integer> m60887f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f47020b.length);
        int i = 0;
        while (true) {
            C12874d[] dVarArr = f47020b;
            if (i >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i].f47011a)) {
                linkedHashMap.put(dVarArr[i].f47011a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
