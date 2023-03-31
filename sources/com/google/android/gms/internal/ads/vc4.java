package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vc4 implements yb4 {

    /* renamed from: W */
    private static final Object f19015W = new Object();

    /* renamed from: X */
    private static ExecutorService f19016X;

    /* renamed from: Y */
    private static int f19017Y;

    /* renamed from: A */
    private boolean f19018A;

    /* renamed from: B */
    private boolean f19019B;

    /* renamed from: C */
    private long f19020C;

    /* renamed from: D */
    private float f19021D;

    /* renamed from: E */
    private gb4[] f19022E;

    /* renamed from: F */
    private ByteBuffer[] f19023F;

    /* renamed from: G */
    private ByteBuffer f19024G;

    /* renamed from: H */
    private int f19025H;

    /* renamed from: I */
    private ByteBuffer f19026I;

    /* renamed from: J */
    private byte[] f19027J;

    /* renamed from: K */
    private int f19028K;

    /* renamed from: L */
    private int f19029L;

    /* renamed from: M */
    private boolean f19030M;

    /* renamed from: N */
    private boolean f19031N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public boolean f19032O;

    /* renamed from: P */
    private boolean f19033P;

    /* renamed from: Q */
    private int f19034Q;

    /* renamed from: R */
    private x84 f19035R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public long f19036S;

    /* renamed from: T */
    private boolean f19037T;

    /* renamed from: U */
    private boolean f19038U;

    /* renamed from: V */
    private final lc4 f19039V;

    /* renamed from: a */
    private final db4 f19040a;

    /* renamed from: b */
    private final fc4 f19041b;

    /* renamed from: c */
    private final hd4 f19042c;

    /* renamed from: d */
    private final gb4[] f19043d;

    /* renamed from: e */
    private final gb4[] f19044e;

    /* renamed from: f */
    private final yc1 f19045f;

    /* renamed from: g */
    private final dc4 f19046g = new dc4(new qc4(this, (pc4) null));

    /* renamed from: h */
    private final ArrayDeque f19047h;

    /* renamed from: i */
    private tc4 f19048i;

    /* renamed from: j */
    private final oc4 f19049j;

    /* renamed from: k */
    private final oc4 f19050k;

    /* renamed from: l */
    private final ic4 f19051l;

    /* renamed from: m */
    private bb4 f19052m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public vb4 f19053n;

    /* renamed from: o */
    private kc4 f19054o;

    /* renamed from: p */
    private kc4 f19055p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public AudioTrack f19056q;

    /* renamed from: r */
    private w74 f19057r;

    /* renamed from: s */
    private nc4 f19058s;

    /* renamed from: t */
    private nc4 f19059t;

    /* renamed from: u */
    private final fe0 f19060u;

    /* renamed from: v */
    private long f19061v;

    /* renamed from: w */
    private long f19062w;

    /* renamed from: x */
    private long f19063x;

    /* renamed from: y */
    private long f19064y;

    /* renamed from: z */
    private int f19065z;

    /* synthetic */ vc4(jc4 jc4, uc4 uc4) {
        this.f19040a = jc4.f11320a;
        lc4 e = jc4.f11322c;
        this.f19039V = e;
        int i = gb2.f9812a;
        this.f19051l = jc4.f11321b;
        yc1 yc1 = new yc1(wa1.f19542a);
        this.f19045f = yc1;
        yc1.mo15423e();
        fc4 fc4 = new fc4();
        this.f19041b = fc4;
        hd4 hd4 = new hd4();
        this.f19042c = hd4;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new ec4[]{new dd4(), fc4, hd4});
        Collections.addAll(arrayList, e.mo11976e());
        this.f19043d = (gb4[]) arrayList.toArray(new gb4[0]);
        this.f19044e = new gb4[]{new yc4()};
        this.f19021D = 1.0f;
        this.f19057r = w74.f19518c;
        this.f19034Q = 0;
        this.f19035R = new x84(0, 0.0f);
        fe0 fe0 = fe0.f9258d;
        this.f19059t = new nc4(fe0, false, 0, 0, (mc4) null);
        this.f19060u = fe0;
        this.f19029L = -1;
        this.f19022E = new gb4[0];
        this.f19023F = new ByteBuffer[0];
        this.f19047h = new ArrayDeque();
        this.f19049j = new oc4(100);
        this.f19050k = new oc4(100);
    }

    /* renamed from: A */
    private final void m22115A() {
        int i = 0;
        while (true) {
            gb4[] gb4Arr = this.f19022E;
            if (i < gb4Arr.length) {
                gb4 gb4 = gb4Arr[i];
                gb4.mo9880e();
                this.f19023F[i] = gb4.mo9879d();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: B */
    private final void m22116B() {
        if (this.f19055p.mo11661c()) {
            this.f19037T = true;
        }
    }

    /* renamed from: C */
    private final void m22117C() {
        if (!this.f19031N) {
            this.f19031N = true;
            this.f19046g.mo9544c(m22135w());
            this.f19056q.stop();
        }
    }

    /* renamed from: D */
    private final void m22118D(long j) throws xb4 {
        ByteBuffer byteBuffer;
        int length = this.f19022E.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f19023F[i - 1];
            } else {
                byteBuffer = this.f19024G;
                if (byteBuffer == null) {
                    byteBuffer = gb4.f9828a;
                }
            }
            if (i == length) {
                m22121G(byteBuffer, j);
            } else {
                gb4 gb4 = this.f19022E[i];
                if (i > this.f19029L) {
                    gb4.mo9558a(byteBuffer);
                }
                ByteBuffer d = gb4.mo9879d();
                this.f19023F[i] = d;
                if (d.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    private final void m22119E(fe0 fe0, boolean z) {
        nc4 y = m22137y();
        if (!fe0.equals(y.f13959a) || z != y.f13960b) {
            nc4 nc4 = new nc4(fe0, z, -9223372036854775807L, -9223372036854775807L, (mc4) null);
            if (m22123I()) {
                this.f19058s = nc4;
            } else {
                this.f19059t = nc4;
            }
        }
    }

    /* renamed from: F */
    private final void m22120F() {
        if (m22123I()) {
            if (gb2.f9812a >= 21) {
                this.f19056q.setVolume(this.f19021D);
                return;
            }
            AudioTrack audioTrack = this.f19056q;
            float f = this.f19021D;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: G */
    private final void m22121G(ByteBuffer byteBuffer, long j) throws xb4 {
        int i;
        vb4 vb4;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f19026I;
            boolean z = true;
            if (byteBuffer2 != null) {
                v91.m22050d(byteBuffer2 == byteBuffer);
            } else {
                this.f19026I = byteBuffer;
                if (gb2.f9812a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f19027J;
                    if (bArr == null || bArr.length < remaining) {
                        this.f19027J = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f19027J, 0, remaining);
                    byteBuffer.position(position);
                    this.f19028K = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i2 = gb2.f9812a;
            if (i2 < 21) {
                int a = this.f19046g.mo9542a(this.f19063x);
                if (a > 0) {
                    i = this.f19056q.write(this.f19027J, this.f19028K, Math.min(remaining2, a));
                    if (i > 0) {
                        this.f19028K += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else {
                i = this.f19056q.write(byteBuffer, remaining2, 1);
            }
            this.f19036S = SystemClock.elapsedRealtime();
            if (i < 0) {
                if ((i2 < 24 || i != -6) && i != -32) {
                    z = false;
                }
                if (z) {
                    m22116B();
                }
                xb4 xb4 = new xb4(i, this.f19055p.f12023a, z);
                vb4 vb42 = this.f19053n;
                if (vb42 != null) {
                    vb42.mo8315a(xb4);
                }
                if (!xb4.f20066b) {
                    this.f19050k.mo12901b(xb4);
                    return;
                }
                throw xb4;
            }
            this.f19050k.mo12900a();
            if (m22124J(this.f19056q)) {
                if (this.f19064y > 0) {
                    this.f19038U = false;
                }
                if (this.f19032O && (vb4 = this.f19053n) != null && i < remaining2 && !this.f19038U) {
                    cd4 cd4 = ((ad4) vb4).f6529a;
                    if (cd4.f7692a1 != null) {
                        cd4.f7692a1.zza();
                    }
                }
            }
            int i3 = this.f19055p.f12025c;
            if (i3 == 0) {
                this.f19063x += (long) i;
            }
            if (i == remaining2) {
                if (i3 != 0) {
                    if (byteBuffer != this.f19024G) {
                        z = false;
                    }
                    v91.m22052f(z);
                    this.f19064y += ((long) this.f19065z) * ((long) this.f19025H);
                }
                this.f19026I = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m22122H() throws com.google.android.gms.internal.ads.xb4 {
        /*
            r9 = this;
            int r0 = r9.f19029L
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.f19029L = r3
        L_0x0009:
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r4 = r9.f19029L
            com.google.android.gms.internal.ads.gb4[] r5 = r9.f19022E
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.mo9877b()
        L_0x001f:
            r9.m22118D(r7)
            boolean r0 = r4.mo9876U()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.f19029L
            int r0 = r0 + r2
            r9.f19029L = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.f19026I
            if (r0 == 0) goto L_0x003b
            r9.m22121G(r0, r7)
            java.nio.ByteBuffer r0 = r9.f19026I
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.f19029L = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vc4.m22122H():boolean");
    }

    /* renamed from: I */
    private final boolean m22123I() {
        return this.f19056q != null;
    }

    /* renamed from: J */
    private static boolean m22124J(AudioTrack audioTrack) {
        return gb2.f9812a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: K */
    private final boolean m22125K() {
        if (!"audio/raw".equals(this.f19055p.f12023a.f9673l)) {
            return false;
        }
        int i = this.f19055p.f12023a.f9656A;
        return true;
    }

    /* renamed from: t */
    static /* synthetic */ void m22132t(AudioTrack audioTrack, yc1 yc1) {
        try {
            audioTrack.flush();
            audioTrack.release();
            yc1.mo15423e();
            synchronized (f19015W) {
                int i = f19017Y - 1;
                f19017Y = i;
                if (i == 0) {
                    f19016X.shutdown();
                    f19016X = null;
                }
            }
        } catch (Throwable th) {
            yc1.mo15423e();
            synchronized (f19015W) {
                int i2 = f19017Y - 1;
                f19017Y = i2;
                if (i2 == 0) {
                    f19016X.shutdown();
                    f19016X = null;
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final long m22134v() {
        kc4 kc4 = this.f19055p;
        return kc4.f12025c == 0 ? this.f19061v / ((long) kc4.f12024b) : this.f19062w;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final long m22135w() {
        kc4 kc4 = this.f19055p;
        return kc4.f12025c == 0 ? this.f19063x / ((long) kc4.f12026d) : this.f19064y;
    }

    /* renamed from: x */
    private final AudioTrack m22136x(kc4 kc4) throws ub4 {
        try {
            return kc4.mo11660b(false, this.f19057r, this.f19034Q);
        } catch (ub4 e) {
            vb4 vb4 = this.f19053n;
            if (vb4 != null) {
                vb4.mo8315a(e);
            }
            throw e;
        }
    }

    /* renamed from: y */
    private final nc4 m22137y() {
        nc4 nc4 = this.f19058s;
        if (nc4 != null) {
            return nc4;
        }
        return !this.f19047h.isEmpty() ? (nc4) this.f19047h.getLast() : this.f19059t;
    }

    /* renamed from: z */
    private final void m22138z(long j) {
        fe0 fe0;
        boolean z;
        if (m22125K()) {
            lc4 lc4 = this.f19039V;
            fe0 = m22137y().f13959a;
            lc4.mo11974c(fe0);
        } else {
            fe0 = fe0.f9258d;
        }
        fe0 fe02 = fe0;
        if (m22125K()) {
            lc4 lc42 = this.f19039V;
            boolean z2 = m22137y().f13960b;
            lc42.mo11975d(z2);
            z = z2;
        } else {
            z = false;
        }
        this.f19047h.add(new nc4(fe02, z, Math.max(0, j), this.f19055p.mo11659a(m22135w()), (mc4) null));
        gb4[] gb4Arr = this.f19055p.f12031i;
        ArrayList arrayList = new ArrayList();
        for (gb4 gb4 : gb4Arr) {
            if (gb4.mo9878c()) {
                arrayList.add(gb4);
            } else {
                gb4.mo9880e();
            }
        }
        int size = arrayList.size();
        this.f19022E = (gb4[]) arrayList.toArray(new gb4[size]);
        this.f19023F = new ByteBuffer[size];
        m22115A();
        vb4 vb4 = this.f19053n;
        if (vb4 != null) {
            ((ad4) vb4).f6529a.f7683R0.mo13755s(z);
        }
    }

    /* renamed from: T */
    public final void mo14708T() {
        this.f19018A = true;
    }

    /* renamed from: U */
    public final void mo14709U() {
        this.f19032O = true;
        if (m22123I()) {
            this.f19046g.mo9547f();
            this.f19056q.play();
        }
    }

    /* renamed from: V */
    public final void mo14710V() throws xb4 {
        if (!this.f19030M && m22123I() && m22122H()) {
            m22117C();
            this.f19030M = true;
        }
    }

    /* renamed from: W */
    public final void mo14711W() {
        mo14712a();
        for (gb4 T : this.f19043d) {
            T.mo9875T();
        }
        gb4[] gb4Arr = this.f19044e;
        int length = gb4Arr.length;
        for (int i = 0; i <= 0; i++) {
            gb4Arr[i].mo9875T();
        }
        this.f19032O = false;
        this.f19037T = false;
    }

    /* renamed from: a */
    public final void mo14712a() {
        if (m22123I()) {
            this.f19061v = 0;
            this.f19062w = 0;
            this.f19063x = 0;
            this.f19064y = 0;
            this.f19038U = false;
            this.f19065z = 0;
            this.f19059t = new nc4(m22137y().f13959a, m22137y().f13960b, 0, 0, (mc4) null);
            this.f19020C = 0;
            this.f19058s = null;
            this.f19047h.clear();
            this.f19024G = null;
            this.f19025H = 0;
            this.f19026I = null;
            this.f19031N = false;
            this.f19030M = false;
            this.f19029L = -1;
            this.f19042c.mo10800n();
            m22115A();
            if (this.f19046g.mo9549h()) {
                this.f19056q.pause();
            }
            if (m22124J(this.f19056q)) {
                tc4 tc4 = this.f19048i;
                Objects.requireNonNull(tc4);
                tc4.mo14289b(this.f19056q);
            }
            if (gb2.f9812a < 21 && !this.f19033P) {
                this.f19034Q = 0;
            }
            kc4 kc4 = this.f19054o;
            if (kc4 != null) {
                this.f19055p = kc4;
                this.f19054o = null;
            }
            this.f19046g.mo9545d();
            AudioTrack audioTrack = this.f19056q;
            yc1 yc1 = this.f19045f;
            yc1.mo15421c();
            synchronized (f19015W) {
                if (f19016X == null) {
                    f19016X = gb2.m13183q("ExoPlayer:AudioTrackReleaseThread");
                }
                f19017Y++;
                f19016X.execute(new gc4(audioTrack, yc1));
            }
            this.f19056q = null;
        }
        this.f19050k.mo12900a();
        this.f19049j.mo12900a();
    }

    /* renamed from: b */
    public final int mo14713b(C2388g4 g4Var) {
        if (!"audio/raw".equals(g4Var.f9673l)) {
            if (!this.f19037T) {
                int i = gb2.f9812a;
            }
            return this.f19040a.mo9506a(g4Var) != null ? 2 : 0;
        } else if (!gb2.m13188v(g4Var.f9656A)) {
            int i2 = g4Var.f9656A;
            ot1.m18060e("DefaultAudioSink", "Invalid PCM encoding: " + i2);
            return 0;
        } else if (g4Var.f9656A != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    /* renamed from: c */
    public final void mo14714c() {
        this.f19032O = false;
        if (m22123I() && this.f19046g.mo9552k()) {
            this.f19056q.pause();
        }
    }

    /* renamed from: d */
    public final void mo14715d(C2388g4 g4Var, int i, int[] iArr) throws tb4 {
        gb4[] gb4Arr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        C2388g4 g4Var2 = g4Var;
        if ("audio/raw".equals(g4Var2.f9673l)) {
            v91.m22050d(gb2.m13188v(g4Var2.f9656A));
            i7 = gb2.m13155Y(g4Var2.f9656A, g4Var2.f9686y);
            gb4[] gb4Arr2 = this.f19043d;
            this.f19042c.mo10801o(g4Var2.f9657B, g4Var2.f9658C);
            if (gb2.f9812a < 21 && g4Var2.f9686y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i9 = 0; i9 < 6; i9++) {
                    iArr2[i9] = i9;
                }
            } else {
                iArr2 = iArr;
            }
            this.f19041b.mo10127m(iArr2);
            eb4 eb4 = new eb4(g4Var2.f9687z, g4Var2.f9686y, g4Var2.f9656A);
            int length = gb4Arr2.length;
            int i10 = 0;
            while (i10 < length) {
                gb4 gb4 = gb4Arr2[i10];
                try {
                    eb4 f = gb4.mo9881f(eb4);
                    if (true == gb4.mo9878c()) {
                        eb4 = f;
                    }
                    i10++;
                } catch (fb4 e) {
                    throw new tb4((Throwable) e, g4Var2);
                }
            }
            int i11 = eb4.f8729c;
            int i12 = eb4.f8727a;
            int i13 = eb4.f8728b;
            int T = gb2.m13150T(i13);
            gb4Arr = gb4Arr2;
            i6 = gb2.m13155Y(i11, i13);
            i5 = i12;
            i3 = 0;
            int i14 = T;
            i2 = i11;
            i4 = i14;
        } else {
            gb4[] gb4Arr3 = new gb4[0];
            int i15 = g4Var2.f9687z;
            int i16 = gb2.f9812a;
            Pair a = this.f19040a.mo9506a(g4Var2);
            if (a != null) {
                i3 = 2;
                gb4Arr = gb4Arr3;
                i2 = ((Integer) a.first).intValue();
                i7 = -1;
                i4 = ((Integer) a.second).intValue();
                i5 = i15;
                i6 = -1;
            } else {
                throw new tb4("Unable to configure passthrough for: ".concat(String.valueOf(g4Var)), g4Var2);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, i4, i2);
        v91.m22052f(minBufferSize != -2);
        int i17 = 250000;
        if (i3 == 0) {
            int i18 = i6;
            i8 = gb2.m13146P(minBufferSize * 4, xc4.m23180a(250000, i5, i6), xc4.m23180a(750000, i5, i6));
        } else if (i3 != 1) {
            int i19 = 5;
            if (i2 == 5) {
                i17 = 500000;
                i2 = 5;
            } else {
                i19 = i2;
            }
            i8 = ad3.m9691a((((long) i17) * ((long) xc4.m23181b(i2))) / 1000000);
            i6 = i6;
            i2 = i19;
        } else {
            int i20 = i6;
            i8 = ad3.m9691a((((long) xc4.m23181b(i2)) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, (int) ((double) i8)) + i6) - 1) / i6) * i6;
        if (i2 == 0) {
            String valueOf = String.valueOf(g4Var);
            throw new tb4("Invalid output encoding (mode=" + i3 + ") for: " + valueOf, g4Var);
        } else if (i4 != 0) {
            this.f19037T = false;
            kc4 kc4 = new kc4(g4Var, i7, i3, i6, i5, i4, i2, max, gb4Arr);
            if (m22123I()) {
                this.f19054o = kc4;
            } else {
                this.f19055p = kc4;
            }
        } else {
            String valueOf2 = String.valueOf(g4Var);
            throw new tb4("Invalid output channel config (mode=" + i3 + ") for: " + valueOf2, g4Var);
        }
    }

    /* renamed from: e */
    public final fe0 mo14716e() {
        return m22137y().f13959a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:42|43|44|45|(3:47|48|49)|71|72|73) */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0250, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02c3, code lost:
        r1.f19065z = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c5, code lost:
        if (r0 == 0) goto L_0x02c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c8, code lost:
        return r10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0149 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:50:0x00d2=Splitter:B:50:0x00d2, B:71:0x0149=Splitter:B:71:0x0149} */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo14717f(java.nio.ByteBuffer r25, long r26, int r28) throws com.google.android.gms.internal.ads.ub4, com.google.android.gms.internal.ads.xb4 {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            java.nio.ByteBuffer r0 = r1.f19024G
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0013
            if (r2 != r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            com.google.android.gms.internal.ads.v91.m22050d(r0)
            com.google.android.gms.internal.ads.kc4 r0 = r1.f19054o
            r8 = 0
            if (r0 == 0) goto L_0x007f
            boolean r0 = r24.m22122H()
            if (r0 != 0) goto L_0x0023
            return r7
        L_0x0023:
            com.google.android.gms.internal.ads.kc4 r0 = r1.f19054o
            com.google.android.gms.internal.ads.kc4 r9 = r1.f19055p
            int r10 = r9.f12025c
            int r11 = r0.f12025c
            if (r10 != r11) goto L_0x006f
            int r10 = r9.f12029g
            int r11 = r0.f12029g
            if (r10 != r11) goto L_0x006f
            int r10 = r9.f12027e
            int r11 = r0.f12027e
            if (r10 != r11) goto L_0x006f
            int r10 = r9.f12028f
            int r11 = r0.f12028f
            if (r10 != r11) goto L_0x006f
            int r9 = r9.f12026d
            int r10 = r0.f12026d
            if (r9 != r10) goto L_0x006f
            r1.f19055p = r0
            r1.f19054o = r8
            android.media.AudioTrack r0 = r1.f19056q
            boolean r0 = m22124J(r0)
            if (r0 == 0) goto L_0x007c
            android.media.AudioTrack r0 = r1.f19056q
            int r0 = r0.getPlayState()
            r9 = 3
            if (r0 != r9) goto L_0x005f
            android.media.AudioTrack r0 = r1.f19056q
            r0.setOffloadEndOfStream()
        L_0x005f:
            android.media.AudioTrack r0 = r1.f19056q
            com.google.android.gms.internal.ads.kc4 r9 = r1.f19055p
            com.google.android.gms.internal.ads.g4 r9 = r9.f12023a
            int r10 = r9.f9657B
            int r9 = r9.f9658C
            r0.setOffloadDelayPadding(r10, r9)
            r1.f19038U = r6
            goto L_0x007c
        L_0x006f:
            r24.m22117C()
            boolean r0 = r24.mo14718g()
            if (r0 == 0) goto L_0x0079
            return r7
        L_0x0079:
            r24.mo14712a()
        L_0x007c:
            r1.m22138z(r3)
        L_0x007f:
            boolean r0 = r24.m22123I()
            r9 = 31
            if (r0 != 0) goto L_0x015a
            com.google.android.gms.internal.ads.yc1 r0 = r1.f19045f     // Catch:{ ub4 -> 0x014d }
            boolean r0 = r0.mo15422d()     // Catch:{ ub4 -> 0x014d }
            if (r0 != 0) goto L_0x0090
            return r7
        L_0x0090:
            com.google.android.gms.internal.ads.kc4 r0 = r1.f19055p     // Catch:{ ub4 -> 0x009a }
            java.util.Objects.requireNonNull(r0)
            android.media.AudioTrack r0 = r1.m22136x(r0)     // Catch:{ ub4 -> 0x009a }
            goto L_0x00d2
        L_0x009a:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.kc4 r0 = r1.f19055p     // Catch:{ ub4 -> 0x014d }
            int r12 = r0.f12030h     // Catch:{ ub4 -> 0x014d }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L_0x0149
            com.google.android.gms.internal.ads.kc4 r12 = new com.google.android.gms.internal.ads.kc4     // Catch:{ ub4 -> 0x014d }
            com.google.android.gms.internal.ads.g4 r15 = r0.f12023a     // Catch:{ ub4 -> 0x014d }
            int r13 = r0.f12024b     // Catch:{ ub4 -> 0x014d }
            int r14 = r0.f12025c     // Catch:{ ub4 -> 0x014d }
            int r8 = r0.f12026d     // Catch:{ ub4 -> 0x014d }
            int r7 = r0.f12027e     // Catch:{ ub4 -> 0x014d }
            int r6 = r0.f12028f     // Catch:{ ub4 -> 0x014d }
            int r10 = r0.f12029g     // Catch:{ ub4 -> 0x014d }
            r22 = 1000000(0xf4240, float:1.401298E-39)
            com.google.android.gms.internal.ads.gb4[] r0 = r0.f12031i     // Catch:{ ub4 -> 0x014d }
            r17 = r14
            r14 = r12
            r16 = r13
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r10
            r23 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ ub4 -> 0x014d }
            android.media.AudioTrack r0 = r1.m22136x(r12)     // Catch:{ ub4 -> 0x0130 }
            r1.f19055p = r12     // Catch:{ ub4 -> 0x0130 }
        L_0x00d2:
            r1.f19056q = r0     // Catch:{ ub4 -> 0x014d }
            boolean r0 = m22124J(r0)     // Catch:{ ub4 -> 0x014d }
            if (r0 == 0) goto L_0x00f9
            android.media.AudioTrack r0 = r1.f19056q     // Catch:{ ub4 -> 0x014d }
            com.google.android.gms.internal.ads.tc4 r6 = r1.f19048i     // Catch:{ ub4 -> 0x014d }
            if (r6 != 0) goto L_0x00e7
            com.google.android.gms.internal.ads.tc4 r6 = new com.google.android.gms.internal.ads.tc4     // Catch:{ ub4 -> 0x014d }
            r6.<init>(r1)     // Catch:{ ub4 -> 0x014d }
            r1.f19048i = r6     // Catch:{ ub4 -> 0x014d }
        L_0x00e7:
            com.google.android.gms.internal.ads.tc4 r6 = r1.f19048i     // Catch:{ ub4 -> 0x014d }
            r6.mo14288a(r0)     // Catch:{ ub4 -> 0x014d }
            android.media.AudioTrack r0 = r1.f19056q     // Catch:{ ub4 -> 0x014d }
            com.google.android.gms.internal.ads.kc4 r6 = r1.f19055p     // Catch:{ ub4 -> 0x014d }
            com.google.android.gms.internal.ads.g4 r6 = r6.f12023a     // Catch:{ ub4 -> 0x014d }
            int r7 = r6.f9657B     // Catch:{ ub4 -> 0x014d }
            int r6 = r6.f9658C     // Catch:{ ub4 -> 0x014d }
            r0.setOffloadDelayPadding(r7, r6)     // Catch:{ ub4 -> 0x014d }
        L_0x00f9:
            int r0 = com.google.android.gms.internal.ads.gb2.f9812a     // Catch:{ ub4 -> 0x014d }
            if (r0 < r9) goto L_0x0106
            com.google.android.gms.internal.ads.bb4 r0 = r1.f19052m     // Catch:{ ub4 -> 0x014d }
            if (r0 == 0) goto L_0x0106
            android.media.AudioTrack r6 = r1.f19056q     // Catch:{ ub4 -> 0x014d }
            com.google.android.gms.internal.ads.hc4.m13803a(r6, r0)     // Catch:{ ub4 -> 0x014d }
        L_0x0106:
            android.media.AudioTrack r0 = r1.f19056q     // Catch:{ ub4 -> 0x014d }
            int r0 = r0.getAudioSessionId()     // Catch:{ ub4 -> 0x014d }
            r1.f19034Q = r0     // Catch:{ ub4 -> 0x014d }
            com.google.android.gms.internal.ads.dc4 r10 = r1.f19046g     // Catch:{ ub4 -> 0x014d }
            android.media.AudioTrack r11 = r1.f19056q     // Catch:{ ub4 -> 0x014d }
            com.google.android.gms.internal.ads.kc4 r0 = r1.f19055p     // Catch:{ ub4 -> 0x014d }
            int r6 = r0.f12025c     // Catch:{ ub4 -> 0x014d }
            r7 = 2
            if (r6 != r7) goto L_0x011b
            r12 = 1
            goto L_0x011c
        L_0x011b:
            r12 = 0
        L_0x011c:
            int r13 = r0.f12029g     // Catch:{ ub4 -> 0x014d }
            int r14 = r0.f12026d     // Catch:{ ub4 -> 0x014d }
            int r15 = r0.f12030h     // Catch:{ ub4 -> 0x014d }
            r10.mo9546e(r11, r12, r13, r14, r15)     // Catch:{ ub4 -> 0x014d }
            r24.m22120F()     // Catch:{ ub4 -> 0x014d }
            com.google.android.gms.internal.ads.x84 r0 = r1.f19035R     // Catch:{ ub4 -> 0x014d }
            int r0 = r0.f20045a     // Catch:{ ub4 -> 0x014d }
            r6 = 1
            r1.f19019B = r6     // Catch:{ ub4 -> 0x014d }
            goto L_0x015a
        L_0x0130:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r4 = 0
            r3[r4] = r2     // Catch:{ Exception -> 0x0149 }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x0149 }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0149 }
            r3[r4] = r0     // Catch:{ Exception -> 0x0149 }
            r2.invoke(r11, r3)     // Catch:{ Exception -> 0x0149 }
        L_0x0149:
            r24.m22116B()     // Catch:{ ub4 -> 0x014d }
            throw r11     // Catch:{ ub4 -> 0x014d }
        L_0x014d:
            r0 = move-exception
            boolean r2 = r0.f18489b
            if (r2 != 0) goto L_0x0159
            com.google.android.gms.internal.ads.oc4 r2 = r1.f19049j
            r2.mo12901b(r0)
            r6 = 0
            return r6
        L_0x0159:
            throw r0
        L_0x015a:
            r6 = 0
            com.google.android.gms.internal.ads.oc4 r0 = r1.f19049j
            r0.mo12900a()
            boolean r0 = r1.f19019B
            r7 = 0
            if (r0 == 0) goto L_0x017a
            long r10 = java.lang.Math.max(r7, r3)
            r1.f19020C = r10
            r1.f19018A = r6
            r1.f19019B = r6
            r1.m22138z(r3)
            boolean r0 = r1.f19032O
            if (r0 == 0) goto L_0x017a
            r24.mo14709U()
        L_0x017a:
            com.google.android.gms.internal.ads.dc4 r0 = r1.f19046g
            long r10 = r24.m22135w()
            boolean r0 = r0.mo9551j(r10)
            if (r0 != 0) goto L_0x0188
            r6 = 0
            return r6
        L_0x0188:
            java.nio.ByteBuffer r0 = r1.f19024G
            if (r0 != 0) goto L_0x035b
            java.nio.ByteOrder r0 = r25.order()
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r6) goto L_0x0196
            r0 = 1
            goto L_0x0197
        L_0x0196:
            r0 = 0
        L_0x0197:
            com.google.android.gms.internal.ads.v91.m22050d(r0)
            boolean r0 = r25.hasRemaining()
            if (r0 != 0) goto L_0x01a2
            r6 = 1
            return r6
        L_0x01a2:
            com.google.android.gms.internal.ads.kc4 r0 = r1.f19055p
            int r6 = r0.f12025c
            if (r6 == 0) goto L_0x02c9
            int r6 = r1.f19065z
            if (r6 != 0) goto L_0x02c9
            int r0 = r0.f12029g
            r6 = 1024(0x400, float:1.435E-42)
            r10 = -2
            r11 = 16
            r12 = -1
            switch(r0) {
                case 5: goto L_0x02be;
                case 6: goto L_0x02be;
                case 7: goto L_0x0258;
                case 8: goto L_0x0258;
                case 9: goto L_0x0242;
                case 10: goto L_0x023f;
                case 11: goto L_0x023c;
                case 12: goto L_0x023c;
                case 13: goto L_0x01b7;
                case 14: goto L_0x01ec;
                case 15: goto L_0x01e9;
                case 16: goto L_0x023f;
                case 17: goto L_0x01ce;
                case 18: goto L_0x02be;
                default: goto L_0x01b7;
            }
        L_0x01b7:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01ce:
            int r0 = com.google.android.gms.internal.ads.tm4.f18167b
            byte[] r0 = new byte[r11]
            int r6 = r25.position()
            r2.get(r0)
            r2.position(r6)
            com.google.android.gms.internal.ads.x12 r6 = new com.google.android.gms.internal.ads.x12
            r6.<init>(r0, r11)
            com.google.android.gms.internal.ads.sm4 r0 = com.google.android.gms.internal.ads.tm4.m21086a(r6)
            int r0 = r0.f17593c
            goto L_0x0250
        L_0x01e9:
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0250
        L_0x01ec:
            int r0 = com.google.android.gms.internal.ads.qm4.f16478g
            int r0 = r25.position()
            int r6 = r25.limit()
            int r6 = r6 + -10
            r9 = r0
        L_0x01f9:
            if (r9 > r6) goto L_0x020c
            int r13 = r9 + 4
            int r13 = com.google.android.gms.internal.ads.gb2.m13151U(r2, r13)
            r13 = r13 & r10
            r14 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r13 != r14) goto L_0x0209
            int r9 = r9 - r0
            goto L_0x020d
        L_0x0209:
            int r9 = r9 + 1
            goto L_0x01f9
        L_0x020c:
            r9 = -1
        L_0x020d:
            if (r9 != r12) goto L_0x0211
            r0 = 0
            goto L_0x0250
        L_0x0211:
            int r0 = r25.position()
            int r0 = r0 + r9
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
            int r6 = r25.position()
            int r6 = r6 + r9
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9 = 187(0xbb, float:2.62E-43)
            if (r0 != r9) goto L_0x022a
            r0 = 9
            goto L_0x022c
        L_0x022a:
            r0 = 8
        L_0x022c:
            r9 = 40
            int r6 = r6 + r0
            byte r0 = r2.get(r6)
            int r0 = r0 >> 4
            r0 = r0 & 7
            int r0 = r9 << r0
            int r0 = r0 * 16
            goto L_0x0250
        L_0x023c:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0250
        L_0x023f:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0250
        L_0x0242:
            int r0 = r25.position()
            int r0 = com.google.android.gms.internal.ads.gb2.m13151U(r2, r0)
            int r0 = com.google.android.gms.internal.ads.C2308e.m11793c(r0)
            if (r0 == r12) goto L_0x0252
        L_0x0250:
            r10 = 1
            goto L_0x02c3
        L_0x0252:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0258:
            int r0 = com.google.android.gms.internal.ads.nn4.f14135d
            int r0 = r25.position()
            byte r6 = r2.get(r0)
            if (r6 == r10) goto L_0x02a5
            if (r6 == r12) goto L_0x028e
            if (r6 == r9) goto L_0x027c
            int r6 = r0 + 4
            byte r6 = r2.get(r6)
            r9 = 1
            r6 = r6 & r9
            int r6 = r6 << 6
            int r0 = r0 + 5
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r9 = 2
            goto L_0x02a1
        L_0x027c:
            r9 = 2
            int r6 = r0 + 5
            byte r6 = r2.get(r6)
            r6 = r6 & 7
            int r6 = r6 << 4
            int r0 = r0 + 6
            byte r0 = r2.get(r0)
            goto L_0x029f
        L_0x028e:
            r9 = 2
            int r6 = r0 + 4
            byte r6 = r2.get(r6)
            r6 = r6 & 7
            int r6 = r6 << 4
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
        L_0x029f:
            r0 = r0 & 60
        L_0x02a1:
            int r0 = r0 >> r9
            r0 = r0 | r6
            r10 = 1
            goto L_0x02ba
        L_0x02a5:
            r9 = 2
            int r6 = r0 + 5
            byte r6 = r2.get(r6)
            r10 = 1
            r6 = r6 & r10
            int r6 = r6 << 6
            int r0 = r0 + 4
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            int r0 = r0 >> r9
            r0 = r0 | r6
        L_0x02ba:
            int r0 = r0 + r10
            int r0 = r0 * 32
            goto L_0x02c3
        L_0x02be:
            r10 = 1
            int r0 = com.google.android.gms.internal.ads.qm4.m19293a(r25)
        L_0x02c3:
            r1.f19065z = r0
            if (r0 == 0) goto L_0x02c8
            goto L_0x02c9
        L_0x02c8:
            return r10
        L_0x02c9:
            com.google.android.gms.internal.ads.nc4 r0 = r1.f19058s
            if (r0 == 0) goto L_0x02db
            boolean r0 = r24.m22122H()
            if (r0 != 0) goto L_0x02d5
            r6 = 0
            return r6
        L_0x02d5:
            r1.m22138z(r3)
            r6 = 0
            r1.f19058s = r6
        L_0x02db:
            long r9 = r1.f19020C
            com.google.android.gms.internal.ads.kc4 r0 = r1.f19055p
            long r11 = r24.m22134v()
            com.google.android.gms.internal.ads.hd4 r6 = r1.f19042c
            long r13 = r6.mo10799m()
            long r11 = r11 - r13
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r13
            com.google.android.gms.internal.ads.g4 r0 = r0.f12023a
            int r0 = r0.f9687z
            long r13 = (long) r0
            long r11 = r11 / r13
            long r9 = r9 + r11
            boolean r0 = r1.f19018A
            if (r0 != 0) goto L_0x0314
            long r11 = r9 - r3
            long r11 = java.lang.Math.abs(r11)
            r13 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0314
            com.google.android.gms.internal.ads.vb4 r0 = r1.f19053n
            com.google.android.gms.internal.ads.wb4 r6 = new com.google.android.gms.internal.ads.wb4
            r6.<init>(r3, r9)
            r0.mo8315a(r6)
            r6 = 1
            r1.f19018A = r6
        L_0x0314:
            boolean r0 = r1.f19018A
            if (r0 == 0) goto L_0x033b
            boolean r0 = r24.m22122H()
            r6 = 0
            if (r0 != 0) goto L_0x0320
            return r6
        L_0x0320:
            long r9 = r3 - r9
            long r11 = r1.f19020C
            long r11 = r11 + r9
            r1.f19020C = r11
            r1.f19018A = r6
            r1.m22138z(r3)
            com.google.android.gms.internal.ads.vb4 r0 = r1.f19053n
            if (r0 == 0) goto L_0x033b
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x033b
            com.google.android.gms.internal.ads.ad4 r0 = (com.google.android.gms.internal.ads.ad4) r0
            com.google.android.gms.internal.ads.cd4 r0 = r0.f6529a
            r0.mo9151l0()
        L_0x033b:
            com.google.android.gms.internal.ads.kc4 r0 = r1.f19055p
            int r0 = r0.f12025c
            if (r0 != 0) goto L_0x034c
            long r6 = r1.f19061v
            int r0 = r25.remaining()
            long r8 = (long) r0
            long r6 = r6 + r8
            r1.f19061v = r6
            goto L_0x0357
        L_0x034c:
            long r6 = r1.f19062w
            int r0 = r1.f19065z
            long r8 = (long) r0
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.f19062w = r6
        L_0x0357:
            r1.f19024G = r2
            r1.f19025H = r5
        L_0x035b:
            r1.m22118D(r3)
            java.nio.ByteBuffer r0 = r1.f19024G
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x036e
            r2 = 0
            r1.f19024G = r2
            r2 = 0
            r1.f19025H = r2
            r3 = 1
            return r3
        L_0x036e:
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.ads.dc4 r0 = r1.f19046g
            long r4 = r24.m22135w()
            boolean r0 = r0.mo9550i(r4)
            if (r0 == 0) goto L_0x0387
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.gms.internal.ads.ot1.m18060e(r0, r2)
            r24.mo14712a()
            return r3
        L_0x0387:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vc4.mo14717f(java.nio.ByteBuffer, long, int):boolean");
    }

    /* renamed from: g */
    public final boolean mo14718g() {
        return m22123I() && this.f19046g.mo9548g(m22135w());
    }

    /* renamed from: h */
    public final void mo14719h(bb4 bb4) {
        this.f19052m = bb4;
    }

    /* renamed from: i */
    public final void mo14720i(vb4 vb4) {
        this.f19053n = vb4;
    }

    /* renamed from: j */
    public final boolean mo14721j() {
        return !m22123I() || (this.f19030M && !mo14718g());
    }

    /* renamed from: k */
    public final long mo14722k(boolean z) {
        long j;
        if (!m22123I() || this.f19019B) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f19046g.mo9543b(z), this.f19055p.mo11659a(m22135w()));
        while (!this.f19047h.isEmpty() && min >= ((nc4) this.f19047h.getFirst()).f13962d) {
            this.f19059t = (nc4) this.f19047h.remove();
        }
        nc4 nc4 = this.f19059t;
        long j2 = min - nc4.f13962d;
        if (nc4.f13959a.equals(fe0.f9258d)) {
            j = this.f19059t.f13961c + j2;
        } else if (this.f19047h.isEmpty()) {
            j = this.f19039V.mo11972a(j2) + this.f19059t.f13961c;
        } else {
            nc4 nc42 = (nc4) this.f19047h.getFirst();
            j = nc42.f13961c - gb2.m13162c0(nc42.f13962d - min, this.f19059t.f13959a.f9260a);
        }
        return j + this.f19055p.mo11659a(this.f19039V.mo11973b());
    }

    /* renamed from: k0 */
    public final void mo14723k0(boolean z) {
        m22119E(m22137y().f13959a, z);
    }

    /* renamed from: l */
    public final void mo14724l(w74 w74) {
        if (!this.f19057r.equals(w74)) {
            this.f19057r = w74;
            mo14712a();
        }
    }

    /* renamed from: m */
    public final void mo14725m(int i) {
        if (this.f19034Q != i) {
            this.f19034Q = i;
            this.f19033P = i != 0;
            mo14712a();
        }
    }

    /* renamed from: n */
    public final void mo14726n(float f) {
        if (this.f19021D != f) {
            this.f19021D = f;
            m22120F();
        }
    }

    /* renamed from: o */
    public final boolean mo14727o(C2388g4 g4Var) {
        return mo14713b(g4Var) != 0;
    }

    /* renamed from: p */
    public final void mo14728p(x84 x84) {
        if (!this.f19035R.equals(x84)) {
            int i = x84.f20045a;
            if (this.f19056q != null) {
                int i2 = this.f19035R.f20045a;
            }
            this.f19035R = x84;
        }
    }

    /* renamed from: q */
    public final void mo14729q(fe0 fe0) {
        m22119E(new fe0(gb2.m13131A(fe0.f9260a, 0.1f, 8.0f), gb2.m13131A(fe0.f9261b, 0.1f, 8.0f)), m22137y().f13960b);
    }
}
