package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class o64 extends y94 implements f54 {

    /* renamed from: j0 */
    public static final /* synthetic */ int f14916j0 = 0;

    /* renamed from: A */
    private final k84 f14917A;

    /* renamed from: B */
    private final long f14918B;

    /* renamed from: C */
    private int f14919C;

    /* renamed from: D */
    private int f14920D;

    /* renamed from: E */
    private boolean f14921E;

    /* renamed from: F */
    private int f14922F;

    /* renamed from: G */
    private a84 f14923G;

    /* renamed from: H */
    private wh0 f14924H;

    /* renamed from: I */
    private m20 f14925I;

    /* renamed from: J */
    private m20 f14926J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C2388g4 f14927K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C2388g4 f14928L;

    /* renamed from: M */
    private AudioTrack f14929M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Object f14930N;

    /* renamed from: O */
    private Surface f14931O;

    /* renamed from: P */
    private int f14932P;

    /* renamed from: Q */
    private int f14933Q;

    /* renamed from: R */
    private int f14934R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ny3 f14935S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public ny3 f14936T;

    /* renamed from: U */
    private int f14937U;

    /* renamed from: V */
    private w74 f14938V;

    /* renamed from: W */
    private float f14939W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f14940X;

    /* renamed from: Y */
    private u81 f14941Y;

    /* renamed from: Z */
    private boolean f14942Z;

    /* renamed from: a0 */
    private boolean f14943a0;

    /* renamed from: b */
    final fk4 f14944b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public ch4 f14945b0;

    /* renamed from: c */
    final wh0 f14946c;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public s61 f14947c0;

    /* renamed from: d */
    private final yc1 f14948d;

    /* renamed from: d0 */
    private m20 f14949d0;

    /* renamed from: e */
    private final Context f14950e;

    /* renamed from: e0 */
    private q74 f14951e0;

    /* renamed from: f */
    private final zl0 f14952f;

    /* renamed from: f0 */
    private int f14953f0;

    /* renamed from: g */
    private final x74[] f14954g;

    /* renamed from: g0 */
    private long f14955g0;

    /* renamed from: h */
    private final dk4 f14956h;

    /* renamed from: h0 */
    private final q54 f14957h0;

    /* renamed from: i */
    private final fk1 f14958i;

    /* renamed from: i0 */
    private gi4 f14959i0;

    /* renamed from: j */
    private final z64 f14960j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final lq1 f14961k;

    /* renamed from: l */
    private final CopyOnWriteArraySet f14962l;

    /* renamed from: m */
    private final dq0 f14963m;

    /* renamed from: n */
    private final List f14964n;

    /* renamed from: o */
    private final boolean f14965o;

    /* renamed from: p */
    private final lg4 f14966p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final l84 f14967q;

    /* renamed from: r */
    private final Looper f14968r;

    /* renamed from: s */
    private final mk4 f14969s;

    /* renamed from: t */
    private final wa1 f14970t;

    /* renamed from: u */
    private final k64 f14971u;

    /* renamed from: v */
    private final m64 f14972v;

    /* renamed from: w */
    private final js3 f14973w;

    /* renamed from: x */
    private final nw3 f14974x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public final i84 f14975y;

    /* renamed from: z */
    private final j84 f14976z;

    static {
        C2492ix.m14583b("media3.exoplayer");
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.lk4, com.google.android.gms.internal.ads.l84, java.lang.Object] */
    public o64(e54 e54, zl0 zl0) {
        bb4 a;
        o64 o64 = this;
        e54 e542 = e54;
        zl0 zl02 = zl0;
        yc1 yc1 = new yc1(wa1.f19542a);
        o64.f14948d = yc1;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = gb2.f9816e;
            ot1.m18059d("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "]");
            Context applicationContext = e542.f8663a.getApplicationContext();
            o64.f14950e = applicationContext;
            ? apply = e542.f8670h.apply(e542.f8664b);
            o64.f14967q = apply;
            o64.f14938V = e542.f8672j;
            o64.f14932P = e542.f8673k;
            o64.f14940X = false;
            o64.f14918B = e542.f8677o;
            k64 k64 = new k64(o64, (j64) null);
            o64.f14971u = k64;
            m64 m64 = new m64((l64) null);
            o64.f14972v = m64;
            Handler handler = new Handler(e542.f8671i);
            Handler handler2 = handler;
            x74[] a2 = ((y44) e542.f8665c).f20465a.mo9684a(handler, k64, k64, k64, k64);
            o64.f14954g = a2;
            int length = a2.length;
            dk4 dk4 = (dk4) e542.f8667e.zza();
            o64.f14956h = dk4;
            o64.f14966p = e54.m11933a(((z44) e542.f8666d).f20932a);
            qk4 c = qk4.m19247c(((c54) e542.f8669g).f7612a);
            o64.f14969s = c;
            o64.f14965o = e542.f8674l;
            o64.f14923G = e542.f8675m;
            Looper looper = e542.f8671i;
            o64.f14968r = looper;
            wa1 wa1 = e542.f8664b;
            o64.f14970t = wa1;
            o64.f14952f = zl02;
            lq1 lq1 = new lq1(looper, wa1, new p54(o64));
            o64.f14961k = lq1;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            o64.f14962l = copyOnWriteArraySet;
            o64.f14964n = new ArrayList();
            m64 m642 = m64;
            o64.f14959i0 = new gi4(0);
            int length2 = a2.length;
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            lq1 lq12 = lq1;
            k64 k642 = k64;
            fk4 fk4 = new fk4(new z74[2], new xj4[2], p41.f15675b, (Object) null);
            o64.f14944b = fk4;
            o64.f14963m = new dq0();
            uf0 uf0 = new uf0();
            yc1 yc12 = yc1;
            uf0.mo14505c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            dk4.mo9620c();
            uf0.mo14506d(29, true);
            wh0 e = uf0.mo14507e();
            o64.f14946c = e;
            uf0 uf02 = new uf0();
            uf02.mo14504b(e);
            uf02.mo14503a(4);
            uf02.mo14503a(10);
            o64.f14924H = uf02.mo14507e();
            o64.f14958i = wa1.mo14878a(looper, (Handler.Callback) null);
            q54 q54 = new q54(o64);
            o64.f14957h0 = q54;
            o64.f14951e0 = q74.m19103g(fk4);
            apply.mo11937y(zl02, looper);
            int i = gb2.f9812a;
            if (i < 31) {
                a = new bb4();
            } else {
                a = d64.m11334a(applicationContext, o64, e542.f8678p);
            }
            bb4 bb4 = a;
            d74 d74 = (d74) e542.f8668f.zza();
            a84 a84 = o64.f14923G;
            q14 q14 = e542.f8680r;
            int i2 = i;
            try {
                long j = e542.f8676n;
                m64 m643 = m642;
                CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
                z64 z64 = r7;
                fk4 fk42 = fk4;
                Looper looper2 = looper;
                qk4 qk4 = c;
                dk4 dk42 = dk4;
                lq1 lq13 = lq12;
                k64 k643 = k642;
                z64 z642 = new z64(a2, dk4, fk42, d74, c, 0, false, apply, a84, q14, j, false, looper2, wa1, q54, bb4, (byte[]) null);
                o64 = this;
                o64.f14960j = z64;
                o64.f14939W = 1.0f;
                m20 m20 = m20.f13165v;
                o64.f14925I = m20;
                o64.f14926J = m20;
                o64.f14949d0 = m20;
                o64.f14953f0 = -1;
                if (i2 < 21) {
                    AudioTrack audioTrack = o64.f14929M;
                    if (!(audioTrack == null || audioTrack.getAudioSessionId() == 0)) {
                        o64.f14929M.release();
                        o64.f14929M = null;
                    }
                    if (o64.f14929M == null) {
                        o64.f14929M = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                    }
                    o64.f14937U = o64.f14929M.getAudioSessionId();
                } else {
                    o64.f14937U = gb2.m13149S(applicationContext);
                }
                o64.f14941Y = new u81(ua3.m21508w(), 0);
                o64.f14942Z = true;
                Objects.requireNonNull(apply);
                lq13.mo12060b(apply);
                qk4.mo12369b(new Handler(looper2), apply);
                k64 k644 = k643;
                copyOnWriteArraySet3.add(k644);
                e54 e543 = e54;
                Handler handler3 = handler2;
                o64.f14973w = new js3(e543.f8663a, handler3, k644);
                o64.f14974x = new nw3(e543.f8663a, handler3, k644);
                gb2.m13186t((Object) null, (Object) null);
                i84 i84 = new i84(e543.f8663a, handler3, k644);
                o64.f14975y = i84;
                int i3 = o64.f14938V.f19520a;
                i84.mo11061f(3);
                o64.f14976z = new j84(e543.f8663a);
                o64.f14917A = new k84(e543.f8663a);
                o64.f14945b0 = m17533b0(i84);
                o64.f14947c0 = s61.f17271e;
                dk42.mo9619b(o64.f14938V);
                o64.m17538i0(1, 10, Integer.valueOf(o64.f14937U));
                o64.m17538i0(2, 10, Integer.valueOf(o64.f14937U));
                o64.m17538i0(1, 3, o64.f14938V);
                o64.m17538i0(2, 4, Integer.valueOf(o64.f14932P));
                o64.m17538i0(2, 5, 0);
                o64.m17538i0(1, 9, Boolean.valueOf(o64.f14940X));
                m64 m644 = m643;
                o64.m17538i0(2, 7, m644);
                o64.m17538i0(6, 8, m644);
                yc12.mo15423e();
            } catch (Throwable th) {
                th = th;
                o64 = this;
                o64.f14948d.mo15423e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            o64.f14948d.mo15423e();
            throw th;
        }
    }

    /* renamed from: N */
    private final int m17527N() {
        if (this.f14951e0.f16234a.mo10643o()) {
            return this.f14953f0;
        }
        q74 q74 = this.f14951e0;
        return q74.f16234a.mo10608n(q74.f16235b.f12629a, this.f14963m).f8361c;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public static int m17528O(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: P */
    private final long m17529P(q74 q74) {
        if (q74.f16234a.mo10643o()) {
            return gb2.m13168f0(this.f14955g0);
        }
        if (q74.f16235b.mo11883b()) {
            return q74.f16251r;
        }
        gt0 gt0 = q74.f16234a;
        mg4 mg4 = q74.f16235b;
        long j = q74.f16251r;
        m17531R(gt0, mg4, j);
        return j;
    }

    /* renamed from: Q */
    private static long m17530Q(q74 q74) {
        fs0 fs0 = new fs0();
        dq0 dq0 = new dq0();
        q74.f16234a.mo10608n(q74.f16235b.f12629a, dq0);
        long j = q74.f16236c;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = q74.f16234a.mo8903e(dq0.f8361c, fs0, 0).f9436k;
        return 0;
    }

    /* renamed from: R */
    private final long m17531R(gt0 gt0, mg4 mg4, long j) {
        gt0.mo10608n(mg4.f12629a, this.f14963m);
        return j;
    }

    /* renamed from: S */
    private final Pair m17532S(gt0 gt0, int i, long j) {
        if (gt0.mo10643o()) {
            this.f14953f0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f14955g0 = j;
            return null;
        }
        if (i == -1 || i >= gt0.mo8901c()) {
            i = gt0.mo10604g(false);
            long j2 = gt0.mo8903e(i, this.f20538a, 0).f9436k;
            j = gb2.m13176j0(0);
        }
        return gt0.mo10641l(this.f20538a, this.f14963m, i, gb2.m13168f0(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public static ch4 m17533b0(i84 i84) {
        return new ch4(0, i84.mo11059b(), i84.mo11058a());
    }

    /* renamed from: f0 */
    private final q74 m17534f0(q74 q74, gt0 gt0, Pair pair) {
        mg4 mg4;
        ki4 ki4;
        fk4 fk4;
        mg4 mg42;
        List list;
        int i;
        q74 q742;
        long j;
        gt0 gt02 = gt0;
        Pair pair2 = pair;
        v91.m22050d(gt0.mo10643o() || pair2 != null);
        gt0 gt03 = q74.f16234a;
        q74 f = q74.mo13492f(gt0);
        if (gt0.mo10643o()) {
            mg4 h = q74.m19104h();
            long f0 = gb2.m13168f0(this.f14955g0);
            q74 a = f.mo13488b(h, f0, f0, f0, 0, ki4.f12114d, this.f14944b, ua3.m21508w()).mo13487a(h);
            a.f16249p = a.f16251r;
            return a;
        }
        Object obj = f.f16235b.f12629a;
        int i2 = gb2.f9812a;
        boolean z = !obj.equals(pair2.first);
        if (z) {
            mg4 = new mg4(pair2.first);
        } else {
            mg4 = f.f16235b;
        }
        mg4 mg43 = mg4;
        long longValue = ((Long) pair2.second).longValue();
        long f02 = gb2.m13168f0(mo9049X());
        if (!gt03.mo10643o()) {
            gt03.mo10608n(obj, this.f14963m);
        }
        if (z || longValue < f02) {
            mg4 mg44 = mg43;
            v91.m22052f(!mg44.mo11883b());
            if (z) {
                ki4 = ki4.f12114d;
            } else {
                ki4 = f.f16241h;
            }
            ki4 ki42 = ki4;
            if (z) {
                mg42 = mg44;
                fk4 = this.f14944b;
            } else {
                mg42 = mg44;
                fk4 = f.f16242i;
            }
            fk4 fk42 = fk4;
            if (z) {
                list = ua3.m21508w();
            } else {
                list = f.f16243j;
            }
            q74 a2 = f.mo13488b(mg42, longValue, longValue, longValue, 0, ki42, fk42, list).mo13487a(mg42);
            a2.f16249p = longValue;
            return a2;
        }
        if (i == 0) {
            int a3 = gt02.mo8899a(f.f16244k.f12629a);
            if (a3 != -1 && gt02.mo8902d(a3, this.f14963m, false).f8361c == gt02.mo10608n(mg43.f12629a, this.f14963m).f8361c) {
                return f;
            }
            gt02.mo10608n(mg43.f12629a, this.f14963m);
            if (mg43.mo11883b()) {
                j = this.f14963m.mo9657g(mg43.f12630b, mg43.f12631c);
            } else {
                j = this.f14963m.f8362d;
            }
            q742 = f.mo13488b(mg43, f.f16251r, f.f16251r, f.f16237d, j - f.f16251r, f.f16241h, f.f16242i, f.f16243j).mo13487a(mg43);
            q742.f16249p = j;
        } else {
            mg4 mg45 = mg43;
            v91.m22052f(!mg45.mo11883b());
            long max = Math.max(0, f.f16250q - (longValue - f02));
            long j2 = f.f16249p;
            if (f.f16244k.equals(f.f16235b)) {
                j2 = longValue + max;
            }
            q742 = f.mo13488b(mg45, longValue, longValue, longValue, max, f.f16241h, f.f16242i, f.f16243j);
            q742.f16249p = j2;
        }
        return q742;
    }

    /* renamed from: g0 */
    private final t74 m17535g0(s74 s74) {
        int N = m17527N();
        z64 z64 = this.f14960j;
        return new t74(z64, s74, this.f14951e0.f16234a, N == -1 ? 0 : N, this.f14970t, z64.mo15553P());
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m17536h0(int i, int i2) {
        if (i != this.f14933Q || i2 != this.f14934R) {
            this.f14933Q = i;
            this.f14934R = i2;
            lq1 lq1 = this.f14961k;
            lq1.mo12062d(24, new t54(i, i2));
            lq1.mo12061c();
        }
    }

    /* renamed from: i0 */
    private final void m17538i0(int i, int i2, Object obj) {
        x74[] x74Arr = this.f14954g;
        int length = x74Arr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            x74 x74 = x74Arr[i3];
            if (x74.mo13072d() == i) {
                t74 g0 = m17535g0(x74);
                g0.mo14219f(i2);
                g0.mo14218e(obj);
                g0.mo14217d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m17540j0() {
        m17538i0(1, 2, Float.valueOf(this.f14939W * this.f14974x.mo12724a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public final void m17542k0(Object obj) {
        boolean z;
        ArrayList<t74> arrayList = new ArrayList<>();
        x74[] x74Arr = this.f14954g;
        int length = x74Arr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= 2) {
                break;
            }
            x74 x74 = x74Arr[i];
            if (x74.mo13072d() == 2) {
                t74 g0 = m17535g0(x74);
                g0.mo14219f(1);
                g0.mo14218e(obj);
                g0.mo14217d();
                arrayList.add(g0);
            }
            i++;
        }
        Object obj2 = this.f14930N;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                for (t74 i2 : arrayList) {
                    i2.mo14222i(this.f14918B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.f14930N;
            Surface surface = this.f14931O;
            if (obj3 == surface) {
                surface.release();
                this.f14931O = null;
            }
        }
        this.f14930N = obj;
        if (z) {
            m17544l0(false, u44.m21411d(new b74(3), 1003));
        }
    }

    /* renamed from: l0 */
    private final void m17544l0(boolean z, u44 u44) {
        q74 q74 = this.f14951e0;
        q74 a = q74.mo13487a(q74.f16235b);
        a.f16249p = a.f16251r;
        a.f16250q = 0;
        q74 e = a.mo13491e(1);
        if (u44 != null) {
            e = e.mo13490d(u44);
        }
        q74 q742 = e;
        this.f14919C++;
        this.f14960j.mo15558Z();
        m17548n0(q742, 0, 1, false, q742.f16234a.mo10643o() && !this.f14951e0.f16234a.mo10643o(), 4, m17529P(q742), -1);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public final void m17546m0(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        q74 q74 = this.f14951e0;
        if (q74.f16245l != z2 || q74.f16246m != i3) {
            this.f14919C++;
            q74 c = q74.mo13489c(z2, i3);
            this.f14960j.mo15557Y(z2, i3);
            m17548n0(c, 0, i2, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02aa  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17548n0(com.google.android.gms.internal.ads.q74 r44, int r45, int r46, boolean r47, boolean r48, int r49, long r50, int r52) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            r2 = r49
            com.google.android.gms.internal.ads.q74 r3 = r0.f14951e0
            r0.f14951e0 = r1
            com.google.android.gms.internal.ads.gt0 r4 = r3.f16234a
            com.google.android.gms.internal.ads.gt0 r5 = r1.f16234a
            boolean r4 = r4.equals(r5)
            r5 = 1
            r4 = r4 ^ r5
            com.google.android.gms.internal.ads.gt0 r6 = r3.f16234a
            com.google.android.gms.internal.ads.gt0 r7 = r1.f16234a
            boolean r8 = r7.mo10643o()
            r10 = 3
            r11 = 0
            r12 = 0
            r14 = -1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            if (r8 == 0) goto L_0x0036
            boolean r8 = r6.mo10643o()
            if (r8 == 0) goto L_0x0036
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r15)
            goto L_0x00c0
        L_0x0036:
            boolean r8 = r7.mo10643o()
            boolean r9 = r6.mo10643o()
            if (r8 == r9) goto L_0x004d
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x004d:
            com.google.android.gms.internal.ads.mg4 r8 = r3.f16235b
            java.lang.Object r8 = r8.f12629a
            com.google.android.gms.internal.ads.dq0 r9 = r0.f14963m
            com.google.android.gms.internal.ads.dq0 r8 = r6.mo10608n(r8, r9)
            int r8 = r8.f8361c
            com.google.android.gms.internal.ads.fs0 r9 = r0.f20538a
            com.google.android.gms.internal.ads.fs0 r6 = r6.mo8903e(r8, r9, r12)
            java.lang.Object r6 = r6.f9426a
            com.google.android.gms.internal.ads.mg4 r8 = r1.f16235b
            java.lang.Object r8 = r8.f12629a
            com.google.android.gms.internal.ads.dq0 r9 = r0.f14963m
            com.google.android.gms.internal.ads.dq0 r8 = r7.mo10608n(r8, r9)
            int r8 = r8.f8361c
            com.google.android.gms.internal.ads.fs0 r9 = r0.f20538a
            com.google.android.gms.internal.ads.fs0 r7 = r7.mo8903e(r8, r9, r12)
            java.lang.Object r7 = r7.f9426a
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x009d
            if (r48 == 0) goto L_0x0081
            if (r2 != 0) goto L_0x0081
            r4 = 1
            goto L_0x008a
        L_0x0081:
            if (r48 == 0) goto L_0x0087
            if (r2 != r5) goto L_0x0087
            r4 = 2
            goto L_0x008a
        L_0x0087:
            if (r4 == 0) goto L_0x0097
            r4 = 3
        L_0x008a:
            android.util.Pair r6 = new android.util.Pair
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.<init>(r7, r4)
            r4 = r6
            goto L_0x00c0
        L_0x0097:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x009d:
            if (r48 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.internal.ads.mg4 r4 = r3.f16235b
            long r6 = r4.f12632d
            com.google.android.gms.internal.ads.mg4 r4 = r1.f16235b
            long r8 = r4.f12632d
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b9
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            r4.<init>(r6, r7)
            goto L_0x00c0
        L_0x00b9:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r4.<init>(r6, r15)
        L_0x00c0:
            java.lang.Object r6 = r4.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            com.google.android.gms.internal.ads.m20 r7 = r0.f14925I
            if (r6 == 0) goto L_0x00fb
            com.google.android.gms.internal.ads.gt0 r9 = r1.f16234a
            boolean r9 = r9.mo10643o()
            if (r9 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.gt0 r9 = r1.f16234a
            com.google.android.gms.internal.ads.mg4 r15 = r1.f16235b
            java.lang.Object r15 = r15.f12629a
            com.google.android.gms.internal.ads.dq0 r8 = r0.f14963m
            com.google.android.gms.internal.ads.dq0 r8 = r9.mo10608n(r15, r8)
            int r8 = r8.f8361c
            com.google.android.gms.internal.ads.gt0 r9 = r1.f16234a
            com.google.android.gms.internal.ads.fs0 r15 = r0.f20538a
            com.google.android.gms.internal.ads.fs0 r8 = r9.mo8903e(r8, r15, r12)
            com.google.android.gms.internal.ads.hw r8 = r8.f9427b
            goto L_0x00f6
        L_0x00f5:
            r8 = 0
        L_0x00f6:
            com.google.android.gms.internal.ads.m20 r9 = com.google.android.gms.internal.ads.m20.f13165v
            r0.f14949d0 = r9
            goto L_0x00fc
        L_0x00fb:
            r8 = 0
        L_0x00fc:
            if (r6 != 0) goto L_0x0108
            java.util.List r9 = r3.f16243j
            java.util.List r15 = r1.f16243j
            boolean r9 = r9.equals(r15)
            if (r9 != 0) goto L_0x0161
        L_0x0108:
            com.google.android.gms.internal.ads.m20 r7 = r0.f14949d0
            com.google.android.gms.internal.ads.l00 r7 = r7.mo12260a()
            java.util.List r9 = r1.f16243j
            r15 = 0
        L_0x0111:
            int r10 = r9.size()
            if (r15 >= r10) goto L_0x0133
            java.lang.Object r10 = r9.get(r15)
            com.google.android.gms.internal.ads.k60 r10 = (com.google.android.gms.internal.ads.k60) r10
            r14 = 0
        L_0x011e:
            int r11 = r10.mo11568a()
            if (r14 >= r11) goto L_0x012e
            com.google.android.gms.internal.ads.j50 r11 = r10.mo11569b(r14)
            r11.mo8652E0(r7)
            int r14 = r14 + 1
            goto L_0x011e
        L_0x012e:
            int r15 = r15 + 1
            r11 = 0
            r14 = -1
            goto L_0x0111
        L_0x0133:
            com.google.android.gms.internal.ads.m20 r7 = r7.mo11852L()
            r0.f14949d0 = r7
            com.google.android.gms.internal.ads.gt0 r7 = r43.mo9053a0()
            boolean r9 = r7.mo10643o()
            if (r9 == 0) goto L_0x0146
            com.google.android.gms.internal.ads.m20 r7 = r0.f14949d0
            goto L_0x0161
        L_0x0146:
            int r9 = r43.mo9045T()
            com.google.android.gms.internal.ads.fs0 r10 = r0.f20538a
            com.google.android.gms.internal.ads.fs0 r7 = r7.mo8903e(r9, r10, r12)
            com.google.android.gms.internal.ads.hw r7 = r7.f9427b
            com.google.android.gms.internal.ads.m20 r9 = r0.f14949d0
            com.google.android.gms.internal.ads.l00 r9 = r9.mo12260a()
            com.google.android.gms.internal.ads.m20 r7 = r7.f10512e
            r9.mo11854r(r7)
            com.google.android.gms.internal.ads.m20 r7 = r9.mo11852L()
        L_0x0161:
            com.google.android.gms.internal.ads.m20 r9 = r0.f14925I
            boolean r9 = r7.equals(r9)
            r9 = r9 ^ r5
            r0.f14925I = r7
            boolean r7 = r3.f16245l
            boolean r10 = r1.f16245l
            int r11 = r3.f16238e
            int r14 = r1.f16238e
            if (r11 != r14) goto L_0x0176
            if (r7 == r10) goto L_0x0179
        L_0x0176:
            r43.m17550o0()
        L_0x0179:
            boolean r15 = r3.f16240g
            boolean r5 = r1.f16240g
            com.google.android.gms.internal.ads.gt0 r12 = r3.f16234a
            com.google.android.gms.internal.ads.gt0 r13 = r1.f16234a
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0197
            com.google.android.gms.internal.ads.lq1 r12 = r0.f14961k
            com.google.android.gms.internal.ads.w54 r13 = new com.google.android.gms.internal.ads.w54
            r18 = r7
            r7 = r45
            r13.<init>(r1, r7)
            r7 = 0
            r12.mo12062d(r7, r13)
            goto L_0x0199
        L_0x0197:
            r18 = r7
        L_0x0199:
            if (r48 == 0) goto L_0x02cc
            com.google.android.gms.internal.ads.dq0 r7 = new com.google.android.gms.internal.ads.dq0
            r7.<init>()
            com.google.android.gms.internal.ads.gt0 r12 = r3.f16234a
            boolean r12 = r12.mo10643o()
            if (r12 != 0) goto L_0x01de
            com.google.android.gms.internal.ads.mg4 r12 = r3.f16235b
            java.lang.Object r12 = r12.f12629a
            com.google.android.gms.internal.ads.gt0 r13 = r3.f16234a
            r13.mo10608n(r12, r7)
            int r13 = r7.f8361c
            r17 = r10
            com.google.android.gms.internal.ads.gt0 r10 = r3.f16234a
            int r10 = r10.mo8899a(r12)
            r45 = r10
            com.google.android.gms.internal.ads.gt0 r10 = r3.f16234a
            r48 = r12
            com.google.android.gms.internal.ads.fs0 r12 = r0.f20538a
            r19 = r14
            r20 = r15
            r14 = 0
            com.google.android.gms.internal.ads.fs0 r10 = r10.mo8903e(r13, r12, r14)
            java.lang.Object r10 = r10.f9426a
            com.google.android.gms.internal.ads.fs0 r12 = r0.f20538a
            com.google.android.gms.internal.ads.hw r12 = r12.f9427b
            r26 = r45
            r25 = r48
            r22 = r10
            r24 = r12
            r23 = r13
            goto L_0x01ee
        L_0x01de:
            r17 = r10
            r19 = r14
            r20 = r15
            r23 = r52
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = -1
        L_0x01ee:
            if (r2 != 0) goto L_0x0218
            com.google.android.gms.internal.ads.mg4 r10 = r3.f16235b
            boolean r10 = r10.mo11883b()
            if (r10 == 0) goto L_0x0207
            com.google.android.gms.internal.ads.mg4 r10 = r3.f16235b
            int r12 = r10.f12630b
            int r10 = r10.f12631c
            long r12 = r7.mo9657g(r12, r10)
            long r14 = m17530Q(r3)
            goto L_0x022a
        L_0x0207:
            com.google.android.gms.internal.ads.mg4 r10 = r3.f16235b
            int r10 = r10.f12633e
            r12 = -1
            if (r10 == r12) goto L_0x0215
            com.google.android.gms.internal.ads.q74 r7 = r0.f14951e0
            long r12 = m17530Q(r7)
            goto L_0x0229
        L_0x0215:
            long r12 = r7.f8362d
            goto L_0x0229
        L_0x0218:
            com.google.android.gms.internal.ads.mg4 r7 = r3.f16235b
            boolean r7 = r7.mo11883b()
            if (r7 == 0) goto L_0x0227
            long r12 = r3.f16251r
            long r14 = m17530Q(r3)
            goto L_0x022a
        L_0x0227:
            long r12 = r3.f16251r
        L_0x0229:
            r14 = r12
        L_0x022a:
            com.google.android.gms.internal.ads.yk0 r7 = new com.google.android.gms.internal.ads.yk0
            long r27 = com.google.android.gms.internal.ads.gb2.m13176j0(r12)
            com.google.android.gms.internal.ads.mg4 r10 = r3.f16235b
            long r29 = com.google.android.gms.internal.ads.gb2.m13176j0(r14)
            int r12 = r10.f12630b
            int r10 = r10.f12631c
            r21 = r7
            r31 = r12
            r32 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r29, r31, r32)
            int r10 = r43.mo9045T()
            com.google.android.gms.internal.ads.q74 r12 = r0.f14951e0
            com.google.android.gms.internal.ads.gt0 r12 = r12.f16234a
            boolean r12 = r12.mo10643o()
            if (r12 != 0) goto L_0x0285
            com.google.android.gms.internal.ads.q74 r12 = r0.f14951e0
            com.google.android.gms.internal.ads.mg4 r13 = r12.f16235b
            java.lang.Object r13 = r13.f12629a
            com.google.android.gms.internal.ads.gt0 r12 = r12.f16234a
            com.google.android.gms.internal.ads.dq0 r14 = r0.f14963m
            r12.mo10608n(r13, r14)
            com.google.android.gms.internal.ads.q74 r12 = r0.f14951e0
            com.google.android.gms.internal.ads.gt0 r12 = r12.f16234a
            int r12 = r12.mo8899a(r13)
            com.google.android.gms.internal.ads.q74 r14 = r0.f14951e0
            com.google.android.gms.internal.ads.gt0 r14 = r14.f16234a
            com.google.android.gms.internal.ads.fs0 r15 = r0.f20538a
            r45 = r12
            r16 = r13
            r12 = 0
            com.google.android.gms.internal.ads.fs0 r12 = r14.mo8903e(r10, r15, r12)
            java.lang.Object r12 = r12.f9426a
            com.google.android.gms.internal.ads.fs0 r13 = r0.f20538a
            com.google.android.gms.internal.ads.hw r13 = r13.f9427b
            r36 = r45
            r32 = r12
            r34 = r13
            r35 = r16
            goto L_0x028d
        L_0x0285:
            r32 = 0
            r34 = 0
            r35 = 0
            r36 = -1
        L_0x028d:
            long r37 = com.google.android.gms.internal.ads.gb2.m13176j0(r50)
            com.google.android.gms.internal.ads.yk0 r12 = new com.google.android.gms.internal.ads.yk0
            com.google.android.gms.internal.ads.q74 r13 = r0.f14951e0
            com.google.android.gms.internal.ads.mg4 r13 = r13.f16235b
            boolean r13 = r13.mo11883b()
            if (r13 == 0) goto L_0x02aa
            com.google.android.gms.internal.ads.q74 r13 = r0.f14951e0
            long r13 = m17530Q(r13)
            long r13 = com.google.android.gms.internal.ads.gb2.m13176j0(r13)
            r39 = r13
            goto L_0x02ac
        L_0x02aa:
            r39 = r37
        L_0x02ac:
            com.google.android.gms.internal.ads.q74 r13 = r0.f14951e0
            com.google.android.gms.internal.ads.mg4 r13 = r13.f16235b
            int r14 = r13.f12630b
            int r13 = r13.f12631c
            r31 = r12
            r33 = r10
            r41 = r14
            r42 = r13
            r31.<init>(r32, r33, r34, r35, r36, r37, r39, r41, r42)
            com.google.android.gms.internal.ads.lq1 r10 = r0.f14961k
            com.google.android.gms.internal.ads.c64 r13 = new com.google.android.gms.internal.ads.c64
            r13.<init>(r2, r7, r12)
            r2 = 11
            r10.mo12062d(r2, r13)
            goto L_0x02d2
        L_0x02cc:
            r17 = r10
            r19 = r14
            r20 = r15
        L_0x02d2:
            if (r6 == 0) goto L_0x02df
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.g54 r6 = new com.google.android.gms.internal.ads.g54
            r6.<init>(r8, r4)
            r4 = 1
            r2.mo12062d(r4, r6)
        L_0x02df:
            com.google.android.gms.internal.ads.u44 r2 = r3.f16239f
            com.google.android.gms.internal.ads.u44 r4 = r1.f16239f
            if (r2 == r4) goto L_0x02ff
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.h54 r4 = new com.google.android.gms.internal.ads.h54
            r4.<init>(r1)
            r6 = 10
            r2.mo12062d(r6, r4)
            com.google.android.gms.internal.ads.u44 r2 = r1.f16239f
            if (r2 == 0) goto L_0x02ff
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.i54 r4 = new com.google.android.gms.internal.ads.i54
            r4.<init>(r1)
            r2.mo12062d(r6, r4)
        L_0x02ff:
            com.google.android.gms.internal.ads.fk4 r2 = r3.f16242i
            com.google.android.gms.internal.ads.fk4 r4 = r1.f16242i
            if (r2 == r4) goto L_0x0317
            com.google.android.gms.internal.ads.dk4 r2 = r0.f14956h
            java.lang.Object r4 = r4.f9315e
            r2.mo8424e(r4)
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.j54 r4 = new com.google.android.gms.internal.ads.j54
            r4.<init>(r1)
            r6 = 2
            r2.mo12062d(r6, r4)
        L_0x0317:
            if (r9 == 0) goto L_0x0327
            com.google.android.gms.internal.ads.m20 r2 = r0.f14925I
            com.google.android.gms.internal.ads.lq1 r4 = r0.f14961k
            com.google.android.gms.internal.ads.k54 r6 = new com.google.android.gms.internal.ads.k54
            r6.<init>(r2)
            r2 = 14
            r4.mo12062d(r2, r6)
        L_0x0327:
            r2 = r20
            if (r2 == r5) goto L_0x0336
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.l54 r4 = new com.google.android.gms.internal.ads.l54
            r4.<init>(r1)
            r5 = 3
            r2.mo12062d(r5, r4)
        L_0x0336:
            r2 = r19
            r5 = r17
            r4 = r18
            if (r11 != r2) goto L_0x0340
            if (r4 == r5) goto L_0x034b
        L_0x0340:
            com.google.android.gms.internal.ads.lq1 r6 = r0.f14961k
            com.google.android.gms.internal.ads.m54 r7 = new com.google.android.gms.internal.ads.m54
            r7.<init>(r1)
            r8 = -1
            r6.mo12062d(r8, r7)
        L_0x034b:
            if (r11 == r2) goto L_0x0358
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.n54 r6 = new com.google.android.gms.internal.ads.n54
            r6.<init>(r1)
            r7 = 4
            r2.mo12062d(r7, r6)
        L_0x0358:
            if (r4 == r5) goto L_0x0367
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.x54 r4 = new com.google.android.gms.internal.ads.x54
            r5 = r46
            r4.<init>(r1, r5)
            r5 = 5
            r2.mo12062d(r5, r4)
        L_0x0367:
            int r2 = r3.f16246m
            int r4 = r1.f16246m
            if (r2 == r4) goto L_0x0378
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.y54 r4 = new com.google.android.gms.internal.ads.y54
            r4.<init>(r1)
            r5 = 6
            r2.mo12062d(r5, r4)
        L_0x0378:
            boolean r2 = m17554q0(r3)
            boolean r4 = m17554q0(r44)
            if (r2 == r4) goto L_0x038d
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.z54 r4 = new com.google.android.gms.internal.ads.z54
            r4.<init>(r1)
            r5 = 7
            r2.mo12062d(r5, r4)
        L_0x038d:
            com.google.android.gms.internal.ads.fe0 r2 = r3.f16247n
            com.google.android.gms.internal.ads.fe0 r4 = r1.f16247n
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x03a3
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.a64 r4 = new com.google.android.gms.internal.ads.a64
            r4.<init>(r1)
            r5 = 12
            r2.mo12062d(r5, r4)
        L_0x03a3:
            if (r47 == 0) goto L_0x03ad
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.b64 r4 = com.google.android.gms.internal.ads.b64.f7114a
            r5 = -1
            r2.mo12062d(r5, r4)
        L_0x03ad:
            com.google.android.gms.internal.ads.wh0 r2 = r0.f14924H
            com.google.android.gms.internal.ads.zl0 r4 = r0.f14952f
            com.google.android.gms.internal.ads.wh0 r5 = r0.f14946c
            com.google.android.gms.internal.ads.wh0 r4 = com.google.android.gms.internal.ads.gb2.m13169g(r4, r5)
            r0.f14924H = r4
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x03cb
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            com.google.android.gms.internal.ads.o54 r4 = new com.google.android.gms.internal.ads.o54
            r4.<init>(r0)
            r5 = 13
            r2.mo12062d(r5, r4)
        L_0x03cb:
            com.google.android.gms.internal.ads.lq1 r2 = r0.f14961k
            r2.mo12061c()
            boolean r2 = r3.f16248o
            boolean r3 = r1.f16248o
            if (r2 == r3) goto L_0x03ee
            java.util.concurrent.CopyOnWriteArraySet r2 = r0.f14962l
            java.util.Iterator r2 = r2.iterator()
        L_0x03dc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ee
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.ads.v44 r3 = (com.google.android.gms.internal.ads.v44) r3
            boolean r4 = r1.f16248o
            r3.mo11586b(r4)
            goto L_0x03dc
        L_0x03ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o64.m17548n0(com.google.android.gms.internal.ads.q74, int, int, boolean, boolean, int, long, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public final void m17550o0() {
        int U = mo9046U();
        if (U == 2 || U == 3) {
            m17552p0();
            boolean z = this.f14951e0.f16248o;
            mo9061h();
            mo9061h();
        }
    }

    /* renamed from: p0 */
    private final void m17552p0() {
        IllegalStateException illegalStateException;
        this.f14948d.mo15420b();
        if (Thread.currentThread() != this.f14968r.getThread()) {
            String i = gb2.m13173i("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f14968r.getThread().getName());
            if (!this.f14942Z) {
                if (this.f14943a0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                ot1.m18061f("ExoPlayerImpl", i, illegalStateException);
                this.f14943a0 = true;
                return;
            }
            throw new IllegalStateException(i);
        }
    }

    /* renamed from: q0 */
    private static boolean m17554q0(q74 q74) {
        return q74.f16238e == 3 && q74.f16245l && q74.f16246m == 0;
    }

    /* renamed from: u */
    static /* bridge */ /* synthetic */ void m17559u(o64 o64, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        o64.m17542k0(surface);
        o64.f14931O = surface;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final /* synthetic */ void mo12840A(x64 x64) {
        this.f14958i.mo9039r(new r54(this, x64));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final /* synthetic */ void mo12841B(xi0 xi0) {
        xi0.mo13720T(this.f14924H);
    }

    /* renamed from: D */
    public final void mo12842D() {
        m17552p0();
        boolean h = mo9061h();
        int i = 2;
        int b = this.f14974x.mo12725b(h, 2);
        m17546m0(h, b, m17528O(h, b));
        q74 q74 = this.f14951e0;
        if (q74.f16238e == 1) {
            q74 d = q74.mo13490d((u44) null);
            if (true == d.f16234a.mo10643o()) {
                i = 4;
            }
            q74 e = d.mo13491e(i);
            this.f14919C++;
            this.f14960j.mo15555V();
            m17548n0(e, 1, 1, false, false, 5, -9223372036854775807L, -1);
        }
    }

    /* renamed from: E */
    public final void mo12843E() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = gb2.f9816e;
        String a = C2492ix.m14582a();
        ot1.m18059d("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.0.0-beta02] [" + str + "] [" + a + "]");
        m17552p0();
        if (gb2.f9812a < 21 && (audioTrack = this.f14929M) != null) {
            audioTrack.release();
            this.f14929M = null;
        }
        this.f14975y.mo11060e();
        this.f14974x.mo12726d();
        if (!this.f14960j.mo15559a0()) {
            lq1 lq1 = this.f14961k;
            lq1.mo12062d(10, s54.f17269a);
            lq1.mo12061c();
        }
        this.f14961k.mo12063e();
        this.f14958i.mo9041t((Object) null);
        this.f14969s.mo12368a(this.f14967q);
        q74 e = this.f14951e0.mo13491e(1);
        this.f14951e0 = e;
        q74 a2 = e.mo13487a(e.f16235b);
        this.f14951e0 = a2;
        a2.f16249p = a2.f16251r;
        this.f14951e0.f16250q = 0;
        this.f14967q.mo11926n();
        this.f14956h.mo9618a();
        Surface surface = this.f14931O;
        if (surface != null) {
            surface.release();
            this.f14931O = null;
        }
        this.f14941Y = new u81(ua3.m21508w(), 0);
    }

    /* renamed from: F */
    public final void mo12844F(o84 o84) {
        this.f14967q.mo11924l(o84);
    }

    /* renamed from: G */
    public final void mo12845G(og4 og4) {
        m17552p0();
        List singletonList = Collections.singletonList(og4);
        m17552p0();
        m17552p0();
        m17527N();
        mo9051Z();
        this.f14919C++;
        if (!this.f14964n.isEmpty()) {
            int size = this.f14964n.size();
            for (int i = size - 1; i >= 0; i--) {
                this.f14964n.remove(i);
            }
            this.f14959i0 = this.f14959i0.mo10554h(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            n74 n74 = new n74((og4) singletonList.get(i2), this.f14965o);
            arrayList.add(n74);
            this.f14964n.add(i2, new n64(n74.f13890b, n74.f13889a.mo10811C()));
        }
        this.f14959i0 = this.f14959i0.mo10553g(0, arrayList.size());
        u74 u74 = new u74(this.f14964n, this.f14959i0, (byte[]) null);
        if (u74.mo10643o() || u74.mo8901c() >= 0) {
            int g = u74.mo10604g(false);
            q74 f0 = m17534f0(this.f14951e0, u74, m17532S(u74, g, -9223372036854775807L));
            int i3 = f0.f16238e;
            if (!(g == -1 || i3 == 1)) {
                i3 = (u74.mo10643o() || g >= u74.mo8901c()) ? 4 : 2;
            }
            q74 e = f0.mo13491e(i3);
            this.f14960j.mo15560b0(arrayList, g, gb2.m13168f0(-9223372036854775807L), this.f14959i0);
            m17548n0(e, 0, 1, false, !this.f14951e0.f16235b.f12629a.equals(e.f16235b.f12629a) && !this.f14951e0.f16234a.mo10643o(), 4, m17529P(e), -1);
            return;
        }
        throw new C2426h5(u74, -1, -9223372036854775807L);
    }

    /* renamed from: H */
    public final void mo12846H(boolean z) {
        m17552p0();
        int b = this.f14974x.mo12725b(z, mo9046U());
        m17546m0(z, b, m17528O(z, b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final void mo12847I(boolean z) {
        this.f14942Z = false;
    }

    /* renamed from: J */
    public final void mo12848J(Surface surface) {
        m17552p0();
        m17542k0(surface);
        int i = surface == null ? 0 : -1;
        m17536h0(i, i);
    }

    /* renamed from: K */
    public final void mo12849K(float f) {
        m17552p0();
        float A = gb2.m13131A(f, 0.0f, 1.0f);
        if (this.f14939W != A) {
            this.f14939W = A;
            m17540j0();
            lq1 lq1 = this.f14961k;
            lq1.mo12062d(22, new v54(A));
            lq1.mo12061c();
        }
    }

    /* renamed from: L */
    public final void mo12850L() {
        m17552p0();
        m17552p0();
        this.f14974x.mo12725b(mo9061h(), 1);
        m17544l0(false, (u44) null);
        this.f14941Y = new u81(ua3.m21508w(), this.f14951e0.f16251r);
    }

    /* renamed from: T */
    public final int mo9045T() {
        m17552p0();
        int N = m17527N();
        if (N == -1) {
            return 0;
        }
        return N;
    }

    /* renamed from: U */
    public final int mo9046U() {
        m17552p0();
        return this.f14951e0.f16238e;
    }

    /* renamed from: V */
    public final int mo9047V() {
        m17552p0();
        return this.f14951e0.f16246m;
    }

    /* renamed from: W */
    public final int mo9048W() {
        m17552p0();
        return 0;
    }

    /* renamed from: X */
    public final long mo9049X() {
        m17552p0();
        if (!mo9057d0()) {
            return mo9051Z();
        }
        q74 q74 = this.f14951e0;
        q74.f16234a.mo10608n(q74.f16235b.f12629a, this.f14963m);
        q74 q742 = this.f14951e0;
        if (q742.f16236c != -9223372036854775807L) {
            return gb2.m13176j0(0) + gb2.m13176j0(this.f14951e0.f16236c);
        }
        long j = q742.f16234a.mo8903e(mo9045T(), this.f20538a, 0).f9436k;
        return gb2.m13176j0(0);
    }

    /* renamed from: Y */
    public final p41 mo9050Y() {
        m17552p0();
        return this.f14951e0.f16242i.f9314d;
    }

    /* renamed from: Z */
    public final long mo9051Z() {
        m17552p0();
        return gb2.m13176j0(m17529P(this.f14951e0));
    }

    /* renamed from: a */
    public final int mo9052a() {
        m17552p0();
        if (mo9057d0()) {
            return this.f14951e0.f16235b.f12631c;
        }
        return -1;
    }

    /* renamed from: a0 */
    public final gt0 mo9053a0() {
        m17552p0();
        return this.f14951e0.f16234a;
    }

    /* renamed from: b */
    public final int mo9054b() {
        m17552p0();
        if (mo9057d0()) {
            return this.f14951e0.f16235b.f12630b;
        }
        return -1;
    }

    /* renamed from: c */
    public final int mo9055c() {
        m17552p0();
        if (this.f14951e0.f16234a.mo10643o()) {
            return 0;
        }
        q74 q74 = this.f14951e0;
        return q74.f16234a.mo8899a(q74.f16235b.f12629a);
    }

    /* renamed from: c0 */
    public final long mo9056c0() {
        m17552p0();
        return gb2.m13176j0(this.f14951e0.f16250q);
    }

    /* renamed from: d0 */
    public final boolean mo9057d0() {
        m17552p0();
        return this.f14951e0.f16235b.mo11883b();
    }

    /* renamed from: e0 */
    public final boolean mo9058e0() {
        m17552p0();
        return false;
    }

    /* renamed from: f */
    public final void mo9059f(int i, long j) {
        int i2 = i;
        long j2 = j;
        m17552p0();
        this.f14967q.mo11929q();
        gt0 gt0 = this.f14951e0.f16234a;
        if (i2 < 0 || (!gt0.mo10643o() && i2 >= gt0.mo8901c())) {
            throw new C2426h5(gt0, i, j2);
        }
        int i3 = 1;
        this.f14919C++;
        if (mo9057d0()) {
            ot1.m18060e("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            x64 x64 = new x64(this.f14951e0);
            x64.mo15056a(1);
            this.f14957h0.f16192a.mo12840A(x64);
            return;
        }
        if (mo9046U() != 1) {
            i3 = 2;
        }
        int T = mo9045T();
        q74 f0 = m17534f0(this.f14951e0.mo13491e(i3), gt0, m17532S(gt0, i, j2));
        this.f14960j.mo15556X(gt0, i, gb2.m13168f0(j));
        m17548n0(f0, 0, 1, true, true, 1, m17529P(f0), T);
    }

    /* renamed from: g */
    public final u44 mo12851g() {
        m17552p0();
        return this.f14951e0.f16239f;
    }

    /* renamed from: h */
    public final boolean mo9061h() {
        m17552p0();
        return this.f14951e0.f16245l;
    }

    /* renamed from: s0 */
    public final int mo12852s0() {
        m17552p0();
        int length = this.f14954g.length;
        return 2;
    }

    /* renamed from: t0 */
    public final long mo12853t0() {
        m17552p0();
        if (mo9057d0()) {
            q74 q74 = this.f14951e0;
            if (q74.f16244k.equals(q74.f16235b)) {
                return gb2.m13176j0(this.f14951e0.f16249p);
            }
            return mo12854u0();
        }
        m17552p0();
        if (this.f14951e0.f16234a.mo10643o()) {
            return this.f14955g0;
        }
        q74 q742 = this.f14951e0;
        long j = 0;
        if (q742.f16244k.f12632d != q742.f16235b.f12632d) {
            return gb2.m13176j0(q742.f16234a.mo8903e(mo9045T(), this.f20538a, 0).f9437l);
        }
        long j2 = q742.f16249p;
        if (this.f14951e0.f16244k.mo11883b()) {
            q74 q743 = this.f14951e0;
            q743.f16234a.mo10608n(q743.f16244k.f12629a, this.f14963m).mo9658h(this.f14951e0.f16244k.f12630b);
        } else {
            j = j2;
        }
        q74 q744 = this.f14951e0;
        m17531R(q744.f16234a, q744.f16244k, j);
        return gb2.m13176j0(j);
    }

    /* renamed from: u0 */
    public final long mo12854u0() {
        m17552p0();
        if (!mo9057d0()) {
            gt0 a0 = mo9053a0();
            if (a0.mo10643o()) {
                return -9223372036854775807L;
            }
            return gb2.m13176j0(a0.mo8903e(mo9045T(), this.f20538a, 0).f9437l);
        }
        q74 q74 = this.f14951e0;
        mg4 mg4 = q74.f16235b;
        q74.f16234a.mo10608n(mg4.f12629a, this.f14963m);
        return gb2.m13176j0(this.f14963m.mo9657g(mg4.f12630b, mg4.f12631c));
    }

    /* renamed from: y */
    public final void mo12855y(o84 o84) {
        l84 l84 = this.f14967q;
        Objects.requireNonNull(o84);
        l84.mo11917D(o84);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void mo12856z(x64 x64) {
        long j;
        boolean z;
        long j2;
        int i = this.f14919C - x64.f20015c;
        this.f14919C = i;
        boolean z2 = true;
        if (x64.f20016d) {
            this.f14920D = x64.f20017e;
            this.f14921E = true;
        }
        if (x64.f20018f) {
            this.f14922F = x64.f20019g;
        }
        if (i == 0) {
            gt0 gt0 = x64.f20014b.f16234a;
            if (!this.f14951e0.f16234a.mo10643o() && gt0.mo10643o()) {
                this.f14953f0 = -1;
                this.f14955g0 = 0;
            }
            if (!gt0.mo10643o()) {
                List y = ((u74) gt0).mo14457y();
                v91.m22052f(y.size() == this.f14964n.size());
                for (int i2 = 0; i2 < y.size(); i2++) {
                    ((n64) this.f14964n.get(i2)).f13883b = (gt0) y.get(i2);
                }
            }
            if (this.f14921E) {
                if (x64.f20014b.f16235b.equals(this.f14951e0.f16235b) && x64.f20014b.f16237d == this.f14951e0.f16251r) {
                    z2 = false;
                }
                if (z2) {
                    if (gt0.mo10643o() || x64.f20014b.f16235b.mo11883b()) {
                        j2 = x64.f20014b.f16237d;
                    } else {
                        q74 q74 = x64.f20014b;
                        mg4 mg4 = q74.f16235b;
                        j2 = q74.f16237d;
                        m17531R(gt0, mg4, j2);
                    }
                    z = z2;
                    j = j2;
                } else {
                    j = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.f14921E = false;
            m17548n0(x64.f20014b, 1, this.f14922F, false, z, this.f14920D, j, -1);
        }
    }
}
