package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.s4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2834s4 implements qn4 {

    /* renamed from: E */
    public static final xn4 f17215E = C2685o4.f14883b;

    /* renamed from: F */
    private static final byte[] f17216F = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: G */
    private static final C2388g4 f17217G;

    /* renamed from: A */
    private tn4 f17218A;

    /* renamed from: B */
    private C2792r[] f17219B;

    /* renamed from: C */
    private C2792r[] f17220C;

    /* renamed from: D */
    private boolean f17221D;

    /* renamed from: a */
    private final List f17222a = Collections.unmodifiableList(Collections.emptyList());

    /* renamed from: b */
    private final SparseArray f17223b;

    /* renamed from: c */
    private final y22 f17224c = new y22(C2420h.f10130a);

    /* renamed from: d */
    private final y22 f17225d = new y22(5);

    /* renamed from: e */
    private final y22 f17226e = new y22();

    /* renamed from: f */
    private final byte[] f17227f;

    /* renamed from: g */
    private final y22 f17228g;

    /* renamed from: h */
    private final C2534k1 f17229h = new C2534k1();

    /* renamed from: i */
    private final y22 f17230i = new y22(16);

    /* renamed from: j */
    private final ArrayDeque f17231j;

    /* renamed from: k */
    private final ArrayDeque f17232k;

    /* renamed from: l */
    private int f17233l;

    /* renamed from: m */
    private int f17234m;

    /* renamed from: n */
    private long f17235n;

    /* renamed from: o */
    private int f17236o;

    /* renamed from: p */
    private y22 f17237p;

    /* renamed from: q */
    private long f17238q;

    /* renamed from: r */
    private int f17239r;

    /* renamed from: s */
    private long f17240s;

    /* renamed from: t */
    private long f17241t;

    /* renamed from: u */
    private long f17242u;

    /* renamed from: v */
    private C2797r4 f17243v;

    /* renamed from: w */
    private int f17244w;

    /* renamed from: x */
    private int f17245x;

    /* renamed from: y */
    private int f17246y;

    /* renamed from: z */
    private boolean f17247z;

    static {
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9776s("application/x-emsg");
        f17217G = e2Var.mo9782y();
    }

    public C2834s4(int i, e92 e92) {
        byte[] bArr = new byte[16];
        this.f17227f = bArr;
        this.f17228g = new y22(bArr);
        this.f17231j = new ArrayDeque();
        this.f17232k = new ArrayDeque();
        this.f17223b = new SparseArray();
        this.f17241t = -9223372036854775807L;
        this.f17240s = -9223372036854775807L;
        this.f17242u = -9223372036854775807L;
        this.f17218A = tn4.f18174k;
        this.f17219B = new C2792r[0];
        this.f17220C = new C2792r[0];
    }

    /* renamed from: a */
    private static int m20162a(int i) throws ea0 {
        if (i >= 0) {
            return i;
        }
        throw ea0.m11990a("Unexpected negative value: " + i, (Throwable) null);
    }

    /* renamed from: d */
    private static fl4 m20163d(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C2239c4 c4Var = (C2239c4) list.get(i);
            if (c4Var.f8046a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] h = c4Var.f7583b.mo15295h();
                UUID a = C3093z4.m24367a(h);
                if (a == null) {
                    ot1.m18060e("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new ek4(a, (String) null, "video/mp4", h));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new fl4((List) arrayList);
    }

    /* renamed from: e */
    private final void m20164e() {
        this.f17233l = 0;
        this.f17236o = 0;
    }

    /* renamed from: h */
    private static void m20165h(y22 y22, int i, C2314e5 e5Var) throws ea0 {
        y22.mo15293f(i + 8);
        int m = y22.mo15300m() & 16777215;
        if ((m & 1) == 0) {
            boolean z = (m & 2) != 0;
            int v = y22.mo15309v();
            if (v == 0) {
                Arrays.fill(e5Var.f8652l, 0, e5Var.f8645e, false);
                return;
            }
            int i2 = e5Var.f8645e;
            if (v == i2) {
                Arrays.fill(e5Var.f8652l, 0, v, z);
                e5Var.mo9802a(y22.mo15296i());
                y22 y222 = e5Var.f8654n;
                y22.mo15289b(y222.mo15295h(), 0, y222.mo15299l());
                e5Var.f8654n.mo15293f(0);
                e5Var.f8655o = false;
                return;
            }
            throw ea0.m11990a("Senc sample count " + v + " is different from fragment sample count" + i2, (Throwable) null);
        }
        throw ea0.m11992c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* renamed from: i */
    private final void m20166i(long j) throws ea0 {
        C2834s4 s4Var;
        int i;
        C2202b4 b4Var;
        int i2;
        SparseArray sparseArray;
        byte[] bArr;
        int i3;
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        C2314e5 e5Var;
        C2202b4 b4Var2;
        int i5;
        int i6;
        byte[] bArr4;
        C2202b4 b4Var3;
        int i7;
        int i8;
        List list;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j2;
        C2648n4 n4Var;
        int i19;
        int i20;
        int i21;
        int i22;
        C2834s4 s4Var2 = this;
        while (!s4Var2.f17231j.isEmpty() && ((C2202b4) s4Var2.f17231j.peek()).f7086b == j) {
            C2202b4 b4Var4 = (C2202b4) s4Var2.f17231j.pop();
            int i23 = b4Var4.f8046a;
            int i24 = 12;
            int i25 = 8;
            if (i23 == 1836019574) {
                fl4 d = m20163d(b4Var4.f7087c);
                C2202b4 c = b4Var4.mo8663c(1836475768);
                Objects.requireNonNull(c);
                SparseArray sparseArray2 = new SparseArray();
                int size = c.f7087c.size();
                long j3 = -9223372036854775807L;
                int i26 = 0;
                while (i26 < size) {
                    C2239c4 c4Var = (C2239c4) c.f7087c.get(i26);
                    int i27 = c4Var.f8046a;
                    if (i27 == 1953654136) {
                        y22 y22 = c4Var.f7583b;
                        y22.mo15293f(i24);
                        Pair create = Pair.create(Integer.valueOf(y22.mo15300m()), new C2648n4(y22.mo15300m() - 1, y22.mo15300m(), y22.mo15300m(), y22.mo15300m()));
                        sparseArray2.put(((Integer) create.first).intValue(), (C2648n4) create.second);
                    } else if (i27 == 1835362404) {
                        y22 y222 = c4Var.f7583b;
                        y222.mo15293f(8);
                        j3 = C2276d4.m11303a(y222.mo15300m()) == 0 ? y222.mo15280A() : y222.mo15281B();
                    }
                    i26++;
                    i24 = 12;
                }
                List c2 = C2611m4.m16388c(b4Var4, new fo4(), j3, d, false, false, new C2722p4(s4Var2));
                int size2 = c2.size();
                if (s4Var2.f17223b.size() == 0) {
                    for (int i28 = 0; i28 < size2; i28++) {
                        C2351f5 f5Var = (C2351f5) c2.get(i28);
                        C2240c5 c5Var = f5Var.f9114a;
                        s4Var2.f17223b.put(c5Var.f7590a, new C2797r4(s4Var2.f17218A.mo10060n(i28, c5Var.f7591b), f5Var, m20167j(sparseArray2, c5Var.f7590a)));
                        s4Var2.f17241t = Math.max(s4Var2.f17241t, c5Var.f7594e);
                    }
                    s4Var2.f17218A.mo10058C();
                } else {
                    v91.m22052f(s4Var2.f17223b.size() == size2);
                    for (int i29 = 0; i29 < size2; i29++) {
                        C2351f5 f5Var2 = (C2351f5) c2.get(i29);
                        C2240c5 c5Var2 = f5Var2.f9114a;
                        ((C2797r4) s4Var2.f17223b.get(c5Var2.f7590a)).mo13672h(f5Var2, m20167j(sparseArray2, c5Var2.f7590a));
                    }
                }
            } else {
                if (i23 == 1836019558) {
                    SparseArray sparseArray3 = s4Var2.f17223b;
                    byte[] bArr5 = s4Var2.f17227f;
                    int size3 = b4Var4.f7088d.size();
                    int i30 = 0;
                    while (i30 < size3) {
                        C2202b4 b4Var5 = (C2202b4) b4Var4.f7088d.get(i30);
                        if (b4Var5.f8046a == 1953653094) {
                            C2239c4 d2 = b4Var5.mo8664d(1952868452);
                            Objects.requireNonNull(d2);
                            y22 y223 = d2.f7583b;
                            y223.mo15293f(i25);
                            int m = y223.mo15300m() & 16777215;
                            C2797r4 r4Var = (C2797r4) sparseArray3.get(y223.mo15300m());
                            if (r4Var == null) {
                                r4Var = null;
                            } else {
                                if ((m & 1) != 0) {
                                    long B = y223.mo15281B();
                                    C2314e5 e5Var2 = r4Var.f16811b;
                                    e5Var2.f8642b = B;
                                    e5Var2.f8643c = B;
                                }
                                C2648n4 n4Var2 = r4Var.f16814e;
                                if ((m & 2) != 0) {
                                    i19 = y223.mo15300m() - 1;
                                } else {
                                    i19 = n4Var2.f13840a;
                                }
                                if ((m & 8) != 0) {
                                    i20 = y223.mo15300m();
                                } else {
                                    i20 = n4Var2.f13841b;
                                }
                                if ((m & 16) != 0) {
                                    i21 = y223.mo15300m();
                                } else {
                                    i21 = n4Var2.f13842c;
                                }
                                if ((m & 32) != 0) {
                                    i22 = y223.mo15300m();
                                } else {
                                    i22 = n4Var2.f13843d;
                                }
                                r4Var.f16811b.f8641a = new C2648n4(i19, i20, i21, i22);
                            }
                            if (r4Var != null) {
                                C2314e5 e5Var3 = r4Var.f16811b;
                                long j4 = e5Var3.f8656p;
                                boolean z2 = e5Var3.f8657q;
                                r4Var.mo13673i();
                                r4Var.f16821l = true;
                                C2239c4 d3 = b4Var5.mo8664d(1952867444);
                                if (d3 != null) {
                                    y22 y224 = d3.f7583b;
                                    y224.mo15293f(i25);
                                    e5Var3.f8656p = C2276d4.m11303a(y224.mo15300m()) == 1 ? y224.mo15281B() : y224.mo15280A();
                                    e5Var3.f8657q = true;
                                } else {
                                    e5Var3.f8656p = j4;
                                    e5Var3.f8657q = z2;
                                }
                                List list2 = b4Var5.f7087c;
                                int size4 = list2.size();
                                int i31 = 0;
                                int i32 = 0;
                                int i33 = 0;
                                while (true) {
                                    i3 = 1953658222;
                                    if (i31 >= size4) {
                                        break;
                                    }
                                    C2239c4 c4Var2 = (C2239c4) list2.get(i31);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (c4Var2.f8046a == 1953658222) {
                                        y22 y225 = c4Var2.f7583b;
                                        y225.mo15293f(12);
                                        int v = y225.mo15309v();
                                        if (v > 0) {
                                            i33 += v;
                                            i32++;
                                        }
                                    }
                                    i31++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                r4Var.f16817h = 0;
                                r4Var.f16816g = 0;
                                r4Var.f16815f = 0;
                                C2314e5 e5Var4 = r4Var.f16811b;
                                e5Var4.f8644d = i32;
                                e5Var4.f8645e = i33;
                                if (e5Var4.f8647g.length < i32) {
                                    e5Var4.f8646f = new long[i32];
                                    e5Var4.f8647g = new int[i32];
                                }
                                if (e5Var4.f8648h.length < i33) {
                                    int i34 = (i33 * 125) / 100;
                                    e5Var4.f8648h = new int[i34];
                                    e5Var4.f8649i = new long[i34];
                                    e5Var4.f8650j = new boolean[i34];
                                    e5Var4.f8652l = new boolean[i34];
                                }
                                int i35 = 0;
                                int i36 = 0;
                                int i37 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i35 >= size4) {
                                        break;
                                    }
                                    C2239c4 c4Var3 = (C2239c4) list2.get(i35);
                                    if (c4Var3.f8046a == i3) {
                                        y22 y226 = c4Var3.f7583b;
                                        y226.mo15293f(8);
                                        int m2 = y226.mo15300m() & 16777215;
                                        list = list2;
                                        C2240c5 c5Var3 = r4Var.f16813d.f9114a;
                                        i8 = size3;
                                        C2314e5 e5Var5 = r4Var.f16811b;
                                        i7 = size4;
                                        C2648n4 n4Var3 = e5Var5.f8641a;
                                        int i38 = gb2.f9812a;
                                        int i39 = i37 + 1;
                                        e5Var5.f8647g[i37] = y226.mo15309v();
                                        long[] jArr = e5Var5.f8646f;
                                        b4Var3 = b4Var4;
                                        bArr4 = bArr5;
                                        long j6 = e5Var5.f8642b;
                                        jArr[i37] = j6;
                                        if ((m2 & 1) != 0) {
                                            i6 = i35;
                                            jArr[i37] = j6 + ((long) y226.mo15300m());
                                        } else {
                                            i6 = i35;
                                        }
                                        int i40 = m2 & 4;
                                        int i41 = n4Var3.f13843d;
                                        if (i40 != 0) {
                                            i41 = y226.mo15300m();
                                        }
                                        int i42 = m2 & 256;
                                        int i43 = m2 & 512;
                                        int i44 = m2 & 1024;
                                        int i45 = m2 & 2048;
                                        int i46 = i41;
                                        long[] jArr2 = c5Var3.f7597h;
                                        if (jArr2 != null) {
                                            i5 = i30;
                                            b4Var2 = b4Var5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) gb2.m13171h(c5Var3.f7598i))[0];
                                            }
                                        } else {
                                            i5 = i30;
                                            b4Var2 = b4Var5;
                                        }
                                        int[] iArr = e5Var5.f8648h;
                                        long[] jArr3 = e5Var5.f8649i;
                                        boolean[] zArr = e5Var5.f8650j;
                                        e5Var = e5Var3;
                                        int i47 = e5Var5.f8647g[i37] + i36;
                                        boolean[] zArr2 = zArr;
                                        long j7 = c5Var3.f7592c;
                                        int i48 = i36;
                                        long[] jArr4 = jArr3;
                                        long j8 = e5Var5.f8656p;
                                        while (i48 < i47) {
                                            if (i42 != 0) {
                                                i9 = i42;
                                                i10 = y226.mo15300m();
                                            } else {
                                                i9 = i42;
                                                i10 = n4Var3.f13841b;
                                            }
                                            m20162a(i10);
                                            if (i43 != 0) {
                                                i11 = i43;
                                                i12 = y226.mo15300m();
                                            } else {
                                                i11 = i43;
                                                i12 = n4Var3.f13842c;
                                            }
                                            m20162a(i12);
                                            if (i44 != 0) {
                                                i13 = i40;
                                                i14 = y226.mo15300m();
                                            } else {
                                                i13 = i40;
                                                if (i48 == 0) {
                                                    if (i40 != 0) {
                                                        i14 = i46;
                                                        i48 = 0;
                                                    } else {
                                                        i48 = 0;
                                                    }
                                                }
                                                i14 = n4Var3.f13843d;
                                            }
                                            if (i45 != 0) {
                                                i17 = i47;
                                                i16 = i44;
                                                i15 = i45;
                                                i18 = y226.mo15300m();
                                            } else {
                                                i17 = i47;
                                                i16 = i44;
                                                i15 = i45;
                                                i18 = 0;
                                            }
                                            long g0 = gb2.m13170g0((((long) i18) + j8) - j5, 1000000, j7);
                                            jArr4[i48] = g0;
                                            if (!e5Var5.f8657q) {
                                                n4Var = n4Var3;
                                                j2 = j7;
                                                jArr4[i48] = g0 + r4Var.f16813d.f9121h;
                                            } else {
                                                n4Var = n4Var3;
                                                j2 = j7;
                                            }
                                            iArr[i48] = i12;
                                            zArr2[i48] = 1 == (((i14 >> 16) & 1) ^ 1);
                                            j8 += (long) i10;
                                            i48++;
                                            n4Var3 = n4Var;
                                            j7 = j2;
                                            i42 = i9;
                                            i43 = i11;
                                            i40 = i13;
                                            i47 = i17;
                                            i44 = i16;
                                            i45 = i15;
                                        }
                                        e5Var5.f8656p = j8;
                                        i37 = i39;
                                        i36 = i47;
                                    } else {
                                        i6 = i35;
                                        b4Var3 = b4Var4;
                                        bArr4 = bArr5;
                                        e5Var = e5Var3;
                                        list = list2;
                                        i8 = size3;
                                        int i49 = i36;
                                        i5 = i30;
                                        i7 = size4;
                                        b4Var2 = b4Var5;
                                    }
                                    i35 = i6 + 1;
                                    list2 = list;
                                    size3 = i8;
                                    size4 = i7;
                                    b4Var4 = b4Var3;
                                    bArr5 = bArr4;
                                    i30 = i5;
                                    b4Var5 = b4Var2;
                                    e5Var3 = e5Var;
                                    i3 = 1953658222;
                                }
                                b4Var = b4Var4;
                                byte[] bArr6 = bArr5;
                                i2 = size3;
                                i = i30;
                                C2240c5 c5Var4 = r4Var.f16813d.f9114a;
                                C2314e5 e5Var6 = e5Var3;
                                C2648n4 n4Var4 = e5Var6.f8641a;
                                Objects.requireNonNull(n4Var4);
                                C2277d5 a = c5Var4.mo9019a(n4Var4.f13840a);
                                C2202b4 b4Var6 = b4Var5;
                                C2239c4 d4 = b4Var6.mo8664d(1935763834);
                                if (d4 != null) {
                                    Objects.requireNonNull(a);
                                    y22 y227 = d4.f7583b;
                                    int i50 = a.f8060d;
                                    y227.mo15293f(8);
                                    if ((y227.mo15300m() & 1) == 1) {
                                        y227.mo15294g(8);
                                    }
                                    int s = y227.mo15306s();
                                    int v2 = y227.mo15309v();
                                    int i51 = e5Var6.f8645e;
                                    if (v2 <= i51) {
                                        if (s == 0) {
                                            boolean[] zArr3 = e5Var6.f8652l;
                                            i4 = 0;
                                            for (int i52 = 0; i52 < v2; i52++) {
                                                int s2 = y227.mo15306s();
                                                i4 += s2;
                                                zArr3[i52] = s2 > i50;
                                            }
                                            z = false;
                                        } else {
                                            boolean z3 = s > i50;
                                            i4 = s * v2;
                                            z = false;
                                            Arrays.fill(e5Var6.f8652l, 0, v2, z3);
                                        }
                                        Arrays.fill(e5Var6.f8652l, v2, e5Var6.f8645e, z);
                                        if (i4 > 0) {
                                            e5Var6.mo9802a(i4);
                                        }
                                    } else {
                                        throw ea0.m11990a("Saiz sample count " + v2 + " is greater than fragment sample count" + i51, (Throwable) null);
                                    }
                                }
                                C2239c4 d5 = b4Var6.mo8664d(1935763823);
                                if (d5 != null) {
                                    y22 y228 = d5.f7583b;
                                    y228.mo15293f(8);
                                    int m3 = y228.mo15300m();
                                    if ((m3 & 1) == 1) {
                                        y228.mo15294g(8);
                                    }
                                    int v3 = y228.mo15309v();
                                    if (v3 == 1) {
                                        e5Var6.f8643c += C2276d4.m11303a(m3) == 0 ? y228.mo15280A() : y228.mo15281B();
                                    } else {
                                        throw ea0.m11990a("Unexpected saio entry count: " + v3, (Throwable) null);
                                    }
                                }
                                C2239c4 d6 = b4Var6.mo8664d(1936027235);
                                if (d6 != null) {
                                    m20165h(d6.f7583b, 0, e5Var6);
                                }
                                String str = a != null ? a.f8058b : null;
                                y22 y229 = null;
                                y22 y2210 = null;
                                for (int i53 = 0; i53 < b4Var6.f7087c.size(); i53++) {
                                    C2239c4 c4Var4 = (C2239c4) b4Var6.f7087c.get(i53);
                                    y22 y2211 = c4Var4.f7583b;
                                    int i54 = c4Var4.f8046a;
                                    if (i54 == 1935828848) {
                                        y2211.mo15293f(12);
                                        if (y2211.mo15300m() == 1936025959) {
                                            y229 = y2211;
                                        }
                                    } else if (i54 == 1936158820) {
                                        y2211.mo15293f(12);
                                        if (y2211.mo15300m() == 1936025959) {
                                            y2210 = y2211;
                                        }
                                    }
                                }
                                if (y229 != null && y2210 != null) {
                                    y229.mo15293f(8);
                                    int m4 = y229.mo15300m();
                                    y229.mo15294g(4);
                                    if (C2276d4.m11303a(m4) == 1) {
                                        y229.mo15294g(4);
                                    }
                                    if (y229.mo15300m() == 1) {
                                        y2210.mo15293f(8);
                                        int a2 = C2276d4.m11303a(y2210.mo15300m());
                                        y2210.mo15294g(4);
                                        if (a2 == 1) {
                                            if (y2210.mo15280A() == 0) {
                                                throw ea0.m11992c("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (a2 >= 2) {
                                            y2210.mo15294g(4);
                                        }
                                        if (y2210.mo15280A() == 1) {
                                            y2210.mo15294g(1);
                                            int s3 = y2210.mo15306s();
                                            int i55 = (s3 & 240) >> 4;
                                            int i56 = s3 & 15;
                                            if (y2210.mo15306s() == 1) {
                                                int s4 = y2210.mo15306s();
                                                byte[] bArr7 = new byte[16];
                                                y2210.mo15289b(bArr7, 0, 16);
                                                if (s4 == 0) {
                                                    int s5 = y2210.mo15306s();
                                                    byte[] bArr8 = new byte[s5];
                                                    y2210.mo15289b(bArr8, 0, s5);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                e5Var6.f8651k = true;
                                                e5Var6.f8653m = new C2277d5(true, str, s4, bArr7, i55, i56, bArr3);
                                            }
                                        } else {
                                            throw ea0.m11992c("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw ea0.m11992c("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = b4Var6.f7087c.size();
                                int i57 = 0;
                                while (i57 < size5) {
                                    C2239c4 c4Var5 = (C2239c4) b4Var6.f7087c.get(i57);
                                    if (c4Var5.f8046a == 1970628964) {
                                        y22 y2212 = c4Var5.f7583b;
                                        y2212.mo15293f(8);
                                        bArr2 = bArr6;
                                        y2212.mo15289b(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, f17216F)) {
                                            m20165h(y2212, 16, e5Var6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i57++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i2;
                                b4Var4 = b4Var;
                                i25 = 8;
                                i30 = i + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        b4Var = b4Var4;
                        i2 = size3;
                        i = i30;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i2;
                        b4Var4 = b4Var;
                        i25 = 8;
                        i30 = i + 1;
                        sparseArray3 = sparseArray;
                    }
                    fl4 d7 = m20163d(b4Var4.f7087c);
                    s4Var = this;
                    if (d7 != null) {
                        int size6 = s4Var.f17223b.size();
                        for (int i58 = 0; i58 < size6; i58++) {
                            C2797r4 r4Var2 = (C2797r4) s4Var.f17223b.valueAt(i58);
                            C2240c5 c5Var5 = r4Var2.f16813d.f9114a;
                            C2648n4 n4Var5 = r4Var2.f16811b.f8641a;
                            int i59 = gb2.f9812a;
                            C2277d5 a3 = c5Var5.mo9019a(n4Var5.f13840a);
                            fl4 b = d7.mo10183b(a3 != null ? a3.f8058b : null);
                            C2311e2 b2 = r4Var2.f16813d.f9114a.f7595f.mo10384b();
                            b2.mo9753b(b);
                            r4Var2.f16810a.mo8823e(b2.mo9782y());
                        }
                    }
                    if (s4Var.f17240s != -9223372036854775807L) {
                        int size7 = s4Var.f17223b.size();
                        for (int i60 = 0; i60 < size7; i60++) {
                            C2797r4 r4Var3 = (C2797r4) s4Var.f17223b.valueAt(i60);
                            long j9 = s4Var.f17240s;
                            int i61 = r4Var3.f16815f;
                            while (true) {
                                C2314e5 e5Var7 = r4Var3.f16811b;
                                if (i61 >= e5Var7.f8645e || e5Var7.f8649i[i61] >= j9) {
                                } else {
                                    if (e5Var7.f8650j[i61]) {
                                        r4Var3.f16818i = i61;
                                    }
                                    i61++;
                                }
                            }
                        }
                        s4Var.f17240s = -9223372036854775807L;
                    }
                } else {
                    s4Var = s4Var2;
                    C2202b4 b4Var7 = b4Var4;
                    if (!s4Var.f17231j.isEmpty()) {
                        ((C2202b4) s4Var.f17231j.peek()).mo8665e(b4Var7);
                    }
                }
                s4Var2 = s4Var;
            }
        }
        C2834s4 s4Var3 = s4Var2;
        m20164e();
    }

    /* renamed from: j */
    private static final C2648n4 m20167j(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (C2648n4) sparseArray.valueAt(0);
        }
        C2648n4 n4Var = (C2648n4) sparseArray.get(i);
        Objects.requireNonNull(n4Var);
        return n4Var;
    }

    /* renamed from: b */
    public final boolean mo9023b(rn4 rn4) throws IOException {
        return C2203b5.m10195a(rn4);
    }

    /* renamed from: c */
    public final void mo9024c(tn4 tn4) {
        this.f17218A = tn4;
        m20164e();
        C2792r[] rVarArr = new C2792r[2];
        this.f17219B = rVarArr;
        int i = 0;
        C2792r[] rVarArr2 = (C2792r[]) gb2.m13136F(rVarArr, 0);
        this.f17219B = rVarArr2;
        for (C2792r e : rVarArr2) {
            e.mo8823e(f17217G);
        }
        this.f17220C = new C2792r[this.f17222a.size()];
        int i2 = 100;
        while (i < this.f17220C.length) {
            int i3 = i2 + 1;
            C2792r n = this.f17218A.mo10060n(i2, 3);
            n.mo8823e((C2388g4) this.f17222a.get(i));
            this.f17220C[i] = n;
            i++;
            i2 = i3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.google.android.gms.internal.ads.r4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v73, resolved type: com.google.android.gms.internal.ads.r4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo9025f(com.google.android.gms.internal.ads.rn4 r34, com.google.android.gms.internal.ads.C2532k r35) throws java.io.IOException {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
        L_0x0004:
            int r2 = r0.f17233l
            r3 = 1701671783(0x656d7367, float:7.0083103E22)
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            r5 = 2
            r7 = 0
            r8 = 1
            r9 = 0
            if (r2 == 0) goto L_0x053b
            java.lang.String r10 = "FragmentedMp4Extractor"
            if (r2 == r8) goto L_0x02fb
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 3
            if (r2 == r5) goto L_0x029b
            com.google.android.gms.internal.ads.r4 r2 = r0.f17243v
            if (r2 != 0) goto L_0x0099
            android.util.SparseArray r2 = r0.f17223b
            int r13 = r2.size()
            r14 = r3
            r3 = r7
            r4 = 0
        L_0x002b:
            if (r4 >= r13) goto L_0x0061
            java.lang.Object r16 = r2.valueAt(r4)
            r5 = r16
            com.google.android.gms.internal.ads.r4 r5 = (com.google.android.gms.internal.ads.C2797r4) r5
            boolean r16 = r5.f16821l
            if (r16 != 0) goto L_0x0043
            int r11 = r5.f16815f
            com.google.android.gms.internal.ads.f5 r6 = r5.f16813d
            int r6 = r6.f9115b
            if (r11 == r6) goto L_0x005d
        L_0x0043:
            boolean r6 = r5.f16821l
            if (r6 == 0) goto L_0x0052
            int r6 = r5.f16817h
            com.google.android.gms.internal.ads.e5 r11 = r5.f16811b
            int r11 = r11.f8644d
            if (r6 != r11) goto L_0x0052
            goto L_0x005d
        L_0x0052:
            long r18 = r5.mo13669d()
            int r6 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x005d
            r3 = r5
            r14 = r18
        L_0x005d:
            int r4 = r4 + 1
            r5 = 2
            goto L_0x002b
        L_0x0061:
            if (r3 != 0) goto L_0x007e
            long r2 = r0.f17238q
            long r4 = r34.mo9003T()
            long r2 = r2 - r4
            int r3 = (int) r2
            if (r3 < 0) goto L_0x0077
            r2 = r1
            com.google.android.gms.internal.ads.fn4 r2 = (com.google.android.gms.internal.ads.fn4) r2
            r2.mo10218n(r3, r9)
            r33.m20164e()
            goto L_0x0004
        L_0x0077:
            java.lang.String r1 = "Offset to end of mdat was negative."
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r7)
            throw r1
        L_0x007e:
            long r4 = r3.mo13669d()
            long r13 = r34.mo9003T()
            long r4 = r4 - r13
            int r2 = (int) r4
            if (r2 >= 0) goto L_0x0090
            java.lang.String r2 = "Ignoring negative offset to sample data."
            com.google.android.gms.internal.ads.ot1.m18060e(r10, r2)
            r2 = 0
        L_0x0090:
            r4 = r1
            com.google.android.gms.internal.ads.fn4 r4 = (com.google.android.gms.internal.ads.fn4) r4
            r4.mo10218n(r2, r9)
            r0.f17243v = r3
            r2 = r3
        L_0x0099:
            int r3 = r0.f17233l
            r4 = 6
            if (r3 != r12) goto L_0x0134
            int r3 = r2.mo13667b()
            r0.f17244w = r3
            int r5 = r2.f16815f
            int r6 = r2.f16818i
            if (r5 >= r6) goto L_0x00e1
            com.google.android.gms.internal.ads.fn4 r1 = (com.google.android.gms.internal.ads.fn4) r1
            r1.mo10218n(r3, r9)
            com.google.android.gms.internal.ads.d5 r1 = r2.mo13671f()
            if (r1 != 0) goto L_0x00b6
            goto L_0x00d4
        L_0x00b6:
            com.google.android.gms.internal.ads.e5 r3 = r2.f16811b
            com.google.android.gms.internal.ads.y22 r3 = r3.f8654n
            int r1 = r1.f8060d
            if (r1 == 0) goto L_0x00c1
            r3.mo15294g(r1)
        L_0x00c1:
            com.google.android.gms.internal.ads.e5 r1 = r2.f16811b
            int r5 = r2.f16815f
            boolean r1 = r1.mo9803b(r5)
            if (r1 == 0) goto L_0x00d4
            int r1 = r3.mo15310w()
            int r1 = r1 * 6
            r3.mo15294g(r1)
        L_0x00d4:
            boolean r1 = r2.mo13674k()
            if (r1 != 0) goto L_0x00dc
            r0.f17243v = r7
        L_0x00dc:
            r0.f17233l = r12
        L_0x00de:
            r1 = 0
            goto L_0x029a
        L_0x00e1:
            com.google.android.gms.internal.ads.f5 r5 = r2.f16813d
            com.google.android.gms.internal.ads.c5 r5 = r5.f9114a
            int r5 = r5.f7596g
            if (r5 != r8) goto L_0x00f5
            int r3 = r3 + -8
            r0.f17244w = r3
            r3 = r1
            com.google.android.gms.internal.ads.fn4 r3 = (com.google.android.gms.internal.ads.fn4) r3
            r5 = 8
            r3.mo10218n(r5, r9)
        L_0x00f5:
            com.google.android.gms.internal.ads.f5 r3 = r2.f16813d
            com.google.android.gms.internal.ads.c5 r3 = r3.f9114a
            com.google.android.gms.internal.ads.g4 r3 = r3.f7595f
            java.lang.String r3 = r3.f9673l
            java.lang.String r5 = "audio/ac4"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0122
            int r3 = r0.f17244w
            r5 = 7
            int r3 = r2.mo13668c(r3, r5)
            r0.f17245x = r3
            int r3 = r0.f17244w
            com.google.android.gms.internal.ads.y22 r6 = r0.f17228g
            com.google.android.gms.internal.ads.tm4.m21087b(r3, r6)
            com.google.android.gms.internal.ads.r r3 = r2.f16810a
            com.google.android.gms.internal.ads.y22 r6 = r0.f17228g
            r3.mo8821c(r6, r5)
            int r3 = r0.f17245x
            int r3 = r3 + r5
            r0.f17245x = r3
            goto L_0x012a
        L_0x0122:
            int r3 = r0.f17244w
            int r3 = r2.mo13668c(r3, r9)
            r0.f17245x = r3
        L_0x012a:
            int r5 = r0.f17244w
            int r5 = r5 + r3
            r0.f17244w = r5
            r3 = 4
            r0.f17233l = r3
            r0.f17246y = r9
        L_0x0134:
            com.google.android.gms.internal.ads.f5 r3 = r2.f16813d
            com.google.android.gms.internal.ads.c5 r3 = r3.f9114a
            com.google.android.gms.internal.ads.r r5 = r2.f16810a
            long r10 = r2.mo13670e()
            int r6 = r3.f7599j
            if (r6 != 0) goto L_0x0153
        L_0x0142:
            int r3 = r0.f17245x
            int r4 = r0.f17244w
            if (r3 >= r4) goto L_0x0237
            int r4 = r4 - r3
            int r3 = r5.mo8819a(r1, r4, r9)
            int r4 = r0.f17245x
            int r4 = r4 + r3
            r0.f17245x = r4
            goto L_0x0142
        L_0x0153:
            com.google.android.gms.internal.ads.y22 r13 = r0.f17225d
            byte[] r13 = r13.mo15295h()
            r13[r9] = r9
            r13[r8] = r9
            r14 = 2
            r13[r14] = r9
            int r14 = r6 + 1
            r15 = 4
            int r6 = 4 - r6
        L_0x0165:
            int r15 = r0.f17245x
            int r12 = r0.f17244w
            if (r15 >= r12) goto L_0x0237
            int r12 = r0.f17246y
            java.lang.String r15 = "video/hevc"
            if (r12 != 0) goto L_0x01d8
            r12 = r1
            com.google.android.gms.internal.ads.fn4 r12 = (com.google.android.gms.internal.ads.fn4) r12
            r12.mo9984g(r13, r6, r14, r9)
            com.google.android.gms.internal.ads.y22 r12 = r0.f17225d
            r12.mo15293f(r9)
            com.google.android.gms.internal.ads.y22 r12 = r0.f17225d
            int r12 = r12.mo15300m()
            if (r12 <= 0) goto L_0x01d1
            int r12 = r12 + -1
            r0.f17246y = r12
            com.google.android.gms.internal.ads.y22 r12 = r0.f17224c
            r12.mo15293f(r9)
            com.google.android.gms.internal.ads.y22 r12 = r0.f17224c
            r9 = 4
            r5.mo8821c(r12, r9)
            com.google.android.gms.internal.ads.y22 r12 = r0.f17225d
            r5.mo8821c(r12, r8)
            com.google.android.gms.internal.ads.r[] r12 = r0.f17220C
            int r12 = r12.length
            if (r12 <= 0) goto L_0x01c2
            com.google.android.gms.internal.ads.g4 r12 = r3.f7595f
            java.lang.String r12 = r12.f9673l
            byte r17 = r13[r9]
            byte[] r9 = com.google.android.gms.internal.ads.C2420h.f10130a
            java.lang.String r9 = "video/avc"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x01b4
            r9 = r17 & 31
            if (r9 == r4) goto L_0x01b2
            goto L_0x01b4
        L_0x01b2:
            r9 = 1
            goto L_0x01c3
        L_0x01b4:
            boolean r9 = r15.equals(r12)
            if (r9 == 0) goto L_0x01c2
            r9 = r17 & 126(0x7e, float:1.77E-43)
            int r9 = r9 >> r8
            r12 = 39
            if (r9 != r12) goto L_0x01c2
            goto L_0x01b2
        L_0x01c2:
            r9 = 0
        L_0x01c3:
            r0.f17247z = r9
            int r9 = r0.f17245x
            int r9 = r9 + 5
            r0.f17245x = r9
            int r9 = r0.f17244w
            int r9 = r9 + r6
            r0.f17244w = r9
            goto L_0x0233
        L_0x01d1:
            java.lang.String r1 = "Invalid NAL length"
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r7)
            throw r1
        L_0x01d8:
            boolean r9 = r0.f17247z
            if (r9 == 0) goto L_0x0221
            com.google.android.gms.internal.ads.y22 r9 = r0.f17226e
            r9.mo15290c(r12)
            com.google.android.gms.internal.ads.y22 r9 = r0.f17226e
            byte[] r9 = r9.mo15295h()
            int r12 = r0.f17246y
            r4 = r1
            com.google.android.gms.internal.ads.fn4 r4 = (com.google.android.gms.internal.ads.fn4) r4
            r8 = 0
            r4.mo9984g(r9, r8, r12, r8)
            com.google.android.gms.internal.ads.y22 r4 = r0.f17226e
            int r8 = r0.f17246y
            r5.mo8821c(r4, r8)
            int r4 = r0.f17246y
            com.google.android.gms.internal.ads.y22 r8 = r0.f17226e
            byte[] r9 = r8.mo15295h()
            int r8 = r8.mo15299l()
            int r8 = com.google.android.gms.internal.ads.C2420h.m13647b(r9, r8)
            com.google.android.gms.internal.ads.y22 r9 = r0.f17226e
            com.google.android.gms.internal.ads.g4 r12 = r3.f7595f
            java.lang.String r12 = r12.f9673l
            boolean r12 = r15.equals(r12)
            r9.mo15293f(r12)
            com.google.android.gms.internal.ads.y22 r9 = r0.f17226e
            r9.mo15292e(r8)
            com.google.android.gms.internal.ads.y22 r8 = r0.f17226e
            com.google.android.gms.internal.ads.r[] r9 = r0.f17220C
            com.google.android.gms.internal.ads.cn4.m11017a(r10, r8, r9)
            goto L_0x0227
        L_0x0221:
            r4 = 0
            int r8 = r5.mo8819a(r1, r12, r4)
            r4 = r8
        L_0x0227:
            int r8 = r0.f17245x
            int r8 = r8 + r4
            r0.f17245x = r8
            int r8 = r0.f17246y
            int r8 = r8 - r4
            r0.f17246y = r8
            r4 = 6
            r8 = 1
        L_0x0233:
            r9 = 0
            r12 = 3
            goto L_0x0165
        L_0x0237:
            int r20 = r2.mo13666a()
            com.google.android.gms.internal.ads.d5 r1 = r2.mo13671f()
            if (r1 == 0) goto L_0x0246
            com.google.android.gms.internal.ads.q r1 = r1.f8059c
            r23 = r1
            goto L_0x0248
        L_0x0246:
            r23 = r7
        L_0x0248:
            int r1 = r0.f17244w
            r22 = 0
            r17 = r5
            r18 = r10
            r21 = r1
            r17.mo8824f(r18, r20, r21, r22, r23)
        L_0x0255:
            java.util.ArrayDeque r1 = r0.f17232k
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x028d
            java.util.ArrayDeque r1 = r0.f17232k
            java.lang.Object r1 = r1.removeFirst()
            com.google.android.gms.internal.ads.q4 r1 = (com.google.android.gms.internal.ads.C2760q4) r1
            int r3 = r0.f17239r
            int r4 = r1.f16172c
            int r3 = r3 - r4
            r0.f17239r = r3
            long r3 = r1.f16170a
            boolean r5 = r1.f16171b
            if (r5 == 0) goto L_0x0273
            long r3 = r3 + r10
        L_0x0273:
            com.google.android.gms.internal.ads.r[] r5 = r0.f17219B
            int r6 = r5.length
            r8 = 0
        L_0x0277:
            if (r8 >= r6) goto L_0x0255
            r12 = r5[r8]
            r15 = 1
            int r9 = r1.f16172c
            int r13 = r0.f17239r
            r18 = 0
            r17 = r13
            r13 = r3
            r16 = r9
            r12.mo8824f(r13, r15, r16, r17, r18)
            int r8 = r8 + 1
            goto L_0x0277
        L_0x028d:
            boolean r1 = r2.mo13674k()
            if (r1 != 0) goto L_0x0295
            r0.f17243v = r7
        L_0x0295:
            r1 = 3
            r0.f17233l = r1
            goto L_0x00de
        L_0x029a:
            return r1
        L_0x029b:
            android.util.SparseArray r2 = r0.f17223b
            int r2 = r2.size()
            r6 = r7
            r5 = 0
        L_0x02a3:
            if (r5 >= r2) goto L_0x02c6
            android.util.SparseArray r8 = r0.f17223b
            java.lang.Object r8 = r8.valueAt(r5)
            com.google.android.gms.internal.ads.r4 r8 = (com.google.android.gms.internal.ads.C2797r4) r8
            com.google.android.gms.internal.ads.e5 r8 = r8.f16811b
            boolean r9 = r8.f8655o
            if (r9 == 0) goto L_0x02c3
            long r8 = r8.f8643c
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x02c3
            android.util.SparseArray r3 = r0.f17223b
            java.lang.Object r3 = r3.valueAt(r5)
            r6 = r3
            com.google.android.gms.internal.ads.r4 r6 = (com.google.android.gms.internal.ads.C2797r4) r6
            r3 = r8
        L_0x02c3:
            int r5 = r5 + 1
            goto L_0x02a3
        L_0x02c6:
            if (r6 != 0) goto L_0x02cd
            r2 = 3
            r0.f17233l = r2
            goto L_0x0004
        L_0x02cd:
            long r8 = r34.mo9003T()
            long r3 = r3 - r8
            int r2 = (int) r3
            if (r2 < 0) goto L_0x02f4
            r3 = r1
            com.google.android.gms.internal.ads.fn4 r3 = (com.google.android.gms.internal.ads.fn4) r3
            r4 = 0
            r3.mo10218n(r2, r4)
            com.google.android.gms.internal.ads.e5 r2 = r6.f16811b
            com.google.android.gms.internal.ads.y22 r5 = r2.f8654n
            byte[] r6 = r5.mo15295h()
            int r5 = r5.mo15299l()
            r3.mo9984g(r6, r4, r5, r4)
            com.google.android.gms.internal.ads.y22 r3 = r2.f8654n
            r3.mo15293f(r4)
            r2.f8655o = r4
            goto L_0x0004
        L_0x02f4:
            java.lang.String r1 = "Offset to encryption data was negative."
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r7)
            throw r1
        L_0x02fb:
            long r5 = r0.f17235n
            int r2 = (int) r5
            int r5 = r0.f17236o
            int r2 = r2 - r5
            com.google.android.gms.internal.ads.y22 r5 = r0.f17237p
            if (r5 == 0) goto L_0x052b
            byte[] r6 = r5.mo15295h()
            r8 = r1
            com.google.android.gms.internal.ads.fn4 r8 = (com.google.android.gms.internal.ads.fn4) r8
            r9 = 8
            r11 = 0
            r8.mo9984g(r6, r9, r2, r11)
            com.google.android.gms.internal.ads.c4 r2 = new com.google.android.gms.internal.ads.c4
            int r6 = r0.f17234m
            r2.<init>(r6, r5)
            long r5 = r34.mo9003T()
            java.util.ArrayDeque r8 = r0.f17231j
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0332
            java.util.ArrayDeque r3 = r0.f17231j
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.b4 r3 = (com.google.android.gms.internal.ads.C2202b4) r3
            r3.mo8666f(r2)
            goto L_0x0532
        L_0x0332:
            int r8 = r2.f8046a
            if (r8 != r4) goto L_0x03fc
            com.google.android.gms.internal.ads.y22 r2 = r2.f7583b
            r3 = 8
            r2.mo15293f(r3)
            int r3 = r2.mo15300m()
            r4 = 4
            r2.mo15294g(r4)
            long r14 = r2.mo15280A()
            int r3 = com.google.android.gms.internal.ads.C2276d4.m11303a(r3)
            if (r3 != 0) goto L_0x0358
            long r3 = r2.mo15280A()
            long r8 = r2.mo15280A()
            goto L_0x0360
        L_0x0358:
            long r3 = r2.mo15281B()
            long r8 = r2.mo15281B()
        L_0x0360:
            long r5 = r5 + r8
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r8 = r3
            r12 = r14
            long r19 = com.google.android.gms.internal.ads.gb2.m13170g0(r8, r10, r12)
            r8 = 2
            r2.mo15294g(r8)
            int r12 = r2.mo15310w()
            int[] r13 = new int[r12]
            long[] r10 = new long[r12]
            long[] r11 = new long[r12]
            long[] r8 = new long[r12]
            r21 = r19
            r9 = 0
        L_0x037d:
            if (r9 >= r12) goto L_0x03d3
            int r17 = r2.mo15300m()
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = r17 & r23
            if (r23 != 0) goto L_0x03cb
            long r23 = r2.mo15280A()
            r25 = 2147483647(0x7fffffff, float:NaN)
            r17 = r17 & r25
            r13[r9] = r17
            r10[r9] = r5
            r8[r9] = r21
            long r3 = r3 + r23
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r7 = r8
            r24 = r9
            r8 = r3
            r25 = r3
            r3 = r10
            r4 = r11
            r10 = r21
            r17 = r12
            r1 = r13
            r12 = r14
            long r21 = com.google.android.gms.internal.ads.gb2.m13170g0(r8, r10, r12)
            r8 = r7[r24]
            long r8 = r21 - r8
            r4[r24] = r8
            r8 = 4
            r2.mo15294g(r8)
            r9 = r1[r24]
            long r9 = (long) r9
            long r5 = r5 + r9
            int r9 = r24 + 1
            r13 = r1
            r10 = r3
            r11 = r4
            r8 = r7
            r12 = r17
            r3 = r25
            r7 = 0
            r1 = r34
            goto L_0x037d
        L_0x03cb:
            java.lang.String r1 = "Unhandled indirect reference"
            r2 = 0
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11990a(r1, r2)
            throw r1
        L_0x03d3:
            r7 = r8
            r3 = r10
            r4 = r11
            r1 = r13
            java.lang.Long r2 = java.lang.Long.valueOf(r19)
            com.google.android.gms.internal.ads.dn4 r5 = new com.google.android.gms.internal.ads.dn4
            r5.<init>(r1, r3, r4, r7)
            android.util.Pair r1 = android.util.Pair.create(r2, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f17242u = r2
            com.google.android.gms.internal.ads.tn4 r2 = r0.f17218A
            java.lang.Object r1 = r1.second
            com.google.android.gms.internal.ads.n r1 = (com.google.android.gms.internal.ads.C2643n) r1
            r2.mo10059j(r1)
            r1 = 1
            r0.f17221D = r1
            goto L_0x0528
        L_0x03fc:
            if (r8 != r3) goto L_0x0528
            com.google.android.gms.internal.ads.y22 r1 = r2.f7583b
            com.google.android.gms.internal.ads.r[] r2 = r0.f17219B
            int r2 = r2.length
            if (r2 == 0) goto L_0x0528
            r2 = 8
            r1.mo15293f(r2)
            int r2 = r1.mo15300m()
            int r2 = com.google.android.gms.internal.ads.C2276d4.m11303a(r2)
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x046a
            r5 = 1
            if (r2 == r5) goto L_0x0432
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Skipping unsupported emsg version: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.internal.ads.ot1.m18060e(r10, r1)
            goto L_0x0528
        L_0x0432:
            long r5 = r1.mo15280A()
            long r11 = r1.mo15281B()
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r15 = r5
            long r7 = com.google.android.gms.internal.ads.gb2.m13170g0(r11, r13, r15)
            long r11 = r1.mo15280A()
            r13 = 1000(0x3e8, double:4.94E-321)
            long r5 = com.google.android.gms.internal.ads.gb2.m13170g0(r11, r13, r15)
            long r9 = r1.mo15280A()
            r2 = 0
            java.lang.String r11 = r1.mo15283D(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.mo15283D(r2)
            java.util.Objects.requireNonNull(r12)
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r3
            r12 = r7
            goto L_0x04af
        L_0x046a:
            r2 = 0
            java.lang.String r11 = r1.mo15283D(r2)
            java.util.Objects.requireNonNull(r11)
            java.lang.String r12 = r1.mo15283D(r2)
            java.util.Objects.requireNonNull(r12)
            long r13 = r1.mo15280A()
            long r5 = r1.mo15280A()
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = r13
            long r15 = com.google.android.gms.internal.ads.gb2.m13170g0(r5, r7, r9)
            long r5 = r0.f17242u
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0493
            long r5 = r5 + r15
            r19 = r5
            goto L_0x0495
        L_0x0493:
            r19 = r3
        L_0x0495:
            long r5 = r1.mo15280A()
            r7 = 1000(0x3e8, double:4.94E-321)
            r9 = r13
            long r5 = com.google.android.gms.internal.ads.gb2.m13170g0(r5, r7, r9)
            long r9 = r1.mo15280A()
            r28 = r5
            r30 = r9
            r26 = r11
            r27 = r12
            r5 = r15
            r12 = r19
        L_0x04af:
            int r2 = r1.mo15296i()
            byte[] r2 = new byte[r2]
            int r7 = r1.mo15296i()
            r8 = 0
            r1.mo15289b(r2, r8, r7)
            com.google.android.gms.internal.ads.j1 r1 = new com.google.android.gms.internal.ads.j1
            r25 = r1
            r32 = r2
            r25.<init>(r26, r27, r28, r30, r32)
            com.google.android.gms.internal.ads.y22 r2 = new com.google.android.gms.internal.ads.y22
            com.google.android.gms.internal.ads.k1 r7 = r0.f17229h
            byte[] r1 = r7.mo11553a(r1)
            r2.<init>((byte[]) r1)
            int r1 = r2.mo15296i()
            com.google.android.gms.internal.ads.r[] r7 = r0.f17219B
            int r8 = r7.length
            r9 = 0
        L_0x04d9:
            if (r9 >= r8) goto L_0x04e7
            r10 = r7[r9]
            r11 = 0
            r2.mo15293f(r11)
            r10.mo8821c(r2, r1)
            int r9 = r9 + 1
            goto L_0x04d9
        L_0x04e7:
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x04fc
            java.util.ArrayDeque r2 = r0.f17232k
            com.google.android.gms.internal.ads.q4 r3 = new com.google.android.gms.internal.ads.q4
            r4 = 1
            r3.<init>(r5, r4, r1)
            r2.addLast(r3)
            int r2 = r0.f17239r
            int r2 = r2 + r1
            r0.f17239r = r2
            goto L_0x0528
        L_0x04fc:
            java.util.ArrayDeque r2 = r0.f17232k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0515
            java.util.ArrayDeque r2 = r0.f17232k
            com.google.android.gms.internal.ads.q4 r3 = new com.google.android.gms.internal.ads.q4
            r4 = 0
            r3.<init>(r12, r4, r1)
            r2.addLast(r3)
            int r2 = r0.f17239r
            int r2 = r2 + r1
            r0.f17239r = r2
            goto L_0x0528
        L_0x0515:
            com.google.android.gms.internal.ads.r[] r2 = r0.f17219B
            int r3 = r2.length
            r4 = 0
        L_0x0519:
            if (r4 >= r3) goto L_0x0528
            r5 = r2[r4]
            r8 = 1
            r10 = 0
            r11 = 0
            r6 = r12
            r9 = r1
            r5.mo8824f(r6, r8, r9, r10, r11)
            int r4 = r4 + 1
            goto L_0x0519
        L_0x0528:
            r1 = r34
            goto L_0x0532
        L_0x052b:
            r3 = r1
            com.google.android.gms.internal.ads.fn4 r3 = (com.google.android.gms.internal.ads.fn4) r3
            r5 = 0
            r3.mo10218n(r2, r5)
        L_0x0532:
            long r2 = r34.mo9003T()
            r0.m20166i(r2)
            goto L_0x0004
        L_0x053b:
            r5 = 0
            int r2 = r0.f17236o
            if (r2 != 0) goto L_0x0568
            com.google.android.gms.internal.ads.y22 r2 = r0.f17230i
            byte[] r2 = r2.mo15295h()
            r6 = 8
            r7 = 1
            boolean r2 = r1.mo9984g(r2, r5, r6, r7)
            if (r2 != 0) goto L_0x0551
            r1 = -1
            return r1
        L_0x0551:
            r0.f17236o = r6
            com.google.android.gms.internal.ads.y22 r2 = r0.f17230i
            r2.mo15293f(r5)
            com.google.android.gms.internal.ads.y22 r2 = r0.f17230i
            long r5 = r2.mo15280A()
            r0.f17235n = r5
            com.google.android.gms.internal.ads.y22 r2 = r0.f17230i
            int r2 = r2.mo15300m()
            r0.f17234m = r2
        L_0x0568:
            long r5 = r0.f17235n
            r7 = 1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x058d
            com.google.android.gms.internal.ads.y22 r2 = r0.f17230i
            byte[] r2 = r2.mo15295h()
            r5 = r1
            com.google.android.gms.internal.ads.fn4 r5 = (com.google.android.gms.internal.ads.fn4) r5
            r6 = 8
            r7 = 0
            r5.mo9984g(r2, r6, r6, r7)
            int r2 = r0.f17236o
            int r2 = r2 + r6
            r0.f17236o = r2
            com.google.android.gms.internal.ads.y22 r2 = r0.f17230i
            long r5 = r2.mo15281B()
            r0.f17235n = r5
            goto L_0x05c0
        L_0x058d:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05c0
            long r5 = r34.mo9005b()
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x05b1
            java.util.ArrayDeque r2 = r0.f17231j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x05b0
            java.util.ArrayDeque r2 = r0.f17231j
            java.lang.Object r2 = r2.peek()
            com.google.android.gms.internal.ads.b4 r2 = (com.google.android.gms.internal.ads.C2202b4) r2
            long r5 = r2.f7086b
            goto L_0x05b1
        L_0x05b0:
            r5 = r7
        L_0x05b1:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x05c0
            long r7 = r34.mo9003T()
            long r5 = r5 - r7
            int r2 = r0.f17236o
            long r7 = (long) r2
            long r5 = r5 + r7
            r0.f17235n = r5
        L_0x05c0:
            long r5 = r0.f17235n
            int r2 = r0.f17236o
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0743
            long r5 = r34.mo9003T()
            long r5 = r5 - r7
            int r2 = r0.f17234m
            r7 = 1835295092(0x6d646174, float:4.4175247E27)
            r8 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 == r8) goto L_0x05da
            if (r2 != r7) goto L_0x05ed
        L_0x05da:
            boolean r2 = r0.f17221D
            if (r2 != 0) goto L_0x05ed
            com.google.android.gms.internal.ads.tn4 r2 = r0.f17218A
            com.google.android.gms.internal.ads.m r9 = new com.google.android.gms.internal.ads.m
            long r10 = r0.f17241t
            r9.<init>(r10, r5)
            r2.mo10059j(r9)
            r2 = 1
            r0.f17221D = r2
        L_0x05ed:
            int r2 = r0.f17234m
            if (r2 != r8) goto L_0x060b
            android.util.SparseArray r2 = r0.f17223b
            int r2 = r2.size()
            r9 = 0
        L_0x05f8:
            if (r9 >= r2) goto L_0x060b
            android.util.SparseArray r10 = r0.f17223b
            java.lang.Object r10 = r10.valueAt(r9)
            com.google.android.gms.internal.ads.r4 r10 = (com.google.android.gms.internal.ads.C2797r4) r10
            com.google.android.gms.internal.ads.e5 r10 = r10.f16811b
            r10.f8643c = r5
            r10.f8642b = r5
            int r9 = r9 + 1
            goto L_0x05f8
        L_0x060b:
            int r2 = r0.f17234m
            if (r2 != r7) goto L_0x061c
            r7 = 0
            r0.f17243v = r7
            long r2 = r0.f17235n
            long r5 = r5 + r2
            r0.f17238q = r5
            r2 = 2
            r0.f17233l = r2
            goto L_0x0004
        L_0x061c:
            r5 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 == r5) goto L_0x071c
            r5 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r5) goto L_0x071c
            r5 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r2 == r5) goto L_0x071c
            r5 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r2 == r5) goto L_0x071c
            r5 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r2 == r5) goto L_0x071c
            if (r2 == r8) goto L_0x071c
            r5 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 == r5) goto L_0x071c
            r5 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r2 == r5) goto L_0x071c
            r5 = 1701082227(0x65647473, float:6.742798E22)
            if (r2 != r5) goto L_0x0648
            goto L_0x071c
        L_0x0648:
            r5 = 1751411826(0x68646c72, float:4.3148E24)
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r2 == r5) goto L_0x06e7
            r5 = 1835296868(0x6d646864, float:4.418049E27)
            if (r2 == r5) goto L_0x06e7
            r5 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r2 == r5) goto L_0x06e7
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011556(0x73747364, float:1.9367383E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011827(0x73747473, float:1.9367711E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1668576371(0x63747473, float:4.5093966E21)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011555(0x73747363, float:1.9367382E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011578(0x7374737a, float:1.936741E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r2 == r4) goto L_0x06e7
            r4 = 1937011571(0x73747373, float:1.9367401E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1952867444(0x74666474, float:7.3014264E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1952868452(0x74666864, float:7.301914E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1953658222(0x7472756e, float:7.683823E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935763834(0x7361697a, float:1.785898E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 == r4) goto L_0x06e7
            r4 = 1935828848(0x73626770, float:1.7937577E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 == r4) goto L_0x06e7
            r4 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r2 == r4) goto L_0x06e7
            r4 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 == r4) goto L_0x06e7
            if (r2 != r3) goto L_0x06d2
            goto L_0x06e7
        L_0x06d2:
            long r2 = r0.f17235n
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x06e0
            r2 = 0
            r0.f17237p = r2
            r2 = 1
            r0.f17233l = r2
            goto L_0x0004
        L_0x06e0:
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11992c(r1)
            throw r1
        L_0x06e7:
            int r2 = r0.f17236o
            r3 = 8
            if (r2 != r3) goto L_0x0715
            long r4 = r0.f17235n
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x070e
            com.google.android.gms.internal.ads.y22 r2 = new com.google.android.gms.internal.ads.y22
            int r5 = (int) r4
            r2.<init>((int) r5)
            com.google.android.gms.internal.ads.y22 r4 = r0.f17230i
            byte[] r4 = r4.mo15295h()
            byte[] r5 = r2.mo15295h()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r3)
            r0.f17237p = r2
            r2 = 1
            r0.f17233l = r2
            goto L_0x0004
        L_0x070e:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11992c(r1)
            throw r1
        L_0x0715:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11992c(r1)
            throw r1
        L_0x071c:
            long r3 = r34.mo9003T()
            long r5 = r0.f17235n
            long r3 = r3 + r5
            r5 = -8
            long r3 = r3 + r5
            java.util.ArrayDeque r5 = r0.f17231j
            com.google.android.gms.internal.ads.b4 r6 = new com.google.android.gms.internal.ads.b4
            r6.<init>(r2, r3)
            r5.push(r6)
            long r5 = r0.f17235n
            int r2 = r0.f17236o
            long r7 = (long) r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x073e
            r0.m20166i(r3)
            goto L_0x0004
        L_0x073e:
            r33.m20164e()
            goto L_0x0004
        L_0x0743:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.ea0 r1 = com.google.android.gms.internal.ads.ea0.m11992c(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2834s4.mo9025f(com.google.android.gms.internal.ads.rn4, com.google.android.gms.internal.ads.k):int");
    }

    /* renamed from: g */
    public final void mo9026g(long j, long j2) {
        int size = this.f17223b.size();
        for (int i = 0; i < size; i++) {
            ((C2797r4) this.f17223b.valueAt(i)).mo13673i();
        }
        this.f17232k.clear();
        this.f17239r = 0;
        this.f17240s = j2;
        this.f17231j.clear();
        m20164e();
    }
}
