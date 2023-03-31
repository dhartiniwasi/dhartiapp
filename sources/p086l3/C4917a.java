package p086l3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p079k3.C4864b;
import p079k3.C4874h;
import p079k3.C4876j;
import p079k3.C4879l;
import p079k3.C4880m;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: l3.a */
/* compiled from: Cea608Decoder */
public final class C4917a extends C4924e {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final int[] f25906A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    private static final int[] f25907B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, C8710R.styleable.AppCompatTheme_switchStyle, C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, C8710R.styleable.AppCompatTheme_textAppearanceListItem, C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary, C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall, C8710R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C8710R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, C8710R.styleable.AppCompatTheme_textColorAlertDialogListItem, C8710R.styleable.AppCompatTheme_textColorSearchUrl, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, C8710R.styleable.AppCompatTheme_toolbarStyle, C8710R.styleable.AppCompatTheme_tooltipForegroundColor, C8710R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    private static final int[] f25908C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    private static final int[] f25909D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    private static final int[] f25910E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    private static final boolean[] f25911F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: y */
    private static final int[] f25912y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    private static final int[] f25913z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: g */
    private final C5918a0 f25914g = new C5918a0();

    /* renamed from: h */
    private final int f25915h;

    /* renamed from: i */
    private final int f25916i;

    /* renamed from: j */
    private final int f25917j;

    /* renamed from: k */
    private final long f25918k;

    /* renamed from: l */
    private final ArrayList<C4918a> f25919l = new ArrayList<>();

    /* renamed from: m */
    private C4918a f25920m = new C4918a(0, 4);

    /* renamed from: n */
    private List<C4864b> f25921n;

    /* renamed from: o */
    private List<C4864b> f25922o;

    /* renamed from: p */
    private int f25923p;

    /* renamed from: q */
    private int f25924q;

    /* renamed from: r */
    private boolean f25925r;

    /* renamed from: s */
    private boolean f25926s;

    /* renamed from: t */
    private byte f25927t;

    /* renamed from: u */
    private byte f25928u;

    /* renamed from: v */
    private int f25929v = 0;

    /* renamed from: w */
    private boolean f25930w;

    /* renamed from: x */
    private long f25931x;

    /* renamed from: l3.a$a */
    /* compiled from: Cea608Decoder */
    private static final class C4918a {

        /* renamed from: a */
        private final List<C4919a> f25932a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f25933b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f25934c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f25935d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f25936e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f25937f;

        /* renamed from: g */
        private int f25938g;

        /* renamed from: h */
        private int f25939h;

        /* renamed from: l3.a$a$a */
        /* compiled from: Cea608Decoder */
        private static class C4919a {

            /* renamed from: a */
            public final int f25940a;

            /* renamed from: b */
            public final boolean f25941b;

            /* renamed from: c */
            public int f25942c;

            public C4919a(int i, boolean z, int i2) {
                this.f25940a = i;
                this.f25941b = z;
                this.f25942c = i2;
            }
        }

        public C4918a(int i, int i2) {
            mo18751j(i);
            this.f25939h = i2;
        }

        /* renamed from: h */
        private SpannableString m31230h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25934c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f25932a.size()) {
                C4919a aVar = this.f25932a.get(i);
                boolean z2 = aVar.f25941b;
                int i7 = aVar.f25940a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = C4917a.f25906A[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f25942c;
                i++;
                if (i8 != (i < this.f25932a.size() ? this.f25932a.get(i).f25942c : length)) {
                    if (i2 != -1 && !z2) {
                        m31233q(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        m31232o(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        m31231n(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                m31233q(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                m31232o(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                m31231n(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: n */
        private static void m31231n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        /* renamed from: o */
        private static void m31232o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: q */
        private static void m31233q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: e */
        public void mo18747e(char c) {
            if (this.f25934c.length() < 32) {
                this.f25934c.append(c);
            }
        }

        /* renamed from: f */
        public void mo18748f() {
            int length = this.f25934c.length();
            if (length > 0) {
                this.f25934c.delete(length - 1, length);
                int size = this.f25932a.size() - 1;
                while (size >= 0) {
                    C4919a aVar = this.f25932a.get(size);
                    int i = aVar.f25942c;
                    if (i == length) {
                        aVar.f25942c = i - 1;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: g */
        public C4864b mo18749g(int i) {
            float f;
            int i2 = this.f25936e + this.f25937f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f25933b.size(); i4++) {
                spannableStringBuilder.append(C5953m0.m35115X0(this.f25933b.get(i4), i3));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(C5953m0.m35115X0(m31230h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.f25938g != 2 || (Math.abs(i5) >= 3 && length >= 0)) {
                    i = (this.f25938g != 2 || i5 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.f25935d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f25938g == 1) {
                i6 -= this.f25939h - 1;
            }
            return new C4864b.C4866b().mo18638o(spannableStringBuilder).mo18639p(Layout.Alignment.ALIGN_NORMAL).mo18631h((float) i6, 1).mo18634k(f).mo18635l(i).mo18624a();
        }

        /* renamed from: i */
        public boolean mo18750i() {
            return this.f25932a.isEmpty() && this.f25933b.isEmpty() && this.f25934c.length() == 0;
        }

        /* renamed from: j */
        public void mo18751j(int i) {
            this.f25938g = i;
            this.f25932a.clear();
            this.f25933b.clear();
            this.f25934c.setLength(0);
            this.f25935d = 15;
            this.f25936e = 0;
            this.f25937f = 0;
        }

        /* renamed from: k */
        public void mo18752k() {
            this.f25933b.add(m31230h());
            this.f25934c.setLength(0);
            this.f25932a.clear();
            int min = Math.min(this.f25939h, this.f25935d);
            while (this.f25933b.size() >= min) {
                this.f25933b.remove(0);
            }
        }

        /* renamed from: l */
        public void mo18753l(int i) {
            this.f25938g = i;
        }

        /* renamed from: m */
        public void mo18754m(int i) {
            this.f25939h = i;
        }

        /* renamed from: p */
        public void mo18755p(int i, boolean z) {
            this.f25932a.add(new C4919a(i, z, this.f25934c.length()));
        }
    }

    public C4917a(String str, int i, long j) {
        this.f25918k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.f25915h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f25917j = 0;
            this.f25916i = 0;
        } else if (i == 2) {
            this.f25917j = 1;
            this.f25916i = 0;
        } else if (i == 3) {
            this.f25917j = 0;
            this.f25916i = 1;
        } else if (i != 4) {
            C5961r.m35215i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f25917j = 0;
            this.f25916i = 0;
        } else {
            this.f25917j = 1;
            this.f25916i = 1;
        }
        m31202N(0);
        m31201M();
        this.f25930w = true;
        this.f25931x = -9223372036854775807L;
    }

    /* renamed from: A */
    private static boolean m31189A(byte b) {
        return (b & 224) == 0;
    }

    /* renamed from: B */
    private static boolean m31190B(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* renamed from: C */
    private static boolean m31191C(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: D */
    private static boolean m31192D(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: E */
    private static boolean m31193E(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: F */
    private static boolean m31194F(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: G */
    private boolean m31195G(boolean z, byte b, byte b2) {
        if (!z || !m31194F(b)) {
            this.f25926s = false;
        } else if (this.f25926s && this.f25927t == b && this.f25928u == b2) {
            this.f25926s = false;
            return true;
        } else {
            this.f25926s = true;
            this.f25927t = b;
            this.f25928u = b2;
        }
        return false;
    }

    /* renamed from: H */
    private static boolean m31196H(byte b) {
        return (b & 247) == 20;
    }

    /* renamed from: I */
    private static boolean m31197I(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* renamed from: J */
    private static boolean m31198J(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: K */
    private static boolean m31199K(byte b) {
        return 1 <= b && b <= 15;
    }

    /* renamed from: L */
    private void m31200L(byte b, byte b2) {
        if (m31199K(b)) {
            this.f25930w = false;
        } else if (m31196H(b)) {
            if (!(b2 == 32 || b2 == 47)) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 41:
                                break;
                            case 42:
                            case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                                this.f25930w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f25930w = true;
        }
    }

    /* renamed from: M */
    private void m31201M() {
        this.f25920m.mo18751j(this.f25923p);
        this.f25919l.clear();
        this.f25919l.add(this.f25920m);
    }

    /* renamed from: N */
    private void m31202N(int i) {
        int i2 = this.f25923p;
        if (i2 != i) {
            this.f25923p = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.f25919l.size(); i3++) {
                    this.f25919l.get(i3).mo18753l(i);
                }
                return;
            }
            m31201M();
            if (i2 == 3 || i == 1 || i == 0) {
                this.f25921n = Collections.emptyList();
            }
        }
    }

    /* renamed from: O */
    private void m31203O(int i) {
        this.f25924q = i;
        this.f25920m.mo18754m(i);
    }

    /* renamed from: P */
    private boolean m31204P() {
        if (this.f25918k == -9223372036854775807L || this.f25931x == -9223372036854775807L || mo18772k() - this.f25931x < this.f25918k) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private boolean m31205Q(byte b) {
        if (m31189A(b)) {
            this.f25929v = m31208r(b);
        }
        return this.f25929v == this.f25917j;
    }

    /* renamed from: q */
    private static char m31207q(byte b) {
        return (char) f25907B[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: r */
    private static int m31208r(byte b) {
        return (b >> 3) & 1;
    }

    /* renamed from: s */
    private List<C4864b> m31209s() {
        int size = this.f25919l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C4864b g = this.f25919l.get(i2).mo18749g(RecyclerView.UNDEFINED_DURATION);
            arrayList.add(g);
            if (g != null) {
                i = Math.min(i, g.f25766i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C4864b bVar = (C4864b) arrayList.get(i3);
            if (bVar != null) {
                if (bVar.f25766i != i) {
                    bVar = (C4864b) C5917a.m34872e(this.f25919l.get(i3).mo18749g(i));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    /* renamed from: t */
    private static char m31210t(byte b) {
        return (char) f25909D[b & 31];
    }

    /* renamed from: u */
    private static char m31211u(byte b) {
        return (char) f25910E[b & 31];
    }

    /* renamed from: v */
    private static char m31212v(byte b, byte b2) {
        if ((b & 1) == 0) {
            return m31210t(b2);
        }
        return m31211u(b2);
    }

    /* renamed from: w */
    private static char m31213w(byte b) {
        return (char) f25908C[b & 15];
    }

    /* renamed from: x */
    private void m31214x(byte b) {
        this.f25920m.mo18747e(' ');
        this.f25920m.mo18755p((b >> 1) & 7, (b & 1) == 1);
    }

    /* renamed from: y */
    private void m31215y(byte b) {
        if (b == 32) {
            m31202N(2);
        } else if (b != 41) {
            switch (b) {
                case 37:
                    m31202N(1);
                    m31203O(2);
                    return;
                case 38:
                    m31202N(1);
                    m31203O(3);
                    return;
                case 39:
                    m31202N(1);
                    m31203O(4);
                    return;
                default:
                    int i = this.f25923p;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                                    this.f25921n = Collections.emptyList();
                                    int i2 = this.f25923p;
                                    if (i2 == 1 || i2 == 3) {
                                        m31201M();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i == 1 && !this.f25920m.mo18750i()) {
                                        this.f25920m.mo18752k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    m31201M();
                                    return;
                                case 47:
                                    this.f25921n = m31209s();
                                    m31201M();
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            this.f25920m.mo18748f();
                            return;
                        }
                    } else {
                        return;
                    }
            }
        } else {
            m31202N(3);
        }
    }

    /* renamed from: z */
    private void m31216z(byte b, byte b2) {
        int i = f25912y[b & 7];
        boolean z = false;
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f25920m.f25935d) {
            if (this.f25923p != 1 && !this.f25920m.mo18750i()) {
                C4918a aVar = new C4918a(this.f25923p, this.f25924q);
                this.f25920m = aVar;
                this.f25919l.add(aVar);
            }
            int unused = this.f25920m.f25935d = i;
        }
        boolean z2 = (b2 & 16) == 16;
        if ((b2 & 1) == 1) {
            z = true;
        }
        int i2 = (b2 >> 1) & 7;
        this.f25920m.mo18755p(z2 ? 8 : i2, z);
        if (z2) {
            int unused2 = this.f25920m.f25936e = f25913z[i2];
        }
    }

    /* renamed from: a */
    public void mo7041a() {
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo18644b(long j) {
        super.mo18644b(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4874h mo18741f() {
        List<C4864b> list = this.f25921n;
        this.f25922o = list;
        return new C4928f((List) C5917a.m34872e(list));
    }

    public void flush() {
        super.flush();
        this.f25921n = null;
        this.f25922o = null;
        m31202N(0);
        m31203O(4);
        m31201M();
        this.f25925r = false;
        this.f25926s = false;
        this.f25927t = 0;
        this.f25928u = 0;
        this.f25929v = 0;
        this.f25930w = true;
        this.f25931x = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0018 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18742g(p079k3.C4879l r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f5430c
            java.lang.Object r10 = p161w3.C5917a.m34872e(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            w3.a0 r0 = r9.f25914g
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.mo20544M(r1, r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0018:
            w3.a0 r2 = r9.f25914g
            int r2 = r2.mo20548a()
            int r3 = r9.f25915h
            if (r2 < r3) goto L_0x00f6
            r2 = 2
            if (r3 != r2) goto L_0x0027
            r2 = -4
            goto L_0x002e
        L_0x0027:
            w3.a0 r2 = r9.f25914g
            int r2 = r2.mo20534C()
            byte r2 = (byte) r2
        L_0x002e:
            w3.a0 r3 = r9.f25914g
            int r3 = r3.mo20534C()
            w3.a0 r4 = r9.f25914g
            int r4 = r4.mo20534C()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0018
        L_0x003f:
            r5 = r2 & 1
            int r6 = r9.f25916i
            if (r5 == r6) goto L_0x0046
            goto L_0x0018
        L_0x0046:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            goto L_0x0018
        L_0x0051:
            boolean r7 = r9.f25925r
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0064
            boolean[] r2 = f25911F
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0064
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r9.f25925r = r2
            boolean r2 = r9.m31195G(r2, r5, r6)
            if (r2 == 0) goto L_0x006e
            goto L_0x0018
        L_0x006e:
            boolean r2 = r9.f25925r
            if (r2 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0018
            r9.m31201M()
        L_0x0077:
            r1 = 1
            goto L_0x0018
        L_0x0079:
            r9.m31200L(r5, r6)
            boolean r2 = r9.f25930w
            if (r2 != 0) goto L_0x0081
            goto L_0x0018
        L_0x0081:
            boolean r2 = r9.m31205Q(r5)
            if (r2 != 0) goto L_0x0088
            goto L_0x0018
        L_0x0088:
            boolean r1 = m31189A(r5)
            if (r1 == 0) goto L_0x00df
            boolean r1 = m31197I(r5, r6)
            if (r1 == 0) goto L_0x009e
            l3.a$a r1 = r9.f25920m
            char r2 = m31213w(r6)
            r1.mo18747e(r2)
            goto L_0x0077
        L_0x009e:
            boolean r1 = m31190B(r5, r6)
            if (r1 == 0) goto L_0x00b3
            l3.a$a r1 = r9.f25920m
            r1.mo18748f()
            l3.a$a r1 = r9.f25920m
            char r2 = m31212v(r5, r6)
            r1.mo18747e(r2)
            goto L_0x0077
        L_0x00b3:
            boolean r1 = m31191C(r5, r6)
            if (r1 == 0) goto L_0x00bd
            r9.m31214x(r6)
            goto L_0x0077
        L_0x00bd:
            boolean r1 = m31193E(r5, r6)
            if (r1 == 0) goto L_0x00c7
            r9.m31216z(r5, r6)
            goto L_0x0077
        L_0x00c7:
            boolean r1 = m31198J(r5, r6)
            if (r1 == 0) goto L_0x00d5
            l3.a$a r1 = r9.f25920m
            int r6 = r6 + -32
            int unused = r1.f25937f = r6
            goto L_0x0077
        L_0x00d5:
            boolean r1 = m31192D(r5, r6)
            if (r1 == 0) goto L_0x0077
            r9.m31215y(r6)
            goto L_0x0077
        L_0x00df:
            l3.a$a r1 = r9.f25920m
            char r2 = m31207q(r5)
            r1.mo18747e(r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0077
            l3.a$a r1 = r9.f25920m
            char r2 = m31207q(r6)
            r1.mo18747e(r2)
            goto L_0x0077
        L_0x00f6:
            if (r1 == 0) goto L_0x010b
            int r10 = r9.f25923p
            if (r10 == r0) goto L_0x00ff
            r0 = 3
            if (r10 != r0) goto L_0x010b
        L_0x00ff:
            java.util.List r10 = r9.m31209s()
            r9.f25921n = r10
            long r0 = r9.mo18772k()
            r9.f25931x = r0
        L_0x010b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086l3.C4917a.mo18742g(k3.l):void");
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ C4879l mo18743h() throws C4876j {
        return super.mo7043d();
    }

    /* renamed from: i */
    public C4880m mo7042c() throws C4876j {
        C4880m j;
        C4880m i = super.mo7042c();
        if (i != null) {
            return i;
        }
        if (!m31204P() || (j = mo18771j()) == null) {
            return null;
        }
        this.f25921n = Collections.emptyList();
        this.f25931x = -9223372036854775807L;
        C4880m mVar = j;
        mVar.mo18659x(mo18772k(), mo18741f(), Long.MAX_VALUE);
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo18745l() {
        return this.f25921n != this.f25922o;
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo18746m(C4879l lVar) throws C4876j {
        super.mo7044e(lVar);
    }
}
