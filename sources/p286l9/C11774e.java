package p286l9;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p212d9.C9914f;

/* renamed from: l9.e */
/* compiled from: Version */
public final class C11774e {

    /* renamed from: h */
    private static final C11774e[] f44408h = m57098a();

    /* renamed from: a */
    private final int f44409a;

    /* renamed from: b */
    private final int f44410b;

    /* renamed from: c */
    private final int f44411c;

    /* renamed from: d */
    private final int f44412d;

    /* renamed from: e */
    private final int f44413e;

    /* renamed from: f */
    private final C11777c f44414f;

    /* renamed from: g */
    private final int f44415g;

    /* renamed from: l9.e$b */
    /* compiled from: Version */
    static final class C11776b {

        /* renamed from: a */
        private final int f44416a;

        /* renamed from: b */
        private final int f44417b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo36017a() {
            return this.f44416a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo36018b() {
            return this.f44417b;
        }

        private C11776b(int i, int i2) {
            this.f44416a = i;
            this.f44417b = i2;
        }
    }

    private C11774e(int i, int i2, int i3, int i4, int i5, C11777c cVar) {
        this.f44409a = i;
        this.f44410b = i2;
        this.f44411c = i3;
        this.f44412d = i4;
        this.f44413e = i5;
        this.f44414f = cVar;
        int b = cVar.mo36020b();
        int i6 = 0;
        for (C11776b bVar : cVar.mo36019a()) {
            i6 += bVar.mo36017a() * (bVar.mo36018b() + b);
        }
        this.f44415g = i6;
    }

    /* renamed from: a */
    private static C11774e[] m57098a() {
        return new C11774e[]{new C11774e(1, 10, 10, 8, 8, new C11777c(5, new C11776b(1, 3))), new C11774e(2, 12, 12, 10, 10, new C11777c(7, new C11776b(1, 5))), new C11774e(3, 14, 14, 12, 12, new C11777c(10, new C11776b(1, 8))), new C11774e(4, 16, 16, 14, 14, new C11777c(12, new C11776b(1, 12))), new C11774e(5, 18, 18, 16, 16, new C11777c(14, new C11776b(1, 18))), new C11774e(6, 20, 20, 18, 18, new C11777c(18, new C11776b(1, 22))), new C11774e(7, 22, 22, 20, 20, new C11777c(20, new C11776b(1, 30))), new C11774e(8, 24, 24, 22, 22, new C11777c(24, new C11776b(1, 36))), new C11774e(9, 26, 26, 24, 24, new C11777c(28, new C11776b(1, 44))), new C11774e(10, 32, 32, 14, 14, new C11777c(36, new C11776b(1, 62))), new C11774e(11, 36, 36, 16, 16, new C11777c(42, new C11776b(1, 86))), new C11774e(12, 40, 40, 18, 18, new C11777c(48, new C11776b(1, C8710R.styleable.AppCompatTheme_tooltipForegroundColor))), new C11774e(13, 44, 44, 20, 20, new C11777c(56, new C11776b(1, 144))), new C11774e(14, 48, 48, 22, 22, new C11777c(68, new C11776b(1, 174))), new C11774e(15, 52, 52, 24, 24, new C11777c(42, new C11776b(2, C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu))), new C11774e(16, 64, 64, 14, 14, new C11777c(56, new C11776b(2, 140))), new C11774e(17, 72, 72, 16, 16, new C11777c(36, new C11776b(4, 92))), new C11774e(18, 80, 80, 18, 18, new C11777c(48, new C11776b(4, C8710R.styleable.AppCompatTheme_tooltipForegroundColor))), new C11774e(19, 88, 88, 20, 20, new C11777c(56, new C11776b(4, 144))), new C11774e(20, 96, 96, 22, 22, new C11777c(68, new C11776b(4, 174))), new C11774e(21, C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary, C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 24, 24, new C11777c(56, new C11776b(6, 136))), new C11774e(22, 120, 120, 18, 18, new C11777c(68, new C11776b(6, 175))), new C11774e(23, 132, 132, 20, 20, new C11777c(62, new C11776b(8, 163))), new C11774e(24, 144, 144, 22, 22, new C11777c(62, new C11776b(8, 156), new C11776b(2, 155))), new C11774e(25, 8, 18, 6, 16, new C11777c(7, new C11776b(1, 5))), new C11774e(26, 8, 32, 6, 14, new C11777c(11, new C11776b(1, 10))), new C11774e(27, 12, 26, 10, 24, new C11777c(14, new C11776b(1, 16))), new C11774e(28, 12, 36, 10, 16, new C11777c(18, new C11776b(1, 22))), new C11774e(29, 16, 36, 14, 16, new C11777c(24, new C11776b(1, 32))), new C11774e(30, 16, 48, 14, 22, new C11777c(28, new C11776b(1, 49)))};
    }

    /* renamed from: h */
    public static C11774e m57099h(int i, int i2) throws C9914f {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            for (C11774e eVar : f44408h) {
                if (eVar.f44410b == i && eVar.f44411c == i2) {
                    return eVar;
                }
            }
            throw C9914f.m50845a();
        }
        throw C9914f.m50845a();
    }

    /* renamed from: b */
    public int mo36009b() {
        return this.f44413e;
    }

    /* renamed from: c */
    public int mo36010c() {
        return this.f44412d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C11777c mo36011d() {
        return this.f44414f;
    }

    /* renamed from: e */
    public int mo36012e() {
        return this.f44411c;
    }

    /* renamed from: f */
    public int mo36013f() {
        return this.f44410b;
    }

    /* renamed from: g */
    public int mo36014g() {
        return this.f44415g;
    }

    /* renamed from: i */
    public int mo36015i() {
        return this.f44409a;
    }

    public String toString() {
        return String.valueOf(this.f44409a);
    }

    /* renamed from: l9.e$c */
    /* compiled from: Version */
    static final class C11777c {

        /* renamed from: a */
        private final int f44418a;

        /* renamed from: b */
        private final C11776b[] f44419b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C11776b[] mo36019a() {
            return this.f44419b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo36020b() {
            return this.f44418a;
        }

        private C11777c(int i, C11776b bVar) {
            this.f44418a = i;
            this.f44419b = new C11776b[]{bVar};
        }

        private C11777c(int i, C11776b bVar, C11776b bVar2) {
            this.f44418a = i;
            this.f44419b = new C11776b[]{bVar, bVar2};
        }
    }
}
