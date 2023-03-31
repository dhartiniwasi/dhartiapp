package p014b2;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.nio.ByteBuffer;
import p030d2.C4035m;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5980z;
import p177z1.C6272r1;

/* renamed from: b2.b */
/* compiled from: Ac3Util */
public final class C1613b {

    /* renamed from: a */
    private static final int[] f4618a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f4619b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f4620c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f4621d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f4622e = {32, 40, 48, 56, 64, 80, 96, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f4623f = {69, 87, C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: b2.b$b */
    /* compiled from: Ac3Util */
    public static final class C1615b {

        /* renamed from: a */
        public final String f4624a;

        /* renamed from: b */
        public final int f4625b;

        /* renamed from: c */
        public final int f4626c;

        /* renamed from: d */
        public final int f4627d;

        /* renamed from: e */
        public final int f4628e;

        /* renamed from: f */
        public final int f4629f;

        private C1615b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f4624a = str;
            this.f4625b = i;
            this.f4627d = i2;
            this.f4626c = i3;
            this.f4628e = i4;
            this.f4629f = i5;
        }
    }

    /* renamed from: a */
    public static int m7408a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((C5953m0.m35084I(byteBuffer, i + 4) & -2) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static int m7409b(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f4619b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f4623f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f4622e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: c */
    public static C6272r1 m7410c(C5918a0 a0Var, String str, String str2, C4035m mVar) {
        int i = f4619b[(a0Var.mo20534C() & 192) >> 6];
        int C = a0Var.mo20534C();
        int i2 = f4621d[(C & 56) >> 3];
        if ((C & 4) != 0) {
            i2++;
        }
        return new C6272r1.C6274b().mo21505S(str).mo21517e0("audio/ac3").mo21494H(i2).mo21518f0(i).mo21499M(mVar).mo21508V(str2).mo21491E();
    }

    /* renamed from: d */
    public static int m7411d(ByteBuffer byteBuffer) {
        int i = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f4618a[i] * 256;
    }

    /* renamed from: e */
    public static C1615b m7412e(C5980z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C5980z zVar2 = zVar;
        int e = zVar.mo20673e();
        zVar2.mo20686r(40);
        boolean z = zVar2.mo20676h(5) > 10;
        zVar2.mo20684p(e);
        int i12 = -1;
        if (z) {
            zVar2.mo20686r(16);
            int h = zVar2.mo20676h(2);
            if (h == 0) {
                i12 = 0;
            } else if (h == 1) {
                i12 = 1;
            } else if (h == 2) {
                i12 = 2;
            }
            zVar2.mo20686r(3);
            int h2 = (zVar2.mo20676h(11) + 1) * 2;
            int h3 = zVar2.mo20676h(2);
            if (h3 == 3) {
                i6 = f4620c[zVar2.mo20676h(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = zVar2.mo20676h(2);
                i7 = f4618a[i8];
                i6 = f4619b[h3];
            }
            int i13 = i7 * 256;
            int h4 = zVar2.mo20676h(3);
            boolean g = zVar.mo20675g();
            int i14 = f4621d[h4] + (g ? 1 : 0);
            zVar2.mo20686r(10);
            if (zVar.mo20675g()) {
                zVar2.mo20686r(8);
            }
            if (h4 == 0) {
                zVar2.mo20686r(5);
                if (zVar.mo20675g()) {
                    zVar2.mo20686r(8);
                }
            }
            if (i12 == 1 && zVar.mo20675g()) {
                zVar2.mo20686r(16);
            }
            if (zVar.mo20675g()) {
                if (h4 > 2) {
                    zVar2.mo20686r(2);
                }
                if ((h4 & 1) == 0 || h4 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    zVar2.mo20686r(6);
                }
                if ((h4 & 4) != 0) {
                    zVar2.mo20686r(i10);
                }
                if (g && zVar.mo20675g()) {
                    zVar2.mo20686r(5);
                }
                if (i12 == 0) {
                    if (zVar.mo20675g()) {
                        i11 = 6;
                        zVar2.mo20686r(6);
                    } else {
                        i11 = 6;
                    }
                    if (h4 == 0 && zVar.mo20675g()) {
                        zVar2.mo20686r(i11);
                    }
                    if (zVar.mo20675g()) {
                        zVar2.mo20686r(i11);
                    }
                    int h5 = zVar2.mo20676h(2);
                    if (h5 == 1) {
                        zVar2.mo20686r(5);
                    } else if (h5 == 2) {
                        zVar2.mo20686r(12);
                    } else if (h5 == 3) {
                        int h6 = zVar2.mo20676h(5);
                        if (zVar.mo20675g()) {
                            zVar2.mo20686r(5);
                            if (zVar.mo20675g()) {
                                zVar2.mo20686r(4);
                            }
                            if (zVar.mo20675g()) {
                                zVar2.mo20686r(4);
                            }
                            if (zVar.mo20675g()) {
                                zVar2.mo20686r(4);
                            }
                            if (zVar.mo20675g()) {
                                zVar2.mo20686r(4);
                            }
                            if (zVar.mo20675g()) {
                                zVar2.mo20686r(4);
                            }
                            if (zVar.mo20675g()) {
                                zVar2.mo20686r(4);
                            }
                            if (zVar.mo20675g()) {
                                zVar2.mo20686r(4);
                            }
                            if (zVar.mo20675g()) {
                                if (zVar.mo20675g()) {
                                    zVar2.mo20686r(4);
                                }
                                if (zVar.mo20675g()) {
                                    zVar2.mo20686r(4);
                                }
                            }
                        }
                        if (zVar.mo20675g()) {
                            zVar2.mo20686r(5);
                            if (zVar.mo20675g()) {
                                zVar2.mo20686r(7);
                                if (zVar.mo20675g()) {
                                    zVar2.mo20686r(8);
                                }
                            }
                        }
                        zVar2.mo20686r((h6 + 2) * 8);
                        zVar.mo20671c();
                    }
                    if (h4 < 2) {
                        if (zVar.mo20675g()) {
                            zVar2.mo20686r(14);
                        }
                        if (h4 == 0 && zVar.mo20675g()) {
                            zVar2.mo20686r(14);
                        }
                    }
                    if (zVar.mo20675g()) {
                        if (i8 == 0) {
                            zVar2.mo20686r(5);
                        } else {
                            for (int i15 = 0; i15 < i7; i15++) {
                                if (zVar.mo20675g()) {
                                    zVar2.mo20686r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zVar.mo20675g()) {
                zVar2.mo20686r(5);
                if (h4 == 2) {
                    zVar2.mo20686r(4);
                }
                if (h4 >= 6) {
                    zVar2.mo20686r(2);
                }
                if (zVar.mo20675g()) {
                    zVar2.mo20686r(8);
                }
                if (h4 == 0 && zVar.mo20675g()) {
                    zVar2.mo20686r(8);
                }
                if (h3 < 3) {
                    zVar.mo20685q();
                }
            }
            if (i12 == 0 && i8 != 3) {
                zVar.mo20685q();
            }
            if (i12 != 2 || (i8 != 3 && !zVar.mo20675g())) {
                i9 = 6;
            } else {
                i9 = 6;
                zVar2.mo20686r(6);
            }
            str = (zVar.mo20675g() && zVar2.mo20676h(i9) == 1 && zVar2.mo20676h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i = i13;
            i2 = h2;
            i3 = i6;
            i4 = i14;
        } else {
            zVar2.mo20686r(32);
            int h7 = zVar2.mo20676h(2);
            String str2 = h7 == 3 ? null : "audio/ac3";
            int b = m7409b(h7, zVar2.mo20676h(6));
            zVar2.mo20686r(8);
            int h8 = zVar2.mo20676h(3);
            if (!((h8 & 1) == 0 || h8 == 1)) {
                zVar2.mo20686r(2);
            }
            if ((h8 & 4) != 0) {
                zVar2.mo20686r(2);
            }
            if (h8 == 2) {
                zVar2.mo20686r(2);
            }
            int[] iArr = f4619b;
            str = str2;
            i2 = b;
            i3 = h7 < iArr.length ? iArr[h7] : -1;
            i4 = f4621d[h8] + (zVar.mo20675g() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new C1615b(str, i5, i4, i3, i2, i);
    }

    /* renamed from: f */
    public static int m7413f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return m7409b((bArr[4] & 192) >> 6, bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    /* renamed from: g */
    public static C6272r1 m7414g(C5918a0 a0Var, String str, String str2, C4035m mVar) {
        a0Var.mo20547P(2);
        int i = f4619b[(a0Var.mo20534C() & 192) >> 6];
        int C = a0Var.mo20534C();
        int i2 = f4621d[(C & 14) >> 1];
        if ((C & 1) != 0) {
            i2++;
        }
        if (((a0Var.mo20534C() & 30) >> 1) > 0 && (2 & a0Var.mo20534C()) != 0) {
            i2 += 2;
        }
        return new C6272r1.C6274b().mo21505S(str).mo21517e0((a0Var.mo20548a() <= 0 || (a0Var.mo20534C() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").mo21494H(i2).mo21518f0(i).mo21499M(mVar).mo21508V(str2).mo21491E();
    }

    /* renamed from: h */
    public static int m7415h(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: i */
    public static int m7416i(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }
}
