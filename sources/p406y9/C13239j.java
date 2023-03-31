package p406y9;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p212d9.C9914f;
import p248h9.C10476b;

/* renamed from: y9.j */
/* compiled from: Version */
public final class C13239j {

    /* renamed from: e */
    private static final int[] f47516e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    private static final C13239j[] f47517f = m62054b();

    /* renamed from: a */
    private final int f47518a;

    /* renamed from: b */
    private final int[] f47519b;

    /* renamed from: c */
    private final C13241b[] f47520c;

    /* renamed from: d */
    private final int f47521d;

    /* renamed from: y9.j$a */
    /* compiled from: Version */
    public static final class C13240a {

        /* renamed from: a */
        private final int f47522a;

        /* renamed from: b */
        private final int f47523b;

        C13240a(int i, int i2) {
            this.f47522a = i;
            this.f47523b = i2;
        }

        /* renamed from: a */
        public int mo38342a() {
            return this.f47522a;
        }

        /* renamed from: b */
        public int mo38343b() {
            return this.f47523b;
        }
    }

    /* renamed from: y9.j$b */
    /* compiled from: Version */
    public static final class C13241b {

        /* renamed from: a */
        private final int f47524a;

        /* renamed from: b */
        private final C13240a[] f47525b;

        C13241b(int i, C13240a... aVarArr) {
            this.f47524a = i;
            this.f47525b = aVarArr;
        }

        /* renamed from: a */
        public C13240a[] mo38344a() {
            return this.f47525b;
        }

        /* renamed from: b */
        public int mo38345b() {
            return this.f47524a;
        }
    }

    private C13239j(int i, int[] iArr, C13241b... bVarArr) {
        this.f47518a = i;
        this.f47519b = iArr;
        this.f47520c = bVarArr;
        int b = bVarArr[0].mo38345b();
        int i2 = 0;
        for (C13240a aVar : bVarArr[0].mo38344a()) {
            i2 += aVar.mo38342a() * (aVar.mo38343b() + b);
        }
        this.f47521d = i2;
    }

    /* renamed from: b */
    private static C13239j[] m62054b() {
        return new C13239j[]{new C13239j(1, new int[0], new C13241b(7, new C13240a(1, 19)), new C13241b(10, new C13240a(1, 16)), new C13241b(13, new C13240a(1, 13)), new C13241b(17, new C13240a(1, 9))), new C13239j(2, new int[]{6, 18}, new C13241b(10, new C13240a(1, 34)), new C13241b(16, new C13240a(1, 28)), new C13241b(22, new C13240a(1, 22)), new C13241b(28, new C13240a(1, 16))), new C13239j(3, new int[]{6, 22}, new C13241b(15, new C13240a(1, 55)), new C13241b(26, new C13240a(1, 44)), new C13241b(18, new C13240a(2, 17)), new C13241b(22, new C13240a(2, 13))), new C13239j(4, new int[]{6, 26}, new C13241b(20, new C13240a(1, 80)), new C13241b(18, new C13240a(2, 32)), new C13241b(26, new C13240a(2, 24)), new C13241b(16, new C13240a(4, 9))), new C13239j(5, new int[]{6, 30}, new C13241b(26, new C13240a(1, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new C13241b(24, new C13240a(2, 43)), new C13241b(18, new C13240a(2, 15), new C13240a(2, 16)), new C13241b(22, new C13240a(2, 11), new C13240a(2, 12))), new C13239j(6, new int[]{6, 34}, new C13241b(18, new C13240a(2, 68)), new C13241b(16, new C13240a(4, 27)), new C13241b(24, new C13240a(4, 19)), new C13241b(28, new C13240a(4, 15))), new C13239j(7, new int[]{6, 22, 38}, new C13241b(20, new C13240a(2, 78)), new C13241b(18, new C13240a(4, 31)), new C13241b(18, new C13240a(2, 14), new C13240a(4, 15)), new C13241b(26, new C13240a(4, 13), new C13240a(1, 14))), new C13239j(8, new int[]{6, 24, 42}, new C13241b(24, new C13240a(2, 97)), new C13241b(22, new C13240a(2, 38), new C13240a(2, 39)), new C13241b(22, new C13240a(4, 18), new C13240a(2, 19)), new C13241b(26, new C13240a(4, 14), new C13240a(2, 15))), new C13239j(9, new int[]{6, 26, 46}, new C13241b(30, new C13240a(2, 116)), new C13241b(22, new C13240a(3, 36), new C13240a(2, 37)), new C13241b(20, new C13240a(4, 16), new C13240a(4, 17)), new C13241b(24, new C13240a(4, 12), new C13240a(4, 13))), new C13239j(10, new int[]{6, 28, 50}, new C13241b(18, new C13240a(2, 68), new C13240a(2, 69)), new C13241b(26, new C13240a(4, 43), new C13240a(1, 44)), new C13241b(24, new C13240a(6, 19), new C13240a(2, 20)), new C13241b(28, new C13240a(6, 15), new C13240a(2, 16))), new C13239j(11, new int[]{6, 30, 54}, new C13241b(20, new C13240a(4, 81)), new C13241b(30, new C13240a(1, 50), new C13240a(4, 51)), new C13241b(28, new C13240a(4, 22), new C13240a(4, 23)), new C13241b(24, new C13240a(3, 12), new C13240a(8, 13))), new C13239j(12, new int[]{6, 32, 58}, new C13241b(24, new C13240a(2, 92), new C13240a(2, 93)), new C13241b(22, new C13240a(6, 36), new C13240a(2, 37)), new C13241b(26, new C13240a(4, 20), new C13240a(6, 21)), new C13241b(28, new C13240a(7, 14), new C13240a(4, 15))), new C13239j(13, new int[]{6, 34, 62}, new C13241b(26, new C13240a(4, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle)), new C13241b(22, new C13240a(8, 37), new C13240a(1, 38)), new C13241b(24, new C13240a(8, 20), new C13240a(4, 21)), new C13241b(22, new C13240a(12, 11), new C13240a(4, 12))), new C13239j(14, new int[]{6, 26, 46, 66}, new C13241b(30, new C13240a(3, C8710R.styleable.AppCompatTheme_tooltipFrameBackground), new C13240a(1, 116)), new C13241b(24, new C13240a(4, 40), new C13240a(5, 41)), new C13241b(20, new C13240a(11, 16), new C13240a(5, 17)), new C13241b(24, new C13240a(11, 12), new C13240a(5, 13))), new C13239j(15, new int[]{6, 26, 48, 70}, new C13241b(22, new C13240a(5, 87), new C13240a(1, 88)), new C13241b(24, new C13240a(5, 41), new C13240a(5, 42)), new C13241b(30, new C13240a(5, 24), new C13240a(7, 25)), new C13241b(24, new C13240a(11, 12), new C13240a(7, 13))), new C13239j(16, new int[]{6, 26, 50, 74}, new C13241b(24, new C13240a(5, 98), new C13240a(1, 99)), new C13241b(28, new C13240a(7, 45), new C13240a(3, 46)), new C13241b(24, new C13240a(15, 19), new C13240a(2, 20)), new C13241b(30, new C13240a(3, 15), new C13240a(13, 16))), new C13239j(17, new int[]{6, 30, 54, 78}, new C13241b(28, new C13240a(1, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle), new C13240a(5, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new C13241b(28, new C13240a(10, 46), new C13240a(1, 47)), new C13241b(28, new C13240a(1, 22), new C13240a(15, 23)), new C13241b(28, new C13240a(2, 14), new C13240a(17, 15))), new C13239j(18, new int[]{6, 30, 56, 82}, new C13241b(30, new C13240a(5, 120), new C13240a(1, 121)), new C13241b(26, new C13240a(9, 43), new C13240a(4, 44)), new C13241b(28, new C13240a(17, 22), new C13240a(1, 23)), new C13241b(28, new C13240a(2, 14), new C13240a(19, 15))), new C13239j(19, new int[]{6, 30, 58, 86}, new C13241b(28, new C13240a(3, C8710R.styleable.AppCompatTheme_toolbarStyle), new C13240a(4, C8710R.styleable.AppCompatTheme_tooltipForegroundColor)), new C13241b(26, new C13240a(3, 44), new C13240a(11, 45)), new C13241b(26, new C13240a(17, 21), new C13240a(4, 22)), new C13241b(26, new C13240a(9, 13), new C13240a(16, 14))), new C13239j(20, new int[]{6, 34, 62, 90}, new C13241b(28, new C13240a(3, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle), new C13240a(5, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new C13241b(26, new C13240a(3, 41), new C13240a(13, 42)), new C13241b(30, new C13240a(15, 24), new C13240a(5, 25)), new C13241b(28, new C13240a(15, 15), new C13240a(10, 16))), new C13239j(21, new int[]{6, 28, 50, 72, 94}, new C13241b(28, new C13240a(4, 116), new C13240a(4, 117)), new C13241b(26, new C13240a(17, 42)), new C13241b(28, new C13240a(17, 22), new C13240a(6, 23)), new C13241b(30, new C13240a(19, 16), new C13240a(6, 17))), new C13239j(22, new int[]{6, 26, 50, 74, 98}, new C13241b(28, new C13240a(2, C8710R.styleable.AppCompatTheme_textColorSearchUrl), new C13240a(7, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new C13241b(28, new C13240a(17, 46)), new C13241b(30, new C13240a(7, 24), new C13240a(16, 25)), new C13241b(24, new C13240a(34, 13))), new C13239j(23, new int[]{6, 30, 54, 78, C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, new C13241b(30, new C13240a(4, 121), new C13240a(5, 122)), new C13241b(28, new C13240a(4, 47), new C13240a(14, 48)), new C13241b(30, new C13240a(11, 24), new C13240a(14, 25)), new C13241b(30, new C13240a(16, 15), new C13240a(14, 16))), new C13239j(24, new int[]{6, 28, 54, 80, C8710R.styleable.AppCompatTheme_textAppearancePopupMenuHeader}, new C13241b(30, new C13240a(6, 117), new C13240a(4, 118)), new C13241b(28, new C13240a(6, 45), new C13240a(14, 46)), new C13241b(30, new C13240a(11, 24), new C13240a(16, 25)), new C13241b(30, new C13240a(30, 16), new C13240a(2, 17))), new C13239j(25, new int[]{6, 32, 58, 84, C8710R.styleable.AppCompatTheme_textColorAlertDialogListItem}, new C13241b(26, new C13240a(8, C8710R.styleable.AppCompatTheme_textAppearancePopupMenuHeader), new C13240a(4, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle)), new C13241b(28, new C13240a(8, 47), new C13240a(13, 48)), new C13241b(30, new C13240a(7, 24), new C13240a(22, 25)), new C13241b(30, new C13240a(22, 15), new C13240a(13, 16))), new C13239j(26, new int[]{6, 30, 58, 86, C8710R.styleable.AppCompatTheme_tooltipForegroundColor}, new C13241b(28, new C13240a(10, C8710R.styleable.AppCompatTheme_tooltipForegroundColor), new C13240a(2, C8710R.styleable.AppCompatTheme_tooltipFrameBackground)), new C13241b(28, new C13240a(19, 46), new C13240a(4, 47)), new C13241b(28, new C13240a(28, 22), new C13240a(6, 23)), new C13241b(30, new C13240a(33, 16), new C13240a(4, 17))), new C13239j(27, new int[]{6, 34, 62, 90, 118}, new C13241b(30, new C13240a(8, 122), new C13240a(4, 123)), new C13241b(28, new C13240a(22, 45), new C13240a(3, 46)), new C13241b(30, new C13240a(8, 23), new C13240a(26, 24)), new C13241b(30, new C13240a(12, 15), new C13240a(28, 16))), new C13239j(28, new int[]{6, 26, 50, 74, 98, 122}, new C13241b(30, new C13240a(3, 117), new C13240a(10, 118)), new C13241b(28, new C13240a(3, 45), new C13240a(23, 46)), new C13241b(30, new C13240a(4, 24), new C13240a(31, 25)), new C13241b(30, new C13240a(11, 15), new C13240a(31, 16))), new C13239j(29, new int[]{6, 30, 54, 78, C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 126}, new C13241b(30, new C13240a(7, 116), new C13240a(7, 117)), new C13241b(28, new C13240a(21, 45), new C13240a(7, 46)), new C13241b(30, new C13240a(1, 23), new C13240a(37, 24)), new C13241b(30, new C13240a(19, 15), new C13240a(26, 16))), new C13239j(30, new int[]{6, 26, 52, 78, C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 130}, new C13241b(30, new C13240a(5, C8710R.styleable.AppCompatTheme_tooltipFrameBackground), new C13240a(10, 116)), new C13241b(28, new C13240a(19, 47), new C13240a(10, 48)), new C13241b(30, new C13240a(15, 24), new C13240a(25, 25)), new C13241b(30, new C13240a(23, 15), new C13240a(25, 16))), new C13239j(31, new int[]{6, 30, 56, 82, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 134}, new C13241b(30, new C13240a(13, C8710R.styleable.AppCompatTheme_tooltipFrameBackground), new C13240a(3, 116)), new C13241b(28, new C13240a(2, 46), new C13240a(29, 47)), new C13241b(30, new C13240a(42, 24), new C13240a(1, 25)), new C13241b(30, new C13240a(23, 15), new C13240a(28, 16))), new C13239j(32, new int[]{6, 34, 60, 86, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 138}, new C13241b(30, new C13240a(17, C8710R.styleable.AppCompatTheme_tooltipFrameBackground)), new C13241b(28, new C13240a(10, 46), new C13240a(23, 47)), new C13241b(30, new C13240a(10, 24), new C13240a(35, 25)), new C13241b(30, new C13240a(19, 15), new C13240a(35, 16))), new C13239j(33, new int[]{6, 30, 58, 86, C8710R.styleable.AppCompatTheme_tooltipForegroundColor, 142}, new C13241b(30, new C13240a(17, C8710R.styleable.AppCompatTheme_tooltipFrameBackground), new C13240a(1, 116)), new C13241b(28, new C13240a(14, 46), new C13240a(21, 47)), new C13241b(30, new C13240a(29, 24), new C13240a(19, 25)), new C13241b(30, new C13240a(11, 15), new C13240a(46, 16))), new C13239j(34, new int[]{6, 34, 62, 90, 118, 146}, new C13241b(30, new C13240a(13, C8710R.styleable.AppCompatTheme_tooltipFrameBackground), new C13240a(6, 116)), new C13241b(28, new C13240a(14, 46), new C13240a(23, 47)), new C13241b(30, new C13240a(44, 24), new C13240a(7, 25)), new C13241b(30, new C13240a(59, 16), new C13240a(1, 17))), new C13239j(35, new int[]{6, 30, 54, 78, C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 126, 150}, new C13241b(30, new C13240a(12, 121), new C13240a(7, 122)), new C13241b(28, new C13240a(12, 47), new C13240a(26, 48)), new C13241b(30, new C13240a(39, 24), new C13240a(14, 25)), new C13241b(30, new C13240a(22, 15), new C13240a(41, 16))), new C13239j(36, new int[]{6, 24, 50, 76, C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 128, 154}, new C13241b(30, new C13240a(6, 121), new C13240a(14, 122)), new C13241b(28, new C13240a(6, 47), new C13240a(34, 48)), new C13241b(30, new C13240a(46, 24), new C13240a(10, 25)), new C13241b(30, new C13240a(2, 15), new C13240a(64, 16))), new C13239j(37, new int[]{6, 28, 54, 80, C8710R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 132, 158}, new C13241b(30, new C13240a(17, 122), new C13240a(4, 123)), new C13241b(28, new C13240a(29, 46), new C13240a(14, 47)), new C13241b(30, new C13240a(49, 24), new C13240a(10, 25)), new C13241b(30, new C13240a(24, 15), new C13240a(46, 16))), new C13239j(38, new int[]{6, 32, 58, 84, C8710R.styleable.AppCompatTheme_textColorAlertDialogListItem, 136, 162}, new C13241b(30, new C13240a(4, 122), new C13240a(18, 123)), new C13241b(28, new C13240a(13, 46), new C13240a(32, 47)), new C13241b(30, new C13240a(48, 24), new C13240a(14, 25)), new C13241b(30, new C13240a(42, 15), new C13240a(32, 16))), new C13239j(39, new int[]{6, 26, 54, 82, C8710R.styleable.AppCompatTheme_textColorAlertDialogListItem, 138, 166}, new C13241b(30, new C13240a(20, 117), new C13240a(4, 118)), new C13241b(28, new C13240a(40, 47), new C13240a(7, 48)), new C13241b(30, new C13240a(43, 24), new C13240a(22, 25)), new C13241b(30, new C13240a(10, 15), new C13240a(67, 16))), new C13239j(40, new int[]{6, 30, 58, 86, C8710R.styleable.AppCompatTheme_tooltipForegroundColor, 142, 170}, new C13241b(30, new C13240a(19, 118), new C13240a(6, 119)), new C13241b(28, new C13240a(18, 47), new C13240a(31, 48)), new C13241b(30, new C13240a(34, 24), new C13240a(34, 25)), new C13241b(30, new C13240a(20, 15), new C13240a(61, 16)))};
    }

    /* renamed from: c */
    static C13239j m62055c(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = Integer.MAX_VALUE;
        while (true) {
            int[] iArr = f47516e;
            if (i2 < iArr.length) {
                int i5 = iArr[i2];
                if (i5 == i) {
                    return m62057i(i2 + 7);
                }
                int e = C13236g.m62048e(i, i5);
                if (e < i4) {
                    i3 = i2 + 7;
                    i4 = e;
                }
                i2++;
            } else if (i4 <= 3) {
                return m62057i(i3);
            } else {
                return null;
            }
        }
    }

    /* renamed from: g */
    public static C13239j m62056g(int i) throws C9914f {
        if (i % 4 == 1) {
            try {
                return m62057i((i - 17) / 4);
            } catch (IllegalArgumentException unused) {
                throw C9914f.m50845a();
            }
        } else {
            throw C9914f.m50845a();
        }
    }

    /* renamed from: i */
    public static C13239j m62057i(int i) {
        if (i > 0 && i <= 40) {
            return f47517f[i - 1];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C10476b mo38335a() {
        int e = mo38337e();
        C10476b bVar = new C10476b(e);
        bVar.mo33581m(0, 0, 9, 9);
        int i = e - 8;
        bVar.mo33581m(i, 0, 8, 9);
        bVar.mo33581m(0, i, 9, 8);
        int length = this.f47519b.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.f47519b[i2] - 2;
            for (int i4 = 0; i4 < length; i4++) {
                if (!((i2 == 0 && (i4 == 0 || i4 == length - 1)) || (i2 == length - 1 && i4 == 0))) {
                    bVar.mo33581m(this.f47519b[i4] - 2, i3, 5, 5);
                }
            }
        }
        int i5 = e - 17;
        bVar.mo33581m(6, 9, 1, i5);
        bVar.mo33581m(9, 6, i5, 1);
        if (this.f47518a > 6) {
            int i6 = e - 11;
            bVar.mo33581m(i6, 0, 3, 6);
            bVar.mo33581m(0, i6, 6, 3);
        }
        return bVar;
    }

    /* renamed from: d */
    public int[] mo38336d() {
        return this.f47519b;
    }

    /* renamed from: e */
    public int mo38337e() {
        return (this.f47518a * 4) + 17;
    }

    /* renamed from: f */
    public C13241b mo38338f(C13235f fVar) {
        return this.f47520c[fVar.ordinal()];
    }

    /* renamed from: h */
    public int mo38339h() {
        return this.f47521d;
    }

    /* renamed from: j */
    public int mo38340j() {
        return this.f47518a;
    }

    public String toString() {
        return String.valueOf(this.f47518a);
    }
}
