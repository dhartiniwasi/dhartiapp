package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vj4 extends ak4 {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final cc3 f19123k = cc3.m10844b(aj4.f6599a);
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final cc3 f19124l = cc3.m10844b(bj4.f7321a);

    /* renamed from: m */
    public static final /* synthetic */ int f19125m = 0;

    /* renamed from: d */
    private final Object f19126d = new Object();

    /* renamed from: e */
    public final Context f19127e;

    /* renamed from: f */
    private final boolean f19128f;

    /* renamed from: g */
    private jj4 f19129g;

    /* renamed from: h */
    private oj4 f19130h;

    /* renamed from: i */
    private w74 f19131i;

    /* renamed from: j */
    private final pi4 f19132j;

    public vj4(Context context) {
        pi4 pi4 = new pi4();
        jj4 d = jj4.m14919d(context);
        this.f19127e = context != null ? context.getApplicationContext() : null;
        this.f19132j = pi4;
        this.f19129g = d;
        this.f19131i = w74.f19518c;
        boolean z = false;
        if (context != null && gb2.m13190x(context)) {
            z = true;
        }
        this.f19128f = z;
        if (!z && context != null && gb2.f9812a >= 32) {
            this.f19130h = oj4.m17900a(context);
        }
        if (this.f19129g.f11671M && context == null) {
            ot1.m18060e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* renamed from: j */
    protected static int m22274j(C2388g4 g4Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(g4Var.f9664c)) {
            return 4;
        }
        String n = m22277n(str);
        String n2 = m22277n(g4Var.f9664c);
        if (n2 == null || n == null) {
            if (!z || n2 != null) {
                return 0;
            }
            return 1;
        } else if (n2.startsWith(n) || n.startsWith(n2)) {
            return 3;
        } else {
            if (gb2.m13139I(n2, "-")[0].equals(gb2.m13139I(n, "-")[0])) {
                return 2;
            }
            return 0;
        }
    }

    /* renamed from: n */
    protected static String m22277n(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0089, code lost:
        if (r8.f19130h.mo12959d(r8.f19131i, r9) != false) goto L_0x008b;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ boolean m22279q(com.google.android.gms.internal.ads.vj4 r8, com.google.android.gms.internal.ads.C2388g4 r9) {
        /*
            java.lang.Object r0 = r8.f19126d
            monitor-enter(r0)
            com.google.android.gms.internal.ads.jj4 r1 = r8.f19129g     // Catch:{ all -> 0x008e }
            boolean r1 = r1.f11671M     // Catch:{ all -> 0x008e }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x008b
            boolean r1 = r8.f19128f     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x008b
            int r1 = r9.f9686y     // Catch:{ all -> 0x008e }
            r4 = 2
            if (r1 <= r4) goto L_0x008b
            java.lang.String r1 = r9.f9673l     // Catch:{ all -> 0x008e }
            r5 = 32
            if (r1 != 0) goto L_0x001b
            goto L_0x0065
        L_0x001b:
            int r6 = r1.hashCode()     // Catch:{ all -> 0x008e }
            r7 = 3
            switch(r6) {
                case -2123537834: goto L_0x0042;
                case 187078296: goto L_0x0038;
                case 187078297: goto L_0x002e;
                case 1504578661: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x004c
        L_0x0024:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x002e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 3
            goto L_0x004d
        L_0x0038:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 0
            goto L_0x004d
        L_0x0042:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x004c
            r1 = 2
            goto L_0x004d
        L_0x004c:
            r1 = -1
        L_0x004d:
            if (r1 == 0) goto L_0x0056
            if (r1 == r3) goto L_0x0056
            if (r1 == r4) goto L_0x0056
            if (r1 == r7) goto L_0x0056
            goto L_0x0065
        L_0x0056:
            int r1 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ all -> 0x008e }
            if (r1 < r5) goto L_0x008b
            com.google.android.gms.internal.ads.oj4 r1 = r8.f19130h     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008b
            boolean r1 = r1.mo12962g()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0065
            goto L_0x008b
        L_0x0065:
            int r1 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ all -> 0x008e }
            if (r1 < r5) goto L_0x008c
            com.google.android.gms.internal.ads.oj4 r1 = r8.f19130h     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            boolean r4 = r1.mo12962g()     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x008c
            boolean r1 = r1.mo12960e()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.oj4 r1 = r8.f19130h     // Catch:{ all -> 0x008e }
            boolean r1 = r1.mo12961f()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            com.google.android.gms.internal.ads.oj4 r1 = r8.f19130h     // Catch:{ all -> 0x008e }
            com.google.android.gms.internal.ads.w74 r8 = r8.f19131i     // Catch:{ all -> 0x008e }
            boolean r8 = r1.mo12959d(r8, r9)     // Catch:{ all -> 0x008e }
            if (r8 == 0) goto L_0x008c
        L_0x008b:
            r2 = 1
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return r2
        L_0x008e:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vj4.m22279q(com.google.android.gms.internal.ads.vj4, com.google.android.gms.internal.ads.g4):boolean");
    }

    /* renamed from: r */
    protected static boolean m22280r(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: s */
    private static void m22281s(ki4 ki4, l01 l01, Map map) {
        int i = 0;
        while (i < ki4.f12116a) {
            if (((ix0) l01.f12585y.get(ki4.mo11711b(i))) == null) {
                i++;
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public final void m22282t() {
        boolean z;
        oj4 oj4;
        synchronized (this.f19126d) {
            z = false;
            if (this.f19129g.f11671M && !this.f19128f && gb2.f9812a >= 32 && (oj4 = this.f19130h) != null && oj4.mo12962g()) {
                z = true;
            }
        }
        if (z) {
            mo9623h();
        }
    }

    /* renamed from: u */
    private static final Pair m22283u(int i, zj4 zj4, int[][][] iArr, qj4 qj4, Comparator comparator) {
        Object obj;
        zj4 zj42 = zj4;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zj42.mo15604c(i2)) {
                ki4 d = zj42.mo15605d(i2);
                for (int i3 = 0; i3 < d.f12116a; i3++) {
                    gv0 b = d.mo11711b(i3);
                    List a = qj4.mo13551a(i2, b, iArr[i2][i3]);
                    int i4 = b.f10063a;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (i6 <= 0) {
                        rj4 rj4 = (rj4) a.get(i6);
                        int a2 = rj4.mo9198a();
                        if (!zArr[i6] && a2 != 0) {
                            if (a2 == i5) {
                                obj = ua3.m21509x(rj4);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(rj4);
                                for (int i7 = i6 + 1; i7 <= 0; i7++) {
                                    rj4 rj42 = (rj4) a.get(i7);
                                    if (rj42.mo9198a() == 2 && rj4.mo9199b(rj42)) {
                                        arrayList2.add(rj42);
                                        zArr[i7] = true;
                                    }
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        i6++;
                        i5 = 1;
                    }
                }
            }
            qj4 qj42 = qj4;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((rj4) list.get(i8)).f16987c;
        }
        rj4 rj43 = (rj4) list.get(0);
        return Pair.create(new wj4(rj43.f16986b, iArr2, 0), Integer.valueOf(rj43.f16985a));
    }

    /* renamed from: a */
    public final void mo9618a() {
        oj4 oj4;
        synchronized (this.f19126d) {
            if (gb2.f9812a >= 32 && (oj4 = this.f19130h) != null) {
                oj4.mo12958c();
            }
        }
        super.mo9618a();
    }

    /* renamed from: b */
    public final void mo9619b(w74 w74) {
        boolean z;
        synchronized (this.f19126d) {
            z = !this.f19131i.equals(w74);
            this.f19131i = w74;
        }
        if (z) {
            m22282t();
        }
    }

    /* renamed from: c */
    public final boolean mo9620c() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: com.google.android.gms.internal.ads.xj4[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: com.google.android.gms.internal.ads.qi4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: com.google.android.gms.internal.ads.yj4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: com.google.android.gms.internal.ads.yj4} */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair mo8425i(com.google.android.gms.internal.ads.zj4 r24, int[][][] r25, int[] r26, com.google.android.gms.internal.ads.mg4 r27, com.google.android.gms.internal.ads.gt0 r28) throws com.google.android.gms.internal.ads.u44 {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            java.lang.Object r3 = r1.f19126d
            monitor-enter(r3)
            com.google.android.gms.internal.ads.jj4 r4 = r1.f19129g     // Catch:{ all -> 0x021f }
            boolean r5 = r4.f11671M     // Catch:{ all -> 0x021f }
            if (r5 == 0) goto L_0x0023
            int r5 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ all -> 0x021f }
            r6 = 32
            if (r5 < r6) goto L_0x0023
            com.google.android.gms.internal.ads.oj4 r5 = r1.f19130h     // Catch:{ all -> 0x021f }
            if (r5 == 0) goto L_0x0023
            android.os.Looper r6 = android.os.Looper.myLooper()     // Catch:{ all -> 0x021f }
            com.google.android.gms.internal.ads.v91.m22048b(r6)     // Catch:{ all -> 0x021f }
            r5.mo12957b(r1, r6)     // Catch:{ all -> 0x021f }
        L_0x0023:
            monitor-exit(r3)     // Catch:{ all -> 0x021f }
            r3 = 2
            com.google.android.gms.internal.ads.wj4[] r5 = new com.google.android.gms.internal.ads.wj4[r3]
            com.google.android.gms.internal.ads.wi4 r6 = new com.google.android.gms.internal.ads.wi4
            r7 = r26
            r6.<init>(r4, r7)
            com.google.android.gms.internal.ads.xi4 r7 = com.google.android.gms.internal.ads.xi4.f20114a
            android.util.Pair r6 = m22283u(r3, r0, r2, r6, r7)
            if (r6 == 0) goto L_0x0044
            java.lang.Object r7 = r6.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.first
            com.google.android.gms.internal.ads.wj4 r6 = (com.google.android.gms.internal.ads.wj4) r6
            r5[r7] = r6
        L_0x0044:
            r6 = 0
            r7 = 0
        L_0x0046:
            r8 = 1
            if (r7 >= r3) goto L_0x005c
            int r9 = r0.mo15604c(r7)
            if (r9 != r3) goto L_0x0059
            com.google.android.gms.internal.ads.ki4 r9 = r0.mo15605d(r7)
            int r9 = r9.f12116a
            if (r9 <= 0) goto L_0x0059
            r7 = 1
            goto L_0x005d
        L_0x0059:
            int r7 = r7 + 1
            goto L_0x0046
        L_0x005c:
            r7 = 0
        L_0x005d:
            com.google.android.gms.internal.ads.ui4 r9 = new com.google.android.gms.internal.ads.ui4
            r9.<init>(r1, r4, r7)
            com.google.android.gms.internal.ads.vi4 r7 = com.google.android.gms.internal.ads.vi4.f19114a
            android.util.Pair r7 = m22283u(r8, r0, r2, r9, r7)
            if (r7 == 0) goto L_0x0078
            java.lang.Object r9 = r7.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r7.first
            com.google.android.gms.internal.ads.wj4 r10 = (com.google.android.gms.internal.ads.wj4) r10
            r5[r9] = r10
        L_0x0078:
            if (r7 != 0) goto L_0x007c
            r7 = 0
            goto L_0x008f
        L_0x007c:
            java.lang.Object r7 = r7.first
            r10 = r7
            com.google.android.gms.internal.ads.wj4 r10 = (com.google.android.gms.internal.ads.wj4) r10
            com.google.android.gms.internal.ads.gv0 r10 = r10.f19659a
            com.google.android.gms.internal.ads.wj4 r7 = (com.google.android.gms.internal.ads.wj4) r7
            int[] r7 = r7.f19660b
            r7 = r7[r6]
            com.google.android.gms.internal.ads.g4 r7 = r10.mo10649b(r7)
            java.lang.String r7 = r7.f9664c
        L_0x008f:
            com.google.android.gms.internal.ads.yi4 r10 = new com.google.android.gms.internal.ads.yi4
            r10.<init>(r4, r7)
            com.google.android.gms.internal.ads.zi4 r7 = com.google.android.gms.internal.ads.zi4.f21102a
            r11 = 3
            android.util.Pair r7 = m22283u(r11, r0, r2, r10, r7)
            if (r7 == 0) goto L_0x00ab
            java.lang.Object r10 = r7.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r7 = r7.first
            com.google.android.gms.internal.ads.wj4 r7 = (com.google.android.gms.internal.ads.wj4) r7
            r5[r10] = r7
        L_0x00ab:
            r7 = 0
        L_0x00ac:
            if (r7 >= r3) goto L_0x011e
            int r10 = r0.mo15604c(r7)
            if (r10 == r3) goto L_0x0115
            if (r10 == r8) goto L_0x0115
            if (r10 == r11) goto L_0x0115
            com.google.android.gms.internal.ads.ki4 r10 = r0.mo15605d(r7)
            r12 = r2[r7]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x00c3:
            int r11 = r10.f12116a
            if (r13 >= r11) goto L_0x0104
            com.google.android.gms.internal.ads.gv0 r11 = r10.mo11711b(r13)
            r17 = r12[r13]
            r9 = r16
            r3 = 0
        L_0x00d0:
            int r6 = r11.f10063a
            if (r3 > 0) goto L_0x00fa
            r6 = r17[r3]
            boolean r8 = r4.f11672N
            boolean r6 = m22280r(r6, r8)
            if (r6 == 0) goto L_0x00f4
            com.google.android.gms.internal.ads.g4 r6 = r11.mo10649b(r3)
            com.google.android.gms.internal.ads.ej4 r8 = new com.google.android.gms.internal.ads.ej4
            r2 = r17[r3]
            r8.<init>(r6, r2)
            if (r9 == 0) goto L_0x00f1
            int r2 = r8.compareTo(r9)
            if (r2 <= 0) goto L_0x00f4
        L_0x00f1:
            r15 = r3
            r9 = r8
            r14 = r11
        L_0x00f4:
            int r3 = r3 + 1
            r2 = r25
            r8 = 1
            goto L_0x00d0
        L_0x00fa:
            int r13 = r13 + 1
            r2 = r25
            r16 = r9
            r3 = 2
            r6 = 0
            r8 = 1
            goto L_0x00c3
        L_0x0104:
            if (r14 != 0) goto L_0x0108
            r2 = 0
            goto L_0x0113
        L_0x0108:
            com.google.android.gms.internal.ads.wj4 r2 = new com.google.android.gms.internal.ads.wj4
            r3 = 1
            int[] r6 = new int[r3]
            r3 = 0
            r6[r3] = r15
            r2.<init>(r14, r6, r3)
        L_0x0113:
            r5[r7] = r2
        L_0x0115:
            int r7 = r7 + 1
            r2 = r25
            r3 = 2
            r6 = 0
            r8 = 1
            r11 = 3
            goto L_0x00ac
        L_0x011e:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 0
            r6 = 2
        L_0x0125:
            if (r3 >= r6) goto L_0x0131
            com.google.android.gms.internal.ads.ki4 r7 = r0.mo15605d(r3)
            m22281s(r7, r4, r2)
            int r3 = r3 + 1
            goto L_0x0125
        L_0x0131:
            com.google.android.gms.internal.ads.ki4 r3 = r24.mo15606e()
            m22281s(r3, r4, r2)
            r3 = 0
        L_0x0139:
            if (r3 >= r6) goto L_0x0150
            int r7 = r0.mo15604c(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r2.get(r7)
            com.google.android.gms.internal.ads.ix0 r7 = (com.google.android.gms.internal.ads.ix0) r7
            if (r7 != 0) goto L_0x014e
            int r3 = r3 + 1
            goto L_0x0139
        L_0x014e:
            r3 = 0
            throw r3
        L_0x0150:
            r3 = 0
            r2 = 0
        L_0x0152:
            if (r2 >= r6) goto L_0x016c
            com.google.android.gms.internal.ads.ki4 r6 = r0.mo15605d(r2)
            boolean r7 = r4.mo11414g(r2, r6)
            if (r7 != 0) goto L_0x015f
            goto L_0x0167
        L_0x015f:
            com.google.android.gms.internal.ads.lj4 r6 = r4.mo11411e(r2, r6)
            if (r6 != 0) goto L_0x016b
            r5[r2] = r3
        L_0x0167:
            int r2 = r2 + 1
            r6 = 2
            goto L_0x0152
        L_0x016b:
            throw r3
        L_0x016c:
            r2 = 2
            r3 = 0
        L_0x016e:
            if (r3 >= r2) goto L_0x0190
            int r2 = r0.mo15604c(r3)
            boolean r6 = r4.mo11413f(r3)
            if (r6 != 0) goto L_0x0189
            com.google.android.gms.internal.ads.za3 r6 = r4.f12586z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r6.contains(r2)
            if (r2 == 0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r2 = 0
            goto L_0x018c
        L_0x0189:
            r2 = 0
            r5[r3] = r2
        L_0x018c:
            int r3 = r3 + 1
            r2 = 2
            goto L_0x016e
        L_0x0190:
            r2 = 0
            com.google.android.gms.internal.ads.pi4 r3 = r1.f19132j
            com.google.android.gms.internal.ads.mk4 r12 = r23.mo9621f()
            com.google.android.gms.internal.ads.ua3 r13 = com.google.android.gms.internal.ads.qi4.m19230b(r5)
            r6 = 2
            com.google.android.gms.internal.ads.xj4[] r14 = new com.google.android.gms.internal.ads.xj4[r6]
            r15 = 0
        L_0x019f:
            if (r15 >= r6) goto L_0x01e8
            r6 = r5[r15]
            if (r6 == 0) goto L_0x01e0
            int[] r8 = r6.f19660b
            int r7 = r8.length
            if (r7 != 0) goto L_0x01ab
            goto L_0x01e0
        L_0x01ab:
            r11 = 1
            if (r7 != r11) goto L_0x01c6
            com.google.android.gms.internal.ads.yj4 r7 = new com.google.android.gms.internal.ads.yj4
            com.google.android.gms.internal.ads.gv0 r6 = r6.f19659a
            r16 = 0
            r19 = r8[r16]
            r20 = 0
            r21 = 0
            r22 = 0
            r17 = r7
            r18 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            r18 = 1
            goto L_0x01dd
        L_0x01c6:
            r16 = 0
            com.google.android.gms.internal.ads.gv0 r7 = r6.f19659a
            r9 = 0
            java.lang.Object r6 = r13.get(r15)
            r17 = r6
            com.google.android.gms.internal.ads.ua3 r17 = (com.google.android.gms.internal.ads.ua3) r17
            r6 = r3
            r10 = r12
            r18 = 1
            r11 = r17
            com.google.android.gms.internal.ads.qi4 r7 = r6.mo13283a(r7, r8, r9, r10, r11)
        L_0x01dd:
            r14[r15] = r7
            goto L_0x01e4
        L_0x01e0:
            r16 = 0
            r18 = 1
        L_0x01e4:
            int r15 = r15 + 1
            r6 = 2
            goto L_0x019f
        L_0x01e8:
            r16 = 0
            com.google.android.gms.internal.ads.z74[] r3 = new com.google.android.gms.internal.ads.z74[r6]
            r5 = 0
        L_0x01ed:
            if (r5 >= r6) goto L_0x021a
            int r7 = r0.mo15604c(r5)
            boolean r8 = r4.mo11413f(r5)
            if (r8 != 0) goto L_0x0214
            com.google.android.gms.internal.ads.za3 r8 = r4.f12586z
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L_0x0206
            goto L_0x0214
        L_0x0206:
            int r7 = r0.mo15604c(r5)
            r8 = -2
            if (r7 == r8) goto L_0x0211
            r7 = r14[r5]
            if (r7 == 0) goto L_0x0214
        L_0x0211:
            com.google.android.gms.internal.ads.z74 r7 = com.google.android.gms.internal.ads.z74.f21008a
            goto L_0x0215
        L_0x0214:
            r7 = r2
        L_0x0215:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x01ed
        L_0x021a:
            android.util.Pair r0 = android.util.Pair.create(r3, r14)
            return r0
        L_0x021f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x021f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vj4.mo8425i(com.google.android.gms.internal.ads.zj4, int[][][], int[], com.google.android.gms.internal.ads.mg4, com.google.android.gms.internal.ads.gt0):android.util.Pair");
    }

    /* renamed from: k */
    public final jj4 mo14779k() {
        jj4 jj4;
        synchronized (this.f19126d) {
            jj4 = this.f19129g;
        }
        return jj4;
    }

    /* renamed from: p */
    public final void mo14780p(hj4 hj4) {
        boolean z;
        jj4 jj4 = new jj4(hj4);
        synchronized (this.f19126d) {
            z = !this.f19129g.equals(jj4);
            this.f19129g = jj4;
        }
        if (z) {
            if (jj4.f11671M && this.f19127e == null) {
                ot1.m18060e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            mo9623h();
        }
    }
}
