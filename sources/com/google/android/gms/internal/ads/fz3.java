package com.google.android.gms.internal.ads;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fz3<T> implements wz3<T> {

    /* renamed from: q */
    private static final int[] f9597q = new int[0];

    /* renamed from: r */
    private static final Unsafe f9598r = y04.m23667q();

    /* renamed from: a */
    private final int[] f9599a;

    /* renamed from: b */
    private final Object[] f9600b;

    /* renamed from: c */
    private final int f9601c;

    /* renamed from: d */
    private final int f9602d;

    /* renamed from: e */
    private final cz3 f9603e;

    /* renamed from: f */
    private final boolean f9604f;

    /* renamed from: g */
    private final boolean f9605g;

    /* renamed from: h */
    private final boolean f9606h;

    /* renamed from: i */
    private final int[] f9607i;

    /* renamed from: j */
    private final int f9608j;

    /* renamed from: k */
    private final int f9609k;

    /* renamed from: l */
    private final qy3 f9610l;

    /* renamed from: m */
    private final n04 f9611m;

    /* renamed from: n */
    private final fx3 f9612n;

    /* renamed from: o */
    private final hz3 f9613o;

    /* renamed from: p */
    private final xy3 f9614p;

    private fz3(int[] iArr, Object[] objArr, int i, int i2, cz3 cz3, boolean z, boolean z2, int[] iArr2, int i3, int i4, hz3 hz3, qy3 qy3, n04 n04, fx3 fx3, xy3 xy3, byte[] bArr) {
        cz3 cz32 = cz3;
        fx3 fx32 = fx3;
        this.f9599a = iArr;
        this.f9600b = objArr;
        this.f9601c = i;
        this.f9602d = i2;
        this.f9605g = cz32 instanceof sx3;
        this.f9606h = z;
        boolean z3 = false;
        if (fx32 != null && fx32.mo10348h(cz3)) {
            z3 = true;
        }
        this.f9604f = z3;
        this.f9607i = iArr2;
        this.f9608j = i3;
        this.f9609k = i4;
        this.f9613o = hz3;
        this.f9610l = qy3;
        this.f9611m = n04;
        this.f9612n = fx32;
        this.f9603e = cz32;
        this.f9614p = xy3;
    }

    /* renamed from: A */
    private final boolean m12925A(Object obj, int i) {
        int X = m12947X(i);
        long j = (long) (X & 1048575);
        if (j != 1048575) {
            return (y04.m23662l(obj, j) & (1 << (X >>> 20))) != 0;
        }
        int m = m12950m(i);
        long j2 = (long) (m & 1048575);
        switch (m12949l(m)) {
            case 0:
                return Double.doubleToRawLongBits(y04.m23660j(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(y04.m23661k(obj, j2)) != 0;
            case 2:
                return y04.m23664n(obj, j2) != 0;
            case 3:
                return y04.m23664n(obj, j2) != 0;
            case 4:
                return y04.m23662l(obj, j2) != 0;
            case 5:
                return y04.m23664n(obj, j2) != 0;
            case 6:
                return y04.m23662l(obj, j2) != 0;
            case 7:
                return y04.m23650H(obj, j2);
            case 8:
                Object p = y04.m23666p(obj, j2);
                if (p instanceof String) {
                    return !((String) p).isEmpty();
                }
                if (p instanceof jw3) {
                    return !jw3.f11808b.equals(p);
                }
                throw new IllegalArgumentException();
            case 9:
                return y04.m23666p(obj, j2) != null;
            case 10:
                return !jw3.f11808b.equals(y04.m23666p(obj, j2));
            case 11:
                return y04.m23662l(obj, j2) != 0;
            case 12:
                return y04.m23662l(obj, j2) != 0;
            case 13:
                return y04.m23662l(obj, j2) != 0;
            case 14:
                return y04.m23664n(obj, j2) != 0;
            case 15:
                return y04.m23662l(obj, j2) != 0;
            case 16:
                return y04.m23664n(obj, j2) != 0;
            case 17:
                return y04.m23666p(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: B */
    private final boolean m12926B(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m12925A(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: C */
    private static boolean m12927C(Object obj, int i, wz3 wz3) {
        return wz3.mo10362d(y04.m23666p(obj, (long) (i & 1048575)));
    }

    /* renamed from: D */
    private final boolean m12928D(Object obj, int i, int i2) {
        return y04.m23662l(obj, (long) (m12947X(i2) & 1048575)) == i;
    }

    /* renamed from: E */
    private static boolean m12929E(Object obj, long j) {
        return ((Boolean) y04.m23666p(obj, j)).booleanValue();
    }

    /* renamed from: F */
    private final void m12930F(Object obj, ax3 ax3) throws IOException {
        int i;
        Object obj2 = obj;
        ax3 ax32 = ax3;
        if (!this.f9604f) {
            int length = this.f9599a.length;
            Unsafe unsafe = f9598r;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int m = m12950m(i3);
                int[] iArr = this.f9599a;
                int i6 = iArr[i3];
                int l = m12949l(m);
                if (l <= 17) {
                    int i7 = iArr[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(obj2, (long) i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (m & i2);
                switch (l) {
                    case 0:
                        if ((i4 & i) == 0) {
                            break;
                        } else {
                            ax32.mo8612q(i6, y04.m23660j(obj2, j));
                            continue;
                        }
                    case 1:
                        if ((i4 & i) != 0) {
                            ax32.mo8621z(i6, y04.m23661k(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i4 & i) != 0) {
                            ax32.mo8590E(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i4 & i) != 0) {
                            ax32.mo8606j(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i4 & i) != 0) {
                            ax32.mo8588C(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i4 & i) != 0) {
                            ax32.mo8619x(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i4 & i) != 0) {
                            ax32.mo8617v(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i4 & i) != 0) {
                            ax32.mo8608m(i6, y04.m23650H(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        if ((i4 & i) != 0) {
                            m12932H(i6, unsafe.getObject(obj2, j), ax32);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i4 & i) != 0) {
                            ax32.mo8592G(i6, unsafe.getObject(obj2, j), m12953p(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i4 & i) != 0) {
                            ax32.mo8610o(i6, (jw3) unsafe.getObject(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i4 & i) != 0) {
                            ax32.mo8604h(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i4 & i) != 0) {
                            ax32.mo8615t(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i4 & i) != 0) {
                            ax32.mo8593H(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i4 & i) != 0) {
                            ax32.mo8595J(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i4 & i) != 0) {
                            ax32.mo8597a(i6, unsafe.getInt(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i4 & i) != 0) {
                            ax32.mo8599c(i6, unsafe.getLong(obj2, j));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i4 & i) != 0) {
                            ax32.mo8587B(i6, unsafe.getObject(obj2, j), m12953p(i3));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        yz3.m24297l(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        continue;
                    case 19:
                        yz3.m24301p(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        continue;
                    case 20:
                        yz3.m24304s(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        continue;
                    case 21:
                        yz3.m24259B(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        continue;
                    case 22:
                        yz3.m24303r(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        continue;
                    case 23:
                        yz3.m24300o(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        continue;
                    case 24:
                        yz3.m24299n(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        continue;
                    case 25:
                        yz3.m24295j(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        continue;
                    case 26:
                        yz3.m24310y(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32);
                        break;
                    case 27:
                        yz3.m24305t(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, m12953p(i3));
                        break;
                    case 28:
                        yz3.m24296k(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32);
                        break;
                    case 29:
                        yz3.m24311z(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        break;
                    case 30:
                        yz3.m24298m(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        break;
                    case 31:
                        yz3.m24306u(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        break;
                    case 32:
                        yz3.m24307v(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        break;
                    case 33:
                        yz3.m24308w(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        break;
                    case 34:
                        yz3.m24309x(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, false);
                        break;
                    case 35:
                        yz3.m24297l(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 36:
                        yz3.m24301p(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 37:
                        yz3.m24304s(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 38:
                        yz3.m24259B(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 39:
                        yz3.m24303r(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 40:
                        yz3.m24300o(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 41:
                        yz3.m24299n(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 42:
                        yz3.m24295j(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                        yz3.m24311z(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                        yz3.m24298m(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 45:
                        yz3.m24306u(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 46:
                        yz3.m24307v(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 47:
                        yz3.m24308w(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 48:
                        yz3.m24309x(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, true);
                        break;
                    case 49:
                        yz3.m24302q(this.f9599a[i3], (List) unsafe.getObject(obj2, j), ax32, m12953p(i3));
                        break;
                    case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                        m12931G(ax32, i6, unsafe.getObject(obj2, j), i3);
                        break;
                    case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8612q(i6, m12936M(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8621z(i6, m12937N(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8590E(i6, m12951n(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8606j(i6, m12951n(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8588C(i6, m12940Q(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorError /*56*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8619x(i6, m12951n(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8617v(i6, m12940Q(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8608m(i6, m12929E(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                        if (m12928D(obj2, i6, i3)) {
                            m12932H(i6, unsafe.getObject(obj2, j), ax32);
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8592G(i6, unsafe.getObject(obj2, j), m12953p(i3));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8610o(i6, (jw3) unsafe.getObject(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8604h(i6, m12940Q(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8615t(i6, m12940Q(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8593H(i6, m12940Q(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8595J(i6, m12951n(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8597a(i6, m12940Q(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8599c(i6, m12951n(obj2, j));
                            break;
                        }
                        break;
                    case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                        if (m12928D(obj2, i6, i3)) {
                            ax32.mo8587B(i6, unsafe.getObject(obj2, j), m12953p(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            n04 n04 = this.f9611m;
            n04.mo12504r(n04.mo12490d(obj2), ax32);
            return;
        }
        this.f9612n.mo10341a(obj2);
        throw null;
    }

    /* renamed from: G */
    private final void m12931G(ax3 ax3, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            vy3 vy3 = (vy3) m12955r(i2);
            throw null;
        }
    }

    /* renamed from: H */
    private static final void m12932H(int i, Object obj, ax3 ax3) throws IOException {
        if (obj instanceof String) {
            ax3.mo8602f(i, (String) obj);
        } else {
            ax3.mo8610o(i, (jw3) obj);
        }
    }

    /* renamed from: J */
    static o04 m12933J(Object obj) {
        sx3 sx3 = (sx3) obj;
        o04 o04 = sx3.zzc;
        if (o04 != o04.m17404c()) {
            return o04;
        }
        o04 e = o04.m17406e();
        sx3.zzc = e;
        return e;
    }

    /* renamed from: K */
    static fz3 m12934K(Class cls, zy3 zy3, hz3 hz3, qy3 qy3, n04 n04, fx3 fx3, xy3 xy3) {
        if (zy3 instanceof mz3) {
            return m12935L((mz3) zy3, hz3, qy3, n04, fx3, xy3);
        }
        k04 k04 = (k04) zy3;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.ads.fz3 m12935L(com.google.android.gms.internal.ads.mz3 r34, com.google.android.gms.internal.ads.hz3 r35, com.google.android.gms.internal.ads.qy3 r36, com.google.android.gms.internal.ads.n04 r37, com.google.android.gms.internal.ads.fx3 r38, com.google.android.gms.internal.ads.xy3 r39) {
        /*
            int r0 = r34.mo11551e()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = 0
        L_0x000b:
            java.lang.String r0 = r34.mo12472a()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0056
            int[] r6 = f9597q
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0165
        L_0x0056:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0075
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0062:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0072
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0062
        L_0x0072:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0075:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0094
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0081:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0091
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0081
        L_0x0091:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0094:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b3
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a0:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b0
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a0
        L_0x00b0:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b3:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00bf:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00cf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00bf
        L_0x00cf:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d2:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00de:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00de
        L_0x00ee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f1:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fd:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fd
        L_0x010d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0110:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011c:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011c
        L_0x012d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0131:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013d:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x014f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013d
        L_0x014f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0165:
            sun.misc.Unsafe r15 = f9598r
            java.lang.Object[] r17 = r34.mo12473b()
            com.google.android.gms.internal.ads.cz3 r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ab
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0193:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a5
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0193
        L_0x01a5:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ad
        L_0x01ab:
            r2 = r24
        L_0x01ad:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01da
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bb:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d4
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bb
        L_0x01d4:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01de
        L_0x01da:
            r28 = r3
            r3 = r24
        L_0x01de:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ec
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ec:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0222
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0203:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021c
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0203
        L_0x021c:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0226
        L_0x0222:
            r32 = r12
            r14 = r27
        L_0x0226:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0247
            r14 = 17
            if (r12 != r14) goto L_0x0233
            goto L_0x0247
        L_0x0233:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0247:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0260
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0268
        L_0x0260:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m12956s(r1, r12)
            r17[r3] = r12
        L_0x0268:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r8 = (int) r7
            int r3 = r3 + 1
            r7 = r17[r3]
            boolean r12 = r7 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027b
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x0283
        L_0x027b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m12956s(r1, r7)
            r17[r3] = r7
        L_0x0283:
            r3 = r8
            long r7 = r15.objectFieldOffset(r7)
            int r8 = (int) r7
            r30 = r0
            r7 = r1
            r1 = r8
            r29 = r11
            r25 = 1
            r8 = r3
            r3 = 0
            goto L_0x0391
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m12956s(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r8 = (int) r7
            r7 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r7 != r11) goto L_0x0378
            r7 = 17
            if (r5 > r7) goto L_0x0378
            int r7 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0354
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r11) goto L_0x0350
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r26
            r3 = r3 | r7
            int r26 = r26 + 13
            r7 = r27
            goto L_0x033e
        L_0x0350:
            int r7 = r7 << r26
            r3 = r3 | r7
            goto L_0x0356
        L_0x0354:
            r27 = r7
        L_0x0356:
            int r7 = r6 + r6
            int r26 = r3 / 32
            int r7 = r7 + r26
            r11 = r17[r7]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m12956s(r1, r11)
            r17[r7] = r11
        L_0x036f:
            r7 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r1 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0378:
            r30 = r0
            r7 = r1
            r27 = r3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
        L_0x0381:
            r0 = 18
            if (r5 < r0) goto L_0x038f
            r0 = 49
            if (r5 > r0) goto L_0x038f
            int r0 = r23 + 1
            r13[r23] = r8
            r23 = r0
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r8
            r31[r0] = r2
            int r9 = r4 + 1
            int r0 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r7
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0183
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.ads.fz3 r0 = new com.google.android.gms.internal.ads.fz3
            r4 = r0
            com.google.android.gms.internal.ads.cz3 r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz3.m12935L(com.google.android.gms.internal.ads.mz3, com.google.android.gms.internal.ads.hz3, com.google.android.gms.internal.ads.qy3, com.google.android.gms.internal.ads.n04, com.google.android.gms.internal.ads.fx3, com.google.android.gms.internal.ads.xy3):com.google.android.gms.internal.ads.fz3");
    }

    /* renamed from: M */
    private static double m12936M(Object obj, long j) {
        return ((Double) y04.m23666p(obj, j)).doubleValue();
    }

    /* renamed from: N */
    private static float m12937N(Object obj, long j) {
        return ((Float) y04.m23666p(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030c, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030d, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030e, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x037d, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0488, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0503, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0504, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x052d, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x053b, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x054a, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054e, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f1, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019e, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01be, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m12938O(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f9598r
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000f:
            int[] r9 = r0.f9599a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0555
            int r9 = r0.m12950m(r5)
            int[] r10 = r0.f9599a
            r11 = r10[r5]
            int r12 = m12949l(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r8) goto L_0x0039
            long r7 = (long) r13
            int r7 = r2.getInt(r1, r7)
            r8 = r13
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x053f;
                case 1: goto L_0x0530;
                case 2: goto L_0x051a;
                case 3: goto L_0x0506;
                case 4: goto L_0x04f0;
                case 5: goto L_0x04e4;
                case 6: goto L_0x04d8;
                case 7: goto L_0x04ca;
                case 8: goto L_0x049f;
                case 9: goto L_0x048c;
                case 10: goto L_0x046f;
                case 11: goto L_0x045a;
                case 12: goto L_0x0445;
                case 13: goto L_0x0438;
                case 14: goto L_0x042b;
                case 15: goto L_0x0411;
                case 16: goto L_0x03f7;
                case 17: goto L_0x03e3;
                case 18: goto L_0x03d5;
                case 19: goto L_0x03c9;
                case 20: goto L_0x03bd;
                case 21: goto L_0x03b1;
                case 22: goto L_0x03a5;
                case 23: goto L_0x0399;
                case 24: goto L_0x038d;
                case 25: goto L_0x0381;
                case 26: goto L_0x0373;
                case 27: goto L_0x0364;
                case 28: goto L_0x0359;
                case 29: goto L_0x034d;
                case 30: goto L_0x0341;
                case 31: goto L_0x0335;
                case 32: goto L_0x0329;
                case 33: goto L_0x031d;
                case 34: goto L_0x0311;
                case 35: goto L_0x02f8;
                case 36: goto L_0x02e3;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b9;
                case 39: goto L_0x02a4;
                case 40: goto L_0x028f;
                case 41: goto L_0x0279;
                case 42: goto L_0x0263;
                case 43: goto L_0x024d;
                case 44: goto L_0x0237;
                case 45: goto L_0x0221;
                case 46: goto L_0x020b;
                case 47: goto L_0x01f5;
                case 48: goto L_0x01df;
                case 49: goto L_0x01cf;
                case 50: goto L_0x01c2;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a2;
                case 53: goto L_0x018a;
                case 54: goto L_0x0175;
                case 55: goto L_0x015f;
                case 56: goto L_0x0152;
                case 57: goto L_0x0145;
                case 58: goto L_0x0136;
                case 59: goto L_0x0109;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00d7;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00ab;
                case 64: goto L_0x009d;
                case 65: goto L_0x008f;
                case 66: goto L_0x0074;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x037e
        L_0x0042:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.cz3 r3 = (com.google.android.gms.internal.ads.cz3) r3
            com.google.android.gms.internal.ads.wz3 r4 = r0.m12953p(r5)
            int r3 = com.google.android.gms.internal.ads.zw3.m24862F(r11, r3, r4)
            goto L_0x037d
        L_0x0058:
            boolean r10 = r0.m12928D(r1, r11, r5)
            if (r10 == 0) goto L_0x037e
            long r3 = m12951n(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.ads.zw3.m24869f(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.ads.zw3.m24870g(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x037e
        L_0x0074:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m12940Q(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030d
        L_0x008f:
            boolean r3 = r0.m12928D(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x01be
        L_0x009d:
            boolean r3 = r0.m12928D(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x01ae
        L_0x00ab:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m12940Q(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = com.google.android.gms.internal.ads.zw3.m24863G(r3)
            goto L_0x030d
        L_0x00c1:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m12940Q(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030d
        L_0x00d7:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.jw3 r3 = (com.google.android.gms.internal.ads.jw3) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = r3.mo9361q()
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
        L_0x00f1:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x030e
        L_0x00f5:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.wz3 r4 = r0.m12953p(r5)
            int r3 = com.google.android.gms.internal.ads.yz3.m24274Q(r11, r3, r4)
            goto L_0x037d
        L_0x0109:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.jw3
            if (r4 == 0) goto L_0x0128
            com.google.android.gms.internal.ads.jw3 r3 = (com.google.android.gms.internal.ads.jw3) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = r3.mo9361q()
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x00f1
        L_0x0128:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = com.google.android.gms.internal.ads.zw3.m24867d(r3)
            goto L_0x030d
        L_0x0136:
            boolean r3 = r0.m12928D(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            int r3 = r3 + r14
            goto L_0x037d
        L_0x0145:
            boolean r3 = r0.m12928D(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x01ae
        L_0x0152:
            boolean r3 = r0.m12928D(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x01be
        L_0x015f:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m12940Q(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = com.google.android.gms.internal.ads.zw3.m24863G(r3)
            goto L_0x030d
        L_0x0175:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m12951n(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r9)
            int r3 = com.google.android.gms.internal.ads.zw3.m24870g(r3)
            goto L_0x019e
        L_0x018a:
            boolean r9 = r0.m12928D(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m12951n(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r9)
            int r3 = com.google.android.gms.internal.ads.zw3.m24870g(r3)
        L_0x019e:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x037e
        L_0x01a2:
            boolean r3 = r0.m12928D(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
        L_0x01ae:
            int r3 = r3 + 4
            goto L_0x037d
        L_0x01b2:
            boolean r3 = r0.m12928D(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
        L_0x01be:
            int r3 = r3 + 8
            goto L_0x037d
        L_0x01c2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.m12955r(r5)
            com.google.android.gms.internal.ads.xy3.m23616a(r11, r3, r4)
            goto L_0x037e
        L_0x01cf:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.wz3 r4 = r0.m12953p(r5)
            int r3 = com.google.android.gms.internal.ads.yz3.m24269L(r11, r3, r4)
            goto L_0x037d
        L_0x01df:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24279V(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x01f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24277T(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x020b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24268K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x0221:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24266I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x0237:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24264G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x024d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24282Y(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x0263:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24261D(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x0279:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24266I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x028f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24268K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x02a4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24271N(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x02b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24285a0(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x02ce:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24273P(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x02e3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24266I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x030c
        L_0x02f8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24268K(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.ads.zw3.m24868e(r11)
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
        L_0x030c:
            int r4 = r4 + r9
        L_0x030d:
            int r4 = r4 + r3
        L_0x030e:
            int r6 = r6 + r4
            goto L_0x037e
        L_0x0311:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.ads.yz3.m24278U(r11, r3, r9)
            goto L_0x037d
        L_0x031d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24276S(r11, r3, r9)
            goto L_0x037d
        L_0x0329:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24267J(r11, r3, r9)
            goto L_0x037d
        L_0x0335:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24265H(r11, r3, r9)
            goto L_0x037d
        L_0x0341:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24263F(r11, r3, r9)
            goto L_0x037d
        L_0x034d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24281X(r11, r3, r9)
            goto L_0x037d
        L_0x0359:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24262E(r11, r3)
            goto L_0x037d
        L_0x0364:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.ads.wz3 r4 = r0.m12953p(r5)
            int r3 = com.google.android.gms.internal.ads.yz3.m24275R(r11, r3, r4)
            goto L_0x037d
        L_0x0373:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24280W(r11, r3)
        L_0x037d:
            int r6 = r6 + r3
        L_0x037e:
            r12 = 0
            goto L_0x054e
        L_0x0381:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.ads.yz3.m24258A(r11, r3, r12)
            goto L_0x03e0
        L_0x038d:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24265H(r11, r3, r12)
            goto L_0x03e0
        L_0x0399:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24267J(r11, r3, r12)
            goto L_0x03e0
        L_0x03a5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24270M(r11, r3, r12)
            goto L_0x03e0
        L_0x03b1:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24283Z(r11, r3, r12)
            goto L_0x03e0
        L_0x03bd:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24272O(r11, r3, r12)
            goto L_0x03e0
        L_0x03c9:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24265H(r11, r3, r12)
            goto L_0x03e0
        L_0x03d5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.ads.yz3.m24267J(r11, r3, r12)
        L_0x03e0:
            int r6 = r6 + r3
            goto L_0x054e
        L_0x03e3:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.cz3 r3 = (com.google.android.gms.internal.ads.cz3) r3
            com.google.android.gms.internal.ads.wz3 r4 = r0.m12953p(r5)
            int r3 = com.google.android.gms.internal.ads.zw3.m24862F(r11, r3, r4)
            goto L_0x03e0
        L_0x03f7:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.ads.zw3.m24869f(r10)
            long r14 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r14
            int r3 = com.google.android.gms.internal.ads.zw3.m24870g(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x054e
        L_0x0411:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x0503
        L_0x042b:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x054a
        L_0x0438:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x053b
        L_0x0445:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = com.google.android.gms.internal.ads.zw3.m24863G(r3)
            goto L_0x0503
        L_0x045a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x0503
        L_0x046f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.jw3 r3 = (com.google.android.gms.internal.ads.jw3) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = r3.mo9361q()
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
        L_0x0488:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0504
        L_0x048c:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.ads.wz3 r4 = r0.m12953p(r5)
            int r3 = com.google.android.gms.internal.ads.yz3.m24274Q(r11, r3, r4)
            goto L_0x03e0
        L_0x049f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.jw3
            if (r4 == 0) goto L_0x04bd
            com.google.android.gms.internal.ads.jw3 r3 = (com.google.android.gms.internal.ads.jw3) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = r3.mo9361q()
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x0488
        L_0x04bd:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = com.google.android.gms.internal.ads.zw3.m24867d(r3)
            goto L_0x0503
        L_0x04ca:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            int r3 = r3 + r14
            goto L_0x03e0
        L_0x04d8:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x053b
        L_0x04e4:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
            goto L_0x054a
        L_0x04f0:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            int r3 = com.google.android.gms.internal.ads.zw3.m24863G(r3)
        L_0x0503:
            int r4 = r4 + r3
        L_0x0504:
            int r6 = r6 + r4
            goto L_0x054e
        L_0x0506:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r9)
            int r3 = com.google.android.gms.internal.ads.zw3.m24870g(r3)
            goto L_0x052d
        L_0x051a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.ads.zw3.m24869f(r9)
            int r3 = com.google.android.gms.internal.ads.zw3.m24870g(r3)
        L_0x052d:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x054e
        L_0x0530:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
        L_0x053b:
            int r3 = r3 + 4
            goto L_0x03e0
        L_0x053f:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.ads.zw3.m24869f(r3)
        L_0x054a:
            int r3 = r3 + 8
            goto L_0x03e0
        L_0x054e:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x0555:
            com.google.android.gms.internal.ads.n04 r2 = r0.f9611m
            java.lang.Object r3 = r2.mo12490d(r1)
            int r2 = r2.mo12487a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f9604f
            if (r2 != 0) goto L_0x0565
            return r6
        L_0x0565:
            com.google.android.gms.internal.ads.fx3 r2 = r0.f9612n
            r2.mo10341a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz3.m12938O(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m12939P(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f9598r
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f9599a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m12950m(r2)
            int r5 = m12949l(r4)
            int[] r6 = r11.f9599a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.ads.kx3 r4 = com.google.android.gms.internal.ads.kx3.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.ads.kx3 r4 = com.google.android.gms.internal.ads.kx3.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f9599a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            com.google.android.gms.internal.ads.cz3 r4 = (com.google.android.gms.internal.ads.cz3) r4
            com.google.android.gms.internal.ads.wz3 r5 = r11.m12953p(r2)
            int r4 = com.google.android.gms.internal.ads.zw3.m24862F(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m12928D(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m12951n(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.zw3.m24870g(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m12940Q(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m12940Q(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = com.google.android.gms.internal.ads.zw3.m24863G(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m12940Q(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            com.google.android.gms.internal.ads.jw3 r4 = (com.google.android.gms.internal.ads.jw3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = r4.mo9361q()
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            com.google.android.gms.internal.ads.wz3 r5 = r11.m12953p(r2)
            int r4 = com.google.android.gms.internal.ads.yz3.m24274Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.jw3
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.ads.jw3 r4 = (com.google.android.gms.internal.ads.jw3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = r4.mo9361q()
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = com.google.android.gms.internal.ads.zw3.m24867d(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m12940Q(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = com.google.android.gms.internal.ads.zw3.m24863G(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m12951n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r6)
            int r4 = com.google.android.gms.internal.ads.zw3.m24870g(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m12951n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r6)
            int r4 = com.google.android.gms.internal.ads.zw3.m24870g(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m12928D(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.lang.Object r5 = r11.m12955r(r2)
            com.google.android.gms.internal.ads.xy3.m23616a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.wz3 r5 = r11.m12953p(r2)
            int r4 = com.google.android.gms.internal.ads.yz3.m24269L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24279V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24277T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24268K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24266I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24264G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24282Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24261D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24266I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24268K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24271N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24285a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24273P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24266I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24268K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.ads.zw3.m24868e(r6)
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24278U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24276S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24267J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24265H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24263F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24281X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24262E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.ads.wz3 r5 = r11.m12953p(r2)
            int r4 = com.google.android.gms.internal.ads.yz3.m24275R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24280W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24258A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24265H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24267J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24270M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24283Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24272O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24265H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.ads.yz3.m24267J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            com.google.android.gms.internal.ads.cz3 r4 = (com.google.android.gms.internal.ads.cz3) r4
            com.google.android.gms.internal.ads.wz3 r5 = r11.m12953p(r2)
            int r4 = com.google.android.gms.internal.ads.zw3.m24862F(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m12925A(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.ads.y04.m23664n(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.ads.zw3.m24870g(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.y04.m23662l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.y04.m23662l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = com.google.android.gms.internal.ads.zw3.m24863G(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.y04.m23662l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            com.google.android.gms.internal.ads.jw3 r4 = (com.google.android.gms.internal.ads.jw3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = r4.mo9361q()
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            com.google.android.gms.internal.ads.wz3 r5 = r11.m12953p(r2)
            int r4 = com.google.android.gms.internal.ads.yz3.m24274Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.jw3
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.ads.jw3 r4 = (com.google.android.gms.internal.ads.jw3) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = r4.mo9361q()
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = com.google.android.gms.internal.ads.zw3.m24867d(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.ads.y04.m23662l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.ads.zw3.m24869f(r5)
            int r4 = com.google.android.gms.internal.ads.zw3.m24863G(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.ads.y04.m23664n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r6)
            int r4 = com.google.android.gms.internal.ads.zw3.m24870g(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.ads.y04.m23664n(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.ads.zw3.m24869f(r6)
            int r4 = com.google.android.gms.internal.ads.zw3.m24870g(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m12925A(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.ads.zw3.m24869f(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.ads.n04 r0 = r11.f9611m
            java.lang.Object r12 = r0.mo12490d(r12)
            int r12 = r0.mo12487a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz3.m12939P(java.lang.Object):int");
    }

    /* renamed from: Q */
    private static int m12940Q(Object obj, long j) {
        return ((Integer) y04.m23666p(obj, j)).intValue();
    }

    /* renamed from: R */
    private final int m12941R(Object obj, byte[] bArr, int i, int i2, int i3, long j, vv3 vv3) throws IOException {
        Unsafe unsafe = f9598r;
        Object r = m12955r(i3);
        Object object = unsafe.getObject(obj, j);
        if (xy3.m23617b(object)) {
            wy3 c = wy3.m22957b().mo15002c();
            xy3.m23618c(c, object);
            unsafe.putObject(obj, j, c);
        }
        vy3 vy3 = (vy3) r;
        throw null;
    }

    /* renamed from: S */
    private final int m12942S(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, vv3 vv3) throws IOException {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        vv3 vv32 = vv3;
        Unsafe unsafe = f9598r;
        long j3 = (long) (this.f9599a[i13 + 2] & 1048575);
        switch (i7) {
            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(wv3.m22927n(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(wv3.m22915b(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
            case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                if (i12 == 0) {
                    int m = wv3.m22926m(bArr2, i9, vv32);
                    unsafe.putObject(obj2, j2, Long.valueOf(vv32.f19250b));
                    unsafe.putInt(obj2, j3, i11);
                    return m;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                if (i12 == 0) {
                    int j4 = wv3.m22923j(bArr2, i9, vv32);
                    unsafe.putObject(obj2, j2, Integer.valueOf(vv32.f19249a));
                    unsafe.putInt(obj2, j3, i11);
                    return j4;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorError /*56*/:
            case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(wv3.m22927n(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
            case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(wv3.m22915b(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                if (i12 == 0) {
                    int m2 = wv3.m22926m(bArr2, i9, vv32);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(vv32.f19250b != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return m2;
                }
                break;
            case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                if (i12 == 2) {
                    int j5 = wv3.m22923j(bArr2, i9, vv32);
                    int i14 = vv32.f19249a;
                    if (i14 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) == 0 || d14.m11289j(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i14, cy3.f7982b));
                        j5 += i14;
                    } else {
                        throw ey3.m12340d();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return j5;
                }
                break;
            case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                if (i12 == 2) {
                    int d = wv3.m22917d(m12953p(i13), bArr2, i9, i2, vv32);
                    Object object = unsafe.getInt(obj2, j3) == i11 ? unsafe.getObject(obj2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(obj2, j2, vv32.f19251c);
                    } else {
                        unsafe.putObject(obj2, j2, cy3.m11235g(object, vv32.f19251c));
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return d;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                if (i12 == 2) {
                    int a = wv3.m22914a(bArr2, i9, vv32);
                    unsafe.putObject(obj2, j2, vv32.f19251c);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                if (i12 == 0) {
                    int j6 = wv3.m22923j(bArr2, i9, vv32);
                    int i15 = vv32.f19249a;
                    wx3 o = m12952o(i13);
                    if (o == null || o.mo8195g(i15)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m12933J(obj).mo12785h(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                if (i12 == 0) {
                    int j7 = wv3.m22923j(bArr2, i9, vv32);
                    unsafe.putObject(obj2, j2, Integer.valueOf(sw3.m20669e(vv32.f19249a)));
                    unsafe.putInt(obj2, j3, i11);
                    return j7;
                }
                break;
            case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                if (i12 == 0) {
                    int m3 = wv3.m22926m(bArr2, i9, vv32);
                    unsafe.putObject(obj2, j2, Long.valueOf(sw3.m20670f(vv32.f19250b)));
                    unsafe.putInt(obj2, j3, i11);
                    return m3;
                }
                break;
            case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                if (i12 == 3) {
                    int c = wv3.m22916c(m12953p(i13), bArr, i, i2, (i10 & -8) | 4, vv3);
                    Object object2 = unsafe.getInt(obj2, j3) == i11 ? unsafe.getObject(obj2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj2, j2, vv32.f19251c);
                    } else {
                        unsafe.putObject(obj2, j2, cy3.m11235g(object2, vv32.f19251c));
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return c;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x032e, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0351, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c5, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0237, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023b, code lost:
        r7 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0241, code lost:
        r2 = r5;
        r28 = r7;
        r23 = r10;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02e7, code lost:
        if (r0 != r15) goto L_0x02e9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m12943T(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.vv3 r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            sun.misc.Unsafe r9 = f9598r
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x037a
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.ads.wv3.m22924k(r0, r12, r3, r11)
            int r3 = r11.f19249a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.m12946W(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.m12945V(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = -1
            r23 = 0
            goto L_0x0354
        L_0x004e:
            int[] r0 = r15.f9599a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = m12949l(r1)
            r33 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x024c
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x008b
            r20 = r2
            if (r7 == r5) goto L_0x007f
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0081
        L_0x007f:
            r7 = r19
        L_0x0081:
            if (r0 == r5) goto L_0x0088
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x0088:
            r2 = r7
            r7 = r0
            goto L_0x008f
        L_0x008b:
            r20 = r2
            r2 = r19
        L_0x008f:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x021c;
                case 1: goto L_0x0201;
                case 2: goto L_0x01e0;
                case 3: goto L_0x01e0;
                case 4: goto L_0x01c8;
                case 5: goto L_0x01a6;
                case 6: goto L_0x018f;
                case 7: goto L_0x016f;
                case 8: goto L_0x014c;
                case 9: goto L_0x011f;
                case 10: goto L_0x0107;
                case 11: goto L_0x01c8;
                case 12: goto L_0x00f0;
                case 13: goto L_0x018f;
                case 14: goto L_0x01a6;
                case 15: goto L_0x00d5;
                case 16: goto L_0x00a0;
                default: goto L_0x0093;
            }
        L_0x0093:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            goto L_0x0241
        L_0x00a0:
            if (r3 != 0) goto L_0x00c7
            int r10 = com.google.android.gms.internal.ads.wv3.m22926m(r12, r4, r11)
            long r0 = r11.f19250b
            long r21 = com.google.android.gms.internal.ads.sw3.m20670f(r0)
            r0 = r2
            r1 = r31
            r19 = r7
            r4 = r20
            r7 = r2
            r2 = r8
            r20 = r33
            r8 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            goto L_0x023b
        L_0x00c7:
            r19 = r7
            r8 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x0241
        L_0x00d5:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.ads.wv3.m22923j(r12, r4, r11)
            int r1 = r11.f19249a
            int r1 = com.google.android.gms.internal.ads.sw3.m20669e(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x00f0:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.ads.wv3.m22923j(r12, r4, r11)
            int r1 = r11.f19249a
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x0107:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.ads.wv3.m22914a(r12, r4, r11)
            java.lang.Object r1 = r11.f19251c
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x011f:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            com.google.android.gms.internal.ads.wz3 r0 = r15.m12953p(r10)
            int r0 = com.google.android.gms.internal.ads.wv3.m22917d(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0141
            java.lang.Object r1 = r11.f19251c
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x0141:
            java.lang.Object r2 = r11.f19251c
            java.lang.Object r1 = com.google.android.gms.internal.ads.cy3.m11235g(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x014c:
            r19 = r7
            r10 = r20
            r0 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0164
            int r0 = com.google.android.gms.internal.ads.wv3.m22920g(r12, r4, r11)
            goto L_0x0168
        L_0x0164:
            int r0 = com.google.android.gms.internal.ads.wv3.m22921h(r12, r4, r11)
        L_0x0168:
            java.lang.Object r1 = r11.f19251c
            r7.putObject(r14, r8, r1)
            goto L_0x0237
        L_0x016f:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.ads.wv3.m22926m(r12, r4, r11)
            long r1 = r11.f19250b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0189
            r1 = 1
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            com.google.android.gms.internal.ads.y04.m23674x(r14, r8, r1)
            goto L_0x0237
        L_0x018f:
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            int r0 = com.google.android.gms.internal.ads.wv3.m22915b(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x0237
        L_0x01a6:
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x01c5
            long r21 = com.google.android.gms.internal.ads.wv3.m22927n(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0237
        L_0x01c5:
            r5 = r4
            goto L_0x0241
        L_0x01c8:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0241
            int r0 = com.google.android.gms.internal.ads.wv3.m22923j(r12, r5, r11)
            int r1 = r11.f19249a
            r7.putInt(r14, r8, r1)
            goto L_0x0237
        L_0x01e0:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != 0) goto L_0x0241
            int r17 = com.google.android.gms.internal.ads.wv3.m22926m(r12, r5, r11)
            long r4 = r11.f19250b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x023b
        L_0x0201:
            r5 = r4
            r19 = r7
            r10 = r20
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0241
            int r0 = com.google.android.gms.internal.ads.wv3.m22915b(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.y04.m23643A(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x0237
        L_0x021c:
            r5 = r4
            r19 = r7
            r10 = r20
            r0 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r33
            r7 = r2
            if (r3 != r0) goto L_0x0241
            long r0 = com.google.android.gms.internal.ads.wv3.m22927n(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.y04.m23676z(r14, r8, r0)
            int r0 = r5 + 8
        L_0x0237:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
        L_0x023b:
            r7 = r19
            r1 = r20
            goto L_0x0374
        L_0x0241:
            r2 = r5
            r28 = r7
            r23 = r10
            r7 = r19
            r19 = -1
            goto L_0x0354
        L_0x024c:
            r20 = r33
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r7
            r7 = r29
            r0 = 27
            if (r10 != r0) goto L_0x02aa
            r0 = 2
            if (r3 != r0) goto L_0x029d
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.ads.by3 r0 = (com.google.android.gms.internal.ads.by3) r0
            boolean r1 = r0.mo8988e()
            if (r1 != 0) goto L_0x027d
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0275
            r1 = 10
            goto L_0x0276
        L_0x0275:
            int r1 = r1 + r1
        L_0x0276:
            com.google.android.gms.internal.ads.by3 r0 = r0.mo8975h(r1)
            r7.putObject(r14, r8, r0)
        L_0x027d:
            r8 = r0
            com.google.android.gms.internal.ads.wz3 r0 = r15.m12953p(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r23 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.ads.wv3.m22918e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r7 = r19
            r1 = r20
            r2 = r23
            goto L_0x0374
        L_0x029d:
            r23 = r4
            r15 = r5
            r26 = r6
            r28 = r7
            r27 = r19
            r19 = -1
            goto L_0x0331
        L_0x02aa:
            r23 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02ff
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r26 = r6
            r6 = r20
            r27 = r19
            r19 = r7
            r7 = r33
            r24 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r35
            int r0 = r0.m12944U(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02fd
        L_0x02e9:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            goto L_0x0372
        L_0x02fd:
            r2 = r0
            goto L_0x0332
        L_0x02ff:
            r33 = r3
            r15 = r5
            r26 = r6
            r28 = r7
            r24 = r8
            r18 = r10
            r27 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            if (r9 != r0) goto L_0x0337
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0331
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r23
            r6 = r24
            r8 = r35
            int r0 = r0.m12941R(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02fd
            goto L_0x02e9
        L_0x0331:
            r2 = r15
        L_0x0332:
            r6 = r26
            r7 = r27
            goto L_0x0354
        L_0x0337:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r35
            int r0 = r0.m12942S(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02fd
            goto L_0x02e9
        L_0x0354:
            com.google.android.gms.internal.ads.o04 r4 = m12933J(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.ads.wv3.m22922i(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r20
            r2 = r23
        L_0x0372:
            r9 = r28
        L_0x0374:
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x001a
        L_0x037a:
            r26 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x038d
            long r1 = (long) r7
            r3 = r31
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x038d:
            r1 = r34
            if (r0 != r1) goto L_0x0392
            return r0
        L_0x0392:
            com.google.android.gms.internal.ads.ey3 r0 = com.google.android.gms.internal.ads.ey3.m12343g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz3.m12943T(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.vv3):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x044f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    /* renamed from: U */
    private final int m12944U(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.vv3 r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f9598r
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.ads.by3 r12 = (com.google.android.gms.internal.ads.by3) r12
            boolean r13 = r12.mo8988e()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.ads.by3 r12 = r12.mo8975h(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x0394;
                case 20: goto L_0x0351;
                case 21: goto L_0x0351;
                case 22: goto L_0x0336;
                case 23: goto L_0x02f5;
                case 24: goto L_0x02b4;
                case 25: goto L_0x025a;
                case 26: goto L_0x01a7;
                case 27: goto L_0x018c;
                case 28: goto L_0x0132;
                case 29: goto L_0x0336;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02b4;
                case 32: goto L_0x02f5;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x0394;
                case 37: goto L_0x0351;
                case 38: goto L_0x0351;
                case 39: goto L_0x0336;
                case 40: goto L_0x02f5;
                case 41: goto L_0x02b4;
                case 42: goto L_0x025a;
                case 43: goto L_0x0336;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02b4;
                case 46: goto L_0x02f5;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x044f
            com.google.android.gms.internal.ads.wz3 r1 = r15.m12953p(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.wv3.m22916c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f19251c
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.ads.ry3 r12 = (com.google.android.gms.internal.ads.ry3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r2 = r7.f19249a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r1, r7)
            long r4 = r7.f19250b
            long r4 = com.google.android.gms.internal.ads.sw3.m20670f(r4)
            r12.mo13901i(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.ry3 r12 = (com.google.android.gms.internal.ads.ry3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r4, r7)
            long r8 = r7.f19250b
            long r8 = com.google.android.gms.internal.ads.sw3.m20670f(r8)
            r12.mo13901i(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r6 = r7.f19249a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r4, r7)
            long r8 = r7.f19250b
            long r8 = com.google.android.gms.internal.ads.sw3.m20670f(r8)
            r12.mo13901i(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.ads.tx3 r12 = (com.google.android.gms.internal.ads.tx3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r2 = r7.f19249a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r4 = r7.f19249a
            int r4 = com.google.android.gms.internal.ads.sw3.m20669e(r4)
            r12.mo14422i0(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.tx3 r12 = (com.google.android.gms.internal.ads.tx3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r4 = r7.f19249a
            int r4 = com.google.android.gms.internal.ads.sw3.m20669e(r4)
            r12.mo14422i0(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r6 = r7.f19249a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r4 = r7.f19249a
            int r4 = com.google.android.gms.internal.ads.sw3.m20669e(r4)
            r12.mo14422i0(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.ads.wv3.m22919f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.wv3.m22925l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.ads.sx3 r1 = (com.google.android.gms.internal.ads.sx3) r1
            com.google.android.gms.internal.ads.o04 r3 = r1.zzc
            com.google.android.gms.internal.ads.o04 r4 = com.google.android.gms.internal.ads.o04.m17404c()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.ads.wx3 r4 = r15.m12952o(r8)
            com.google.android.gms.internal.ads.n04 r5 = r0.f9611m
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.ads.yz3.m24288c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.ads.o04 r3 = (com.google.android.gms.internal.ads.o04) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r4 = r7.f19249a
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.ads.jw3 r4 = com.google.android.gms.internal.ads.jw3.f11808b
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.ads.jw3 r6 = com.google.android.gms.internal.ads.jw3.m15087L(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r6 = r7.f19249a
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r4 = r7.f19249a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.ads.jw3 r4 = com.google.android.gms.internal.ads.jw3.f11808b
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.ads.jw3 r6 = com.google.android.gms.internal.ads.jw3.m15087L(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12342f()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12342f()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.ads.wz3 r1 = r15.m12953p(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.ads.wv3.m22918e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01fa
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r6 = r7.f19249a
            if (r6 < 0) goto L_0x01f5
            if (r6 != 0) goto L_0x01c2
            r12.add(r1)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.cy3.f7982b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01cc:
            int r4 = r4 + r6
        L_0x01cd:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r8 = r7.f19249a
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r6, r7)
            int r6 = r7.f19249a
            if (r6 < 0) goto L_0x01f0
            if (r6 != 0) goto L_0x01e5
            r12.add(r1)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.ads.cy3.f7982b
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12342f()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12342f()
            throw r1
        L_0x01fa:
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r6 = r7.f19249a
            if (r6 < 0) goto L_0x0255
            if (r6 != 0) goto L_0x0208
            r12.add(r1)
            goto L_0x021b
        L_0x0208:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.d14.m11289j(r3, r4, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.cy3.f7982b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x021a:
            r4 = r8
        L_0x021b:
            if (r4 >= r5) goto L_0x044f
            int r6 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r8 = r7.f19249a
            if (r2 != r8) goto L_0x044f
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r6, r7)
            int r6 = r7.f19249a
            if (r6 < 0) goto L_0x024b
            if (r6 != 0) goto L_0x0233
            r12.add(r1)
            goto L_0x021b
        L_0x0233:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.d14.m11289j(r3, r4, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.ads.cy3.f7982b
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12340d()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12342f()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12340d()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12342f()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.ads.xv3 r12 = (com.google.android.gms.internal.ads.xv3) r12
            int r2 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r4 = r7.f19249a
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r2, r7)
            long r5 = r7.f19250b
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0274
            r5 = 1
            goto L_0x0275
        L_0x0274:
            r5 = 0
        L_0x0275:
            r12.mo15248c(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.xv3 r12 = (com.google.android.gms.internal.ads.xv3) r12
            int r4 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r4, r7)
            long r8 = r7.f19250b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = 1
            goto L_0x0294
        L_0x0293:
            r6 = 0
        L_0x0294:
            r12.mo15248c(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r8 = r7.f19249a
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r6, r7)
            long r8 = r7.f19250b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r12.mo15248c(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.ads.tx3 r12 = (com.google.android.gms.internal.ads.tx3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r2 = r7.f19249a
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.ads.wv3.m22915b(r3, r1)
            r12.mo14422i0(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.ads.tx3 r12 = (com.google.android.gms.internal.ads.tx3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22915b(r17, r18)
            r12.mo14422i0(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r6 = r7.f19249a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.ads.wv3.m22915b(r3, r4)
            r12.mo14422i0(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.ads.ry3 r12 = (com.google.android.gms.internal.ads.ry3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r2 = r7.f19249a
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.ads.wv3.m22927n(r3, r1)
            r12.mo13901i(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.ads.ry3 r12 = (com.google.android.gms.internal.ads.ry3) r12
            long r8 = com.google.android.gms.internal.ads.wv3.m22927n(r17, r18)
            r12.mo13901i(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r6 = r7.f19249a
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.ads.wv3.m22927n(r3, r4)
            r12.mo13901i(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.ads.wv3.m22919f(r3, r4, r12, r7)
            goto L_0x0450
        L_0x033e:
            if (r6 == 0) goto L_0x0342
            goto L_0x044f
        L_0x0342:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.ads.wv3.m22925l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.ads.ry3 r12 = (com.google.android.gms.internal.ads.ry3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r2 = r7.f19249a
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r1, r7)
            long r4 = r7.f19250b
            r12.mo13901i(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.ads.ry3 r12 = (com.google.android.gms.internal.ads.ry3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r4, r7)
            long r8 = r7.f19250b
            r12.mo13901i(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r6 = r7.f19249a
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.ads.wv3.m22926m(r3, r4, r7)
            long r8 = r7.f19250b
            r12.mo13901i(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.ads.lx3 r12 = (com.google.android.gms.internal.ads.lx3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r2 = r7.f19249a
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.ads.wv3.m22915b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo12216c(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.ads.lx3 r12 = (com.google.android.gms.internal.ads.lx3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22915b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo12216c(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r6 = r7.f19249a
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.ads.wv3.m22915b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo12216c(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.ads.bx3 r12 = (com.google.android.gms.internal.ads.bx3) r12
            int r1 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r2 = r7.f19249a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.ads.wv3.m22927n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo8971c(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.ads.ey3 r1 = com.google.android.gms.internal.ads.ey3.m12345j()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.ads.bx3 r12 = (com.google.android.gms.internal.ads.bx3) r12
            long r8 = com.google.android.gms.internal.ads.wv3.m22927n(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo8971c(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r1, r7)
            int r6 = r7.f19249a
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.ads.wv3.m22927n(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo8971c(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.ads.wv3.m22923j(r3, r4, r7)
            int r9 = r7.f19249a
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.ads.wv3.m22916c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f19251c
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz3.m12944U(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.vv3):int");
    }

    /* renamed from: V */
    private final int m12945V(int i) {
        if (i < this.f9601c || i > this.f9602d) {
            return -1;
        }
        return m12948k(i, 0);
    }

    /* renamed from: W */
    private final int m12946W(int i, int i2) {
        if (i < this.f9601c || i > this.f9602d) {
            return -1;
        }
        return m12948k(i, i2);
    }

    /* renamed from: X */
    private final int m12947X(int i) {
        return this.f9599a[i + 2];
    }

    /* renamed from: k */
    private final int m12948k(int i, int i2) {
        int length = (this.f9599a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f9599a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: l */
    private static int m12949l(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: m */
    private final int m12950m(int i) {
        return this.f9599a[i + 1];
    }

    /* renamed from: n */
    private static long m12951n(Object obj, long j) {
        return ((Long) y04.m23666p(obj, j)).longValue();
    }

    /* renamed from: o */
    private final wx3 m12952o(int i) {
        int i2 = i / 3;
        return (wx3) this.f9600b[i2 + i2 + 1];
    }

    /* renamed from: p */
    private final wz3 m12953p(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        wz3 wz3 = (wz3) this.f9600b[i3];
        if (wz3 != null) {
            return wz3;
        }
        wz3 b = kz3.m15715a().mo11837b((Class) this.f9600b[i3 + 1]);
        this.f9600b[i3] = b;
        return b;
    }

    /* renamed from: q */
    private final Object m12954q(Object obj, int i, Object obj2, n04 n04) {
        int i2 = this.f9599a[i];
        Object p = y04.m23666p(obj, (long) (m12950m(i) & 1048575));
        if (p == null || m12952o(i) == null) {
            return obj2;
        }
        wy3 wy3 = (wy3) p;
        vy3 vy3 = (vy3) m12955r(i);
        throw null;
    }

    /* renamed from: r */
    private final Object m12955r(int i) {
        int i2 = i / 3;
        return this.f9600b[i2 + i2];
    }

    /* renamed from: s */
    private static Field m12956s(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: t */
    private final void m12957t(Object obj, Object obj2, int i) {
        long m = (long) (m12950m(i) & 1048575);
        if (m12925A(obj2, i)) {
            Object p = y04.m23666p(obj, m);
            Object p2 = y04.m23666p(obj2, m);
            if (p != null && p2 != null) {
                y04.m23646D(obj, m, cy3.m11235g(p, p2));
                m12960w(obj, i);
            } else if (p2 != null) {
                y04.m23646D(obj, m, p2);
                m12960w(obj, i);
            }
        }
    }

    /* renamed from: u */
    private final void m12958u(Object obj, Object obj2, int i) {
        int m = m12950m(i);
        int i2 = this.f9599a[i];
        long j = (long) (m & 1048575);
        if (m12928D(obj2, i2, i)) {
            Object p = m12928D(obj, i2, i) ? y04.m23666p(obj, j) : null;
            Object p2 = y04.m23666p(obj2, j);
            if (p != null && p2 != null) {
                y04.m23646D(obj, j, cy3.m11235g(p, p2));
                m12961x(obj, i2, i);
            } else if (p2 != null) {
                y04.m23646D(obj, j, p2);
                m12961x(obj, i2, i);
            }
        }
    }

    /* renamed from: v */
    private final void m12959v(Object obj, int i, nz3 nz3) throws IOException {
        if (m12963z(i)) {
            y04.m23646D(obj, (long) (i & 1048575), nz3.mo12755j());
        } else if (this.f9605g) {
            y04.m23646D(obj, (long) (i & 1048575), nz3.mo12752g());
        } else {
            y04.m23646D(obj, (long) (i & 1048575), nz3.mo12746b0());
        }
    }

    /* renamed from: w */
    private final void m12960w(Object obj, int i) {
        int X = m12947X(i);
        long j = (long) (1048575 & X);
        if (j != 1048575) {
            y04.m23644B(obj, j, (1 << (X >>> 20)) | y04.m23662l(obj, j));
        }
    }

    /* renamed from: x */
    private final void m12961x(Object obj, int i, int i2) {
        y04.m23644B(obj, (long) (m12947X(i2) & 1048575), i);
    }

    /* renamed from: y */
    private final boolean m12962y(Object obj, Object obj2, int i) {
        return m12925A(obj, i) == m12925A(obj2, i);
    }

    /* renamed from: z */
    private static boolean m12963z(int i) {
        return (i & 536870912) != 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x036b, code lost:
        if (r0 != r15) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0387, code lost:
        r8 = r31;
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03af, code lost:
        if (r0 != r15) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d4, code lost:
        if (r0 != r15) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x022a, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0266, code lost:
        r5 = r6 | r24;
        r3 = r7;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x02a9, code lost:
        r5 = r6 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02ab, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02ac, code lost:
        r1 = r11;
        r2 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c5, code lost:
        r2 = r4;
        r20 = r6;
        r18 = r7;
        r26 = r10;
        r8 = r11;
        r23 = r19;
        r6 = r25;
        r7 = r33;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10358I(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.ads.vv3 r34) throws java.io.IOException {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f9598r
            r16 = 0
            r0 = r31
            r1 = 0
            r2 = -1
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r13) goto L_0x0448
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.android.gms.internal.ads.wv3.m22924k(r0, r12, r1, r9)
            int r1 = r9.f19249a
            goto L_0x002d
        L_0x0028:
            r27 = r1
            r1 = r0
            r0 = r27
        L_0x002d:
            int r7 = r1 >>> 3
            r8 = r1 & 7
            r4 = 3
            if (r7 <= r2) goto L_0x003a
            int r3 = r3 / r4
            int r2 = r15.m12946W(r7, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.m12945V(r7)
        L_0x003e:
            r3 = -1
            if (r2 != r3) goto L_0x0050
            r2 = r0
            r8 = r1
            r20 = r5
            r23 = r7
            r26 = r10
            r7 = r11
            r17 = -1
            r18 = 0
            goto L_0x03d7
        L_0x0050:
            int[] r3 = r15.f9599a
            int r19 = r2 + 1
            r4 = r3[r19]
            int r11 = m12949l(r4)
            r19 = r1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r4 & r17
            r21 = r0
            long r0 = (long) r1
            r22 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02d5
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x0089
            r17 = r2
            if (r6 == r3) goto L_0x0081
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x0081:
            long r1 = (long) r0
            int r5 = r10.getInt(r14, r1)
            r25 = r0
            goto L_0x008d
        L_0x0089:
            r17 = r2
            r25 = r6
        L_0x008d:
            r6 = r5
            r0 = 5
            switch(r11) {
                case 0: goto L_0x028a;
                case 1: goto L_0x026b;
                case 2: goto L_0x0249;
                case 3: goto L_0x0249;
                case 4: goto L_0x022d;
                case 5: goto L_0x0209;
                case 6: goto L_0x01ed;
                case 7: goto L_0x01c8;
                case 8: goto L_0x01a1;
                case 9: goto L_0x016d;
                case 10: goto L_0x0150;
                case 11: goto L_0x022d;
                case 12: goto L_0x0118;
                case 13: goto L_0x01ed;
                case 14: goto L_0x0209;
                case 15: goto L_0x00f8;
                case 16: goto L_0x00c4;
                default: goto L_0x0092;
            }
        L_0x0092:
            r11 = r19
            r4 = r21
            r2 = r22
            r0 = 3
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x02c5
            com.google.android.gms.internal.ads.wz3 r0 = r15.m12953p(r7)
            int r1 = r19 << 3
            r5 = r1 | 4
            r1 = r30
            r12 = r2
            r2 = r4
            r3 = r32
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.wv3.m22916c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x02b1
            java.lang.Object r1 = r9.f19251c
            r10.putObject(r14, r12, r1)
            goto L_0x02be
        L_0x00c4:
            if (r8 != 0) goto L_0x00e9
            r1 = r21
            int r8 = com.google.android.gms.internal.ads.wv3.m22926m(r12, r1, r9)
            long r0 = r9.f19250b
            long r4 = com.google.android.gms.internal.ads.sw3.m20670f(r0)
            r1 = r22
            r0 = r10
            r11 = r19
            r1 = r29
            r19 = r7
            r7 = r17
            r17 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r22
            r0.putLong(r1, r2, r4)
            goto L_0x0266
        L_0x00e9:
            r11 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            r4 = r21
            goto L_0x02c5
        L_0x00f8:
            r11 = r19
            r1 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.wv3.m22923j(r12, r1, r9)
            int r1 = r9.f19249a
            int r1 = com.google.android.gms.internal.ads.sw3.m20669e(r1)
            r2 = r22
            r10.putInt(r14, r2, r1)
            goto L_0x02a9
        L_0x0118:
            r11 = r19
            r1 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.wv3.m22923j(r12, r1, r9)
            int r1 = r9.f19249a
            com.google.android.gms.internal.ads.wx3 r4 = r15.m12952o(r7)
            if (r4 == 0) goto L_0x014b
            boolean r4 = r4.mo8195g(r1)
            if (r4 == 0) goto L_0x013c
            goto L_0x014b
        L_0x013c:
            com.google.android.gms.internal.ads.o04 r2 = m12933J(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo12785h(r11, r1)
            r5 = r6
            goto L_0x02ab
        L_0x014b:
            r10.putInt(r14, r2, r1)
            goto L_0x02a9
        L_0x0150:
            r11 = r19
            r1 = r21
            r2 = r22
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.wv3.m22914a(r12, r1, r9)
            java.lang.Object r1 = r9.f19251c
            r10.putObject(r14, r2, r1)
            goto L_0x02a9
        L_0x016d:
            r11 = r19
            r1 = r21
            r2 = r22
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            com.google.android.gms.internal.ads.wz3 r0 = r15.m12953p(r7)
            int r0 = com.google.android.gms.internal.ads.wv3.m22917d(r0, r12, r1, r13, r9)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x0192
            java.lang.Object r1 = r9.f19251c
            r10.putObject(r14, r2, r1)
            goto L_0x02a9
        L_0x0192:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f19251c
            java.lang.Object r1 = com.google.android.gms.internal.ads.cy3.m11235g(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x02a9
        L_0x01a1:
            r11 = r19
            r1 = r21
            r2 = r22
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r4
            if (r0 != 0) goto L_0x01bd
            int r0 = com.google.android.gms.internal.ads.wv3.m22920g(r12, r1, r9)
            goto L_0x01c1
        L_0x01bd:
            int r0 = com.google.android.gms.internal.ads.wv3.m22921h(r12, r1, r9)
        L_0x01c1:
            java.lang.Object r1 = r9.f19251c
            r10.putObject(r14, r2, r1)
            goto L_0x02a9
        L_0x01c8:
            r11 = r19
            r1 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.wv3.m22926m(r12, r1, r9)
            long r4 = r9.f19250b
            r20 = 0
            int r1 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x01e7
            r1 = 1
            goto L_0x01e8
        L_0x01e7:
            r1 = 0
        L_0x01e8:
            com.google.android.gms.internal.ads.y04.m23674x(r14, r2, r1)
            goto L_0x02a9
        L_0x01ed:
            r11 = r19
            r1 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            int r0 = com.google.android.gms.internal.ads.wv3.m22915b(r12, r1)
            r10.putInt(r14, r2, r0)
            int r0 = r1 + 4
            goto L_0x02a9
        L_0x0209:
            r11 = r19
            r1 = r21
            r2 = r22
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x022a
            long r4 = com.google.android.gms.internal.ads.wv3.m22927n(r12, r1)
            r8 = r1
            r0 = r10
            r1 = r29
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x02a9
        L_0x022a:
            r4 = r1
            goto L_0x02c5
        L_0x022d:
            r11 = r19
            r4 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.ads.wv3.m22923j(r12, r4, r9)
            int r1 = r9.f19249a
            r10.putInt(r14, r2, r1)
            goto L_0x02a9
        L_0x0249:
            r11 = r19
            r4 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != 0) goto L_0x02c5
            int r8 = com.google.android.gms.internal.ads.wv3.m22926m(r12, r4, r9)
            long r4 = r9.f19250b
            r0 = r10
            r1 = r29
            r0.putLong(r1, r2, r4)
        L_0x0266:
            r5 = r6 | r24
            r3 = r7
            r0 = r8
            goto L_0x02ac
        L_0x026b:
            r11 = r19
            r4 = r21
            r2 = r22
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.ads.wv3.m22915b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.y04.m23643A(r14, r2, r0)
            int r0 = r4 + 4
            goto L_0x02a9
        L_0x028a:
            r11 = r19
            r4 = r21
            r2 = r22
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r17
            r17 = -1
            if (r8 != r0) goto L_0x02c5
            long r0 = com.google.android.gms.internal.ads.wv3.m22927n(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.y04.m23676z(r14, r2, r0)
            int r0 = r4 + 8
        L_0x02a9:
            r5 = r6 | r24
        L_0x02ab:
            r3 = r7
        L_0x02ac:
            r1 = r11
            r2 = r19
            goto L_0x0329
        L_0x02b1:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f19251c
            java.lang.Object r1 = com.google.android.gms.internal.ads.cy3.m11235g(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x02be:
            r5 = r6 | r24
            r12 = r30
            r13 = r32
            goto L_0x02ab
        L_0x02c5:
            r2 = r4
            r20 = r6
            r18 = r7
            r26 = r10
            r8 = r11
            r23 = r19
            r6 = r25
            r7 = r33
            goto L_0x03d7
        L_0x02d5:
            r3 = r19
            r12 = r22
            r17 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r7
            r7 = r2
            r2 = r21
            r0 = 27
            if (r11 != r0) goto L_0x033e
            r0 = 2
            if (r8 != r0) goto L_0x032f
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.ads.by3 r0 = (com.google.android.gms.internal.ads.by3) r0
            boolean r1 = r0.mo8988e()
            if (r1 != 0) goto L_0x0307
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02ff
            r1 = 10
            goto L_0x0300
        L_0x02ff:
            int r1 = r1 + r1
        L_0x0300:
            com.google.android.gms.internal.ads.by3 r0 = r0.mo8975h(r1)
            r10.putObject(r14, r12, r0)
        L_0x0307:
            r8 = r0
            com.google.android.gms.internal.ads.wz3 r0 = r15.m12953p(r7)
            r1 = r3
            r4 = r2
            r2 = r30
            r11 = r3
            r3 = r4
            r4 = r32
            r20 = r5
            r5 = r8
            r25 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.ads.wv3.m22918e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r3 = r7
            r1 = r11
            r2 = r19
            r5 = r20
        L_0x0329:
            r6 = r25
            r11 = r33
            goto L_0x0019
        L_0x032f:
            r20 = r5
            r25 = r6
            r15 = r2
            r31 = r3
            r18 = r7
            r26 = r10
            r23 = r19
            goto L_0x03b2
        L_0x033e:
            r20 = r5
            r25 = r6
            r5 = r2
            r6 = r3
            r0 = 49
            if (r11 > r0) goto L_0x038d
            long r3 = (long) r4
            r0 = r28
            r1 = r29
            r2 = r30
            r21 = r3
            r3 = r5
            r4 = r32
            r15 = r5
            r5 = r6
            r31 = r6
            r6 = r19
            r18 = r7
            r23 = r19
            r7 = r8
            r8 = r18
            r26 = r10
            r9 = r21
            r14 = r34
            int r0 = r0.m12944U(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x0387
        L_0x036d:
            r15 = r28
            r14 = r29
            r12 = r30
            r1 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r3 = r18
            r5 = r20
            r2 = r23
            r6 = r25
            r10 = r26
            goto L_0x0019
        L_0x0387:
            r8 = r31
            r7 = r33
            r2 = r0
            goto L_0x03b7
        L_0x038d:
            r15 = r5
            r31 = r6
            r18 = r7
            r26 = r10
            r23 = r19
            r0 = 50
            if (r11 != r0) goto L_0x03ba
            r0 = 2
            if (r8 != r0) goto L_0x03b2
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r18
            r6 = r12
            r8 = r34
            int r0 = r0.m12941R(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x0387
            goto L_0x036d
        L_0x03b2:
            r8 = r31
            r7 = r33
            r2 = r15
        L_0x03b7:
            r6 = r25
            goto L_0x03d7
        L_0x03ba:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r9 = r4
            r4 = r32
            r5 = r31
            r6 = r23
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r12
            r12 = r18
            r13 = r34
            int r0 = r0.m12942S(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0387
            goto L_0x036d
        L_0x03d7:
            if (r8 != r7) goto L_0x03e9
            if (r7 == 0) goto L_0x03e9
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r28
            r12 = r29
            r0 = r2
            r1 = r8
            r5 = r20
            r2 = 0
            goto L_0x0455
        L_0x03e9:
            r9 = r28
            boolean r0 = r9.f9604f
            if (r0 == 0) goto L_0x0421
            r10 = r34
            com.google.android.gms.internal.ads.ex3 r0 = r10.f19252d
            com.google.android.gms.internal.ads.ex3 r1 = com.google.android.gms.internal.ads.ex3.m12308a()
            if (r0 == r1) goto L_0x041e
            com.google.android.gms.internal.ads.cz3 r0 = r9.f9603e
            com.google.android.gms.internal.ads.ex3 r1 = r10.f19252d
            r11 = r23
            com.google.android.gms.internal.ads.rx3 r0 = r1.mo10029c(r0, r11)
            if (r0 != 0) goto L_0x0417
            com.google.android.gms.internal.ads.o04 r4 = m12933J(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.wv3.m22922i(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x0436
        L_0x0417:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.ads.qx3 r0 = (com.google.android.gms.internal.ads.qx3) r0
            r2 = 0
            throw r2
        L_0x041e:
            r12 = r29
            goto L_0x0425
        L_0x0421:
            r12 = r29
            r10 = r34
        L_0x0425:
            r11 = r23
            com.google.android.gms.internal.ads.o04 r4 = m12933J(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.ads.wv3.m22922i(r0, r1, r2, r3, r4, r5)
        L_0x0436:
            r13 = r32
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r18
            r5 = r20
            r10 = r26
            r12 = r30
            r11 = r7
            goto L_0x0019
        L_0x0448:
            r20 = r5
            r25 = r6
            r26 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0455:
            if (r6 == r3) goto L_0x045d
            long r3 = (long) r6
            r6 = r26
            r6.putInt(r12, r3, r5)
        L_0x045d:
            int r3 = r9.f9608j
        L_0x045f:
            int r4 = r9.f9609k
            if (r3 >= r4) goto L_0x046f
            int[] r4 = r9.f9607i
            r4 = r4[r3]
            com.google.android.gms.internal.ads.n04 r5 = r9.f9611m
            r9.m12954q(r12, r4, r2, r5)
            int r3 = r3 + 1
            goto L_0x045f
        L_0x046f:
            if (r7 != 0) goto L_0x047b
            r2 = r32
            if (r0 != r2) goto L_0x0476
            goto L_0x0481
        L_0x0476:
            com.google.android.gms.internal.ads.ey3 r0 = com.google.android.gms.internal.ads.ey3.m12343g()
            throw r0
        L_0x047b:
            r2 = r32
            if (r0 > r2) goto L_0x0482
            if (r1 != r7) goto L_0x0482
        L_0x0481:
            return r0
        L_0x0482:
            com.google.android.gms.internal.ads.ey3 r0 = com.google.android.gms.internal.ads.ey3.m12343g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz3.mo10358I(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.vv3):int");
    }

    /* renamed from: a */
    public final Object mo10359a() {
        return ((sx3) this.f9603e).mo8196E(4, (Object) null, (Object) null);
    }

    /* renamed from: b */
    public final int mo10360b(Object obj) {
        return this.f9606h ? m12939P(obj) : m12938O(obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo10361c(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f9599a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m12950m(r1)
            int[] r4 = r8.f9599a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m12949l(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12951n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12940Q(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12951n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12940Q(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12940Q(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12940Q(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m12929E(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11229a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12940Q(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12951n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12940Q(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12951n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12951n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m12937N(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m12928D(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m12936M(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.y04.m23664n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.y04.m23662l(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.y04.m23664n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.y04.m23662l(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.y04.m23662l(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.y04.m23662l(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.y04.m23666p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.y04.m23650H(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11229a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.y04.m23662l(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.y04.m23664n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.y04.m23662l(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.y04.m23664n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.y04.m23664n(r9, r5)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.y04.m23661k(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.y04.m23660j(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.ads.cy3.m11231c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.n04 r0 = r8.f9611m
            java.lang.Object r0 = r0.mo12490d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f9604f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.ads.fx3 r0 = r8.f9612n
            r0.mo10341a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz3.mo10361c(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo10362d(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f9608j) {
            int i6 = this.f9607i[i5];
            int i7 = this.f9599a[i6];
            int m = m12950m(i6);
            int i8 = this.f9599a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f9598r.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & m) != 0 && !m12926B(obj, i6, i2, i, i10)) {
                return false;
            }
            int l = m12949l(m);
            if (l != 9 && l != 17) {
                if (l != 27) {
                    if (l == 60 || l == 68) {
                        if (m12928D(obj2, i7, i6) && !m12927C(obj2, m, m12953p(i6))) {
                            return false;
                        }
                    } else if (l != 49) {
                        if (l == 50 && !((wy3) y04.m23666p(obj2, (long) (m & 1048575))).isEmpty()) {
                            vy3 vy3 = (vy3) m12955r(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) y04.m23666p(obj2, (long) (m & 1048575));
                if (!list.isEmpty()) {
                    wz3 p = m12953p(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!p.mo10362d(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m12926B(obj, i6, i2, i, i10) && !m12927C(obj2, m, m12953p(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f9604f) {
            return true;
        }
        this.f9612n.mo10341a(obj2);
        throw null;
    }

    /* renamed from: e */
    public final void mo10363e(Object obj) {
        int i;
        int i2 = this.f9608j;
        while (true) {
            i = this.f9609k;
            if (i2 >= i) {
                break;
            }
            long m = (long) (m12950m(this.f9607i[i2]) & 1048575);
            Object p = y04.m23666p(obj, m);
            if (p != null) {
                ((wy3) p).mo15004d();
                y04.m23646D(obj, m, p);
            }
            i2++;
        }
        int length = this.f9607i.length;
        while (i < length) {
            this.f9610l.mo12225b(obj, (long) this.f9607i[i]);
            i++;
        }
        this.f9611m.mo12499m(obj);
        if (this.f9604f) {
            this.f9612n.mo10345e(obj);
        }
    }

    /* renamed from: f */
    public final void mo10364f(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.f9599a.length; i += 3) {
            int m = m12950m(i);
            long j = (long) (1048575 & m);
            int i2 = this.f9599a[i];
            switch (m12949l(m)) {
                case 0:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23676z(obj, j, y04.m23660j(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 1:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23643A(obj, j, y04.m23661k(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 2:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23645C(obj, j, y04.m23664n(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 3:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23645C(obj, j, y04.m23664n(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 4:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23644B(obj, j, y04.m23662l(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 5:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23645C(obj, j, y04.m23664n(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 6:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23644B(obj, j, y04.m23662l(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 7:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23674x(obj, j, y04.m23650H(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 8:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23646D(obj, j, y04.m23666p(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 9:
                    m12957t(obj, obj2, i);
                    break;
                case 10:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23646D(obj, j, y04.m23666p(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 11:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23644B(obj, j, y04.m23662l(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 12:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23644B(obj, j, y04.m23662l(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 13:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23644B(obj, j, y04.m23662l(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 14:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23645C(obj, j, y04.m23664n(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 15:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23644B(obj, j, y04.m23662l(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 16:
                    if (!m12925A(obj2, i)) {
                        break;
                    } else {
                        y04.m23645C(obj, j, y04.m23664n(obj2, j));
                        m12960w(obj, i);
                        break;
                    }
                case 17:
                    m12957t(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f9610l.mo12226c(obj, obj2, j);
                    break;
                case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                    yz3.m24294i(this.f9614p, obj, obj2, j);
                    break;
                case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
                case C8710R.styleable.AppCompatTheme_colorError /*56*/:
                case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
                case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                    if (!m12928D(obj2, i2, i)) {
                        break;
                    } else {
                        y04.m23646D(obj, j, y04.m23666p(obj2, j));
                        m12961x(obj, i2, i);
                        break;
                    }
                case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                    m12958u(obj, obj2, i);
                    break;
                case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                    if (!m12928D(obj2, i2, i)) {
                        break;
                    } else {
                        y04.m23646D(obj, j, y04.m23666p(obj2, j));
                        m12961x(obj, i2, i);
                        break;
                    }
                case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                    m12958u(obj, obj2, i);
                    break;
            }
        }
        yz3.m24291f(this.f9611m, obj, obj2);
        if (this.f9604f) {
            yz3.m24290e(this.f9612n, obj, obj2);
        }
    }

    /* renamed from: g */
    public final boolean mo10365g(Object obj, Object obj2) {
        boolean z;
        int length = this.f9599a.length;
        for (int i = 0; i < length; i += 3) {
            int m = m12950m(i);
            long j = (long) (m & 1048575);
            switch (m12949l(m)) {
                case 0:
                    if (m12962y(obj, obj2, i) && Double.doubleToLongBits(y04.m23660j(obj, j)) == Double.doubleToLongBits(y04.m23660j(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (m12962y(obj, obj2, i) && Float.floatToIntBits(y04.m23661k(obj, j)) == Float.floatToIntBits(y04.m23661k(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (m12962y(obj, obj2, i) && y04.m23664n(obj, j) == y04.m23664n(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (m12962y(obj, obj2, i) && y04.m23664n(obj, j) == y04.m23664n(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (m12962y(obj, obj2, i) && y04.m23662l(obj, j) == y04.m23662l(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (m12962y(obj, obj2, i) && y04.m23664n(obj, j) == y04.m23664n(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (m12962y(obj, obj2, i) && y04.m23662l(obj, j) == y04.m23662l(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (m12962y(obj, obj2, i) && y04.m23650H(obj, j) == y04.m23650H(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (m12962y(obj, obj2, i) && yz3.m24293h(y04.m23666p(obj, j), y04.m23666p(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (m12962y(obj, obj2, i) && yz3.m24293h(y04.m23666p(obj, j), y04.m23666p(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (m12962y(obj, obj2, i) && yz3.m24293h(y04.m23666p(obj, j), y04.m23666p(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (m12962y(obj, obj2, i) && y04.m23662l(obj, j) == y04.m23662l(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (m12962y(obj, obj2, i) && y04.m23662l(obj, j) == y04.m23662l(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (m12962y(obj, obj2, i) && y04.m23662l(obj, j) == y04.m23662l(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (m12962y(obj, obj2, i) && y04.m23664n(obj, j) == y04.m23664n(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (m12962y(obj, obj2, i) && y04.m23662l(obj, j) == y04.m23662l(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (m12962y(obj, obj2, i) && y04.m23664n(obj, j) == y04.m23664n(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (m12962y(obj, obj2, i) && yz3.m24293h(y04.m23666p(obj, j), y04.m23666p(obj2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = yz3.m24293h(y04.m23666p(obj, j), y04.m23666p(obj2, j));
                    break;
                case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                    z = yz3.m24293h(y04.m23666p(obj, j), y04.m23666p(obj2, j));
                    break;
                case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
                case C8710R.styleable.AppCompatTheme_colorError /*56*/:
                case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
                case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                    long X = (long) (m12947X(i) & 1048575);
                    if (y04.m23662l(obj, X) == y04.m23662l(obj2, X) && yz3.m24293h(y04.m23666p(obj, j), y04.m23666p(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f9611m.mo12490d(obj).equals(this.f9611m.mo12490d(obj2))) {
            return false;
        }
        if (!this.f9604f) {
            return true;
        }
        this.f9612n.mo10341a(obj);
        this.f9612n.mo10341a(obj2);
        throw null;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: h */
    public final void mo10366h(java.lang.Object r13, com.google.android.gms.internal.ads.nz3 r14, com.google.android.gms.internal.ads.ex3 r15) throws java.io.IOException {
        /*
            r12 = this;
            java.util.Objects.requireNonNull(r15)
            com.google.android.gms.internal.ads.n04 r7 = r12.f9611m
            com.google.android.gms.internal.ads.fx3 r8 = r12.f9612n
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.mo12750e()     // Catch:{ all -> 0x0079 }
            int r2 = r12.m12945V(r1)     // Catch:{ all -> 0x0079 }
            if (r2 >= 0) goto L_0x007c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0030
            int r14 = r12.f9608j
        L_0x001b:
            int r15 = r12.f9609k
            if (r14 >= r15) goto L_0x002a
            int[] r15 = r12.f9607i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m12954q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x002a:
            if (r10 == 0) goto L_0x05c4
            r7.mo12500n(r13, r10)
            return
        L_0x0030:
            boolean r2 = r12.f9604f     // Catch:{ all -> 0x0079 }
            if (r2 != 0) goto L_0x0036
            r2 = r9
            goto L_0x003d
        L_0x0036:
            com.google.android.gms.internal.ads.cz3 r2 = r12.f9603e     // Catch:{ all -> 0x0079 }
            java.lang.Object r1 = r8.mo10343c(r15, r2, r1)     // Catch:{ all -> 0x0079 }
            r2 = r1
        L_0x003d:
            if (r2 == 0) goto L_0x0052
            if (r0 != 0) goto L_0x0045
            com.google.android.gms.internal.ads.jx3 r0 = r8.mo10342b(r13)     // Catch:{ all -> 0x0079 }
        L_0x0045:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.mo10344d(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0079 }
            r0 = r11
            goto L_0x000a
        L_0x0052:
            r7.mo12503q(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r1 = r7.mo12489c(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x005c:
            boolean r1 = r7.mo12502p(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f9608j
        L_0x0064:
            int r15 = r12.f9609k
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.f9607i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m12954q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x05c4
            r7.mo12500n(r13, r10)
            return
        L_0x0079:
            r14 = move-exception
            goto L_0x05c5
        L_0x007c:
            int r3 = r12.m12950m(r2)     // Catch:{ all -> 0x0079 }
            int r4 = m12949l(r3)     // Catch:{ dy3 -> 0x059e }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0571;
                case 1: goto L_0x0562;
                case 2: goto L_0x0553;
                case 3: goto L_0x0544;
                case 4: goto L_0x0535;
                case 5: goto L_0x0526;
                case 6: goto L_0x0517;
                case 7: goto L_0x0508;
                case 8: goto L_0x0500;
                case 9: goto L_0x04cf;
                case 10: goto L_0x04c0;
                case 11: goto L_0x04b1;
                case 12: goto L_0x048f;
                case 13: goto L_0x0480;
                case 14: goto L_0x0471;
                case 15: goto L_0x0462;
                case 16: goto L_0x0453;
                case 17: goto L_0x0422;
                case 18: goto L_0x0414;
                case 19: goto L_0x0406;
                case 20: goto L_0x03f8;
                case 21: goto L_0x03ea;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03ce;
                case 24: goto L_0x03c0;
                case 25: goto L_0x03b2;
                case 26: goto L_0x0388;
                case 27: goto L_0x0376;
                case 28: goto L_0x0368;
                case 29: goto L_0x035a;
                case 30: goto L_0x0345;
                case 31: goto L_0x0337;
                case 32: goto L_0x0329;
                case 33: goto L_0x031b;
                case 34: goto L_0x030d;
                case 35: goto L_0x02ff;
                case 36: goto L_0x02f1;
                case 37: goto L_0x02e3;
                case 38: goto L_0x02d5;
                case 39: goto L_0x02c7;
                case 40: goto L_0x02b9;
                case 41: goto L_0x02ab;
                case 42: goto L_0x029d;
                case 43: goto L_0x028f;
                case 44: goto L_0x027a;
                case 45: goto L_0x026c;
                case 46: goto L_0x025e;
                case 47: goto L_0x0250;
                case 48: goto L_0x0242;
                case 49: goto L_0x0230;
                case 50: goto L_0x01fa;
                case 51: goto L_0x01e8;
                case 52: goto L_0x01d6;
                case 53: goto L_0x01c4;
                case 54: goto L_0x01b2;
                case 55: goto L_0x01a0;
                case 56: goto L_0x018e;
                case 57: goto L_0x017c;
                case 58: goto L_0x016a;
                case 59: goto L_0x0162;
                case 60: goto L_0x0131;
                case 61: goto L_0x0123;
                case 62: goto L_0x0111;
                case 63: goto L_0x00ec;
                case 64: goto L_0x00da;
                case 65: goto L_0x00c8;
                case 66: goto L_0x00b6;
                case 67: goto L_0x00a4;
                case 68: goto L_0x0092;
                default: goto L_0x008a;
            }     // Catch:{ dy3 -> 0x059e }
        L_0x008a:
            if (r10 != 0) goto L_0x0581
            java.lang.Object r1 = r7.mo12492f()     // Catch:{ dy3 -> 0x059e }
            goto L_0x0580
        L_0x0092:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wz3 r5 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r5 = r14.mo12771z(r5, r15)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x00a4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12744a0()     // Catch:{ dy3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x00b6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            int r5 = r14.mo12738V()     // Catch:{ dy3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x00c8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12748c0()     // Catch:{ dy3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x00da:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            int r5 = r14.mo12737U()     // Catch:{ dy3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x00ec:
            int r4 = r14.mo12743a()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wx3 r6 = r12.m12952o(r2)     // Catch:{ dy3 -> 0x059e }
            if (r6 == 0) goto L_0x0103
            boolean r6 = r6.mo8195g(r4)     // Catch:{ dy3 -> 0x059e }
            if (r6 == 0) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            java.lang.Object r10 = com.google.android.gms.internal.ads.yz3.m24289d(r1, r4, r10, r7)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0103:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ dy3 -> 0x059e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r5, r3)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0111:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            int r5 = r14.mo12739W()     // Catch:{ dy3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0123:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.jw3 r5 = r14.mo12746b0()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0131:
            boolean r4 = r12.m12928D(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            if (r4 == 0) goto L_0x014d
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r5 = com.google.android.gms.internal.ads.y04.m23666p(r13, r3)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wz3 r6 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r6 = r14.mo12770y(r6, r15)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r5 = com.google.android.gms.internal.ads.cy3.m11235g(r5, r6)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            goto L_0x015d
        L_0x014d:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wz3 r5 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r5 = r14.mo12770y(r5, r15)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
        L_0x015d:
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0162:
            r12.m12959v(r13, r3, r14)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x016a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            boolean r5 = r14.mo12758m()     // Catch:{ dy3 -> 0x059e }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x017c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            int r5 = r14.mo12736T()     // Catch:{ dy3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x018e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12740X()     // Catch:{ dy3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x01a0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            int r5 = r14.mo12747c()     // Catch:{ dy3 -> 0x059e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x01b2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12741Y()     // Catch:{ dy3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x01c4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12742Z()     // Catch:{ dy3 -> 0x059e }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x01d6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            float r5 = r14.mo12749d()     // Catch:{ dy3 -> 0x059e }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x01e8:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ dy3 -> 0x059e }
            double r5 = r14.zza()     // Catch:{ dy3 -> 0x059e }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12961x(r13, r1, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x01fa:
            java.lang.Object r1 = r12.m12955r(r2)     // Catch:{ dy3 -> 0x059e }
            int r2 = r12.m12950m(r2)     // Catch:{ dy3 -> 0x059e }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r4 = com.google.android.gms.internal.ads.y04.m23666p(r13, r2)     // Catch:{ dy3 -> 0x059e }
            if (r4 == 0) goto L_0x0220
            boolean r5 = com.google.android.gms.internal.ads.xy3.m23617b(r4)     // Catch:{ dy3 -> 0x059e }
            if (r5 == 0) goto L_0x022b
            com.google.android.gms.internal.ads.wy3 r5 = com.google.android.gms.internal.ads.wy3.m22957b()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wy3 r5 = r5.mo15002c()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.xy3.m23618c(r5, r4)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r2, r5)     // Catch:{ dy3 -> 0x059e }
            r4 = r5
            goto L_0x022b
        L_0x0220:
            com.google.android.gms.internal.ads.wy3 r4 = com.google.android.gms.internal.ads.wy3.m22957b()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wy3 r4 = r4.mo15002c()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r2, r4)     // Catch:{ dy3 -> 0x059e }
        L_0x022b:
            com.google.android.gms.internal.ads.wy3 r4 = (com.google.android.gms.internal.ads.wy3) r4     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.vy3 r1 = (com.google.android.gms.internal.ads.vy3) r1     // Catch:{ dy3 -> 0x059e }
            throw r9     // Catch:{ dy3 -> 0x059e }
        L_0x0230:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wz3 r1 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.qy3 r2 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            java.util.List r2 = r2.mo12224a(r13, r3)     // Catch:{ dy3 -> 0x059e }
            r14.mo12734A(r2, r1, r15)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0242:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12764s(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0250:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12766u(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x025e:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12761p(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x026c:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12762q(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x027a:
            com.google.android.gms.internal.ads.qy3 r4 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ dy3 -> 0x059e }
            java.util.List r3 = r4.mo12224a(r13, r5)     // Catch:{ dy3 -> 0x059e }
            r14.mo12751f(r3)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wx3 r2 = r12.m12952o(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r10 = com.google.android.gms.internal.ads.yz3.m24288c(r1, r3, r2, r10, r7)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x028f:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12767v(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x029d:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12768w(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x02ab:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12763r(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x02b9:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12765t(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x02c7:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12760o(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x02d5:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12756k(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x02e3:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12753h(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x02f1:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12769x(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x02ff:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12757l(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x030d:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12764s(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x031b:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12766u(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0329:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12761p(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0337:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12762q(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0345:
            com.google.android.gms.internal.ads.qy3 r4 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ dy3 -> 0x059e }
            java.util.List r3 = r4.mo12224a(r13, r5)     // Catch:{ dy3 -> 0x059e }
            r14.mo12751f(r3)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wx3 r2 = r12.m12952o(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r10 = com.google.android.gms.internal.ads.yz3.m24288c(r1, r3, r2, r10, r7)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x035a:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12767v(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0368:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12759n(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0376:
            com.google.android.gms.internal.ads.wz3 r1 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.qy3 r4 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            java.util.List r2 = r4.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12735B(r2, r1, r15)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0388:
            boolean r1 = m12963z(r3)     // Catch:{ dy3 -> 0x059e }
            if (r1 == 0) goto L_0x03a0
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r2 = r14
            com.google.android.gms.internal.ads.tw3 r2 = (com.google.android.gms.internal.ads.tw3) r2     // Catch:{ dy3 -> 0x059e }
            r3 = 1
            r2.mo14407C(r1, r3)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x03a0:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r2 = r14
            com.google.android.gms.internal.ads.tw3 r2 = (com.google.android.gms.internal.ads.tw3) r2     // Catch:{ dy3 -> 0x059e }
            r3 = 0
            r2.mo14407C(r1, r3)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x03b2:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12768w(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x03c0:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12763r(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x03ce:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12765t(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x03dc:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12760o(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x03ea:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12756k(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x03f8:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12753h(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0406:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12769x(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0414:
            com.google.android.gms.internal.ads.qy3 r1 = r12.f9610l     // Catch:{ dy3 -> 0x059e }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ dy3 -> 0x059e }
            java.util.List r1 = r1.mo12224a(r13, r2)     // Catch:{ dy3 -> 0x059e }
            r14.mo12757l(r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0422:
            boolean r1 = r12.m12925A(r13, r2)     // Catch:{ dy3 -> 0x059e }
            if (r1 == 0) goto L_0x0440
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.y04.m23666p(r13, r3)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wz3 r2 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r2 = r14.mo12771z(r2, r15)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.cy3.m11235g(r1, r2)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0440:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wz3 r1 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r1 = r14.mo12771z(r1, r15)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0453:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12744a0()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23645C(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0462:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            int r1 = r14.mo12738V()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23644B(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0471:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12748c0()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23645C(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0480:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            int r1 = r14.mo12737U()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23644B(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x048f:
            int r4 = r14.mo12743a()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wx3 r6 = r12.m12952o(r2)     // Catch:{ dy3 -> 0x059e }
            if (r6 == 0) goto L_0x04a6
            boolean r6 = r6.mo8195g(r4)     // Catch:{ dy3 -> 0x059e }
            if (r6 == 0) goto L_0x04a0
            goto L_0x04a6
        L_0x04a0:
            java.lang.Object r10 = com.google.android.gms.internal.ads.yz3.m24289d(r1, r4, r10, r7)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x04a6:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23644B(r13, r5, r4)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x04b1:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            int r1 = r14.mo12739W()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23644B(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x04c0:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.jw3 r1 = r14.mo12746b0()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x04cf:
            boolean r1 = r12.m12925A(r13, r2)     // Catch:{ dy3 -> 0x059e }
            if (r1 == 0) goto L_0x04ed
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.y04.m23666p(r13, r3)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wz3 r2 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r2 = r14.mo12770y(r2, r15)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r1 = com.google.android.gms.internal.ads.cy3.m11235g(r1, r2)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x04ed:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.wz3 r1 = r12.m12953p(r2)     // Catch:{ dy3 -> 0x059e }
            java.lang.Object r1 = r14.mo12770y(r1, r15)     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23646D(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0500:
            r12.m12959v(r13, r3, r14)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0508:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            boolean r1 = r14.mo12758m()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23674x(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0517:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            int r1 = r14.mo12736T()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23644B(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0526:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12740X()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23645C(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0535:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            int r1 = r14.mo12747c()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23644B(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0544:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12741Y()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23645C(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0553:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            long r5 = r14.mo12742Z()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23645C(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0562:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            float r1 = r14.mo12749d()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23643A(r13, r3, r1)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0571:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ dy3 -> 0x059e }
            double r5 = r14.zza()     // Catch:{ dy3 -> 0x059e }
            com.google.android.gms.internal.ads.y04.m23676z(r13, r3, r5)     // Catch:{ dy3 -> 0x059e }
            r12.m12960w(r13, r2)     // Catch:{ dy3 -> 0x059e }
            goto L_0x000a
        L_0x0580:
            r10 = r1
        L_0x0581:
            boolean r1 = r7.mo12502p(r10, r14)     // Catch:{ dy3 -> 0x059e }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f9608j
        L_0x0589:
            int r15 = r12.f9609k
            if (r14 >= r15) goto L_0x0598
            int[] r15 = r12.f9607i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m12954q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0589
        L_0x0598:
            if (r10 == 0) goto L_0x05c4
            r7.mo12500n(r13, r10)
            return
        L_0x059e:
            r7.mo12503q(r14)     // Catch:{ all -> 0x0079 }
            if (r10 != 0) goto L_0x05a8
            java.lang.Object r1 = r7.mo12489c(r13)     // Catch:{ all -> 0x0079 }
            r10 = r1
        L_0x05a8:
            boolean r1 = r7.mo12502p(r10, r14)     // Catch:{ all -> 0x0079 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f9608j
        L_0x05b0:
            int r15 = r12.f9609k
            if (r14 >= r15) goto L_0x05bf
            int[] r15 = r12.f9607i
            r15 = r15[r14]
            java.lang.Object r10 = r12.m12954q(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05b0
        L_0x05bf:
            if (r10 == 0) goto L_0x05c4
            r7.mo12500n(r13, r10)
        L_0x05c4:
            return
        L_0x05c5:
            int r15 = r12.f9608j
        L_0x05c7:
            int r0 = r12.f9609k
            if (r15 >= r0) goto L_0x05d6
            int[] r0 = r12.f9607i
            r0 = r0[r15]
            java.lang.Object r10 = r12.m12954q(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05c7
        L_0x05d6:
            if (r10 == 0) goto L_0x05db
            r7.mo12500n(r13, r10)
        L_0x05db:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fz3.mo10366h(java.lang.Object, com.google.android.gms.internal.ads.nz3, com.google.android.gms.internal.ads.ex3):void");
    }

    /* renamed from: i */
    public final void mo10367i(Object obj, ax3 ax3) throws IOException {
        if (!this.f9606h) {
            m12930F(obj, ax3);
        } else if (!this.f9604f) {
            int length = this.f9599a.length;
            for (int i = 0; i < length; i += 3) {
                int m = m12950m(i);
                int i2 = this.f9599a[i];
                switch (m12949l(m)) {
                    case 0:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8612q(i2, y04.m23660j(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8621z(i2, y04.m23661k(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8590E(i2, y04.m23664n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8606j(i2, y04.m23664n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8588C(i2, y04.m23662l(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8619x(i2, y04.m23664n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8617v(i2, y04.m23662l(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8608m(i2, y04.m23650H(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            m12932H(i2, y04.m23666p(obj, (long) (m & 1048575)), ax3);
                            break;
                        }
                    case 9:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8592G(i2, y04.m23666p(obj, (long) (m & 1048575)), m12953p(i));
                            break;
                        }
                    case 10:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8610o(i2, (jw3) y04.m23666p(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8604h(i2, y04.m23662l(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8615t(i2, y04.m23662l(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8593H(i2, y04.m23662l(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8595J(i2, y04.m23664n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8597a(i2, y04.m23662l(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8599c(i2, y04.m23664n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m12925A(obj, i)) {
                            break;
                        } else {
                            ax3.mo8587B(i2, y04.m23666p(obj, (long) (m & 1048575)), m12953p(i));
                            break;
                        }
                    case 18:
                        yz3.m24297l(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 19:
                        yz3.m24301p(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 20:
                        yz3.m24304s(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 21:
                        yz3.m24259B(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 22:
                        yz3.m24303r(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 23:
                        yz3.m24300o(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 24:
                        yz3.m24299n(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 25:
                        yz3.m24295j(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 26:
                        yz3.m24310y(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3);
                        break;
                    case 27:
                        yz3.m24305t(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, m12953p(i));
                        break;
                    case 28:
                        yz3.m24296k(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3);
                        break;
                    case 29:
                        yz3.m24311z(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 30:
                        yz3.m24298m(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 31:
                        yz3.m24306u(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 32:
                        yz3.m24307v(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 33:
                        yz3.m24308w(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 34:
                        yz3.m24309x(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, false);
                        break;
                    case 35:
                        yz3.m24297l(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 36:
                        yz3.m24301p(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 37:
                        yz3.m24304s(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 38:
                        yz3.m24259B(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 39:
                        yz3.m24303r(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 40:
                        yz3.m24300o(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 41:
                        yz3.m24299n(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 42:
                        yz3.m24295j(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case C8710R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /*43*/:
                        yz3.m24311z(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                        yz3.m24298m(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 45:
                        yz3.m24306u(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 46:
                        yz3.m24307v(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 47:
                        yz3.m24308w(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 48:
                        yz3.m24309x(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, true);
                        break;
                    case 49:
                        yz3.m24302q(i2, (List) y04.m23666p(obj, (long) (m & 1048575)), ax3, m12953p(i));
                        break;
                    case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                        m12931G(ax3, i2, y04.m23666p(obj, (long) (m & 1048575)), i);
                        break;
                    case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8612q(i2, m12936M(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8621z(i2, m12937N(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorControlActivated /*53*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8590E(i2, m12951n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorControlHighlight /*54*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8606j(i2, m12951n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorControlNormal /*55*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8588C(i2, m12940Q(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorError /*56*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8619x(i2, m12951n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorPrimary /*57*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8617v(i2, m12940Q(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorPrimaryDark /*58*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8608m(i2, m12929E(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_colorSwitchThumbNormal /*59*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            m12932H(i2, y04.m23666p(obj, (long) (m & 1048575)), ax3);
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8592G(i2, y04.m23666p(obj, (long) (m & 1048575)), m12953p(i));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8610o(i2, (jw3) y04.m23666p(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8604h(i2, m12940Q(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8615t(i2, m12940Q(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8593H(i2, m12940Q(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dividerVertical /*65*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8595J(i2, m12951n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dropDownListViewStyle /*66*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8597a(i2, m12940Q(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*67*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8599c(i2, m12951n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case C8710R.styleable.AppCompatTheme_editTextBackground /*68*/:
                        if (!m12928D(obj, i2, i)) {
                            break;
                        } else {
                            ax3.mo8587B(i2, y04.m23666p(obj, (long) (m & 1048575)), m12953p(i));
                            break;
                        }
                }
            }
            n04 n04 = this.f9611m;
            n04.mo12504r(n04.mo12490d(obj), ax3);
        } else {
            this.f9612n.mo10341a(obj);
            throw null;
        }
    }

    /* renamed from: j */
    public final void mo10368j(Object obj, byte[] bArr, int i, int i2, vv3 vv3) throws IOException {
        if (this.f9606h) {
            m12943T(obj, bArr, i, i2, vv3);
        } else {
            mo10358I(obj, bArr, i, i2, 0, vv3);
        }
    }
}
