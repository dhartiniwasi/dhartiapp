package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p060h4.C4596v;
import p073j4.C4751b2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class is0 extends ro0 implements ve3, o84 {

    /* renamed from: D */
    public static final /* synthetic */ int f10921D = 0;

    /* renamed from: A */
    private final ArrayList f10922A;

    /* renamed from: B */
    private volatile ur0 f10923B;

    /* renamed from: C */
    private final Set f10924C = new HashSet();

    /* renamed from: c */
    private final Context f10925c;

    /* renamed from: d */
    private final sr0 f10926d;

    /* renamed from: e */
    private final vj4 f10927e;

    /* renamed from: f */
    private final zo0 f10928f;

    /* renamed from: g */
    private final WeakReference f10929g;

    /* renamed from: h */
    private final rh4 f10930h;

    /* renamed from: i */
    private c84 f10931i;

    /* renamed from: r */
    private ByteBuffer f10932r;

    /* renamed from: s */
    private boolean f10933s;

    /* renamed from: t */
    private qo0 f10934t;

    /* renamed from: u */
    private int f10935u;

    /* renamed from: v */
    private int f10936v;

    /* renamed from: w */
    private long f10937w;

    /* renamed from: x */
    private final String f10938x;

    /* renamed from: y */
    private final int f10939y;

    /* renamed from: z */
    private final Object f10940z = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00f5, code lost:
        if (((java.lang.Boolean) p060h4.C4596v.m30088c().mo12227b(com.google.android.gms.internal.ads.C2679nz.f14274D1)).booleanValue() == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f9, code lost:
        if (r7.f21200j == false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fb, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00fe, code lost:
        if (r7.f21205o == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0100, code lost:
        r8 = new com.google.android.gms.internal.ads.yr0(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0108, code lost:
        if (r7.f21199i <= 0) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010a, code lost:
        r8 = new com.google.android.gms.internal.ads.zr0(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0110, code lost:
        r8 = new com.google.android.gms.internal.ads.as0(r5, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        if (r7.f21200j == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0119, code lost:
        r7 = new com.google.android.gms.internal.ads.bs0(r5, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0120, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0121, code lost:
        r6 = r5.f10932r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0123, code lost:
        if (r6 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0129, code lost:
        if (r6.limit() <= 0) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012b, code lost:
        r6 = new byte[r5.f10932r.limit()];
        r5.f10932r.get(r6);
        r7 = new com.google.android.gms.internal.ads.cs0(r7, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public is0(android.content.Context r6, com.google.android.gms.internal.ads.zo0 r7, com.google.android.gms.internal.ads.ap0 r8) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r5.f10940z = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.f10924C = r0
            r5.f10925c = r6
            r5.f10928f = r7
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r5.f10929g = r0
            com.google.android.gms.internal.ads.sr0 r0 = new com.google.android.gms.internal.ads.sr0
            r0.<init>()
            r5.f10926d = r0
            com.google.android.gms.internal.ads.vj4 r1 = new com.google.android.gms.internal.ads.vj4
            r1.<init>(r6)
            r5.f10927e = r1
            boolean r2 = p073j4.C4794n1.m30695m()
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "OfficialSimpleExoPlayerAdapter initialize "
            java.lang.String r2 = r3.concat(r2)
            p073j4.C4794n1.m30693k(r2)
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = com.google.android.gms.internal.ads.ro0.f17032a
            r2.incrementAndGet()
            com.google.android.gms.internal.ads.b84 r2 = new com.google.android.gms.internal.ads.b84
            com.google.android.gms.internal.ads.ds0 r3 = new com.google.android.gms.internal.ads.ds0
            r3.<init>(r5)
            r4 = 0
            r2.<init>(r6, r3, r4)
            r2.mo8695b(r1)
            r2.mo8694a(r0)
            com.google.android.gms.internal.ads.c84 r0 = r2.mo8696c()
            r5.f10931i = r0
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14344K1
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0070
            com.google.android.gms.internal.ads.c84 r0 = r5.f10931i
            com.google.android.gms.internal.ads.a74.m9630a(r0)
        L_0x0070:
            com.google.android.gms.internal.ads.c84 r0 = r5.f10931i
            r0.mo9072s(r5)
            r0 = 0
            r5.f10935u = r0
            r1 = 0
            r5.f10937w = r1
            r5.f10936v = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f10922A = r1
            r5.f10923B = r4
            if (r8 == 0) goto L_0x0094
            java.lang.String r1 = r8.mo8468g()
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = r8.mo8468g()
            goto L_0x0096
        L_0x0094:
            java.lang.String r1 = ""
        L_0x0096:
            r5.f10938x = r1
            if (r8 == 0) goto L_0x009f
            int r1 = r8.mo8458U()
            goto L_0x00a0
        L_0x009f:
            r1 = 0
        L_0x00a0:
            r5.f10939y = r1
            com.google.android.gms.internal.ads.rh4 r1 = new com.google.android.gms.internal.ads.rh4
            j4.b2 r2 = p053g4.C4409t.m29326r()
            com.google.android.gms.internal.ads.vm0 r8 = r8.mo8464b0()
            java.lang.String r8 = r8.f19150a
            java.lang.String r6 = r2.mo18438z(r6, r8)
            boolean r8 = r5.f10933s
            if (r8 == 0) goto L_0x00d2
            java.nio.ByteBuffer r8 = r5.f10932r
            int r8 = r8.limit()
            if (r8 <= 0) goto L_0x00d2
            java.nio.ByteBuffer r6 = r5.f10932r
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r7 = r5.f10932r
            r7.get(r6)
            com.google.android.gms.internal.ads.wr0 r7 = new com.google.android.gms.internal.ads.wr0
            r7.<init>(r6)
            goto L_0x013e
        L_0x00d2:
            com.google.android.gms.internal.ads.ez r8 = com.google.android.gms.internal.ads.C2679nz.f14364M1
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()
            java.lang.Object r8 = r2.mo12227b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r2 = 1
            if (r8 == 0) goto L_0x00f7
            com.google.android.gms.internal.ads.ez r8 = com.google.android.gms.internal.ads.C2679nz.f14274D1
            com.google.android.gms.internal.ads.lz r3 = p060h4.C4596v.m30088c()
            java.lang.Object r8 = r3.mo12227b(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x00fb
        L_0x00f7:
            boolean r8 = r7.f21200j
            if (r8 != 0) goto L_0x00fc
        L_0x00fb:
            r0 = 1
        L_0x00fc:
            boolean r8 = r7.f21205o
            if (r8 == 0) goto L_0x0106
            com.google.android.gms.internal.ads.yr0 r8 = new com.google.android.gms.internal.ads.yr0
            r8.<init>(r5, r6, r0)
            goto L_0x0115
        L_0x0106:
            int r8 = r7.f21199i
            if (r8 <= 0) goto L_0x0110
            com.google.android.gms.internal.ads.zr0 r8 = new com.google.android.gms.internal.ads.zr0
            r8.<init>(r5, r6, r0)
            goto L_0x0115
        L_0x0110:
            com.google.android.gms.internal.ads.as0 r8 = new com.google.android.gms.internal.ads.as0
            r8.<init>(r5, r6, r0)
        L_0x0115:
            boolean r6 = r7.f21200j
            if (r6 == 0) goto L_0x0120
            com.google.android.gms.internal.ads.bs0 r6 = new com.google.android.gms.internal.ads.bs0
            r6.<init>(r5, r8)
            r7 = r6
            goto L_0x0121
        L_0x0120:
            r7 = r8
        L_0x0121:
            java.nio.ByteBuffer r6 = r5.f10932r
            if (r6 == 0) goto L_0x013e
            int r6 = r6.limit()
            if (r6 <= 0) goto L_0x013e
            java.nio.ByteBuffer r6 = r5.f10932r
            int r6 = r6.limit()
            byte[] r6 = new byte[r6]
            java.nio.ByteBuffer r8 = r5.f10932r
            r8.get(r6)
            com.google.android.gms.internal.ads.cs0 r8 = new com.google.android.gms.internal.ads.cs0
            r8.<init>(r7, r6)
            r7 = r8
        L_0x013e:
            com.google.android.gms.internal.ads.ez r6 = com.google.android.gms.internal.ads.C2679nz.f14617m
            com.google.android.gms.internal.ads.lz r8 = p060h4.C4596v.m30088c()
            java.lang.Object r6 = r8.mo12227b(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0153
            com.google.android.gms.internal.ads.gs0 r6 = com.google.android.gms.internal.ads.gs0.f10054b
            goto L_0x0155
        L_0x0153:
            com.google.android.gms.internal.ads.hs0 r6 = com.google.android.gms.internal.ads.hs0.f10469b
        L_0x0155:
            com.google.android.gms.internal.ads.qh4 r8 = new com.google.android.gms.internal.ads.qh4
            r8.<init>(r6)
            r1.<init>(r7, r8, r4)
            r5.f10930h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.is0.<init>(android.content.Context, com.google.android.gms.internal.ads.zo0, com.google.android.gms.internal.ads.ap0):void");
    }

    /* renamed from: o0 */
    private final boolean m14490o0() {
        return this.f10923B != null && this.f10923B.mo14598v();
    }

    /* renamed from: A */
    public final void mo11191A(ql2 ql2, wq2 wq2, boolean z) {
    }

    /* renamed from: B */
    public final void mo11192B(m84 m84, s61 s61) {
        qo0 qo0 = this.f10934t;
        if (qo0 != null) {
            qo0.mo13338f(s61.f17273a, s61.f17274b);
        }
    }

    /* renamed from: F */
    public final void mo11193F(ql2 ql2, wq2 wq2, boolean z) {
    }

    /* renamed from: G */
    public final long mo11194G() {
        if (!m14490o0()) {
            return (long) this.f10935u;
        }
        return 0;
    }

    /* renamed from: H */
    public final long mo11195H() {
        if (m14490o0()) {
            return this.f10923B.mo14593q();
        }
        synchronized (this.f10940z) {
            while (!this.f10922A.isEmpty()) {
                long j = this.f10937w;
                Map a = ((f93) this.f10922A.remove(0)).mo8790a();
                long j2 = 0;
                if (a != null) {
                    Iterator it = a.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it.next();
                        if (entry != null) {
                            try {
                                if (!(entry.getKey() == null || !i73.m14186c("content-length", (CharSequence) entry.getKey()) || entry.getValue() == null || ((List) entry.getValue()).get(0) == null)) {
                                    j2 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        }
                    }
                }
                this.f10937w = j + j2;
            }
        }
        return this.f10937w;
    }

    /* renamed from: I */
    public final void mo11196I(Uri[] uriArr, String str) {
        mo11197J(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: J */
    public final void mo11197J(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        og4 og4;
        if (this.f10931i != null) {
            this.f10932r = byteBuffer;
            this.f10933s = z;
            int length = uriArr.length;
            if (length == 1) {
                og4 = mo11230l0(uriArr[0]);
            } else {
                og4[] og4Arr = new og4[length];
                for (int i = 0; i < uriArr.length; i++) {
                    og4Arr[i] = mo11230l0(uriArr[i]);
                }
                og4 = new dh4(false, false, og4Arr);
            }
            this.f10931i.mo9062i(og4);
            this.f10931i.mo9073t();
            ro0.f17033b.incrementAndGet();
        }
    }

    /* renamed from: K */
    public final void mo11198K() {
        c84 c84 = this.f10931i;
        if (c84 != null) {
            c84.mo9060g(this);
            this.f10931i.mo9074u();
            this.f10931i = null;
            ro0.f17033b.decrementAndGet();
        }
    }

    /* renamed from: L */
    public final void mo11199L(long j) {
        c84 c84 = this.f10931i;
        c84.mo9059f(c84.mo9045T(), j);
    }

    /* renamed from: M */
    public final void mo11200M(int i) {
        this.f10926d.mo14124h(i);
    }

    /* renamed from: N */
    public final void mo11201N(int i) {
        this.f10926d.mo14125i(i);
    }

    /* renamed from: O */
    public final void mo11202O(qo0 qo0) {
        this.f10934t = qo0;
    }

    /* renamed from: P */
    public final void mo11203P(int i) {
        this.f10926d.mo14126j(i);
    }

    /* renamed from: Q */
    public final void mo11204Q(int i) {
        this.f10926d.mo14127k(i);
    }

    /* renamed from: R */
    public final void mo11205R(boolean z) {
        this.f10931i.mo9063j(z);
    }

    /* renamed from: S */
    public final void mo11206S(boolean z) {
        if (this.f10931i != null) {
            int i = 0;
            while (true) {
                this.f10931i.mo9068o();
                if (i < 2) {
                    vj4 vj4 = this.f10927e;
                    hj4 c = vj4.mo14779k().mo11410c();
                    c.mo10826o(i, !z);
                    vj4.mo14780p(c);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: T */
    public final void mo11207T(int i) {
        for (WeakReference weakReference : this.f10924C) {
            rr0 rr0 = (rr0) weakReference.get();
            if (rr0 != null) {
                rr0.mo13874r(i);
            }
        }
    }

    /* renamed from: U */
    public final void mo11208U(Surface surface, boolean z) {
        c84 c84 = this.f10931i;
        if (c84 != null) {
            c84.mo9065l(surface);
        }
    }

    /* renamed from: V */
    public final void mo11209V(float f, boolean z) {
        c84 c84 = this.f10931i;
        if (c84 != null) {
            c84.mo9066m(f);
        }
    }

    /* renamed from: W */
    public final void mo11210W() {
        this.f10931i.mo9067n();
    }

    /* renamed from: X */
    public final boolean mo11211X() {
        return this.f10931i != null;
    }

    /* renamed from: Y */
    public final int mo11212Y() {
        return this.f10936v;
    }

    /* renamed from: a0 */
    public final int mo11213a0() {
        return this.f10931i.mo9046U();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo11214c(zl0 zl0, n84 n84) {
    }

    /* renamed from: c0 */
    public final long mo11215c0() {
        return this.f10931i.mo9069p();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo11216d(m84 m84, ny3 ny3) {
    }

    /* renamed from: d0 */
    public final long mo11217d0() {
        return (long) this.f10935u;
    }

    /* renamed from: e */
    public final void mo11218e(m84 m84, gc0 gc0) {
        qo0 qo0 = this.f10934t;
        if (qo0 != null) {
            qo0.mo13337e("onPlayerError", gc0);
        }
    }

    /* renamed from: e0 */
    public final long mo11219e0() {
        if (m14490o0() && this.f10923B.mo14597u()) {
            return Math.min((long) this.f10935u, this.f10923B.mo14592p());
        }
        return 0;
    }

    /* renamed from: f0 */
    public final long mo11220f0() {
        return this.f10931i.mo9051Z();
    }

    public final void finalize() {
        ro0.f17032a.decrementAndGet();
        if (C4794n1.m30695m()) {
            C4794n1.m30693k("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* renamed from: g0 */
    public final long mo11222g0() {
        return this.f10931i.mo9070q();
    }

    /* renamed from: h */
    public final void mo11223h(m84 m84, int i, long j) {
        this.f10936v += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ ql2 mo11224h0(String str, boolean z) {
        is0 is0 = true != z ? null : this;
        zo0 zo0 = this.f10928f;
        return new ls0(str, is0, zo0.f21194d, zo0.f21196f, zo0.f21206p, zo0.f21207q);
    }

    /* renamed from: i */
    public final /* synthetic */ void mo11225i(m84 m84, ig4 ig4) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final /* synthetic */ ql2 mo11226i0(String str, boolean z) {
        is0 is0 = true != z ? null : this;
        zo0 zo0 = this.f10928f;
        rr0 rr0 = new rr0(str, is0, zo0.f21194d, zo0.f21196f, zo0.f21199i);
        this.f10924C.add(new WeakReference(rr0));
        return rr0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final /* synthetic */ ql2 mo11227j0(String str, boolean z) {
        zt2 zt2 = new zt2();
        zt2.mo15664e(str);
        zt2.mo15663d(true != z ? null : this);
        zt2.mo15661b(this.f10928f.f21194d);
        zt2.mo15662c(this.f10928f.f21196f);
        zt2.mo15660a(true);
        return zt2.zza();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final /* synthetic */ ql2 mo11228k0(pk2 pk2) {
        return new ur0(this.f10925c, pk2.zza(), this.f10938x, this.f10939y, this, new xr0(this), (byte[]) null);
    }

    /* renamed from: l */
    public final void mo11229l(m84 m84, C2388g4 g4Var, oz3 oz3) {
        ap0 ap0 = (ap0) this.f10929g.get();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && ap0 != null && g4Var != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", g4Var.f9672k);
            hashMap.put("audioSampleMime", g4Var.f9673l);
            hashMap.put("audioCodec", g4Var.f9670i);
            ap0.mo9081R("onMetadataEvent", hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l0 */
    public final og4 mo11230l0(Uri uri) {
        C2541k8 k8Var = new C2541k8();
        k8Var.mo11618b(uri);
        C2453hw c = k8Var.mo11619c();
        rh4 rh4 = this.f10930h;
        rh4.mo13802a(this.f10928f.f21197g);
        return rh4.mo13803b(c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final /* synthetic */ void mo11231m0(boolean z, long j) {
        qo0 qo0 = this.f10934t;
        if (qo0 != null) {
            qo0.mo13336d(z, j);
        }
    }

    /* renamed from: n */
    public final /* synthetic */ void mo11232n(m84 m84, int i, long j, long j2) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public final /* synthetic */ x74[] mo11233n0(Handler handler, km4 km4, sb4 sb4, mi4 mi4, lf4 lf4) {
        Context context = this.f10925c;
        ue4 ue4 = ue4.f18511a;
        db4 db4 = db4.f8176c;
        gb4[] gb4Arr = new gb4[0];
        jc4 jc4 = new jc4();
        if (db4 == null) {
            Objects.requireNonNull(db4, "Both parameters are null");
        }
        jc4.mo11387b(db4);
        jc4.mo11388c(gb4Arr);
        vc4 d = jc4.mo11389d();
        me4 me4 = me4.f13313a;
        return new x74[]{new cd4(context, me4, ue4, false, handler, sb4, d), new ml4(this.f10925c, me4, ue4, 0, false, handler, km4, -1, 30.0f)};
    }

    /* renamed from: o */
    public final void mo11234o(ql2 ql2, wq2 wq2, boolean z, int i) {
        this.f10935u += i;
    }

    /* renamed from: p */
    public final void mo11235p(m84 m84, cg4 cg4, ig4 ig4, IOException iOException, boolean z) {
        qo0 qo0 = this.f10934t;
        if (qo0 == null) {
            return;
        }
        if (this.f10928f.f21202l) {
            qo0.mo13335c("onLoadException", iOException);
        } else {
            qo0.mo13337e("onLoadError", iOException);
        }
    }

    /* renamed from: q */
    public final /* synthetic */ void mo11236q(m84 m84, yk0 yk0, yk0 yk02, int i) {
    }

    /* renamed from: r */
    public final void mo11237r(ql2 ql2, wq2 wq2, boolean z) {
        if (ql2 instanceof f93) {
            synchronized (this.f10940z) {
                this.f10922A.add((f93) ql2);
            }
        } else if (ql2 instanceof ur0) {
            this.f10923B = (ur0) ql2;
            ap0 ap0 = (ap0) this.f10929g.get();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && ap0 != null && this.f10923B.mo14595s()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f10923B.mo14597u()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f10923B.mo14596t()));
                C4751b2.f25403i.post(new es0(ap0, hashMap));
            }
        }
    }

    /* renamed from: s */
    public final void mo11238s(m84 m84, C2388g4 g4Var, oz3 oz3) {
        ap0 ap0 = (ap0) this.f10929g.get();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && ap0 != null && g4Var != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(g4Var.f9680s));
            hashMap.put("bitRate", String.valueOf(g4Var.f9669h));
            int i = g4Var.f9678q;
            int i2 = g4Var.f9679r;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", g4Var.f9672k);
            hashMap.put("videoSampleMime", g4Var.f9673l);
            hashMap.put("videoCodec", g4Var.f9670i);
            ap0.mo9081R("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: t */
    public final void mo11239t(m84 m84, int i) {
        qo0 qo0 = this.f10934t;
        if (qo0 != null) {
            qo0.mo13334b(i);
        }
    }

    /* renamed from: u */
    public final void mo11240u(m84 m84, Object obj, long j) {
        qo0 qo0 = this.f10934t;
        if (qo0 != null) {
            qo0.mo13339g0();
        }
    }
}
