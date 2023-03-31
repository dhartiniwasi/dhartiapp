package p340r9;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9913e;
import p212d9.C9914f;
import p212d9.C9918j;
import p212d9.C9922n;
import p212d9.C9924p;
import p248h9.C10475a;
import p258i9.C10566a;
import p322p9.C12156k;
import p331q9.C12194a;
import p331q9.C12195b;
import p331q9.C12196c;
import p331q9.C12199f;
import p349s9.C12479j;

/* renamed from: r9.d */
/* compiled from: RSSExpandedReader */
public final class C12262d extends C12194a {

    /* renamed from: k */
    private static final int[] f45438k = {7, 5, 4, 3, 1};

    /* renamed from: l */
    private static final int[] f45439l = {4, 20, 52, C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 204};

    /* renamed from: m */
    private static final int[] f45440m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n */
    private static final int[][] f45441n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o */
    private static final int[][] f45442o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, new int[]{C8710R.styleable.AppCompatTheme_toolbarStyle, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, C8710R.styleable.AppCompatTheme_textColorSearchUrl, 122, 155}, new int[]{43, 129, 176, C8710R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, C8710R.styleable.AppCompatTheme_textColorAlertDialogListItem, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{C8710R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 116, 137, 200, 178, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, C8710R.styleable.AppCompatTheme_tooltipFrameBackground}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{C8710R.styleable.AppCompatTheme_textAppearanceListItem, 98, 83, 38, C8710R.styleable.AppCompatTheme_tooltipForegroundColor, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p */
    private static final int[][] f45443p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g */
    private final List<C12260b> f45444g = new ArrayList(11);

    /* renamed from: h */
    private final List<C12261c> f45445h = new ArrayList();

    /* renamed from: i */
    private final int[] f45446i = new int[2];

    /* renamed from: j */
    private boolean f45447j;

    /* renamed from: A */
    private static boolean m58907A(Iterable<C12260b> iterable, Iterable<C12261c> iterable2) {
        boolean z;
        boolean z2;
        Iterator<C12261c> it = iterable2.iterator();
        do {
            z = false;
            if (it.hasNext()) {
                C12261c next = it.next();
                Iterator<C12260b> it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = true;
                        continue;
                        break;
                    }
                    C12260b next2 = it2.next();
                    Iterator<C12260b> it3 = next.mo36892a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                z2 = true;
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        return true;
    }

    /* renamed from: B */
    private static boolean m58908B(List<C12260b> list) {
        boolean z;
        for (int[] iArr : f45443p) {
            if (list.size() <= iArr.length) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        z = true;
                        break;
                    } else if (list.get(i).mo36885b().mo36720c() != iArr[i]) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: C */
    private C12196c m58909C(C10475a aVar, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.f45446i[0] - 1;
            while (i5 >= 0 && !aVar.mo33554c(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.f45446i;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.f45446i;
            int i7 = iArr2[0];
            int f = aVar.mo33559f(iArr2[1] + 1);
            i2 = f;
            i3 = i7;
            i4 = f - this.f45446i[1];
        }
        int[] i8 = mo36708i();
        System.arraycopy(i8, 0, i8, 1, i8.length - 1);
        i8[0] = i4;
        try {
            return new C12196c(C12194a.m58491p(i8, f45441n), new int[]{i3, i2}, i3, i2, i);
        } catch (C9918j unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static void m58910D(List<C12260b> list, List<C12261c> list2) {
        boolean z;
        Iterator<C12261c> it = list2.iterator();
        while (it.hasNext()) {
            C12261c next = it.next();
            if (next.mo36892a().size() != list.size()) {
                Iterator<C12260b> it2 = next.mo36892a().iterator();
                while (true) {
                    z = false;
                    boolean z2 = true;
                    if (!it2.hasNext()) {
                        z = true;
                        break;
                    }
                    C12260b next2 = it2.next();
                    Iterator<C12260b> it3 = list.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (next2.equals(it3.next())) {
                                continue;
                                break;
                            }
                        } else {
                            z2 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z2) {
                        break;
                    }
                }
                if (z) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: F */
    private static void m58911F(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    /* renamed from: G */
    private void m58912G(int i, boolean z) {
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= this.f45445h.size()) {
                break;
            }
            C12261c cVar = this.f45445h.get(i2);
            if (cVar.mo36893b() > i) {
                z2 = cVar.mo36894c(this.f45444g);
                break;
            } else {
                z3 = cVar.mo36894c(this.f45444g);
                i2++;
            }
        }
        if (!z2 && !z3 && !m58907A(this.f45444g, this.f45445h)) {
            this.f45445h.add(i2, new C12261c(this.f45444g, i, z));
            m58910D(this.f45444g, this.f45445h);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m58913q(int r11) throws p212d9.C9918j {
        /*
            r10 = this;
            int[] r0 = r10.mo36711l()
            int r0 = p258i9.C10566a.m53113d(r0)
            int[] r1 = r10.mo36709j()
            int r1 = p258i9.C10566a.m53113d(r1)
            r2 = 4
            r3 = 13
            r4 = 0
            r5 = 1
            if (r0 <= r3) goto L_0x001a
            r6 = 0
            r7 = 1
            goto L_0x0020
        L_0x001a:
            if (r0 >= r2) goto L_0x001e
            r6 = 1
            goto L_0x001f
        L_0x001e:
            r6 = 0
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r1 <= r3) goto L_0x0025
            r2 = 0
            r3 = 1
            goto L_0x002b
        L_0x0025:
            if (r1 >= r2) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            r3 = 0
        L_0x002b:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r5) goto L_0x0034
            r11 = 1
            goto L_0x0035
        L_0x0034:
            r11 = 0
        L_0x0035:
            r9 = r1 & 1
            if (r9 != 0) goto L_0x003a
            r4 = 1
        L_0x003a:
            if (r8 != r5) goto L_0x0052
            if (r11 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0043
            r5 = r6
        L_0x0041:
            r7 = 1
            goto L_0x007d
        L_0x0043:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r5 = r6
        L_0x004b:
            r3 = 1
            goto L_0x007d
        L_0x004d:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        L_0x0052:
            r9 = -1
            if (r8 != r9) goto L_0x0069
            if (r11 == 0) goto L_0x005f
            if (r4 != 0) goto L_0x005a
            goto L_0x007d
        L_0x005a:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        L_0x005f:
            if (r4 == 0) goto L_0x0064
            r5 = r6
            r2 = 1
            goto L_0x007d
        L_0x0064:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        L_0x0069:
            if (r8 != 0) goto L_0x00c7
            if (r11 == 0) goto L_0x007a
            if (r4 == 0) goto L_0x0075
            if (r0 >= r1) goto L_0x0072
            goto L_0x004b
        L_0x0072:
            r5 = r6
            r2 = 1
            goto L_0x0041
        L_0x0075:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        L_0x007a:
            if (r4 != 0) goto L_0x00c2
            r5 = r6
        L_0x007d:
            if (r5 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x008d
            int[] r11 = r10.mo36711l()
            float[] r0 = r10.mo36712m()
            p331q9.C12194a.m58489n(r11, r0)
            goto L_0x0092
        L_0x008d:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        L_0x0092:
            if (r7 == 0) goto L_0x009f
            int[] r11 = r10.mo36711l()
            float[] r0 = r10.mo36712m()
            p331q9.C12194a.m58488g(r11, r0)
        L_0x009f:
            if (r2 == 0) goto L_0x00b4
            if (r3 != 0) goto L_0x00af
            int[] r11 = r10.mo36709j()
            float[] r0 = r10.mo36712m()
            p331q9.C12194a.m58489n(r11, r0)
            goto L_0x00b4
        L_0x00af:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        L_0x00b4:
            if (r3 == 0) goto L_0x00c1
            int[] r11 = r10.mo36709j()
            float[] r0 = r10.mo36710k()
            p331q9.C12194a.m58488g(r11, r0)
        L_0x00c1:
            return
        L_0x00c2:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        L_0x00c7:
            d9.j r11 = p212d9.C9918j.m50862a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p340r9.C12262d.m58913q(int):void");
    }

    /* renamed from: r */
    private boolean m58914r() {
        C12260b bVar = this.f45444g.get(0);
        C12195b c = bVar.mo36886c();
        C12195b d = bVar.mo36887d();
        if (d == null) {
            return false;
        }
        int a = d.mo36713a();
        int i = 2;
        for (int i2 = 1; i2 < this.f45444g.size(); i2++) {
            C12260b bVar2 = this.f45444g.get(i2);
            a += bVar2.mo36886c().mo36713a();
            i++;
            C12195b d2 = bVar2.mo36887d();
            if (d2 != null) {
                a += d2.mo36713a();
                i++;
            }
        }
        if (((i - 4) * 211) + (a % 211) == c.mo36714b()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private List<C12260b> m58915s(List<C12261c> list, int i) throws C9918j {
        while (i < this.f45445h.size()) {
            C12261c cVar = this.f45445h.get(i);
            this.f45444g.clear();
            for (C12261c a : list) {
                this.f45444g.addAll(a.mo36892a());
            }
            this.f45444g.addAll(cVar.mo36892a());
            if (!m58908B(this.f45444g)) {
                i++;
            } else if (m58914r()) {
                return this.f45444g;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(cVar);
                try {
                    return m58915s(arrayList, i + 1);
                } catch (C9918j unused) {
                }
            }
        }
        throw C9918j.m50862a();
    }

    /* renamed from: t */
    private List<C12260b> m58916t(boolean z) {
        List<C12260b> list = null;
        if (this.f45445h.size() > 25) {
            this.f45445h.clear();
            return null;
        }
        this.f45444g.clear();
        if (z) {
            Collections.reverse(this.f45445h);
        }
        try {
            list = m58915s(new ArrayList(), 0);
        } catch (C9918j unused) {
        }
        if (z) {
            Collections.reverse(this.f45445h);
        }
        return list;
    }

    /* renamed from: u */
    static C9922n m58917u(List<C12260b> list) throws C9918j, C9914f {
        String d = C12479j.m59499a(C12259a.m58897a(list)).mo37248d();
        C9924p[] a = list.get(0).mo36885b().mo36718a();
        C9924p[] a2 = list.get(list.size() - 1).mo36885b().mo36718a();
        return new C9922n(d, (byte[]) null, new C9924p[]{a[0], a[1], a2[0], a2[1]}, C9909a.RSS_EXPANDED);
    }

    /* renamed from: x */
    private void m58918x(C10475a aVar, List<C12260b> list, int i) throws C9918j {
        int[] i2 = mo36708i();
        i2[0] = 0;
        i2[1] = 0;
        i2[2] = 0;
        i2[3] = 0;
        int g = aVar.mo33560g();
        if (i < 0) {
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = list.get(list.size() - 1).mo36885b().mo36719b()[1];
            }
        }
        boolean z = list.size() % 2 != 0;
        if (this.f45447j) {
            z = !z;
        }
        boolean z2 = false;
        while (i < g) {
            z2 = !aVar.mo33554c(i);
            if (!z2) {
                break;
            }
            i++;
        }
        boolean z3 = z2;
        int i3 = 0;
        int i4 = i;
        while (i < g) {
            if (aVar.mo33554c(i) ^ z3) {
                i2[i3] = i2[i3] + 1;
            } else {
                if (i3 == 3) {
                    if (z) {
                        m58911F(i2);
                    }
                    if (C12194a.m58490o(i2)) {
                        int[] iArr = this.f45446i;
                        iArr[0] = i4;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        m58911F(i2);
                    }
                    i4 += i2[0] + i2[1];
                    i2[0] = i2[2];
                    i2[1] = i2[3];
                    i2[2] = 0;
                    i2[3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                i2[i3] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: y */
    private static int m58919y(C10475a aVar, int i) {
        if (aVar.mo33554c(i)) {
            return aVar.mo33557e(aVar.mo33559f(i));
        }
        return aVar.mo33559f(aVar.mo33557e(i));
    }

    /* renamed from: z */
    private static boolean m58920z(C12196c cVar, boolean z, boolean z2) {
        return cVar.mo36720c() != 0 || !z || !z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C12260b mo36898E(C10475a aVar, List<C12260b> list, int i) throws C9918j {
        C12196c C;
        C12195b bVar;
        boolean z = list.size() % 2 == 0;
        if (this.f45447j) {
            z = !z;
        }
        int i2 = -1;
        boolean z2 = true;
        do {
            m58918x(aVar, list, i2);
            C = m58909C(aVar, i, z);
            if (C == null) {
                i2 = m58919y(aVar, this.f45446i[0]);
                continue;
            } else {
                z2 = false;
                continue;
            }
        } while (z2);
        C12195b v = mo36899v(aVar, C, z, true);
        if (list.isEmpty() || !list.get(list.size() - 1).mo36889f()) {
            try {
                bVar = mo36899v(aVar, C, z, false);
            } catch (C9918j unused) {
                bVar = null;
            }
            return new C12260b(v, bVar, C, true);
        }
        throw C9918j.m50862a();
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j, C9914f {
        this.f45444g.clear();
        this.f45447j = false;
        try {
            return m58917u(mo36900w(i, aVar));
        } catch (C9918j unused) {
            this.f45444g.clear();
            this.f45447j = true;
            return m58917u(mo36900w(i, aVar));
        }
    }

    public void reset() {
        this.f45444g.clear();
        this.f45445h.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C12195b mo36899v(C10475a aVar, C12196c cVar, boolean z, boolean z2) throws C9918j {
        C10475a aVar2 = aVar;
        int[] h = mo36707h();
        h[0] = 0;
        h[1] = 0;
        h[2] = 0;
        h[3] = 0;
        h[4] = 0;
        h[5] = 0;
        h[6] = 0;
        h[7] = 0;
        if (z2) {
            C12156k.m58392f(aVar2, cVar.mo36719b()[0], h);
        } else {
            C12156k.m58391e(aVar2, cVar.mo36719b()[1], h);
            int i = 0;
            for (int length = h.length - 1; i < length; length--) {
                int i2 = h[i];
                h[i] = h[length];
                h[length] = i2;
                i++;
            }
        }
        float d = ((float) C10566a.m53113d(h)) / 17.0f;
        float f = ((float) (cVar.mo36719b()[1] - cVar.mo36719b()[0])) / 15.0f;
        if (Math.abs(d - f) / f <= 0.3f) {
            int[] l = mo36711l();
            int[] j = mo36709j();
            float[] m = mo36712m();
            float[] k = mo36710k();
            for (int i3 = 0; i3 < h.length; i3++) {
                float f2 = (((float) h[i3]) * 1.0f) / d;
                int i4 = (int) (0.5f + f2);
                if (i4 <= 0) {
                    if (f2 >= 0.3f) {
                        i4 = 1;
                    } else {
                        throw C9918j.m50862a();
                    }
                } else if (i4 > 8) {
                    if (f2 <= 8.7f) {
                        i4 = 8;
                    } else {
                        throw C9918j.m50862a();
                    }
                }
                int i5 = i3 / 2;
                if ((i3 & 1) == 0) {
                    l[i5] = i4;
                    m[i5] = f2 - ((float) i4);
                } else {
                    j[i5] = i4;
                    k[i5] = f2 - ((float) i4);
                }
            }
            m58913q(17);
            int c = (((cVar.mo36720c() * 4) + (z ? 0 : 2)) + (z2 ^ true ? 1 : 0)) - 1;
            int i6 = 0;
            int i7 = 0;
            for (int length2 = l.length - 1; length2 >= 0; length2--) {
                if (m58920z(cVar, z, z2)) {
                    i6 += l[length2] * f45442o[c][length2 * 2];
                }
                i7 += l[length2];
            }
            int i8 = 0;
            for (int length3 = j.length - 1; length3 >= 0; length3--) {
                if (m58920z(cVar, z, z2)) {
                    i8 += j[length3] * f45442o[c][(length3 * 2) + 1];
                }
            }
            int i9 = i6 + i8;
            if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
                throw C9918j.m50862a();
            }
            int i10 = (13 - i7) / 2;
            int i11 = f45438k[i10];
            return new C12195b((C12199f.m58516b(l, i11, true) * f45439l[i10]) + C12199f.m58516b(j, 9 - i11, false) + f45440m[i10], i9);
        }
        throw C9918j.m50862a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public List<C12260b> mo36900w(int i, C10475a aVar) throws C9918j {
        while (true) {
            try {
                this.f45444g.add(mo36898E(aVar, this.f45444g, i));
            } catch (C9918j e) {
                if (this.f45444g.isEmpty()) {
                    throw e;
                } else if (m58914r()) {
                    return this.f45444g;
                } else {
                    boolean z = !this.f45445h.isEmpty();
                    m58912G(i, false);
                    if (z) {
                        List<C12260b> t = m58916t(false);
                        if (t != null) {
                            return t;
                        }
                        List<C12260b> t2 = m58916t(true);
                        if (t2 != null) {
                            return t2;
                        }
                    }
                    throw C9918j.m50862a();
                }
            }
        }
    }
}
