package p349s9;

import p212d9.C9914f;

/* renamed from: s9.p */
/* compiled from: DecodedNumeric */
final class C12486p extends C12487q {

    /* renamed from: b */
    private final int f45891b;

    /* renamed from: c */
    private final int f45892c;

    C12486p(int i, int i2, int i3) throws C9914f {
        super(i);
        if (i2 < 0 || i2 > 10 || i3 < 0 || i3 > 10) {
            throw C9914f.m50845a();
        }
        this.f45891b = i2;
        this.f45892c = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo37269b() {
        return this.f45891b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo37270c() {
        return this.f45892c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo37271d() {
        return this.f45891b == 10;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo37272e() {
        return this.f45892c == 10;
    }
}
