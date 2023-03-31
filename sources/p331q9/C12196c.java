package p331q9;

import p212d9.C9924p;

/* renamed from: q9.c */
/* compiled from: FinderPattern */
public final class C12196c {

    /* renamed from: a */
    private final int f45289a;

    /* renamed from: b */
    private final int[] f45290b;

    /* renamed from: c */
    private final C9924p[] f45291c;

    public C12196c(int i, int[] iArr, int i2, int i3, int i4) {
        this.f45289a = i;
        this.f45290b = iArr;
        float f = (float) i4;
        this.f45291c = new C9924p[]{new C9924p((float) i2, f), new C9924p((float) i3, f)};
    }

    /* renamed from: a */
    public C9924p[] mo36718a() {
        return this.f45291c;
    }

    /* renamed from: b */
    public int[] mo36719b() {
        return this.f45290b;
    }

    /* renamed from: c */
    public int mo36720c() {
        return this.f45289a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C12196c) && this.f45289a == ((C12196c) obj).f45289a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f45289a;
    }
}
