package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C0707h;
import androidx.core.view.C0835a0;
import androidx.core.widget.C0967b;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p048g.C4297j;
import p157w.C5861a;

/* renamed from: androidx.appcompat.widget.c0 */
/* compiled from: AppCompatTextHelper */
class C0466c0 {

    /* renamed from: a */
    private final TextView f1535a;

    /* renamed from: b */
    private C0571y0 f1536b;

    /* renamed from: c */
    private C0571y0 f1537c;

    /* renamed from: d */
    private C0571y0 f1538d;

    /* renamed from: e */
    private C0571y0 f1539e;

    /* renamed from: f */
    private C0571y0 f1540f;

    /* renamed from: g */
    private C0571y0 f1541g;

    /* renamed from: h */
    private C0571y0 f1542h;

    /* renamed from: i */
    private final C0482e0 f1543i;

    /* renamed from: j */
    private int f1544j = 0;

    /* renamed from: k */
    private int f1545k = -1;

    /* renamed from: l */
    private Typeface f1546l;

    /* renamed from: m */
    private boolean f1547m;

    /* renamed from: androidx.appcompat.widget.c0$a */
    /* compiled from: AppCompatTextHelper */
    class C0467a extends C0707h.C0713f {

        /* renamed from: a */
        final /* synthetic */ int f1548a;

        /* renamed from: b */
        final /* synthetic */ int f1549b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1550c;

        C0467a(int i, int i2, WeakReference weakReference) {
            this.f1548a = i;
            this.f1549b = i2;
            this.f1550c = weakReference;
        }

        /* renamed from: h */
        public void mo2109h(int i) {
        }

        /* renamed from: i */
        public void mo2110i(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1548a) != -1) {
                typeface = C0473g.m2316a(typeface, i, (this.f1549b & 2) != 0);
            }
            C0466c0.this.mo2098n(this.f1550c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$b */
    /* compiled from: AppCompatTextHelper */
    class C0468b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f1552a;

        /* renamed from: b */
        final /* synthetic */ Typeface f1553b;

        /* renamed from: c */
        final /* synthetic */ int f1554c;

        C0468b(TextView textView, Typeface typeface, int i) {
            this.f1552a = textView;
            this.f1553b = typeface;
            this.f1554c = i;
        }

        public void run() {
            this.f1552a.setTypeface(this.f1553b, this.f1554c);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$c */
    /* compiled from: AppCompatTextHelper */
    static class C0469c {
        /* renamed from: a */
        static Drawable[] m2306a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static void m2307b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        static void m2308c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$d */
    /* compiled from: AppCompatTextHelper */
    static class C0470d {
        /* renamed from: a */
        static Locale m2309a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$e */
    /* compiled from: AppCompatTextHelper */
    static class C0471e {
        /* renamed from: a */
        static LocaleList m2310a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: b */
        static void m2311b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$f */
    /* compiled from: AppCompatTextHelper */
    static class C0472f {
        /* renamed from: a */
        static int m2312a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: b */
        static void m2313b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        static void m2314c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        static boolean m2315d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$g */
    /* compiled from: AppCompatTextHelper */
    static class C0473g {
        /* renamed from: a */
        static Typeface m2316a(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    C0466c0(TextView textView) {
        this.f1535a = textView;
        this.f1543i = new C0482e0(textView);
    }

    /* renamed from: B */
    private void m2275B(int i, float f) {
        this.f1543i.mo2233w(i, f);
    }

    /* renamed from: C */
    private void m2276C(Context context, C0452a1 a1Var) {
        String o;
        this.f1544j = a1Var.mo2052k(C4297j.f23972H2, this.f1544j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int k = a1Var.mo2052k(C4297j.f23992M2, -1);
            this.f1545k = k;
            if (k != -1) {
                this.f1544j = (this.f1544j & 2) | 0;
            }
        }
        int i2 = C4297j.f23988L2;
        if (a1Var.mo2060s(i2) || a1Var.mo2060s(C4297j.f23996N2)) {
            this.f1546l = null;
            int i3 = C4297j.f23996N2;
            if (a1Var.mo2060s(i3)) {
                i2 = i3;
            }
            int i4 = this.f1545k;
            int i5 = this.f1544j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = a1Var.mo2051j(i2, this.f1544j, new C0467a(i4, i5, new WeakReference(this.f1535a)));
                    if (j != null) {
                        if (i < 28 || this.f1545k == -1) {
                            this.f1546l = j;
                        } else {
                            this.f1546l = C0473g.m2316a(Typeface.create(j, 0), this.f1545k, (this.f1544j & 2) != 0);
                        }
                    }
                    this.f1547m = this.f1546l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1546l == null && (o = a1Var.mo2056o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1545k == -1) {
                    this.f1546l = Typeface.create(o, this.f1544j);
                    return;
                }
                Typeface create = Typeface.create(o, 0);
                int i6 = this.f1545k;
                if ((this.f1544j & 2) != 0) {
                    z = true;
                }
                this.f1546l = C0473g.m2316a(create, i6, z);
                return;
            }
            return;
        }
        int i7 = C4297j.f23968G2;
        if (a1Var.mo2060s(i7)) {
            this.f1547m = false;
            int k2 = a1Var.mo2052k(i7, 1);
            if (k2 == 1) {
                this.f1546l = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                this.f1546l = Typeface.SERIF;
            } else if (k2 == 3) {
                this.f1546l = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: a */
    private void m2277a(Drawable drawable, C0571y0 y0Var) {
        if (drawable != null && y0Var != null) {
            C0509k.m2502i(drawable, y0Var, this.f1535a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0571y0 m2278d(Context context, C0509k kVar, int i) {
        ColorStateList f = kVar.mo2401f(context, i);
        if (f == null) {
            return null;
        }
        C0571y0 y0Var = new C0571y0();
        y0Var.f1874d = true;
        y0Var.f1871a = f;
        return y0Var;
    }

    /* renamed from: y */
    private void m2279y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] a = C0469c.m2306a(this.f1535a);
            TextView textView = this.f1535a;
            if (drawable5 == null) {
                drawable5 = a[0];
            }
            if (drawable2 == null) {
                drawable2 = a[1];
            }
            if (drawable6 == null) {
                drawable6 = a[2];
            }
            if (drawable4 == null) {
                drawable4 = a[3];
            }
            C0469c.m2307b(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i >= 17) {
                Drawable[] a2 = C0469c.m2306a(this.f1535a);
                if (!(a2[0] == null && a2[2] == null)) {
                    TextView textView2 = this.f1535a;
                    Drawable drawable7 = a2[0];
                    if (drawable2 == null) {
                        drawable2 = a2[1];
                    }
                    Drawable drawable8 = a2[2];
                    if (drawable4 == null) {
                        drawable4 = a2[3];
                    }
                    C0469c.m2307b(textView2, drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1535a.getCompoundDrawables();
            TextView textView3 = this.f1535a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: z */
    private void m2280z() {
        C0571y0 y0Var = this.f1542h;
        this.f1536b = y0Var;
        this.f1537c = y0Var;
        this.f1538d = y0Var;
        this.f1539e = y0Var;
        this.f1540f = y0Var;
        this.f1541g = y0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo2086A(int i, float f) {
        if (!C0967b.f2691j && !mo2096l()) {
            m2275B(i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2087b() {
        if (!(this.f1536b == null && this.f1537c == null && this.f1538d == null && this.f1539e == null)) {
            Drawable[] compoundDrawables = this.f1535a.getCompoundDrawables();
            m2277a(compoundDrawables[0], this.f1536b);
            m2277a(compoundDrawables[1], this.f1537c);
            m2277a(compoundDrawables[2], this.f1538d);
            m2277a(compoundDrawables[3], this.f1539e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1540f != null || this.f1541g != null) {
            Drawable[] a = C0469c.m2306a(this.f1535a);
            m2277a(a[0], this.f1540f);
            m2277a(a[2], this.f1541g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2088c() {
        this.f1543i.mo2220b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo2089e() {
        return this.f1543i.mo2222h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo2090f() {
        return this.f1543i.mo2223i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo2091g() {
        return this.f1543i.mo2224j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo2092h() {
        return this.f1543i.mo2225k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo2093i() {
        return this.f1543i.mo2226l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo2094j() {
        C0571y0 y0Var = this.f1542h;
        if (y0Var != null) {
            return y0Var.f1871a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo2095k() {
        C0571y0 y0Var = this.f1542h;
        if (y0Var != null) {
            return y0Var.f1872b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo2096l() {
        return this.f1543i.mo2228q();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2097m(android.util.AttributeSet r24, int r25) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            android.widget.TextView r0 = r7.f1535a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.C0509k.m2499b()
            int[] r2 = p048g.C4297j.f24037Y
            r12 = 0
            androidx.appcompat.widget.a1 r13 = androidx.appcompat.widget.C0452a1.m2210v(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1535a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.mo2059r()
            r6 = 0
            r3 = r24
            r5 = r25
            androidx.core.view.C0835a0.m3737l0(r0, r1, r2, r3, r4, r5, r6)
            int r0 = p048g.C4297j.f24041Z
            r14 = -1
            int r0 = r13.mo2055n(r0, r14)
            int r1 = p048g.C4297j.f24056c0
            boolean r2 = r13.mo2060s(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.mo2055n(r1, r12)
            androidx.appcompat.widget.y0 r1 = m2278d(r10, r11, r1)
            r7.f1536b = r1
        L_0x0042:
            int r1 = p048g.C4297j.f24046a0
            boolean r2 = r13.mo2060s(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.mo2055n(r1, r12)
            androidx.appcompat.widget.y0 r1 = m2278d(r10, r11, r1)
            r7.f1537c = r1
        L_0x0054:
            int r1 = p048g.C4297j.f24061d0
            boolean r2 = r13.mo2060s(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.mo2055n(r1, r12)
            androidx.appcompat.widget.y0 r1 = m2278d(r10, r11, r1)
            r7.f1538d = r1
        L_0x0066:
            int r1 = p048g.C4297j.f24051b0
            boolean r2 = r13.mo2060s(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.mo2055n(r1, r12)
            androidx.appcompat.widget.y0 r1 = m2278d(r10, r11, r1)
            r7.f1539e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r1 < r2) goto L_0x00a2
            int r2 = p048g.C4297j.f24066e0
            boolean r3 = r13.mo2060s(r2)
            if (r3 == 0) goto L_0x0090
            int r2 = r13.mo2055n(r2, r12)
            androidx.appcompat.widget.y0 r2 = m2278d(r10, r11, r2)
            r7.f1540f = r2
        L_0x0090:
            int r2 = p048g.C4297j.f24071f0
            boolean r3 = r13.mo2060s(r2)
            if (r3 == 0) goto L_0x00a2
            int r2 = r13.mo2055n(r2, r12)
            androidx.appcompat.widget.y0 r2 = m2278d(r10, r11, r2)
            r7.f1541g = r2
        L_0x00a2:
            r13.mo2061w()
            android.widget.TextView r2 = r7.f1535a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            r5 = 23
            if (r0 == r14) goto L_0x011e
            int[] r6 = p048g.C4297j.f23958E2
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0452a1.m2208t(r10, r0, r6)
            if (r2 != 0) goto L_0x00c9
            int r6 = p048g.C4297j.f24004P2
            boolean r15 = r0.mo2060s(r6)
            if (r15 == 0) goto L_0x00c9
            boolean r6 = r0.mo2042a(r6, r12)
            r15 = 1
            goto L_0x00cb
        L_0x00c9:
            r6 = 0
            r15 = 0
        L_0x00cb:
            r7.m2276C(r10, r0)
            if (r1 >= r5) goto L_0x00f9
            int r4 = p048g.C4297j.f23976I2
            boolean r17 = r0.mo2060s(r4)
            if (r17 == 0) goto L_0x00dd
            android.content.res.ColorStateList r4 = r0.mo2044c(r4)
            goto L_0x00de
        L_0x00dd:
            r4 = 0
        L_0x00de:
            int r13 = p048g.C4297j.f23980J2
            boolean r18 = r0.mo2060s(r13)
            if (r18 == 0) goto L_0x00eb
            android.content.res.ColorStateList r13 = r0.mo2044c(r13)
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            int r14 = p048g.C4297j.f23984K2
            boolean r19 = r0.mo2060s(r14)
            if (r19 == 0) goto L_0x00fb
            android.content.res.ColorStateList r14 = r0.mo2044c(r14)
            goto L_0x00fc
        L_0x00f9:
            r4 = 0
            r13 = 0
        L_0x00fb:
            r14 = 0
        L_0x00fc:
            int r5 = p048g.C4297j.f24008Q2
            boolean r20 = r0.mo2060s(r5)
            if (r20 == 0) goto L_0x0109
            java.lang.String r5 = r0.mo2056o(r5)
            goto L_0x010a
        L_0x0109:
            r5 = 0
        L_0x010a:
            if (r1 < r3) goto L_0x0119
            int r3 = p048g.C4297j.f24000O2
            boolean r21 = r0.mo2060s(r3)
            if (r21 == 0) goto L_0x0119
            java.lang.String r3 = r0.mo2056o(r3)
            goto L_0x011a
        L_0x0119:
            r3 = 0
        L_0x011a:
            r0.mo2061w()
            goto L_0x0125
        L_0x011e:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0125:
            int[] r0 = p048g.C4297j.f23958E2
            androidx.appcompat.widget.a1 r0 = androidx.appcompat.widget.C0452a1.m2210v(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0140
            int r12 = p048g.C4297j.f24004P2
            boolean r22 = r0.mo2060s(r12)
            if (r22 == 0) goto L_0x0140
            r22 = r3
            r3 = 0
            boolean r6 = r0.mo2042a(r12, r3)
            r3 = 23
            r15 = 1
            goto L_0x0144
        L_0x0140:
            r22 = r3
            r3 = 23
        L_0x0144:
            if (r1 >= r3) goto L_0x016a
            int r3 = p048g.C4297j.f23976I2
            boolean r12 = r0.mo2060s(r3)
            if (r12 == 0) goto L_0x0152
            android.content.res.ColorStateList r4 = r0.mo2044c(r3)
        L_0x0152:
            int r3 = p048g.C4297j.f23980J2
            boolean r12 = r0.mo2060s(r3)
            if (r12 == 0) goto L_0x015e
            android.content.res.ColorStateList r13 = r0.mo2044c(r3)
        L_0x015e:
            int r3 = p048g.C4297j.f23984K2
            boolean r12 = r0.mo2060s(r3)
            if (r12 == 0) goto L_0x016a
            android.content.res.ColorStateList r14 = r0.mo2044c(r3)
        L_0x016a:
            int r3 = p048g.C4297j.f24008Q2
            boolean r12 = r0.mo2060s(r3)
            if (r12 == 0) goto L_0x0176
            java.lang.String r5 = r0.mo2056o(r3)
        L_0x0176:
            r3 = 26
            if (r1 < r3) goto L_0x0187
            int r3 = p048g.C4297j.f24000O2
            boolean r12 = r0.mo2060s(r3)
            if (r12 == 0) goto L_0x0187
            java.lang.String r3 = r0.mo2056o(r3)
            goto L_0x0189
        L_0x0187:
            r3 = r22
        L_0x0189:
            r12 = 28
            if (r1 < r12) goto L_0x01a6
            int r12 = p048g.C4297j.f23963F2
            boolean r16 = r0.mo2060s(r12)
            if (r16 == 0) goto L_0x01a6
            r16 = r11
            r11 = -1
            int r12 = r0.mo2047f(r12, r11)
            if (r12 != 0) goto L_0x01a8
            android.widget.TextView r11 = r7.f1535a
            r12 = 0
            r8 = 0
            r11.setTextSize(r8, r12)
            goto L_0x01a8
        L_0x01a6:
            r16 = r11
        L_0x01a8:
            r7.m2276C(r10, r0)
            r0.mo2061w()
            if (r4 == 0) goto L_0x01b5
            android.widget.TextView r0 = r7.f1535a
            r0.setTextColor(r4)
        L_0x01b5:
            if (r13 == 0) goto L_0x01bc
            android.widget.TextView r0 = r7.f1535a
            r0.setHintTextColor(r13)
        L_0x01bc:
            if (r14 == 0) goto L_0x01c3
            android.widget.TextView r0 = r7.f1535a
            r0.setLinkTextColor(r14)
        L_0x01c3:
            if (r2 != 0) goto L_0x01ca
            if (r15 == 0) goto L_0x01ca
            r7.mo2103s(r6)
        L_0x01ca:
            android.graphics.Typeface r0 = r7.f1546l
            if (r0 == 0) goto L_0x01e0
            int r2 = r7.f1545k
            r4 = -1
            if (r2 != r4) goto L_0x01db
            android.widget.TextView r2 = r7.f1535a
            int r4 = r7.f1544j
            r2.setTypeface(r0, r4)
            goto L_0x01e0
        L_0x01db:
            android.widget.TextView r2 = r7.f1535a
            r2.setTypeface(r0)
        L_0x01e0:
            if (r3 == 0) goto L_0x01e7
            android.widget.TextView r0 = r7.f1535a
            androidx.appcompat.widget.C0466c0.C0472f.m2315d(r0, r3)
        L_0x01e7:
            if (r5 == 0) goto L_0x020d
            r0 = 24
            if (r1 < r0) goto L_0x01f7
            android.widget.TextView r0 = r7.f1535a
            android.os.LocaleList r1 = androidx.appcompat.widget.C0466c0.C0471e.m2310a(r5)
            androidx.appcompat.widget.C0466c0.C0471e.m2311b(r0, r1)
            goto L_0x020d
        L_0x01f7:
            r0 = 21
            if (r1 < r0) goto L_0x020d
            java.lang.String r0 = ","
            java.lang.String[] r0 = r5.split(r0)
            r1 = 0
            r0 = r0[r1]
            android.widget.TextView r1 = r7.f1535a
            java.util.Locale r0 = androidx.appcompat.widget.C0466c0.C0470d.m2309a(r0)
            androidx.appcompat.widget.C0466c0.C0469c.m2308c(r1, r0)
        L_0x020d:
            androidx.appcompat.widget.e0 r0 = r7.f1543i
            r1 = r24
            r0.mo2229r(r1, r9)
            boolean r0 = androidx.core.widget.C0967b.f2691j
            if (r0 == 0) goto L_0x0255
            androidx.appcompat.widget.e0 r0 = r7.f1543i
            int r0 = r0.mo2226l()
            if (r0 == 0) goto L_0x0255
            androidx.appcompat.widget.e0 r0 = r7.f1543i
            int[] r0 = r0.mo2225k()
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0255
            android.widget.TextView r2 = r7.f1535a
            int r2 = androidx.appcompat.widget.C0466c0.C0472f.m2312a(r2)
            float r2 = (float) r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x024f
            android.widget.TextView r0 = r7.f1535a
            androidx.appcompat.widget.e0 r2 = r7.f1543i
            int r2 = r2.mo2223i()
            androidx.appcompat.widget.e0 r3 = r7.f1543i
            int r3 = r3.mo2222h()
            androidx.appcompat.widget.e0 r4 = r7.f1543i
            int r4 = r4.mo2224j()
            r5 = 0
            androidx.appcompat.widget.C0466c0.C0472f.m2313b(r0, r2, r3, r4, r5)
            goto L_0x0255
        L_0x024f:
            r5 = 0
            android.widget.TextView r2 = r7.f1535a
            androidx.appcompat.widget.C0466c0.C0472f.m2314c(r2, r0, r5)
        L_0x0255:
            int[] r0 = p048g.C4297j.f24076g0
            androidx.appcompat.widget.a1 r8 = androidx.appcompat.widget.C0452a1.m2209u(r10, r1, r0)
            int r0 = p048g.C4297j.f24116o0
            r1 = -1
            int r0 = r8.mo2055n(r0, r1)
            r2 = r16
            if (r0 == r1) goto L_0x026c
            android.graphics.drawable.Drawable r0 = r2.mo2399c(r10, r0)
            r3 = r0
            goto L_0x026d
        L_0x026c:
            r3 = 0
        L_0x026d:
            int r0 = p048g.C4297j.f24141t0
            int r0 = r8.mo2055n(r0, r1)
            if (r0 == r1) goto L_0x027b
            android.graphics.drawable.Drawable r0 = r2.mo2399c(r10, r0)
            r4 = r0
            goto L_0x027c
        L_0x027b:
            r4 = 0
        L_0x027c:
            int r0 = p048g.C4297j.f24121p0
            int r0 = r8.mo2055n(r0, r1)
            if (r0 == r1) goto L_0x028a
            android.graphics.drawable.Drawable r0 = r2.mo2399c(r10, r0)
            r5 = r0
            goto L_0x028b
        L_0x028a:
            r5 = 0
        L_0x028b:
            int r0 = p048g.C4297j.f24106m0
            int r0 = r8.mo2055n(r0, r1)
            if (r0 == r1) goto L_0x0299
            android.graphics.drawable.Drawable r0 = r2.mo2399c(r10, r0)
            r6 = r0
            goto L_0x029a
        L_0x0299:
            r6 = 0
        L_0x029a:
            int r0 = p048g.C4297j.f24126q0
            int r0 = r8.mo2055n(r0, r1)
            if (r0 == r1) goto L_0x02a8
            android.graphics.drawable.Drawable r0 = r2.mo2399c(r10, r0)
            r9 = r0
            goto L_0x02a9
        L_0x02a8:
            r9 = 0
        L_0x02a9:
            int r0 = p048g.C4297j.f24111n0
            int r0 = r8.mo2055n(r0, r1)
            if (r0 == r1) goto L_0x02b7
            android.graphics.drawable.Drawable r0 = r2.mo2399c(r10, r0)
            r10 = r0
            goto L_0x02b8
        L_0x02b7:
            r10 = 0
        L_0x02b8:
            r0 = r23
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r9
            r6 = r10
            r0.m2279y(r1, r2, r3, r4, r5, r6)
            int r0 = p048g.C4297j.f24131r0
            boolean r1 = r8.mo2060s(r0)
            if (r1 == 0) goto L_0x02d4
            android.content.res.ColorStateList r0 = r8.mo2044c(r0)
            android.widget.TextView r1 = r7.f1535a
            androidx.core.widget.C0986j.m4458g(r1, r0)
        L_0x02d4:
            int r0 = p048g.C4297j.f24136s0
            boolean r1 = r8.mo2060s(r0)
            if (r1 == 0) goto L_0x02ec
            r1 = -1
            int r0 = r8.mo2052k(r0, r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0500i0.m2467d(r0, r2)
            android.widget.TextView r2 = r7.f1535a
            androidx.core.widget.C0986j.m4459h(r2, r0)
            goto L_0x02ed
        L_0x02ec:
            r1 = -1
        L_0x02ed:
            int r0 = p048g.C4297j.f24151v0
            int r0 = r8.mo2047f(r0, r1)
            int r2 = p048g.C4297j.f24156w0
            int r2 = r8.mo2047f(r2, r1)
            int r3 = p048g.C4297j.f24161x0
            int r3 = r8.mo2047f(r3, r1)
            r8.mo2061w()
            if (r0 == r1) goto L_0x0309
            android.widget.TextView r4 = r7.f1535a
            androidx.core.widget.C0986j.m4461j(r4, r0)
        L_0x0309:
            if (r2 == r1) goto L_0x0310
            android.widget.TextView r0 = r7.f1535a
            androidx.core.widget.C0986j.m4462k(r0, r2)
        L_0x0310:
            if (r3 == r1) goto L_0x0317
            android.widget.TextView r0 = r7.f1535a
            androidx.core.widget.C0986j.m4463l(r0, r3)
        L_0x0317:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0466c0.mo2097m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2098n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1547m) {
            this.f1546l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView == null) {
                return;
            }
            if (C0835a0.m3704Q(textView)) {
                textView.post(new C0468b(textView, typeface, this.f1544j));
            } else {
                textView.setTypeface(typeface, this.f1544j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2099o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0967b.f2691j) {
            mo2088c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2100p() {
        mo2087b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2101q(Context context, int i) {
        String o;
        ColorStateList c;
        ColorStateList c2;
        ColorStateList c3;
        C0452a1 t = C0452a1.m2208t(context, i, C4297j.f23958E2);
        int i2 = C4297j.f24004P2;
        if (t.mo2060s(i2)) {
            mo2103s(t.mo2042a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C4297j.f23976I2;
            if (t.mo2060s(i4) && (c3 = t.mo2044c(i4)) != null) {
                this.f1535a.setTextColor(c3);
            }
            int i5 = C4297j.f23984K2;
            if (t.mo2060s(i5) && (c2 = t.mo2044c(i5)) != null) {
                this.f1535a.setLinkTextColor(c2);
            }
            int i6 = C4297j.f23980J2;
            if (t.mo2060s(i6) && (c = t.mo2044c(i6)) != null) {
                this.f1535a.setHintTextColor(c);
            }
        }
        int i7 = C4297j.f23963F2;
        if (t.mo2060s(i7) && t.mo2047f(i7, -1) == 0) {
            this.f1535a.setTextSize(0, 0.0f);
        }
        m2276C(context, t);
        if (i3 >= 26) {
            int i8 = C4297j.f24000O2;
            if (t.mo2060s(i8) && (o = t.mo2056o(i8)) != null) {
                C0472f.m2315d(this.f1535a, o);
            }
        }
        t.mo2061w();
        Typeface typeface = this.f1546l;
        if (typeface != null) {
            this.f1535a.setTypeface(typeface, this.f1544j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2102r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            C5861a.m34740f(editorInfo, textView.getText());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo2103s(boolean z) {
        this.f1535a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2104t(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1543i.mo2230s(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2105u(int[] iArr, int i) throws IllegalArgumentException {
        this.f1543i.mo2231t(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo2106v(int i) {
        this.f1543i.mo2232u(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo2107w(ColorStateList colorStateList) {
        if (this.f1542h == null) {
            this.f1542h = new C0571y0();
        }
        C0571y0 y0Var = this.f1542h;
        y0Var.f1871a = colorStateList;
        y0Var.f1874d = colorStateList != null;
        m2280z();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2108x(PorterDuff.Mode mode) {
        if (this.f1542h == null) {
            this.f1542h = new C0571y0();
        }
        C0571y0 y0Var = this.f1542h;
        y0Var.f1872b = mode;
        y0Var.f1873c = mode != null;
        m2280z();
    }
}
