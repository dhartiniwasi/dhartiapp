package p092m2;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p030d2.C4035m;
import p037e2.C4219o;
import p037e2.C4230x;
import p092m2.C5002a;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5967v;
import p166x2.C6042a;
import p166x2.C6050e;
import p167x3.C6052a;
import p167x3.C6053c;
import p167x3.C6054d;
import p167x3.C6057f;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p182a7.C6417f;
import p190b7.C6685q;
import p219e7.C9998d;

/* renamed from: m2.b */
/* compiled from: AtomParsers */
final class C5005b {

    /* renamed from: a */
    private static final byte[] f26205a = C5953m0.m35145m0("OpusHead");

    /* renamed from: m2.b$a */
    /* compiled from: AtomParsers */
    private static final class C5006a {

        /* renamed from: a */
        public final int f26206a;

        /* renamed from: b */
        public int f26207b;

        /* renamed from: c */
        public int f26208c;

        /* renamed from: d */
        public long f26209d;

        /* renamed from: e */
        private final boolean f26210e;

        /* renamed from: f */
        private final C5918a0 f26211f;

        /* renamed from: g */
        private final C5918a0 f26212g;

        /* renamed from: h */
        private int f26213h;

        /* renamed from: i */
        private int f26214i;

        public C5006a(C5918a0 a0Var, C5918a0 a0Var2, boolean z) throws C6249m2 {
            this.f26212g = a0Var;
            this.f26211f = a0Var2;
            this.f26210e = z;
            a0Var2.mo20546O(12);
            this.f26206a = a0Var2.mo20538G();
            a0Var.mo20546O(12);
            this.f26214i = a0Var.mo20538G();
            C4219o.m28480a(a0Var.mo20560m() != 1 ? false : true, "first_chunk must be 1");
            this.f26207b = -1;
        }

        /* renamed from: a */
        public boolean mo18934a() {
            long j;
            int i = this.f26207b + 1;
            this.f26207b = i;
            if (i == this.f26206a) {
                return false;
            }
            if (this.f26210e) {
                j = this.f26211f.mo20539H();
            } else {
                j = this.f26211f.mo20536E();
            }
            this.f26209d = j;
            if (this.f26207b == this.f26213h) {
                this.f26208c = this.f26212g.mo20538G();
                this.f26212g.mo20547P(4);
                int i2 = this.f26214i - 1;
                this.f26214i = i2;
                this.f26213h = i2 > 0 ? this.f26212g.mo20538G() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: m2.b$b */
    /* compiled from: AtomParsers */
    private static final class C5007b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f26215a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final byte[] f26216b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f26217c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f26218d;

        public C5007b(String str, byte[] bArr, long j, long j2) {
            this.f26215a = str;
            this.f26216b = bArr;
            this.f26217c = j;
            this.f26218d = j2;
        }
    }

    /* renamed from: m2.b$c */
    /* compiled from: AtomParsers */
    private interface C5008c {
        /* renamed from: a */
        int mo18935a();

        /* renamed from: b */
        int mo18936b();

        /* renamed from: c */
        int mo18937c();
    }

    /* renamed from: m2.b$d */
    /* compiled from: AtomParsers */
    private static final class C5009d {

        /* renamed from: a */
        public final C5029p[] f26219a;

        /* renamed from: b */
        public C6272r1 f26220b;

        /* renamed from: c */
        public int f26221c;

        /* renamed from: d */
        public int f26222d = 0;

        public C5009d(int i) {
            this.f26219a = new C5029p[i];
        }
    }

    /* renamed from: m2.b$e */
    /* compiled from: AtomParsers */
    static final class C5010e implements C5008c {

        /* renamed from: a */
        private final int f26223a;

        /* renamed from: b */
        private final int f26224b;

        /* renamed from: c */
        private final C5918a0 f26225c;

        public C5010e(C5002a.C5004b bVar, C6272r1 r1Var) {
            C5918a0 a0Var = bVar.f26204b;
            this.f26225c = a0Var;
            a0Var.mo20546O(12);
            int G = a0Var.mo20538G();
            if ("audio/raw".equals(r1Var.f30243t)) {
                int d0 = C5953m0.m35127d0(r1Var.f30226I, r1Var.f30224G);
                if (G == 0 || G % d0 != 0) {
                    C5961r.m35215i("AtomParsers", "Audio sample size mismatch. stsd sample size: " + d0 + ", stsz sample size: " + G);
                    G = d0;
                }
            }
            this.f26223a = G == 0 ? -1 : G;
            this.f26224b = a0Var.mo20538G();
        }

        /* renamed from: a */
        public int mo18935a() {
            return this.f26223a;
        }

        /* renamed from: b */
        public int mo18936b() {
            return this.f26224b;
        }

        /* renamed from: c */
        public int mo18937c() {
            int i = this.f26223a;
            return i == -1 ? this.f26225c.mo20538G() : i;
        }
    }

    /* renamed from: m2.b$f */
    /* compiled from: AtomParsers */
    static final class C5011f implements C5008c {

        /* renamed from: a */
        private final C5918a0 f26226a;

        /* renamed from: b */
        private final int f26227b;

        /* renamed from: c */
        private final int f26228c;

        /* renamed from: d */
        private int f26229d;

        /* renamed from: e */
        private int f26230e;

        public C5011f(C5002a.C5004b bVar) {
            C5918a0 a0Var = bVar.f26204b;
            this.f26226a = a0Var;
            a0Var.mo20546O(12);
            this.f26228c = a0Var.mo20538G() & 255;
            this.f26227b = a0Var.mo20538G();
        }

        /* renamed from: a */
        public int mo18935a() {
            return -1;
        }

        /* renamed from: b */
        public int mo18936b() {
            return this.f26227b;
        }

        /* renamed from: c */
        public int mo18937c() {
            int i = this.f26228c;
            if (i == 8) {
                return this.f26226a.mo20534C();
            }
            if (i == 16) {
                return this.f26226a.mo20540I();
            }
            int i2 = this.f26229d;
            this.f26229d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f26230e & 15;
            }
            int C = this.f26226a.mo20534C();
            this.f26230e = C;
            return (C & 240) >> 4;
        }
    }

    /* renamed from: m2.b$g */
    /* compiled from: AtomParsers */
    private static final class C5012g {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f26231a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f26232b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f26233c;

        public C5012g(int i, long j, int i2) {
            this.f26231a = i;
            this.f26232b = j;
            this.f26233c = i2;
        }
    }

    /* renamed from: A */
    public static List<C5031r> m31560A(C5002a.C5003a aVar, C4230x xVar, long j, C4035m mVar, boolean z, boolean z2, C6417f<C5028o, C5028o> fVar) throws C6249m2 {
        C5002a.C5003a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < aVar2.f26203d.size(); i++) {
            C5002a.C5003a aVar3 = aVar2.f26203d.get(i);
            if (aVar3.f26200a != 1953653099) {
                C4230x xVar2 = xVar;
                C6417f<C5028o, C5028o> fVar2 = fVar;
            } else {
                C5028o apply = fVar.apply(m31589z(aVar3, (C5002a.C5004b) C5917a.m34872e(aVar.mo18933g(1836476516)), j, mVar, z, z2));
                if (apply == null) {
                    C4230x xVar3 = xVar;
                } else {
                    C4230x xVar4 = xVar;
                    arrayList.add(m31585v(apply, (C5002a.C5003a) C5917a.m34872e(((C5002a.C5003a) C5917a.m34872e(((C5002a.C5003a) C5917a.m34872e(aVar3.mo18932f(1835297121))).mo18932f(1835626086))).mo18932f(1937007212)), xVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    public static Pair<C5432a, C5432a> m31561B(C5002a.C5004b bVar) {
        C5918a0 a0Var = bVar.f26204b;
        a0Var.mo20546O(8);
        C5432a aVar = null;
        C5432a aVar2 = null;
        while (a0Var.mo20548a() >= 8) {
            int e = a0Var.mo20552e();
            int m = a0Var.mo20560m();
            int m2 = a0Var.mo20560m();
            if (m2 == 1835365473) {
                a0Var.mo20546O(e);
                aVar = m31562C(a0Var, e + m);
            } else if (m2 == 1936553057) {
                a0Var.mo20546O(e);
                aVar2 = m31584u(a0Var, e + m);
            }
            a0Var.mo20546O(e + m);
        }
        return Pair.create(aVar, aVar2);
    }

    /* renamed from: C */
    private static C5432a m31562C(C5918a0 a0Var, int i) {
        a0Var.mo20547P(8);
        m31568e(a0Var);
        while (a0Var.mo20552e() < i) {
            int e = a0Var.mo20552e();
            int m = a0Var.mo20560m();
            if (a0Var.mo20560m() == 1768715124) {
                a0Var.mo20546O(e);
                return m31575l(a0Var, e + m);
            }
            a0Var.mo20546O(e + m);
        }
        return null;
    }

    /* renamed from: D */
    private static void m31563D(C5918a0 a0Var, int i, int i2, int i3, int i4, int i5, C4035m mVar, C5009d dVar, int i6) throws C6249m2 {
        C4035m mVar2;
        int i7;
        int i8;
        float f;
        byte[] bArr;
        List<byte[]> list;
        String str;
        C5918a0 a0Var2 = a0Var;
        int i9 = i2;
        int i10 = i3;
        C4035m mVar3 = mVar;
        C5009d dVar2 = dVar;
        a0Var2.mo20546O(i9 + 8 + 8);
        a0Var2.mo20547P(16);
        int I = a0Var.mo20540I();
        int I2 = a0Var.mo20540I();
        a0Var2.mo20547P(50);
        int e = a0Var.mo20552e();
        int i11 = i;
        if (i11 == 1701733238) {
            Pair<Integer, C5029p> s = m31582s(a0Var2, i9, i10);
            if (s != null) {
                i11 = ((Integer) s.first).intValue();
                if (mVar3 == null) {
                    mVar3 = null;
                } else {
                    mVar3 = mVar3.mo17228c(((C5029p) s.second).f26351b);
                }
                dVar2.f26219a[i6] = (C5029p) s.second;
            }
            a0Var2.mo20546O(e);
        }
        String str2 = "video/3gpp";
        String str3 = i11 == 1831958048 ? "video/mpeg" : i11 == 1211250227 ? str2 : null;
        float f2 = 1.0f;
        byte[] bArr2 = null;
        String str4 = null;
        List<byte[]> list2 = null;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        ByteBuffer byteBuffer = null;
        C5007b bVar = null;
        boolean z = false;
        while (true) {
            if (e - i9 >= i10) {
                mVar2 = mVar3;
                break;
            }
            a0Var2.mo20546O(e);
            int e2 = a0Var.mo20552e();
            String str5 = str2;
            int m = a0Var.mo20560m();
            if (m == 0) {
                mVar2 = mVar3;
                if (a0Var.mo20552e() - i9 == i10) {
                    break;
                }
            } else {
                mVar2 = mVar3;
            }
            C4219o.m28480a(m > 0, "childAtomSize must be positive");
            int m2 = a0Var.mo20560m();
            if (m2 == 1635148611) {
                C4219o.m28480a(str3 == null, (String) null);
                a0Var2.mo20546O(e2 + 8);
                C6052a b = C6052a.m35496b(a0Var);
                list2 = b.f29325a;
                dVar2.f26221c = b.f29326b;
                if (!z) {
                    f2 = b.f29329e;
                }
                str4 = b.f29330f;
                str = "video/avc";
            } else if (m2 == 1752589123) {
                C4219o.m28480a(str3 == null, (String) null);
                a0Var2.mo20546O(e2 + 8);
                C6057f a = C6057f.m35517a(a0Var);
                list2 = a.f29354a;
                dVar2.f26221c = a.f29355b;
                if (!z) {
                    f2 = a.f29358e;
                }
                str4 = a.f29359f;
                str = "video/hevc";
            } else {
                if (m2 == 1685480259 || m2 == 1685485123) {
                    i7 = I2;
                    i8 = i11;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    C6054d a2 = C6054d.m35502a(a0Var);
                    if (a2 != null) {
                        str4 = a2.f29339c;
                        str3 = "video/dolby-vision";
                    }
                } else if (m2 == 1987076931) {
                    C4219o.m28480a(str3 == null, (String) null);
                    str = i11 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                } else if (m2 == 1635135811) {
                    C4219o.m28480a(str3 == null, (String) null);
                    str = "video/av01";
                } else if (m2 == 1668050025) {
                    ByteBuffer a3 = byteBuffer == null ? m31564a() : byteBuffer;
                    a3.position(21);
                    a3.putShort(a0Var.mo20572y());
                    a3.putShort(a0Var.mo20572y());
                    byteBuffer = a3;
                    i7 = I2;
                    i8 = i11;
                    e += m;
                    i9 = i2;
                    i10 = i3;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i11 = i8;
                    I2 = i7;
                } else if (m2 == 1835295606) {
                    ByteBuffer a4 = byteBuffer == null ? m31564a() : byteBuffer;
                    short y = a0Var.mo20572y();
                    short y2 = a0Var.mo20572y();
                    short y3 = a0Var.mo20572y();
                    i8 = i11;
                    short y4 = a0Var.mo20572y();
                    short y5 = a0Var.mo20572y();
                    List<byte[]> list3 = list2;
                    short y6 = a0Var.mo20572y();
                    byte[] bArr3 = bArr2;
                    short y7 = a0Var.mo20572y();
                    float f3 = f2;
                    short y8 = a0Var.mo20572y();
                    long E = a0Var.mo20536E();
                    long E2 = a0Var.mo20536E();
                    i7 = I2;
                    a4.position(1);
                    a4.putShort(y5);
                    a4.putShort(y6);
                    a4.putShort(y);
                    a4.putShort(y2);
                    a4.putShort(y3);
                    a4.putShort(y4);
                    a4.putShort(y7);
                    a4.putShort(y8);
                    a4.putShort((short) ((int) (E / 10000)));
                    a4.putShort((short) ((int) (E2 / 10000)));
                    byteBuffer = a4;
                    list2 = list3;
                    bArr2 = bArr3;
                    f2 = f3;
                    e += m;
                    i9 = i2;
                    i10 = i3;
                    dVar2 = dVar;
                    str2 = str5;
                    mVar3 = mVar2;
                    i11 = i8;
                    I2 = i7;
                } else {
                    i7 = I2;
                    i8 = i11;
                    bArr = bArr2;
                    f = f2;
                    list = list2;
                    if (m2 == 1681012275) {
                        C4219o.m28480a(str3 == null, (String) null);
                        str3 = str5;
                    } else if (m2 == 1702061171) {
                        C4219o.m28480a(str3 == null, (String) null);
                        bVar = m31572i(a0Var2, e2);
                        String a5 = bVar.f26215a;
                        byte[] b2 = bVar.f26216b;
                        list2 = b2 != null ? C6685q.m38446y(b2) : list;
                        str3 = a5;
                        bArr2 = bArr;
                        f2 = f;
                        e += m;
                        i9 = i2;
                        i10 = i3;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i11 = i8;
                        I2 = i7;
                    } else if (m2 == 1885434736) {
                        f2 = m31580q(a0Var2, e2);
                        list2 = list;
                        bArr2 = bArr;
                        z = true;
                        e += m;
                        i9 = i2;
                        i10 = i3;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i11 = i8;
                        I2 = i7;
                    } else if (m2 == 1937126244) {
                        bArr2 = m31581r(a0Var2, e2, m);
                        list2 = list;
                        f2 = f;
                        e += m;
                        i9 = i2;
                        i10 = i3;
                        dVar2 = dVar;
                        str2 = str5;
                        mVar3 = mVar2;
                        i11 = i8;
                        I2 = i7;
                    } else if (m2 == 1936995172) {
                        int C = a0Var.mo20534C();
                        a0Var2.mo20547P(3);
                        if (C == 0) {
                            int C2 = a0Var.mo20534C();
                            if (C2 == 0) {
                                i12 = 0;
                            } else if (C2 == 1) {
                                i12 = 1;
                            } else if (C2 == 2) {
                                i12 = 2;
                            } else if (C2 == 3) {
                                i12 = 3;
                            }
                        }
                    } else if (m2 == 1668246642) {
                        int m3 = a0Var.mo20560m();
                        if (m3 == 1852009592 || m3 == 1852009571) {
                            int I3 = a0Var.mo20540I();
                            int I4 = a0Var.mo20540I();
                            a0Var2.mo20547P(2);
                            boolean z2 = m == 19 && (a0Var.mo20534C() & 128) != 0;
                            i13 = C6053c.m35498b(I3);
                            i14 = z2 ? 1 : 2;
                            i15 = C6053c.m35499c(I4);
                        } else {
                            C5961r.m35215i("AtomParsers", "Unsupported color type: " + C5002a.m31553a(m3));
                        }
                    }
                }
                list2 = list;
                bArr2 = bArr;
                f2 = f;
                e += m;
                i9 = i2;
                i10 = i3;
                dVar2 = dVar;
                str2 = str5;
                mVar3 = mVar2;
                i11 = i8;
                I2 = i7;
            }
            str3 = str;
            i7 = I2;
            i8 = i11;
            e += m;
            i9 = i2;
            i10 = i3;
            dVar2 = dVar;
            str2 = str5;
            mVar3 = mVar2;
            i11 = i8;
            I2 = i7;
        }
        int i16 = I2;
        byte[] bArr4 = bArr2;
        float f4 = f2;
        List<byte[]> list4 = list2;
        if (str3 != null) {
            C6272r1.C6274b M = new C6272r1.C6274b().mo21504R(i4).mo21517e0(str3).mo21495I(str4).mo21522j0(I).mo21503Q(i16).mo21513a0(f4).mo21516d0(i5).mo21514b0(bArr4).mo21520h0(i12).mo21506T(list4).mo21499M(mVar2);
            int i17 = i13;
            int i18 = i14;
            int i19 = i15;
            if (!(i17 == -1 && i18 == -1 && i19 == -1 && byteBuffer == null)) {
                M.mo21496J(new C6053c(i17, i18, i19, byteBuffer != null ? byteBuffer.array() : null));
            }
            if (bVar != null) {
                M.mo21493G(C9998d.m51075j(bVar.f26217c)).mo21512Z(C9998d.m51075j(bVar.f26218d));
            }
            dVar.f26220b = M.mo21491E();
        }
    }

    /* renamed from: a */
    private static ByteBuffer m31564a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: b */
    private static boolean m31565b(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int q = C5953m0.m35152q(4, 0, length);
        int q2 = C5953m0.m35152q(jArr.length - 4, 0, length);
        if (jArr[0] > j2 || j2 >= jArr[q] || jArr[q2] >= j3 || j3 > j) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static int m31566c(C5918a0 a0Var, int i, int i2, int i3) throws C6249m2 {
        int e = a0Var.mo20552e();
        C4219o.m28480a(e >= i2, (String) null);
        while (e - i2 < i3) {
            a0Var.mo20546O(e);
            int m = a0Var.mo20560m();
            C4219o.m28480a(m > 0, "childAtomSize must be positive");
            if (a0Var.mo20560m() == i) {
                return e;
            }
            e += m;
        }
        return -1;
    }

    /* renamed from: d */
    private static int m31567d(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    /* renamed from: e */
    public static void m31568e(C5918a0 a0Var) {
        int e = a0Var.mo20552e();
        a0Var.mo20547P(4);
        if (a0Var.mo20560m() != 1751411826) {
            e += 4;
        }
        a0Var.mo20546O(e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x030b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0166  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m31569f(p161w3.C5918a0 r22, int r23, int r24, int r25, int r26, java.lang.String r27, boolean r28, p030d2.C4035m r29, p092m2.C5005b.C5009d r30, int r31) throws p177z1.C6249m2 {
        /*
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r29
            r6 = r30
            int r7 = r1 + 8
            r8 = 8
            int r7 = r7 + r8
            r0.mo20546O(r7)
            r7 = 6
            if (r28 == 0) goto L_0x0021
            int r8 = r22.mo20540I()
            r0.mo20547P(r7)
            goto L_0x0025
        L_0x0021:
            r0.mo20547P(r8)
            r8 = 0
        L_0x0025:
            r10 = 16
            r11 = 4
            r12 = 2
            r13 = 1
            if (r8 == 0) goto L_0x0049
            if (r8 != r13) goto L_0x002f
            goto L_0x0049
        L_0x002f:
            if (r8 != r12) goto L_0x0048
            r0.mo20547P(r10)
            double r7 = r22.mo20559l()
            long r7 = java.lang.Math.round(r7)
            int r8 = (int) r7
            int r7 = r22.mo20538G()
            r10 = 20
            r0.mo20547P(r10)
            r15 = 0
            goto L_0x0067
        L_0x0048:
            return
        L_0x0049:
            int r14 = r22.mo20540I()
            r0.mo20547P(r7)
            int r7 = r22.mo20535D()
            int r15 = r22.mo20552e()
            int r15 = r15 - r11
            r0.mo20546O(r15)
            int r15 = r22.mo20560m()
            if (r8 != r13) goto L_0x0065
            r0.mo20547P(r10)
        L_0x0065:
            r8 = r7
            r7 = r14
        L_0x0067:
            int r10 = r22.mo20552e()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r12 = r23
            if (r12 != r14) goto L_0x0099
            android.util.Pair r14 = m31582s(r0, r1, r2)
            if (r14 == 0) goto L_0x0096
            java.lang.Object r12 = r14.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r5 != 0) goto L_0x0084
            r5 = 0
            goto L_0x008e
        L_0x0084:
            java.lang.Object r13 = r14.second
            m2.p r13 = (p092m2.C5029p) r13
            java.lang.String r13 = r13.f26351b
            d2.m r5 = r5.mo17228c(r13)
        L_0x008e:
            m2.p[] r13 = r6.f26219a
            java.lang.Object r14 = r14.second
            m2.p r14 = (p092m2.C5029p) r14
            r13[r31] = r14
        L_0x0096:
            r0.mo20546O(r10)
        L_0x0099:
            r13 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r19 = "audio/raw"
            if (r12 != r13) goto L_0x00a8
            java.lang.String r19 = "audio/ac3"
        L_0x00a5:
            r12 = -1
            goto L_0x015a
        L_0x00a8:
            r13 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r12 != r13) goto L_0x00b0
            java.lang.String r19 = "audio/eac3"
            goto L_0x00a5
        L_0x00b0:
            r13 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r12 != r13) goto L_0x00b8
            java.lang.String r19 = "audio/ac4"
            goto L_0x00a5
        L_0x00b8:
            r13 = 1685353315(0x64747363, float:1.803728E22)
            if (r12 != r13) goto L_0x00c0
            java.lang.String r19 = "audio/vnd.dts"
            goto L_0x00a5
        L_0x00c0:
            r13 = 1685353320(0x64747368, float:1.8037286E22)
            if (r12 == r13) goto L_0x0156
            r13 = 1685353324(0x6474736c, float:1.803729E22)
            if (r12 != r13) goto L_0x00cc
            goto L_0x0156
        L_0x00cc:
            r13 = 1685353317(0x64747365, float:1.8037282E22)
            if (r12 != r13) goto L_0x00d4
            java.lang.String r19 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00a5
        L_0x00d4:
            r13 = 1685353336(0x64747378, float:1.8037304E22)
            if (r12 != r13) goto L_0x00dc
            java.lang.String r19 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00a5
        L_0x00dc:
            r13 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r12 != r13) goto L_0x00e4
            java.lang.String r19 = "audio/3gpp"
            goto L_0x00a5
        L_0x00e4:
            r13 = 1935767394(0x73617762, float:1.7863284E31)
            if (r12 != r13) goto L_0x00ec
            java.lang.String r19 = "audio/amr-wb"
            goto L_0x00a5
        L_0x00ec:
            r13 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r12 == r13) goto L_0x0154
            r13 = 1936684916(0x736f7774, float:1.89725E31)
            if (r12 != r13) goto L_0x00f7
            goto L_0x0154
        L_0x00f7:
            r13 = 1953984371(0x74776f73, float:7.841539E31)
            if (r12 != r13) goto L_0x00ff
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x015a
        L_0x00ff:
            r13 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r12 == r13) goto L_0x0150
            r13 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r12 != r13) goto L_0x010a
            goto L_0x0150
        L_0x010a:
            r13 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r12 != r13) goto L_0x0112
            java.lang.String r19 = "audio/mha1"
            goto L_0x00a5
        L_0x0112:
            r13 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r12 != r13) goto L_0x011a
            java.lang.String r19 = "audio/mhm1"
            goto L_0x00a5
        L_0x011a:
            if (r12 != r14) goto L_0x011f
            java.lang.String r19 = "audio/alac"
            goto L_0x00a5
        L_0x011f:
            r13 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r12 != r13) goto L_0x0128
            java.lang.String r19 = "audio/g711-alaw"
            goto L_0x00a5
        L_0x0128:
            r13 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r12 != r13) goto L_0x0131
            java.lang.String r19 = "audio/g711-mlaw"
            goto L_0x00a5
        L_0x0131:
            r13 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r12 != r13) goto L_0x013a
            java.lang.String r19 = "audio/opus"
            goto L_0x00a5
        L_0x013a:
            r13 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r12 != r13) goto L_0x0143
            java.lang.String r19 = "audio/flac"
            goto L_0x00a5
        L_0x0143:
            r13 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r12 != r13) goto L_0x014c
            java.lang.String r19 = "audio/true-hd"
            goto L_0x00a5
        L_0x014c:
            r12 = -1
            r19 = 0
            goto L_0x015a
        L_0x0150:
            java.lang.String r19 = "audio/mpeg"
            goto L_0x00a5
        L_0x0154:
            r12 = 2
            goto L_0x015a
        L_0x0156:
            java.lang.String r19 = "audio/vnd.dts.hd"
            goto L_0x00a5
        L_0x015a:
            r13 = r19
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x0162:
            int r11 = r10 - r1
            if (r11 >= r2) goto L_0x0307
            r0.mo20546O(r10)
            int r11 = r22.mo20560m()
            if (r11 <= 0) goto L_0x0171
            r14 = 1
            goto L_0x0172
        L_0x0171:
            r14 = 0
        L_0x0172:
            java.lang.String r9 = "childAtomSize must be positive"
            p037e2.C4219o.m28480a(r14, r9)
            int r9 = r22.mo20560m()
            r14 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r9 != r14) goto L_0x019b
            int r9 = r11 + -13
            byte[] r14 = new byte[r9]
            int r1 = r10 + 13
            r0.mo20546O(r1)
            r1 = 0
            r0.mo20557j(r14, r1, r9)
            b7.q r21 = p190b7.C6685q.m38446y(r14)
        L_0x0191:
            r9 = -1
            r14 = 1
            r16 = 4
            r17 = 2
        L_0x0197:
            r18 = 0
            goto L_0x02fd
        L_0x019b:
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r9 == r1) goto L_0x02c2
            if (r28 == 0) goto L_0x01a9
            r14 = 2002876005(0x77617665, float:4.5729223E33)
            if (r9 != r14) goto L_0x01a9
            goto L_0x02c2
        L_0x01a9:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r9 != r1) goto L_0x01c8
            int r1 = r10 + 8
            r0.mo20546O(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            z1.r1 r1 = p014b2.C1613b.m7410c(r0, r1, r4, r5)
            r6.f26220b = r1
        L_0x01bd:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r9 = 0
            r14 = 1
            r16 = 4
            r17 = 2
            goto L_0x02bf
        L_0x01c8:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r9 != r1) goto L_0x01dd
            int r1 = r10 + 8
            r0.mo20546O(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            z1.r1 r1 = p014b2.C1613b.m7414g(r0, r1, r4, r5)
            r6.f26220b = r1
            goto L_0x01bd
        L_0x01dd:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r9 != r1) goto L_0x01f2
            int r1 = r10 + 8
            r0.mo20546O(r1)
            java.lang.String r1 = java.lang.Integer.toString(r26)
            z1.r1 r1 = p014b2.C1618c.m7432b(r0, r1, r4, r5)
            r6.f26220b = r1
            goto L_0x01bd
        L_0x01f2:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r9 != r1) goto L_0x0213
            if (r15 <= 0) goto L_0x01fc
            r8 = r15
            r7 = 2
            goto L_0x0191
        L_0x01fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r14 = 0
            z1.m2 r0 = p177z1.C6249m2.m36661a(r0, r14)
            throw r0
        L_0x0213:
            r14 = 0
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r9 != r1) goto L_0x023d
            z1.r1$b r1 = new z1.r1$b
            r1.<init>()
            z1.r1$b r1 = r1.mo21504R(r3)
            z1.r1$b r1 = r1.mo21517e0(r13)
            z1.r1$b r1 = r1.mo21494H(r7)
            z1.r1$b r1 = r1.mo21518f0(r8)
            z1.r1$b r1 = r1.mo21499M(r5)
            z1.r1$b r1 = r1.mo21508V(r4)
            z1.r1 r1 = r1.mo21491E()
            r6.f26220b = r1
            goto L_0x01bd
        L_0x023d:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r9 != r1) goto L_0x025b
            int r1 = r11 + -8
            byte[] r9 = f26205a
            int r14 = r9.length
            int r14 = r14 + r1
            byte[] r14 = java.util.Arrays.copyOf(r9, r14)
            int r2 = r10 + 8
            r0.mo20546O(r2)
            int r2 = r9.length
            r0.mo20557j(r14, r2, r1)
            java.util.List r21 = p014b2.C1640g0.m7536a(r14)
            goto L_0x0191
        L_0x025b:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r9 != r1) goto L_0x028d
            int r1 = r11 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r9 = 102(0x66, float:1.43E-43)
            r14 = 0
            r2[r14] = r9
            r9 = 76
            r14 = 1
            r2[r14] = r9
            r9 = 97
            r17 = 2
            r2[r17] = r9
            r9 = 3
            r18 = 67
            r2[r9] = r18
            int r9 = r10 + 12
            r0.mo20546O(r9)
            r9 = 4
            r0.mo20557j(r2, r9, r1)
            b7.q r21 = p190b7.C6685q.m38446y(r2)
            r9 = -1
            r16 = 4
            goto L_0x0197
        L_0x028d:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 1
            r16 = 4
            r17 = 2
            if (r9 != r2) goto L_0x02be
            int r1 = r11 + -12
            byte[] r7 = new byte[r1]
            int r8 = r10 + 12
            r0.mo20546O(r8)
            r9 = 0
            r0.mo20557j(r7, r9, r1)
            android.util.Pair r1 = p161w3.C5929e.m34970g(r7)
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            b7.q r21 = p190b7.C6685q.m38446y(r7)
            r7 = r1
            goto L_0x02bf
        L_0x02be:
            r9 = 0
        L_0x02bf:
            r9 = -1
            goto L_0x0197
        L_0x02c2:
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            r14 = 1
            r16 = 4
            r17 = 2
            r18 = 0
            if (r9 != r1) goto L_0x02d0
            r1 = r10
            goto L_0x02d4
        L_0x02d0:
            int r1 = m31566c(r0, r1, r10, r11)
        L_0x02d4:
            r9 = -1
            if (r1 == r9) goto L_0x02fd
            m2.b$b r19 = m31572i(r0, r1)
            java.lang.String r13 = r19.f26215a
            byte[] r1 = r19.f26216b
            if (r1 == 0) goto L_0x02fd
            java.lang.String r2 = "audio/mp4a-latm"
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x02f9
            b2.a$b r2 = p014b2.C1609a.m7406f(r1)
            int r8 = r2.f4614a
            int r7 = r2.f4615b
            java.lang.String r2 = r2.f4616c
            r20 = r2
        L_0x02f9:
            b7.q r21 = p190b7.C6685q.m38446y(r1)
        L_0x02fd:
            int r10 = r10 + r11
            r1 = r24
            r2 = r25
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0162
        L_0x0307:
            z1.r1 r0 = r6.f26220b
            if (r0 != 0) goto L_0x0359
            if (r13 == 0) goto L_0x0359
            z1.r1$b r0 = new z1.r1$b
            r0.<init>()
            z1.r1$b r0 = r0.mo21504R(r3)
            z1.r1$b r0 = r0.mo21517e0(r13)
            r1 = r20
            z1.r1$b r0 = r0.mo21495I(r1)
            z1.r1$b r0 = r0.mo21494H(r7)
            z1.r1$b r0 = r0.mo21518f0(r8)
            z1.r1$b r0 = r0.mo21511Y(r12)
            r1 = r21
            z1.r1$b r0 = r0.mo21506T(r1)
            z1.r1$b r0 = r0.mo21499M(r5)
            z1.r1$b r0 = r0.mo21508V(r4)
            if (r19 == 0) goto L_0x0353
            long r1 = r19.f26217c
            int r1 = p219e7.C9998d.m51075j(r1)
            z1.r1$b r1 = r0.mo21493G(r1)
            long r2 = r19.f26218d
            int r2 = p219e7.C9998d.m51075j(r2)
            r1.mo21512Z(r2)
        L_0x0353:
            z1.r1 r0 = r0.mo21491E()
            r6.f26220b = r0
        L_0x0359:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5005b.m31569f(w3.a0, int, int, int, int, java.lang.String, boolean, d2.m, m2.b$d, int):void");
    }

    /* renamed from: g */
    static Pair<Integer, C5029p> m31570g(C5918a0 a0Var, int i, int i2) throws C6249m2 {
        int i3 = i + 8;
        boolean z = false;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            a0Var.mo20546O(i3);
            int m = a0Var.mo20560m();
            int m2 = a0Var.mo20560m();
            if (m2 == 1718775137) {
                num = Integer.valueOf(a0Var.mo20560m());
            } else if (m2 == 1935894637) {
                a0Var.mo20547P(4);
                str = a0Var.mo20573z(4);
            } else if (m2 == 1935894633) {
                i4 = i3;
                i5 = m;
            }
            i3 += m;
        }
        if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
            return null;
        }
        C4219o.m28480a(num != null, "frma atom is mandatory");
        C4219o.m28480a(i4 != -1, "schi atom is mandatory");
        C5029p t = m31583t(a0Var, i4, i5, str);
        if (t != null) {
            z = true;
        }
        C4219o.m28480a(z, "tenc atom is mandatory");
        return Pair.create(num, (C5029p) C5953m0.m35138j(t));
    }

    /* renamed from: h */
    private static Pair<long[], long[]> m31571h(C5002a.C5003a aVar) {
        C5002a.C5004b g = aVar.mo18933g(1701606260);
        if (g == null) {
            return null;
        }
        C5918a0 a0Var = g.f26204b;
        a0Var.mo20546O(8);
        int c = C5002a.m31555c(a0Var.mo20560m());
        int G = a0Var.mo20538G();
        long[] jArr = new long[G];
        long[] jArr2 = new long[G];
        int i = 0;
        while (i < G) {
            jArr[i] = c == 1 ? a0Var.mo20539H() : a0Var.mo20536E();
            jArr2[i] = c == 1 ? a0Var.mo20569v() : (long) a0Var.mo20560m();
            if (a0Var.mo20572y() == 1) {
                a0Var.mo20547P(2);
                i++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: i */
    private static C5007b m31572i(C5918a0 a0Var, int i) {
        a0Var.mo20546O(i + 8 + 4);
        a0Var.mo20547P(1);
        m31573j(a0Var);
        a0Var.mo20547P(2);
        int C = a0Var.mo20534C();
        if ((C & 128) != 0) {
            a0Var.mo20547P(2);
        }
        if ((C & 64) != 0) {
            a0Var.mo20547P(a0Var.mo20534C());
        }
        if ((C & 32) != 0) {
            a0Var.mo20547P(2);
        }
        a0Var.mo20547P(1);
        m31573j(a0Var);
        String h = C5967v.m35244h(a0Var.mo20534C());
        if ("audio/mpeg".equals(h) || "audio/vnd.dts".equals(h) || "audio/vnd.dts.hd".equals(h)) {
            return new C5007b(h, (byte[]) null, -1, -1);
        }
        a0Var.mo20547P(4);
        long E = a0Var.mo20536E();
        long E2 = a0Var.mo20536E();
        a0Var.mo20547P(1);
        int j = m31573j(a0Var);
        byte[] bArr = new byte[j];
        a0Var.mo20557j(bArr, 0, j);
        long j2 = -1;
        long j3 = E2 > 0 ? E2 : -1;
        if (E > 0) {
            j2 = E;
        }
        return new C5007b(h, bArr, j3, j2);
    }

    /* renamed from: j */
    private static int m31573j(C5918a0 a0Var) {
        int C = a0Var.mo20534C();
        int i = C & 127;
        while ((C & 128) == 128) {
            C = a0Var.mo20534C();
            i = (i << 7) | (C & 127);
        }
        return i;
    }

    /* renamed from: k */
    private static int m31574k(C5918a0 a0Var) {
        a0Var.mo20546O(16);
        return a0Var.mo20560m();
    }

    /* renamed from: l */
    private static C5432a m31575l(C5918a0 a0Var, int i) {
        a0Var.mo20547P(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var.mo20552e() < i) {
            C5432a.C5434b c = C5020h.m31666c(a0Var);
            if (c != null) {
                arrayList.add(c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C5432a((List<? extends C5432a.C5434b>) arrayList);
    }

    /* renamed from: m */
    private static Pair<Long, String> m31576m(C5918a0 a0Var) {
        int i = 8;
        a0Var.mo20546O(8);
        int c = C5002a.m31555c(a0Var.mo20560m());
        a0Var.mo20547P(c == 0 ? 8 : 16);
        long E = a0Var.mo20536E();
        if (c == 0) {
            i = 4;
        }
        a0Var.mo20547P(i);
        int I = a0Var.mo20540I();
        return Pair.create(Long.valueOf(E), "" + ((char) (((I >> 10) & 31) + 96)) + ((char) (((I >> 5) & 31) + 96)) + ((char) ((I & 31) + 96)));
    }

    /* renamed from: n */
    public static C5432a m31577n(C5002a.C5003a aVar) {
        C5002a.C5004b g = aVar.mo18933g(1751411826);
        C5002a.C5004b g2 = aVar.mo18933g(1801812339);
        C5002a.C5004b g3 = aVar.mo18933g(1768715124);
        if (g == null || g2 == null || g3 == null || m31574k(g.f26204b) != 1835299937) {
            return null;
        }
        C5918a0 a0Var = g2.f26204b;
        a0Var.mo20546O(12);
        int m = a0Var.mo20560m();
        String[] strArr = new String[m];
        for (int i = 0; i < m; i++) {
            int m2 = a0Var.mo20560m();
            a0Var.mo20547P(4);
            strArr[i] = a0Var.mo20573z(m2 - 8);
        }
        C5918a0 a0Var2 = g3.f26204b;
        a0Var2.mo20546O(8);
        ArrayList arrayList = new ArrayList();
        while (a0Var2.mo20548a() > 8) {
            int e = a0Var2.mo20552e();
            int m3 = a0Var2.mo20560m();
            int m4 = a0Var2.mo20560m() - 1;
            if (m4 < 0 || m4 >= m) {
                C5961r.m35215i("AtomParsers", "Skipped metadata with unknown key index: " + m4);
            } else {
                C6042a f = C5020h.m31669f(a0Var2, e + m3, strArr[m4]);
                if (f != null) {
                    arrayList.add(f);
                }
            }
            a0Var2.mo20546O(e + m3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C5432a((List<? extends C5432a.C5434b>) arrayList);
    }

    /* renamed from: o */
    private static void m31578o(C5918a0 a0Var, int i, int i2, int i3, C5009d dVar) {
        a0Var.mo20546O(i2 + 8 + 8);
        if (i == 1835365492) {
            a0Var.mo20570w();
            String w = a0Var.mo20570w();
            if (w != null) {
                dVar.f26220b = new C6272r1.C6274b().mo21504R(i3).mo21517e0(w).mo21491E();
            }
        }
    }

    /* renamed from: p */
    private static long m31579p(C5918a0 a0Var) {
        int i = 8;
        a0Var.mo20546O(8);
        if (C5002a.m31555c(a0Var.mo20560m()) != 0) {
            i = 16;
        }
        a0Var.mo20547P(i);
        return a0Var.mo20536E();
    }

    /* renamed from: q */
    private static float m31580q(C5918a0 a0Var, int i) {
        a0Var.mo20546O(i + 8);
        return ((float) a0Var.mo20538G()) / ((float) a0Var.mo20538G());
    }

    /* renamed from: r */
    private static byte[] m31581r(C5918a0 a0Var, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            a0Var.mo20546O(i3);
            int m = a0Var.mo20560m();
            if (a0Var.mo20560m() == 1886547818) {
                return Arrays.copyOfRange(a0Var.mo20551d(), i3, m + i3);
            }
            i3 += m;
        }
        return null;
    }

    /* renamed from: s */
    private static Pair<Integer, C5029p> m31582s(C5918a0 a0Var, int i, int i2) throws C6249m2 {
        Pair<Integer, C5029p> g;
        int e = a0Var.mo20552e();
        while (e - i < i2) {
            a0Var.mo20546O(e);
            int m = a0Var.mo20560m();
            C4219o.m28480a(m > 0, "childAtomSize must be positive");
            if (a0Var.mo20560m() == 1936289382 && (g = m31570g(a0Var, e, m)) != null) {
                return g;
            }
            e += m;
        }
        return null;
    }

    /* renamed from: t */
    private static C5029p m31583t(C5918a0 a0Var, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            a0Var.mo20546O(i5);
            int m = a0Var.mo20560m();
            if (a0Var.mo20560m() == 1952804451) {
                int c = C5002a.m31555c(a0Var.mo20560m());
                a0Var.mo20547P(1);
                if (c == 0) {
                    a0Var.mo20547P(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int C = a0Var.mo20534C();
                    i3 = C & 15;
                    i4 = (C & 240) >> 4;
                }
                boolean z = a0Var.mo20534C() == 1;
                int C2 = a0Var.mo20534C();
                byte[] bArr2 = new byte[16];
                a0Var.mo20557j(bArr2, 0, 16);
                if (z && C2 == 0) {
                    int C3 = a0Var.mo20534C();
                    bArr = new byte[C3];
                    a0Var.mo20557j(bArr, 0, C3);
                }
                return new C5029p(z, str, C2, bArr2, i4, i3, bArr);
            }
            i5 += m;
        }
    }

    /* renamed from: u */
    private static C5432a m31584u(C5918a0 a0Var, int i) {
        a0Var.mo20547P(12);
        while (a0Var.mo20552e() < i) {
            int e = a0Var.mo20552e();
            int m = a0Var.mo20560m();
            if (a0Var.mo20560m() != 1935766900) {
                a0Var.mo20546O(e + m);
            } else if (m < 14) {
                return null;
            } else {
                a0Var.mo20547P(5);
                int C = a0Var.mo20534C();
                if (C != 12 && C != 13) {
                    return null;
                }
                float f = C == 12 ? 240.0f : 120.0f;
                a0Var.mo20547P(1);
                return new C5432a(new C6050e(f, a0Var.mo20534C()));
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0131  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p092m2.C5031r m31585v(p092m2.C5028o r38, p092m2.C5002a.C5003a r39, p037e2.C4230x r40) throws p177z1.C6249m2 {
        /*
            r1 = r38
            r0 = r39
            r2 = r40
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            m2.a$b r3 = r0.mo18933g(r3)
            if (r3 == 0) goto L_0x0017
            m2.b$e r5 = new m2.b$e
            z1.r1 r6 = r1.f26344f
            r5.<init>(r3, r6)
            goto L_0x0025
        L_0x0017:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            m2.a$b r3 = r0.mo18933g(r3)
            if (r3 == 0) goto L_0x051f
            m2.b$f r5 = new m2.b$f
            r5.<init>(r3)
        L_0x0025:
            int r3 = r5.mo18936b()
            r6 = 0
            if (r3 != 0) goto L_0x0040
            m2.r r9 = new m2.r
            long[] r2 = new long[r6]
            int[] r3 = new int[r6]
            r4 = 0
            long[] r5 = new long[r6]
            int[] r6 = new int[r6]
            r7 = 0
            r0 = r9
            r1 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0040:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            m2.a$b r7 = r0.mo18933g(r7)
            r8 = 1
            if (r7 != 0) goto L_0x0059
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            m2.a$b r7 = r0.mo18933g(r7)
            java.lang.Object r7 = p161w3.C5917a.m34872e(r7)
            m2.a$b r7 = (p092m2.C5002a.C5004b) r7
            r9 = 1
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            w3.a0 r7 = r7.f26204b
            r10 = 1937011555(0x73747363, float:1.9367382E31)
            m2.a$b r10 = r0.mo18933g(r10)
            java.lang.Object r10 = p161w3.C5917a.m34872e(r10)
            m2.a$b r10 = (p092m2.C5002a.C5004b) r10
            w3.a0 r10 = r10.f26204b
            r11 = 1937011827(0x73747473, float:1.9367711E31)
            m2.a$b r11 = r0.mo18933g(r11)
            java.lang.Object r11 = p161w3.C5917a.m34872e(r11)
            m2.a$b r11 = (p092m2.C5002a.C5004b) r11
            w3.a0 r11 = r11.f26204b
            r12 = 1937011571(0x73747373, float:1.9367401E31)
            m2.a$b r12 = r0.mo18933g(r12)
            if (r12 == 0) goto L_0x0086
            w3.a0 r12 = r12.f26204b
            goto L_0x0087
        L_0x0086:
            r12 = 0
        L_0x0087:
            r13 = 1668576371(0x63747473, float:4.5093966E21)
            m2.a$b r0 = r0.mo18933g(r13)
            if (r0 == 0) goto L_0x0093
            w3.a0 r0 = r0.f26204b
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            m2.b$a r13 = new m2.b$a
            r13.<init>(r10, r7, r9)
            r7 = 12
            r11.mo20546O(r7)
            int r9 = r11.mo20538G()
            int r9 = r9 - r8
            int r10 = r11.mo20538G()
            int r14 = r11.mo20538G()
            if (r0 == 0) goto L_0x00b5
            r0.mo20546O(r7)
            int r15 = r0.mo20538G()
            goto L_0x00b6
        L_0x00b5:
            r15 = 0
        L_0x00b6:
            r4 = -1
            if (r12 == 0) goto L_0x00cb
            r12.mo20546O(r7)
            int r7 = r12.mo20538G()
            if (r7 <= 0) goto L_0x00c9
            int r16 = r12.mo20538G()
            int r16 = r16 + -1
            goto L_0x00ce
        L_0x00c9:
            r12 = 0
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            r16 = -1
        L_0x00ce:
            int r6 = r5.mo18935a()
            z1.r1 r8 = r1.f26344f
            java.lang.String r8 = r8.f30243t
            if (r6 == r4) goto L_0x00fa
            java.lang.String r4 = "audio/raw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x00f0
            java.lang.String r4 = "audio/g711-alaw"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00fa
        L_0x00f0:
            if (r9 != 0) goto L_0x00fa
            if (r15 != 0) goto L_0x00fa
            if (r7 != 0) goto L_0x00fa
            r39 = r7
            r4 = 1
            goto L_0x00fd
        L_0x00fa:
            r39 = r7
            r4 = 0
        L_0x00fd:
            if (r4 == 0) goto L_0x0131
            int r0 = r13.f26206a
            long[] r4 = new long[r0]
            int[] r0 = new int[r0]
        L_0x0105:
            boolean r5 = r13.mo18934a()
            if (r5 == 0) goto L_0x0116
            int r5 = r13.f26207b
            long r9 = r13.f26209d
            r4[r5] = r9
            int r9 = r13.f26208c
            r0[r5] = r9
            goto L_0x0105
        L_0x0116:
            long r9 = (long) r14
            m2.d$b r0 = p092m2.C5014d.m31607a(r6, r4, r0, r9)
            long[] r4 = r0.f26238a
            int[] r5 = r0.f26239b
            int r6 = r0.f26240c
            long[] r9 = r0.f26241d
            int[] r10 = r0.f26242e
            long r11 = r0.f26243f
            r14 = r1
            r0 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r13 = r10
            r15 = r11
            r12 = r9
            goto L_0x02a0
        L_0x0131:
            long[] r4 = new long[r3]
            int[] r6 = new int[r3]
            long[] r7 = new long[r3]
            int[] r8 = new int[r3]
            r24 = r11
            r2 = r16
            r1 = 0
            r11 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            r16 = r15
            r15 = r14
            r14 = r10
            r37 = r9
            r9 = r39
        L_0x0151:
            r39 = r37
            java.lang.String r10 = "AtomParsers"
            if (r1 >= r3) goto L_0x0219
            r28 = r27
            r27 = r22
            r22 = 1
        L_0x015d:
            if (r27 != 0) goto L_0x017a
            boolean r22 = r13.mo18934a()
            if (r22 == 0) goto L_0x017a
            r30 = r14
            r31 = r15
            long r14 = r13.f26209d
            r32 = r3
            int r3 = r13.f26208c
            r27 = r3
            r28 = r14
            r14 = r30
            r15 = r31
            r3 = r32
            goto L_0x015d
        L_0x017a:
            r32 = r3
            r30 = r14
            r31 = r15
            if (r22 != 0) goto L_0x019e
            java.lang.String r2 = "Unexpected end of chunk data"
            p161w3.C5961r.m35215i(r10, r2)
            long[] r4 = java.util.Arrays.copyOf(r4, r1)
            int[] r6 = java.util.Arrays.copyOf(r6, r1)
            long[] r7 = java.util.Arrays.copyOf(r7, r1)
            int[] r8 = java.util.Arrays.copyOf(r8, r1)
            r3 = r1
            r2 = r21
            r1 = r27
            goto L_0x0221
        L_0x019e:
            if (r0 == 0) goto L_0x01b1
        L_0x01a0:
            if (r23 != 0) goto L_0x01af
            if (r16 <= 0) goto L_0x01af
            int r23 = r0.mo20538G()
            int r21 = r0.mo20560m()
            int r16 = r16 + -1
            goto L_0x01a0
        L_0x01af:
            int r23 = r23 + -1
        L_0x01b1:
            r3 = r21
            r4[r1] = r28
            int r10 = r5.mo18937c()
            r6[r1] = r10
            r10 = r6[r1]
            if (r10 <= r11) goto L_0x01c2
            r10 = r6[r1]
            r11 = r10
        L_0x01c2:
            long r14 = (long) r3
            long r14 = r25 + r14
            r7[r1] = r14
            if (r12 != 0) goto L_0x01cb
            r10 = 1
            goto L_0x01cc
        L_0x01cb:
            r10 = 0
        L_0x01cc:
            r8[r1] = r10
            if (r1 != r2) goto L_0x01e2
            r10 = 1
            r8[r1] = r10
            int r9 = r9 + -1
            if (r9 <= 0) goto L_0x01e2
            java.lang.Object r2 = p161w3.C5917a.m34872e(r12)
            w3.a0 r2 = (p161w3.C5918a0) r2
            int r2 = r2.mo20538G()
            int r2 = r2 - r10
        L_0x01e2:
            r15 = r2
            r10 = r3
            r14 = r31
            long r2 = (long) r14
            long r25 = r25 + r2
            int r2 = r30 + -1
            if (r2 != 0) goto L_0x01fa
            if (r39 <= 0) goto L_0x01fa
            int r2 = r24.mo20538G()
            int r3 = r24.mo20560m()
            int r14 = r39 + -1
            goto L_0x01fd
        L_0x01fa:
            r3 = r14
            r14 = r39
        L_0x01fd:
            r39 = r2
            r2 = r6[r1]
            r21 = r3
            long r2 = (long) r2
            long r2 = r28 + r2
            int r22 = r27 + -1
            int r1 = r1 + 1
            r27 = r2
            r2 = r15
            r15 = r21
            r3 = r32
            r21 = r10
            r37 = r14
            r14 = r39
            goto L_0x0151
        L_0x0219:
            r32 = r3
            r30 = r14
            r2 = r21
            r1 = r22
        L_0x0221:
            long r12 = (long) r2
            long r12 = r25 + r12
            if (r0 == 0) goto L_0x0236
        L_0x0226:
            if (r16 <= 0) goto L_0x0236
            int r2 = r0.mo20538G()
            if (r2 == 0) goto L_0x0230
            r0 = 0
            goto L_0x0237
        L_0x0230:
            r0.mo20560m()
            int r16 = r16 + -1
            goto L_0x0226
        L_0x0236:
            r0 = 1
        L_0x0237:
            if (r9 != 0) goto L_0x0249
            if (r30 != 0) goto L_0x0249
            if (r1 != 0) goto L_0x0249
            if (r39 != 0) goto L_0x0249
            r2 = r23
            if (r2 != 0) goto L_0x024b
            if (r0 != 0) goto L_0x0246
            goto L_0x024b
        L_0x0246:
            r14 = r38
            goto L_0x0299
        L_0x0249:
            r2 = r23
        L_0x024b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r14 = "Inconsistent stbl box for track "
            r5.append(r14)
            r14 = r38
            int r15 = r14.f26339a
            r5.append(r15)
            java.lang.String r15 = ": remainingSynchronizationSamples "
            r5.append(r15)
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesAtTimestampDelta "
            r5.append(r9)
            r9 = r30
            r5.append(r9)
            java.lang.String r9 = ", remainingSamplesInChunk "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r5.append(r1)
            r9 = r39
            r5.append(r9)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r5.append(r1)
            r5.append(r2)
            if (r0 != 0) goto L_0x028d
            java.lang.String r0 = ", ctts invalid"
            goto L_0x028f
        L_0x028d:
            java.lang.String r0 = ""
        L_0x028f:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            p161w3.C5961r.m35215i(r10, r0)
        L_0x0299:
            r0 = r3
            r2 = r4
            r3 = r6
            r4 = r11
            r15 = r12
            r12 = r7
            r13 = r8
        L_0x02a0:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r14.f26341c
            r5 = r15
            long r7 = p161w3.C5953m0.m35095N0(r5, r7, r9)
            long[] r1 = r14.f26346h
            r10 = 1000000(0xf4240, double:4.940656E-318)
            if (r1 != 0) goto L_0x02c1
            long r0 = r14.f26341c
            p161w3.C5953m0.m35099P0(r12, r10, r0)
            m2.r r9 = new m2.r
            r0 = r9
            r1 = r38
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x02c1:
            int r1 = r1.length
            r5 = 1
            if (r1 != r5) goto L_0x035e
            int r1 = r14.f26340b
            if (r1 != r5) goto L_0x035e
            int r1 = r12.length
            r5 = 2
            if (r1 < r5) goto L_0x035e
            long[] r1 = r14.f26347i
            java.lang.Object r1 = p161w3.C5917a.m34872e(r1)
            long[] r1 = (long[]) r1
            r5 = 0
            r21 = r1[r5]
            long[] r1 = r14.f26346h
            r23 = r1[r5]
            long r5 = r14.f26341c
            long r7 = r14.f26342d
            r25 = r5
            r27 = r7
            long r5 = p161w3.C5953m0.m35095N0(r23, r25, r27)
            long r23 = r21 + r5
            r5 = r12
            r6 = r15
            r8 = r21
            r25 = r0
            r0 = r10
            r10 = r23
            boolean r5 = m31565b(r5, r6, r8, r10)
            if (r5 == 0) goto L_0x0360
            long r6 = r15 - r23
            r5 = 0
            r8 = r12[r5]
            long r26 = r21 - r8
            z1.r1 r5 = r14.f26344f
            int r5 = r5.f30225H
            long r8 = (long) r5
            long r10 = r14.f26341c
            r28 = r8
            r30 = r10
            long r10 = p161w3.C5953m0.m35095N0(r26, r28, r30)
            z1.r1 r5 = r14.f26344f
            int r5 = r5.f30225H
            long r8 = (long) r5
            long r0 = r14.f26341c
            r39 = r4
            r4 = r10
            r10 = r0
            long r0 = p161w3.C5953m0.m35095N0(r6, r8, r10)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0328
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0362
        L_0x0328:
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0362
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x0362
            int r5 = (int) r4
            r4 = r40
            r4.f23585a = r5
            int r1 = (int) r0
            r4.f23586b = r1
            long r0 = r14.f26341c
            r4 = 1000000(0xf4240, double:4.940656E-318)
            p161w3.C5953m0.m35099P0(r12, r4, r0)
            long[] r0 = r14.f26346h
            r1 = 0
            r4 = r0[r1]
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r14.f26342d
            long r7 = p161w3.C5953m0.m35095N0(r4, r6, r8)
            m2.r r9 = new m2.r
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x035e:
            r25 = r0
        L_0x0360:
            r39 = r4
        L_0x0362:
            long[] r0 = r14.f26346h
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L_0x03ad
            r1 = 0
            r4 = r0[r1]
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x03ad
            long[] r0 = r14.f26347i
            java.lang.Object r0 = p161w3.C5917a.m34872e(r0)
            long[] r0 = (long[]) r0
            r4 = r0[r1]
            r6 = 0
        L_0x037c:
            int r0 = r12.length
            if (r6 >= r0) goto L_0x0393
            r0 = r12[r6]
            long r17 = r0 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f26341c
            r21 = r0
            long r0 = p161w3.C5953m0.m35095N0(r17, r19, r21)
            r12[r6] = r0
            int r6 = r6 + 1
            goto L_0x037c
        L_0x0393:
            long r17 = r15 - r4
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f26341c
            r21 = r0
            long r7 = p161w3.C5953m0.m35095N0(r17, r19, r21)
            m2.r r9 = new m2.r
            r0 = r9
            r1 = r38
            r4 = r39
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L_0x03ad:
            int r1 = r14.f26340b
            r4 = 1
            if (r1 != r4) goto L_0x03b4
            r10 = 1
            goto L_0x03b5
        L_0x03b4:
            r10 = 0
        L_0x03b5:
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r0 = r0.length
            int[] r0 = new int[r0]
            long[] r4 = r14.f26347i
            java.lang.Object r4 = p161w3.C5917a.m34872e(r4)
            long[] r4 = (long[]) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x03c7:
            long[] r9 = r14.f26346h
            int r11 = r9.length
            if (r5 >= r11) goto L_0x0431
            r11 = r2
            r15 = r3
            r2 = r4[r5]
            r21 = -1
            int r16 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r16 == 0) goto L_0x0421
            r26 = r9[r5]
            r16 = r8
            long r8 = r14.f26341c
            r40 = r6
            r21 = r7
            long r6 = r14.f26342d
            r28 = r8
            r30 = r6
            long r6 = p161w3.C5953m0.m35095N0(r26, r28, r30)
            r8 = 1
            int r9 = p161w3.C5953m0.m35136i(r12, r2, r8, r8)
            r1[r5] = r9
            long r2 = r2 + r6
            r6 = 0
            int r2 = p161w3.C5953m0.m35128e(r12, r2, r10, r6)
            r0[r5] = r2
        L_0x03f9:
            r2 = r1[r5]
            r3 = r0[r5]
            if (r2 >= r3) goto L_0x040c
            r2 = r1[r5]
            r2 = r13[r2]
            r2 = r2 & r8
            if (r2 != 0) goto L_0x040c
            r2 = r1[r5]
            int r2 = r2 + r8
            r1[r5] = r2
            goto L_0x03f9
        L_0x040c:
            r2 = r0[r5]
            r3 = r1[r5]
            int r2 = r2 - r3
            int r7 = r21 + r2
            r2 = r1[r5]
            r3 = r16
            if (r3 == r2) goto L_0x041b
            r2 = 1
            goto L_0x041c
        L_0x041b:
            r2 = 0
        L_0x041c:
            r2 = r40 | r2
            r3 = r0[r5]
            goto L_0x042a
        L_0x0421:
            r40 = r6
            r21 = r7
            r3 = r8
            r6 = 0
            r8 = 1
            r2 = r40
        L_0x042a:
            int r5 = r5 + 1
            r6 = r2
            r8 = r3
            r2 = r11
            r3 = r15
            goto L_0x03c7
        L_0x0431:
            r11 = r2
            r15 = r3
            r40 = r6
            r3 = r25
            r6 = 0
            r8 = 1
            if (r7 == r3) goto L_0x043c
            goto L_0x043d
        L_0x043c:
            r8 = 0
        L_0x043d:
            r2 = r40 | r8
            if (r2 == 0) goto L_0x0444
            long[] r3 = new long[r7]
            goto L_0x0445
        L_0x0444:
            r3 = r11
        L_0x0445:
            if (r2 == 0) goto L_0x044a
            int[] r4 = new int[r7]
            goto L_0x044b
        L_0x044a:
            r4 = r15
        L_0x044b:
            if (r2 == 0) goto L_0x044f
            r5 = 0
            goto L_0x0451
        L_0x044f:
            r5 = r39
        L_0x0451:
            if (r2 == 0) goto L_0x0456
            int[] r8 = new int[r7]
            goto L_0x0457
        L_0x0456:
            r8 = r13
        L_0x0457:
            long[] r7 = new long[r7]
            r40 = r5
            r39 = r15
            r9 = 0
            r15 = 0
        L_0x0460:
            long[] r5 = r14.f26346h
            int r5 = r5.length
            if (r6 >= r5) goto L_0x04ff
            long[] r5 = r14.f26347i
            r16 = r5[r6]
            r5 = r1[r6]
            r18 = r1
            r1 = r0[r6]
            r27 = r0
            if (r2 == 0) goto L_0x0483
            int r0 = r1 - r5
            java.lang.System.arraycopy(r11, r5, r3, r15, r0)
            r28 = r11
            r11 = r39
            java.lang.System.arraycopy(r11, r5, r4, r15, r0)
            java.lang.System.arraycopy(r13, r5, r8, r15, r0)
            goto L_0x0487
        L_0x0483:
            r28 = r11
            r11 = r39
        L_0x0487:
            r0 = r40
        L_0x0489:
            if (r5 >= r1) goto L_0x04d9
            r23 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r0
            r39 = r1
            long r0 = r14.f26342d
            r21 = r9
            r25 = r0
            long r0 = p161w3.C5953m0.m35095N0(r21, r23, r25)
            r21 = r12[r5]
            r23 = r12
            r24 = r13
            long r12 = r21 - r16
            r30 = r8
            r21 = r9
            r8 = 0
            long r31 = java.lang.Math.max(r8, r12)
            r33 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r14.f26341c
            r35 = r12
            long r12 = p161w3.C5953m0.m35095N0(r31, r33, r35)
            long r0 = r0 + r12
            r7[r15] = r0
            if (r2 == 0) goto L_0x04c7
            r0 = r4[r15]
            r1 = r29
            if (r0 <= r1) goto L_0x04c9
            r0 = r11[r5]
            goto L_0x04ca
        L_0x04c7:
            r1 = r29
        L_0x04c9:
            r0 = r1
        L_0x04ca:
            int r15 = r15 + 1
            int r5 = r5 + 1
            r1 = r39
            r9 = r21
            r12 = r23
            r13 = r24
            r8 = r30
            goto L_0x0489
        L_0x04d9:
            r1 = r0
            r30 = r8
            r21 = r9
            r23 = r12
            r24 = r13
            r8 = 0
            long[] r0 = r14.f26346h
            r12 = r0[r6]
            long r12 = r21 + r12
            int r6 = r6 + 1
            r40 = r1
            r39 = r11
            r9 = r12
            r1 = r18
            r12 = r23
            r13 = r24
            r0 = r27
            r11 = r28
            r8 = r30
            goto L_0x0460
        L_0x04ff:
            r30 = r8
            r21 = r9
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r14.f26342d
            r25 = r0
            long r8 = p161w3.C5953m0.m35095N0(r21, r23, r25)
            m2.r r10 = new m2.r
            r0 = r10
            r1 = r38
            r2 = r3
            r3 = r4
            r4 = r40
            r5 = r7
            r6 = r30
            r7 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L_0x051f:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            z1.m2 r0 = p177z1.C6249m2.m36661a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p092m2.C5005b.m31585v(m2.o, m2.a$a, e2.x):m2.r");
    }

    /* renamed from: w */
    private static C5009d m31586w(C5918a0 a0Var, int i, int i2, String str, C4035m mVar, boolean z) throws C6249m2 {
        int i3;
        C5918a0 a0Var2 = a0Var;
        int i4 = i;
        a0Var2.mo20546O(12);
        int m = a0Var.mo20560m();
        C5009d dVar = new C5009d(m);
        for (int i5 = 0; i5 < m; i5++) {
            int e = a0Var.mo20552e();
            int m2 = a0Var.mo20560m();
            C4219o.m28480a(m2 > 0, "childAtomSize must be positive");
            int m3 = a0Var.mo20560m();
            if (m3 == 1635148593 || m3 == 1635148595 || m3 == 1701733238 || m3 == 1831958048 || m3 == 1836070006 || m3 == 1752589105 || m3 == 1751479857 || m3 == 1932670515 || m3 == 1211250227 || m3 == 1987063864 || m3 == 1987063865 || m3 == 1635135537 || m3 == 1685479798 || m3 == 1685479729 || m3 == 1685481573 || m3 == 1685481521) {
                i3 = e;
                m31563D(a0Var, m3, i3, m2, i, i2, mVar, dVar, i5);
            } else if (m3 == 1836069985 || m3 == 1701733217 || m3 == 1633889587 || m3 == 1700998451 || m3 == 1633889588 || m3 == 1835823201 || m3 == 1685353315 || m3 == 1685353317 || m3 == 1685353320 || m3 == 1685353324 || m3 == 1685353336 || m3 == 1935764850 || m3 == 1935767394 || m3 == 1819304813 || m3 == 1936684916 || m3 == 1953984371 || m3 == 778924082 || m3 == 778924083 || m3 == 1835557169 || m3 == 1835560241 || m3 == 1634492771 || m3 == 1634492791 || m3 == 1970037111 || m3 == 1332770163 || m3 == 1716281667) {
                i3 = e;
                m31569f(a0Var, m3, e, m2, i, str, z, mVar, dVar, i5);
            } else {
                if (m3 == 1414810956 || m3 == 1954034535 || m3 == 2004251764 || m3 == 1937010800 || m3 == 1664495672) {
                    m31587x(a0Var, m3, e, m2, i, str, dVar);
                } else if (m3 == 1835365492) {
                    m31578o(a0Var2, m3, e, i4, dVar);
                } else if (m3 == 1667329389) {
                    dVar.f26220b = new C6272r1.C6274b().mo21504R(i4).mo21517e0("application/x-camera-motion").mo21491E();
                }
                i3 = e;
            }
            a0Var2.mo20546O(i3 + m2);
        }
        return dVar;
    }

    /* renamed from: x */
    private static void m31587x(C5918a0 a0Var, int i, int i2, int i3, int i4, String str, C5009d dVar) {
        a0Var.mo20546O(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        C6685q qVar = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                a0Var.mo20557j(bArr, 0, i5);
                qVar = C6685q.m38446y(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i == 1937010800) {
                j = 0;
            } else if (i == 1664495672) {
                dVar.f26222d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                throw new IllegalStateException();
            }
        }
        dVar.f26220b = new C6272r1.C6274b().mo21504R(i4).mo21517e0(str2).mo21508V(str).mo21521i0(j).mo21506T(qVar).mo21491E();
    }

    /* renamed from: y */
    private static C5012g m31588y(C5918a0 a0Var) {
        boolean z;
        int i = 8;
        a0Var.mo20546O(8);
        int c = C5002a.m31555c(a0Var.mo20560m());
        a0Var.mo20547P(c == 0 ? 8 : 16);
        int m = a0Var.mo20560m();
        a0Var.mo20547P(4);
        int e = a0Var.mo20552e();
        if (c == 0) {
            i = 4;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (a0Var.mo20551d()[e + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            a0Var.mo20547P(i);
        } else {
            long E = c == 0 ? a0Var.mo20536E() : a0Var.mo20539H();
            if (E != 0) {
                j = E;
            }
        }
        a0Var.mo20547P(16);
        int m2 = a0Var.mo20560m();
        int m3 = a0Var.mo20560m();
        a0Var.mo20547P(4);
        int m4 = a0Var.mo20560m();
        int m5 = a0Var.mo20560m();
        if (m2 == 0 && m3 == 65536 && m4 == -65536 && m5 == 0) {
            i2 = 90;
        } else if (m2 == 0 && m3 == -65536 && m4 == 65536 && m5 == 0) {
            i2 = 270;
        } else if (m2 == -65536 && m3 == 0 && m4 == 0 && m5 == -65536) {
            i2 = 180;
        }
        return new C5012g(m, j, i2);
    }

    /* renamed from: z */
    private static C5028o m31589z(C5002a.C5003a aVar, C5002a.C5004b bVar, long j, C4035m mVar, boolean z, boolean z2) throws C6249m2 {
        long j2;
        C5002a.C5004b bVar2;
        long[] jArr;
        long[] jArr2;
        C5002a.C5003a f;
        Pair<long[], long[]> h;
        C5002a.C5003a aVar2 = aVar;
        C5002a.C5003a aVar3 = (C5002a.C5003a) C5917a.m34872e(aVar2.mo18932f(1835297121));
        int d = m31567d(m31574k(((C5002a.C5004b) C5917a.m34872e(aVar3.mo18933g(1751411826))).f26204b));
        if (d == -1) {
            return null;
        }
        C5012g y = m31588y(((C5002a.C5004b) C5917a.m34872e(aVar2.mo18933g(1953196132))).f26204b);
        long j3 = -9223372036854775807L;
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = y.f26232b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long p = m31579p(bVar2.f26204b);
        if (j2 != -9223372036854775807L) {
            j3 = C5953m0.m35095N0(j2, 1000000, p);
        }
        long j4 = j3;
        Pair<Long, String> m = m31576m(((C5002a.C5004b) C5917a.m34872e(aVar3.mo18933g(1835296868))).f26204b);
        C5009d w = m31586w(((C5002a.C5004b) C5917a.m34872e(((C5002a.C5003a) C5917a.m34872e(((C5002a.C5003a) C5917a.m34872e(aVar3.mo18932f(1835626086))).mo18932f(1937007212))).mo18933g(1937011556))).f26204b, y.f26231a, y.f26233c, (String) m.second, mVar, z2);
        if (z || (f = aVar2.mo18932f(1701082227)) == null || (h = m31571h(f)) == null) {
            jArr2 = null;
            jArr = null;
        } else {
            jArr = (long[]) h.second;
            jArr2 = (long[]) h.first;
        }
        if (w.f26220b == null) {
            return null;
        }
        return new C5028o(y.f26231a, d, ((Long) m.first).longValue(), p, j4, w.f26220b, w.f26222d, w.f26219a, w.f26221c, jArr2, jArr);
    }
}
