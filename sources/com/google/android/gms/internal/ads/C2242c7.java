package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2242c7 implements C3096z7 {

    /* renamed from: a */
    private final C2576l6 f7625a;

    /* renamed from: b */
    private final x12 f7626b = new x12(new byte[10], 10);

    /* renamed from: c */
    private int f7627c = 0;

    /* renamed from: d */
    private int f7628d;

    /* renamed from: e */
    private e92 f7629e;

    /* renamed from: f */
    private boolean f7630f;

    /* renamed from: g */
    private boolean f7631g;

    /* renamed from: h */
    private boolean f7632h;

    /* renamed from: i */
    private int f7633i;

    /* renamed from: j */
    private int f7634j;

    /* renamed from: k */
    private boolean f7635k;

    public C2242c7(C2576l6 l6Var) {
        this.f7625a = l6Var;
    }

    /* renamed from: c */
    private final void m10721c(int i) {
        this.f7627c = i;
        this.f7628d = 0;
    }

    /* renamed from: d */
    private final boolean m10722d(y22 y22, byte[] bArr, int i) {
        int min = Math.min(y22.mo15296i(), i - this.f7628d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            y22.mo15294g(min);
        } else {
            y22.mo15289b(bArr, this.f7628d, min);
        }
        int i2 = this.f7628d + min;
        this.f7628d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo9029a(e92 e92, tn4 tn4, C3059y7 y7Var) {
        this.f7629e = e92;
        this.f7625a.mo8217c(tn4, y7Var);
    }

    /* renamed from: b */
    public final void mo9030b(y22 y22, int i) throws ea0 {
        long j;
        y22 y222 = y22;
        v91.m22048b(this.f7629e);
        int i2 = -1;
        int i3 = 2;
        if ((i & 1) != 0) {
            int i4 = this.f7627c;
            if (!(i4 == 0 || i4 == 1)) {
                if (i4 != 2) {
                    int i5 = this.f7634j;
                    if (i5 != -1) {
                        ot1.m18060e("PesReader", "Unexpected start indicator: expected " + i5 + " more bytes");
                    }
                    this.f7625a.mo8219e();
                } else {
                    ot1.m18060e("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m10721c(1);
        }
        int i6 = i;
        while (y22.mo15296i() > 0) {
            int i7 = this.f7627c;
            if (i7 != 0) {
                int i8 = 0;
                if (i7 != 1) {
                    if (i7 != i3) {
                        int i9 = y22.mo15296i();
                        int i10 = this.f7634j;
                        if (i10 != i2) {
                            i8 = i9 - i10;
                        }
                        if (i8 > 0) {
                            i9 -= i8;
                            y222.mo15292e(y22.mo15298k() + i9);
                        }
                        this.f7625a.mo8216b(y222);
                        int i11 = this.f7634j;
                        if (i11 != i2) {
                            int i12 = i11 - i9;
                            this.f7634j = i12;
                            if (i12 == 0) {
                                this.f7625a.mo8219e();
                                m10721c(1);
                            }
                        }
                    } else {
                        if (m10722d(y222, this.f7626b.f19942a, Math.min(10, this.f7633i)) && m10722d(y222, (byte[]) null, this.f7633i)) {
                            this.f7626b.mo15039h(0);
                            if (this.f7630f) {
                                this.f7626b.mo15041j(4);
                                int c = this.f7626b.mo15034c(3);
                                this.f7626b.mo15041j(1);
                                int c2 = this.f7626b.mo15034c(15);
                                this.f7626b.mo15041j(1);
                                long c3 = ((long) (c2 << 15)) | (((long) c) << 30) | ((long) this.f7626b.mo15034c(15));
                                this.f7626b.mo15041j(1);
                                if (!this.f7632h && this.f7631g) {
                                    this.f7626b.mo15041j(4);
                                    int c4 = this.f7626b.mo15034c(3);
                                    this.f7626b.mo15041j(1);
                                    int c5 = this.f7626b.mo15034c(15);
                                    this.f7626b.mo15041j(1);
                                    int c6 = this.f7626b.mo15034c(15);
                                    this.f7626b.mo15041j(1);
                                    this.f7629e.mo9832b((((long) c4) << 30) | ((long) (c5 << 15)) | ((long) c6));
                                    this.f7632h = true;
                                }
                                j = this.f7629e.mo9832b(c3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            i6 |= true != this.f7635k ? 0 : 4;
                            this.f7625a.mo8218d(j, i6);
                            m10721c(3);
                            i2 = -1;
                        }
                    }
                } else if (m10722d(y222, this.f7626b.f19942a, 9)) {
                    int i13 = 0;
                    this.f7626b.mo15039h(0);
                    int c7 = this.f7626b.mo15034c(24);
                    if (c7 != 1) {
                        ot1.m18060e("PesReader", "Unexpected start code prefix: " + c7);
                        i2 = -1;
                        this.f7634j = -1;
                    } else {
                        this.f7626b.mo15041j(8);
                        int c8 = this.f7626b.mo15034c(16);
                        this.f7626b.mo15041j(5);
                        this.f7635k = this.f7626b.mo15043l();
                        this.f7626b.mo15041j(2);
                        this.f7630f = this.f7626b.mo15043l();
                        this.f7631g = this.f7626b.mo15043l();
                        this.f7626b.mo15041j(6);
                        int c9 = this.f7626b.mo15034c(8);
                        this.f7633i = c9;
                        if (c8 == 0) {
                            this.f7634j = -1;
                        } else {
                            int i14 = (c8 - 3) - c9;
                            this.f7634j = i14;
                            if (i14 < 0) {
                                ot1.m18060e("PesReader", "Found negative packet payload size: " + i14);
                                i2 = -1;
                                this.f7634j = -1;
                                i13 = 2;
                            }
                        }
                        i2 = -1;
                        i13 = 2;
                    }
                    m10721c(i13);
                } else {
                    i2 = -1;
                }
            } else {
                y222.mo15294g(y22.mo15296i());
            }
            i3 = 2;
        }
    }

    /* renamed from: e */
    public final void mo9031e() {
        this.f7627c = 0;
        this.f7628d = 0;
        this.f7632h = false;
        this.f7625a.mo8215a();
    }
}
