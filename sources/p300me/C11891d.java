package p300me;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.startapp.C8843b4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p336qe.C12231c;
import p336qe.C12234e;
import p336qe.C12235f;
import p336qe.C12241l;
import p336qe.C12252t;

/* renamed from: me.d */
/* compiled from: Hpack */
final class C11891d {

    /* renamed from: a */
    static final C11890c[] f44655a;

    /* renamed from: b */
    static final Map<C12235f, Integer> f44656b = m57404b();

    /* renamed from: me.d$a */
    /* compiled from: Hpack */
    static final class C11892a {

        /* renamed from: a */
        private final List<C11890c> f44657a;

        /* renamed from: b */
        private final C12234e f44658b;

        /* renamed from: c */
        private final int f44659c;

        /* renamed from: d */
        private int f44660d;

        /* renamed from: e */
        C11890c[] f44661e;

        /* renamed from: f */
        int f44662f;

        /* renamed from: g */
        int f44663g;

        /* renamed from: h */
        int f44664h;

        C11892a(int i, C12252t tVar) {
            this(i, i, tVar);
        }

        /* renamed from: a */
        private void m57405a() {
            int i = this.f44660d;
            int i2 = this.f44664h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m57406b();
            } else {
                m57408d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m57406b() {
            Arrays.fill(this.f44661e, (Object) null);
            this.f44662f = this.f44661e.length - 1;
            this.f44663g = 0;
            this.f44664h = 0;
        }

        /* renamed from: c */
        private int m57407c(int i) {
            return this.f44662f + 1 + i;
        }

        /* renamed from: d */
        private int m57408d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f44661e.length;
                while (true) {
                    length--;
                    i2 = this.f44662f;
                    if (length < i2 || i <= 0) {
                        C11890c[] cVarArr = this.f44661e;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f44663g);
                        this.f44662f += i3;
                    } else {
                        C11890c[] cVarArr2 = this.f44661e;
                        i -= cVarArr2[length].f44654c;
                        this.f44664h -= cVarArr2[length].f44654c;
                        this.f44663g--;
                        i3++;
                    }
                }
                C11890c[] cVarArr3 = this.f44661e;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + i3, this.f44663g);
                this.f44662f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private C12235f m57409f(int i) throws IOException {
            if (m57411h(i)) {
                return C11891d.f44655a[i].f44652a;
            }
            int c = m57407c(i - C11891d.f44655a.length);
            if (c >= 0) {
                C11890c[] cVarArr = this.f44661e;
                if (c < cVarArr.length) {
                    return cVarArr[c].f44652a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: g */
        private void m57410g(int i, C11890c cVar) {
            this.f44657a.add(cVar);
            int i2 = cVar.f44654c;
            if (i != -1) {
                i2 -= this.f44661e[m57407c(i)].f44654c;
            }
            int i3 = this.f44660d;
            if (i2 > i3) {
                m57406b();
                return;
            }
            int d = m57408d((this.f44664h + i2) - i3);
            if (i == -1) {
                int i4 = this.f44663g + 1;
                C11890c[] cVarArr = this.f44661e;
                if (i4 > cVarArr.length) {
                    C11890c[] cVarArr2 = new C11890c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f44662f = this.f44661e.length - 1;
                    this.f44661e = cVarArr2;
                }
                int i5 = this.f44662f;
                this.f44662f = i5 - 1;
                this.f44661e[i5] = cVar;
                this.f44663g++;
            } else {
                this.f44661e[i + m57407c(i) + d] = cVar;
            }
            this.f44664h += i2;
        }

        /* renamed from: h */
        private boolean m57411h(int i) {
            return i >= 0 && i <= C11891d.f44655a.length - 1;
        }

        /* renamed from: i */
        private int m57412i() throws IOException {
            return this.f44658b.readByte() & 255;
        }

        /* renamed from: l */
        private void m57413l(int i) throws IOException {
            if (m57411h(i)) {
                this.f44657a.add(C11891d.f44655a[i]);
                return;
            }
            int c = m57407c(i - C11891d.f44655a.length);
            if (c >= 0) {
                C11890c[] cVarArr = this.f44661e;
                if (c < cVarArr.length) {
                    this.f44657a.add(cVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private void m57414n(int i) throws IOException {
            m57410g(-1, new C11890c(m57409f(i), mo36145j()));
        }

        /* renamed from: o */
        private void m57415o() throws IOException {
            m57410g(-1, new C11890c(C11891d.m57403a(mo36145j()), mo36145j()));
        }

        /* renamed from: p */
        private void m57416p(int i) throws IOException {
            this.f44657a.add(new C11890c(m57409f(i), mo36145j()));
        }

        /* renamed from: q */
        private void m57417q() throws IOException {
            this.f44657a.add(new C11890c(C11891d.m57403a(mo36145j()), mo36145j()));
        }

        /* renamed from: e */
        public List<C11890c> mo36144e() {
            ArrayList arrayList = new ArrayList(this.f44657a);
            this.f44657a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C12235f mo36145j() throws IOException {
            int i = m57412i();
            boolean z = (i & 128) == 128;
            int m = mo36147m(i, 127);
            if (z) {
                return C12235f.m58767r(C11921k.m57585f().mo36229c(this.f44658b.mo36785Z0((long) m)));
            }
            return this.f44658b.mo36762B((long) m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo36146k() throws IOException {
            while (!this.f44658b.mo36784Z()) {
                byte readByte = this.f44658b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & C8843b4.f36445d) == 128) {
                    m57413l(mo36147m(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m57415o();
                } else if ((readByte & 64) == 64) {
                    m57414n(mo36147m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m = mo36147m(readByte, 31);
                    this.f44660d = m;
                    if (m < 0 || m > this.f44659c) {
                        throw new IOException("Invalid dynamic table size update " + this.f44660d);
                    }
                    m57405a();
                } else if (readByte == 16 || readByte == 0) {
                    m57417q();
                } else {
                    m57416p(mo36147m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo36147m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m57412i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        C11892a(int i, int i2, C12252t tVar) {
            this.f44657a = new ArrayList();
            C11890c[] cVarArr = new C11890c[8];
            this.f44661e = cVarArr;
            this.f44662f = cVarArr.length - 1;
            this.f44663g = 0;
            this.f44664h = 0;
            this.f44659c = i;
            this.f44660d = i2;
            this.f44658b = C12241l.m58807b(tVar);
        }
    }

    /* renamed from: me.d$b */
    /* compiled from: Hpack */
    static final class C11893b {

        /* renamed from: a */
        private final C12231c f44665a;

        /* renamed from: b */
        private final boolean f44666b;

        /* renamed from: c */
        private int f44667c;

        /* renamed from: d */
        private boolean f44668d;

        /* renamed from: e */
        int f44669e;

        /* renamed from: f */
        int f44670f;

        /* renamed from: g */
        C11890c[] f44671g;

        /* renamed from: h */
        int f44672h;

        /* renamed from: i */
        int f44673i;

        /* renamed from: j */
        int f44674j;

        C11893b(C12231c cVar) {
            this(4096, true, cVar);
        }

        /* renamed from: a */
        private void m57422a() {
            int i = this.f44670f;
            int i2 = this.f44674j;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m57423b();
            } else {
                m57424c(i2 - i);
            }
        }

        /* renamed from: b */
        private void m57423b() {
            Arrays.fill(this.f44671g, (Object) null);
            this.f44672h = this.f44671g.length - 1;
            this.f44673i = 0;
            this.f44674j = 0;
        }

        /* renamed from: c */
        private int m57424c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f44671g.length;
                while (true) {
                    length--;
                    i2 = this.f44672h;
                    if (length < i2 || i <= 0) {
                        C11890c[] cVarArr = this.f44671g;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + i3, this.f44673i);
                        C11890c[] cVarArr2 = this.f44671g;
                        int i4 = this.f44672h;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f44672h += i3;
                    } else {
                        C11890c[] cVarArr3 = this.f44671g;
                        i -= cVarArr3[length].f44654c;
                        this.f44674j -= cVarArr3[length].f44654c;
                        this.f44673i--;
                        i3++;
                    }
                }
                C11890c[] cVarArr4 = this.f44671g;
                System.arraycopy(cVarArr4, i2 + 1, cVarArr4, i2 + 1 + i3, this.f44673i);
                C11890c[] cVarArr22 = this.f44671g;
                int i42 = this.f44672h;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f44672h += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private void m57425d(C11890c cVar) {
            int i = cVar.f44654c;
            int i2 = this.f44670f;
            if (i > i2) {
                m57423b();
                return;
            }
            m57424c((this.f44674j + i) - i2);
            int i3 = this.f44673i + 1;
            C11890c[] cVarArr = this.f44671g;
            if (i3 > cVarArr.length) {
                C11890c[] cVarArr2 = new C11890c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f44672h = this.f44671g.length - 1;
                this.f44671g = cVarArr2;
            }
            int i4 = this.f44672h;
            this.f44672h = i4 - 1;
            this.f44671g[i4] = cVar;
            this.f44673i++;
            this.f44674j += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo36148e(int i) {
            this.f44669e = i;
            int min = Math.min(i, 16384);
            int i2 = this.f44670f;
            if (i2 != min) {
                if (min < i2) {
                    this.f44667c = Math.min(this.f44667c, min);
                }
                this.f44668d = true;
                this.f44670f = min;
                m57422a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo36149f(C12235f fVar) throws IOException {
            if (!this.f44666b || C11921k.m57585f().mo36231e(fVar) >= fVar.mo36846w()) {
                mo36151h(fVar.mo36846w(), 127, 0);
                this.f44665a.mo36777S(fVar);
                return;
            }
            C12231c cVar = new C12231c();
            C11921k.m57585f().mo36230d(fVar, cVar);
            C12235f x = cVar.mo36823x();
            mo36151h(x.mo36846w(), 127, 128);
            this.f44665a.mo36777S(x);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo36150g(List<C11890c> list) throws IOException {
            int i;
            int i2;
            if (this.f44668d) {
                int i3 = this.f44667c;
                if (i3 < this.f44670f) {
                    mo36151h(i3, 31, 32);
                }
                this.f44668d = false;
                this.f44667c = Integer.MAX_VALUE;
                mo36151h(this.f44670f, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C11890c cVar = list.get(i4);
                C12235f z = cVar.f44652a.mo36849z();
                C12235f fVar = cVar.f44653b;
                Integer num = C11891d.f44656b.get(z);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        C11890c[] cVarArr = C11891d.f44655a;
                        if (Objects.equals(cVarArr[i2 - 1].f44653b, fVar)) {
                            i = i2;
                        } else if (Objects.equals(cVarArr[i2].f44653b, fVar)) {
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
                    int i5 = this.f44672h + 1;
                    int length = this.f44671g.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f44671g[i5].f44652a, z)) {
                            if (Objects.equals(this.f44671g[i5].f44653b, fVar)) {
                                i2 = C11891d.f44655a.length + (i5 - this.f44672h);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f44672h) + C11891d.f44655a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo36151h(i2, 127, 128);
                } else if (i == -1) {
                    this.f44665a.mo36787a0(64);
                    mo36149f(z);
                    mo36149f(fVar);
                    m57425d(cVar);
                } else if (!z.mo36847x(C11890c.f44646d) || C11890c.f44651i.equals(z)) {
                    mo36151h(i, 63, 64);
                    mo36149f(fVar);
                    m57425d(cVar);
                } else {
                    mo36151h(i, 15, 0);
                    mo36149f(fVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo36151h(int i, int i2, int i3) {
            if (i < i2) {
                this.f44665a.mo36787a0(i | i3);
                return;
            }
            this.f44665a.mo36787a0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f44665a.mo36787a0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f44665a.mo36787a0(i4);
        }

        C11893b(int i, boolean z, C12231c cVar) {
            this.f44667c = Integer.MAX_VALUE;
            C11890c[] cVarArr = new C11890c[8];
            this.f44671g = cVarArr;
            this.f44672h = cVarArr.length - 1;
            this.f44673i = 0;
            this.f44674j = 0;
            this.f44669e = i;
            this.f44670f = i;
            this.f44666b = z;
            this.f44665a = cVar;
        }
    }

    static {
        C12235f fVar = C11890c.f44648f;
        C12235f fVar2 = C11890c.f44649g;
        C12235f fVar3 = C11890c.f44650h;
        C12235f fVar4 = C11890c.f44647e;
        f44655a = new C11890c[]{new C11890c(C11890c.f44651i, ""), new C11890c(fVar, "GET"), new C11890c(fVar, "POST"), new C11890c(fVar2, "/"), new C11890c(fVar2, "/index.html"), new C11890c(fVar3, "http"), new C11890c(fVar3, "https"), new C11890c(fVar4, "200"), new C11890c(fVar4, "204"), new C11890c(fVar4, "206"), new C11890c(fVar4, "304"), new C11890c(fVar4, "400"), new C11890c(fVar4, "404"), new C11890c(fVar4, "500"), new C11890c("accept-charset", ""), new C11890c("accept-encoding", "gzip, deflate"), new C11890c("accept-language", ""), new C11890c("accept-ranges", ""), new C11890c("accept", ""), new C11890c("access-control-allow-origin", ""), new C11890c("age", ""), new C11890c("allow", ""), new C11890c("authorization", ""), new C11890c("cache-control", ""), new C11890c("content-disposition", ""), new C11890c("content-encoding", ""), new C11890c("content-language", ""), new C11890c("content-length", ""), new C11890c("content-location", ""), new C11890c("content-range", ""), new C11890c("content-type", ""), new C11890c("cookie", ""), new C11890c("date", ""), new C11890c("etag", ""), new C11890c("expect", ""), new C11890c("expires", ""), new C11890c("from", ""), new C11890c((String) URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new C11890c("if-match", ""), new C11890c("if-modified-since", ""), new C11890c("if-none-match", ""), new C11890c("if-range", ""), new C11890c("if-unmodified-since", ""), new C11890c("last-modified", ""), new C11890c("link", ""), new C11890c("location", ""), new C11890c("max-forwards", ""), new C11890c("proxy-authenticate", ""), new C11890c("proxy-authorization", ""), new C11890c("range", ""), new C11890c("referer", ""), new C11890c("refresh", ""), new C11890c("retry-after", ""), new C11890c("server", ""), new C11890c("set-cookie", ""), new C11890c("strict-transport-security", ""), new C11890c("transfer-encoding", ""), new C11890c("user-agent", ""), new C11890c("vary", ""), new C11890c("via", ""), new C11890c("www-authenticate", "")};
    }

    /* renamed from: a */
    static C12235f m57403a(C12235f fVar) throws IOException {
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

    /* renamed from: b */
    private static Map<C12235f, Integer> m57404b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f44655a.length);
        int i = 0;
        while (true) {
            C11890c[] cVarArr = f44655a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f44652a)) {
                linkedHashMap.put(cVarArr[i].f44652a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
