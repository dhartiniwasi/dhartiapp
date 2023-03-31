package p177z1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p004a2.C0010a;
import p004a2.C0016c;
import p004a2.C0070s1;
import p004a2.C0079u1;
import p014b2.C1624e;
import p014b2.C1641h;
import p014b2.C1658s;
import p015b3.C1757s0;
import p015b3.C1772x;
import p015b3.C1780z0;
import p021c2.C1846e;
import p021c2.C1852i;
import p079k3.C4864b;
import p079k3.C4868e;
import p079k3.C4881n;
import p127r2.C5432a;
import p127r2.C5440f;
import p149u3.C5717b0;
import p149u3.C5720c0;
import p155v3.C5798f;
import p161w3.C5917a;
import p161w3.C5922c0;
import p161w3.C5923d;
import p161w3.C5933g;
import p161w3.C5948l;
import p161w3.C5953m0;
import p161w3.C5954n;
import p161w3.C5957q;
import p161w3.C5961r;
import p167x3.C6065j;
import p167x3.C6073m;
import p167x3.C6074x;
import p167x3.C6076z;
import p173y3.C6132a;
import p173y3.C6136f;
import p177z1.C6197b;
import p177z1.C6208d;
import p177z1.C6239l2;
import p177z1.C6244l3;
import p177z1.C6250n1;
import p177z1.C6266q3;
import p177z1.C6276s;
import p177z1.C6282u2;
import p177z1.C6297y2;
import p190b7.C6685q;

/* renamed from: z1.b1 */
/* compiled from: ExoPlayerImpl */
final class C6200b1 extends C6213e implements C6276s {

    /* renamed from: A */
    private final C6208d f29761A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C6244l3 f29762B;

    /* renamed from: C */
    private final C6294w3 f29763C;

    /* renamed from: D */
    private final C6296x3 f29764D;

    /* renamed from: E */
    private final long f29765E;

    /* renamed from: F */
    private int f29766F;

    /* renamed from: G */
    private boolean f29767G;

    /* renamed from: H */
    private int f29768H;

    /* renamed from: I */
    private int f29769I;

    /* renamed from: J */
    private boolean f29770J;

    /* renamed from: K */
    private int f29771K;

    /* renamed from: L */
    private C6229i3 f29772L;

    /* renamed from: M */
    private C1757s0 f29773M;

    /* renamed from: N */
    private boolean f29774N;

    /* renamed from: O */
    private C6282u2.C6284b f29775O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C6214e2 f29776P;

    /* renamed from: Q */
    private C6214e2 f29777Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C6272r1 f29778R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C6272r1 f29779S;

    /* renamed from: T */
    private AudioTrack f29780T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public Object f29781U;

    /* renamed from: V */
    private Surface f29782V;

    /* renamed from: W */
    private SurfaceHolder f29783W;

    /* renamed from: X */
    private C6136f f29784X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f29785Y;

    /* renamed from: Z */
    private TextureView f29786Z;

    /* renamed from: a0 */
    private int f29787a0;

    /* renamed from: b */
    final C5720c0 f29788b;

    /* renamed from: b0 */
    private int f29789b0;

    /* renamed from: c */
    final C6282u2.C6284b f29790c;

    /* renamed from: c0 */
    private int f29791c0;

    /* renamed from: d */
    private final C5933g f29792d;

    /* renamed from: d0 */
    private int f29793d0;

    /* renamed from: e */
    private final Context f29794e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C1846e f29795e0;

    /* renamed from: f */
    private final C6282u2 f29796f;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public C1846e f29797f0;

    /* renamed from: g */
    private final C6211d3[] f29798g;

    /* renamed from: g0 */
    private int f29799g0;

    /* renamed from: h */
    private final C5717b0 f29800h;

    /* renamed from: h0 */
    private C1624e f29801h0;

    /* renamed from: i */
    private final C5954n f29802i;

    /* renamed from: i0 */
    private float f29803i0;

    /* renamed from: j */
    private final C6250n1.C6256f f29804j;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public boolean f29805j0;

    /* renamed from: k */
    private final C6250n1 f29806k;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C4868e f29807k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C5957q<C6282u2.C6287d> f29808l;

    /* renamed from: l0 */
    private boolean f29809l0;

    /* renamed from: m */
    private final CopyOnWriteArraySet<C6276s.C6277a> f29810m;

    /* renamed from: m0 */
    private boolean f29811m0;

    /* renamed from: n */
    private final C6266q3.C6268b f29812n;

    /* renamed from: n0 */
    private C5922c0 f29813n0;

    /* renamed from: o */
    private final List<C6205e> f29814o;

    /* renamed from: o0 */
    private boolean f29815o0;

    /* renamed from: p */
    private final boolean f29816p;

    /* renamed from: p0 */
    private boolean f29817p0;

    /* renamed from: q */
    private final C1772x.C1773a f29818q;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public C6259o f29819q0;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C0010a f29820r;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C6076z f29821r0;

    /* renamed from: s */
    private final Looper f29822s;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public C6214e2 f29823s0;

    /* renamed from: t */
    private final C5798f f29824t;

    /* renamed from: t0 */
    private C6275r2 f29825t0;

    /* renamed from: u */
    private final long f29826u;

    /* renamed from: u0 */
    private int f29827u0;

    /* renamed from: v */
    private final long f29828v;

    /* renamed from: v0 */
    private int f29829v0;

    /* renamed from: w */
    private final C5923d f29830w;

    /* renamed from: w0 */
    private long f29831w0;

    /* renamed from: x */
    private final C6203c f29832x;

    /* renamed from: y */
    private final C6204d f29833y;

    /* renamed from: z */
    private final C6197b f29834z;

    /* renamed from: z1.b1$b */
    /* compiled from: ExoPlayerImpl */
    private static final class C6202b {
        /* renamed from: a */
        public static C0079u1 m36239a(Context context, C6200b1 b1Var, boolean z) {
            C0070s1 B0 = C0070s1.m453B0(context);
            if (B0 == null) {
                C5961r.m35215i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new C0079u1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                b1Var.mo21164T0(B0);
            }
            return new C0079u1(B0.mo209I0());
        }
    }

    /* renamed from: z1.b1$c */
    /* compiled from: ExoPlayerImpl */
    private final class C6203c implements C6074x, C1658s, C4881n, C5440f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C6136f.C6137a, C6208d.C6210b, C6197b.C6199b, C6244l3.C6246b, C6276s.C6277a {
        private C6203c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: R */
        public /* synthetic */ void m36250R(C6282u2.C6287d dVar) {
            dVar.mo175h0(C6200b1.this.f29776P);
        }

        /* renamed from: A */
        public void mo21199A(float f) {
            C6200b1.this.m36135W1();
        }

        /* renamed from: B */
        public void mo21200B(int i) {
            boolean i2 = C6200b1.this.mo21183i();
            C6200b1.this.m36156f2(i2, i, C6200b1.m36161h1(i2, i));
        }

        /* renamed from: C */
        public void mo20994C(Surface surface) {
            C6200b1.this.m36147b2((Object) null);
        }

        /* renamed from: D */
        public void mo21201D(int i, boolean z) {
            C6200b1.this.f29808l.mo20650k(30, new C13381c1(i, z));
        }

        /* renamed from: E */
        public /* synthetic */ void mo21202E(boolean z) {
            C6271r.m36897a(this, z);
        }

        /* renamed from: F */
        public /* synthetic */ void mo20850F(C6272r1 r1Var) {
            C6073m.m35632a(this, r1Var);
        }

        /* renamed from: G */
        public /* synthetic */ void mo6547G(C6272r1 r1Var) {
            C1641h.m7541a(this, r1Var);
        }

        /* renamed from: a */
        public void mo21203a(int i) {
            C6259o H0 = C6200b1.m36137X0(C6200b1.this.f29762B);
            if (!H0.equals(C6200b1.this.f29819q0)) {
                C6259o unused = C6200b1.this.f29819q0 = H0;
                C6200b1.this.f29808l.mo20650k(29, new C13393h1(H0));
            }
        }

        /* renamed from: b */
        public void mo6548b(boolean z) {
            if (C6200b1.this.f29805j0 != z) {
                boolean unused = C6200b1.this.f29805j0 = z;
                C6200b1.this.f29808l.mo20650k(23, new C13398j1(z));
            }
        }

        /* renamed from: c */
        public void mo6549c(Exception exc) {
            C6200b1.this.f29820r.mo38c(exc);
        }

        /* renamed from: d */
        public void mo6550d(C6272r1 r1Var, C1852i iVar) {
            C6272r1 unused = C6200b1.this.f29779S = r1Var;
            C6200b1.this.f29820r.mo39d(r1Var, iVar);
        }

        /* renamed from: e */
        public void mo6551e(C1846e eVar) {
            C1846e unused = C6200b1.this.f29797f0 = eVar;
            C6200b1.this.f29820r.mo40e(eVar);
        }

        /* renamed from: f */
        public void mo20851f(String str) {
            C6200b1.this.f29820r.mo41f(str);
        }

        /* renamed from: g */
        public void mo21153g() {
            C6200b1.this.m36156f2(false, -1, 3);
        }

        /* renamed from: h */
        public void mo20852h(String str, long j, long j2) {
            C6200b1.this.f29820r.mo42h(str, j, j2);
        }

        /* renamed from: i */
        public void mo20853i(C1846e eVar) {
            C6200b1.this.f29820r.mo43i(eVar);
            C6272r1 unused = C6200b1.this.f29778R = null;
            C1846e unused2 = C6200b1.this.f29795e0 = null;
        }

        /* renamed from: j */
        public void mo18660j(C4868e eVar) {
            C4868e unused = C6200b1.this.f29807k0 = eVar;
            C6200b1.this.f29808l.mo20650k(27, new C13387e1(eVar));
        }

        /* renamed from: k */
        public void mo20854k(C6272r1 r1Var, C1852i iVar) {
            C6272r1 unused = C6200b1.this.f29778R = r1Var;
            C6200b1.this.f29820r.mo44k(r1Var, iVar);
        }

        /* renamed from: l */
        public void mo6552l(String str) {
            C6200b1.this.f29820r.mo45l(str);
        }

        /* renamed from: m */
        public void mo6553m(String str, long j, long j2) {
            C6200b1.this.f29820r.mo46m(str, j, j2);
        }

        /* renamed from: n */
        public void mo20855n(int i, long j) {
            C6200b1.this.f29820r.mo47n(i, j);
        }

        /* renamed from: o */
        public void mo19709o(C5432a aVar) {
            C6200b1 b1Var = C6200b1.this;
            C6214e2 unused = b1Var.f29823s0 = b1Var.f29823s0.mo21250b().mo21257J(aVar).mo21253F();
            C6214e2 w0 = C6200b1.this.m36134W0();
            if (!w0.equals(C6200b1.this.f29776P)) {
                C6214e2 unused2 = C6200b1.this.f29776P = w0;
                C6200b1.this.f29808l.mo20648i(14, new C13396i1(this));
            }
            C6200b1.this.f29808l.mo20648i(28, new C13389f1(aVar));
            C6200b1.this.f29808l.mo20647f();
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C6200b1.this.m36145a2(surfaceTexture);
            C6200b1.this.m36119Q1(i, i2);
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C6200b1.this.m36147b2((Object) null);
            C6200b1.this.m36119Q1(0, 0);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C6200b1.this.m36119Q1(i, i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        /* renamed from: p */
        public void mo20856p(C6076z zVar) {
            C6076z unused = C6200b1.this.f29821r0 = zVar;
            C6200b1.this.f29808l.mo20650k(25, new C13391g1(zVar));
        }

        /* renamed from: q */
        public void mo20857q(Object obj, long j) {
            C6200b1.this.f29820r.mo49q(obj, j);
            if (C6200b1.this.f29781U == obj) {
                C6200b1.this.f29808l.mo20650k(26, C13401k1.f47737a);
            }
        }

        /* renamed from: r */
        public void mo20858r(C1846e eVar) {
            C1846e unused = C6200b1.this.f29795e0 = eVar;
            C6200b1.this.f29820r.mo50r(eVar);
        }

        /* renamed from: s */
        public void mo18661s(List<C4864b> list) {
            C6200b1.this.f29808l.mo20650k(27, new C13384d1(list));
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C6200b1.this.m36119Q1(i2, i3);
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C6200b1.this.f29785Y) {
                C6200b1.this.m36147b2(surfaceHolder.getSurface());
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C6200b1.this.f29785Y) {
                C6200b1.this.m36147b2((Object) null);
            }
            C6200b1.this.m36119Q1(0, 0);
        }

        /* renamed from: t */
        public void mo6554t(long j) {
            C6200b1.this.f29820r.mo51t(j);
        }

        /* renamed from: u */
        public void mo6555u(Exception exc) {
            C6200b1.this.f29820r.mo52u(exc);
        }

        /* renamed from: v */
        public void mo20859v(Exception exc) {
            C6200b1.this.f29820r.mo53v(exc);
        }

        /* renamed from: w */
        public void mo6556w(int i, long j, long j2) {
            C6200b1.this.f29820r.mo54w(i, j, j2);
        }

        /* renamed from: x */
        public void mo6557x(C1846e eVar) {
            C6200b1.this.f29820r.mo55x(eVar);
            C6272r1 unused = C6200b1.this.f29779S = null;
            C1846e unused2 = C6200b1.this.f29797f0 = null;
        }

        /* renamed from: y */
        public void mo20860y(long j, int i) {
            C6200b1.this.f29820r.mo56y(j, i);
        }

        /* renamed from: z */
        public void mo21211z(boolean z) {
            C6200b1.this.m36164i2();
        }
    }

    /* renamed from: z1.b1$d */
    /* compiled from: ExoPlayerImpl */
    private static final class C6204d implements C6065j, C6132a, C6297y2.C6299b {

        /* renamed from: a */
        private C6065j f29836a;

        /* renamed from: b */
        private C6132a f29837b;

        /* renamed from: c */
        private C6065j f29838c;

        /* renamed from: d */
        private C6132a f29839d;

        private C6204d() {
        }

        /* renamed from: a */
        public void mo20830a(long j, long j2, C6272r1 r1Var, MediaFormat mediaFormat) {
            C6065j jVar = this.f29838c;
            if (jVar != null) {
                jVar.mo20830a(j, j2, r1Var, mediaFormat);
            }
            C6065j jVar2 = this.f29836a;
            if (jVar2 != null) {
                jVar2.mo20830a(j, j2, r1Var, mediaFormat);
            }
        }

        /* renamed from: c */
        public void mo20983c(long j, float[] fArr) {
            C6132a aVar = this.f29839d;
            if (aVar != null) {
                aVar.mo20983c(j, fArr);
            }
            C6132a aVar2 = this.f29837b;
            if (aVar2 != null) {
                aVar2.mo20983c(j, fArr);
            }
        }

        /* renamed from: e */
        public void mo20984e() {
            C6132a aVar = this.f29839d;
            if (aVar != null) {
                aVar.mo20984e();
            }
            C6132a aVar2 = this.f29837b;
            if (aVar2 != null) {
                aVar2.mo20984e();
            }
        }

        /* renamed from: r */
        public void mo6490r(int i, Object obj) {
            if (i == 7) {
                this.f29836a = (C6065j) obj;
            } else if (i == 8) {
                this.f29837b = (C6132a) obj;
            } else if (i == 10000) {
                C6136f fVar = (C6136f) obj;
                if (fVar == null) {
                    this.f29838c = null;
                    this.f29839d = null;
                    return;
                }
                this.f29838c = fVar.getVideoFrameMetadataListener();
                this.f29839d = fVar.getCameraMotionListener();
            }
        }
    }

    /* renamed from: z1.b1$e */
    /* compiled from: ExoPlayerImpl */
    private static final class C6205e implements C6233j2 {

        /* renamed from: a */
        private final Object f29840a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C6266q3 f29841b;

        public C6205e(Object obj, C6266q3 q3Var) {
            this.f29840a = obj;
            this.f29841b = q3Var;
        }

        /* renamed from: a */
        public C6266q3 mo21212a() {
            return this.f29841b;
        }

        /* renamed from: b */
        public Object mo21213b() {
            return this.f29840a;
        }
    }

    static {
        C6260o1.m36802a("goog.exo.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r40v0, types: [z1.u2] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6200b1(p177z1.C6276s.C6278b r39, p177z1.C6282u2 r40) {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r38.<init>()
            w3.g r2 = new w3.g
            r2.<init>()
            r1.f29792d = r2
            java.lang.String r3 = "ExoPlayerImpl"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0349 }
            r4.<init>()     // Catch:{ all -> 0x0349 }
            java.lang.String r5 = "Init "
            r4.append(r5)     // Catch:{ all -> 0x0349 }
            int r5 = java.lang.System.identityHashCode(r38)     // Catch:{ all -> 0x0349 }
            java.lang.String r5 = java.lang.Integer.toHexString(r5)     // Catch:{ all -> 0x0349 }
            r4.append(r5)     // Catch:{ all -> 0x0349 }
            java.lang.String r5 = " ["
            r4.append(r5)     // Catch:{ all -> 0x0349 }
            java.lang.String r5 = "ExoPlayerLib/2.18.1"
            r4.append(r5)     // Catch:{ all -> 0x0349 }
            java.lang.String r5 = "] ["
            r4.append(r5)     // Catch:{ all -> 0x0349 }
            java.lang.String r5 = p161w3.C5953m0.f29114e     // Catch:{ all -> 0x0349 }
            r4.append(r5)     // Catch:{ all -> 0x0349 }
            java.lang.String r5 = "]"
            r4.append(r5)     // Catch:{ all -> 0x0349 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0349 }
            p161w3.C5961r.m35212f(r3, r4)     // Catch:{ all -> 0x0349 }
            android.content.Context r3 = r0.f30301a     // Catch:{ all -> 0x0349 }
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0349 }
            r1.f29794e = r3     // Catch:{ all -> 0x0349 }
            a7.f<w3.d, a2.a> r4 = r0.f30309i     // Catch:{ all -> 0x0349 }
            w3.d r5 = r0.f30302b     // Catch:{ all -> 0x0349 }
            java.lang.Object r4 = r4.apply(r5)     // Catch:{ all -> 0x0349 }
            a2.a r4 = (p004a2.C0010a) r4     // Catch:{ all -> 0x0349 }
            r1.f29820r = r4     // Catch:{ all -> 0x0349 }
            w3.c0 r5 = r0.f30311k     // Catch:{ all -> 0x0349 }
            r1.f29813n0 = r5     // Catch:{ all -> 0x0349 }
            b2.e r5 = r0.f30312l     // Catch:{ all -> 0x0349 }
            r1.f29801h0 = r5     // Catch:{ all -> 0x0349 }
            int r5 = r0.f30317q     // Catch:{ all -> 0x0349 }
            r1.f29787a0 = r5     // Catch:{ all -> 0x0349 }
            int r5 = r0.f30318r     // Catch:{ all -> 0x0349 }
            r1.f29789b0 = r5     // Catch:{ all -> 0x0349 }
            boolean r5 = r0.f30316p     // Catch:{ all -> 0x0349 }
            r1.f29805j0 = r5     // Catch:{ all -> 0x0349 }
            long r5 = r0.f30325y     // Catch:{ all -> 0x0349 }
            r1.f29765E = r5     // Catch:{ all -> 0x0349 }
            z1.b1$c r15 = new z1.b1$c     // Catch:{ all -> 0x0349 }
            r14 = 0
            r15.<init>()     // Catch:{ all -> 0x0349 }
            r1.f29832x = r15     // Catch:{ all -> 0x0349 }
            z1.b1$d r13 = new z1.b1$d     // Catch:{ all -> 0x0349 }
            r13.<init>()     // Catch:{ all -> 0x0349 }
            r1.f29833y = r13     // Catch:{ all -> 0x0349 }
            android.os.Handler r6 = new android.os.Handler     // Catch:{ all -> 0x0349 }
            android.os.Looper r5 = r0.f30310j     // Catch:{ all -> 0x0349 }
            r6.<init>(r5)     // Catch:{ all -> 0x0349 }
            a7.t<z1.h3> r5 = r0.f30304d     // Catch:{ all -> 0x0349 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0349 }
            r7 = r5
            z1.h3 r7 = (p177z1.C6226h3) r7     // Catch:{ all -> 0x0349 }
            r8 = r6
            r9 = r15
            r10 = r15
            r11 = r15
            r12 = r15
            z1.d3[] r7 = r7.mo21324a(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0349 }
            r1.f29798g = r7     // Catch:{ all -> 0x0349 }
            int r5 = r7.length     // Catch:{ all -> 0x0349 }
            r12 = 0
            if (r5 <= 0) goto L_0x00a1
            r5 = 1
            goto L_0x00a2
        L_0x00a1:
            r5 = 0
        L_0x00a2:
            p161w3.C5917a.m34873f(r5)     // Catch:{ all -> 0x0349 }
            a7.t<u3.b0> r5 = r0.f30306f     // Catch:{ all -> 0x0349 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0349 }
            r10 = r5
            u3.b0 r10 = (p149u3.C5717b0) r10     // Catch:{ all -> 0x0349 }
            r1.f29800h = r10     // Catch:{ all -> 0x0349 }
            a7.t<b3.x$a> r5 = r0.f30305e     // Catch:{ all -> 0x0349 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0349 }
            b3.x$a r5 = (p015b3.C1772x.C1773a) r5     // Catch:{ all -> 0x0349 }
            r1.f29818q = r5     // Catch:{ all -> 0x0349 }
            a7.t<v3.f> r5 = r0.f30308h     // Catch:{ all -> 0x0349 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0349 }
            r9 = r5
            v3.f r9 = (p155v3.C5798f) r9     // Catch:{ all -> 0x0349 }
            r1.f29824t = r9     // Catch:{ all -> 0x0349 }
            boolean r5 = r0.f30319s     // Catch:{ all -> 0x0349 }
            r1.f29816p = r5     // Catch:{ all -> 0x0349 }
            z1.i3 r5 = r0.f30320t     // Catch:{ all -> 0x0349 }
            r1.f29772L = r5     // Catch:{ all -> 0x0349 }
            r16 = r15
            long r14 = r0.f30321u     // Catch:{ all -> 0x0349 }
            r1.f29826u = r14     // Catch:{ all -> 0x0349 }
            long r14 = r0.f30322v     // Catch:{ all -> 0x0349 }
            r1.f29828v = r14     // Catch:{ all -> 0x0349 }
            boolean r5 = r0.f30326z     // Catch:{ all -> 0x0349 }
            r1.f29774N = r5     // Catch:{ all -> 0x0349 }
            android.os.Looper r15 = r0.f30310j     // Catch:{ all -> 0x0349 }
            r1.f29822s = r15     // Catch:{ all -> 0x0349 }
            w3.d r14 = r0.f30302b     // Catch:{ all -> 0x0349 }
            r1.f29830w = r14     // Catch:{ all -> 0x0349 }
            if (r40 != 0) goto L_0x00e7
            r5 = r1
            goto L_0x00e9
        L_0x00e7:
            r5 = r40
        L_0x00e9:
            r1.f29796f = r5     // Catch:{ all -> 0x0349 }
            w3.q r8 = new w3.q     // Catch:{ all -> 0x0349 }
            z1.r0 r11 = new z1.r0     // Catch:{ all -> 0x0349 }
            r11.<init>(r1)     // Catch:{ all -> 0x0349 }
            r8.<init>(r15, r14, r11)     // Catch:{ all -> 0x0349 }
            r1.f29808l = r8     // Catch:{ all -> 0x0349 }
            java.util.concurrent.CopyOnWriteArraySet r8 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x0349 }
            r8.<init>()     // Catch:{ all -> 0x0349 }
            r1.f29810m = r8     // Catch:{ all -> 0x0349 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0349 }
            r8.<init>()     // Catch:{ all -> 0x0349 }
            r1.f29814o = r8     // Catch:{ all -> 0x0349 }
            b3.s0$a r8 = new b3.s0$a     // Catch:{ all -> 0x0349 }
            r8.<init>(r12)     // Catch:{ all -> 0x0349 }
            r1.f29773M = r8     // Catch:{ all -> 0x0349 }
            u3.c0 r8 = new u3.c0     // Catch:{ all -> 0x0349 }
            int r11 = r7.length     // Catch:{ all -> 0x0349 }
            z1.g3[] r11 = new p177z1.C6223g3[r11]     // Catch:{ all -> 0x0349 }
            int r12 = r7.length     // Catch:{ all -> 0x0349 }
            u3.s[] r12 = new p149u3.C5735s[r12]     // Catch:{ all -> 0x0349 }
            r20 = r6
            z1.v3 r6 = p177z1.C6290v3.f30357b     // Catch:{ all -> 0x0349 }
            r21 = r9
            r9 = 0
            r8.<init>(r11, r12, r6, r9)     // Catch:{ all -> 0x0349 }
            r1.f29788b = r8     // Catch:{ all -> 0x0349 }
            z1.q3$b r6 = new z1.q3$b     // Catch:{ all -> 0x0349 }
            r6.<init>()     // Catch:{ all -> 0x0349 }
            r1.f29812n = r6     // Catch:{ all -> 0x0349 }
            z1.u2$b$a r6 = new z1.u2$b$a     // Catch:{ all -> 0x0349 }
            r6.<init>()     // Catch:{ all -> 0x0349 }
            r12 = 21
            int[] r9 = new int[r12]     // Catch:{ all -> 0x0349 }
            r11 = 1
            r18 = 0
            r9[r18] = r11     // Catch:{ all -> 0x0349 }
            r12 = 2
            r9[r11] = r12     // Catch:{ all -> 0x0349 }
            r23 = r2
            r2 = 3
            r9[r12] = r2     // Catch:{ all -> 0x0349 }
            r19 = 13
            r9[r2] = r19     // Catch:{ all -> 0x0349 }
            r22 = 14
            r2 = 4
            r9[r2] = r22     // Catch:{ all -> 0x0349 }
            r24 = 15
            r2 = 5
            r9[r2] = r24     // Catch:{ all -> 0x0349 }
            r25 = 16
            r2 = 6
            r9[r2] = r25     // Catch:{ all -> 0x0349 }
            r26 = 17
            r2 = 7
            r9[r2] = r26     // Catch:{ all -> 0x0349 }
            r27 = 18
            r2 = 8
            r9[r2] = r27     // Catch:{ all -> 0x0349 }
            r28 = 19
            r2 = 9
            r9[r2] = r28     // Catch:{ all -> 0x0349 }
            r11 = 31
            r2 = 10
            r9[r2] = r11     // Catch:{ all -> 0x0349 }
            r30 = 11
            r31 = 20
            r9[r30] = r31     // Catch:{ all -> 0x0349 }
            r30 = 12
            r32 = 30
            r9[r30] = r32     // Catch:{ all -> 0x0349 }
            r30 = 21
            r9[r19] = r30     // Catch:{ all -> 0x0349 }
            r19 = 22
            r9[r22] = r19     // Catch:{ all -> 0x0349 }
            r19 = 23
            r9[r24] = r19     // Catch:{ all -> 0x0349 }
            r19 = 24
            r9[r25] = r19     // Catch:{ all -> 0x0349 }
            r19 = 25
            r9[r26] = r19     // Catch:{ all -> 0x0349 }
            r19 = 26
            r9[r27] = r19     // Catch:{ all -> 0x0349 }
            r19 = 27
            r9[r28] = r19     // Catch:{ all -> 0x0349 }
            r19 = 28
            r9[r31] = r19     // Catch:{ all -> 0x0349 }
            z1.u2$b$a r6 = r6.mo21548c(r9)     // Catch:{ all -> 0x0349 }
            r9 = 29
            boolean r12 = r10.mo20136d()     // Catch:{ all -> 0x0349 }
            z1.u2$b$a r6 = r6.mo21549d(r9, r12)     // Catch:{ all -> 0x0349 }
            z1.u2$b r6 = r6.mo21550e()     // Catch:{ all -> 0x0349 }
            r1.f29790c = r6     // Catch:{ all -> 0x0349 }
            z1.u2$b$a r9 = new z1.u2$b$a     // Catch:{ all -> 0x0349 }
            r9.<init>()     // Catch:{ all -> 0x0349 }
            z1.u2$b$a r6 = r9.mo21547b(r6)     // Catch:{ all -> 0x0349 }
            r9 = 4
            z1.u2$b$a r6 = r6.mo21546a(r9)     // Catch:{ all -> 0x0349 }
            z1.u2$b$a r6 = r6.mo21546a(r2)     // Catch:{ all -> 0x0349 }
            z1.u2$b r6 = r6.mo21550e()     // Catch:{ all -> 0x0349 }
            r1.f29775O = r6     // Catch:{ all -> 0x0349 }
            r12 = 0
            w3.n r6 = r14.mo20587c(r15, r12)     // Catch:{ all -> 0x0349 }
            r1.f29802i = r6     // Catch:{ all -> 0x0349 }
            z1.s0 r9 = new z1.s0     // Catch:{ all -> 0x0349 }
            r9.<init>(r1)     // Catch:{ all -> 0x0349 }
            r1.f29804j = r9     // Catch:{ all -> 0x0349 }
            z1.r2 r6 = p177z1.C6275r2.m36970j(r8)     // Catch:{ all -> 0x0349 }
            r1.f29825t0 = r6     // Catch:{ all -> 0x0349 }
            r4.mo34J(r5, r15)     // Catch:{ all -> 0x0349 }
            int r6 = p161w3.C5953m0.f29110a     // Catch:{ all -> 0x0349 }
            if (r6 >= r11) goto L_0x01e0
            a2.u1 r5 = new a2.u1     // Catch:{ all -> 0x0349 }
            r5.<init>()     // Catch:{ all -> 0x0349 }
            goto L_0x01e6
        L_0x01e0:
            boolean r5 = r0.f30299A     // Catch:{ all -> 0x0349 }
            a2.u1 r5 = p177z1.C6200b1.C6202b.m36239a(r3, r1, r5)     // Catch:{ all -> 0x0349 }
        L_0x01e6:
            r22 = r5
            z1.n1 r11 = new z1.n1     // Catch:{ all -> 0x0349 }
            a7.t<z1.x1> r5 = r0.f30307g     // Catch:{ all -> 0x0349 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0349 }
            r17 = r5
            z1.x1 r17 = (p177z1.C6295x1) r17     // Catch:{ all -> 0x0349 }
            int r5 = r1.f29766F     // Catch:{ all -> 0x0349 }
            boolean r12 = r1.f29767G     // Catch:{ all -> 0x0349 }
            z1.i3 r2 = r1.f29772L     // Catch:{ all -> 0x0349 }
            r25 = r15
            z1.w1 r15 = r0.f30323w     // Catch:{ all -> 0x0349 }
            r27 = r2
            r26 = r3
            long r2 = r0.f30324x     // Catch:{ all -> 0x0349 }
            boolean r0 = r1.f29774N     // Catch:{ all -> 0x0349 }
            r28 = r5
            r5 = r11
            r34 = r6
            r33 = r20
            r6 = r7
            r7 = r10
            r31 = r21
            r21 = r9
            r9 = r17
            r35 = r10
            r10 = r31
            r29 = r11
            r1 = 1
            r11 = r28
            r1 = 0
            r17 = 0
            r36 = r13
            r13 = r4
            r20 = r14
            r30 = r17
            r14 = r27
            r37 = r16
            r16 = r2
            r18 = r0
            r19 = r25
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0345 }
            r2 = r38
            r0 = r29
            r2.f29806k = r0     // Catch:{ all -> 0x0343 }
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f29803i0 = r3     // Catch:{ all -> 0x0343 }
            r2.f29766F = r1     // Catch:{ all -> 0x0343 }
            z1.e2 r3 = p177z1.C6214e2.f29855O     // Catch:{ all -> 0x0343 }
            r2.f29776P = r3     // Catch:{ all -> 0x0343 }
            r2.f29777Q = r3     // Catch:{ all -> 0x0343 }
            r2.f29823s0 = r3     // Catch:{ all -> 0x0343 }
            r3 = -1
            r2.f29827u0 = r3     // Catch:{ all -> 0x0343 }
            r3 = r34
            r5 = 21
            if (r3 >= r5) goto L_0x0259
            int r3 = r2.m36175n1(r1)     // Catch:{ all -> 0x0343 }
            r2.f29799g0 = r3     // Catch:{ all -> 0x0343 }
            goto L_0x025f
        L_0x0259:
            int r3 = p161w3.C5953m0.m35078F(r26)     // Catch:{ all -> 0x0343 }
            r2.f29799g0 = r3     // Catch:{ all -> 0x0343 }
        L_0x025f:
            k3.e r3 = p079k3.C4868e.f25792b     // Catch:{ all -> 0x0343 }
            r2.f29807k0 = r3     // Catch:{ all -> 0x0343 }
            r3 = 1
            r2.f29809l0 = r3     // Catch:{ all -> 0x0343 }
            r2.mo21187l(r4)     // Catch:{ all -> 0x0343 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0343 }
            r5 = r25
            r3.<init>(r5)     // Catch:{ all -> 0x0343 }
            r5 = r31
            r5.mo20317c(r3, r4)     // Catch:{ all -> 0x0343 }
            r3 = r37
            r2.mo21165U0(r3)     // Catch:{ all -> 0x0343 }
            r4 = r39
            long r5 = r4.f30303c     // Catch:{ all -> 0x0343 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0287
            r0.mo21424u(r5)     // Catch:{ all -> 0x0343 }
        L_0x0287:
            z1.b r0 = new z1.b     // Catch:{ all -> 0x0343 }
            android.content.Context r5 = r4.f30301a     // Catch:{ all -> 0x0343 }
            r6 = r33
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x0343 }
            r2.f29834z = r0     // Catch:{ all -> 0x0343 }
            boolean r5 = r4.f30315o     // Catch:{ all -> 0x0343 }
            r0.mo21150b(r5)     // Catch:{ all -> 0x0343 }
            z1.d r0 = new z1.d     // Catch:{ all -> 0x0343 }
            android.content.Context r5 = r4.f30301a     // Catch:{ all -> 0x0343 }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x0343 }
            r2.f29761A = r0     // Catch:{ all -> 0x0343 }
            boolean r5 = r4.f30313m     // Catch:{ all -> 0x0343 }
            if (r5 == 0) goto L_0x02a7
            b2.e r14 = r2.f29801h0     // Catch:{ all -> 0x0343 }
            goto L_0x02a9
        L_0x02a7:
            r14 = r30
        L_0x02a9:
            r0.mo21216m(r14)     // Catch:{ all -> 0x0343 }
            z1.l3 r0 = new z1.l3     // Catch:{ all -> 0x0343 }
            android.content.Context r5 = r4.f30301a     // Catch:{ all -> 0x0343 }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x0343 }
            r2.f29762B = r0     // Catch:{ all -> 0x0343 }
            b2.e r3 = r2.f29801h0     // Catch:{ all -> 0x0343 }
            int r3 = r3.f4657c     // Catch:{ all -> 0x0343 }
            int r3 = p161w3.C5953m0.m35131f0(r3)     // Catch:{ all -> 0x0343 }
            r0.mo21399h(r3)     // Catch:{ all -> 0x0343 }
            z1.w3 r3 = new z1.w3     // Catch:{ all -> 0x0343 }
            android.content.Context r5 = r4.f30301a     // Catch:{ all -> 0x0343 }
            r3.<init>(r5)     // Catch:{ all -> 0x0343 }
            r2.f29763C = r3     // Catch:{ all -> 0x0343 }
            int r5 = r4.f30314n     // Catch:{ all -> 0x0343 }
            if (r5 == 0) goto L_0x02cf
            r12 = 1
            goto L_0x02d0
        L_0x02cf:
            r12 = 0
        L_0x02d0:
            r3.mo21566a(r12)     // Catch:{ all -> 0x0343 }
            z1.x3 r3 = new z1.x3     // Catch:{ all -> 0x0343 }
            android.content.Context r5 = r4.f30301a     // Catch:{ all -> 0x0343 }
            r3.<init>(r5)     // Catch:{ all -> 0x0343 }
            r2.f29764D = r3     // Catch:{ all -> 0x0343 }
            int r4 = r4.f30314n     // Catch:{ all -> 0x0343 }
            r5 = 2
            if (r4 != r5) goto L_0x02e3
            r12 = 1
            goto L_0x02e4
        L_0x02e3:
            r12 = 0
        L_0x02e4:
            r3.mo21568a(r12)     // Catch:{ all -> 0x0343 }
            z1.o r0 = m36137X0(r0)     // Catch:{ all -> 0x0343 }
            r2.f29819q0 = r0     // Catch:{ all -> 0x0343 }
            x3.z r0 = p167x3.C6076z.f29443e     // Catch:{ all -> 0x0343 }
            r2.f29821r0 = r0     // Catch:{ all -> 0x0343 }
            b2.e r0 = r2.f29801h0     // Catch:{ all -> 0x0343 }
            r1 = r35
            r1.mo20140h(r0)     // Catch:{ all -> 0x0343 }
            int r0 = r2.f29799g0     // Catch:{ all -> 0x0343 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0343 }
            r1 = 10
            r3 = 1
            r2.m36132V1(r3, r1, r0)     // Catch:{ all -> 0x0343 }
            int r0 = r2.f29799g0     // Catch:{ all -> 0x0343 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0343 }
            r2.m36132V1(r5, r1, r0)     // Catch:{ all -> 0x0343 }
            b2.e r0 = r2.f29801h0     // Catch:{ all -> 0x0343 }
            r1 = 3
            r2.m36132V1(r3, r1, r0)     // Catch:{ all -> 0x0343 }
            int r0 = r2.f29787a0     // Catch:{ all -> 0x0343 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0343 }
            r1 = 4
            r2.m36132V1(r5, r1, r0)     // Catch:{ all -> 0x0343 }
            int r0 = r2.f29789b0     // Catch:{ all -> 0x0343 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0343 }
            r1 = 5
            r2.m36132V1(r5, r1, r0)     // Catch:{ all -> 0x0343 }
            boolean r0 = r2.f29805j0     // Catch:{ all -> 0x0343 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0343 }
            r1 = 9
            r3 = 1
            r2.m36132V1(r3, r1, r0)     // Catch:{ all -> 0x0343 }
            r0 = r36
            r1 = 7
            r2.m36132V1(r5, r1, r0)     // Catch:{ all -> 0x0343 }
            r1 = 8
            r3 = 6
            r2.m36132V1(r3, r1, r0)     // Catch:{ all -> 0x0343 }
            r23.mo20596e()
            return
        L_0x0343:
            r0 = move-exception
            goto L_0x034b
        L_0x0345:
            r0 = move-exception
            r2 = r38
            goto L_0x034b
        L_0x0349:
            r0 = move-exception
            r2 = r1
        L_0x034b:
            w3.g r1 = r2.f29792d
            r1.mo20596e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6200b1.<init>(z1.s$b, z1.u2):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static /* synthetic */ void m36089B1(int i, C6282u2.C6288e eVar, C6282u2.C6288e eVar2, C6282u2.C6287d dVar) {
        dVar.mo141B(i);
        dVar.mo162X(eVar, eVar2, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static /* synthetic */ void m36101H1(C6275r2 r2Var, C6282u2.C6287d dVar) {
        dVar.mo140A(r2Var.f30287g);
        dVar.mo143D(r2Var.f30287g);
    }

    /* renamed from: O1 */
    private C6275r2 m36114O1(C6275r2 r2Var, C6266q3 q3Var, Pair<Object, Long> pair) {
        int i;
        long j;
        C6266q3 q3Var2 = q3Var;
        Pair<Object, Long> pair2 = pair;
        C5917a.m34868a(q3Var.mo21451u() || pair2 != null);
        C6266q3 q3Var3 = r2Var.f30281a;
        C6275r2 i2 = r2Var.mo21531i(q3Var);
        if (q3Var.mo21451u()) {
            C1772x.C1774b k = C6275r2.m36971k();
            long B0 = C5953m0.m35071B0(this.f29831w0);
            C6275r2 b = i2.mo21525c(k, B0, B0, B0, 0, C1780z0.f5294d, this.f29788b, C6685q.m38445x()).mo21524b(k);
            b.f30296p = b.f30298r;
            return b;
        }
        Object obj = i2.f30282b.f5270a;
        boolean z = !obj.equals(((Pair) C5953m0.m35138j(pair)).first);
        C1772x.C1774b bVar = z ? new C1772x.C1774b(pair2.first) : i2.f30282b;
        long longValue = ((Long) pair2.second).longValue();
        long B02 = C5953m0.m35071B0(mo21191r());
        if (!q3Var3.mo21451u()) {
            B02 -= q3Var3.mo21149l(obj, this.f29812n).mo21468q();
        }
        if (z || longValue < B02) {
            C1772x.C1774b bVar2 = bVar;
            C5917a.m34873f(!bVar2.mo6886b());
            C1772x.C1774b bVar3 = bVar2;
            C6275r2 b2 = i2.mo21525c(bVar3, longValue, longValue, longValue, 0, z ? C1780z0.f5294d : i2.f30288h, z ? this.f29788b : i2.f30289i, z ? C6685q.m38445x() : i2.f30290j).mo21524b(bVar3);
            b2.f30296p = longValue;
            return b2;
        }
        if (i == 0) {
            int f = q3Var2.mo6809f(i2.f30291k.f5270a);
            if (f == -1 || q3Var2.mo21447j(f, this.f29812n).f30186c != q3Var2.mo21149l(bVar.f5270a, this.f29812n).f30186c) {
                q3Var2.mo21149l(bVar.f5270a, this.f29812n);
                if (bVar.mo6886b()) {
                    j = this.f29812n.mo21454e(bVar.f5271b, bVar.f5272c);
                } else {
                    j = this.f29812n.f30187d;
                }
                i2 = i2.mo21525c(bVar, i2.f30298r, i2.f30298r, i2.f30284d, j - i2.f30298r, i2.f30288h, i2.f30289i, i2.f30290j).mo21524b(bVar);
                i2.f30296p = j;
            }
        } else {
            C1772x.C1774b bVar4 = bVar;
            C5917a.m34873f(!bVar4.mo6886b());
            long max = Math.max(0, i2.f30297q - (longValue - B02));
            long j2 = i2.f30296p;
            if (i2.f30291k.equals(i2.f30282b)) {
                j2 = longValue + max;
            }
            i2 = i2.mo21525c(bVar4, longValue, longValue, longValue, max, i2.f30288h, i2.f30289i, i2.f30290j);
            i2.f30296p = j2;
        }
        return i2;
    }

    /* renamed from: P1 */
    private Pair<Object, Long> m36117P1(C6266q3 q3Var, int i, long j) {
        if (q3Var.mo21451u()) {
            this.f29827u0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f29831w0 = j;
            this.f29829v0 = 0;
            return null;
        }
        if (i == -1 || i >= q3Var.mo6761t()) {
            i = q3Var.mo6808e(this.f29767G);
            j = q3Var.mo21450r(i, this.f29854a).mo21475d();
        }
        return q3Var.mo21448n(this.f29854a, this.f29812n, i, C5953m0.m35071B0(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public void m36119Q1(int i, int i2) {
        if (i != this.f29791c0 || i2 != this.f29793d0) {
            this.f29791c0 = i;
            this.f29793d0 = i2;
            this.f29808l.mo20650k(24, new C13429u0(i, i2));
        }
    }

    /* renamed from: R1 */
    private long m36122R1(C6266q3 q3Var, C1772x.C1774b bVar, long j) {
        q3Var.mo21149l(bVar.f5270a, this.f29812n);
        return j + this.f29812n.mo21468q();
    }

    /* renamed from: S1 */
    private C6275r2 m36125S1(int i, int i2) {
        boolean z = false;
        C5917a.m34868a(i >= 0 && i2 >= i && i2 <= this.f29814o.size());
        int A = mo21154A();
        C6266q3 D = mo21156D();
        int size = this.f29814o.size();
        this.f29768H++;
        m36127T1(i, i2);
        C6266q3 Y0 = m36139Y0();
        C6275r2 O1 = m36114O1(this.f29825t0, Y0, m36158g1(D, Y0));
        int i3 = O1.f30285e;
        if (i3 != 1 && i3 != 4 && i < i2 && i2 == size && A >= O1.f30281a.mo6761t()) {
            z = true;
        }
        if (z) {
            O1 = O1.mo21529g(4);
        }
        this.f29806k.mo21423o0(i, i2, this.f29773M);
        return O1;
    }

    /* renamed from: T1 */
    private void m36127T1(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            this.f29814o.remove(i3);
        }
        this.f29773M = this.f29773M.mo6874c(i, i2);
    }

    /* renamed from: U1 */
    private void m36129U1() {
        if (this.f29784X != null) {
            m36141Z0(this.f29833y).mo21583n(10000).mo21582m((Object) null).mo21581l();
            this.f29784X.mo20985d(this.f29832x);
            this.f29784X = null;
        }
        TextureView textureView = this.f29786Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f29832x) {
                C5961r.m35215i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f29786Z.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            }
            this.f29786Z = null;
        }
        SurfaceHolder surfaceHolder = this.f29783W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f29832x);
            this.f29783W = null;
        }
    }

    /* renamed from: V0 */
    private List<C6239l2.C6242c> m36131V0(int i, List<C1772x> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C6239l2.C6242c cVar = new C6239l2.C6242c(list.get(i2), this.f29816p);
            arrayList.add(cVar);
            this.f29814o.add(i2 + i, new C6205e(cVar.f30061b, cVar.f30060a.mo6870T()));
        }
        this.f29773M = this.f29773M.mo6878g(i, arrayList.size());
        return arrayList;
    }

    /* renamed from: V1 */
    private void m36132V1(int i, int i2, Object obj) {
        for (C6211d3 d3Var : this.f29798g) {
            if (d3Var.mo21220g() == i) {
                m36141Z0(d3Var).mo21583n(i2).mo21582m(obj).mo21581l();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public C6214e2 m36134W0() {
        C6266q3 D = mo21156D();
        if (D.mo21451u()) {
            return this.f29823s0;
        }
        return this.f29823s0.mo21250b().mo21255H(D.mo21450r(mo21154A(), this.f29854a).f30201c.f30394e).mo21253F();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public void m36135W1() {
        m36132V1(1, 2, Float.valueOf(this.f29803i0 * this.f29761A.mo21214g()));
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public static C6259o m36137X0(C6244l3 l3Var) {
        return new C6259o(0, l3Var.mo21397d(), l3Var.mo21396c());
    }

    /* renamed from: Y0 */
    private C6266q3 m36139Y0() {
        return new C6318z2(this.f29814o, this.f29773M);
    }

    /* renamed from: Z0 */
    private C6297y2 m36141Z0(C6297y2.C6299b bVar) {
        int f1 = m36155f1();
        C6250n1 n1Var = this.f29806k;
        return new C6297y2(n1Var, bVar, this.f29825t0.f30281a, f1 == -1 ? 0 : f1, this.f29830w, n1Var.mo21411C());
    }

    /* renamed from: Z1 */
    private void m36142Z1(List<C1772x> list, int i, long j, boolean z) {
        int i2;
        long j2;
        int i3 = i;
        int f1 = m36155f1();
        long currentPosition = getCurrentPosition();
        boolean z2 = true;
        this.f29768H++;
        if (!this.f29814o.isEmpty()) {
            m36127T1(0, this.f29814o.size());
        }
        List<C6239l2.C6242c> V0 = m36131V0(0, list);
        C6266q3 Y0 = m36139Y0();
        if (Y0.mo21451u() || i3 < Y0.mo6761t()) {
            long j3 = j;
            if (z) {
                j2 = -9223372036854775807L;
                i2 = Y0.mo6808e(this.f29767G);
            } else if (i3 == -1) {
                i2 = f1;
                j2 = currentPosition;
            } else {
                i2 = i3;
                j2 = j3;
            }
            C6275r2 O1 = m36114O1(this.f29825t0, Y0, m36117P1(Y0, i2, j2));
            int i4 = O1.f30285e;
            if (!(i2 == -1 || i4 == 1)) {
                i4 = (Y0.mo21451u() || i2 >= Y0.mo6761t()) ? 4 : 2;
            }
            C6275r2 g = O1.mo21529g(i4);
            this.f29806k.mo21412N0(V0, i2, C5953m0.m35071B0(j2), this.f29773M);
            if (this.f29825t0.f30282b.f5270a.equals(g.f30282b.f5270a) || this.f29825t0.f30281a.mo21451u()) {
                z2 = false;
            }
            m36159g2(g, 0, 1, false, z2, 4, m36152e1(g), -1);
            return;
        }
        throw new C6289v1(Y0, i3, j);
    }

    /* renamed from: a1 */
    private Pair<Boolean, Integer> m36144a1(C6275r2 r2Var, C6275r2 r2Var2, boolean z, int i, boolean z2) {
        C6266q3 q3Var = r2Var2.f30281a;
        C6266q3 q3Var2 = r2Var.f30281a;
        if (q3Var2.mo21451u() && q3Var.mo21451u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i2 = 3;
        if (q3Var2.mo21451u() != q3Var.mo21451u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (!q3Var.mo21450r(q3Var.mo21149l(r2Var2.f30282b.f5270a, this.f29812n).f30186c, this.f29854a).f30199a.equals(q3Var2.mo21450r(q3Var2.mo21149l(r2Var.f30282b.f5270a, this.f29812n).f30186c, this.f29854a).f30199a)) {
            if (z && i == 0) {
                i2 = 1;
            } else if (z && i == 1) {
                i2 = 2;
            } else if (!z2) {
                throw new IllegalStateException();
            }
            return new Pair<>(Boolean.TRUE, Integer.valueOf(i2));
        } else if (!z || i != 0 || r2Var2.f30282b.f5273d >= r2Var.f30282b.f5273d) {
            return new Pair<>(Boolean.FALSE, -1);
        } else {
            return new Pair<>(Boolean.TRUE, 0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a2 */
    public void m36145a2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m36147b2(surface);
        this.f29782V = surface;
    }

    /* access modifiers changed from: private */
    /* renamed from: b2 */
    public void m36147b2(Object obj) {
        boolean z;
        ArrayList<C6297y2> arrayList = new ArrayList<>();
        C6211d3[] d3VarArr = this.f29798g;
        int length = d3VarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= length) {
                break;
            }
            C6211d3 d3Var = d3VarArr[i];
            if (d3Var.mo21220g() == 2) {
                arrayList.add(m36141Z0(d3Var).mo21583n(1).mo21582m(obj).mo21581l());
            }
            i++;
        }
        Object obj2 = this.f29781U;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (C6297y2 a : arrayList) {
                    a.mo21570a(this.f29765E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f29781U;
            Surface surface = this.f29782V;
            if (obj3 == surface) {
                surface.release();
                this.f29782V = null;
            }
        }
        this.f29781U = obj;
        if (z) {
            m36150d2(false, C6264q.m36815j(new C6263p1(3), 1003));
        }
    }

    /* renamed from: d2 */
    private void m36150d2(boolean z, C6264q qVar) {
        C6275r2 r2Var;
        if (z) {
            r2Var = m36125S1(0, this.f29814o.size()).mo21527e((C6264q) null);
        } else {
            C6275r2 r2Var2 = this.f29825t0;
            r2Var = r2Var2.mo21524b(r2Var2.f30282b);
            r2Var.f30296p = r2Var.f30298r;
            r2Var.f30297q = 0;
        }
        C6275r2 g = r2Var.mo21529g(1);
        if (qVar != null) {
            g = g.mo21527e(qVar);
        }
        C6275r2 r2Var3 = g;
        this.f29768H++;
        this.f29806k.mo21418h1();
        m36159g2(r2Var3, 0, 1, false, r2Var3.f30281a.mo21451u() && !this.f29825t0.f30281a.mo21451u(), 4, m36152e1(r2Var3), -1);
    }

    /* renamed from: e1 */
    private long m36152e1(C6275r2 r2Var) {
        if (r2Var.f30281a.mo21451u()) {
            return C5953m0.m35071B0(this.f29831w0);
        }
        if (r2Var.f30282b.mo6886b()) {
            return r2Var.f30298r;
        }
        return m36122R1(r2Var.f30281a, r2Var.f30282b, r2Var.f30298r);
    }

    /* renamed from: e2 */
    private void m36153e2() {
        C6282u2.C6284b bVar = this.f29775O;
        C6282u2.C6284b H = C5953m0.m35082H(this.f29796f, this.f29790c);
        this.f29775O = H;
        if (!H.equals(bVar)) {
            this.f29808l.mo20648i(13, new C13437x0(this));
        }
    }

    /* renamed from: f1 */
    private int m36155f1() {
        if (this.f29825t0.f30281a.mo21451u()) {
            return this.f29827u0;
        }
        C6275r2 r2Var = this.f29825t0;
        return r2Var.f30281a.mo21149l(r2Var.f30282b.f5270a, this.f29812n).f30186c;
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public void m36156f2(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        C6275r2 r2Var = this.f29825t0;
        if (r2Var.f30292l != z2 || r2Var.f30293m != i3) {
            this.f29768H++;
            C6275r2 d = r2Var.mo21526d(z2, i3);
            this.f29806k.mo21413Q0(z2, i3);
            m36159g2(d, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: g1 */
    private Pair<Object, Long> m36158g1(C6266q3 q3Var, C6266q3 q3Var2) {
        long r = mo21191r();
        int i = -1;
        if (q3Var.mo21451u() || q3Var2.mo21451u()) {
            boolean z = !q3Var.mo21451u() && q3Var2.mo21451u();
            if (!z) {
                i = m36155f1();
            }
            if (z) {
                r = -9223372036854775807L;
            }
            return m36117P1(q3Var2, i, r);
        }
        Pair<Object, Long> n = q3Var.mo21448n(this.f29854a, this.f29812n, mo21154A(), C5953m0.m35071B0(r));
        Object obj = ((Pair) C5953m0.m35138j(n)).first;
        if (q3Var2.mo6809f(obj) != -1) {
            return n;
        }
        Object z0 = C6250n1.m36764z0(this.f29854a, this.f29812n, this.f29766F, this.f29767G, obj, q3Var, q3Var2);
        if (z0 == null) {
            return m36117P1(q3Var2, -1, -9223372036854775807L);
        }
        q3Var2.mo21149l(z0, this.f29812n);
        int i2 = this.f29812n.f30186c;
        return m36117P1(q3Var2, i2, q3Var2.mo21450r(i2, this.f29854a).mo21475d());
    }

    /* renamed from: g2 */
    private void m36159g2(C6275r2 r2Var, int i, int i2, boolean z, boolean z2, int i3, long j, int i4) {
        C6275r2 r2Var2 = r2Var;
        int i5 = i3;
        C6275r2 r2Var3 = this.f29825t0;
        this.f29825t0 = r2Var2;
        Pair<Boolean, Integer> a1 = m36144a1(r2Var, r2Var3, z2, i3, !r2Var3.f30281a.equals(r2Var2.f30281a));
        boolean booleanValue = ((Boolean) a1.first).booleanValue();
        int intValue = ((Integer) a1.second).intValue();
        C6214e2 e2Var = this.f29776P;
        C6300z1 z1Var = null;
        if (booleanValue) {
            if (!r2Var2.f30281a.mo21451u()) {
                z1Var = r2Var2.f30281a.mo21450r(r2Var2.f30281a.mo21149l(r2Var2.f30282b.f5270a, this.f29812n).f30186c, this.f29854a).f30201c;
            }
            this.f29823s0 = C6214e2.f29855O;
        }
        if (booleanValue || !r2Var3.f30290j.equals(r2Var2.f30290j)) {
            this.f29823s0 = this.f29823s0.mo21250b().mo21256I(r2Var2.f30290j).mo21253F();
            e2Var = m36134W0();
        }
        boolean z3 = !e2Var.equals(this.f29776P);
        this.f29776P = e2Var;
        boolean z4 = r2Var3.f30292l != r2Var2.f30292l;
        boolean z5 = r2Var3.f30285e != r2Var2.f30285e;
        if (z5 || z4) {
            m36164i2();
        }
        boolean z6 = r2Var3.f30287g;
        boolean z7 = r2Var2.f30287g;
        boolean z8 = z6 != z7;
        if (z8) {
            m36162h2(z7);
        }
        if (!r2Var3.f30281a.equals(r2Var2.f30281a)) {
            this.f29808l.mo20648i(0, new C13400k0(r2Var2, i));
        }
        if (z2) {
            this.f29808l.mo20648i(11, new C13432v0(i5, m36169k1(i5, r2Var3, i4), m36166j1(j)));
        }
        if (booleanValue) {
            this.f29808l.mo20648i(1, new C13440y0(z1Var, intValue));
        }
        if (r2Var3.f30286f != r2Var2.f30286f) {
            this.f29808l.mo20648i(10, new C13374a1(r2Var2));
            if (r2Var2.f30286f != null) {
                this.f29808l.mo20648i(10, new C13392h0(r2Var2));
            }
        }
        C5720c0 c0Var = r2Var3.f30289i;
        C5720c0 c0Var2 = r2Var2.f30289i;
        if (c0Var != c0Var2) {
            this.f29800h.mo20137e(c0Var2.f28544e);
            this.f29808l.mo20648i(2, new C13383d0(r2Var2));
        }
        if (z3) {
            this.f29808l.mo20648i(14, new C13443z0(this.f29776P));
        }
        if (z8) {
            this.f29808l.mo20648i(3, new C13397j0(r2Var2));
        }
        if (z5 || z4) {
            this.f29808l.mo20648i(-1, new C13395i0(r2Var2));
        }
        if (z5) {
            this.f29808l.mo20648i(4, new C13380c0(r2Var2));
        }
        if (z4) {
            this.f29808l.mo20648i(5, new C13403l0(r2Var2, i2));
        }
        if (r2Var3.f30293m != r2Var2.f30293m) {
            this.f29808l.mo20648i(6, new C13386e0(r2Var2));
        }
        if (m36177o1(r2Var3) != m36177o1(r2Var)) {
            this.f29808l.mo20648i(7, new C13390g0(r2Var2));
        }
        if (!r2Var3.f30294n.equals(r2Var2.f30294n)) {
            this.f29808l.mo20648i(12, new C13388f0(r2Var2));
        }
        if (z) {
            this.f29808l.mo20648i(-1, C13417q0.f47755a);
        }
        m36153e2();
        this.f29808l.mo20647f();
        if (r2Var3.f30295o != r2Var2.f30295o) {
            Iterator<C6276s.C6277a> it = this.f29810m.iterator();
            while (it.hasNext()) {
                it.next().mo21211z(r2Var2.f30295o);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h1 */
    public static int m36161h1(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: h2 */
    private void m36162h2(boolean z) {
        C5922c0 c0Var = this.f29813n0;
        if (c0Var == null) {
            return;
        }
        if (z && !this.f29815o0) {
            c0Var.mo20583a(0);
            this.f29815o0 = true;
        } else if (!z && this.f29815o0) {
            c0Var.mo20584b(0);
            this.f29815o0 = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public void m36164i2() {
        int N = mo21162N();
        boolean z = true;
        if (N != 1) {
            if (N == 2 || N == 3) {
                boolean b1 = mo21170b1();
                C6294w3 w3Var = this.f29763C;
                if (!mo21183i() || b1) {
                    z = false;
                }
                w3Var.mo21567b(z);
                this.f29764D.mo21569b(mo21183i());
                return;
            } else if (N != 4) {
                throw new IllegalStateException();
            }
        }
        this.f29763C.mo21567b(false);
        this.f29764D.mo21569b(false);
    }

    /* renamed from: j1 */
    private C6282u2.C6288e m36166j1(long j) {
        int i;
        Object obj;
        C6300z1 z1Var;
        int A = mo21154A();
        Object obj2 = null;
        if (!this.f29825t0.f30281a.mo21451u()) {
            C6275r2 r2Var = this.f29825t0;
            Object obj3 = r2Var.f30282b.f5270a;
            r2Var.f30281a.mo21149l(obj3, this.f29812n);
            i = this.f29825t0.f30281a.mo6809f(obj3);
            obj = obj3;
            obj2 = this.f29825t0.f30281a.mo21450r(A, this.f29854a).f30199a;
            z1Var = this.f29854a.f30201c;
        } else {
            z1Var = null;
            obj = null;
            i = -1;
        }
        long Y0 = C5953m0.m35117Y0(j);
        long Y02 = this.f29825t0.f30282b.mo6886b() ? C5953m0.m35117Y0(m36171l1(this.f29825t0)) : Y0;
        C1772x.C1774b bVar = this.f29825t0.f30282b;
        return new C6282u2.C6288e(obj2, A, z1Var, obj, i, Y0, Y02, bVar.f5271b, bVar.f5272c);
    }

    /* renamed from: j2 */
    private void m36167j2() {
        this.f29792d.mo20593b();
        if (Thread.currentThread() != mo21172c1().getThread()) {
            String C = C5953m0.m35072C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), mo21172c1().getThread().getName());
            if (!this.f29809l0) {
                C5961r.m35216j("ExoPlayerImpl", C, this.f29811m0 ? null : new IllegalStateException());
                this.f29811m0 = true;
                return;
            }
            throw new IllegalStateException(C);
        }
    }

    /* renamed from: k1 */
    private C6282u2.C6288e m36169k1(int i, C6275r2 r2Var, int i2) {
        int i3;
        Object obj;
        C6300z1 z1Var;
        int i4;
        Object obj2;
        long j;
        long j2;
        C6275r2 r2Var2 = r2Var;
        C6266q3.C6268b bVar = new C6266q3.C6268b();
        if (!r2Var2.f30281a.mo21451u()) {
            Object obj3 = r2Var2.f30282b.f5270a;
            r2Var2.f30281a.mo21149l(obj3, bVar);
            int i5 = bVar.f30186c;
            i4 = i5;
            obj = obj3;
            i3 = r2Var2.f30281a.mo6809f(obj3);
            obj2 = r2Var2.f30281a.mo21450r(i5, this.f29854a).f30199a;
            z1Var = this.f29854a.f30201c;
        } else {
            i4 = i2;
            obj2 = null;
            z1Var = null;
            obj = null;
            i3 = -1;
        }
        if (i == 0) {
            if (r2Var2.f30282b.mo6886b()) {
                C1772x.C1774b bVar2 = r2Var2.f30282b;
                j2 = bVar.mo21454e(bVar2.f5271b, bVar2.f5272c);
                j = m36171l1(r2Var);
                long Y0 = C5953m0.m35117Y0(j2);
                long Y02 = C5953m0.m35117Y0(j);
                C1772x.C1774b bVar3 = r2Var2.f30282b;
                return new C6282u2.C6288e(obj2, i4, z1Var, obj, i3, Y0, Y02, bVar3.f5271b, bVar3.f5272c);
            } else if (r2Var2.f30282b.f5274e != -1) {
                j2 = m36171l1(this.f29825t0);
            } else {
                j2 = bVar.f30188e + bVar.f30187d;
            }
        } else if (r2Var2.f30282b.mo6886b()) {
            j2 = r2Var2.f30298r;
            j = m36171l1(r2Var);
            long Y03 = C5953m0.m35117Y0(j2);
            long Y022 = C5953m0.m35117Y0(j);
            C1772x.C1774b bVar32 = r2Var2.f30282b;
            return new C6282u2.C6288e(obj2, i4, z1Var, obj, i3, Y03, Y022, bVar32.f5271b, bVar32.f5272c);
        } else {
            j2 = bVar.f30188e + r2Var2.f30298r;
        }
        j = j2;
        long Y032 = C5953m0.m35117Y0(j2);
        long Y0222 = C5953m0.m35117Y0(j);
        C1772x.C1774b bVar322 = r2Var2.f30282b;
        return new C6282u2.C6288e(obj2, i4, z1Var, obj, i3, Y032, Y0222, bVar322.f5271b, bVar322.f5272c);
    }

    /* renamed from: l1 */
    private static long m36171l1(C6275r2 r2Var) {
        C6266q3.C6270d dVar = new C6266q3.C6270d();
        C6266q3.C6268b bVar = new C6266q3.C6268b();
        r2Var.f30281a.mo21149l(r2Var.f30282b.f5270a, bVar);
        if (r2Var.f30283c == -9223372036854775807L) {
            return r2Var.f30281a.mo21450r(bVar.f30186c, dVar).mo21476e();
        }
        return bVar.mo21468q() + r2Var.f30283c;
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public void m36183r1(C6250n1.C6255e eVar) {
        long j;
        boolean z;
        long j2;
        int i = this.f29768H - eVar.f30143c;
        this.f29768H = i;
        boolean z2 = true;
        if (eVar.f30144d) {
            this.f29769I = eVar.f30145e;
            this.f29770J = true;
        }
        if (eVar.f30146f) {
            this.f29771K = eVar.f30147g;
        }
        if (i == 0) {
            C6266q3 q3Var = eVar.f30142b.f30281a;
            if (!this.f29825t0.f30281a.mo21451u() && q3Var.mo21451u()) {
                this.f29827u0 = -1;
                this.f29831w0 = 0;
                this.f29829v0 = 0;
            }
            if (!q3Var.mo21451u()) {
                List<C6266q3> J = ((C6318z2) q3Var).mo21628J();
                C5917a.m34873f(J.size() == this.f29814o.size());
                for (int i2 = 0; i2 < J.size(); i2++) {
                    C6266q3 unused = this.f29814o.get(i2).f29841b = J.get(i2);
                }
            }
            if (this.f29770J) {
                if (eVar.f30142b.f30282b.equals(this.f29825t0.f30282b) && eVar.f30142b.f30284d == this.f29825t0.f30298r) {
                    z2 = false;
                }
                if (z2) {
                    if (q3Var.mo21451u() || eVar.f30142b.f30282b.mo6886b()) {
                        j2 = eVar.f30142b.f30284d;
                    } else {
                        C6275r2 r2Var = eVar.f30142b;
                        j2 = m36122R1(q3Var, r2Var.f30282b, r2Var.f30284d);
                    }
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f29770J = false;
            m36159g2(eVar.f30142b, 1, this.f29771K, false, z, this.f29769I, j, -1);
        }
    }

    /* renamed from: n1 */
    private int m36175n1(int i) {
        AudioTrack audioTrack = this.f29780T;
        if (!(audioTrack == null || audioTrack.getAudioSessionId() == i)) {
            this.f29780T.release();
            this.f29780T = null;
        }
        if (this.f29780T == null) {
            this.f29780T = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.f29780T.getAudioSessionId();
    }

    /* renamed from: o1 */
    private static boolean m36177o1(C6275r2 r2Var) {
        return r2Var.f30285e == 3 && r2Var.f30292l && r2Var.f30293m == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public /* synthetic */ void m36181q1(C6282u2.C6287d dVar, C5948l lVar) {
        dVar.mo149H(this.f29796f, new C6282u2.C6286c(lVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public /* synthetic */ void m36185s1(C6250n1.C6255e eVar) {
        this.f29802i.mo20598b(new C13377b0(this, eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public /* synthetic */ void m36198z1(C6282u2.C6287d dVar) {
        dVar.mo169c0(this.f29775O);
    }

    /* renamed from: A */
    public int mo21154A() {
        m36167j2();
        int f1 = m36155f1();
        if (f1 == -1) {
            return 0;
        }
        return f1;
    }

    /* renamed from: C */
    public int mo21155C() {
        m36167j2();
        return this.f29825t0.f30293m;
    }

    /* renamed from: D */
    public C6266q3 mo21156D() {
        m36167j2();
        return this.f29825t0.f30281a;
    }

    /* renamed from: E */
    public boolean mo21157E() {
        m36167j2();
        return this.f29767G;
    }

    /* renamed from: F */
    public void mo21158F(C1624e eVar, boolean z) {
        m36167j2();
        if (!this.f29817p0) {
            if (!C5953m0.m35124c(this.f29801h0, eVar)) {
                this.f29801h0 = eVar;
                m36132V1(1, 3, eVar);
                this.f29762B.mo21399h(C5953m0.m35131f0(eVar.f4657c));
                this.f29808l.mo20648i(20, new C13435w0(eVar));
            }
            this.f29761A.mo21216m(z ? eVar : null);
            this.f29800h.mo20140h(eVar);
            boolean i = mo21183i();
            int p = this.f29761A.mo21217p(i, mo21162N());
            m36156f2(i, p, m36161h1(i, p));
            this.f29808l.mo20647f();
        }
    }

    /* renamed from: H */
    public void mo21159H() {
        m36167j2();
        boolean i = mo21183i();
        int i2 = 2;
        int p = this.f29761A.mo21217p(i, 2);
        m36156f2(i, p, m36161h1(i, p));
        C6275r2 r2Var = this.f29825t0;
        if (r2Var.f30285e == 1) {
            C6275r2 e = r2Var.mo21527e((C6264q) null);
            if (e.f30281a.mo21451u()) {
                i2 = 4;
            }
            C6275r2 g = e.mo21529g(i2);
            this.f29768H++;
            this.f29806k.mo21421j0();
            m36159g2(g, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: I */
    public void mo21160I(C1772x xVar) {
        m36167j2();
        mo21166X1(Collections.singletonList(xVar));
    }

    /* renamed from: K0 */
    public int mo21161K0() {
        m36167j2();
        return this.f29766F;
    }

    /* renamed from: N */
    public int mo21162N() {
        m36167j2();
        return this.f29825t0.f30285e;
    }

    /* renamed from: Q */
    public void mo21163Q(int i) {
        m36167j2();
        if (this.f29766F != i) {
            this.f29766F = i;
            this.f29806k.mo21415U0(i);
            this.f29808l.mo20648i(8, new C13425t0(i));
            m36153e2();
            this.f29808l.mo20647f();
        }
    }

    /* renamed from: T0 */
    public void mo21164T0(C0016c cVar) {
        C5917a.m34872e(cVar);
        this.f29820r.mo35L(cVar);
    }

    /* renamed from: U0 */
    public void mo21165U0(C6276s.C6277a aVar) {
        this.f29810m.add(aVar);
    }

    /* renamed from: X1 */
    public void mo21166X1(List<C1772x> list) {
        m36167j2();
        mo21167Y1(list, true);
    }

    /* renamed from: Y1 */
    public void mo21167Y1(List<C1772x> list, boolean z) {
        m36167j2();
        m36142Z1(list, -1, -9223372036854775807L, z);
    }

    /* renamed from: a */
    public void mo21168a() {
        AudioTrack audioTrack;
        C5961r.m35212f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + "ExoPlayerLib/2.18.1" + "] [" + C5953m0.f29114e + "] [" + C6260o1.m36803b() + "]");
        m36167j2();
        if (C5953m0.f29110a < 21 && (audioTrack = this.f29780T) != null) {
            audioTrack.release();
            this.f29780T = null;
        }
        this.f29834z.mo21150b(false);
        this.f29762B.mo21398g();
        this.f29763C.mo21567b(false);
        this.f29764D.mo21569b(false);
        this.f29761A.mo21215i();
        if (!this.f29806k.mo21422l0()) {
            this.f29808l.mo20650k(10, C13414p0.f47752a);
        }
        this.f29808l.mo20649j();
        this.f29802i.mo20607k((Object) null);
        this.f29824t.mo20318e(this.f29820r);
        C6275r2 g = this.f29825t0.mo21529g(1);
        this.f29825t0 = g;
        C6275r2 b = g.mo21524b(g.f30282b);
        this.f29825t0 = b;
        b.f30296p = b.f30298r;
        this.f29825t0.f30297q = 0;
        this.f29820r.mo37a();
        this.f29800h.mo20138f();
        m36129U1();
        Surface surface = this.f29782V;
        if (surface != null) {
            surface.release();
            this.f29782V = null;
        }
        if (this.f29815o0) {
            ((C5922c0) C5917a.m34872e(this.f29813n0)).mo20584b(0);
            this.f29815o0 = false;
        }
        this.f29807k0 = C4868e.f25792b;
        this.f29817p0 = true;
    }

    /* renamed from: b */
    public void mo21169b(Surface surface) {
        m36167j2();
        m36129U1();
        m36147b2(surface);
        int i = surface == null ? 0 : -1;
        m36119Q1(i, i);
    }

    /* renamed from: b1 */
    public boolean mo21170b1() {
        m36167j2();
        return this.f29825t0.f30295o;
    }

    /* renamed from: c */
    public void mo21171c(C6280t2 t2Var) {
        m36167j2();
        if (t2Var == null) {
            t2Var = C6280t2.f30329d;
        }
        if (!this.f29825t0.f30294n.equals(t2Var)) {
            C6275r2 f = this.f29825t0.mo21528f(t2Var);
            this.f29768H++;
            this.f29806k.mo21414S0(t2Var);
            m36159g2(f, 0, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: c1 */
    public Looper mo21172c1() {
        return this.f29822s;
    }

    /* renamed from: c2 */
    public void mo21173c2(boolean z) {
        m36167j2();
        this.f29761A.mo21217p(mo21183i(), 1);
        m36150d2(z, (C6264q) null);
        this.f29807k0 = C4868e.f25792b;
    }

    /* renamed from: d */
    public boolean mo21174d() {
        m36167j2();
        return this.f29825t0.f30282b.mo6886b();
    }

    /* renamed from: d1 */
    public long mo21175d1() {
        m36167j2();
        if (this.f29825t0.f30281a.mo21451u()) {
            return this.f29831w0;
        }
        C6275r2 r2Var = this.f29825t0;
        if (r2Var.f30291k.f5273d != r2Var.f30282b.f5273d) {
            return r2Var.f30281a.mo21450r(mo21154A(), this.f29854a).mo21478f();
        }
        long j = r2Var.f30296p;
        if (this.f29825t0.f30291k.mo6886b()) {
            C6275r2 r2Var2 = this.f29825t0;
            C6266q3.C6268b l = r2Var2.f30281a.mo21149l(r2Var2.f30291k.f5270a, this.f29812n);
            long i = l.mo21460i(this.f29825t0.f30291k.f5271b);
            j = i == Long.MIN_VALUE ? l.f30187d : i;
        }
        C6275r2 r2Var3 = this.f29825t0;
        return C5953m0.m35117Y0(m36122R1(r2Var3.f30281a, r2Var3.f30291k, j));
    }

    /* renamed from: e */
    public C6280t2 mo21176e() {
        m36167j2();
        return this.f29825t0.f30294n;
    }

    /* renamed from: f */
    public void mo21177f(boolean z) {
        m36167j2();
        if (this.f29805j0 != z) {
            this.f29805j0 = z;
            m36132V1(1, 9, Boolean.valueOf(z));
            this.f29808l.mo20650k(23, new C13412o0(z));
        }
    }

    /* renamed from: g */
    public long mo21178g() {
        m36167j2();
        return C5953m0.m35117Y0(this.f29825t0.f30297q);
    }

    public int getAudioSessionId() {
        m36167j2();
        return this.f29799g0;
    }

    public long getCurrentPosition() {
        m36167j2();
        return C5953m0.m35117Y0(m36152e1(this.f29825t0));
    }

    public long getDuration() {
        m36167j2();
        if (!mo21174d()) {
            return mo21240J();
        }
        C6275r2 r2Var = this.f29825t0;
        C1772x.C1774b bVar = r2Var.f30282b;
        r2Var.f30281a.mo21149l(bVar.f5270a, this.f29812n);
        return C5953m0.m35117Y0(this.f29812n.mo21454e(bVar.f5271b, bVar.f5272c));
    }

    /* renamed from: h */
    public void mo21182h(int i, long j) {
        int i2 = i;
        long j2 = j;
        m36167j2();
        this.f29820r.mo36N();
        C6266q3 q3Var = this.f29825t0.f30281a;
        if (i2 < 0 || (!q3Var.mo21451u() && i2 >= q3Var.mo6761t())) {
            throw new C6289v1(q3Var, i, j2);
        }
        int i3 = 1;
        this.f29768H++;
        if (mo21174d()) {
            C5961r.m35215i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            C6250n1.C6255e eVar = new C6250n1.C6255e(this.f29825t0);
            eVar.mo21429b(1);
            this.f29804j.mo21433a(eVar);
            return;
        }
        if (mo21162N() != 1) {
            i3 = 2;
        }
        int A = mo21154A();
        C6275r2 O1 = m36114O1(this.f29825t0.mo21529g(i3), q3Var, m36117P1(q3Var, i, j2));
        this.f29806k.mo21410B0(q3Var, i, C5953m0.m35071B0(j));
        m36159g2(O1, 0, 1, true, true, 1, m36152e1(O1), A);
    }

    /* renamed from: i */
    public boolean mo21183i() {
        m36167j2();
        return this.f29825t0.f30292l;
    }

    /* renamed from: i1 */
    public C6264q mo21189p() {
        m36167j2();
        return this.f29825t0.f30286f;
    }

    /* renamed from: j */
    public void mo21185j(boolean z) {
        m36167j2();
        if (this.f29767G != z) {
            this.f29767G = z;
            this.f29806k.mo21416X0(z);
            this.f29808l.mo20648i(9, new C13409n0(z));
            m36153e2();
            this.f29808l.mo20647f();
        }
    }

    /* renamed from: k */
    public int mo21186k() {
        m36167j2();
        if (this.f29825t0.f30281a.mo21451u()) {
            return this.f29829v0;
        }
        C6275r2 r2Var = this.f29825t0;
        return r2Var.f30281a.mo6809f(r2Var.f30282b.f5270a);
    }

    /* renamed from: l */
    public void mo21187l(C6282u2.C6287d dVar) {
        C5917a.m34872e(dVar);
        this.f29808l.mo20644c(dVar);
    }

    /* renamed from: n */
    public int mo21188n() {
        m36167j2();
        if (mo21174d()) {
            return this.f29825t0.f30282b.f5272c;
        }
        return -1;
    }

    /* renamed from: q */
    public void mo21190q(boolean z) {
        m36167j2();
        int p = this.f29761A.mo21217p(z, mo21162N());
        m36156f2(z, p, m36161h1(z, p));
    }

    /* renamed from: r */
    public long mo21191r() {
        m36167j2();
        if (!mo21174d()) {
            return getCurrentPosition();
        }
        C6275r2 r2Var = this.f29825t0;
        r2Var.f30281a.mo21149l(r2Var.f30282b.f5270a, this.f29812n);
        C6275r2 r2Var2 = this.f29825t0;
        if (r2Var2.f30283c == -9223372036854775807L) {
            return r2Var2.f30281a.mo21450r(mo21154A(), this.f29854a).mo21475d();
        }
        return this.f29812n.mo21467p() + C5953m0.m35117Y0(this.f29825t0.f30283c);
    }

    /* renamed from: s */
    public long mo21192s() {
        m36167j2();
        if (!mo21174d()) {
            return mo21175d1();
        }
        C6275r2 r2Var = this.f29825t0;
        if (r2Var.f30291k.equals(r2Var.f30282b)) {
            return C5953m0.m35117Y0(this.f29825t0.f30296p);
        }
        return getDuration();
    }

    public void setVolume(float f) {
        m36167j2();
        float p = C5953m0.m35150p(f, 0.0f, 1.0f);
        if (this.f29803i0 != p) {
            this.f29803i0 = p;
            m36135W1();
            this.f29808l.mo20650k(22, new C13405m0(p));
        }
    }

    public void stop() {
        m36167j2();
        mo21173c2(false);
    }

    /* renamed from: v */
    public C6272r1 mo21195v() {
        m36167j2();
        return this.f29778R;
    }

    /* renamed from: w */
    public C6290v3 mo21196w() {
        m36167j2();
        return this.f29825t0.f30289i.f28543d;
    }

    /* renamed from: x */
    public void mo21197x(boolean z) {
        m36167j2();
        this.f29806k.mo21425v(z);
        Iterator<C6276s.C6277a> it = this.f29810m.iterator();
        while (it.hasNext()) {
            it.next().mo21202E(z);
        }
    }

    /* renamed from: z */
    public int mo21198z() {
        m36167j2();
        if (mo21174d()) {
            return this.f29825t0.f30282b.f5271b;
        }
        return -1;
    }
}
