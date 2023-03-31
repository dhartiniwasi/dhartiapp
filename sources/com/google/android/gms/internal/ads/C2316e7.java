package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.e7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2316e7 implements an4 {

    /* renamed from: a */
    private final e92 f8690a;

    /* renamed from: b */
    private final y22 f8691b = new y22();

    /* synthetic */ C2316e7(e92 e92, C2279d7 d7Var) {
        this.f8690a = e92;
    }

    /* renamed from: a */
    public final zm4 mo8442a(rn4 rn4, long j) throws IOException {
        int h;
        long j2;
        long T = rn4.mo9003T();
        int min = (int) Math.min(20000, rn4.mo9005b() - T);
        this.f8691b.mo15290c(min);
        ((fn4) rn4).mo9986i(this.f8691b.mo15295h(), 0, min, false);
        y22 y22 = this.f8691b;
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (y22.mo15296i() >= 4) {
            if (C2353f7.m12445h(y22.mo15295h(), y22.mo15298k()) != 442) {
                y22.mo15294g(1);
            } else {
                y22.mo15294g(4);
                long c = C2391g7.m13065c(y22);
                if (c != -9223372036854775807L) {
                    long b = this.f8690a.mo9832b(c);
                    if (b > j) {
                        if (j3 == -9223372036854775807L) {
                            return zm4.m24687d(b, T);
                        }
                        j2 = (long) i2;
                    } else if (100000 + b > j) {
                        j2 = (long) y22.mo15298k();
                    } else {
                        i2 = y22.mo15298k();
                        j3 = b;
                    }
                    return zm4.m24688e(T + j2);
                }
                int l = y22.mo15299l();
                if (y22.mo15296i() >= 10) {
                    y22.mo15294g(9);
                    int s = y22.mo15306s() & 7;
                    if (y22.mo15296i() >= s) {
                        y22.mo15294g(s);
                        if (y22.mo15296i() >= 4) {
                            if (C2353f7.m12445h(y22.mo15295h(), y22.mo15298k()) == 443) {
                                y22.mo15294g(4);
                                int w = y22.mo15310w();
                                if (y22.mo15296i() < w) {
                                    y22.mo15293f(l);
                                } else {
                                    y22.mo15294g(w);
                                }
                            }
                            while (true) {
                                if (y22.mo15296i() < 4 || (h = C2353f7.m12445h(y22.mo15295h(), y22.mo15298k())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                y22.mo15294g(4);
                                if (y22.mo15296i() < 2) {
                                    y22.mo15293f(l);
                                    break;
                                }
                                y22.mo15293f(Math.min(y22.mo15299l(), y22.mo15298k() + y22.mo15310w()));
                            }
                        } else {
                            y22.mo15293f(l);
                        }
                    } else {
                        y22.mo15293f(l);
                    }
                } else {
                    y22.mo15293f(l);
                }
                i = y22.mo15298k();
            }
        }
        return j3 != -9223372036854775807L ? zm4.m24689f(j3, T + ((long) i)) : zm4.f21165d;
    }

    /* renamed from: d */
    public final void mo8443d() {
        y22 y22 = this.f8691b;
        byte[] bArr = gb2.f9817f;
        int length = bArr.length;
        y22.mo15291d(bArr, 0);
    }
}
