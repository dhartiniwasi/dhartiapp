package p268j9;

/* renamed from: j9.c */
/* compiled from: ReedSolomonDecoder */
public final class C11503c {

    /* renamed from: a */
    private final C11501a f43930a;

    public C11503c(C11501a aVar) {
        this.f43930a = aVar;
    }

    /* renamed from: b */
    private int[] m56259b(C11502b bVar) throws C11504d {
        int d = bVar.mo35506d();
        int i = 0;
        if (d == 1) {
            return new int[]{bVar.mo35505c(1)};
        }
        int[] iArr = new int[d];
        for (int i2 = 1; i2 < this.f43930a.mo35497f() && i < d; i2++) {
            if (bVar.mo35504b(i2) == 0) {
                iArr[i] = this.f43930a.mo35499h(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw new C11504d("Error locator degree does not match number of roots");
    }

    /* renamed from: c */
    private int[] m56260c(C11502b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.f43930a.mo35499h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.f43930a.mo35501j(iArr[i3], h);
                    i2 = this.f43930a.mo35501j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.f43930a.mo35501j(bVar.mo35504b(h), this.f43930a.mo35499h(i2));
            if (this.f43930a.mo35495d() != 0) {
                iArr2[i] = this.f43930a.mo35501j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    /* renamed from: d */
    private C11502b[] m56261d(C11502b bVar, C11502b bVar2, int i) throws C11504d {
        if (bVar.mo35506d() < bVar2.mo35506d()) {
            C11502b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
        }
        C11502b g = this.f43930a.mo35498g();
        C11502b e = this.f43930a.mo35496e();
        do {
            C11502b bVar4 = r11;
            r11 = bVar;
            bVar = bVar4;
            C11502b bVar5 = e;
            C11502b bVar6 = g;
            g = bVar5;
            if (bVar.mo35506d() < i / 2) {
                int c = g.mo35505c(0);
                if (c != 0) {
                    int h = this.f43930a.mo35499h(c);
                    return new C11502b[]{g.mo35508f(h), bVar.mo35508f(h)};
                }
                throw new C11504d("sigmaTilde(0) was zero");
            } else if (!bVar.mo35507e()) {
                C11502b g2 = this.f43930a.mo35498g();
                int h2 = this.f43930a.mo35499h(bVar.mo35505c(bVar.mo35506d()));
                while (r11.mo35506d() >= bVar.mo35506d() && !r11.mo35507e()) {
                    int d = r11.mo35506d() - bVar.mo35506d();
                    int j = this.f43930a.mo35501j(r11.mo35505c(r11.mo35506d()), h2);
                    g2 = g2.mo35503a(this.f43930a.mo35493b(d, j));
                    r11 = r11.mo35503a(bVar.mo35510h(d, j));
                }
                e = g2.mo35509g(g).mo35503a(bVar6);
            } else {
                throw new C11504d("r_{i-1} was zero");
            }
        } while (r11.mo35506d() < bVar.mo35506d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    /* renamed from: a */
    public void mo35512a(int[] iArr, int i) throws C11504d {
        C11502b bVar = new C11502b(this.f43930a, iArr);
        int[] iArr2 = new int[i];
        int i2 = 0;
        boolean z = true;
        for (int i3 = 0; i3 < i; i3++) {
            C11501a aVar = this.f43930a;
            int b = bVar.mo35504b(aVar.mo35494c(aVar.mo35495d() + i3));
            iArr2[(i - 1) - i3] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            C11502b[] d = m56261d(this.f43930a.mo35493b(i, 1), new C11502b(this.f43930a, iArr2), i);
            C11502b bVar2 = d[0];
            C11502b bVar3 = d[1];
            int[] b2 = m56259b(bVar2);
            int[] c = m56260c(bVar3, b2);
            while (i2 < b2.length) {
                int length = (iArr.length - 1) - this.f43930a.mo35500i(b2[i2]);
                if (length >= 0) {
                    iArr[length] = C11501a.m56241a(iArr[length], c[i2]);
                    i2++;
                } else {
                    throw new C11504d("Bad error location");
                }
            }
        }
    }
}
