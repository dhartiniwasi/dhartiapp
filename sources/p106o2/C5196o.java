package p106o2;

import java.util.Arrays;
import java.util.Collections;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5970w;
import p161w3.C5980z;
import p177z1.C6272r1;

/* renamed from: o2.o */
/* compiled from: H263Reader */
public final class C5196o implements C5193m {

    /* renamed from: l */
    private static final float[] f26890l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    private final C5191k0 f26891a;

    /* renamed from: b */
    private final C5918a0 f26892b;

    /* renamed from: c */
    private final boolean[] f26893c = new boolean[4];

    /* renamed from: d */
    private final C5197a f26894d = new C5197a(128);

    /* renamed from: e */
    private final C5208u f26895e;

    /* renamed from: f */
    private C5198b f26896f;

    /* renamed from: g */
    private long f26897g;

    /* renamed from: h */
    private String f26898h;

    /* renamed from: i */
    private C4200e0 f26899i;

    /* renamed from: j */
    private boolean f26900j;

    /* renamed from: k */
    private long f26901k = -9223372036854775807L;

    /* renamed from: o2.o$a */
    /* compiled from: H263Reader */
    private static final class C5197a {

        /* renamed from: f */
        private static final byte[] f26902f = {0, 0, 1};

        /* renamed from: a */
        private boolean f26903a;

        /* renamed from: b */
        private int f26904b;

        /* renamed from: c */
        public int f26905c;

        /* renamed from: d */
        public int f26906d;

        /* renamed from: e */
        public byte[] f26907e;

        public C5197a(int i) {
            this.f26907e = new byte[i];
        }

        /* renamed from: a */
        public void mo19172a(byte[] bArr, int i, int i2) {
            if (this.f26903a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f26907e;
                int length = bArr2.length;
                int i4 = this.f26905c;
                if (length < i4 + i3) {
                    this.f26907e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f26907e, this.f26905c, i3);
                this.f26905c += i3;
            }
        }

        /* renamed from: b */
        public boolean mo19173b(int i, int i2) {
            int i3 = this.f26904b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new IllegalStateException();
                            } else if (i == 179 || i == 181) {
                                this.f26905c -= i2;
                                this.f26903a = false;
                                return true;
                            }
                        } else if ((i & 240) != 32) {
                            C5961r.m35215i("H263Reader", "Unexpected start code value");
                            mo19174c();
                        } else {
                            this.f26906d = this.f26905c;
                            this.f26904b = 4;
                        }
                    } else if (i > 31) {
                        C5961r.m35215i("H263Reader", "Unexpected start code value");
                        mo19174c();
                    } else {
                        this.f26904b = 3;
                    }
                } else if (i != 181) {
                    C5961r.m35215i("H263Reader", "Unexpected start code value");
                    mo19174c();
                } else {
                    this.f26904b = 2;
                }
            } else if (i == 176) {
                this.f26904b = 1;
                this.f26903a = true;
            }
            byte[] bArr = f26902f;
            mo19172a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void mo19174c() {
            this.f26903a = false;
            this.f26905c = 0;
            this.f26904b = 0;
        }
    }

    /* renamed from: o2.o$b */
    /* compiled from: H263Reader */
    private static final class C5198b {

        /* renamed from: a */
        private final C4200e0 f26908a;

        /* renamed from: b */
        private boolean f26909b;

        /* renamed from: c */
        private boolean f26910c;

        /* renamed from: d */
        private boolean f26911d;

        /* renamed from: e */
        private int f26912e;

        /* renamed from: f */
        private int f26913f;

        /* renamed from: g */
        private long f26914g;

        /* renamed from: h */
        private long f26915h;

        public C5198b(C4200e0 e0Var) {
            this.f26908a = e0Var;
        }

        /* renamed from: a */
        public void mo19175a(byte[] bArr, int i, int i2) {
            if (this.f26910c) {
                int i3 = this.f26913f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.f26911d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f26910c = false;
                    return;
                }
                this.f26913f = i3 + (i2 - i);
            }
        }

        /* renamed from: b */
        public void mo19176b(long j, int i, boolean z) {
            if (this.f26912e == 182 && z && this.f26909b) {
                long j2 = this.f26915h;
                if (j2 != -9223372036854775807L) {
                    int i2 = (int) (j - this.f26914g);
                    this.f26908a.mo6838a(j2, this.f26911d ? 1 : 0, i2, i, (C4200e0.C4201a) null);
                }
            }
            if (this.f26912e != 179) {
                this.f26914g = j;
            }
        }

        /* renamed from: c */
        public void mo19177c(int i, long j) {
            this.f26912e = i;
            this.f26911d = false;
            boolean z = true;
            this.f26909b = i == 182 || i == 179;
            if (i != 182) {
                z = false;
            }
            this.f26910c = z;
            this.f26913f = 0;
            this.f26915h = j;
        }

        /* renamed from: d */
        public void mo19178d() {
            this.f26909b = false;
            this.f26910c = false;
            this.f26911d = false;
            this.f26912e = -1;
        }
    }

    C5196o(C5191k0 k0Var) {
        this.f26891a = k0Var;
        if (k0Var != null) {
            this.f26895e = new C5208u(178, 128);
            this.f26892b = new C5918a0();
            return;
        }
        this.f26895e = null;
        this.f26892b = null;
    }

    /* renamed from: f */
    private static C6272r1 m32268f(C5197a aVar, int i, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f26907e, aVar.f26905c);
        C5980z zVar = new C5980z(copyOf);
        zVar.mo20687s(i);
        zVar.mo20687s(4);
        zVar.mo20685q();
        zVar.mo20686r(8);
        if (zVar.mo20675g()) {
            zVar.mo20686r(4);
            zVar.mo20686r(3);
        }
        int h = zVar.mo20676h(4);
        float f = 1.0f;
        if (h == 15) {
            int h2 = zVar.mo20676h(8);
            int h3 = zVar.mo20676h(8);
            if (h3 == 0) {
                C5961r.m35215i("H263Reader", "Invalid aspect ratio");
            } else {
                f = ((float) h2) / ((float) h3);
            }
        } else {
            float[] fArr = f26890l;
            if (h < fArr.length) {
                f = fArr[h];
            } else {
                C5961r.m35215i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (zVar.mo20675g()) {
            zVar.mo20686r(2);
            zVar.mo20686r(1);
            if (zVar.mo20675g()) {
                zVar.mo20686r(15);
                zVar.mo20685q();
                zVar.mo20686r(15);
                zVar.mo20685q();
                zVar.mo20686r(15);
                zVar.mo20685q();
                zVar.mo20686r(3);
                zVar.mo20686r(11);
                zVar.mo20685q();
                zVar.mo20686r(15);
                zVar.mo20685q();
            }
        }
        if (zVar.mo20676h(2) != 0) {
            C5961r.m35215i("H263Reader", "Unhandled video object layer shape");
        }
        zVar.mo20685q();
        int h4 = zVar.mo20676h(16);
        zVar.mo20685q();
        if (zVar.mo20675g()) {
            if (h4 == 0) {
                C5961r.m35215i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = h4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                zVar.mo20686r(i2);
            }
        }
        zVar.mo20685q();
        int h5 = zVar.mo20676h(13);
        zVar.mo20685q();
        int h6 = zVar.mo20676h(13);
        zVar.mo20685q();
        zVar.mo20685q();
        return new C6272r1.C6274b().mo21505S(str).mo21517e0("video/mp4v-es").mo21522j0(h5).mo21503Q(h6).mo21513a0(f).mo21506T(Collections.singletonList(copyOf)).mo21491E();
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        C5917a.m34875h(this.f26896f);
        C5917a.m34875h(this.f26899i);
        int e = a0Var.mo20552e();
        int f = a0Var.mo20553f();
        byte[] d = a0Var.mo20551d();
        this.f26897g += (long) a0Var.mo20548a();
        this.f26899i.mo6843d(a0Var, a0Var.mo20548a());
        while (true) {
            int c = C5970w.m35260c(d, e, f, this.f26893c);
            if (c == f) {
                break;
            }
            int i = c + 3;
            byte b = a0Var.mo20551d()[i] & 255;
            int i2 = c - e;
            int i3 = 0;
            if (!this.f26900j) {
                if (i2 > 0) {
                    this.f26894d.mo19172a(d, e, c);
                }
                if (this.f26894d.mo19173b(b, i2 < 0 ? -i2 : 0)) {
                    C4200e0 e0Var = this.f26899i;
                    C5197a aVar = this.f26894d;
                    e0Var.mo6845e(m32268f(aVar, aVar.f26906d, (String) C5917a.m34872e(this.f26898h)));
                    this.f26900j = true;
                }
            }
            this.f26896f.mo19175a(d, e, c);
            C5208u uVar = this.f26895e;
            if (uVar != null) {
                if (i2 > 0) {
                    uVar.mo19194a(d, e, c);
                } else {
                    i3 = -i2;
                }
                if (this.f26895e.mo19195b(i3)) {
                    C5208u uVar2 = this.f26895e;
                    ((C5918a0) C5953m0.m35138j(this.f26892b)).mo20544M(this.f26895e.f27034d, C5970w.m35274q(uVar2.f27034d, uVar2.f27035e));
                    ((C5191k0) C5953m0.m35138j(this.f26891a)).mo19167a(this.f26901k, this.f26892b);
                }
                if (b == 178 && a0Var.mo20551d()[c + 2] == 1) {
                    this.f26895e.mo19198e(b);
                }
            }
            int i4 = f - c;
            this.f26896f.mo19176b(this.f26897g - ((long) i4), i4, this.f26900j);
            this.f26896f.mo19177c(b, this.f26901k);
            e = i;
        }
        if (!this.f26900j) {
            this.f26894d.mo19172a(d, e, f);
        }
        this.f26896f.mo19175a(d, e, f);
        C5208u uVar3 = this.f26895e;
        if (uVar3 != null) {
            uVar3.mo19194a(d, e, f);
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        C5970w.m35258a(this.f26893c);
        this.f26894d.mo19174c();
        C5198b bVar = this.f26896f;
        if (bVar != null) {
            bVar.mo19178d();
        }
        C5208u uVar = this.f26895e;
        if (uVar != null) {
            uVar.mo19197d();
        }
        this.f26897g = 0;
        this.f26901k = -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f26898h = dVar.mo19165b();
        C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 2);
        this.f26899i = f;
        this.f26896f = new C5198b(f);
        C5191k0 k0Var = this.f26891a;
        if (k0Var != null) {
            k0Var.mo19168b(nVar, dVar);
        }
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f26901k = j;
        }
    }
}
