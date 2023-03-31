package p361tc;

import java.util.List;
import p182a7.C6431n;
import p187ad.C6574c;
import p187ad.C6575d;
import p199c7.C6765a;
import p264io.grpc.internal.C11100a;
import p264io.grpc.internal.C11255i2;
import p264io.grpc.internal.C11310o2;
import p264io.grpc.internal.C11328p2;
import p264io.grpc.internal.C11333r;
import p264io.grpc.internal.C11370u0;
import p336qe.C12231c;
import p343rc.C12271a;
import p343rc.C12292c;
import p343rc.C12335j1;
import p343rc.C12411y0;
import p343rc.C12423z0;
import p361tc.C12632q;
import p381vc.C12870a;
import p381vc.C12874d;

/* renamed from: tc.h */
/* compiled from: OkHttpClientStream */
class C12612h extends C11100a {
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C12231c f46248p = new C12231c();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12423z0<?, ?> f46249h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f46250i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11255i2 f46251j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f46252k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C12614b f46253l;

    /* renamed from: m */
    private final C12613a f46254m;

    /* renamed from: n */
    private final C12271a f46255n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f46256o;

    /* renamed from: tc.h$a */
    /* compiled from: OkHttpClientStream */
    class C12613a implements C11100a.C11102b {
        C12613a() {
        }

        /* renamed from: c */
        public void mo34918c(C12335j1 j1Var) {
            C6574c.m38140f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (C12612h.this.f46253l.f46274z) {
                    C12612h.this.f46253l.m59978a0(j1Var, true, (C12411y0) null);
                }
                C6574c.m38142h("OkHttpClientStream$Sink.cancel");
            } catch (Throwable th) {
                C6574c.m38142h("OkHttpClientStream$Sink.cancel");
                throw th;
            }
        }

        /* renamed from: d */
        public void mo34919d(C12411y0 y0Var, byte[] bArr) {
            C6574c.m38140f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + C12612h.this.f46249h.mo37189c();
            if (bArr != null) {
                boolean unused = C12612h.this.f46256o = true;
                str = str + "?" + C6765a.m38680a().mo22690e(bArr);
            }
            try {
                synchronized (C12612h.this.f46253l.f46274z) {
                    C12612h.this.f46253l.m59981g0(y0Var, str);
                }
                C6574c.m38142h("OkHttpClientStream$Sink.writeHeaders");
            } catch (Throwable th) {
                C6574c.m38142h("OkHttpClientStream$Sink.writeHeaders");
                throw th;
            }
        }

        /* renamed from: e */
        public void mo34920e(C11328p2 p2Var, boolean z, boolean z2, int i) {
            C12231c cVar;
            C6574c.m38140f("OkHttpClientStream$Sink.writeFrame");
            if (p2Var == null) {
                cVar = C12612h.f46248p;
            } else {
                cVar = ((C12630o) p2Var).mo37516b();
                int I = (int) cVar.mo36771I();
                if (I > 0) {
                    C12612h.this.mo35013s(I);
                }
            }
            try {
                synchronized (C12612h.this.f46253l.f46274z) {
                    C12612h.this.f46253l.m59980e0(cVar, z, z2);
                    C12612h.this.mo34909w().mo35280e(i);
                }
                C6574c.m38142h("OkHttpClientStream$Sink.writeFrame");
            } catch (Throwable th) {
                C6574c.m38142h("OkHttpClientStream$Sink.writeFrame");
                throw th;
            }
        }
    }

    /* renamed from: tc.h$b */
    /* compiled from: OkHttpClientStream */
    class C12614b extends C11370u0 implements C12632q.C12634b {

        /* renamed from: A */
        private List<C12874d> f46258A;

        /* renamed from: B */
        private C12231c f46259B = new C12231c();

        /* renamed from: C */
        private boolean f46260C = false;

        /* renamed from: D */
        private boolean f46261D = false;

        /* renamed from: E */
        private boolean f46262E = false;

        /* renamed from: F */
        private int f46263F;

        /* renamed from: G */
        private int f46264G;

        /* renamed from: H */
        private final C12598b f46265H;

        /* renamed from: I */
        private final C12632q f46266I;

        /* renamed from: J */
        private final C12615i f46267J;

        /* renamed from: K */
        private boolean f46268K = true;

        /* renamed from: L */
        private final C6575d f46269L;

        /* renamed from: M */
        private C12632q.C12635c f46270M;

        /* renamed from: N */
        private int f46271N = -1;

        /* renamed from: y */
        private final int f46273y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public final Object f46274z;

        public C12614b(int i, C11255i2 i2Var, Object obj, C12598b bVar, C12632q qVar, C12615i iVar, int i2, String str) {
            super(i, i2Var, C12612h.this.mo34909w());
            this.f46274z = C6431n.m37562o(obj, "lock");
            this.f46265H = bVar;
            this.f46266I = qVar;
            this.f46267J = iVar;
            this.f46263F = i2;
            this.f46264G = i2;
            this.f46273y = i2;
            this.f46269L = C6574c.m38135a(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a0 */
        public void m59978a0(C12335j1 j1Var, boolean z, C12411y0 y0Var) {
            if (!this.f46262E) {
                this.f46262E = true;
                if (this.f46268K) {
                    this.f46267J.mo37486h0(C12612h.this);
                    this.f46258A = null;
                    this.f46259B.mo36786a();
                    this.f46268K = false;
                    if (y0Var == null) {
                        y0Var = new C12411y0();
                    }
                    mo34928N(j1Var, true, y0Var);
                    return;
                }
                this.f46267J.mo37477U(mo37471c0(), j1Var, C11333r.C11334a.PROCESSED, z, C12870a.CANCEL, y0Var);
            }
        }

        /* renamed from: d0 */
        private void m59979d0() {
            if (!mo34924G()) {
                this.f46267J.mo37477U(mo37471c0(), (C12335j1) null, C11333r.C11334a.PROCESSED, false, C12870a.CANCEL, (C12411y0) null);
            } else {
                this.f46267J.mo37477U(mo37471c0(), (C12335j1) null, C11333r.C11334a.PROCESSED, false, (C12870a) null, (C12411y0) null);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: e0 */
        public void m59980e0(C12231c cVar, boolean z, boolean z2) {
            if (!this.f46262E) {
                if (this.f46268K) {
                    this.f46259B.mo35694k1(cVar, (long) ((int) cVar.mo36771I()));
                    this.f46260C |= z;
                    this.f46261D |= z2;
                    return;
                }
                C6431n.m37568u(mo37471c0() != -1, "streamId should be set");
                this.f46266I.mo37518d(z, this.f46270M, cVar, z2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: g0 */
        public void m59981g0(C12411y0 y0Var, String str) {
            this.f46258A = C12601d.m59929b(y0Var, str, C12612h.this.f46252k, C12612h.this.f46250i, C12612h.this.f46256o, this.f46267J.mo37483b0());
            this.f46267J.mo37487o0(C12612h.this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo35357P(C12335j1 j1Var, boolean z, C12411y0 y0Var) {
            m59978a0(j1Var, z, y0Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b0 */
        public C12632q.C12635c mo37470b0() {
            C12632q.C12635c cVar;
            synchronized (this.f46274z) {
                cVar = this.f46270M;
            }
            return cVar;
        }

        /* renamed from: c */
        public void mo34929c(boolean z) {
            m59979d0();
            super.mo34929c(z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public int mo37471c0() {
            return this.f46271N;
        }

        /* renamed from: d */
        public void mo35069d(int i) {
            int i2 = this.f46264G - i;
            this.f46264G = i2;
            int i3 = this.f46273y;
            if (((float) i2) <= ((float) i3) * 0.5f) {
                int i4 = i3 - i2;
                this.f46263F += i4;
                this.f46264G = i2 + i4;
                this.f46265H.mo37447c(mo37471c0(), (long) i4);
            }
        }

        /* renamed from: e */
        public void mo35070e(Throwable th) {
            mo35357P(C12335j1.m59105k(th), true, new C12411y0());
        }

        /* renamed from: f */
        public void mo35075f(Runnable runnable) {
            synchronized (this.f46274z) {
                runnable.run();
            }
        }

        /* renamed from: f0 */
        public void mo37472f0(int i) {
            C6431n.m37569v(this.f46271N == -1, "the stream has been started with id %s", i);
            this.f46271N = i;
            this.f46270M = this.f46266I.mo37517c(this, i);
            C12612h.this.f46253l.mo35019r();
            if (this.f46268K) {
                this.f46265H.mo37451w1(C12612h.this.f46256o, false, this.f46271N, 0, this.f46258A);
                C12612h.this.f46251j.mo35195c();
                this.f46258A = null;
                if (this.f46259B.mo36771I() > 0) {
                    this.f46266I.mo37518d(this.f46260C, this.f46270M, this.f46259B, this.f46261D);
                }
                this.f46268K = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h0 */
        public C6575d mo37473h0() {
            return this.f46269L;
        }

        /* renamed from: i0 */
        public void mo37474i0(C12231c cVar, boolean z) {
            int I = this.f46263F - ((int) cVar.mo36771I());
            this.f46263F = I;
            if (I < 0) {
                this.f46265H.mo37441r(mo37471c0(), C12870a.FLOW_CONTROL_ERROR);
                this.f46267J.mo37477U(mo37471c0(), C12335j1.f45620t.mo37030q("Received data size exceeded our receiving window size"), C11333r.C11334a.PROCESSED, false, (C12870a) null, (C12411y0) null);
                return;
            }
            super.mo35358S(new C12627l(cVar), z);
        }

        /* renamed from: j0 */
        public void mo37475j0(List<C12874d> list, boolean z) {
            if (z) {
                mo35360U(C12638r.m60147c(list));
            } else {
                mo35359T(C12638r.m60145a(list));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo35019r() {
            super.mo35019r();
            mo35018m().mo35278c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C12612h(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12598b bVar, C12615i iVar, C12632q qVar, Object obj, int i, int i2, String str, String str2, C11255i2 i2Var, C11310o2 o2Var, C12292c cVar, boolean z) {
        super(new C12631p(), i2Var, o2Var, y0Var, cVar, z && z0Var.mo37192f());
        this.f46254m = new C12613a();
        this.f46256o = false;
        C11255i2 i2Var2 = i2Var;
        this.f46251j = (C11255i2) C6431n.m37562o(i2Var2, "statsTraceCtx");
        this.f46249h = z0Var;
        this.f46252k = str;
        this.f46250i = str2;
        this.f46255n = iVar.mo37478V();
        this.f46253l = new C12614b(i, i2Var2, obj, bVar, qVar, iVar, i2, z0Var.mo37189c());
    }

    /* renamed from: L */
    public C12423z0.C12427d mo37466L() {
        return this.f46249h.mo37191e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C12614b mo34911y() {
        return this.f46253l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo37468N() {
        return this.f46256o;
    }

    /* renamed from: f */
    public void mo34953f(String str) {
        this.f46252k = (String) C6431n.m37562o(str, "authority");
    }

    /* renamed from: j */
    public C12271a mo35294j() {
        return this.f46255n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public C12613a mo34908u() {
        return this.f46254m;
    }
}
