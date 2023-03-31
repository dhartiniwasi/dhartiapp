package p415z9;

import java.util.ArrayList;
import java.util.List;
import p212d9.C9918j;
import p212d9.C9925q;
import p248h9.C10476b;

/* renamed from: z9.b */
/* compiled from: AlignmentPatternFinder */
final class C13476b {

    /* renamed from: a */
    private final C10476b f47843a;

    /* renamed from: b */
    private final List<C13475a> f47844b = new ArrayList(5);

    /* renamed from: c */
    private final int f47845c;

    /* renamed from: d */
    private final int f47846d;

    /* renamed from: e */
    private final int f47847e;

    /* renamed from: f */
    private final int f47848f;

    /* renamed from: g */
    private final float f47849g;

    /* renamed from: h */
    private final int[] f47850h;

    /* renamed from: i */
    private final C9925q f47851i;

    C13476b(C10476b bVar, int i, int i2, int i3, int i4, float f, C9925q qVar) {
        this.f47843a = bVar;
        this.f47845c = i;
        this.f47846d = i2;
        this.f47847e = i3;
        this.f47848f = i4;
        this.f47849g = f;
        this.f47850h = new int[3];
        this.f47851i = qVar;
    }

    /* renamed from: a */
    private static float m62562a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    /* renamed from: b */
    private float m62563b(int i, int i2, int i3, int i4) {
        C10476b bVar = this.f47843a;
        int g = bVar.mo33574g();
        int[] iArr = this.f47850h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bVar.mo33570d(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bVar.mo33570d(i2, i5) && iArr[0] <= i3) {
                iArr[0] = iArr[0] + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i6 = i + 1;
            while (i6 < g && bVar.mo33570d(i2, i6) && iArr[1] <= i3) {
                iArr[1] = iArr[1] + 1;
                i6++;
            }
            if (i6 != g && iArr[1] <= i3) {
                while (i6 < g && !bVar.mo33570d(i2, i6) && iArr[2] <= i3) {
                    iArr[2] = iArr[2] + 1;
                    i6++;
                }
                if (iArr[2] <= i3 && Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 < i4 * 2 && m62564d(iArr)) {
                    return m62562a(iArr, i6);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m62564d(int[] iArr) {
        float f = this.f47849g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - ((float) iArr[i])) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C13475a m62565e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float a = m62562a(iArr, i2);
        float b = m62563b(i, (int) a, iArr[1] * 2, i3);
        if (Float.isNaN(b)) {
            return null;
        }
        float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
        for (C13475a next : this.f47844b) {
            if (next.mo38594f(f, b, a)) {
                return next.mo38595g(b, a, f);
            }
        }
        C13475a aVar = new C13475a(a, b, f);
        this.f47844b.add(aVar);
        C9925q qVar = this.f47851i;
        if (qVar == null) {
            return null;
        }
        qVar.mo32485a(aVar);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C13475a mo38596c() throws C9918j {
        C13475a e;
        C13475a e2;
        int i = this.f47845c;
        int i2 = this.f47848f;
        int i3 = this.f47847e + i;
        int i4 = this.f47846d + (i2 / 2);
        int[] iArr = new int[3];
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = ((i5 & 1) == 0 ? (i5 + 1) / 2 : -((i5 + 1) / 2)) + i4;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i7 = i;
            while (i7 < i3 && !this.f47843a.mo33570d(i7, i6)) {
                i7++;
            }
            int i8 = 0;
            while (i7 < i3) {
                if (!this.f47843a.mo33570d(i7, i6)) {
                    if (i8 == 1) {
                        i8++;
                    }
                    iArr[i8] = iArr[i8] + 1;
                } else if (i8 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i8 != 2) {
                    i8++;
                    iArr[i8] = iArr[i8] + 1;
                } else if (m62564d(iArr) && (e2 = m62565e(iArr, i6, i7)) != null) {
                    return e2;
                } else {
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i8 = 1;
                }
                i7++;
            }
            if (m62564d(iArr) && (e = m62565e(iArr, i6, i3)) != null) {
                return e;
            }
        }
        if (!this.f47844b.isEmpty()) {
            return this.f47844b.get(0);
        }
        throw C9918j.m50862a();
    }
}
