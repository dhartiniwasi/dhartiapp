package p316oc;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p014b2.C1624e;
import p079k3.C4868e;
import p127r2.C5432a;
import p167x3.C6076z;
import p177z1.C6214e2;
import p177z1.C6259o;
import p177z1.C6265q2;
import p177z1.C6266q3;
import p177z1.C6272r1;
import p177z1.C6276s;
import p177z1.C6280t2;
import p177z1.C6282u2;
import p177z1.C6290v3;
import p177z1.C6293w2;
import p177z1.C6300z1;
import p186ac.C6544d;
import p264io.flutter.view.C11091f;

/* renamed from: oc.p */
/* compiled from: VideoPlayer */
final class C12103p {

    /* renamed from: a */
    private C6276s f45138a;

    /* renamed from: b */
    private Surface f45139b;

    /* renamed from: c */
    private final C11091f.C11094c f45140c;

    /* renamed from: d */
    private C12099o f45141d;

    /* renamed from: e */
    private final C6544d f45142e;

    /* renamed from: f */
    boolean f45143f = false;

    /* renamed from: g */
    private final C12106q f45144g;

    /* renamed from: oc.p$a */
    /* compiled from: VideoPlayer */
    class C12104a implements C6544d.C6549d {

        /* renamed from: a */
        final /* synthetic */ C12099o f45145a;

        C12104a(C12099o oVar) {
            this.f45145a = oVar;
        }

        /* renamed from: e */
        public void mo22145e(Object obj, C6544d.C6546b bVar) {
            this.f45145a.mo36500d(bVar);
        }

        /* renamed from: i */
        public void mo22146i(Object obj) {
            this.f45145a.mo36500d((C6544d.C6546b) null);
        }
    }

    /* renamed from: oc.p$b */
    /* compiled from: VideoPlayer */
    class C12105b implements C6282u2.C6287d {

        /* renamed from: a */
        private boolean f45147a = false;

        /* renamed from: b */
        final /* synthetic */ C12099o f45148b;

        C12105b(C12099o oVar) {
            this.f45148b = oVar;
        }

        /* renamed from: A */
        public /* synthetic */ void mo140A(boolean z) {
            C6293w2.m37122j(this, z);
        }

        /* renamed from: B */
        public /* synthetic */ void mo141B(int i) {
            C6293w2.m37131s(this, i);
        }

        /* renamed from: C */
        public /* synthetic */ void mo142C(C6266q3 q3Var, int i) {
            C6293w2.m37109A(this, q3Var, i);
        }

        /* renamed from: D */
        public /* synthetic */ void mo143D(boolean z) {
            C6293w2.m37120h(this, z);
        }

        /* renamed from: E */
        public void mo36511E(boolean z) {
            if (this.f45147a != z) {
                this.f45147a = z;
                HashMap hashMap = new HashMap();
                hashMap.put("event", this.f45147a ? "bufferingStart" : "bufferingEnd");
                this.f45148b.success(hashMap);
            }
        }

        /* renamed from: F */
        public /* synthetic */ void mo146F() {
            C6293w2.m37135w(this);
        }

        /* renamed from: H */
        public /* synthetic */ void mo149H(C6282u2 u2Var, C6282u2.C6286c cVar) {
            C6293w2.m37119g(this, u2Var, cVar);
        }

        /* renamed from: I */
        public /* synthetic */ void mo150I(float f) {
            C6293w2.m37112D(this, f);
        }

        /* renamed from: K */
        public void mo151K(int i) {
            if (i == 2) {
                mo36511E(true);
                C12103p.this.mo36506h();
            } else if (i == 3) {
                C12103p pVar = C12103p.this;
                if (!pVar.f45143f) {
                    pVar.f45143f = true;
                    pVar.mo36507i();
                }
            } else if (i == 4) {
                HashMap hashMap = new HashMap();
                hashMap.put("event", "completed");
                this.f45148b.success(hashMap);
            }
            if (i != 2) {
                mo36511E(false);
            }
        }

        /* renamed from: O */
        public /* synthetic */ void mo153O(boolean z) {
            C6293w2.m37136x(this, z);
        }

        /* renamed from: R */
        public /* synthetic */ void mo156R(C1624e eVar) {
            C6293w2.m37113a(this, eVar);
        }

        /* renamed from: S */
        public /* synthetic */ void mo157S(C6290v3 v3Var) {
            C6293w2.m37110B(this, v3Var);
        }

        /* renamed from: U */
        public void mo159U(C6265q2 q2Var) {
            mo36511E(false);
            C12099o oVar = this.f45148b;
            if (oVar != null) {
                oVar.error("VideoError", "Video player had error " + q2Var, (Object) null);
            }
        }

        /* renamed from: X */
        public /* synthetic */ void mo162X(C6282u2.C6288e eVar, C6282u2.C6288e eVar2, int i) {
            C6293w2.m37132t(this, eVar, eVar2, i);
        }

        /* renamed from: Z */
        public /* synthetic */ void mo165Z(int i, boolean z) {
            C6293w2.m37118f(this, i, z);
        }

        /* renamed from: a0 */
        public /* synthetic */ void mo166a0(boolean z, int i) {
            C6293w2.m37130r(this, z, i);
        }

        /* renamed from: b */
        public /* synthetic */ void mo167b(boolean z) {
            C6293w2.m37137y(this, z);
        }

        /* renamed from: b0 */
        public /* synthetic */ void mo168b0(C6300z1 z1Var, int i) {
            C6293w2.m37123k(this, z1Var, i);
        }

        /* renamed from: c0 */
        public /* synthetic */ void mo169c0(C6282u2.C6284b bVar) {
            C6293w2.m37114b(this, bVar);
        }

        /* renamed from: d0 */
        public /* synthetic */ void mo170d0() {
            C6293w2.m37133u(this);
        }

        /* renamed from: e0 */
        public /* synthetic */ void mo171e0(C6265q2 q2Var) {
            C6293w2.m37129q(this, q2Var);
        }

        /* renamed from: g */
        public /* synthetic */ void mo173g(C6280t2 t2Var) {
            C6293w2.m37127o(this, t2Var);
        }

        /* renamed from: h0 */
        public /* synthetic */ void mo175h0(C6214e2 e2Var) {
            C6293w2.m37124l(this, e2Var);
        }

        /* renamed from: j */
        public /* synthetic */ void mo177j(C4868e eVar) {
            C6293w2.m37116d(this, eVar);
        }

        /* renamed from: j0 */
        public /* synthetic */ void mo178j0(boolean z, int i) {
            C6293w2.m37126n(this, z, i);
        }

        /* renamed from: l0 */
        public /* synthetic */ void mo180l0(C6259o oVar) {
            C6293w2.m37117e(this, oVar);
        }

        /* renamed from: m0 */
        public /* synthetic */ void mo181m0(int i, int i2) {
            C6293w2.m37138z(this, i, i2);
        }

        /* renamed from: o */
        public /* synthetic */ void mo182o(C5432a aVar) {
            C6293w2.m37125m(this, aVar);
        }

        /* renamed from: p */
        public /* synthetic */ void mo184p(C6076z zVar) {
            C6293w2.m37111C(this, zVar);
        }

        /* renamed from: p0 */
        public /* synthetic */ void mo185p0(boolean z) {
            C6293w2.m37121i(this, z);
        }

        /* renamed from: s */
        public /* synthetic */ void mo186s(List list) {
            C6293w2.m37115c(this, list);
        }

        /* renamed from: y0 */
        public /* synthetic */ void mo187y0(int i) {
            C6293w2.m37134v(this, i);
        }

        /* renamed from: z */
        public /* synthetic */ void mo188z(int i) {
            C6293w2.m37128p(this, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: v3.t$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: v3.u$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: v3.t$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: v3.t$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: v3.t$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: v3.t$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C12103p(android.content.Context r2, p186ac.C6544d r3, p264io.flutter.view.C11091f.C11094c r4, java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, p316oc.C12106q r8) {
        /*
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f45143f = r0
            r1.f45142e = r3
            r1.f45140c = r4
            r1.f45144g = r8
            z1.s$b r3 = new z1.s$b
            r3.<init>(r2)
            z1.s r3 = r3.mo21532g()
            android.net.Uri r4 = android.net.Uri.parse(r5)
            boolean r5 = m58163d(r4)
            if (r5 == 0) goto L_0x003b
            v3.u$b r5 = new v3.u$b
            r5.<init>()
            java.lang.String r8 = "ExoPlayer"
            v3.u$b r5 = r5.mo20395e(r8)
            r8 = 1
            v3.u$b r5 = r5.mo20393c(r8)
            if (r7 == 0) goto L_0x0040
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x0040
            r5.mo20394d(r7)
            goto L_0x0040
        L_0x003b:
            v3.t$a r5 = new v3.t$a
            r5.<init>(r2)
        L_0x0040:
            b3.x r2 = r1.m58162a(r4, r5, r6, r2)
            r3.mo21160I(r2)
            r3.mo21159H()
            oc.o r2 = new oc.o
            r2.<init>()
            r1.m58165m(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p316oc.C12103p.<init>(android.content.Context, ac.d, io.flutter.view.f$c, java.lang.String, java.lang.String, java.util.Map, oc.q):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p015b3.C1772x m58162a(android.net.Uri r7, p155v3.C5828l.C5829a r8, java.lang.String r9, android.content.Context r10) {
        /*
            r6 = this;
            r0 = 4
            r1 = 0
            r2 = -1
            r3 = 2
            r4 = 1
            if (r9 != 0) goto L_0x000c
            int r1 = p161w3.C5953m0.m35147n0(r7)
            goto L_0x004a
        L_0x000c:
            int r5 = r9.hashCode()
            switch(r5) {
                case 3680: goto L_0x0036;
                case 103407: goto L_0x002b;
                case 3075986: goto L_0x0020;
                case 106069776: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            r9 = -1
            goto L_0x0040
        L_0x0015:
            java.lang.String r5 = "other"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x001e
            goto L_0x0013
        L_0x001e:
            r9 = 3
            goto L_0x0040
        L_0x0020:
            java.lang.String r5 = "dash"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x0029
            goto L_0x0013
        L_0x0029:
            r9 = 2
            goto L_0x0040
        L_0x002b:
            java.lang.String r5 = "hls"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x0034
            goto L_0x0013
        L_0x0034:
            r9 = 1
            goto L_0x0040
        L_0x0036:
            java.lang.String r5 = "ss"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x003f
            goto L_0x0013
        L_0x003f:
            r9 = 0
        L_0x0040:
            switch(r9) {
                case 0: goto L_0x0049;
                case 1: goto L_0x0047;
                case 2: goto L_0x004a;
                case 3: goto L_0x0045;
                default: goto L_0x0043;
            }
        L_0x0043:
            r1 = -1
            goto L_0x004a
        L_0x0045:
            r1 = 4
            goto L_0x004a
        L_0x0047:
            r1 = 2
            goto L_0x004a
        L_0x0049:
            r1 = 1
        L_0x004a:
            if (r1 == 0) goto L_0x009d
            if (r1 == r4) goto L_0x0085
            if (r1 == r3) goto L_0x0077
            if (r1 != r0) goto L_0x0060
            b3.l0$b r9 = new b3.l0$b
            r9.<init>(r8)
            z1.z1 r7 = p177z1.C6300z1.m37171d(r7)
            b3.l0 r7 = r9.mo6791b(r7)
            return r7
        L_0x0060:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unsupported type: "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0077:
            com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory r9 = new com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
            r9.<init>((p155v3.C5828l.C5829a) r8)
            z1.z1 r7 = p177z1.C6300z1.m37171d(r7)
            com.google.android.exoplayer2.source.hls.HlsMediaSource r7 = r9.mo7791a(r7)
            return r7
        L_0x0085:
            com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory r9 = new com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory
            com.google.android.exoplayer2.source.smoothstreaming.a$a r0 = new com.google.android.exoplayer2.source.smoothstreaming.a$a
            r0.<init>(r8)
            v3.t$a r1 = new v3.t$a
            r1.<init>(r10, r8)
            r9.<init>(r0, r1)
            z1.z1 r7 = p177z1.C6300z1.m37171d(r7)
            com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource r7 = r9.mo7795a(r7)
            return r7
        L_0x009d:
            com.google.android.exoplayer2.source.dash.DashMediaSource$Factory r9 = new com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
            com.google.android.exoplayer2.source.dash.c$a r0 = new com.google.android.exoplayer2.source.dash.c$a
            r0.<init>(r8)
            v3.t$a r1 = new v3.t$a
            r1.<init>(r10, r8)
            r9.<init>(r0, r1)
            z1.z1 r7 = p177z1.C6300z1.m37171d(r7)
            com.google.android.exoplayer2.source.dash.DashMediaSource r7 = r9.mo7731a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p316oc.C12103p.m58162a(android.net.Uri, v3.l$a, java.lang.String, android.content.Context):b3.x");
    }

    /* renamed from: d */
    private static boolean m58163d(Uri uri) {
        if (uri == null || uri.getScheme() == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme.equals("http") || scheme.equals("https")) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static void m58164j(C6276s sVar, boolean z) {
        sVar.mo21158F(new C1624e.C1629e().mo6462c(3).mo6460a(), !z);
    }

    /* renamed from: m */
    private void m58165m(C6276s sVar, C12099o oVar) {
        this.f45138a = sVar;
        this.f45141d = oVar;
        this.f45142e.mo22141d(new C12104a(oVar));
        Surface surface = new Surface(this.f45140c.mo34885c());
        this.f45139b = surface;
        sVar.mo21169b(surface);
        m58164j(sVar, this.f45144g.f45150a);
        sVar.mo21187l(new C12105b(oVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36501b() {
        if (this.f45143f) {
            this.f45138a.stop();
        }
        this.f45140c.mo34883a();
        this.f45142e.mo22141d((C6544d.C6549d) null);
        Surface surface = this.f45139b;
        if (surface != null) {
            surface.release();
        }
        C6276s sVar = this.f45138a;
        if (sVar != null) {
            sVar.mo21168a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo36502c() {
        return this.f45138a.getCurrentPosition();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo36503e() {
        this.f45138a.mo21190q(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo36504f() {
        this.f45138a.mo21190q(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo36505g(int i) {
        this.f45138a.mo21247t0((long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo36506h() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "bufferingUpdate");
        hashMap.put("values", Collections.singletonList(Arrays.asList(new Number[]{0, Long.valueOf(this.f45138a.mo21192s())})));
        this.f45141d.success(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo36507i() {
        if (this.f45143f) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "initialized");
            hashMap.put("duration", Long.valueOf(this.f45138a.getDuration()));
            if (this.f45138a.mo21195v() != null) {
                C6272r1 v = this.f45138a.mo21195v();
                int i = v.f30248y;
                int i2 = v.f30249z;
                int i3 = v.f30219B;
                if (i3 == 90 || i3 == 270) {
                    i = this.f45138a.mo21195v().f30249z;
                    i2 = this.f45138a.mo21195v().f30248y;
                }
                hashMap.put("width", Integer.valueOf(i));
                hashMap.put("height", Integer.valueOf(i2));
                if (i3 == 180) {
                    hashMap.put("rotationCorrection", Integer.valueOf(i3));
                }
            }
            this.f45141d.success(hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo36508k(boolean z) {
        this.f45138a.mo21163Q(z ? 2 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo36509l(double d) {
        this.f45138a.mo21171c(new C6280t2((float) d));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo36510n(double d) {
        this.f45138a.setVolume((float) Math.max(0.0d, Math.min(1.0d, d)));
    }
}
