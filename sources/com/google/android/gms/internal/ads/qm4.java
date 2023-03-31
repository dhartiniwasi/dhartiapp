package com.google.android.gms.internal.ads;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class qm4 {

    /* renamed from: a */
    private static final int[] f16472a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f16473b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f16474c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f16475d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f16476e = {32, 40, 48, 56, 64, 80, 96, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f16477f = {69, 87, C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g */
    public static final /* synthetic */ int f16478g = 0;

    /* renamed from: a */
    public static int m19293a(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f16472a[i] * 256;
    }

    /* renamed from: b */
    public static int m19294b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return m19298f((b & 192) >> 6, b & 63);
    }

    /* renamed from: c */
    public static C2388g4 m19295c(y22 y22, String str, String str2, fl4 fl4) {
        int i = f16473b[(y22.mo15306s() & 192) >> 6];
        int s = y22.mo15306s();
        int i2 = f16475d[(s & 56) >> 3];
        if ((s & 4) != 0) {
            i2++;
        }
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9764h(str);
        e2Var.mo9776s("audio/ac3");
        e2Var.mo9759e0(i2);
        e2Var.mo9777t(i);
        e2Var.mo9753b(fl4);
        e2Var.mo9768k(str2);
        return e2Var.mo9782y();
    }

    /* renamed from: d */
    public static C2388g4 m19296d(y22 y22, String str, String str2, fl4 fl4) {
        y22.mo15294g(2);
        int i = f16473b[(y22.mo15306s() & 192) >> 6];
        int s = y22.mo15306s();
        int i2 = f16475d[(s & 14) >> 1];
        if ((s & 1) != 0) {
            i2++;
        }
        if (((y22.mo15306s() & 30) >> 1) > 0 && (2 & y22.mo15306s()) != 0) {
            i2 += 2;
        }
        String str3 = (y22.mo15296i() <= 0 || (y22.mo15306s() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9764h(str);
        e2Var.mo9776s(str3);
        e2Var.mo9759e0(i2);
        e2Var.mo9777t(i);
        e2Var.mo9753b(fl4);
        e2Var.mo9768k(str2);
        return e2Var.mo9782y();
    }

    /* renamed from: e */
    public static pm4 m19297e(x12 x12) {
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
        x12 x122 = x12;
        int b = x12.mo15033b();
        x122.mo15041j(40);
        int c = x122.mo15034c(5);
        x122.mo15039h(b);
        int i12 = -1;
        if (c > 10) {
            x122.mo15041j(16);
            int c2 = x122.mo15034c(2);
            if (c2 == 0) {
                i12 = 0;
            } else if (c2 == 1) {
                i12 = 1;
            } else if (c2 == 2) {
                i12 = 2;
            }
            x122.mo15041j(3);
            int c3 = x122.mo15034c(11) + 1;
            int i13 = c3 + c3;
            int c4 = x122.mo15034c(2);
            if (c4 == 3) {
                i6 = f16474c[x122.mo15034c(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = x122.mo15034c(2);
                i7 = f16472a[i8];
                i6 = f16473b[c4];
            }
            int i14 = i7 * 256;
            int c5 = x122.mo15034c(3);
            boolean l = x12.mo15043l();
            int i15 = f16475d[c5] + (l ? 1 : 0);
            x122.mo15041j(10);
            if (x12.mo15043l()) {
                x122.mo15041j(8);
            }
            if (c5 == 0) {
                x122.mo15041j(5);
                if (x12.mo15043l()) {
                    x122.mo15041j(8);
                }
                i9 = 0;
                c5 = 0;
            } else {
                i9 = c5;
            }
            if (i12 == 1) {
                if (x12.mo15043l()) {
                    x122.mo15041j(16);
                }
                i10 = 1;
            } else {
                i10 = i12;
            }
            if (x12.mo15043l()) {
                if (i9 > 2) {
                    x122.mo15041j(2);
                }
                if ((i9 & 1) != 0 && i9 > 2) {
                    x122.mo15041j(6);
                }
                if ((i9 & 4) != 0) {
                    x122.mo15041j(6);
                }
                if (l && x12.mo15043l()) {
                    x122.mo15041j(5);
                }
                if (i10 == 0) {
                    if (x12.mo15043l()) {
                        x122.mo15041j(6);
                    }
                    if (i9 == 0 && x12.mo15043l()) {
                        x122.mo15041j(6);
                    }
                    if (x12.mo15043l()) {
                        x122.mo15041j(6);
                    }
                    int c6 = x122.mo15034c(2);
                    if (c6 == 1) {
                        x122.mo15041j(5);
                    } else if (c6 == 2) {
                        x122.mo15041j(12);
                    } else if (c6 == 3) {
                        int c7 = x122.mo15034c(5);
                        if (x12.mo15043l()) {
                            x122.mo15041j(5);
                            if (x12.mo15043l()) {
                                x122.mo15041j(4);
                            }
                            if (x12.mo15043l()) {
                                x122.mo15041j(4);
                            }
                            if (x12.mo15043l()) {
                                x122.mo15041j(4);
                            }
                            if (x12.mo15043l()) {
                                x122.mo15041j(4);
                            }
                            if (x12.mo15043l()) {
                                x122.mo15041j(4);
                            }
                            if (x12.mo15043l()) {
                                x122.mo15041j(4);
                            }
                            if (x12.mo15043l()) {
                                x122.mo15041j(4);
                            }
                            if (x12.mo15043l()) {
                                if (x12.mo15043l()) {
                                    x122.mo15041j(4);
                                }
                                if (x12.mo15043l()) {
                                    x122.mo15041j(4);
                                }
                            }
                        }
                        if (x12.mo15043l()) {
                            x122.mo15041j(5);
                            if (x12.mo15043l()) {
                                x122.mo15041j(7);
                                if (x12.mo15043l()) {
                                    x122.mo15041j(8);
                                    x122.mo15041j((c7 + 2) * 8);
                                    x12.mo15035d();
                                }
                            }
                        }
                        x122.mo15041j((c7 + 2) * 8);
                        x12.mo15035d();
                    }
                    if (i9 < 2) {
                        if (x12.mo15043l()) {
                            x122.mo15041j(14);
                        }
                        if (c5 == 0 && x12.mo15043l()) {
                            x122.mo15041j(14);
                        }
                    }
                    if (x12.mo15043l()) {
                        if (i8 == 0) {
                            x122.mo15041j(5);
                            i10 = 0;
                            i8 = 0;
                        } else {
                            for (int i16 = 0; i16 < i7; i16++) {
                                if (x12.mo15043l()) {
                                    x122.mo15041j(5);
                                }
                            }
                        }
                    }
                    i10 = 0;
                }
            }
            if (x12.mo15043l()) {
                x122.mo15041j(5);
                if (i9 == 2) {
                    x122.mo15041j(4);
                    i9 = 2;
                }
                if (i9 >= 6) {
                    x122.mo15041j(2);
                }
                if (x12.mo15043l()) {
                    i11 = 8;
                    x122.mo15041j(8);
                } else {
                    i11 = 8;
                }
                if (i9 == 0 && x12.mo15043l()) {
                    x122.mo15041j(i11);
                }
                if (c4 < 3) {
                    x12.mo15040i();
                }
            }
            if (i10 == 0 && i8 != 3) {
                x12.mo15040i();
            }
            if (i10 == 2 && (i8 == 3 || x12.mo15043l())) {
                x122.mo15041j(6);
            }
            str = (x12.mo15043l() && x122.mo15034c(6) == 1 && x122.mo15034c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i2 = i13;
            i = i14;
            i3 = i6;
            i4 = i15;
        } else {
            x122.mo15041j(32);
            int c8 = x122.mo15034c(2);
            String str2 = c8 == 3 ? null : "audio/ac3";
            int f = m19298f(c8, x122.mo15034c(6));
            x122.mo15041j(8);
            int c9 = x122.mo15034c(3);
            if (!((c9 & 1) == 0 || c9 == 1)) {
                x122.mo15041j(2);
            }
            if ((c9 & 4) != 0) {
                x122.mo15041j(2);
            }
            if (c9 == 2) {
                x122.mo15041j(2);
            }
            str = str2;
            i2 = f;
            i3 = c8 < 3 ? f16473b[c8] : -1;
            i4 = f16475d[c9] + (x12.mo15043l() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new pm4(str, i5, i4, i3, i2, i, (om4) null);
    }

    /* renamed from: f */
    private static int m19298f(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f16473b[i];
        if (i4 == 44100) {
            int i5 = f16477f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f16476e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
