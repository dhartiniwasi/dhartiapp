package p368u9;

import java.util.Formatter;

/* renamed from: u9.f */
/* compiled from: DetectionResult */
final class C12717f {

    /* renamed from: a */
    private final C12710a f46511a;

    /* renamed from: b */
    private final C12718g[] f46512b;

    /* renamed from: c */
    private C12712c f46513c;

    /* renamed from: d */
    private final int f46514d;

    C12717f(C12710a aVar, C12712c cVar) {
        this.f46511a = aVar;
        int a = aVar.mo37580a();
        this.f46514d = a;
        this.f46513c = cVar;
        this.f46512b = new C12718g[(a + 2)];
    }

    /* renamed from: a */
    private void m60290a(C12718g gVar) {
        if (gVar != null) {
            ((C12719h) gVar).mo37623g(this.f46511a);
        }
    }

    /* renamed from: b */
    private static boolean m60291b(C12713d dVar, C12713d dVar2) {
        if (dVar2 == null || !dVar2.mo37602g() || dVar2.mo37596a() != dVar.mo37596a()) {
            return false;
        }
        dVar.mo37604i(dVar2.mo37598c());
        return true;
    }

    /* renamed from: c */
    private static int m60292c(int i, int i2, C12713d dVar) {
        if (dVar == null || dVar.mo37602g()) {
            return i2;
        }
        if (!dVar.mo37603h(i)) {
            return i2 + 1;
        }
        dVar.mo37604i(i);
        return 0;
    }

    /* renamed from: d */
    private int m60293d() {
        int f = m60295f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f46514d + 1; i++) {
            C12713d[] d = this.f46512b[i].mo37619d();
            for (int i2 = 0; i2 < d.length; i2++) {
                if (d[i2] != null && !d[i2].mo37602g()) {
                    m60294e(i, i2, d);
                }
            }
        }
        return f;
    }

    /* renamed from: e */
    private void m60294e(int i, int i2, C12713d[] dVarArr) {
        C12713d dVar = dVarArr[i2];
        C12713d[] d = this.f46512b[i - 1].mo37619d();
        C12718g[] gVarArr = this.f46512b;
        int i3 = i + 1;
        C12713d[] d2 = gVarArr[i3] != null ? gVarArr[i3].mo37619d() : d;
        C12713d[] dVarArr2 = new C12713d[14];
        dVarArr2[2] = d[i2];
        dVarArr2[3] = d2[i2];
        int i4 = 0;
        if (i2 > 0) {
            int i5 = i2 - 1;
            dVarArr2[0] = dVarArr[i5];
            dVarArr2[4] = d[i5];
            dVarArr2[5] = d2[i5];
        }
        if (i2 > 1) {
            int i6 = i2 - 2;
            dVarArr2[8] = dVarArr[i6];
            dVarArr2[10] = d[i6];
            dVarArr2[11] = d2[i6];
        }
        if (i2 < dVarArr.length - 1) {
            int i7 = i2 + 1;
            dVarArr2[1] = dVarArr[i7];
            dVarArr2[6] = d[i7];
            dVarArr2[7] = d2[i7];
        }
        if (i2 < dVarArr.length - 2) {
            int i8 = i2 + 2;
            dVarArr2[9] = dVarArr[i8];
            dVarArr2[12] = d[i8];
            dVarArr2[13] = d2[i8];
        }
        while (i4 < 14 && !m60291b(dVar, dVarArr2[i4])) {
            i4++;
        }
    }

    /* renamed from: f */
    private int m60295f() {
        m60296g();
        return m60297h() + m60298i();
    }

    /* renamed from: g */
    private void m60296g() {
        C12718g[] gVarArr = this.f46512b;
        if (gVarArr[0] != null && gVarArr[this.f46514d + 1] != null) {
            C12713d[] d = gVarArr[0].mo37619d();
            C12713d[] d2 = this.f46512b[this.f46514d + 1].mo37619d();
            for (int i = 0; i < d.length; i++) {
                if (!(d[i] == null || d2[i] == null || d[i].mo37598c() != d2[i].mo37598c())) {
                    for (int i2 = 1; i2 <= this.f46514d; i2++) {
                        C12713d dVar = this.f46512b[i2].mo37619d()[i];
                        if (dVar != null) {
                            dVar.mo37604i(d[i].mo37598c());
                            if (!dVar.mo37602g()) {
                                this.f46512b[i2].mo37619d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m60297h() {
        C12718g[] gVarArr = this.f46512b;
        if (gVarArr[0] == null) {
            return 0;
        }
        C12713d[] d = gVarArr[0].mo37619d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            if (d[i2] != null) {
                int c = d[i2].mo37598c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f46514d + 1 && i3 < 2; i4++) {
                    C12713d dVar = this.f46512b[i4].mo37619d()[i2];
                    if (dVar != null) {
                        i3 = m60292c(c, i3, dVar);
                        if (!dVar.mo37602g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    private int m60298i() {
        C12718g[] gVarArr = this.f46512b;
        int i = this.f46514d;
        if (gVarArr[i + 1] == null) {
            return 0;
        }
        C12713d[] d = gVarArr[i + 1].mo37619d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            if (d[i3] != null) {
                int c = d[i3].mo37598c();
                int i4 = 0;
                for (int i5 = this.f46514d + 1; i5 > 0 && i4 < 2; i5--) {
                    C12713d dVar = this.f46512b[i5].mo37619d()[i3];
                    if (dVar != null) {
                        i4 = m60292c(c, i4, dVar);
                        if (!dVar.mo37602g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo37607j() {
        return this.f46514d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo37608k() {
        return this.f46511a.mo37581b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo37609l() {
        return this.f46511a.mo37582c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C12712c mo37610m() {
        return this.f46513c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C12718g mo37611n(int i) {
        return this.f46512b[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C12718g[] mo37612o() {
        m60290a(this.f46512b[0]);
        m60290a(this.f46512b[this.f46514d + 1]);
        int i = 928;
        while (true) {
            int d = m60293d();
            if (d > 0 && d < i) {
                i = d;
            }
        }
        return this.f46512b;
    }

    /* renamed from: p */
    public void mo37613p(C12712c cVar) {
        this.f46513c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo37614q(int i, C12718g gVar) {
        this.f46512b[i] = gVar;
    }

    public String toString() {
        C12718g[] gVarArr = this.f46512b;
        C12718g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f46514d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < gVar.mo37619d().length; i++) {
            formatter.format("CW %3d:", new Object[]{Integer.valueOf(i)});
            for (int i2 = 0; i2 < this.f46514d + 2; i2++) {
                C12718g[] gVarArr2 = this.f46512b;
                if (gVarArr2[i2] == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    C12713d dVar = gVarArr2[i2].mo37619d()[i];
                    if (dVar == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", new Object[]{Integer.valueOf(dVar.mo37598c()), Integer.valueOf(dVar.mo37600e())});
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
