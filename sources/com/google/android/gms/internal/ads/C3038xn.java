package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.xn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3038xn implements C2259co, C3035xk, C3003wp, C2631mo {

    /* renamed from: A */
    private boolean f20224A;

    /* renamed from: B */
    private boolean f20225B;

    /* renamed from: C */
    private int f20226C;

    /* renamed from: D */
    private C2891to f20227D;

    /* renamed from: E */
    private long f20228E;

    /* renamed from: F */
    private boolean[] f20229F;

    /* renamed from: G */
    private boolean[] f20230G;

    /* renamed from: H */
    private boolean f20231H;

    /* renamed from: I */
    private long f20232I;

    /* renamed from: J */
    private long f20233J;

    /* renamed from: K */
    private long f20234K;

    /* renamed from: L */
    private int f20235L;

    /* renamed from: M */
    private boolean f20236M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f20237N;

    /* renamed from: O */
    private final C2781qp f20238O;

    /* renamed from: a */
    private final Uri f20239a;

    /* renamed from: b */
    private final C2669np f20240b;

    /* renamed from: c */
    private final int f20241c;

    /* renamed from: d */
    private final Handler f20242d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C3075yn f20243e;

    /* renamed from: f */
    private final C2296do f20244f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final long f20245g;

    /* renamed from: h */
    private final C2261cq f20246h = new C2261cq("Loader:ExtractorMediaPeriod");

    /* renamed from: i */
    private final C2964vn f20247i;

    /* renamed from: r */
    private final C2410gq f20248r;

    /* renamed from: s */
    private final Runnable f20249s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Runnable f20250t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final Handler f20251u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final SparseArray f20252v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C2222bo f20253w;

    /* renamed from: x */
    private C2293dl f20254x;

    /* renamed from: y */
    private boolean f20255y;

    /* renamed from: z */
    private boolean f20256z;

    public C3038xn(Uri uri, C2669np npVar, C2961vk[] vkVarArr, int i, Handler handler, C3075yn ynVar, C2296do doVar, C2781qp qpVar, String str, int i2, byte[] bArr) {
        this.f20239a = uri;
        this.f20240b = npVar;
        this.f20241c = i;
        this.f20242d = handler;
        this.f20243e = ynVar;
        this.f20244f = doVar;
        this.f20238O = qpVar;
        this.f20245g = (long) i2;
        this.f20247i = new C2964vn(vkVarArr, this);
        this.f20248r = new C2410gq();
        this.f20249s = new C2779qn(this);
        this.f20250t = new C2816rn(this);
        this.f20251u = new Handler();
        this.f20234K = -9223372036854775807L;
        this.f20252v = new SparseArray();
        this.f20232I = -1;
    }

    /* renamed from: j */
    private final int m23399j() {
        int size = this.f20252v.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C2668no) this.f20252v.valueAt(i2)).mo12670e();
        }
        return i;
    }

    /* renamed from: k */
    private final long m23400k() {
        int size = this.f20252v.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((C2668no) this.f20252v.valueAt(i)).mo12672g());
        }
        return j;
    }

    /* renamed from: l */
    private final void m23401l(C2927un unVar) {
        if (this.f20232I == -1) {
            this.f20232I = unVar.f18642i;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        r0 = r11.f20254x;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m23402m() {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.un r6 = new com.google.android.gms.internal.ads.un
            android.net.Uri r2 = r11.f20239a
            com.google.android.gms.internal.ads.np r3 = r11.f20240b
            com.google.android.gms.internal.ads.vn r4 = r11.f20247i
            com.google.android.gms.internal.ads.gq r5 = r11.f20248r
            r0 = r6
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r11.f20256z
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0041
            boolean r0 = r11.m23403n()
            com.google.android.gms.internal.ads.C2335eq.m12245e(r0)
            long r3 = r11.f20228E
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            long r7 = r11.f20234K
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            r0 = 1
            r11.f20236M = r0
            r11.f20234K = r1
            return
        L_0x0032:
            com.google.android.gms.internal.ads.dl r0 = r11.f20254x
            long r3 = r11.f20234K
            long r3 = r0.mo9204c(r3)
            long r7 = r11.f20234K
            r6.mo14546c(r3, r7)
            r11.f20234K = r1
        L_0x0041:
            int r0 = r11.m23399j()
            r11.f20235L = r0
            int r0 = r11.f20241c
            r3 = -1
            r4 = 6
            r5 = 3
            if (r0 != r3) goto L_0x006a
            boolean r0 = r11.f20256z
            if (r0 == 0) goto L_0x0069
            long r7 = r11.f20232I
            r9 = -1
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.dl r0 = r11.f20254x
            if (r0 == 0) goto L_0x0067
            long r7 = r0.zza()
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r0 = 6
            goto L_0x006a
        L_0x0069:
            r0 = 3
        L_0x006a:
            com.google.android.gms.internal.ads.cq r1 = r11.f20246h
            r1.mo9247a(r6, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3038xn.m23402m():void");
    }

    /* renamed from: n */
    private final boolean m23403n() {
        return this.f20234K != -9223372036854775807L;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r4v0 ?, r4v3 ?, r4v5 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: v */
    static /* bridge */ /* synthetic */ void m23410v(com.google.android.gms.internal.ads.C3038xn r8) {
        /*
            boolean r0 = r8.f20237N
            if (r0 != 0) goto L_0x009c
            boolean r0 = r8.f20256z
            if (r0 != 0) goto L_0x009c
            com.google.android.gms.internal.ads.dl r0 = r8.f20254x
            if (r0 == 0) goto L_0x009c
            boolean r0 = r8.f20255y
            if (r0 != 0) goto L_0x0012
            goto L_0x009c
        L_0x0012:
            android.util.SparseArray r0 = r8.f20252v
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x002d
            android.util.SparseArray r3 = r8.f20252v
            java.lang.Object r3 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.no r3 = (com.google.android.gms.internal.ads.C2668no) r3
            com.google.android.gms.internal.ads.qi r3 = r3.mo12673h()
            if (r3 == 0) goto L_0x009c
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002d:
            com.google.android.gms.internal.ads.gq r2 = r8.f20248r
            r2.mo10617b()
            com.google.android.gms.internal.ads.so[] r2 = new com.google.android.gms.internal.ads.C2854so[r0]
            boolean[] r3 = new boolean[r0]
            r8.f20230G = r3
            boolean[] r3 = new boolean[r0]
            r8.f20229F = r3
            com.google.android.gms.internal.ads.dl r3 = r8.f20254x
            long r3 = r3.zza()
            r8.f20228E = r3
            r3 = 0
        L_0x0045:
            r4 = 1
            if (r3 >= r0) goto L_0x007b
            android.util.SparseArray r5 = r8.f20252v
            java.lang.Object r5 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.no r5 = (com.google.android.gms.internal.ads.C2668no) r5
            com.google.android.gms.internal.ads.qi r5 = r5.mo12673h()
            com.google.android.gms.internal.ads.so r6 = new com.google.android.gms.internal.ads.so
            com.google.android.gms.internal.ads.qi[] r7 = new com.google.android.gms.internal.ads.C2774qi[r4]
            r7[r1] = r5
            r6.<init>(r7)
            r2[r3] = r6
            java.lang.String r5 = r5.f16392f
            boolean r6 = com.google.android.gms.internal.ads.C2522jq.m15005b(r5)
            if (r6 != 0) goto L_0x006f
            boolean r5 = com.google.android.gms.internal.ads.C2522jq.m15004a(r5)
            if (r5 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            boolean[] r5 = r8.f20230G
            r5[r3] = r4
            boolean r5 = r8.f20231H
            r4 = r4 | r5
            r8.f20231H = r4
            int r3 = r3 + 1
            goto L_0x0045
        L_0x007b:
            com.google.android.gms.internal.ads.to r0 = new com.google.android.gms.internal.ads.to
            r0.<init>(r2)
            r8.f20227D = r0
            r8.f20256z = r4
            com.google.android.gms.internal.ads.do r0 = r8.f20244f
            com.google.android.gms.internal.ads.ro r1 = new com.google.android.gms.internal.ads.ro
            long r2 = r8.f20228E
            com.google.android.gms.internal.ads.dl r4 = r8.f20254x
            boolean r4 = r4.mo9205e()
            r1.<init>(r2, r4)
            r2 = 0
            r0.mo8447d(r1, r2)
            com.google.android.gms.internal.ads.bo r0 = r8.f20253w
            r0.mo8898a(r8)
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3038xn.m23410v(com.google.android.gms.internal.ads.xn):void");
    }

    /* renamed from: U */
    public final long mo9232U() {
        if (!this.f20225B) {
            return -9223372036854775807L;
        }
        this.f20225B = false;
        return this.f20233J;
    }

    /* renamed from: a */
    public final void mo15101a(C2293dl dlVar) {
        this.f20254x = dlVar;
        this.f20251u.post(this.f20249s);
    }

    /* renamed from: a0 */
    public final C2891to mo9233a0() {
        return this.f20227D;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo14963b(C3077yp ypVar, long j, long j2, boolean z) {
        m23401l((C2927un) ypVar);
        if (!z && this.f20226C > 0) {
            int size = this.f20252v.size();
            for (int i = 0; i < size; i++) {
                ((C2668no) this.f20252v.valueAt(i)).mo12675j(this.f20229F[i]);
            }
            this.f20253w.mo10219b(this);
        }
    }

    /* renamed from: c */
    public final long mo9234c() {
        long j;
        if (this.f20236M) {
            return Long.MIN_VALUE;
        }
        if (m23403n()) {
            return this.f20234K;
        }
        if (this.f20231H) {
            int size = this.f20252v.size();
            j = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.f20230G[i]) {
                    j = Math.min(j, ((C2668no) this.f20252v.valueAt(i)).mo12672g());
                }
            }
        } else {
            j = m23400k();
        }
        return j == Long.MIN_VALUE ? this.f20233J : j;
    }

    /* renamed from: d */
    public final void mo15102d() {
        this.f20255y = true;
        this.f20251u.post(this.f20249s);
    }

    /* renamed from: d0 */
    public final void mo9235d0() throws IOException {
        this.f20246h.mo9249g(RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo14964e(C3077yp ypVar, long j, long j2) {
        m23401l((C2927un) ypVar);
        this.f20236M = true;
        if (this.f20228E == -9223372036854775807L) {
            long k = m23400k();
            long j3 = k == Long.MIN_VALUE ? 0 : k + 10000;
            this.f20228E = j3;
            this.f20244f.mo8447d(new C2817ro(j3, this.f20254x.mo9205e()), (Object) null);
        }
        this.f20253w.mo10219b(this);
    }

    /* renamed from: e0 */
    public final boolean mo9236e0(long j) {
        if (this.f20236M) {
            return false;
        }
        if (this.f20256z && this.f20226C == 0) {
            return false;
        }
        boolean c = this.f20248r.mo10618c();
        if (this.f20246h.mo9251i()) {
            return c;
        }
        m23402m();
        return true;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ int mo14965f(C3077yp ypVar, long j, long j2, IOException iOException) {
        C2293dl dlVar;
        C2927un unVar = (C2927un) ypVar;
        m23401l(unVar);
        Handler handler = this.f20242d;
        if (handler != null) {
            handler.post(new C2890tn(this, iOException));
        }
        if (iOException instanceof C2928uo) {
            return 3;
        }
        int j3 = m23399j();
        int i = this.f20235L;
        if (this.f20232I == -1 && ((dlVar = this.f20254x) == null || dlVar.zza() == -9223372036854775807L)) {
            this.f20233J = 0;
            this.f20225B = this.f20256z;
            int size = this.f20252v.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C2668no) this.f20252v.valueAt(i2)).mo12675j(!this.f20256z || this.f20229F[i2]);
            }
            unVar.mo14546c(0, 0);
        }
        this.f20235L = m23399j();
        if (j3 <= i) {
            return 0;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        if (r1 != false) goto L_0x00c5;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo9237f0(com.google.android.gms.internal.ads.C3039xo[] r7, boolean[] r8, com.google.android.gms.internal.ads.C2705oo[] r9, boolean[] r10, long r11) {
        /*
            r6 = this;
            boolean r0 = r6.f20256z
            com.google.android.gms.internal.ads.C2335eq.m12245e(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r7.length
            if (r1 >= r2) goto L_0x003e
            r2 = r9[r1]
            if (r2 == 0) goto L_0x003b
            r3 = r7[r1]
            if (r3 == 0) goto L_0x0016
            boolean r3 = r8[r1]
            if (r3 != 0) goto L_0x003b
        L_0x0016:
            com.google.android.gms.internal.ads.wn r2 = (com.google.android.gms.internal.ads.C3001wn) r2
            int r2 = r2.f19721a
            boolean[] r3 = r6.f20229F
            boolean r3 = r3[r2]
            com.google.android.gms.internal.ads.C2335eq.m12245e(r3)
            int r3 = r6.f20226C
            int r3 = r3 + -1
            r6.f20226C = r3
            boolean[] r3 = r6.f20229F
            r3[r2] = r0
            android.util.SparseArray r3 = r6.f20252v
            java.lang.Object r2 = r3.valueAt(r2)
            com.google.android.gms.internal.ads.no r2 = (com.google.android.gms.internal.ads.C2668no) r2
            r2.mo12674i()
            r2 = 0
            r9[r1] = r2
        L_0x003b:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003e:
            r8 = 0
            r1 = 0
        L_0x0040:
            int r2 = r7.length
            r3 = 1
            if (r8 >= r2) goto L_0x0083
            r2 = r9[r8]
            if (r2 != 0) goto L_0x0080
            r2 = r7[r8]
            if (r2 == 0) goto L_0x0080
            r2.mo15197b()
            int r1 = r2.mo15196a(r0)
            if (r1 != 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            com.google.android.gms.internal.ads.C2335eq.m12245e(r1)
            com.google.android.gms.internal.ads.to r1 = r6.f20227D
            com.google.android.gms.internal.ads.so r2 = r2.mo15199d()
            int r1 = r1.mo14332a(r2)
            boolean[] r2 = r6.f20229F
            boolean r2 = r2[r1]
            r2 = r2 ^ r3
            com.google.android.gms.internal.ads.C2335eq.m12245e(r2)
            int r2 = r6.f20226C
            int r2 = r2 + r3
            r6.f20226C = r2
            boolean[] r2 = r6.f20229F
            r2[r1] = r3
            com.google.android.gms.internal.ads.wn r2 = new com.google.android.gms.internal.ads.wn
            r2.<init>(r6, r1)
            r9[r8] = r2
            r10[r8] = r3
            r1 = 1
        L_0x0080:
            int r8 = r8 + 1
            goto L_0x0040
        L_0x0083:
            boolean r7 = r6.f20224A
            if (r7 != 0) goto L_0x00a4
            android.util.SparseArray r7 = r6.f20252v
            int r7 = r7.size()
            r8 = 0
        L_0x008e:
            if (r8 >= r7) goto L_0x00a4
            boolean[] r2 = r6.f20229F
            boolean r2 = r2[r8]
            if (r2 != 0) goto L_0x00a1
            android.util.SparseArray r2 = r6.f20252v
            java.lang.Object r2 = r2.valueAt(r8)
            com.google.android.gms.internal.ads.no r2 = (com.google.android.gms.internal.ads.C2668no) r2
            r2.mo12674i()
        L_0x00a1:
            int r8 = r8 + 1
            goto L_0x008e
        L_0x00a4:
            int r7 = r6.f20226C
            r4 = 0
            if (r7 != 0) goto L_0x00b8
            r6.f20225B = r0
            com.google.android.gms.internal.ads.cq r7 = r6.f20246h
            boolean r8 = r7.mo9251i()
            if (r8 == 0) goto L_0x00d5
            r7.mo9248f()
            goto L_0x00d5
        L_0x00b8:
            boolean r7 = r6.f20224A
            if (r7 == 0) goto L_0x00bf
            if (r1 == 0) goto L_0x00d5
            goto L_0x00c5
        L_0x00bf:
            int r7 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x00c5
            r11 = r4
            goto L_0x00d5
        L_0x00c5:
            long r11 = r6.mo9240i0(r11)
        L_0x00c9:
            int r7 = r9.length
            if (r0 >= r7) goto L_0x00d5
            r7 = r9[r0]
            if (r7 == 0) goto L_0x00d2
            r10[r0] = r3
        L_0x00d2:
            int r0 = r0 + 1
            goto L_0x00c9
        L_0x00d5:
            r6.f20224A = r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3038xn.mo9237f0(com.google.android.gms.internal.ads.xo[], boolean[], com.google.android.gms.internal.ads.oo[], boolean[], long):long");
    }

    /* renamed from: g */
    public final C2368fl mo15103g(int i, int i2) {
        C2668no noVar = (C2668no) this.f20252v.get(i);
        if (noVar != null) {
            return noVar;
        }
        C2668no noVar2 = new C2668no(this.f20238O, (byte[]) null);
        noVar2.mo12676k(this);
        this.f20252v.put(i, noVar2);
        return noVar2;
    }

    /* renamed from: g0 */
    public final void mo9238g0(C2222bo boVar, long j) {
        this.f20253w = boVar;
        this.f20248r.mo10618c();
        m23402m();
    }

    /* renamed from: h */
    public final void mo12383h(C2774qi qiVar) {
        this.f20251u.post(this.f20249s);
    }

    /* renamed from: h0 */
    public final void mo9239h0(long j) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo15190i(int i) {
        return this.f20236M || (!m23403n() && ((C2668no) this.f20252v.valueAt(i)).mo12678m());
    }

    /* renamed from: i0 */
    public final long mo9240i0(long j) {
        if (true != this.f20254x.mo9205e()) {
            j = 0;
        }
        this.f20233J = j;
        int size = this.f20252v.size();
        boolean n = true ^ m23403n();
        int i = 0;
        while (true) {
            if (n) {
                if (i >= size) {
                    break;
                }
                if (this.f20229F[i]) {
                    n = ((C2668no) this.f20252v.valueAt(i)).mo12679n(j, false);
                }
                i++;
            } else {
                this.f20234K = j;
                this.f20236M = false;
                C2261cq cqVar = this.f20246h;
                if (cqVar.mo9251i()) {
                    cqVar.mo9248f();
                } else {
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C2668no) this.f20252v.valueAt(i2)).mo12675j(this.f20229F[i2]);
                    }
                }
            }
        }
        this.f20225B = false;
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo15191o(int i, C2811ri riVar, C2664nk nkVar, boolean z) {
        if (this.f20225B || m23403n()) {
            return -3;
        }
        return ((C2668no) this.f20252v.valueAt(i)).mo12671f(riVar, nkVar, z, this.f20236M, this.f20233J);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo15192w() throws IOException {
        this.f20246h.mo9249g(RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: x */
    public final void mo15193x() {
        this.f20246h.mo9250h(new C2853sn(this, this.f20247i));
        this.f20251u.removeCallbacksAndMessages((Object) null);
        this.f20237N = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public final void mo15194y(int i, long j) {
        C2668no noVar = (C2668no) this.f20252v.valueAt(i);
        if (!this.f20236M || j <= noVar.mo12672g()) {
            noVar.mo12679n(j, true);
        } else {
            noVar.mo12677l();
        }
    }

    public final long zza() {
        if (this.f20226C == 0) {
            return Long.MIN_VALUE;
        }
        return mo9234c();
    }
}
