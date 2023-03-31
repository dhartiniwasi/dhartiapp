package p086l3;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p079k3.C4864b;
import p079k3.C4874h;
import p079k3.C4876j;
import p079k3.C4879l;
import p079k3.C4880m;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5929e;
import p161w3.C5961r;
import p161w3.C5980z;

/* renamed from: l3.c */
/* compiled from: Cea708Decoder */
public final class C4920c extends C4924e {

    /* renamed from: g */
    private final C5918a0 f25943g = new C5918a0();

    /* renamed from: h */
    private final C5980z f25944h = new C5980z();

    /* renamed from: i */
    private int f25945i = -1;

    /* renamed from: j */
    private final boolean f25946j;

    /* renamed from: k */
    private final int f25947k;

    /* renamed from: l */
    private final C4922b[] f25948l;

    /* renamed from: m */
    private C4922b f25949m;

    /* renamed from: n */
    private List<C4864b> f25950n;

    /* renamed from: o */
    private List<C4864b> f25951o;

    /* renamed from: p */
    private C4923c f25952p;

    /* renamed from: q */
    private int f25953q;

    /* renamed from: l3.c$a */
    /* compiled from: Cea708Decoder */
    private static final class C4921a {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final Comparator<C4921a> f25954c = C11756b.f44377a;

        /* renamed from: a */
        public final C4864b f25955a;

        /* renamed from: b */
        public final int f25956b;

        public C4921a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C4864b.C4866b n = new C4864b.C4866b().mo18638o(charSequence).mo18639p(alignment).mo18631h(f, i).mo18632i(i2).mo18634k(f2).mo18635l(i3).mo18637n(f3);
            if (z) {
                n.mo18642s(i4);
            }
            this.f25955a = n.mo18624a();
            this.f25956b = i5;
        }
    }

    /* renamed from: l3.c$b */
    /* compiled from: Cea708Decoder */
    private static final class C4922b {

        /* renamed from: A */
        private static final int[] f25957A = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: B */
        private static final int[] f25958B = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: C */
        private static final boolean[] f25959C = {false, false, false, true, true, true, false};

        /* renamed from: D */
        private static final int[] f25960D;

        /* renamed from: E */
        private static final int[] f25961E = {0, 1, 2, 3, 4, 3, 4};

        /* renamed from: F */
        private static final int[] f25962F = {0, 0, 0, 0, 0, 3, 3};

        /* renamed from: G */
        private static final int[] f25963G;

        /* renamed from: w */
        public static final int f25964w = m31272h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f25965x;

        /* renamed from: y */
        public static final int f25966y;

        /* renamed from: z */
        private static final int[] f25967z = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: a */
        private final List<SpannableString> f25968a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f25969b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f25970c;

        /* renamed from: d */
        private boolean f25971d;

        /* renamed from: e */
        private int f25972e;

        /* renamed from: f */
        private boolean f25973f;

        /* renamed from: g */
        private int f25974g;

        /* renamed from: h */
        private int f25975h;

        /* renamed from: i */
        private int f25976i;

        /* renamed from: j */
        private int f25977j;

        /* renamed from: k */
        private boolean f25978k;

        /* renamed from: l */
        private int f25979l;

        /* renamed from: m */
        private int f25980m;

        /* renamed from: n */
        private int f25981n;

        /* renamed from: o */
        private int f25982o;

        /* renamed from: p */
        private int f25983p;

        /* renamed from: q */
        private int f25984q;

        /* renamed from: r */
        private int f25985r;

        /* renamed from: s */
        private int f25986s;

        /* renamed from: t */
        private int f25987t;

        /* renamed from: u */
        private int f25988u;

        /* renamed from: v */
        private int f25989v;

        static {
            int h = m31272h(0, 0, 0, 0);
            f25965x = h;
            int h2 = m31272h(0, 0, 0, 3);
            f25966y = h2;
            f25960D = new int[]{h, h2, h, h, h2, h, h};
            f25963G = new int[]{h, h, h, h, h, h2, h2};
        }

        public C4922b() {
            mo18765l();
        }

        /* renamed from: g */
        public static int m31271g(int i, int i2, int i3) {
            return m31272h(i, i2, i3, 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m31272h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p161w3.C5917a.m34870c(r4, r0, r1)
                p161w3.C5917a.m34870c(r5, r0, r1)
                p161w3.C5917a.m34870c(r6, r0, r1)
                p161w3.C5917a.m34870c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p086l3.C4920c.C4922b.m31272h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void mo18756a(char c) {
            if (c == 10) {
                this.f25968a.add(mo18759d());
                this.f25969b.clear();
                if (this.f25983p != -1) {
                    this.f25983p = 0;
                }
                if (this.f25984q != -1) {
                    this.f25984q = 0;
                }
                if (this.f25985r != -1) {
                    this.f25985r = 0;
                }
                if (this.f25987t != -1) {
                    this.f25987t = 0;
                }
                while (true) {
                    if ((this.f25978k && this.f25968a.size() >= this.f25977j) || this.f25968a.size() >= 15) {
                        this.f25968a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f25969b.append(c);
            }
        }

        /* renamed from: b */
        public void mo18757b() {
            int length = this.f25969b.length();
            if (length > 0) {
                this.f25969b.delete(length - 1, length);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p086l3.C4920c.C4921a mo18758c() {
            /*
                r15 = this;
                boolean r0 = r15.mo18763j()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.f25968a
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.f25968a
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.mo18759d()
                r2.append(r1)
                int r1 = r15.f25979l
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.f25979l
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.f25973f
                if (r1 == 0) goto L_0x0070
                int r1 = r15.f25975h
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.f25974g
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.f25975h
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.f25974g
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.f25976i
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x009a
            L_0x0093:
                int r8 = r1 / 3
                if (r8 != r5) goto L_0x0099
                r8 = 1
                goto L_0x009a
            L_0x0099:
                r8 = 2
            L_0x009a:
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x00a0
                r9 = 0
                goto L_0x00a6
            L_0x00a0:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a5
                r9 = 1
                goto L_0x00a6
            L_0x00a5:
                r9 = 2
            L_0x00a6:
                int r1 = r15.f25982o
                int r3 = f25965x
                if (r1 == r3) goto L_0x00ad
                r0 = 1
            L_0x00ad:
                l3.c$a r13 = new l3.c$a
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r15.f25982o
                int r14 = r15.f25972e
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p086l3.C4920c.C4922b.mo18758c():l3.c$a");
        }

        /* renamed from: d */
        public SpannableString mo18759d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25969b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f25983p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f25983p, length, 33);
                }
                if (this.f25984q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f25984q, length, 33);
                }
                if (this.f25985r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f25986s), this.f25985r, length, 33);
                }
                if (this.f25987t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f25988u), this.f25987t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void mo18760e() {
            this.f25968a.clear();
            this.f25969b.clear();
            this.f25983p = -1;
            this.f25984q = -1;
            this.f25985r = -1;
            this.f25987t = -1;
            this.f25989v = 0;
        }

        /* renamed from: f */
        public void mo18761f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            boolean z5 = z2;
            int i9 = i7;
            int i10 = i8;
            this.f25970c = true;
            this.f25971d = z;
            this.f25978k = z5;
            this.f25972e = i;
            this.f25973f = z4;
            this.f25974g = i2;
            this.f25975h = i3;
            this.f25976i = i6;
            int i11 = i4 + 1;
            if (this.f25977j != i11) {
                this.f25977j = i11;
                while (true) {
                    if ((!z5 || this.f25968a.size() < this.f25977j) && this.f25968a.size() < 15) {
                        break;
                    }
                    this.f25968a.remove(0);
                }
            }
            if (!(i9 == 0 || this.f25980m == i9)) {
                this.f25980m = i9;
                int i12 = i9 - 1;
                mo18770q(f25960D[i12], f25966y, f25959C[i12], 0, f25957A[i12], f25958B[i12], f25967z[i12]);
            }
            if (i10 != 0 && this.f25981n != i10) {
                this.f25981n = i10;
                int i13 = i10 - 1;
                mo18766m(0, 1, 1, false, false, f25962F[i13], f25961E[i13]);
                mo18767n(f25964w, f25963G[i13], f25965x);
            }
        }

        /* renamed from: i */
        public boolean mo18762i() {
            return this.f25970c;
        }

        /* renamed from: j */
        public boolean mo18763j() {
            return !mo18762i() || (this.f25968a.isEmpty() && this.f25969b.length() == 0);
        }

        /* renamed from: k */
        public boolean mo18764k() {
            return this.f25971d;
        }

        /* renamed from: l */
        public void mo18765l() {
            mo18760e();
            this.f25970c = false;
            this.f25971d = false;
            this.f25972e = 4;
            this.f25973f = false;
            this.f25974g = 0;
            this.f25975h = 0;
            this.f25976i = 0;
            this.f25977j = 15;
            this.f25978k = true;
            this.f25979l = 0;
            this.f25980m = 0;
            this.f25981n = 0;
            int i = f25965x;
            this.f25982o = i;
            this.f25986s = f25964w;
            this.f25988u = i;
        }

        /* renamed from: m */
        public void mo18766m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f25983p != -1) {
                if (!z) {
                    this.f25969b.setSpan(new StyleSpan(2), this.f25983p, this.f25969b.length(), 33);
                    this.f25983p = -1;
                }
            } else if (z) {
                this.f25983p = this.f25969b.length();
            }
            if (this.f25984q != -1) {
                if (!z2) {
                    this.f25969b.setSpan(new UnderlineSpan(), this.f25984q, this.f25969b.length(), 33);
                    this.f25984q = -1;
                }
            } else if (z2) {
                this.f25984q = this.f25969b.length();
            }
        }

        /* renamed from: n */
        public void mo18767n(int i, int i2, int i3) {
            if (!(this.f25985r == -1 || this.f25986s == i)) {
                this.f25969b.setSpan(new ForegroundColorSpan(this.f25986s), this.f25985r, this.f25969b.length(), 33);
            }
            if (i != f25964w) {
                this.f25985r = this.f25969b.length();
                this.f25986s = i;
            }
            if (!(this.f25987t == -1 || this.f25988u == i2)) {
                this.f25969b.setSpan(new BackgroundColorSpan(this.f25988u), this.f25987t, this.f25969b.length(), 33);
            }
            if (i2 != f25965x) {
                this.f25987t = this.f25969b.length();
                this.f25988u = i2;
            }
        }

        /* renamed from: o */
        public void mo18768o(int i, int i2) {
            if (this.f25989v != i) {
                mo18756a(10);
            }
            this.f25989v = i;
        }

        /* renamed from: p */
        public void mo18769p(boolean z) {
            this.f25971d = z;
        }

        /* renamed from: q */
        public void mo18770q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f25982o = i;
            this.f25979l = i6;
        }
    }

    /* renamed from: l3.c$c */
    /* compiled from: Cea708Decoder */
    private static final class C4923c {

        /* renamed from: a */
        public final int f25990a;

        /* renamed from: b */
        public final int f25991b;

        /* renamed from: c */
        public final byte[] f25992c;

        /* renamed from: d */
        int f25993d = 0;

        public C4923c(int i, int i2) {
            this.f25990a = i;
            this.f25991b = i2;
            this.f25992c = new byte[((i2 * 2) - 1)];
        }
    }

    public C4920c(int i, List<byte[]> list) {
        boolean z = true;
        this.f25947k = i == -1 ? 1 : i;
        this.f25946j = (list == null || !C5929e.m34971h(list)) ? false : z;
        this.f25948l = new C4922b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f25948l[i2] = new C4922b();
        }
        this.f25949m = this.f25948l[0];
    }

    /* renamed from: A */
    private void m31243A() {
        this.f25949m.mo18766m(this.f25944h.mo20676h(4), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20675g(), this.f25944h.mo20675g(), this.f25944h.mo20676h(3), this.f25944h.mo20676h(3));
    }

    /* renamed from: B */
    private void m31244B() {
        int h = C4922b.m31272h(this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2));
        int h2 = C4922b.m31272h(this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2));
        this.f25944h.mo20686r(2);
        this.f25949m.mo18767n(h, h2, C4922b.m31271g(this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2)));
    }

    /* renamed from: C */
    private void m31245C() {
        this.f25944h.mo20686r(4);
        int h = this.f25944h.mo20676h(4);
        this.f25944h.mo20686r(2);
        this.f25949m.mo18768o(h, this.f25944h.mo20676h(6));
    }

    /* renamed from: D */
    private void m31246D() {
        int h = C4922b.m31272h(this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2));
        int h2 = this.f25944h.mo20676h(2);
        int g = C4922b.m31271g(this.f25944h.mo20676h(2), this.f25944h.mo20676h(2), this.f25944h.mo20676h(2));
        if (this.f25944h.mo20675g()) {
            h2 |= 4;
        }
        boolean g2 = this.f25944h.mo20675g();
        int h3 = this.f25944h.mo20676h(2);
        int h4 = this.f25944h.mo20676h(2);
        int h5 = this.f25944h.mo20676h(2);
        this.f25944h.mo20686r(8);
        this.f25949m.mo18770q(h, g, g2, h2, h3, h4, h5);
    }

    /* renamed from: E */
    private void m31247E() {
        C4923c cVar = this.f25952p;
        if (cVar.f25993d != (cVar.f25991b * 2) - 1) {
            C5961r.m35208b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f25952p.f25991b * 2) - 1) + ", but current index is " + this.f25952p.f25993d + " (sequence number " + this.f25952p.f25990a + ");");
        }
        boolean z = false;
        C5980z zVar = this.f25944h;
        C4923c cVar2 = this.f25952p;
        zVar.mo20683o(cVar2.f25992c, cVar2.f25993d);
        while (true) {
            if (this.f25944h.mo20670b() <= 0) {
                break;
            }
            int h = this.f25944h.mo20676h(3);
            int h2 = this.f25944h.mo20676h(5);
            if (h == 7) {
                this.f25944h.mo20686r(2);
                h = this.f25944h.mo20676h(6);
                if (h < 7) {
                    C5961r.m35215i("Cea708Decoder", "Invalid extended service number: " + h);
                }
            }
            if (h2 == 0) {
                if (h != 0) {
                    C5961r.m35215i("Cea708Decoder", "serviceNumber is non-zero (" + h + ") when blockSize is 0");
                }
            } else if (h != this.f25947k) {
                this.f25944h.mo20687s(h2);
            } else {
                int e = this.f25944h.mo20673e() + (h2 * 8);
                while (this.f25944h.mo20673e() < e) {
                    int h3 = this.f25944h.mo20676h(8);
                    if (h3 == 16) {
                        int h4 = this.f25944h.mo20676h(8);
                        if (h4 <= 31) {
                            m31253t(h4);
                        } else if (h4 <= 127) {
                            m31258y(h4);
                        } else if (h4 <= 159) {
                            m31254u(h4);
                        } else if (h4 <= 255) {
                            m31259z(h4);
                        } else {
                            C5961r.m35215i("Cea708Decoder", "Invalid extended command: " + h4);
                        }
                    } else if (h3 <= 31) {
                        m31251r(h3);
                    } else if (h3 <= 127) {
                        m31256w(h3);
                    } else if (h3 <= 159) {
                        m31252s(h3);
                    } else if (h3 <= 255) {
                        m31257x(h3);
                    } else {
                        C5961r.m35215i("Cea708Decoder", "Invalid base command: " + h3);
                    }
                    z = true;
                }
            }
        }
        if (z) {
            this.f25950n = m31250q();
        }
    }

    /* renamed from: F */
    private void m31248F() {
        for (int i = 0; i < 8; i++) {
            this.f25948l[i].mo18765l();
        }
    }

    /* renamed from: p */
    private void m31249p() {
        if (this.f25952p != null) {
            m31247E();
            this.f25952p = null;
        }
    }

    /* renamed from: q */
    private List<C4864b> m31250q() {
        C4921a c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f25948l[i].mo18763j() && this.f25948l[i].mo18764k() && (c = this.f25948l[i].mo18758c()) != null) {
                arrayList.add(c);
            }
        }
        Collections.sort(arrayList, C4921a.f25954c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C4921a) arrayList.get(i2)).f25955a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: r */
    private void m31251r(int i) {
        if (i == 0) {
            return;
        }
        if (i == 3) {
            this.f25950n = m31250q();
        } else if (i != 8) {
            switch (i) {
                case 12:
                    m31248F();
                    return;
                case 13:
                    this.f25949m.mo18756a(10);
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        C5961r.m35215i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                        this.f25944h.mo20686r(8);
                        return;
                    } else if (i < 24 || i > 31) {
                        C5961r.m35215i("Cea708Decoder", "Invalid C0 command: " + i);
                        return;
                    } else {
                        C5961r.m35215i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                        this.f25944h.mo20686r(16);
                        return;
                    }
            }
        } else {
            this.f25949m.mo18757b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0093, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4.f25944h.mo20675g() == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r4.f25948l[8 - r2].mo18765l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cd, code lost:
        if (r4.f25944h.mo20675g() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00cf, code lost:
        r4.f25948l[8 - r2].mo18769p(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (r2 > 8) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fb, code lost:
        if (r4.f25944h.mo20675g() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fd, code lost:
        r4.f25948l[8 - r2].mo18760e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31252s(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x0109;
                case 129: goto L_0x0109;
                case 130: goto L_0x0109;
                case 131: goto L_0x0109;
                case 132: goto L_0x0109;
                case 133: goto L_0x0109;
                case 134: goto L_0x0109;
                case 135: goto L_0x0109;
                case 136: goto L_0x00f3;
                case 137: goto L_0x00dc;
                case 138: goto L_0x00c5;
                case 139: goto L_0x00a9;
                case 140: goto L_0x0093;
                case 141: goto L_0x008c;
                case 142: goto L_0x0117;
                case 143: goto L_0x0087;
                case 144: goto L_0x0073;
                case 145: goto L_0x005d;
                case 146: goto L_0x0049;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0033;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            p161w3.C5961r.m35215i(r0, r5)
            goto L_0x0117
        L_0x0020:
            int r5 = r5 + -152
            r4.m31255v(r5)
            int r0 = r4.f25953q
            if (r0 == r5) goto L_0x0117
            r4.f25953q = r5
            l3.c$b[] r0 = r4.f25948l
            r5 = r0[r5]
            r4.f25949m = r5
            goto L_0x0117
        L_0x0033:
            l3.c$b r5 = r4.f25949m
            boolean r5 = r5.mo18762i()
            if (r5 != 0) goto L_0x0044
            w3.z r5 = r4.f25944h
            r0 = 32
            r5.mo20686r(r0)
            goto L_0x0117
        L_0x0044:
            r4.m31246D()
            goto L_0x0117
        L_0x0049:
            l3.c$b r5 = r4.f25949m
            boolean r5 = r5.mo18762i()
            if (r5 != 0) goto L_0x0058
            w3.z r5 = r4.f25944h
            r5.mo20686r(r0)
            goto L_0x0117
        L_0x0058:
            r4.m31245C()
            goto L_0x0117
        L_0x005d:
            l3.c$b r5 = r4.f25949m
            boolean r5 = r5.mo18762i()
            if (r5 != 0) goto L_0x006e
            w3.z r5 = r4.f25944h
            r0 = 24
            r5.mo20686r(r0)
            goto L_0x0117
        L_0x006e:
            r4.m31244B()
            goto L_0x0117
        L_0x0073:
            l3.c$b r5 = r4.f25949m
            boolean r5 = r5.mo18762i()
            if (r5 != 0) goto L_0x0082
            w3.z r5 = r4.f25944h
            r5.mo20686r(r0)
            goto L_0x0117
        L_0x0082:
            r4.m31243A()
            goto L_0x0117
        L_0x0087:
            r4.m31248F()
            goto L_0x0117
        L_0x008c:
            w3.z r5 = r4.f25944h
            r5.mo20686r(r1)
            goto L_0x0117
        L_0x0093:
            if (r2 > r1) goto L_0x0117
            w3.z r5 = r4.f25944h
            boolean r5 = r5.mo20675g()
            if (r5 == 0) goto L_0x00a6
            l3.c$b[] r5 = r4.f25948l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo18765l()
        L_0x00a6:
            int r2 = r2 + 1
            goto L_0x0093
        L_0x00a9:
            r5 = 1
        L_0x00aa:
            if (r5 > r1) goto L_0x0117
            w3.z r0 = r4.f25944h
            boolean r0 = r0.mo20675g()
            if (r0 == 0) goto L_0x00c2
            l3.c$b[] r0 = r4.f25948l
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.mo18764k()
            r3 = r3 ^ r2
            r0.mo18769p(r3)
        L_0x00c2:
            int r5 = r5 + 1
            goto L_0x00aa
        L_0x00c5:
            if (r2 > r1) goto L_0x0117
            w3.z r5 = r4.f25944h
            boolean r5 = r5.mo20675g()
            if (r5 == 0) goto L_0x00d9
            l3.c$b[] r5 = r4.f25948l
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.mo18769p(r0)
        L_0x00d9:
            int r2 = r2 + 1
            goto L_0x00c5
        L_0x00dc:
            r5 = 1
        L_0x00dd:
            if (r5 > r1) goto L_0x0117
            w3.z r0 = r4.f25944h
            boolean r0 = r0.mo20675g()
            if (r0 == 0) goto L_0x00f0
            l3.c$b[] r0 = r4.f25948l
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.mo18769p(r2)
        L_0x00f0:
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00f3:
            if (r2 > r1) goto L_0x0117
            w3.z r5 = r4.f25944h
            boolean r5 = r5.mo20675g()
            if (r5 == 0) goto L_0x0106
            l3.c$b[] r5 = r4.f25948l
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.mo18760e()
        L_0x0106:
            int r2 = r2 + 1
            goto L_0x00f3
        L_0x0109:
            int r5 = r5 + -128
            int r0 = r4.f25953q
            if (r0 == r5) goto L_0x0117
            r4.f25953q = r5
            l3.c$b[] r0 = r4.f25948l
            r5 = r0[r5]
            r4.f25949m = r5
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p086l3.C4920c.m31252s(int):void");
    }

    /* renamed from: t */
    private void m31253t(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f25944h.mo20686r(8);
            } else if (i <= 23) {
                this.f25944h.mo20686r(16);
            } else if (i <= 31) {
                this.f25944h.mo20686r(24);
            }
        }
    }

    /* renamed from: u */
    private void m31254u(int i) {
        if (i <= 135) {
            this.f25944h.mo20686r(32);
        } else if (i <= 143) {
            this.f25944h.mo20686r(40);
        } else if (i <= 159) {
            this.f25944h.mo20686r(2);
            this.f25944h.mo20686r(this.f25944h.mo20676h(6) * 8);
        }
    }

    /* renamed from: v */
    private void m31255v(int i) {
        C4922b bVar = this.f25948l[i];
        this.f25944h.mo20686r(2);
        boolean g = this.f25944h.mo20675g();
        boolean g2 = this.f25944h.mo20675g();
        boolean g3 = this.f25944h.mo20675g();
        int h = this.f25944h.mo20676h(3);
        boolean g4 = this.f25944h.mo20675g();
        int h2 = this.f25944h.mo20676h(7);
        int h3 = this.f25944h.mo20676h(8);
        int h4 = this.f25944h.mo20676h(4);
        int h5 = this.f25944h.mo20676h(4);
        this.f25944h.mo20686r(2);
        int h6 = this.f25944h.mo20676h(6);
        this.f25944h.mo20686r(2);
        bVar.mo18761f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.f25944h.mo20676h(3), this.f25944h.mo20676h(3));
    }

    /* renamed from: w */
    private void m31256w(int i) {
        if (i == 127) {
            this.f25949m.mo18756a(9835);
        } else {
            this.f25949m.mo18756a((char) (i & 255));
        }
    }

    /* renamed from: x */
    private void m31257x(int i) {
        this.f25949m.mo18756a((char) (i & 255));
    }

    /* renamed from: y */
    private void m31258y(int i) {
        if (i == 32) {
            this.f25949m.mo18756a(' ');
        } else if (i == 33) {
            this.f25949m.mo18756a(160);
        } else if (i == 37) {
            this.f25949m.mo18756a(8230);
        } else if (i == 42) {
            this.f25949m.mo18756a(352);
        } else if (i == 44) {
            this.f25949m.mo18756a(338);
        } else if (i == 63) {
            this.f25949m.mo18756a(376);
        } else if (i == 57) {
            this.f25949m.mo18756a(8482);
        } else if (i == 58) {
            this.f25949m.mo18756a(353);
        } else if (i == 60) {
            this.f25949m.mo18756a(339);
        } else if (i != 61) {
            switch (i) {
                case 48:
                    this.f25949m.mo18756a(9608);
                    return;
                case 49:
                    this.f25949m.mo18756a(8216);
                    return;
                case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                    this.f25949m.mo18756a(8217);
                    return;
                case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                    this.f25949m.mo18756a(8220);
                    return;
                case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                    this.f25949m.mo18756a(8221);
                    return;
                case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                    this.f25949m.mo18756a(8226);
                    return;
                default:
                    switch (i) {
                        case 118:
                            this.f25949m.mo18756a(8539);
                            return;
                        case 119:
                            this.f25949m.mo18756a(8540);
                            return;
                        case 120:
                            this.f25949m.mo18756a(8541);
                            return;
                        case 121:
                            this.f25949m.mo18756a(8542);
                            return;
                        case 122:
                            this.f25949m.mo18756a(9474);
                            return;
                        case 123:
                            this.f25949m.mo18756a(9488);
                            return;
                        case 124:
                            this.f25949m.mo18756a(9492);
                            return;
                        case 125:
                            this.f25949m.mo18756a(9472);
                            return;
                        case 126:
                            this.f25949m.mo18756a(9496);
                            return;
                        case 127:
                            this.f25949m.mo18756a(9484);
                            return;
                        default:
                            C5961r.m35215i("Cea708Decoder", "Invalid G2 character: " + i);
                            return;
                    }
            }
        } else {
            this.f25949m.mo18756a(8480);
        }
    }

    /* renamed from: z */
    private void m31259z(int i) {
        if (i == 160) {
            this.f25949m.mo18756a(13252);
            return;
        }
        C5961r.m35215i("Cea708Decoder", "Invalid G3 character: " + i);
        this.f25949m.mo18756a('_');
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo7041a() {
        super.mo7041a();
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo18644b(long j) {
        super.mo18644b(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C4874h mo18741f() {
        List<C4864b> list = this.f25950n;
        this.f25951o = list;
        return new C4928f((List) C5917a.m34872e(list));
    }

    public void flush() {
        super.flush();
        this.f25950n = null;
        this.f25951o = null;
        this.f25953q = 0;
        this.f25949m = this.f25948l[0];
        m31248F();
        this.f25952p = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo18742g(C4879l lVar) {
        ByteBuffer byteBuffer = (ByteBuffer) C5917a.m34872e(lVar.f5430c);
        this.f25943g.mo20544M(byteBuffer.array(), byteBuffer.limit());
        while (this.f25943g.mo20548a() >= 3) {
            int C = this.f25943g.mo20534C() & 7;
            int i = C & 3;
            boolean z = false;
            boolean z2 = (C & 4) == 4;
            byte C2 = (byte) this.f25943g.mo20534C();
            byte C3 = (byte) this.f25943g.mo20534C();
            if ((i == 2 || i == 3) && z2) {
                if (i == 3) {
                    m31249p();
                    int i2 = (C2 & 192) >> 6;
                    int i3 = this.f25945i;
                    if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                        m31248F();
                        C5961r.m35215i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f25945i + " current=" + i2);
                    }
                    this.f25945i = i2;
                    byte b = C2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    C4923c cVar = new C4923c(i2, b);
                    this.f25952p = cVar;
                    byte[] bArr = cVar.f25992c;
                    int i4 = cVar.f25993d;
                    cVar.f25993d = i4 + 1;
                    bArr[i4] = C3;
                } else {
                    if (i == 2) {
                        z = true;
                    }
                    C5917a.m34868a(z);
                    C4923c cVar2 = this.f25952p;
                    if (cVar2 == null) {
                        C5961r.m35209c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar2.f25992c;
                        int i5 = cVar2.f25993d;
                        int i6 = i5 + 1;
                        cVar2.f25993d = i6;
                        bArr2[i5] = C2;
                        cVar2.f25993d = i6 + 1;
                        bArr2[i6] = C3;
                    }
                }
                C4923c cVar3 = this.f25952p;
                if (cVar3.f25993d == (cVar3.f25991b * 2) - 1) {
                    m31249p();
                }
            }
        }
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ C4879l mo18743h() throws C4876j {
        return super.mo7043d();
    }

    /* renamed from: i */
    public /* bridge */ /* synthetic */ C4880m mo18744i() throws C4876j {
        return super.mo7042c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo18745l() {
        return this.f25950n != this.f25951o;
    }

    /* renamed from: m */
    public /* bridge */ /* synthetic */ void mo18746m(C4879l lVar) throws C4876j {
        super.mo7044e(lVar);
    }
}
