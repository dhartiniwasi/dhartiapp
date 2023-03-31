package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
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
import java.util.Set;
import p060h4.C4596v;
import p073j4.C4751b2;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kq0 extends ro0 implements C2298dq, C3075yn, C2708or, C2700oj, C2290di {

    /* renamed from: E */
    public static final /* synthetic */ int f12216E = 0;

    /* renamed from: A */
    private final Object f12217A = new Object();

    /* renamed from: B */
    private final ArrayList f12218B;

    /* renamed from: C */
    private volatile xp0 f12219C;

    /* renamed from: D */
    private final Set f12220D = new HashSet();

    /* renamed from: c */
    private final Context f12221c;

    /* renamed from: d */
    private final yp0 f12222d;

    /* renamed from: e */
    private final C2996wi f12223e;

    /* renamed from: f */
    private final C2996wi f12224f;

    /* renamed from: g */
    private final C2334ep f12225g;

    /* renamed from: h */
    private final zo0 f12226h;

    /* renamed from: i */
    private C2402gi f12227i;

    /* renamed from: r */
    private ByteBuffer f12228r;

    /* renamed from: s */
    private boolean f12229s;

    /* renamed from: t */
    private final WeakReference f12230t;

    /* renamed from: u */
    private qo0 f12231u;

    /* renamed from: v */
    private int f12232v;

    /* renamed from: w */
    private int f12233w;

    /* renamed from: x */
    private long f12234x;

    /* renamed from: y */
    private final String f12235y;

    /* renamed from: z */
    private final int f12236z;

    public kq0(Context context, zo0 zo0, ap0 ap0) {
        this.f12221c = context;
        this.f12226h = zo0;
        this.f12230t = new WeakReference(ap0);
        yp0 yp0 = new yp0();
        this.f12222d = yp0;
        C2926um umVar = C2926um.f18611a;
        b53 b53 = C4751b2.f25403i;
        C2299dr drVar = new C2299dr(context, umVar, 0, b53, this, -1);
        this.f12223e = drVar;
        C2329ek ekVar = new C2329ek(umVar, (C2850sk) null, true, b53, this);
        this.f12224f = ekVar;
        C3113zo zoVar = new C3113zo((C2372fp) null);
        this.f12225g = zoVar;
        if (C4794n1.m30695m()) {
            C4794n1.m30693k("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        ro0.f17032a.incrementAndGet();
        int i = 0;
        C2402gi a = C2439hi.m13855a(new C2996wi[]{ekVar, drVar}, zoVar, yp0);
        this.f12227i = a;
        a.mo10528l0(this);
        this.f12232v = 0;
        this.f12234x = 0;
        this.f12233w = 0;
        this.f12218B = new ArrayList();
        this.f12219C = null;
        this.f12235y = (ap0 == null || ap0.mo8468g() == null) ? "" : ap0.mo8468g();
        this.f12236z = ap0 != null ? ap0.mo8458U() : i;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14627n)).booleanValue()) {
            this.f12227i.mo10521c();
        }
        if (ap0 != null && ap0.mo8465c() > 0) {
            this.f12227i.mo10534r0(ap0.mo8465c());
        }
        if (ap0 != null && ap0.mo8457T() > 0) {
            this.f12227i.mo10532p0(ap0.mo8457T());
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14647p)).booleanValue()) {
            this.f12227i.mo10518V();
            this.f12227i.mo10525i0(((Integer) C4596v.m30088c().mo12227b(C2679nz.f14657q)).intValue());
        }
    }

    /* renamed from: n0 */
    private final boolean m15510n0() {
        return this.f12219C != null && this.f12219C.mo15220l();
    }

    /* renamed from: C */
    public final void mo9594C(C2254cj cjVar, Object obj) {
    }

    /* renamed from: D */
    public final void mo11760D(C2774qi qiVar) {
        ap0 ap0 = (ap0) this.f12230t.get();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && ap0 != null && qiVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("frameRate", String.valueOf(qiVar.f16398t));
            hashMap.put("bitRate", String.valueOf(qiVar.f16388b));
            int i = qiVar.f16396r;
            int i2 = qiVar.f16397s;
            hashMap.put("resolution", i + "x" + i2);
            hashMap.put("videoMime", qiVar.f16391e);
            hashMap.put("videoSampleMime", qiVar.f16392f);
            hashMap.put("videoCodec", qiVar.f16389c);
            ap0.mo9081R("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: E */
    public final void mo11761E(Surface surface) {
        qo0 qo0 = this.f12231u;
        if (qo0 != null) {
            qo0.mo13339g0();
        }
    }

    /* renamed from: G */
    public final long mo11194G() {
        if (!m15510n0()) {
            return (long) this.f12232v;
        }
        return 0;
    }

    /* renamed from: H */
    public final long mo11195H() {
        if (m15510n0()) {
            return this.f12219C.mo15215g();
        }
        synchronized (this.f12217A) {
            while (!this.f12218B.isEmpty()) {
                long j = this.f12234x;
                Map a = ((C2966vp) this.f12218B.remove(0)).mo13020a();
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
                this.f12234x = j + j2;
            }
        }
        return this.f12234x;
    }

    /* renamed from: I */
    public final void mo11196I(Uri[] uriArr, String str) {
        mo11197J(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: J */
    public final void mo11197J(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        C2333eo eoVar;
        if (this.f12227i != null) {
            this.f12228r = byteBuffer;
            this.f12229s = z;
            int length = uriArr.length;
            if (length == 1) {
                eoVar = mo11771o0(uriArr[0], str);
            } else {
                C2333eo[] eoVarArr = new C2333eo[length];
                for (int i = 0; i < uriArr.length; i++) {
                    eoVarArr[i] = mo11771o0(uriArr[i], str);
                }
                eoVar = new C2483io(eoVarArr);
            }
            this.f12227i.mo10530n0(eoVar);
            ro0.f17033b.incrementAndGet();
        }
    }

    /* renamed from: K */
    public final void mo11198K() {
        C2402gi giVar = this.f12227i;
        if (giVar != null) {
            giVar.mo10531o0(this);
            this.f12227i.mo10519X();
            this.f12227i = null;
            ro0.f17033b.decrementAndGet();
        }
    }

    /* renamed from: L */
    public final void mo11199L(long j) {
        this.f12227i.mo10526j0(j);
    }

    /* renamed from: M */
    public final void mo11200M(int i) {
        this.f12222d.mo15485f(i);
    }

    /* renamed from: N */
    public final void mo11201N(int i) {
        this.f12222d.mo15486g(i);
    }

    /* renamed from: O */
    public final void mo11202O(qo0 qo0) {
        this.f12231u = qo0;
    }

    /* renamed from: P */
    public final void mo11203P(int i) {
        this.f12222d.mo15487h(i);
    }

    /* renamed from: Q */
    public final void mo11204Q(int i) {
        this.f12222d.mo15488i(i);
    }

    /* renamed from: R */
    public final void mo11205R(boolean z) {
        this.f12227i.mo10527k0(z);
    }

    /* renamed from: S */
    public final void mo11206S(boolean z) {
        if (this.f12227i != null) {
            for (int i = 0; i < 2; i++) {
                this.f12225g.mo9992f(i, !z);
            }
        }
    }

    /* renamed from: T */
    public final void mo11207T(int i) {
        for (WeakReference weakReference : this.f12220D) {
            vp0 vp0 = (vp0) weakReference.get();
            if (vp0 != null) {
                vp0.mo14802h(i);
            }
        }
    }

    /* renamed from: U */
    public final void mo11208U(Surface surface, boolean z) {
        C2402gi giVar = this.f12227i;
        if (giVar != null) {
            C2365fi fiVar = new C2365fi(this.f12223e, 1, surface);
            if (z) {
                giVar.mo10533q0(fiVar);
                return;
            }
            giVar.mo10529m0(fiVar);
        }
    }

    /* renamed from: V */
    public final void mo11209V(float f, boolean z) {
        if (this.f12227i != null) {
            C2365fi fiVar = new C2365fi(this.f12224f, 2, Float.valueOf(f));
            this.f12227i.mo10529m0(fiVar);
        }
    }

    /* renamed from: W */
    public final void mo11210W() {
        this.f12227i.mo10524e0();
    }

    /* renamed from: X */
    public final boolean mo11211X() {
        return this.f12227i != null;
    }

    /* renamed from: Y */
    public final int mo11212Y() {
        return this.f12233w;
    }

    /* renamed from: a */
    public final void mo9595a() {
    }

    /* renamed from: a0 */
    public final int mo11213a0() {
        return this.f12227i.zza();
    }

    /* renamed from: b */
    public final void mo9596b(boolean z) {
    }

    /* renamed from: c0 */
    public final long mo11215c0() {
        return this.f12227i.mo10522d();
    }

    /* renamed from: d0 */
    public final long mo11217d0() {
        return (long) this.f12232v;
    }

    /* renamed from: e0 */
    public final long mo11219e0() {
        if (m15510n0() && this.f12219C.mo15219k()) {
            return Math.min((long) this.f12232v, this.f12219C.mo15214f());
        }
        return 0;
    }

    /* renamed from: f */
    public final void mo11762f(IOException iOException) {
        qo0 qo0 = this.f12231u;
        if (qo0 == null) {
            return;
        }
        if (this.f12226h.f21202l) {
            qo0.mo13335c("onLoadException", iOException);
        } else {
            qo0.mo13337e("onLoadError", iOException);
        }
    }

    /* renamed from: f0 */
    public final long mo11220f0() {
        return this.f12227i.mo10523e();
    }

    public final void finalize() throws Throwable {
        ro0.f17032a.decrementAndGet();
        if (C4794n1.m30695m()) {
            C4794n1.m30693k("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    /* renamed from: g */
    public final void mo11764g(int i, int i2, int i3, float f) {
        qo0 qo0 = this.f12231u;
        if (qo0 != null) {
            qo0.mo13338f(i, i2);
        }
    }

    /* renamed from: g0 */
    public final long mo11222g0() {
        return this.f12227i.mo10520b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final /* synthetic */ C2669np mo11765h0(String str, boolean z) {
        kq0 kq0 = true != z ? null : this;
        zo0 zo0 = this.f12226h;
        vp0 vp0 = new vp0(str, kq0, zo0.f21194d, zo0.f21196f, zo0.f21199i);
        this.f12220D.add(new WeakReference(vp0));
        return vp0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public final /* synthetic */ C2669np mo11766i0(String str, boolean z) {
        kq0 kq0 = true != z ? null : this;
        zo0 zo0 = this.f12226h;
        return new C2818rp(str, (C2707oq) null, kq0, zo0.f21194d, zo0.f21196f, true, (C2929up) null);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo9648j(Object obj, int i) {
        this.f12232v += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final /* synthetic */ C2669np mo11767j0(C2632mp mpVar) {
        return new xp0(this.f12221c, mpVar.zza(), this.f12235y, this.f12236z, this, new gq0(this), (byte[]) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final /* synthetic */ void mo11768k0(boolean z, long j) {
        qo0 qo0 = this.f12231u;
        if (qo0 != null) {
            qo0.mo13336d(z, j);
        }
    }

    /* renamed from: l0 */
    public final void mo11769l0(C2669np npVar, int i) {
        this.f12232v += i;
    }

    /* renamed from: m */
    public final void mo9597m(C2959vi viVar) {
    }

    /* renamed from: m0 */
    public final void mo9649k(C2669np npVar, C2744pp ppVar) {
        if (npVar instanceof C2966vp) {
            synchronized (this.f12217A) {
                this.f12218B.add((C2966vp) npVar);
            }
        } else if (npVar instanceof xp0) {
            this.f12219C = (xp0) npVar;
            ap0 ap0 = (ap0) this.f12230t.get();
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && ap0 != null && this.f12219C.mo15217i()) {
                HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.f12219C.mo15219k()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.f12219C.mo15218j()));
                C4751b2.f25403i.post(new hq0(ap0, hashMap));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (((java.lang.Boolean) p060h4.C4596v.m30088c().mo12227b(com.google.android.gms.internal.ads.C2679nz.f14274D1)).booleanValue() == false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2333eo mo11771o0(android.net.Uri r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.ao r9 = new com.google.android.gms.internal.ads.ao
            boolean r0 = r10.f12229s
            if (r0 == 0) goto L_0x0023
            java.nio.ByteBuffer r0 = r10.f12228r
            int r0 = r0.limit()
            if (r0 <= 0) goto L_0x0023
            java.nio.ByteBuffer r12 = r10.f12228r
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.f12228r
            r0.get(r12)
            com.google.android.gms.internal.ads.zp0 r0 = new com.google.android.gms.internal.ads.zp0
            r0.<init>(r12)
        L_0x0020:
            r2 = r0
            goto L_0x0094
        L_0x0023:
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14364M1
            com.google.android.gms.internal.ads.lz r1 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r1.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L_0x0048
            com.google.android.gms.internal.ads.ez r0 = com.google.android.gms.internal.ads.C2679nz.f14274D1
            com.google.android.gms.internal.ads.lz r2 = p060h4.C4596v.m30088c()
            java.lang.Object r0 = r2.mo12227b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0050
        L_0x0048:
            com.google.android.gms.internal.ads.zo0 r0 = r10.f12226h
            boolean r0 = r0.f21200j
            if (r0 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            com.google.android.gms.internal.ads.zo0 r0 = r10.f12226h
            boolean r2 = r0.f21205o
            if (r2 == 0) goto L_0x005c
            com.google.android.gms.internal.ads.aq0 r0 = new com.google.android.gms.internal.ads.aq0
            r0.<init>(r10, r12, r1)
            goto L_0x006b
        L_0x005c:
            int r0 = r0.f21199i
            if (r0 <= 0) goto L_0x0066
            com.google.android.gms.internal.ads.bq0 r0 = new com.google.android.gms.internal.ads.bq0
            r0.<init>(r10, r12, r1)
            goto L_0x006b
        L_0x0066:
            com.google.android.gms.internal.ads.cq0 r0 = new com.google.android.gms.internal.ads.cq0
            r0.<init>(r10, r12, r1)
        L_0x006b:
            com.google.android.gms.internal.ads.zo0 r12 = r10.f12226h
            boolean r12 = r12.f21200j
            if (r12 == 0) goto L_0x0077
            com.google.android.gms.internal.ads.eq0 r12 = new com.google.android.gms.internal.ads.eq0
            r12.<init>(r10, r0)
            r0 = r12
        L_0x0077:
            java.nio.ByteBuffer r12 = r10.f12228r
            if (r12 == 0) goto L_0x0020
            int r12 = r12.limit()
            if (r12 <= 0) goto L_0x0020
            java.nio.ByteBuffer r12 = r10.f12228r
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.f12228r
            r1.get(r12)
            com.google.android.gms.internal.ads.fq0 r1 = new com.google.android.gms.internal.ads.fq0
            r1.<init>(r0, r12)
            r2 = r1
        L_0x0094:
            com.google.android.gms.internal.ads.ez r12 = com.google.android.gms.internal.ads.C2679nz.f14617m
            com.google.android.gms.internal.ads.lz r0 = p060h4.C4596v.m30088c()
            java.lang.Object r12 = r0.mo12227b(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x00a9
            com.google.android.gms.internal.ads.iq0 r12 = com.google.android.gms.internal.ads.iq0.f10907a
            goto L_0x00ab
        L_0x00a9:
            com.google.android.gms.internal.ads.jq0 r12 = com.google.android.gms.internal.ads.jq0.f11739a
        L_0x00ab:
            r3 = r12
            com.google.android.gms.internal.ads.zo0 r12 = r10.f12226h
            int r4 = r12.f21201k
            com.google.android.gms.internal.ads.b53 r5 = p073j4.C4751b2.f25403i
            r7 = 0
            int r8 = r12.f21197g
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kq0.mo11771o0(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.eo");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public final /* synthetic */ C2669np mo11772p0(String str, boolean z) {
        kq0 kq0 = true != z ? null : this;
        zo0 zo0 = this.f12226h;
        return new oq0(str, kq0, zo0.f21194d, zo0.f21196f, zo0.f21206p, zo0.f21207q);
    }

    /* renamed from: v */
    public final void mo11773v(C2774qi qiVar) {
        ap0 ap0 = (ap0) this.f12230t.get();
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && ap0 != null && qiVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("audioMime", qiVar.f16391e);
            hashMap.put("audioSampleMime", qiVar.f16392f);
            hashMap.put("audioCodec", qiVar.f16389c);
            ap0.mo9081R("onMetadataEvent", hashMap);
        }
    }

    /* renamed from: w */
    public final void mo9598w(C2253ci ciVar) {
        qo0 qo0 = this.f12231u;
        if (qo0 != null) {
            qo0.mo13337e("onPlayerError", ciVar);
        }
    }

    /* renamed from: x */
    public final void mo11774x(int i, long j) {
        this.f12233w += i;
    }

    /* renamed from: y */
    public final void mo9599y(boolean z, int i) {
        qo0 qo0 = this.f12231u;
        if (qo0 != null) {
            qo0.mo13334b(i);
        }
    }

    /* renamed from: z */
    public final void mo9600z(C2891to toVar, C2409gp gpVar) {
    }
}
