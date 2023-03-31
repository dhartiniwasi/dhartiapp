package p331q9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p212d9.C9909a;
import p212d9.C9913e;
import p212d9.C9918j;
import p212d9.C9922n;
import p212d9.C9924p;
import p212d9.C9925q;
import p248h9.C10475a;
import p258i9.C10566a;
import p322p9.C12156k;

/* renamed from: q9.e */
/* compiled from: RSS14Reader */
public final class C12198e extends C12194a {

    /* renamed from: i */
    private static final int[] f45294i = {1, 10, 34, 70, 126};

    /* renamed from: j */
    private static final int[] f45295j = {4, 20, 48, 81};

    /* renamed from: k */
    private static final int[] f45296k = {0, 161, 961, 2015, 2715};

    /* renamed from: l */
    private static final int[] f45297l = {0, 336, 1036, 1516};

    /* renamed from: m */
    private static final int[] f45298m = {8, 6, 4, 3, 1};

    /* renamed from: n */
    private static final int[] f45299n = {2, 4, 6, 8};

    /* renamed from: o */
    private static final int[][] f45300o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g */
    private final List<C12197d> f45301g = new ArrayList();

    /* renamed from: h */
    private final List<C12197d> f45302h = new ArrayList();

    /* renamed from: q */
    private static void m58506q(Collection<C12197d> collection, C12197d dVar) {
        if (dVar != null) {
            boolean z = false;
            Iterator<C12197d> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C12197d next = it.next();
                if (next.mo36714b() == dVar.mo36714b()) {
                    next.mo36725e();
                    z = true;
                    break;
                }
            }
            if (!z) {
                collection.add(dVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        if (r1 < 4) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m58507r(boolean r10, int r11) throws p212d9.C9918j {
        /*
            r9 = this;
            int[] r0 = r9.mo36711l()
            int r0 = p258i9.C10566a.m53113d(r0)
            int[] r1 = r9.mo36709j()
            int r1 = p258i9.C10566a.m53113d(r1)
            r2 = 4
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L_0x0028
            r5 = 12
            if (r0 <= r5) goto L_0x001c
            r6 = 0
            r7 = 1
            goto L_0x0022
        L_0x001c:
            if (r0 >= r2) goto L_0x0020
            r6 = 1
            goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r1 <= r5) goto L_0x0025
            goto L_0x003a
        L_0x0025:
            if (r1 >= r2) goto L_0x0041
            goto L_0x003f
        L_0x0028:
            r5 = 11
            if (r0 <= r5) goto L_0x002f
            r6 = 0
            r7 = 1
            goto L_0x0036
        L_0x002f:
            r5 = 5
            if (r0 >= r5) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0034:
            r6 = 0
        L_0x0035:
            r7 = 0
        L_0x0036:
            r5 = 10
            if (r1 <= r5) goto L_0x003d
        L_0x003a:
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x003d:
            if (r1 >= r2) goto L_0x0041
        L_0x003f:
            r2 = 1
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r8 = r0 + r1
            int r8 = r8 - r11
            r11 = r0 & 1
            if (r11 != r10) goto L_0x004c
            r10 = 1
            goto L_0x004d
        L_0x004c:
            r10 = 0
        L_0x004d:
            r11 = r1 & 1
            if (r11 != r4) goto L_0x0052
            r3 = 1
        L_0x0052:
            if (r8 != r4) goto L_0x006a
            if (r10 == 0) goto L_0x0060
            if (r3 != 0) goto L_0x005b
            r4 = r6
        L_0x0059:
            r7 = 1
            goto L_0x0095
        L_0x005b:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r4 = r6
        L_0x0063:
            r5 = 1
            goto L_0x0095
        L_0x0065:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        L_0x006a:
            r11 = -1
            if (r8 != r11) goto L_0x0081
            if (r10 == 0) goto L_0x0077
            if (r3 != 0) goto L_0x0072
            goto L_0x0095
        L_0x0072:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        L_0x0077:
            if (r3 == 0) goto L_0x007c
            r4 = r6
            r2 = 1
            goto L_0x0095
        L_0x007c:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        L_0x0081:
            if (r8 != 0) goto L_0x00df
            if (r10 == 0) goto L_0x0092
            if (r3 == 0) goto L_0x008d
            if (r0 >= r1) goto L_0x008a
            goto L_0x0063
        L_0x008a:
            r4 = r6
            r2 = 1
            goto L_0x0059
        L_0x008d:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        L_0x0092:
            if (r3 != 0) goto L_0x00da
            r4 = r6
        L_0x0095:
            if (r4 == 0) goto L_0x00aa
            if (r7 != 0) goto L_0x00a5
            int[] r10 = r9.mo36711l()
            float[] r11 = r9.mo36712m()
            p331q9.C12194a.m58489n(r10, r11)
            goto L_0x00aa
        L_0x00a5:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        L_0x00aa:
            if (r7 == 0) goto L_0x00b7
            int[] r10 = r9.mo36711l()
            float[] r11 = r9.mo36712m()
            p331q9.C12194a.m58488g(r10, r11)
        L_0x00b7:
            if (r2 == 0) goto L_0x00cc
            if (r5 != 0) goto L_0x00c7
            int[] r10 = r9.mo36709j()
            float[] r11 = r9.mo36712m()
            p331q9.C12194a.m58489n(r10, r11)
            goto L_0x00cc
        L_0x00c7:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        L_0x00cc:
            if (r5 == 0) goto L_0x00d9
            int[] r10 = r9.mo36709j()
            float[] r11 = r9.mo36710k()
            p331q9.C12194a.m58488g(r10, r11)
        L_0x00d9:
            return
        L_0x00da:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        L_0x00df:
            d9.j r10 = p212d9.C9918j.m50862a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p331q9.C12198e.m58507r(boolean, int):void");
    }

    /* renamed from: s */
    private static boolean m58508s(C12197d dVar, C12197d dVar2) {
        int a = (dVar.mo36713a() + (dVar2.mo36713a() * 16)) % 79;
        int c = (dVar.mo36724d().mo36720c() * 9) + dVar2.mo36724d().mo36720c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return a == c;
    }

    /* renamed from: t */
    private static C9922n m58509t(C12197d dVar, C12197d dVar2) {
        String valueOf = String.valueOf((((long) dVar.mo36714b()) * 4537077) + ((long) dVar2.mo36714b()));
        StringBuilder sb = new StringBuilder(14);
        for (int length = 13 - valueOf.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(valueOf);
        int i = 0;
        for (int i2 = 0; i2 < 13; i2++) {
            int charAt = sb.charAt(i2) - '0';
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            i += charAt;
        }
        int i3 = 10 - (i % 10);
        if (i3 == 10) {
            i3 = 0;
        }
        sb.append(i3);
        C9924p[] a = dVar.mo36724d().mo36718a();
        C9924p[] a2 = dVar2.mo36724d().mo36718a();
        return new C9922n(String.valueOf(sb.toString()), (byte[]) null, new C9924p[]{a[0], a[1], a2[0], a2[1]}, C9909a.RSS_14);
    }

    /* renamed from: u */
    private C12195b m58510u(C10475a aVar, C12196c cVar, boolean z) throws C9918j {
        C10475a aVar2 = aVar;
        boolean z2 = z;
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
            C12156k.m58391e(aVar2, cVar.mo36719b()[1] + 1, h);
            int i = 0;
            for (int length = h.length - 1; i < length; length--) {
                int i2 = h[i];
                h[i] = h[length];
                h[length] = i2;
                i++;
            }
        }
        int i3 = z2 ? 16 : 15;
        float d = ((float) C10566a.m53113d(h)) / ((float) i3);
        int[] l = mo36711l();
        int[] j = mo36709j();
        float[] m = mo36712m();
        float[] k = mo36710k();
        for (int i4 = 0; i4 < h.length; i4++) {
            float f = ((float) h[i4]) / d;
            int i5 = (int) (0.5f + f);
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 > 8) {
                i5 = 8;
            }
            int i6 = i4 / 2;
            if ((i4 & 1) == 0) {
                l[i6] = i5;
                m[i6] = f - ((float) i5);
            } else {
                j[i6] = i5;
                k[i6] = f - ((float) i5);
            }
        }
        m58507r(z2, i3);
        int i7 = 0;
        int i8 = 0;
        for (int length2 = l.length - 1; length2 >= 0; length2--) {
            i7 = (i7 * 9) + l[length2];
            i8 += l[length2];
        }
        int i9 = 0;
        int i10 = 0;
        for (int length3 = j.length - 1; length3 >= 0; length3--) {
            i9 = (i9 * 9) + j[length3];
            i10 += j[length3];
        }
        int i11 = i7 + (i9 * 3);
        if (z2) {
            if ((i8 & 1) != 0 || i8 > 12 || i8 < 4) {
                throw C9918j.m50862a();
            }
            int i12 = (12 - i8) / 2;
            int i13 = f45298m[i12];
            return new C12195b((C12199f.m58516b(l, i13, false) * f45294i[i12]) + C12199f.m58516b(j, 9 - i13, true) + f45296k[i12], i11);
        } else if ((i10 & 1) != 0 || i10 > 10 || i10 < 4) {
            throw C9918j.m50862a();
        } else {
            int i14 = (10 - i10) / 2;
            int i15 = f45299n[i14];
            return new C12195b((C12199f.m58516b(j, 9 - i15, false) * f45295j[i14]) + C12199f.m58516b(l, i15, true) + f45297l[i14], i11);
        }
    }

    /* renamed from: v */
    private C12197d m58511v(C10475a aVar, boolean z, int i, Map<C9913e, ?> map) {
        C9925q qVar;
        try {
            int[] w = m58512w(aVar, 0, z);
            C12196c x = m58513x(aVar, i, z, w);
            if (map == null) {
                qVar = null;
            } else {
                qVar = (C9925q) map.get(C9913e.NEED_RESULT_POINT_CALLBACK);
            }
            if (qVar != null) {
                float f = ((float) (w[0] + w[1])) / 2.0f;
                if (z) {
                    f = ((float) (aVar.mo33560g() - 1)) - f;
                }
                qVar.mo32485a(new C9924p(f, (float) i));
            }
            C12195b u = m58510u(aVar, x, true);
            C12195b u2 = m58510u(aVar, x, false);
            return new C12197d((u.mo36714b() * 1597) + u2.mo36714b(), u.mo36713a() + (u2.mo36713a() * 4), x);
        } catch (C9918j unused) {
            return null;
        }
    }

    /* renamed from: w */
    private int[] m58512w(C10475a aVar, int i, boolean z) throws C9918j {
        int[] i2 = mo36708i();
        i2[0] = 0;
        i2[1] = 0;
        i2[2] = 0;
        i2[3] = 0;
        int g = aVar.mo33560g();
        boolean z2 = false;
        while (i < g) {
            z2 = !aVar.mo33554c(i);
            if (z == z2) {
                break;
            }
            i++;
        }
        int i3 = i;
        int i4 = 0;
        while (i < g) {
            if (aVar.mo33554c(i) ^ z2) {
                i2[i4] = i2[i4] + 1;
            } else {
                if (i4 != 3) {
                    i4++;
                } else if (C12194a.m58490o(i2)) {
                    return new int[]{i3, i};
                } else {
                    i3 += i2[0] + i2[1];
                    i2[0] = i2[2];
                    i2[1] = i2[3];
                    i2[2] = 0;
                    i2[3] = 0;
                    i4--;
                }
                i2[i4] = 1;
                z2 = !z2;
            }
            i++;
        }
        throw C9918j.m50862a();
    }

    /* renamed from: x */
    private C12196c m58513x(C10475a aVar, int i, boolean z, int[] iArr) throws C9918j {
        int i2;
        int i3;
        boolean c = aVar.mo33554c(iArr[0]);
        int i4 = iArr[0] - 1;
        while (i4 >= 0 && (aVar.mo33554c(i4) ^ c)) {
            i4--;
        }
        int i5 = i4 + 1;
        int[] i6 = mo36708i();
        System.arraycopy(i6, 0, i6, 1, i6.length - 1);
        i6[0] = iArr[0] - i5;
        int p = C12194a.m58491p(i6, f45300o);
        int i7 = iArr[1];
        if (z) {
            i2 = (aVar.mo33560g() - 1) - i7;
            i3 = (aVar.mo33560g() - 1) - i5;
        } else {
            i2 = i7;
            i3 = i5;
        }
        return new C12196c(p, new int[]{i5, iArr[1]}, i3, i2, i);
    }

    /* renamed from: b */
    public C9922n mo36672b(int i, C10475a aVar, Map<C9913e, ?> map) throws C9918j {
        m58506q(this.f45301g, m58511v(aVar, false, i, map));
        aVar.mo33563j();
        m58506q(this.f45302h, m58511v(aVar, true, i, map));
        aVar.mo33563j();
        for (C12197d next : this.f45301g) {
            if (next.mo36723c() > 1) {
                for (C12197d next2 : this.f45302h) {
                    if (next2.mo36723c() > 1 && m58508s(next, next2)) {
                        return m58509t(next, next2);
                    }
                }
                continue;
            }
        }
        throw C9918j.m50862a();
    }

    public void reset() {
        this.f45301g.clear();
        this.f45302h.clear();
    }
}
