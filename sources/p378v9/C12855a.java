package p378v9;

import p212d9.C9912d;

/* renamed from: v9.a */
/* compiled from: ErrorCorrection */
public final class C12855a {

    /* renamed from: a */
    private final C12856b f46959a = C12856b.f46960f;

    /* renamed from: b */
    private int[] m60800b(C12857c cVar) throws C9912d {
        int d = cVar.mo37858d();
        int[] iArr = new int[d];
        int i = 0;
        for (int i2 = 1; i2 < this.f46959a.mo37849e() && i < d; i2++) {
            if (cVar.mo37856b(i2) == 0) {
                iArr[i] = this.f46959a.mo37851g(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw C9912d.m50844a();
    }

    /* renamed from: c */
    private int[] m60801c(C12857c cVar, C12857c cVar2, int[] iArr) {
        int d = cVar2.mo37858d();
        int[] iArr2 = new int[d];
        for (int i = 1; i <= d; i++) {
            iArr2[d - i] = this.f46959a.mo37853i(i, cVar2.mo37857c(i));
        }
        C12857c cVar3 = new C12857c(this.f46959a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int g = this.f46959a.mo37851g(iArr[i2]);
            iArr3[i2] = this.f46959a.mo37853i(this.f46959a.mo37854j(0, cVar.mo37856b(g)), this.f46959a.mo37851g(cVar3.mo37856b(g)));
        }
        return iArr3;
    }

    /* renamed from: d */
    private C12857c[] m60802d(C12857c cVar, C12857c cVar2, int i) throws C9912d {
        if (cVar.mo37858d() < cVar2.mo37858d()) {
            C12857c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        C12857c f = this.f46959a.mo37850f();
        C12857c d = this.f46959a.mo37848d();
        while (true) {
            C12857c cVar4 = r11;
            r11 = cVar;
            cVar = cVar4;
            C12857c cVar5 = d;
            C12857c cVar6 = f;
            f = cVar5;
            if (cVar.mo37858d() < i / 2) {
                int c = f.mo37857c(0);
                if (c != 0) {
                    int g = this.f46959a.mo37851g(c);
                    return new C12857c[]{f.mo37860f(g), cVar.mo37860f(g)};
                }
                throw C9912d.m50844a();
            } else if (!cVar.mo37859e()) {
                C12857c f2 = this.f46959a.mo37850f();
                int g2 = this.f46959a.mo37851g(cVar.mo37857c(cVar.mo37858d()));
                while (r11.mo37858d() >= cVar.mo37858d() && !r11.mo37859e()) {
                    int d2 = r11.mo37858d() - cVar.mo37858d();
                    int i2 = this.f46959a.mo37853i(r11.mo37857c(r11.mo37858d()), g2);
                    f2 = f2.mo37855a(this.f46959a.mo37846b(d2, i2));
                    r11 = r11.mo37864j(cVar.mo37862h(d2, i2));
                }
                d = f2.mo37861g(f).mo37864j(cVar6).mo37863i();
            } else {
                throw C9912d.m50844a();
            }
        }
    }

    /* renamed from: a */
    public int mo37844a(int[] iArr, int i, int[] iArr2) throws C9912d {
        C12857c cVar = new C12857c(this.f46959a, iArr);
        int[] iArr3 = new int[i];
        int i2 = 0;
        boolean z = false;
        for (int i3 = i; i3 > 0; i3--) {
            int b = cVar.mo37856b(this.f46959a.mo37847c(i3));
            iArr3[i - i3] = b;
            if (b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C12857c d = this.f46959a.mo37848d();
        if (iArr2 != null) {
            for (int length : iArr2) {
                int c = this.f46959a.mo37847c((iArr.length - 1) - length);
                C12856b bVar = this.f46959a;
                d = d.mo37861g(new C12857c(bVar, new int[]{bVar.mo37854j(0, c), 1}));
            }
        }
        C12857c[] d2 = m60802d(this.f46959a.mo37846b(i, 1), new C12857c(this.f46959a, iArr3), i);
        C12857c cVar2 = d2[0];
        C12857c cVar3 = d2[1];
        int[] b2 = m60800b(cVar2);
        int[] c2 = m60801c(cVar3, cVar2, b2);
        while (i2 < b2.length) {
            int length2 = (iArr.length - 1) - this.f46959a.mo37852h(b2[i2]);
            if (length2 >= 0) {
                iArr[length2] = this.f46959a.mo37854j(iArr[length2], c2[i2]);
                i2++;
            } else {
                throw C9912d.m50844a();
            }
        }
        return b2.length;
    }
}
