package p177z1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p004a2.C0010a;
import p004a2.C0079u1;
import p015b3.C1690b;
import p015b3.C1749q0;
import p015b3.C1757s0;
import p015b3.C1765u;
import p015b3.C1772x;
import p015b3.C1780z0;
import p030d2.C4042o;
import p079k3.C4882o;
import p127r2.C5432a;
import p127r2.C5441g;
import p149u3.C5717b0;
import p149u3.C5720c0;
import p149u3.C5735s;
import p155v3.C5798f;
import p155v3.C5830m;
import p161w3.C5917a;
import p161w3.C5923d;
import p161w3.C5953m0;
import p161w3.C5954n;
import p161w3.C5961r;
import p177z1.C6211d3;
import p177z1.C6237l;
import p177z1.C6239l2;
import p177z1.C6266q3;
import p177z1.C6297y2;
import p177z1.C6300z1;
import p182a7.C6444t;
import p190b7.C6678p0;
import p190b7.C6685q;

/* renamed from: z1.n1 */
/* compiled from: ExoPlayerImplInternal */
final class C6250n1 implements Handler.Callback, C1765u.C1766a, C5717b0.C5718a, C6239l2.C6243d, C6237l.C6238a, C6297y2.C6298a {

    /* renamed from: A */
    private final C6228i2 f30085A;

    /* renamed from: B */
    private final C6239l2 f30086B;

    /* renamed from: C */
    private final C6292w1 f30087C;

    /* renamed from: D */
    private final long f30088D;

    /* renamed from: E */
    private C6229i3 f30089E;

    /* renamed from: F */
    private C6275r2 f30090F;

    /* renamed from: G */
    private C6255e f30091G;

    /* renamed from: H */
    private boolean f30092H;

    /* renamed from: I */
    private boolean f30093I;

    /* renamed from: J */
    private boolean f30094J;

    /* renamed from: K */
    private boolean f30095K;

    /* renamed from: L */
    private boolean f30096L;

    /* renamed from: M */
    private int f30097M;

    /* renamed from: N */
    private boolean f30098N;

    /* renamed from: O */
    private boolean f30099O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f30100P;

    /* renamed from: Q */
    private boolean f30101Q;

    /* renamed from: R */
    private int f30102R;

    /* renamed from: S */
    private C6258h f30103S;

    /* renamed from: a */
    private final C6211d3[] f30104a;

    /* renamed from: a0 */
    private long f30105a0;

    /* renamed from: b */
    private final Set<C6211d3> f30106b;

    /* renamed from: b0 */
    private int f30107b0;

    /* renamed from: c */
    private final C6220f3[] f30108c;

    /* renamed from: c0 */
    private boolean f30109c0;

    /* renamed from: d */
    private final C5717b0 f30110d;

    /* renamed from: d0 */
    private C6264q f30111d0;

    /* renamed from: e */
    private final C5720c0 f30112e;

    /* renamed from: e0 */
    private long f30113e0;

    /* renamed from: f */
    private final C6295x1 f30114f;

    /* renamed from: f0 */
    private long f30115f0 = -9223372036854775807L;

    /* renamed from: g */
    private final C5798f f30116g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5954n f30117h;

    /* renamed from: i */
    private final HandlerThread f30118i;

    /* renamed from: r */
    private final Looper f30119r;

    /* renamed from: s */
    private final C6266q3.C6270d f30120s;

    /* renamed from: t */
    private final C6266q3.C6268b f30121t;

    /* renamed from: u */
    private final long f30122u;

    /* renamed from: v */
    private final boolean f30123v;

    /* renamed from: w */
    private final C6237l f30124w;

    /* renamed from: x */
    private final ArrayList<C6254d> f30125x;

    /* renamed from: y */
    private final C5923d f30126y;

    /* renamed from: z */
    private final C6256f f30127z;

    /* renamed from: z1.n1$a */
    /* compiled from: ExoPlayerImplInternal */
    class C6251a implements C6211d3.C6212a {
        C6251a() {
        }

        /* renamed from: a */
        public void mo21236a() {
            boolean unused = C6250n1.this.f30100P = true;
        }

        /* renamed from: b */
        public void mo21237b() {
            C6250n1.this.f30117h.mo20601e(2);
        }
    }

    /* renamed from: z1.n1$b */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C6252b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C6239l2.C6242c> f30129a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1757s0 f30130b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f30131c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f30132d;

        /* synthetic */ C6252b(List list, C1757s0 s0Var, int i, long j, C6251a aVar) {
            this(list, s0Var, i, j);
        }

        private C6252b(List<C6239l2.C6242c> list, C1757s0 s0Var, int i, long j) {
            this.f30129a = list;
            this.f30130b = s0Var;
            this.f30131c = i;
            this.f30132d = j;
        }
    }

    /* renamed from: z1.n1$c */
    /* compiled from: ExoPlayerImplInternal */
    private static class C6253c {

        /* renamed from: a */
        public final int f30133a;

        /* renamed from: b */
        public final int f30134b;

        /* renamed from: c */
        public final int f30135c;

        /* renamed from: d */
        public final C1757s0 f30136d;
    }

    /* renamed from: z1.n1$d */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C6254d implements Comparable<C6254d> {

        /* renamed from: a */
        public final C6297y2 f30137a;

        /* renamed from: b */
        public int f30138b;

        /* renamed from: c */
        public long f30139c;

        /* renamed from: d */
        public Object f30140d;

        public C6254d(C6297y2 y2Var) {
            this.f30137a = y2Var;
        }

        /* renamed from: a */
        public int compareTo(C6254d dVar) {
            Object obj = this.f30140d;
            if ((obj == null) != (dVar.f30140d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.f30138b - dVar.f30138b;
            if (i != 0) {
                return i;
            }
            return C5953m0.m35148o(this.f30139c, dVar.f30139c);
        }

        /* renamed from: b */
        public void mo21427b(int i, long j, Object obj) {
            this.f30138b = i;
            this.f30139c = j;
            this.f30140d = obj;
        }
    }

    /* renamed from: z1.n1$e */
    /* compiled from: ExoPlayerImplInternal */
    public static final class C6255e {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f30141a;

        /* renamed from: b */
        public C6275r2 f30142b;

        /* renamed from: c */
        public int f30143c;

        /* renamed from: d */
        public boolean f30144d;

        /* renamed from: e */
        public int f30145e;

        /* renamed from: f */
        public boolean f30146f;

        /* renamed from: g */
        public int f30147g;

        public C6255e(C6275r2 r2Var) {
            this.f30142b = r2Var;
        }

        /* renamed from: b */
        public void mo21429b(int i) {
            this.f30141a |= i > 0;
            this.f30143c += i;
        }

        /* renamed from: c */
        public void mo21430c(int i) {
            this.f30141a = true;
            this.f30146f = true;
            this.f30147g = i;
        }

        /* renamed from: d */
        public void mo21431d(C6275r2 r2Var) {
            this.f30141a |= this.f30142b != r2Var;
            this.f30142b = r2Var;
        }

        /* renamed from: e */
        public void mo21432e(int i) {
            boolean z = true;
            if (!this.f30144d || this.f30145e == 5) {
                this.f30141a = true;
                this.f30144d = true;
                this.f30145e = i;
                return;
            }
            if (i != 5) {
                z = false;
            }
            C5917a.m34868a(z);
        }
    }

    /* renamed from: z1.n1$f */
    /* compiled from: ExoPlayerImplInternal */
    public interface C6256f {
        /* renamed from: a */
        void mo21433a(C6255e eVar);
    }

    /* renamed from: z1.n1$g */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C6257g {

        /* renamed from: a */
        public final C1772x.C1774b f30148a;

        /* renamed from: b */
        public final long f30149b;

        /* renamed from: c */
        public final long f30150c;

        /* renamed from: d */
        public final boolean f30151d;

        /* renamed from: e */
        public final boolean f30152e;

        /* renamed from: f */
        public final boolean f30153f;

        public C6257g(C1772x.C1774b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f30148a = bVar;
            this.f30149b = j;
            this.f30150c = j2;
            this.f30151d = z;
            this.f30152e = z2;
            this.f30153f = z3;
        }
    }

    /* renamed from: z1.n1$h */
    /* compiled from: ExoPlayerImplInternal */
    private static final class C6258h {

        /* renamed from: a */
        public final C6266q3 f30154a;

        /* renamed from: b */
        public final int f30155b;

        /* renamed from: c */
        public final long f30156c;

        public C6258h(C6266q3 q3Var, int i, long j) {
            this.f30154a = q3Var;
            this.f30155b = i;
            this.f30156c = j;
        }
    }

    public C6250n1(C6211d3[] d3VarArr, C5717b0 b0Var, C5720c0 c0Var, C6295x1 x1Var, C5798f fVar, int i, boolean z, C0010a aVar, C6229i3 i3Var, C6292w1 w1Var, long j, boolean z2, Looper looper, C5923d dVar, C6256f fVar2, C0079u1 u1Var) {
        C6211d3[] d3VarArr2 = d3VarArr;
        C5798f fVar3 = fVar;
        C0010a aVar2 = aVar;
        long j2 = j;
        C5923d dVar2 = dVar;
        C0079u1 u1Var2 = u1Var;
        this.f30127z = fVar2;
        this.f30104a = d3VarArr2;
        this.f30110d = b0Var;
        this.f30112e = c0Var;
        this.f30114f = x1Var;
        this.f30116g = fVar3;
        this.f30097M = i;
        this.f30098N = z;
        this.f30089E = i3Var;
        this.f30087C = w1Var;
        this.f30088D = j2;
        this.f30113e0 = j2;
        this.f30093I = z2;
        this.f30126y = dVar2;
        this.f30122u = x1Var.mo21359b();
        this.f30123v = x1Var.mo21358a();
        C6275r2 j3 = C6275r2.m36970j(c0Var);
        this.f30090F = j3;
        this.f30091G = new C6255e(j3);
        this.f30108c = new C6220f3[d3VarArr2.length];
        for (int i2 = 0; i2 < d3VarArr2.length; i2++) {
            d3VarArr2[i2].mo21226n(i2, u1Var2);
            this.f30108c[i2] = d3VarArr2[i2].mo21225k();
        }
        this.f30124w = new C6237l(this, dVar2);
        this.f30125x = new ArrayList<>();
        this.f30106b = C6678p0.m38433h();
        this.f30120s = new C6266q3.C6270d();
        this.f30121t = new C6266q3.C6268b();
        b0Var.mo20134b(this, fVar3);
        this.f30109c0 = true;
        Handler handler = new Handler(looper);
        this.f30085A = new C6228i2(aVar2, handler);
        this.f30086B = new C6239l2(this, aVar2, handler, u1Var2);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f30118i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f30119r = looper2;
        this.f30117h = dVar2.mo20587c(looper2, this);
    }

    /* renamed from: A */
    private long m36665A() {
        C6219f2 q = this.f30085A.mo21337q();
        if (q == null) {
            return 0;
        }
        long l = q.mo21305l();
        if (!q.f29936d) {
            return l;
        }
        int i = 0;
        while (true) {
            C6211d3[] d3VarArr = this.f30104a;
            if (i >= d3VarArr.length) {
                return l;
            }
            if (m36695R(d3VarArr[i]) && this.f30104a[i].mo21229s() == q.f29935c[i]) {
                long u = this.f30104a[i].mo21233u();
                if (u == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l = Math.max(u, l);
            }
            i++;
        }
    }

    /* renamed from: A0 */
    private void m36666A0(long j, long j2) {
        this.f30117h.mo20604h(2, j + j2);
    }

    /* renamed from: B */
    private Pair<C1772x.C1774b, Long> m36667B(C6266q3 q3Var) {
        long j = 0;
        if (q3Var.mo21451u()) {
            return Pair.create(C6275r2.m36971k(), 0L);
        }
        C6266q3 q3Var2 = q3Var;
        Pair<Object, Long> n = q3Var2.mo21448n(this.f30120s, this.f30121t, q3Var.mo6808e(this.f30098N), -9223372036854775807L);
        C1772x.C1774b B = this.f30085A.mo21325B(q3Var, n.first, 0);
        long longValue = ((Long) n.second).longValue();
        if (B.mo6886b()) {
            q3Var.mo21149l(B.f5270a, this.f30121t);
            if (B.f5272c == this.f30121t.mo21465n(B.f5271b)) {
                j = this.f30121t.mo21461j();
            }
            longValue = j;
        }
        return Pair.create(B, Long.valueOf(longValue));
    }

    /* renamed from: C0 */
    private void m36668C0(boolean z) throws C6264q {
        C1772x.C1774b bVar = this.f30085A.mo21336p().f29938f.f29949a;
        long F0 = m36674F0(bVar, this.f30090F.f30298r, true, false);
        if (F0 != this.f30090F.f30298r) {
            C6275r2 r2Var = this.f30090F;
            this.f30090F = m36687M(bVar, F0, r2Var.f30283c, r2Var.f30284d, z, 5);
        }
    }

    /* renamed from: D */
    private long m36669D() {
        return m36671E(this.f30090F.f30296p);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ab A[Catch:{ all -> 0x0147 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ae A[Catch:{ all -> 0x0147 }] */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m36670D0(p177z1.C6250n1.C6258h r20) throws p177z1.C6264q {
        /*
            r19 = this;
            r11 = r19
            r0 = r20
            z1.n1$e r1 = r11.f30091G
            r8 = 1
            r1.mo21429b(r8)
            z1.r2 r1 = r11.f30090F
            z1.q3 r1 = r1.f30281a
            int r4 = r11.f30097M
            boolean r5 = r11.f30098N
            z1.q3$d r6 = r11.f30120s
            z1.q3$b r7 = r11.f30121t
            r3 = 1
            r2 = r20
            android.util.Pair r1 = m36762y0(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 0
            if (r1 != 0) goto L_0x004b
            z1.r2 r7 = r11.f30090F
            z1.q3 r7 = r7.f30281a
            android.util.Pair r7 = r11.m36667B(r7)
            java.lang.Object r9 = r7.first
            b3.x$b r9 = (p015b3.C1772x.C1774b) r9
            java.lang.Object r7 = r7.second
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            z1.r2 r7 = r11.f30090F
            z1.q3 r7 = r7.f30281a
            boolean r7 = r7.mo21451u()
            r7 = r7 ^ r8
            r10 = r7
            r17 = r4
        L_0x0047:
            r4 = r12
            r12 = r17
            goto L_0x00a1
        L_0x004b:
            java.lang.Object r7 = r1.first
            java.lang.Object r9 = r1.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            long r9 = r0.f30156c
            int r14 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x005d
            r9 = r4
            goto L_0x005e
        L_0x005d:
            r9 = r12
        L_0x005e:
            z1.i2 r14 = r11.f30085A
            z1.r2 r15 = r11.f30090F
            z1.q3 r15 = r15.f30281a
            b3.x$b r7 = r14.mo21325B(r15, r7, r12)
            boolean r14 = r7.mo6886b()
            if (r14 == 0) goto L_0x0093
            z1.r2 r4 = r11.f30090F
            z1.q3 r4 = r4.f30281a
            java.lang.Object r5 = r7.f5270a
            z1.q3$b r12 = r11.f30121t
            r4.mo21149l(r5, r12)
            z1.q3$b r4 = r11.f30121t
            int r5 = r7.f5271b
            int r4 = r4.mo21465n(r5)
            int r5 = r7.f5272c
            if (r4 != r5) goto L_0x008d
            z1.q3$b r4 = r11.f30121t
            long r4 = r4.mo21461j()
            r12 = r4
            goto L_0x008e
        L_0x008d:
            r12 = r2
        L_0x008e:
            r4 = r12
            r12 = r9
            r10 = 1
            r9 = r7
            goto L_0x00a1
        L_0x0093:
            long r14 = r0.f30156c
            int r16 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r16 != 0) goto L_0x009b
            r4 = 1
            goto L_0x009c
        L_0x009b:
            r4 = 0
        L_0x009c:
            r17 = r9
            r10 = r4
            r9 = r7
            goto L_0x0047
        L_0x00a1:
            z1.r2 r7 = r11.f30090F     // Catch:{ all -> 0x0147 }
            z1.q3 r7 = r7.f30281a     // Catch:{ all -> 0x0147 }
            boolean r7 = r7.mo21451u()     // Catch:{ all -> 0x0147 }
            if (r7 == 0) goto L_0x00ae
            r11.f30103S = r0     // Catch:{ all -> 0x0147 }
            goto L_0x00bd
        L_0x00ae:
            r0 = 4
            if (r1 != 0) goto L_0x00c0
            z1.r2 r1 = r11.f30090F     // Catch:{ all -> 0x0147 }
            int r1 = r1.f30285e     // Catch:{ all -> 0x0147 }
            if (r1 == r8) goto L_0x00ba
            r11.m36711a1(r0)     // Catch:{ all -> 0x0147 }
        L_0x00ba:
            r11.m36750r0(r6, r8, r6, r8)     // Catch:{ all -> 0x0147 }
        L_0x00bd:
            r7 = r4
            goto L_0x0134
        L_0x00c0:
            z1.r2 r1 = r11.f30090F     // Catch:{ all -> 0x0147 }
            b3.x$b r1 = r1.f30282b     // Catch:{ all -> 0x0147 }
            boolean r1 = r9.equals(r1)     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x010f
            z1.i2 r1 = r11.f30085A     // Catch:{ all -> 0x0147 }
            z1.f2 r1 = r1.mo21336p()     // Catch:{ all -> 0x0147 }
            if (r1 == 0) goto L_0x00e3
            boolean r7 = r1.f29936d     // Catch:{ all -> 0x0147 }
            if (r7 == 0) goto L_0x00e3
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00e3
            b3.u r1 = r1.f29933a     // Catch:{ all -> 0x0147 }
            z1.i3 r2 = r11.f30089E     // Catch:{ all -> 0x0147 }
            long r1 = r1.mo6681c(r4, r2)     // Catch:{ all -> 0x0147 }
            goto L_0x00e4
        L_0x00e3:
            r1 = r4
        L_0x00e4:
            long r14 = p161w3.C5953m0.m35117Y0(r1)     // Catch:{ all -> 0x0147 }
            z1.r2 r3 = r11.f30090F     // Catch:{ all -> 0x0147 }
            long r6 = r3.f30298r     // Catch:{ all -> 0x0147 }
            long r6 = p161w3.C5953m0.m35117Y0(r6)     // Catch:{ all -> 0x0147 }
            int r3 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0110
            z1.r2 r3 = r11.f30090F     // Catch:{ all -> 0x0147 }
            int r6 = r3.f30285e     // Catch:{ all -> 0x0147 }
            r7 = 2
            if (r6 == r7) goto L_0x00fe
            r7 = 3
            if (r6 != r7) goto L_0x0110
        L_0x00fe:
            long r7 = r3.f30298r     // Catch:{ all -> 0x0147 }
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            z1.r2 r0 = r1.m36687M(r2, r3, r5, r7, r9, r10)
            r11.f30090F = r0
            return
        L_0x010f:
            r1 = r4
        L_0x0110:
            z1.r2 r3 = r11.f30090F     // Catch:{ all -> 0x0147 }
            int r3 = r3.f30285e     // Catch:{ all -> 0x0147 }
            if (r3 != r0) goto L_0x0118
            r0 = 1
            goto L_0x0119
        L_0x0118:
            r0 = 0
        L_0x0119:
            long r14 = r11.m36672E0(r9, r1, r0)     // Catch:{ all -> 0x0147 }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
            goto L_0x0123
        L_0x0122:
            r8 = 0
        L_0x0123:
            r8 = r8 | r10
            z1.r2 r0 = r11.f30090F     // Catch:{ all -> 0x0143 }
            z1.q3 r4 = r0.f30281a     // Catch:{ all -> 0x0143 }
            b3.x$b r5 = r0.f30282b     // Catch:{ all -> 0x0143 }
            r1 = r19
            r2 = r4
            r3 = r9
            r6 = r12
            r1.m36742o1(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0143 }
            r10 = r8
            r7 = r14
        L_0x0134:
            r0 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r0
            z1.r2 r0 = r1.m36687M(r2, r3, r5, r7, r9, r10)
            r11.f30090F = r0
            return
        L_0x0143:
            r0 = move-exception
            r10 = r8
            r7 = r14
            goto L_0x0149
        L_0x0147:
            r0 = move-exception
            r7 = r4
        L_0x0149:
            r14 = 2
            r1 = r19
            r2 = r9
            r3 = r7
            r5 = r12
            r9 = r10
            r10 = r14
            z1.r2 r1 = r1.m36687M(r2, r3, r5, r7, r9, r10)
            r11.f30090F = r1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6250n1.m36670D0(z1.n1$h):void");
    }

    /* renamed from: E */
    private long m36671E(long j) {
        C6219f2 j2 = this.f30085A.mo21334j();
        if (j2 == null) {
            return 0;
        }
        return Math.max(0, j - j2.mo21316y(this.f30105a0));
    }

    /* renamed from: E0 */
    private long m36672E0(C1772x.C1774b bVar, long j, boolean z) throws C6264q {
        return m36674F0(bVar, j, this.f30085A.mo21336p() != this.f30085A.mo21337q(), z);
    }

    /* renamed from: F */
    private void m36673F(C1765u uVar) {
        if (this.f30085A.mo21339v(uVar)) {
            this.f30085A.mo21340y(this.f30105a0);
            m36703W();
        }
    }

    /* renamed from: F0 */
    private long m36674F0(C1772x.C1774b bVar, long j, boolean z, boolean z2) throws C6264q {
        m36730j1();
        this.f30095K = false;
        if (z2 || this.f30090F.f30285e == 3) {
            m36711a1(2);
        }
        C6219f2 p = this.f30085A.mo21336p();
        C6219f2 f2Var = p;
        while (f2Var != null && !bVar.equals(f2Var.f29938f.f29949a)) {
            f2Var = f2Var.mo21303j();
        }
        if (z || p != f2Var || (f2Var != null && f2Var.mo21317z(j) < 0)) {
            for (C6211d3 o : this.f30104a) {
                m36741o(o);
            }
            if (f2Var != null) {
                while (this.f30085A.mo21336p() != f2Var) {
                    this.f30085A.mo21330b();
                }
                this.f30085A.mo21341z(f2Var);
                f2Var.mo21315x(1000000000000L);
                m36749r();
            }
        }
        if (f2Var != null) {
            this.f30085A.mo21341z(f2Var);
            if (!f2Var.f29936d) {
                f2Var.f29938f = f2Var.f29938f.mo21319b(j);
            } else if (f2Var.f29937e) {
                long m = f2Var.f29933a.mo6691m(j);
                f2Var.f29933a.mo6697t(m - this.f30122u, this.f30123v);
                j = m;
            }
            m36754t0(j);
            m36703W();
        } else {
            this.f30085A.mo21332f();
            m36754t0(j);
        }
        m36677H(false);
        this.f30117h.mo20601e(2);
        return j;
    }

    /* renamed from: G */
    private void m36675G(IOException iOException, int i) {
        C6264q h = C6264q.m36813h(iOException, i);
        C6219f2 p = this.f30085A.mo21336p();
        if (p != null) {
            h = h.mo21440f(p.f29938f.f29949a);
        }
        C5961r.m35210d("ExoPlayerImplInternal", "Playback error", h);
        m36728i1(false, false);
        this.f30090F = this.f30090F.mo21527e(h);
    }

    /* renamed from: G0 */
    private void m36676G0(C6297y2 y2Var) throws C6264q {
        if (y2Var.mo21575f() == -9223372036854775807L) {
            m36678H0(y2Var);
        } else if (this.f30090F.f30281a.mo21451u()) {
            this.f30125x.add(new C6254d(y2Var));
        } else {
            C6254d dVar = new C6254d(y2Var);
            C6266q3 q3Var = this.f30090F.f30281a;
            if (m36756v0(dVar, q3Var, q3Var, this.f30097M, this.f30098N, this.f30120s, this.f30121t)) {
                this.f30125x.add(dVar);
                Collections.sort(this.f30125x);
                return;
            }
            y2Var.mo21580k(false);
        }
    }

    /* renamed from: H */
    private void m36677H(boolean z) {
        long j;
        C6219f2 j2 = this.f30085A.mo21334j();
        C1772x.C1774b bVar = j2 == null ? this.f30090F.f30282b : j2.f29938f.f29949a;
        boolean z2 = !this.f30090F.f30291k.equals(bVar);
        if (z2) {
            this.f30090F = this.f30090F.mo21524b(bVar);
        }
        C6275r2 r2Var = this.f30090F;
        if (j2 == null) {
            j = r2Var.f30298r;
        } else {
            j = j2.mo21302i();
        }
        r2Var.f30296p = j;
        this.f30090F.f30297q = m36669D();
        if ((z2 || z) && j2 != null && j2.f29936d) {
            m36734l1(j2.mo21307n(), j2.mo21308o());
        }
    }

    /* renamed from: H0 */
    private void m36678H0(C6297y2 y2Var) throws C6264q {
        if (y2Var.mo21572c() == this.f30119r) {
            m36738n(y2Var);
            int i = this.f30090F.f30285e;
            if (i == 3 || i == 2) {
                this.f30117h.mo20601e(2);
                return;
            }
            return;
        }
        this.f30117h.mo20606j(15, y2Var).mo20608a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x019c  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m36679I(p177z1.C6266q3 r25, boolean r26) throws p177z1.C6264q {
        /*
            r24 = this;
            r11 = r24
            r12 = r25
            z1.r2 r2 = r11.f30090F
            z1.n1$h r3 = r11.f30103S
            z1.i2 r4 = r11.f30085A
            int r5 = r11.f30097M
            boolean r6 = r11.f30098N
            z1.q3$d r7 = r11.f30120s
            z1.q3$b r8 = r11.f30121t
            r1 = r25
            z1.n1$g r7 = m36760x0(r1, r2, r3, r4, r5, r6, r7, r8)
            b3.x$b r8 = r7.f30148a
            long r9 = r7.f30150c
            boolean r0 = r7.f30151d
            long r13 = r7.f30149b
            z1.r2 r1 = r11.f30090F
            b3.x$b r1 = r1.f30282b
            boolean r1 = r1.equals(r8)
            r15 = 1
            r5 = 0
            if (r1 == 0) goto L_0x0038
            z1.r2 r1 = r11.f30090F
            long r1 = r1.f30298r
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r16 = 0
            goto L_0x003a
        L_0x0038:
            r16 = 1
        L_0x003a:
            r17 = 3
            r6 = 0
            r18 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = 4
            boolean r1 = r7.f30152e     // Catch:{ all -> 0x0121 }
            if (r1 == 0) goto L_0x0053
            z1.r2 r1 = r11.f30090F     // Catch:{ all -> 0x0121 }
            int r1 = r1.f30285e     // Catch:{ all -> 0x0121 }
            if (r1 == r15) goto L_0x0050
            r11.m36711a1(r4)     // Catch:{ all -> 0x0121 }
        L_0x0050:
            r11.m36750r0(r5, r5, r5, r15)     // Catch:{ all -> 0x0121 }
        L_0x0053:
            if (r16 != 0) goto L_0x006f
            z1.i2 r1 = r11.f30085A     // Catch:{ all -> 0x0121 }
            long r3 = r11.f30105a0     // Catch:{ all -> 0x0121 }
            long r21 = r24.m36665A()     // Catch:{ all -> 0x0121 }
            r2 = r25
            r15 = -1
            r20 = 4
            r15 = 0
            r5 = r21
            boolean r0 = r1.mo21327F(r2, r3, r5)     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x00a1
            r11.m36668C0(r15)     // Catch:{ all -> 0x011e }
            goto L_0x00a1
        L_0x006f:
            r15 = 0
            r20 = 4
            boolean r1 = r25.mo21451u()     // Catch:{ all -> 0x011e }
            if (r1 != 0) goto L_0x00a1
            z1.i2 r1 = r11.f30085A     // Catch:{ all -> 0x011e }
            z1.f2 r1 = r1.mo21336p()     // Catch:{ all -> 0x011e }
        L_0x007e:
            if (r1 == 0) goto L_0x009c
            z1.g2 r2 = r1.f29938f     // Catch:{ all -> 0x011e }
            b3.x$b r2 = r2.f29949a     // Catch:{ all -> 0x011e }
            boolean r2 = r2.equals(r8)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x0097
            z1.i2 r2 = r11.f30085A     // Catch:{ all -> 0x011e }
            z1.g2 r3 = r1.f29938f     // Catch:{ all -> 0x011e }
            z1.g2 r2 = r2.mo21338r(r12, r3)     // Catch:{ all -> 0x011e }
            r1.f29938f = r2     // Catch:{ all -> 0x011e }
            r1.mo21298A()     // Catch:{ all -> 0x011e }
        L_0x0097:
            z1.f2 r1 = r1.mo21303j()     // Catch:{ all -> 0x011e }
            goto L_0x007e
        L_0x009c:
            long r0 = r11.m36672E0(r8, r13, r0)     // Catch:{ all -> 0x011e }
            r13 = r0
        L_0x00a1:
            z1.r2 r0 = r11.f30090F
            z1.q3 r4 = r0.f30281a
            b3.x$b r5 = r0.f30282b
            boolean r0 = r7.f30153f
            if (r0 == 0) goto L_0x00ad
            r6 = r13
            goto L_0x00af
        L_0x00ad:
            r6 = r18
        L_0x00af:
            r1 = r24
            r2 = r25
            r3 = r8
            r1.m36742o1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x00c1
            z1.r2 r0 = r11.f30090F
            long r0 = r0.f30283c
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00ff
        L_0x00c1:
            z1.r2 r0 = r11.f30090F
            b3.x$b r1 = r0.f30282b
            java.lang.Object r1 = r1.f5270a
            z1.q3 r0 = r0.f30281a
            if (r16 == 0) goto L_0x00e0
            if (r26 == 0) goto L_0x00e0
            boolean r2 = r0.mo21451u()
            if (r2 != 0) goto L_0x00e0
            z1.q3$b r2 = r11.f30121t
            z1.q3$b r0 = r0.mo21149l(r1, r2)
            boolean r0 = r0.f30189f
            if (r0 != 0) goto L_0x00e0
            r23 = 1
            goto L_0x00e2
        L_0x00e0:
            r23 = 0
        L_0x00e2:
            z1.r2 r0 = r11.f30090F
            long r5 = r0.f30284d
            int r0 = r12.mo6809f(r1)
            r1 = -1
            if (r0 != r1) goto L_0x00ef
            r17 = 4
        L_0x00ef:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            z1.r2 r0 = r1.m36687M(r2, r3, r5, r7, r9, r10)
            r11.f30090F = r0
        L_0x00ff:
            r24.m36752s0()
            z1.r2 r0 = r11.f30090F
            z1.q3 r0 = r0.f30281a
            r11.m36758w0(r12, r0)
            z1.r2 r0 = r11.f30090F
            z1.r2 r0 = r0.mo21531i(r12)
            r11.f30090F = r0
            boolean r0 = r25.mo21451u()
            if (r0 != 0) goto L_0x011a
            r6 = 0
            r11.f30103S = r6
        L_0x011a:
            r11.m36677H(r15)
            return
        L_0x011e:
            r0 = move-exception
            r6 = 0
            goto L_0x0125
        L_0x0121:
            r0 = move-exception
            r15 = 0
            r20 = 4
        L_0x0125:
            z1.r2 r1 = r11.f30090F
            z1.q3 r4 = r1.f30281a
            b3.x$b r5 = r1.f30282b
            boolean r1 = r7.f30153f
            if (r1 == 0) goto L_0x0131
            r18 = r13
        L_0x0131:
            r1 = r24
            r2 = r25
            r3 = r8
            r15 = r6
            r6 = r18
            r1.m36742o1(r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x0146
            z1.r2 r1 = r11.f30090F
            long r1 = r1.f30283c
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0184
        L_0x0146:
            z1.r2 r1 = r11.f30090F
            b3.x$b r2 = r1.f30282b
            java.lang.Object r2 = r2.f5270a
            z1.q3 r1 = r1.f30281a
            if (r16 == 0) goto L_0x0165
            if (r26 == 0) goto L_0x0165
            boolean r3 = r1.mo21451u()
            if (r3 != 0) goto L_0x0165
            z1.q3$b r3 = r11.f30121t
            z1.q3$b r1 = r1.mo21149l(r2, r3)
            boolean r1 = r1.f30189f
            if (r1 != 0) goto L_0x0165
            r23 = 1
            goto L_0x0167
        L_0x0165:
            r23 = 0
        L_0x0167:
            z1.r2 r1 = r11.f30090F
            long r5 = r1.f30284d
            int r1 = r12.mo6809f(r2)
            r2 = -1
            if (r1 != r2) goto L_0x0174
            r17 = 4
        L_0x0174:
            r1 = r24
            r2 = r8
            r3 = r13
            r7 = r5
            r5 = r9
            r9 = r23
            r10 = r17
            z1.r2 r1 = r1.m36687M(r2, r3, r5, r7, r9, r10)
            r11.f30090F = r1
        L_0x0184:
            r24.m36752s0()
            z1.r2 r1 = r11.f30090F
            z1.q3 r1 = r1.f30281a
            r11.m36758w0(r12, r1)
            z1.r2 r1 = r11.f30090F
            z1.r2 r1 = r1.mo21531i(r12)
            r11.f30090F = r1
            boolean r1 = r25.mo21451u()
            if (r1 != 0) goto L_0x019e
            r11.f30103S = r15
        L_0x019e:
            r1 = 0
            r11.m36677H(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6250n1.m36679I(z1.q3, boolean):void");
    }

    /* renamed from: I0 */
    private void m36680I0(C6297y2 y2Var) {
        Looper c = y2Var.mo21572c();
        if (!c.getThread().isAlive()) {
            C5961r.m35215i("TAG", "Trying to send message on a dead thread.");
            y2Var.mo21580k(false);
            return;
        }
        this.f30126y.mo20587c(c, (Handler.Callback) null).mo20598b(new C13406m1(this, y2Var));
    }

    /* renamed from: J */
    private void m36681J(C1765u uVar) throws C6264q {
        if (this.f30085A.mo21339v(uVar)) {
            C6219f2 j = this.f30085A.mo21334j();
            j.mo21309p(this.f30124w.mo6485e().f30331a, this.f30090F.f30281a);
            m36734l1(j.mo21307n(), j.mo21308o());
            if (j == this.f30085A.mo21336p()) {
                m36754t0(j.f29938f.f29950b);
                m36749r();
                C6275r2 r2Var = this.f30090F;
                C1772x.C1774b bVar = r2Var.f30282b;
                long j2 = j.f29938f.f29950b;
                this.f30090F = m36687M(bVar, j2, r2Var.f30283c, j2, false, 5);
            }
            m36703W();
        }
    }

    /* renamed from: J0 */
    private void m36682J0(long j) {
        for (C6211d3 d3Var : this.f30104a) {
            if (d3Var.mo21229s() != null) {
                m36684K0(d3Var, j);
            }
        }
    }

    /* renamed from: K */
    private void m36683K(C6280t2 t2Var, float f, boolean z, boolean z2) throws C6264q {
        if (z) {
            if (z2) {
                this.f30091G.mo21429b(1);
            }
            this.f30090F = this.f30090F.mo21528f(t2Var);
        }
        m36745p1(t2Var.f30331a);
        for (C6211d3 d3Var : this.f30104a) {
            if (d3Var != null) {
                d3Var.mo19501m(f, t2Var.f30331a);
            }
        }
    }

    /* renamed from: K0 */
    private void m36684K0(C6211d3 d3Var, long j) {
        d3Var.mo21224j();
        if (d3Var instanceof C4882o) {
            ((C4882o) d3Var).mo18663Y(j);
        }
    }

    /* renamed from: L */
    private void m36685L(C6280t2 t2Var, boolean z) throws C6264q {
        m36683K(t2Var, t2Var.f30331a, true, z);
    }

    /* renamed from: L0 */
    private void m36686L0(boolean z, AtomicBoolean atomicBoolean) {
        if (this.f30099O != z) {
            this.f30099O = z;
            if (!z) {
                for (C6211d3 d3Var : this.f30104a) {
                    if (!m36695R(d3Var) && this.f30106b.remove(d3Var)) {
                        d3Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* renamed from: M */
    private C6275r2 m36687M(C1772x.C1774b bVar, long j, long j2, long j3, boolean z, int i) {
        C6685q<C5432a> qVar;
        C5720c0 c0Var;
        C1780z0 z0Var;
        C1780z0 z0Var2;
        C5720c0 c0Var2;
        C1772x.C1774b bVar2 = bVar;
        long j4 = j2;
        this.f30109c0 = this.f30109c0 || j != this.f30090F.f30298r || !bVar.equals(this.f30090F.f30282b);
        m36752s0();
        C6275r2 r2Var = this.f30090F;
        C1780z0 z0Var3 = r2Var.f30288h;
        C5720c0 c0Var3 = r2Var.f30289i;
        List<C5432a> list = r2Var.f30290j;
        if (this.f30086B.mo21389s()) {
            C6219f2 p = this.f30085A.mo21336p();
            if (p == null) {
                z0Var2 = C1780z0.f5294d;
            } else {
                z0Var2 = p.mo21307n();
            }
            if (p == null) {
                c0Var2 = this.f30112e;
            } else {
                c0Var2 = p.mo21308o();
            }
            C6685q<C5432a> w = m36757w(c0Var2.f28542c);
            if (p != null) {
                C6222g2 g2Var = p.f29938f;
                if (g2Var.f29951c != j4) {
                    p.f29938f = g2Var.mo21318a(j4);
                }
            }
            z0Var = z0Var2;
            c0Var = c0Var2;
            qVar = w;
        } else if (!bVar.equals(this.f30090F.f30282b)) {
            z0Var = C1780z0.f5294d;
            c0Var = this.f30112e;
            qVar = C6685q.m38445x();
        } else {
            qVar = list;
            z0Var = z0Var3;
            c0Var = c0Var3;
        }
        if (z) {
            this.f30091G.mo21432e(i);
        }
        return this.f30090F.mo21525c(bVar, j, j2, j3, m36669D(), z0Var, c0Var, qVar);
    }

    /* renamed from: M0 */
    private void m36688M0(C6252b bVar) throws C6264q {
        this.f30091G.mo21429b(1);
        if (bVar.f30131c != -1) {
            this.f30103S = new C6258h(new C6318z2(bVar.f30129a, bVar.f30130b), bVar.f30131c, bVar.f30132d);
        }
        m36679I(this.f30086B.mo21383C(bVar.f30129a, bVar.f30130b), false);
    }

    /* renamed from: N */
    private boolean m36689N(C6211d3 d3Var, C6219f2 f2Var) {
        C6219f2 j = f2Var.mo21303j();
        return f2Var.f29938f.f29954f && j.f29936d && ((d3Var instanceof C4882o) || (d3Var instanceof C5441g) || d3Var.mo21233u() >= j.mo21306m());
    }

    /* renamed from: O */
    private boolean m36690O() {
        C6219f2 q = this.f30085A.mo21337q();
        if (!q.f29936d) {
            return false;
        }
        int i = 0;
        while (true) {
            C6211d3[] d3VarArr = this.f30104a;
            if (i >= d3VarArr.length) {
                return true;
            }
            C6211d3 d3Var = d3VarArr[i];
            C1749q0 q0Var = q.f29935c[i];
            if (d3Var.mo21229s() != q0Var || (q0Var != null && !d3Var.mo21222h() && !m36689N(d3Var, q))) {
                return false;
            }
            i++;
        }
        return false;
    }

    /* renamed from: O0 */
    private void m36691O0(boolean z) {
        if (z != this.f30101Q) {
            this.f30101Q = z;
            if (!z && this.f30090F.f30295o) {
                this.f30117h.mo20601e(2);
            }
        }
    }

    /* renamed from: P */
    private static boolean m36692P(boolean z, C1772x.C1774b bVar, long j, C1772x.C1774b bVar2, C6266q3.C6268b bVar3, long j2) {
        if (z || j != j2 || !bVar.f5270a.equals(bVar2.f5270a)) {
            return false;
        }
        if (!bVar.mo6886b() || !bVar3.mo21471t(bVar.f5271b)) {
            if (!bVar2.mo6886b() || !bVar3.mo21471t(bVar2.f5271b)) {
                return false;
            }
            return true;
        } else if (bVar3.mo21462k(bVar.f5271b, bVar.f5272c) == 4 || bVar3.mo21462k(bVar.f5271b, bVar.f5272c) == 2) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: P0 */
    private void m36693P0(boolean z) throws C6264q {
        this.f30093I = z;
        m36752s0();
        if (this.f30094J && this.f30085A.mo21337q() != this.f30085A.mo21336p()) {
            m36668C0(true);
            m36677H(false);
        }
    }

    /* renamed from: Q */
    private boolean m36694Q() {
        C6219f2 j = this.f30085A.mo21334j();
        if (j == null || j.mo21304k() == Long.MIN_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    private static boolean m36695R(C6211d3 d3Var) {
        return d3Var.getState() != 0;
    }

    /* renamed from: R0 */
    private void m36696R0(boolean z, int i, boolean z2, int i2) throws C6264q {
        this.f30091G.mo21429b(z2 ? 1 : 0);
        this.f30091G.mo21430c(i2);
        this.f30090F = this.f30090F.mo21526d(z, i);
        this.f30095K = false;
        m36723g0(z);
        if (!m36717d1()) {
            m36730j1();
            m36740n1();
            return;
        }
        int i3 = this.f30090F.f30285e;
        if (i3 == 3) {
            m36724g1();
            this.f30117h.mo20601e(2);
        } else if (i3 == 2) {
            this.f30117h.mo20601e(2);
        }
    }

    /* renamed from: S */
    private boolean m36697S() {
        C6219f2 p = this.f30085A.mo21336p();
        long j = p.f29938f.f29953e;
        return p.f29936d && (j == -9223372036854775807L || this.f30090F.f30298r < j || !m36717d1());
    }

    /* renamed from: T */
    private static boolean m36698T(C6275r2 r2Var, C6266q3.C6268b bVar) {
        C1772x.C1774b bVar2 = r2Var.f30282b;
        C6266q3 q3Var = r2Var.f30281a;
        return q3Var.mo21451u() || q3Var.mo21149l(bVar2.f5270a, bVar).f30189f;
    }

    /* renamed from: T0 */
    private void m36699T0(C6280t2 t2Var) throws C6264q {
        this.f30124w.mo6483c(t2Var);
        m36685L(this.f30124w.mo6485e(), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ Boolean m36700U() {
        return Boolean.valueOf(this.f30092H);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ void m36701V(C6297y2 y2Var) {
        try {
            m36738n(y2Var);
        } catch (C6264q e) {
            C5961r.m35210d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* renamed from: V0 */
    private void m36702V0(int i) throws C6264q {
        this.f30097M = i;
        if (!this.f30085A.mo21328G(this.f30090F.f30281a, i)) {
            m36668C0(true);
        }
        m36677H(false);
    }

    /* renamed from: W */
    private void m36703W() {
        boolean c1 = m36715c1();
        this.f30096L = c1;
        if (c1) {
            this.f30085A.mo21334j().mo21301d(this.f30105a0);
        }
        m36733k1();
    }

    /* renamed from: W0 */
    private void m36704W0(C6229i3 i3Var) {
        this.f30089E = i3Var;
    }

    /* renamed from: X */
    private void m36705X() {
        this.f30091G.mo21431d(this.f30090F);
        if (this.f30091G.f30141a) {
            this.f30127z.mo21433a(this.f30091G);
            this.f30091G = new C6255e(this.f30090F);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090 A[LOOP:1: B:24:0x0074->B:34:0x0090, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0062 A[EDGE_INSN: B:65:0x0062->B:20:0x0062 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0073 A[EDGE_INSN: B:72:0x0073->B:23:0x0073 ?: BREAK  , SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m36706Y(long r8, long r10) throws p177z1.C6264q {
        /*
            r7 = this;
            java.util.ArrayList<z1.n1$d> r0 = r7.f30125x
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f7
            z1.r2 r0 = r7.f30090F
            b3.x$b r0 = r0.f30282b
            boolean r0 = r0.mo6886b()
            if (r0 == 0) goto L_0x0014
            goto L_0x00f7
        L_0x0014:
            boolean r0 = r7.f30109c0
            if (r0 == 0) goto L_0x001e
            r0 = 1
            long r8 = r8 - r0
            r0 = 0
            r7.f30109c0 = r0
        L_0x001e:
            z1.r2 r0 = r7.f30090F
            z1.q3 r1 = r0.f30281a
            b3.x$b r0 = r0.f30282b
            java.lang.Object r0 = r0.f5270a
            int r0 = r1.mo6809f(r0)
            int r1 = r7.f30107b0
            java.util.ArrayList<z1.n1$d> r2 = r7.f30125x
            int r2 = r2.size()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            z1.n1$d r3 = (p177z1.C6250n1.C6254d) r3
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            if (r3 == 0) goto L_0x0062
            int r4 = r3.f30138b
            if (r4 > r0) goto L_0x0053
            if (r4 != r0) goto L_0x0062
            long r3 = r3.f30139c
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x0062
        L_0x0053:
            int r1 = r1 + -1
            if (r1 <= 0) goto L_0x0044
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            int r4 = r1 + -1
            java.lang.Object r3 = r3.get(r4)
            z1.n1$d r3 = (p177z1.C6250n1.C6254d) r3
            goto L_0x0045
        L_0x0062:
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            java.lang.Object r3 = r3.get(r1)
            z1.n1$d r3 = (p177z1.C6250n1.C6254d) r3
            goto L_0x0074
        L_0x0073:
            r3 = r2
        L_0x0074:
            if (r3 == 0) goto L_0x0099
            java.lang.Object r4 = r3.f30140d
            if (r4 == 0) goto L_0x0099
            int r4 = r3.f30138b
            if (r4 < r0) goto L_0x0086
            if (r4 != r0) goto L_0x0099
            long r4 = r3.f30139c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0099
        L_0x0086:
            int r1 = r1 + 1
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x0073
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            java.lang.Object r3 = r3.get(r1)
            z1.n1$d r3 = (p177z1.C6250n1.C6254d) r3
            goto L_0x0074
        L_0x0099:
            if (r3 == 0) goto L_0x00f5
            java.lang.Object r4 = r3.f30140d
            if (r4 == 0) goto L_0x00f5
            int r4 = r3.f30138b
            if (r4 != r0) goto L_0x00f5
            long r4 = r3.f30139c
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x00f5
            z1.y2 r4 = r3.f30137a     // Catch:{ all -> 0x00de }
            r7.m36678H0(r4)     // Catch:{ all -> 0x00de }
            z1.y2 r4 = r3.f30137a
            boolean r4 = r4.mo21571b()
            if (r4 != 0) goto L_0x00c6
            z1.y2 r3 = r3.f30137a
            boolean r3 = r3.mo21579j()
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c6
        L_0x00c3:
            int r1 = r1 + 1
            goto L_0x00cb
        L_0x00c6:
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            r3.remove(r1)
        L_0x00cb:
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x00dc
            java.util.ArrayList<z1.n1$d> r3 = r7.f30125x
            java.lang.Object r3 = r3.get(r1)
            z1.n1$d r3 = (p177z1.C6250n1.C6254d) r3
            goto L_0x0099
        L_0x00dc:
            r3 = r2
            goto L_0x0099
        L_0x00de:
            r8 = move-exception
            z1.y2 r9 = r3.f30137a
            boolean r9 = r9.mo21571b()
            if (r9 != 0) goto L_0x00ef
            z1.y2 r9 = r3.f30137a
            boolean r9 = r9.mo21579j()
            if (r9 == 0) goto L_0x00f4
        L_0x00ef:
            java.util.ArrayList<z1.n1$d> r9 = r7.f30125x
            r9.remove(r1)
        L_0x00f4:
            throw r8
        L_0x00f5:
            r7.f30107b0 = r1
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6250n1.m36706Y(long, long):void");
    }

    /* renamed from: Y0 */
    private void m36707Y0(boolean z) throws C6264q {
        this.f30098N = z;
        if (!this.f30085A.mo21329H(this.f30090F.f30281a, z)) {
            m36668C0(true);
        }
        m36677H(false);
    }

    /* renamed from: Z */
    private void m36708Z() throws C6264q {
        C6222g2 o;
        this.f30085A.mo21340y(this.f30105a0);
        if (this.f30085A.mo21326D() && (o = this.f30085A.mo21335o(this.f30105a0, this.f30090F)) != null) {
            C6219f2 g = this.f30085A.mo21333g(this.f30108c, this.f30110d, this.f30114f.mo21364g(), this.f30086B, o, this.f30112e);
            g.f29933a.mo6695r(this, o.f29950b);
            if (this.f30085A.mo21336p() == g) {
                m36754t0(o.f29950b);
            }
            m36677H(false);
        }
        if (this.f30096L) {
            this.f30096L = m36694Q();
            m36733k1();
            return;
        }
        m36703W();
    }

    /* renamed from: Z0 */
    private void m36709Z0(C1757s0 s0Var) throws C6264q {
        this.f30091G.mo21429b(1);
        m36679I(this.f30086B.mo21384D(s0Var), false);
    }

    /* renamed from: a0 */
    private void m36710a0() throws C6264q {
        boolean z;
        boolean z2 = false;
        while (m36713b1()) {
            if (z2) {
                m36705X();
            }
            C6219f2 f2Var = (C6219f2) C5917a.m34872e(this.f30085A.mo21330b());
            if (this.f30090F.f30282b.f5270a.equals(f2Var.f29938f.f29949a.f5270a)) {
                C1772x.C1774b bVar = this.f30090F.f30282b;
                if (bVar.f5271b == -1) {
                    C1772x.C1774b bVar2 = f2Var.f29938f.f29949a;
                    if (bVar2.f5271b == -1 && bVar.f5274e != bVar2.f5274e) {
                        z = true;
                        C6222g2 g2Var = f2Var.f29938f;
                        C1772x.C1774b bVar3 = g2Var.f29949a;
                        long j = g2Var.f29950b;
                        this.f30090F = m36687M(bVar3, j, g2Var.f29951c, j, !z, 0);
                        m36752s0();
                        m36740n1();
                        z2 = true;
                    }
                }
            }
            z = false;
            C6222g2 g2Var2 = f2Var.f29938f;
            C1772x.C1774b bVar32 = g2Var2.f29949a;
            long j2 = g2Var2.f29950b;
            this.f30090F = m36687M(bVar32, j2, g2Var2.f29951c, j2, !z, 0);
            m36752s0();
            m36740n1();
            z2 = true;
        }
    }

    /* renamed from: a1 */
    private void m36711a1(int i) {
        C6275r2 r2Var = this.f30090F;
        if (r2Var.f30285e != i) {
            if (i != 2) {
                this.f30115f0 = -9223372036854775807L;
            }
            this.f30090F = r2Var.mo21529g(i);
        }
    }

    /* renamed from: b0 */
    private void m36712b0() {
        C6219f2 q = this.f30085A.mo21337q();
        if (q != null) {
            int i = 0;
            if (q.mo21303j() == null || this.f30094J) {
                if (q.f29938f.f29957i || this.f30094J) {
                    while (true) {
                        C6211d3[] d3VarArr = this.f30104a;
                        if (i < d3VarArr.length) {
                            C6211d3 d3Var = d3VarArr[i];
                            C1749q0 q0Var = q.f29935c[i];
                            if (q0Var != null && d3Var.mo21229s() == q0Var && d3Var.mo21222h()) {
                                long j = q.f29938f.f29953e;
                                m36684K0(d3Var, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : q.mo21305l() + q.f29938f.f29953e);
                            }
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } else if (m36690O()) {
                if (q.mo21303j().f29936d || this.f30105a0 >= q.mo21303j().mo21306m()) {
                    C5720c0 o = q.mo21308o();
                    C6219f2 c = this.f30085A.mo21331c();
                    C5720c0 o2 = c.mo21308o();
                    C6266q3 q3Var = this.f30090F.f30281a;
                    m36742o1(q3Var, c.f29938f.f29949a, q3Var, q.f29938f.f29949a, -9223372036854775807L);
                    if (!c.f29936d || c.f29933a.mo6694p() == -9223372036854775807L) {
                        for (int i2 = 0; i2 < this.f30104a.length; i2++) {
                            boolean c2 = o.mo20160c(i2);
                            boolean c3 = o2.mo20160c(i2);
                            if (c2 && !this.f30104a[i2].mo21235w()) {
                                boolean z = this.f30108c[i2].mo21220g() == -2;
                                C6223g3 g3Var = o.f28541b[i2];
                                C6223g3 g3Var2 = o2.f28541b[i2];
                                if (!c3 || !g3Var2.equals(g3Var) || z) {
                                    m36684K0(this.f30104a[i2], c.mo21306m());
                                }
                            }
                        }
                        return;
                    }
                    m36682J0(c.mo21306m());
                }
            }
        }
    }

    /* renamed from: b1 */
    private boolean m36713b1() {
        C6219f2 p;
        C6219f2 j;
        if (m36717d1() && !this.f30094J && (p = this.f30085A.mo21336p()) != null && (j = p.mo21303j()) != null && this.f30105a0 >= j.mo21306m() && j.f29939g) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private void m36714c0() throws C6264q {
        C6219f2 q = this.f30085A.mo21337q();
        if (q != null && this.f30085A.mo21336p() != q && !q.f29939g && m36744p0()) {
            m36749r();
        }
    }

    /* renamed from: c1 */
    private boolean m36715c1() {
        long j;
        if (!m36694Q()) {
            return false;
        }
        C6219f2 j2 = this.f30085A.mo21334j();
        long E = m36671E(j2.mo21304k());
        if (j2 == this.f30085A.mo21336p()) {
            j = j2.mo21316y(this.f30105a0);
        } else {
            j = j2.mo21316y(this.f30105a0) - j2.f29938f.f29950b;
        }
        return this.f30114f.mo21363f(j, E, this.f30124w.mo6485e().f30331a);
    }

    /* renamed from: d0 */
    private void m36716d0() throws C6264q {
        m36679I(this.f30086B.mo21387i(), true);
    }

    /* renamed from: d1 */
    private boolean m36717d1() {
        C6275r2 r2Var = this.f30090F;
        return r2Var.f30292l && r2Var.f30293m == 0;
    }

    /* renamed from: e0 */
    private void m36719e0(C6253c cVar) throws C6264q {
        this.f30091G.mo21429b(1);
        m36679I(this.f30086B.mo21390v(cVar.f30133a, cVar.f30134b, cVar.f30135c, cVar.f30136d), false);
    }

    /* renamed from: e1 */
    private boolean m36720e1(boolean z) {
        if (this.f30102R == 0) {
            return m36697S();
        }
        if (!z) {
            return false;
        }
        C6275r2 r2Var = this.f30090F;
        if (!r2Var.f30287g) {
            return true;
        }
        long b = m36722f1(r2Var.f30281a, this.f30085A.mo21336p().f29938f.f29949a) ? this.f30087C.mo21346b() : -9223372036854775807L;
        C6219f2 j = this.f30085A.mo21334j();
        boolean z2 = j.mo21310q() && j.f29938f.f29957i;
        boolean z3 = j.f29938f.f29949a.mo6886b() && !j.f29936d;
        if (z2 || z3 || this.f30114f.mo21362e(m36669D(), this.f30124w.mo6485e().f30331a, this.f30095K, b)) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private void m36721f0() {
        for (C6219f2 p = this.f30085A.mo21336p(); p != null; p = p.mo21303j()) {
            for (C5735s sVar : p.mo21308o().f28542c) {
                if (sVar != null) {
                    sVar.mo20156t();
                }
            }
        }
    }

    /* renamed from: f1 */
    private boolean m36722f1(C6266q3 q3Var, C1772x.C1774b bVar) {
        if (bVar.mo6886b() || q3Var.mo21451u()) {
            return false;
        }
        q3Var.mo21450r(q3Var.mo21149l(bVar.f5270a, this.f30121t).f30186c, this.f30120s);
        if (!this.f30120s.mo21480h()) {
            return false;
        }
        C6266q3.C6270d dVar = this.f30120s;
        if (!dVar.f30207i || dVar.f30204f == -9223372036854775807L) {
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    private void m36723g0(boolean z) {
        for (C6219f2 p = this.f30085A.mo21336p(); p != null; p = p.mo21303j()) {
            for (C5735s sVar : p.mo21308o().f28542c) {
                if (sVar != null) {
                    sVar.mo20152l(z);
                }
            }
        }
    }

    /* renamed from: g1 */
    private void m36724g1() throws C6264q {
        this.f30095K = false;
        this.f30124w.mo21378g();
        for (C6211d3 d3Var : this.f30104a) {
            if (m36695R(d3Var)) {
                d3Var.start();
            }
        }
    }

    /* renamed from: h0 */
    private void m36726h0() {
        for (C6219f2 p = this.f30085A.mo21336p(); p != null; p = p.mo21303j()) {
            for (C5735s sVar : p.mo21308o().f28542c) {
                if (sVar != null) {
                    sVar.mo20157u();
                }
            }
        }
    }

    /* renamed from: i1 */
    private void m36728i1(boolean z, boolean z2) {
        m36750r0(z || !this.f30099O, false, true, false);
        this.f30091G.mo21429b(z2 ? 1 : 0);
        this.f30114f.mo21365h();
        m36711a1(1);
    }

    /* renamed from: j1 */
    private void m36730j1() throws C6264q {
        this.f30124w.mo21379h();
        for (C6211d3 d3Var : this.f30104a) {
            if (m36695R(d3Var)) {
                m36753t(d3Var);
            }
        }
    }

    /* renamed from: k */
    private void m36731k(C6252b bVar, int i) throws C6264q {
        this.f30091G.mo21429b(1);
        C6239l2 l2Var = this.f30086B;
        if (i == -1) {
            i = l2Var.mo21388q();
        }
        m36679I(l2Var.mo21385f(i, bVar.f30129a, bVar.f30130b), false);
    }

    /* renamed from: k0 */
    private void m36732k0() {
        this.f30091G.mo21429b(1);
        m36750r0(false, false, false, true);
        this.f30114f.onPrepared();
        m36711a1(this.f30090F.f30281a.mo21451u() ? 4 : 2);
        this.f30086B.mo21391w(this.f30116g.mo20319f());
        this.f30117h.mo20601e(2);
    }

    /* renamed from: k1 */
    private void m36733k1() {
        C6219f2 j = this.f30085A.mo21334j();
        boolean z = this.f30096L || (j != null && j.f29933a.isLoading());
        C6275r2 r2Var = this.f30090F;
        if (z != r2Var.f30287g) {
            this.f30090F = r2Var.mo21523a(z);
        }
    }

    /* renamed from: l1 */
    private void m36734l1(C1780z0 z0Var, C5720c0 c0Var) {
        this.f30114f.mo21360c(this.f30104a, z0Var, c0Var.f28542c);
    }

    /* renamed from: m */
    private void m36735m() throws C6264q {
        m36668C0(true);
    }

    /* renamed from: m0 */
    private void m36736m0() {
        m36750r0(true, false, true, false);
        this.f30114f.mo21361d();
        m36711a1(1);
        this.f30118i.quit();
        synchronized (this) {
            this.f30092H = true;
            notifyAll();
        }
    }

    /* renamed from: m1 */
    private void m36737m1() throws C6264q, IOException {
        if (!this.f30090F.f30281a.mo21451u() && this.f30086B.mo21389s()) {
            m36708Z();
            m36712b0();
            m36714c0();
            m36710a0();
        }
    }

    /* renamed from: n */
    private void m36738n(C6297y2 y2Var) throws C6264q {
        if (!y2Var.mo21579j()) {
            try {
                y2Var.mo21576g().mo6490r(y2Var.mo21578i(), y2Var.mo21574e());
            } finally {
                y2Var.mo21580k(true);
            }
        }
    }

    /* renamed from: n0 */
    private void m36739n0(int i, int i2, C1757s0 s0Var) throws C6264q {
        this.f30091G.mo21429b(1);
        m36679I(this.f30086B.mo21382A(i, i2, s0Var), false);
    }

    /* renamed from: n1 */
    private void m36740n1() throws C6264q {
        C6219f2 p = this.f30085A.mo21336p();
        if (p != null) {
            long p2 = p.f29936d ? p.f29933a.mo6694p() : -9223372036854775807L;
            if (p2 != -9223372036854775807L) {
                m36754t0(p2);
                if (p2 != this.f30090F.f30298r) {
                    C6275r2 r2Var = this.f30090F;
                    this.f30090F = m36687M(r2Var.f30282b, p2, r2Var.f30283c, p2, true, 5);
                }
            } else {
                long i = this.f30124w.mo21380i(p != this.f30085A.mo21337q());
                this.f30105a0 = i;
                long y = p.mo21316y(i);
                m36706Y(this.f30090F.f30298r, y);
                this.f30090F.f30298r = y;
            }
            this.f30090F.f30296p = this.f30085A.mo21334j().mo21302i();
            this.f30090F.f30297q = m36669D();
            C6275r2 r2Var2 = this.f30090F;
            if (r2Var2.f30292l && r2Var2.f30285e == 3 && m36722f1(r2Var2.f30281a, r2Var2.f30282b) && this.f30090F.f30294n.f30331a == 1.0f) {
                float a = this.f30087C.mo21345a(m36759x(), m36669D());
                if (this.f30124w.mo6485e().f30331a != a) {
                    this.f30124w.mo6483c(this.f30090F.f30294n.mo21538e(a));
                    m36683K(this.f30090F.f30294n, this.f30124w.mo6485e().f30331a, false, false);
                }
            }
        }
    }

    /* renamed from: o */
    private void m36741o(C6211d3 d3Var) throws C6264q {
        if (m36695R(d3Var)) {
            this.f30124w.mo21375a(d3Var);
            m36753t(d3Var);
            d3Var.mo21219f();
            this.f30102R--;
        }
    }

    /* renamed from: o1 */
    private void m36742o1(C6266q3 q3Var, C1772x.C1774b bVar, C6266q3 q3Var2, C1772x.C1774b bVar2, long j) {
        if (!m36722f1(q3Var, bVar)) {
            C6280t2 t2Var = bVar.mo6886b() ? C6280t2.f30329d : this.f30090F.f30294n;
            if (!this.f30124w.mo6485e().equals(t2Var)) {
                this.f30124w.mo6483c(t2Var);
                return;
            }
            return;
        }
        q3Var.mo21450r(q3Var.mo21149l(bVar.f5270a, this.f30121t).f30186c, this.f30120s);
        this.f30087C.mo21348d((C6300z1.C6309g) C5953m0.m35138j(this.f30120s.f30209s));
        if (j != -9223372036854775807L) {
            this.f30087C.mo21349e(m36763z(q3Var, bVar.f5270a, j));
            return;
        }
        Object obj = this.f30120s.f30199a;
        Object obj2 = null;
        if (!q3Var2.mo21451u()) {
            obj2 = q3Var2.mo21450r(q3Var2.mo21149l(bVar2.f5270a, this.f30121t).f30186c, this.f30120s).f30199a;
        }
        if (!C5953m0.m35124c(obj2, obj)) {
            this.f30087C.mo21349e(-9223372036854775807L);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m36743p() throws p177z1.C6264q, java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            w3.d r1 = r0.f30126y
            long r1 = r1.mo20585a()
            w3.n r3 = r0.f30117h
            r4 = 2
            r3.mo20605i(r4)
            r16.m36737m1()
            z1.r2 r3 = r0.f30090F
            int r3 = r3.f30285e
            r5 = 1
            if (r3 == r5) goto L_0x01f8
            r6 = 4
            if (r3 != r6) goto L_0x001d
            goto L_0x01f8
        L_0x001d:
            z1.i2 r3 = r0.f30085A
            z1.f2 r3 = r3.mo21336p()
            r7 = 10
            if (r3 != 0) goto L_0x002b
            r0.m36666A0(r1, r7)
            return
        L_0x002b:
            java.lang.String r9 = "doSomeWork"
            p161w3.C5945j0.m35044a(r9)
            r16.m36740n1()
            boolean r9 = r3.f29936d
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 0
            if (r9 == 0) goto L_0x00ac
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r13 = r13 * r10
            b3.u r9 = r3.f29933a
            z1.r2 r15 = r0.f30090F
            long r7 = r15.f30298r
            long r10 = r0.f30122u
            long r7 = r7 - r10
            boolean r10 = r0.f30123v
            r9.mo6697t(r7, r10)
            r7 = 0
            r8 = 1
            r9 = 1
        L_0x0051:
            z1.d3[] r10 = r0.f30104a
            int r11 = r10.length
            if (r7 >= r11) goto L_0x00b3
            r10 = r10[r7]
            boolean r11 = m36695R(r10)
            if (r11 != 0) goto L_0x005f
            goto L_0x00a7
        L_0x005f:
            long r4 = r0.f30105a0
            r10.mo18666p(r4, r13)
            if (r8 == 0) goto L_0x006e
            boolean r4 = r10.mo6484d()
            if (r4 == 0) goto L_0x006e
            r8 = 1
            goto L_0x006f
        L_0x006e:
            r8 = 0
        L_0x006f:
            b3.q0[] r4 = r3.f29935c
            r4 = r4[r7]
            b3.q0 r5 = r10.mo21229s()
            if (r4 == r5) goto L_0x007b
            r4 = 1
            goto L_0x007c
        L_0x007b:
            r4 = 0
        L_0x007c:
            if (r4 != 0) goto L_0x0086
            boolean r5 = r10.mo21222h()
            if (r5 == 0) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            if (r4 != 0) goto L_0x009a
            if (r5 != 0) goto L_0x009a
            boolean r4 = r10.isReady()
            if (r4 != 0) goto L_0x009a
            boolean r4 = r10.mo6484d()
            if (r4 == 0) goto L_0x0098
            goto L_0x009a
        L_0x0098:
            r4 = 0
            goto L_0x009b
        L_0x009a:
            r4 = 1
        L_0x009b:
            if (r9 == 0) goto L_0x00a1
            if (r4 == 0) goto L_0x00a1
            r9 = 1
            goto L_0x00a2
        L_0x00a1:
            r9 = 0
        L_0x00a2:
            if (r4 != 0) goto L_0x00a7
            r10.mo21232t()
        L_0x00a7:
            int r7 = r7 + 1
            r4 = 2
            r5 = 1
            goto L_0x0051
        L_0x00ac:
            b3.u r4 = r3.f29933a
            r4.mo6690k()
            r8 = 1
            r9 = 1
        L_0x00b3:
            z1.g2 r4 = r3.f29938f
            long r4 = r4.f29953e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x00d0
            boolean r7 = r3.f29936d
            if (r7 == 0) goto L_0x00d0
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x00ce
            z1.r2 r7 = r0.f30090F
            long r7 = r7.f30298r
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x00d0
        L_0x00ce:
            r4 = 1
            goto L_0x00d1
        L_0x00d0:
            r4 = 0
        L_0x00d1:
            if (r4 == 0) goto L_0x00e1
            boolean r5 = r0.f30094J
            if (r5 == 0) goto L_0x00e1
            r0.f30094J = r12
            z1.r2 r5 = r0.f30090F
            int r5 = r5.f30293m
            r7 = 5
            r0.m36696R0(r12, r5, r12, r7)
        L_0x00e1:
            r5 = 3
            if (r4 == 0) goto L_0x00f1
            z1.g2 r4 = r3.f29938f
            boolean r4 = r4.f29957i
            if (r4 == 0) goto L_0x00f1
            r0.m36711a1(r6)
            r16.m36730j1()
            goto L_0x013a
        L_0x00f1:
            z1.r2 r4 = r0.f30090F
            int r4 = r4.f30285e
            r7 = 2
            if (r4 != r7) goto L_0x010e
            boolean r4 = r0.m36720e1(r9)
            if (r4 == 0) goto L_0x010e
            r0.m36711a1(r5)
            r4 = 0
            r0.f30111d0 = r4
            boolean r4 = r16.m36717d1()
            if (r4 == 0) goto L_0x013a
            r16.m36724g1()
            goto L_0x013a
        L_0x010e:
            z1.r2 r4 = r0.f30090F
            int r4 = r4.f30285e
            if (r4 != r5) goto L_0x013a
            int r4 = r0.f30102R
            if (r4 != 0) goto L_0x011f
            boolean r4 = r16.m36697S()
            if (r4 == 0) goto L_0x0121
            goto L_0x013a
        L_0x011f:
            if (r9 != 0) goto L_0x013a
        L_0x0121:
            boolean r4 = r16.m36717d1()
            r0.f30095K = r4
            r4 = 2
            r0.m36711a1(r4)
            boolean r4 = r0.f30095K
            if (r4 == 0) goto L_0x0137
            r16.m36726h0()
            z1.w1 r4 = r0.f30087C
            r4.mo21347c()
        L_0x0137:
            r16.m36730j1()
        L_0x013a:
            z1.r2 r4 = r0.f30090F
            int r4 = r4.f30285e
            r7 = 2
            if (r4 != r7) goto L_0x017e
            r4 = 0
        L_0x0142:
            z1.d3[] r7 = r0.f30104a
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0167
            r7 = r7[r4]
            boolean r7 = m36695R(r7)
            if (r7 == 0) goto L_0x0164
            z1.d3[] r7 = r0.f30104a
            r7 = r7[r4]
            b3.q0 r7 = r7.mo21229s()
            b3.q0[] r8 = r3.f29935c
            r8 = r8[r4]
            if (r7 != r8) goto L_0x0164
            z1.d3[] r7 = r0.f30104a
            r7 = r7[r4]
            r7.mo21232t()
        L_0x0164:
            int r4 = r4 + 1
            goto L_0x0142
        L_0x0167:
            z1.r2 r3 = r0.f30090F
            boolean r4 = r3.f30287g
            if (r4 != 0) goto L_0x017e
            long r3 = r3.f30297q
            r7 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x017e
            boolean r3 = r16.m36694Q()
            if (r3 == 0) goto L_0x017e
            r3 = 1
            goto L_0x017f
        L_0x017e:
            r3 = 0
        L_0x017f:
            if (r3 != 0) goto L_0x0184
            r0.f30115f0 = r13
            goto L_0x01a2
        L_0x0184:
            long r3 = r0.f30115f0
            int r7 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0193
            w3.d r3 = r0.f30126y
            long r3 = r3.mo20586b()
            r0.f30115f0 = r3
            goto L_0x01a2
        L_0x0193:
            w3.d r3 = r0.f30126y
            long r3 = r3.mo20586b()
            long r7 = r0.f30115f0
            long r3 = r3 - r7
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x01f0
        L_0x01a2:
            boolean r3 = r16.m36717d1()
            if (r3 == 0) goto L_0x01b0
            z1.r2 r3 = r0.f30090F
            int r3 = r3.f30285e
            if (r3 != r5) goto L_0x01b0
            r3 = 1
            goto L_0x01b1
        L_0x01b0:
            r3 = 0
        L_0x01b1:
            boolean r4 = r0.f30101Q
            if (r4 == 0) goto L_0x01bd
            boolean r4 = r0.f30100P
            if (r4 == 0) goto L_0x01bd
            if (r3 == 0) goto L_0x01bd
            r15 = 1
            goto L_0x01be
        L_0x01bd:
            r15 = 0
        L_0x01be:
            z1.r2 r4 = r0.f30090F
            boolean r7 = r4.f30295o
            if (r7 == r15) goto L_0x01ca
            z1.r2 r4 = r4.mo21530h(r15)
            r0.f30090F = r4
        L_0x01ca:
            r0.f30100P = r12
            if (r15 != 0) goto L_0x01ef
            z1.r2 r4 = r0.f30090F
            int r4 = r4.f30285e
            if (r4 != r6) goto L_0x01d5
            goto L_0x01ef
        L_0x01d5:
            if (r3 != 0) goto L_0x01e7
            r3 = 2
            if (r4 != r3) goto L_0x01db
            goto L_0x01e7
        L_0x01db:
            if (r4 != r5) goto L_0x01ec
            int r3 = r0.f30102R
            if (r3 == 0) goto L_0x01ec
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.m36666A0(r1, r3)
            goto L_0x01ec
        L_0x01e7:
            r3 = 10
            r0.m36666A0(r1, r3)
        L_0x01ec:
            p161w3.C5945j0.m35046c()
        L_0x01ef:
            return
        L_0x01f0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Playback stuck buffering and not loading"
            r1.<init>(r2)
            throw r1
        L_0x01f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6250n1.m36743p():void");
    }

    /* renamed from: p0 */
    private boolean m36744p0() throws C6264q {
        C6219f2 q = this.f30085A.mo21337q();
        C5720c0 o = q.mo21308o();
        int i = 0;
        boolean z = false;
        while (true) {
            C6211d3[] d3VarArr = this.f30104a;
            if (i >= d3VarArr.length) {
                return !z;
            }
            C6211d3 d3Var = d3VarArr[i];
            if (m36695R(d3Var)) {
                boolean z2 = d3Var.mo21229s() != q.f29935c[i];
                if (!o.mo20160c(i) || z2) {
                    if (!d3Var.mo21235w()) {
                        d3Var.mo21223i(m36761y(o.f28542c[i]), q.f29935c[i], q.mo21306m(), q.mo21305l());
                    } else if (d3Var.mo6484d()) {
                        m36741o(d3Var);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    /* renamed from: p1 */
    private void m36745p1(float f) {
        for (C6219f2 p = this.f30085A.mo21336p(); p != null; p = p.mo21303j()) {
            for (C5735s sVar : p.mo21308o().f28542c) {
                if (sVar != null) {
                    sVar.mo20127r(f);
                }
            }
        }
    }

    /* renamed from: q */
    private void m36746q(int i, boolean z) throws C6264q {
        C6211d3 d3Var = this.f30104a[i];
        if (!m36695R(d3Var)) {
            C6219f2 q = this.f30085A.mo21337q();
            boolean z2 = q == this.f30085A.mo21336p();
            C5720c0 o = q.mo21308o();
            C6223g3 g3Var = o.f28541b[i];
            C6272r1[] y = m36761y(o.f28542c[i]);
            boolean z3 = m36717d1() && this.f30090F.f30285e == 3;
            boolean z4 = !z && z3;
            this.f30102R++;
            this.f30106b.add(d3Var);
            d3Var.mo21227q(g3Var, y, q.f29935c[i], this.f30105a0, z4, z2, q.mo21306m(), q.mo21305l());
            d3Var.mo6490r(11, new C6251a());
            this.f30124w.mo21376b(d3Var);
            if (z3) {
                d3Var.start();
            }
        }
    }

    /* renamed from: q0 */
    private void m36747q0() throws C6264q {
        float f = this.f30124w.mo6485e().f30331a;
        C6219f2 p = this.f30085A.mo21336p();
        C6219f2 q = this.f30085A.mo21337q();
        boolean z = true;
        while (p != null && p.f29936d) {
            C5720c0 v = p.mo21313v(f, this.f30090F.f30281a);
            if (!v.mo20158a(p.mo21308o())) {
                if (z) {
                    C6219f2 p2 = this.f30085A.mo21336p();
                    boolean z2 = this.f30085A.mo21341z(p2);
                    boolean[] zArr = new boolean[this.f30104a.length];
                    long b = p2.mo21300b(v, this.f30090F.f30298r, z2, zArr);
                    C6275r2 r2Var = this.f30090F;
                    boolean z3 = (r2Var.f30285e == 4 || b == r2Var.f30298r) ? false : true;
                    C6275r2 r2Var2 = this.f30090F;
                    C6219f2 f2Var = p2;
                    boolean[] zArr2 = zArr;
                    this.f30090F = m36687M(r2Var2.f30282b, b, r2Var2.f30283c, r2Var2.f30284d, z3, 5);
                    if (z3) {
                        m36754t0(b);
                    }
                    boolean[] zArr3 = new boolean[this.f30104a.length];
                    int i = 0;
                    while (true) {
                        C6211d3[] d3VarArr = this.f30104a;
                        if (i >= d3VarArr.length) {
                            break;
                        }
                        C6211d3 d3Var = d3VarArr[i];
                        zArr3[i] = m36695R(d3Var);
                        C1749q0 q0Var = f2Var.f29935c[i];
                        if (zArr3[i]) {
                            if (q0Var != d3Var.mo21229s()) {
                                m36741o(d3Var);
                            } else if (zArr2[i]) {
                                d3Var.mo21234v(this.f30105a0);
                            }
                        }
                        i++;
                    }
                    m36751s(zArr3);
                } else {
                    this.f30085A.mo21341z(p);
                    if (p.f29936d) {
                        p.mo21299a(v, Math.max(p.f29938f.f29950b, p.mo21316y(this.f30105a0)), false);
                    }
                }
                m36677H(true);
                if (this.f30090F.f30285e != 4) {
                    m36703W();
                    m36740n1();
                    this.f30117h.mo20601e(2);
                    return;
                }
                return;
            }
            if (p == q) {
                z = false;
            }
            p = p.mo21303j();
        }
    }

    /* renamed from: q1 */
    private synchronized void m36748q1(C6444t<Boolean> tVar, long j) {
        long b = this.f30126y.mo20586b() + j;
        boolean z = false;
        while (!tVar.get().booleanValue() && j > 0) {
            try {
                this.f30126y.mo20588d();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = b - this.f30126y.mo20586b();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: r */
    private void m36749r() throws C6264q {
        m36751s(new boolean[this.f30104a.length]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m36750r0(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            r28 = this;
            r1 = r28
            w3.n r0 = r1.f30117h
            r2 = 2
            r0.mo20605i(r2)
            r2 = 0
            r1.f30111d0 = r2
            r3 = 0
            r1.f30095K = r3
            z1.l r0 = r1.f30124w
            r0.mo21379h()
            r4 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            r1.f30105a0 = r4
            z1.d3[] r4 = r1.f30104a
            int r5 = r4.length
            r6 = 0
        L_0x001e:
            java.lang.String r7 = "ExoPlayerImplInternal"
            if (r6 >= r5) goto L_0x0033
            r0 = r4[r6]
            r1.m36741o(r0)     // Catch:{ q -> 0x002a, RuntimeException -> 0x0028 }
            goto L_0x0030
        L_0x0028:
            r0 = move-exception
            goto L_0x002b
        L_0x002a:
            r0 = move-exception
        L_0x002b:
            java.lang.String r8 = "Disable failed."
            p161w3.C5961r.m35210d(r7, r8, r0)
        L_0x0030:
            int r6 = r6 + 1
            goto L_0x001e
        L_0x0033:
            if (r29 == 0) goto L_0x0053
            z1.d3[] r4 = r1.f30104a
            int r5 = r4.length
            r6 = 0
        L_0x0039:
            if (r6 >= r5) goto L_0x0053
            r0 = r4[r6]
            java.util.Set<z1.d3> r8 = r1.f30106b
            boolean r8 = r8.remove(r0)
            if (r8 == 0) goto L_0x0050
            r0.reset()     // Catch:{ RuntimeException -> 0x0049 }
            goto L_0x0050
        L_0x0049:
            r0 = move-exception
            r8 = r0
            java.lang.String r0 = "Reset failed."
            p161w3.C5961r.m35210d(r7, r0, r8)
        L_0x0050:
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0053:
            r1.f30102R = r3
            z1.r2 r0 = r1.f30090F
            b3.x$b r4 = r0.f30282b
            long r5 = r0.f30298r
            z1.r2 r0 = r1.f30090F
            b3.x$b r0 = r0.f30282b
            boolean r0 = r0.mo6886b()
            if (r0 != 0) goto L_0x0075
            z1.r2 r0 = r1.f30090F
            z1.q3$b r7 = r1.f30121t
            boolean r0 = m36698T(r0, r7)
            if (r0 == 0) goto L_0x0070
            goto L_0x0075
        L_0x0070:
            z1.r2 r0 = r1.f30090F
            long r7 = r0.f30298r
            goto L_0x0079
        L_0x0075:
            z1.r2 r0 = r1.f30090F
            long r7 = r0.f30283c
        L_0x0079:
            if (r30 == 0) goto L_0x00a6
            r1.f30103S = r2
            z1.r2 r0 = r1.f30090F
            z1.q3 r0 = r0.f30281a
            android.util.Pair r0 = r1.m36667B(r0)
            java.lang.Object r4 = r0.first
            b3.x$b r4 = (p015b3.C1772x.C1774b) r4
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r5 = r0.longValue()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            z1.r2 r0 = r1.f30090F
            b3.x$b r0 = r0.f30282b
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00a6
            r0 = 1
            r17 = r4
            r25 = r5
            goto L_0x00ab
        L_0x00a6:
            r17 = r4
            r25 = r5
            r0 = 0
        L_0x00ab:
            z1.i2 r4 = r1.f30085A
            r4.mo21332f()
            r1.f30096L = r3
            z1.r2 r3 = new z1.r2
            z1.r2 r4 = r1.f30090F
            z1.q3 r5 = r4.f30281a
            int r11 = r4.f30285e
            if (r32 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            z1.q r2 = r4.f30286f
        L_0x00bf:
            r12 = r2
            r13 = 0
            if (r0 == 0) goto L_0x00c6
            b3.z0 r2 = p015b3.C1780z0.f5294d
            goto L_0x00c8
        L_0x00c6:
            b3.z0 r2 = r4.f30288h
        L_0x00c8:
            r14 = r2
            if (r0 == 0) goto L_0x00ce
            u3.c0 r2 = r1.f30112e
            goto L_0x00d0
        L_0x00ce:
            u3.c0 r2 = r4.f30289i
        L_0x00d0:
            r15 = r2
            if (r0 == 0) goto L_0x00d8
            b7.q r0 = p190b7.C6685q.m38445x()
            goto L_0x00da
        L_0x00d8:
            java.util.List<r2.a> r0 = r4.f30290j
        L_0x00da:
            r16 = r0
            z1.r2 r0 = r1.f30090F
            boolean r2 = r0.f30292l
            r18 = r2
            int r2 = r0.f30293m
            r19 = r2
            z1.t2 r0 = r0.f30294n
            r20 = r0
            r23 = 0
            r27 = 0
            r4 = r3
            r6 = r17
            r9 = r25
            r21 = r25
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r27)
            r1.f30090F = r3
            if (r31 == 0) goto L_0x0101
            z1.l2 r0 = r1.f30086B
            r0.mo21392y()
        L_0x0101:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p177z1.C6250n1.m36750r0(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: s */
    private void m36751s(boolean[] zArr) throws C6264q {
        C6219f2 q = this.f30085A.mo21337q();
        C5720c0 o = q.mo21308o();
        for (int i = 0; i < this.f30104a.length; i++) {
            if (!o.mo20160c(i) && this.f30106b.remove(this.f30104a[i])) {
                this.f30104a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.f30104a.length; i2++) {
            if (o.mo20160c(i2)) {
                m36746q(i2, zArr[i2]);
            }
        }
        q.f29939g = true;
    }

    /* renamed from: s0 */
    private void m36752s0() {
        C6219f2 p = this.f30085A.mo21336p();
        this.f30094J = p != null && p.f29938f.f29956h && this.f30093I;
    }

    /* renamed from: t */
    private void m36753t(C6211d3 d3Var) throws C6264q {
        if (d3Var.getState() == 2) {
            d3Var.stop();
        }
    }

    /* renamed from: t0 */
    private void m36754t0(long j) throws C6264q {
        long j2;
        C6219f2 p = this.f30085A.mo21336p();
        if (p == null) {
            j2 = j + 1000000000000L;
        } else {
            j2 = p.mo21317z(j);
        }
        this.f30105a0 = j2;
        this.f30124w.mo21377d(j2);
        for (C6211d3 d3Var : this.f30104a) {
            if (m36695R(d3Var)) {
                d3Var.mo21234v(this.f30105a0);
            }
        }
        m36721f0();
    }

    /* renamed from: u0 */
    private static void m36755u0(C6266q3 q3Var, C6254d dVar, C6266q3.C6270d dVar2, C6266q3.C6268b bVar) {
        int i = q3Var.mo21450r(q3Var.mo21149l(dVar.f30140d, bVar).f30186c, dVar2).f30214x;
        Object obj = q3Var.mo6711k(i, bVar, true).f30185b;
        long j = bVar.f30187d;
        dVar.mo21427b(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    /* renamed from: v0 */
    private static boolean m36756v0(C6254d dVar, C6266q3 q3Var, C6266q3 q3Var2, int i, boolean z, C6266q3.C6270d dVar2, C6266q3.C6268b bVar) {
        long j;
        C6254d dVar3 = dVar;
        C6266q3 q3Var3 = q3Var;
        C6266q3 q3Var4 = q3Var2;
        C6266q3.C6270d dVar4 = dVar2;
        C6266q3.C6268b bVar2 = bVar;
        Object obj = dVar3.f30140d;
        if (obj == null) {
            if (dVar3.f30137a.mo21575f() == Long.MIN_VALUE) {
                j = -9223372036854775807L;
            } else {
                j = C5953m0.m35071B0(dVar3.f30137a.mo21575f());
            }
            Pair<Object, Long> y0 = m36762y0(q3Var, new C6258h(dVar3.f30137a.mo21577h(), dVar3.f30137a.mo21573d(), j), false, i, z, dVar2, bVar);
            if (y0 == null) {
                return false;
            }
            dVar.mo21427b(q3Var3.mo6809f(y0.first), ((Long) y0.second).longValue(), y0.first);
            if (dVar3.f30137a.mo21575f() == Long.MIN_VALUE) {
                m36755u0(q3Var3, dVar, dVar4, bVar2);
            }
            return true;
        }
        int f = q3Var3.mo6809f(obj);
        if (f == -1) {
            return false;
        }
        if (dVar3.f30137a.mo21575f() == Long.MIN_VALUE) {
            m36755u0(q3Var3, dVar, dVar4, bVar2);
            return true;
        }
        dVar3.f30138b = f;
        q3Var4.mo21149l(dVar3.f30140d, bVar2);
        if (bVar2.f30189f && q3Var4.mo21450r(bVar2.f30186c, dVar4).f30213w == q3Var4.mo6809f(dVar3.f30140d)) {
            long q = dVar3.f30139c + bVar.mo21468q();
            Pair<Object, Long> n = q3Var.mo21448n(dVar2, bVar, q3Var3.mo21149l(dVar3.f30140d, bVar2).f30186c, q);
            dVar.mo21427b(q3Var3.mo6809f(n.first), ((Long) n.second).longValue(), n.first);
        }
        return true;
    }

    /* renamed from: w */
    private C6685q<C5432a> m36757w(C5735s[] sVarArr) {
        C6685q.C6686a aVar = new C6685q.C6686a();
        boolean z = false;
        for (C5735s sVar : sVarArr) {
            if (sVar != null) {
                C5432a aVar2 = sVar.mo20144c(0).f30241r;
                if (aVar2 == null) {
                    aVar.mo22506a(new C5432a(new C5432a.C5434b[0]));
                } else {
                    aVar.mo22506a(aVar2);
                    z = true;
                }
            }
        }
        return z ? aVar.mo22547h() : C6685q.m38445x();
    }

    /* renamed from: w0 */
    private void m36758w0(C6266q3 q3Var, C6266q3 q3Var2) {
        if (!q3Var.mo21451u() || !q3Var2.mo21451u()) {
            for (int size = this.f30125x.size() - 1; size >= 0; size--) {
                if (!m36756v0(this.f30125x.get(size), q3Var, q3Var2, this.f30097M, this.f30098N, this.f30120s, this.f30121t)) {
                    this.f30125x.get(size).f30137a.mo21580k(false);
                    this.f30125x.remove(size);
                }
            }
            Collections.sort(this.f30125x);
        }
    }

    /* renamed from: x */
    private long m36759x() {
        C6275r2 r2Var = this.f30090F;
        return m36763z(r2Var.f30281a, r2Var.f30282b.f5270a, r2Var.f30298r);
    }

    /* renamed from: x0 */
    private static C6257g m36760x0(C6266q3 q3Var, C6275r2 r2Var, C6258h hVar, C6228i2 i2Var, int i, boolean z, C6266q3.C6270d dVar, C6266q3.C6268b bVar) {
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        C1772x.C1774b bVar2;
        int i3;
        long j2;
        long j3;
        C6228i2 i2Var2;
        int i4;
        long j4;
        long j5;
        int i5;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        boolean z8;
        C6266q3 q3Var2 = q3Var;
        C6275r2 r2Var2 = r2Var;
        C6258h hVar2 = hVar;
        boolean z9 = z;
        C6266q3.C6268b bVar3 = bVar;
        if (q3Var.mo21451u()) {
            return new C6257g(C6275r2.m36971k(), 0, -9223372036854775807L, false, true, false);
        }
        C1772x.C1774b bVar4 = r2Var2.f30282b;
        Object obj = bVar4.f5270a;
        boolean T = m36698T(r2Var2, bVar3);
        if (r2Var2.f30282b.mo6886b() || T) {
            j = r2Var2.f30283c;
        } else {
            j = r2Var2.f30298r;
        }
        long j6 = j;
        boolean z10 = true;
        if (hVar2 != null) {
            C1772x.C1774b bVar5 = bVar4;
            i2 = -1;
            Pair<Object, Long> y0 = m36762y0(q3Var, hVar, true, i, z, dVar, bVar);
            if (y0 == null) {
                i7 = q3Var2.mo6808e(z9);
                j2 = j6;
                z8 = false;
                z7 = false;
                z6 = true;
            } else {
                if (hVar2.f30156c == -9223372036854775807L) {
                    i7 = q3Var2.mo21149l(y0.first, bVar3).f30186c;
                    j2 = j6;
                    z8 = false;
                } else {
                    obj = y0.first;
                    j2 = ((Long) y0.second).longValue();
                    z8 = true;
                    i7 = -1;
                }
                z7 = r2Var2.f30285e == 4;
                z6 = false;
            }
            C6266q3.C6270d dVar2 = dVar;
            z2 = z8;
            z4 = z7;
            z3 = z6;
            i3 = i7;
            bVar2 = bVar5;
        } else {
            C1772x.C1774b bVar6 = bVar4;
            i2 = -1;
            if (r2Var2.f30281a.mo21451u()) {
                i5 = q3Var2.mo6808e(z9);
            } else if (q3Var2.mo6809f(obj) == -1) {
                Object z0 = m36764z0(dVar, bVar, i, z, obj, r2Var2.f30281a, q3Var);
                if (z0 == null) {
                    i6 = q3Var2.mo6808e(z9);
                    z5 = true;
                } else {
                    i6 = q3Var2.mo21149l(z0, bVar3).f30186c;
                    z5 = false;
                }
                C6266q3.C6270d dVar3 = dVar;
                i3 = i6;
                z3 = z5;
                j4 = j6;
                bVar2 = bVar6;
                z4 = false;
                z2 = false;
            } else if (j6 == -9223372036854775807L) {
                i5 = q3Var2.mo21149l(obj, bVar3).f30186c;
            } else if (T) {
                bVar2 = bVar6;
                r2Var2.f30281a.mo21149l(bVar2.f5270a, bVar3);
                if (r2Var2.f30281a.mo21450r(bVar3.f30186c, dVar).f30213w == r2Var2.f30281a.mo6809f(bVar2.f5270a)) {
                    Pair<Object, Long> n = q3Var.mo21448n(dVar, bVar, q3Var2.mo21149l(obj, bVar3).f30186c, j6 + bVar.mo21468q());
                    obj = n.first;
                    j5 = ((Long) n.second).longValue();
                } else {
                    j5 = j6;
                }
                i3 = -1;
                z4 = false;
                z3 = false;
                z2 = true;
            } else {
                C6266q3.C6270d dVar4 = dVar;
                bVar2 = bVar6;
                j4 = j6;
                i3 = -1;
                z4 = false;
                z3 = false;
                z2 = false;
            }
            C6266q3.C6270d dVar5 = dVar;
            i3 = i5;
            j4 = j6;
            bVar2 = bVar6;
            z4 = false;
            z3 = false;
            z2 = false;
        }
        if (i3 != i2) {
            Pair<Object, Long> n2 = q3Var.mo21448n(dVar, bVar, i3, -9223372036854775807L);
            obj = n2.first;
            j2 = ((Long) n2.second).longValue();
            i2Var2 = i2Var;
            j3 = -9223372036854775807L;
        } else {
            i2Var2 = i2Var;
            j3 = j2;
        }
        C1772x.C1774b B = i2Var2.mo21325B(q3Var2, obj, j2);
        int i8 = B.f5274e;
        boolean z11 = i8 == i2 || ((i4 = bVar2.f5274e) != i2 && i8 >= i4);
        if (!bVar2.f5270a.equals(obj) || bVar2.mo6886b() || B.mo6886b() || !z11) {
            z10 = false;
        }
        C1772x.C1774b bVar7 = bVar2;
        boolean P = m36692P(T, bVar2, j6, B, q3Var2.mo21149l(obj, bVar3), j3);
        if (z10 || P) {
            B = bVar7;
        }
        if (B.mo6886b()) {
            if (B.equals(bVar7)) {
                j2 = r2Var2.f30298r;
            } else {
                q3Var2.mo21149l(B.f5270a, bVar3);
                j2 = B.f5272c == bVar3.mo21465n(B.f5271b) ? bVar.mo21461j() : 0;
            }
        }
        return new C6257g(B, j2, j3, z4, z3, z2);
    }

    /* renamed from: y */
    private static C6272r1[] m36761y(C5735s sVar) {
        int length = sVar != null ? sVar.length() : 0;
        C6272r1[] r1VarArr = new C6272r1[length];
        for (int i = 0; i < length; i++) {
            r1VarArr[i] = sVar.mo20144c(i);
        }
        return r1VarArr;
    }

    /* renamed from: y0 */
    private static Pair<Object, Long> m36762y0(C6266q3 q3Var, C6258h hVar, boolean z, int i, boolean z2, C6266q3.C6270d dVar, C6266q3.C6268b bVar) {
        Object z0;
        C6266q3 q3Var2 = q3Var;
        C6258h hVar2 = hVar;
        C6266q3.C6268b bVar2 = bVar;
        C6266q3 q3Var3 = hVar2.f30154a;
        if (q3Var.mo21451u()) {
            return null;
        }
        C6266q3 q3Var4 = q3Var3.mo21451u() ? q3Var2 : q3Var3;
        try {
            Pair<Object, Long> n = q3Var4.mo21448n(dVar, bVar, hVar2.f30155b, hVar2.f30156c);
            if (q3Var.equals(q3Var4)) {
                return n;
            }
            if (q3Var.mo6809f(n.first) == -1) {
                C6266q3.C6270d dVar2 = dVar;
                if (z && (z0 = m36764z0(dVar, bVar, i, z2, n.first, q3Var4, q3Var)) != null) {
                    return q3Var.mo21448n(dVar, bVar, q3Var.mo21149l(z0, bVar2).f30186c, -9223372036854775807L);
                }
                return null;
            } else if (!q3Var4.mo21149l(n.first, bVar2).f30189f || q3Var4.mo21450r(bVar2.f30186c, dVar).f30213w != q3Var4.mo6809f(n.first)) {
                return n;
            } else {
                return q3Var.mo21448n(dVar, bVar, q3Var.mo21149l(n.first, bVar2).f30186c, hVar2.f30156c);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: z */
    private long m36763z(C6266q3 q3Var, Object obj, long j) {
        q3Var.mo21450r(q3Var.mo21149l(obj, this.f30121t).f30186c, this.f30120s);
        C6266q3.C6270d dVar = this.f30120s;
        if (dVar.f30204f != -9223372036854775807L && dVar.mo21480h()) {
            C6266q3.C6270d dVar2 = this.f30120s;
            if (dVar2.f30207i) {
                return C5953m0.m35071B0(dVar2.mo21474c() - this.f30120s.f30204f) - (j + this.f30121t.mo21468q());
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: z0 */
    static Object m36764z0(C6266q3.C6270d dVar, C6266q3.C6268b bVar, int i, boolean z, Object obj, C6266q3 q3Var, C6266q3 q3Var2) {
        int f = q3Var.mo6809f(obj);
        int m = q3Var.mo6760m();
        int i2 = f;
        int i3 = -1;
        for (int i4 = 0; i4 < m && i3 == -1; i4++) {
            i2 = q3Var.mo21445h(i2, bVar, dVar, i, z);
            if (i2 == -1) {
                break;
            }
            i3 = q3Var2.mo6809f(q3Var.mo6813q(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return q3Var2.mo6813q(i3);
    }

    /* renamed from: B0 */
    public void mo21410B0(C6266q3 q3Var, int i, long j) {
        this.f30117h.mo20606j(3, new C6258h(q3Var, i, j)).mo20608a();
    }

    /* renamed from: C */
    public Looper mo21411C() {
        return this.f30119r;
    }

    /* renamed from: N0 */
    public void mo21412N0(List<C6239l2.C6242c> list, int i, long j, C1757s0 s0Var) {
        this.f30117h.mo20606j(17, new C6252b(list, s0Var, i, j, (C6251a) null)).mo20608a();
    }

    /* renamed from: Q0 */
    public void mo21413Q0(boolean z, int i) {
        this.f30117h.mo20597a(1, z ? 1 : 0, i).mo20608a();
    }

    /* renamed from: S0 */
    public void mo21414S0(C6280t2 t2Var) {
        this.f30117h.mo20606j(4, t2Var).mo20608a();
    }

    /* renamed from: U0 */
    public void mo21415U0(int i) {
        this.f30117h.mo20597a(11, i, 0).mo20608a();
    }

    /* renamed from: X0 */
    public void mo21416X0(boolean z) {
        this.f30117h.mo20597a(12, z ? 1 : 0, 0).mo20608a();
    }

    /* renamed from: a */
    public synchronized void mo21417a(C6297y2 y2Var) {
        if (!this.f30092H) {
            if (this.f30118i.isAlive()) {
                this.f30117h.mo20606j(14, y2Var).mo20608a();
                return;
            }
        }
        C5961r.m35215i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        y2Var.mo21580k(false);
    }

    /* renamed from: b */
    public void mo6680b(C1765u uVar) {
        this.f30117h.mo20606j(8, uVar).mo20608a();
    }

    /* renamed from: c */
    public void mo20141c() {
        this.f30117h.mo20601e(10);
    }

    /* renamed from: d */
    public void mo21395d() {
        this.f30117h.mo20601e(22);
    }

    /* renamed from: g */
    public void mo21381g(C6280t2 t2Var) {
        this.f30117h.mo20606j(16, t2Var).mo20608a();
    }

    /* renamed from: h1 */
    public void mo21418h1() {
        this.f30117h.mo20599c(6).mo20608a();
    }

    public boolean handleMessage(Message message) {
        C6219f2 q;
        int i = AdError.NETWORK_ERROR_CODE;
        try {
            switch (message.what) {
                case 0:
                    m36732k0();
                    break;
                case 1:
                    m36696R0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    m36743p();
                    break;
                case 3:
                    m36670D0((C6258h) message.obj);
                    break;
                case 4:
                    m36699T0((C6280t2) message.obj);
                    break;
                case 5:
                    m36704W0((C6229i3) message.obj);
                    break;
                case 6:
                    m36728i1(false, true);
                    break;
                case 7:
                    m36736m0();
                    return true;
                case 8:
                    m36681J((C1765u) message.obj);
                    break;
                case 9:
                    m36673F((C1765u) message.obj);
                    break;
                case 10:
                    m36747q0();
                    break;
                case 11:
                    m36702V0(message.arg1);
                    break;
                case 12:
                    m36707Y0(message.arg1 != 0);
                    break;
                case 13:
                    m36686L0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    m36676G0((C6297y2) message.obj);
                    break;
                case 15:
                    m36680I0((C6297y2) message.obj);
                    break;
                case 16:
                    m36685L((C6280t2) message.obj, false);
                    break;
                case 17:
                    m36688M0((C6252b) message.obj);
                    break;
                case 18:
                    m36731k((C6252b) message.obj, message.arg1);
                    break;
                case 19:
                    m36719e0((C6253c) message.obj);
                    break;
                case 20:
                    m36739n0(message.arg1, message.arg2, (C1757s0) message.obj);
                    break;
                case 21:
                    m36709Z0((C1757s0) message.obj);
                    break;
                case 22:
                    m36716d0();
                    break;
                case 23:
                    m36693P0(message.arg1 != 0);
                    break;
                case 24:
                    m36691O0(message.arg1 == 1);
                    break;
                case 25:
                    m36735m();
                    break;
                default:
                    return false;
            }
        } catch (C6264q e) {
            e = e;
            if (e.f30171d == 1 && (q = this.f30085A.mo21337q()) != null) {
                e = e.mo21440f(q.f29938f.f29949a);
            }
            if (!e.f30177r || this.f30111d0 != null) {
                C6264q qVar = this.f30111d0;
                if (qVar != null) {
                    qVar.addSuppressed(e);
                    e = this.f30111d0;
                }
                C5961r.m35210d("ExoPlayerImplInternal", "Playback error", e);
                m36728i1(true, false);
                this.f30090F = this.f30090F.mo21527e(e);
            } else {
                C5961r.m35216j("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f30111d0 = e;
                C5954n nVar = this.f30117h;
                nVar.mo20603g(nVar.mo20606j(25, e));
            }
        } catch (C4042o.C4043a e2) {
            m36675G(e2, e2.f23121a);
        } catch (C6249m2 e3) {
            int i2 = e3.f30084b;
            if (i2 == 1) {
                i = e3.f30083a ? AdError.MEDIATION_ERROR_CODE : 3003;
            } else if (i2 == 4) {
                i = e3.f30083a ? 3002 : 3004;
            }
            m36675G(e3, i);
        } catch (C5830m e4) {
            m36675G(e4, e4.f28858a);
        } catch (C1690b e5) {
            m36675G(e5, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
        } catch (IOException e6) {
            m36675G(e6, AdError.SERVER_ERROR_CODE);
        } catch (RuntimeException e7) {
            if ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) {
                i = 1004;
            }
            C6264q j = C6264q.m36815j(e7, i);
            C5961r.m35210d("ExoPlayerImplInternal", "Playback error", j);
            m36728i1(true, false);
            this.f30090F = this.f30090F.mo21527e(j);
        }
        m36705X();
        return true;
    }

    /* renamed from: i0 */
    public void mo6684f(C1765u uVar) {
        this.f30117h.mo20606j(9, uVar).mo20608a();
    }

    /* renamed from: j0 */
    public void mo21421j0() {
        this.f30117h.mo20599c(0).mo20608a();
    }

    /* renamed from: l0 */
    public synchronized boolean mo21422l0() {
        if (!this.f30092H) {
            if (this.f30118i.isAlive()) {
                this.f30117h.mo20601e(7);
                m36748q1(new C13404l1(this), this.f30088D);
                return this.f30092H;
            }
        }
        return true;
    }

    /* renamed from: o0 */
    public void mo21423o0(int i, int i2, C1757s0 s0Var) {
        this.f30117h.mo20602f(20, i, i2, s0Var).mo20608a();
    }

    /* renamed from: u */
    public void mo21424u(long j) {
        this.f30113e0 = j;
    }

    /* renamed from: v */
    public void mo21425v(boolean z) {
        this.f30117h.mo20597a(24, z ? 1 : 0, 0).mo20608a();
    }
}
