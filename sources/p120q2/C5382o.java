package p120q2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p004a2.C0079u1;
import p021c2.C1841b;
import p021c2.C1846e;
import p021c2.C1848g;
import p021c2.C1852i;
import p030d2.C4030h0;
import p030d2.C4040n;
import p030d2.C4042o;
import p120q2.C5376l;
import p120q2.C5386v;
import p161w3.C5917a;
import p161w3.C5938h0;
import p161w3.C5945j0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5970w;
import p177z1.C6218f;
import p177z1.C6227i;
import p177z1.C6264q;
import p177z1.C6272r1;
import p177z1.C6279s1;

/* renamed from: q2.o */
/* compiled from: MediaCodecRenderer */
public abstract class C5382o extends C6218f {

    /* renamed from: U0 */
    private static final byte[] f27526U0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    private final C1848g f27527A = new C1848g(0);

    /* renamed from: A0 */
    private boolean f27528A0;

    /* renamed from: B */
    private final C1848g f27529B = new C1848g(2);

    /* renamed from: B0 */
    private boolean f27530B0;

    /* renamed from: C */
    private final C5372h f27531C;

    /* renamed from: C0 */
    private boolean f27532C0;

    /* renamed from: D */
    private final C5938h0<C6272r1> f27533D;

    /* renamed from: D0 */
    private int f27534D0;

    /* renamed from: E */
    private final ArrayList<Long> f27535E;

    /* renamed from: E0 */
    private int f27536E0;

    /* renamed from: F */
    private final MediaCodec.BufferInfo f27537F;

    /* renamed from: F0 */
    private int f27538F0;

    /* renamed from: G */
    private final long[] f27539G;

    /* renamed from: G0 */
    private boolean f27540G0;

    /* renamed from: H */
    private final long[] f27541H;

    /* renamed from: H0 */
    private boolean f27542H0;

    /* renamed from: I */
    private final long[] f27543I;

    /* renamed from: I0 */
    private boolean f27544I0;

    /* renamed from: J */
    private C6272r1 f27545J;

    /* renamed from: J0 */
    private long f27546J0;

    /* renamed from: K */
    private C6272r1 f27547K;

    /* renamed from: K0 */
    private long f27548K0;

    /* renamed from: L */
    private C4042o f27549L;

    /* renamed from: L0 */
    private boolean f27550L0;

    /* renamed from: M */
    private C4042o f27551M;

    /* renamed from: M0 */
    private boolean f27552M0;

    /* renamed from: N */
    private MediaCrypto f27553N;

    /* renamed from: N0 */
    private boolean f27554N0;

    /* renamed from: O */
    private boolean f27555O;

    /* renamed from: O0 */
    private boolean f27556O0;

    /* renamed from: P */
    private long f27557P;

    /* renamed from: P0 */
    private C6264q f27558P0;

    /* renamed from: Q */
    private float f27559Q;

    /* renamed from: Q0 */
    protected C1846e f27560Q0;

    /* renamed from: R */
    private float f27561R;

    /* renamed from: R0 */
    private long f27562R0;

    /* renamed from: S */
    private C5376l f27563S;

    /* renamed from: S0 */
    private long f27564S0;

    /* renamed from: T0 */
    private int f27565T0;

    /* renamed from: a0 */
    private C6272r1 f27566a0;

    /* renamed from: b0 */
    private MediaFormat f27567b0;

    /* renamed from: c0 */
    private boolean f27568c0;

    /* renamed from: d0 */
    private float f27569d0;

    /* renamed from: e0 */
    private ArrayDeque<C5381n> f27570e0;

    /* renamed from: f0 */
    private C5384b f27571f0;

    /* renamed from: g0 */
    private C5381n f27572g0;

    /* renamed from: h0 */
    private int f27573h0;

    /* renamed from: i0 */
    private boolean f27574i0;

    /* renamed from: j0 */
    private boolean f27575j0;

    /* renamed from: k0 */
    private boolean f27576k0;

    /* renamed from: l0 */
    private boolean f27577l0;

    /* renamed from: m0 */
    private boolean f27578m0;

    /* renamed from: n0 */
    private boolean f27579n0;

    /* renamed from: o0 */
    private boolean f27580o0;

    /* renamed from: p0 */
    private boolean f27581p0;

    /* renamed from: q0 */
    private boolean f27582q0;

    /* renamed from: r0 */
    private boolean f27583r0;

    /* renamed from: s0 */
    private C5373i f27584s0;

    /* renamed from: t0 */
    private long f27585t0;

    /* renamed from: u0 */
    private int f27586u0;

    /* renamed from: v */
    private final C5376l.C5378b f27587v;

    /* renamed from: v0 */
    private int f27588v0;

    /* renamed from: w */
    private final C5385q f27589w;

    /* renamed from: w0 */
    private ByteBuffer f27590w0;

    /* renamed from: x */
    private final boolean f27591x;

    /* renamed from: x0 */
    private boolean f27592x0;

    /* renamed from: y */
    private final float f27593y;

    /* renamed from: y0 */
    private boolean f27594y0;

    /* renamed from: z */
    private final C1848g f27595z = C1848g.m8572A();

    /* renamed from: z0 */
    private boolean f27596z0;

    /* renamed from: q2.o$a */
    /* compiled from: MediaCodecRenderer */
    private static final class C5383a {
        /* renamed from: a */
        public static void m33048a(C5376l.C5377a aVar, C0079u1 u1Var) {
            LogSessionId a = u1Var.mo214a();
            if (!a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVar.f27508b.setString("log-session-id", a.getStringId());
            }
        }
    }

    public C5382o(int i, C5376l.C5378b bVar, C5385q qVar, boolean z, float f) {
        super(i);
        this.f27587v = bVar;
        this.f27589w = (C5385q) C5917a.m34872e(qVar);
        this.f27591x = z;
        this.f27593y = f;
        C5372h hVar = new C5372h();
        this.f27531C = hVar;
        this.f27533D = new C5938h0<>();
        this.f27535E = new ArrayList<>();
        this.f27537F = new MediaCodec.BufferInfo();
        this.f27559Q = 1.0f;
        this.f27561R = 1.0f;
        this.f27557P = -9223372036854775807L;
        this.f27539G = new long[10];
        this.f27541H = new long[10];
        this.f27543I = new long[10];
        this.f27562R0 = -9223372036854775807L;
        this.f27564S0 = -9223372036854775807L;
        hVar.mo7050x(0);
        hVar.f5430c.order(ByteOrder.nativeOrder());
        this.f27569d0 = -1.0f;
        this.f27573h0 = 0;
        this.f27534D0 = 0;
        this.f27586u0 = -1;
        this.f27588v0 = -1;
        this.f27585t0 = -9223372036854775807L;
        this.f27546J0 = -9223372036854775807L;
        this.f27548K0 = -9223372036854775807L;
        this.f27536E0 = 0;
        this.f27538F0 = 0;
    }

    /* renamed from: A0 */
    private void m32960A0(C6272r1 r1Var) {
        m32985d0();
        String str = r1Var.f30243t;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f27531C.mo19471I(32);
        } else {
            this.f27531C.mo19471I(1);
        }
        this.f27596z0 = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: B0 */
    private void m32961B0(C5381n nVar, MediaCrypto mediaCrypto) throws Exception {
        float f;
        String str = nVar.f27515a;
        int i = C5953m0.f29110a;
        float f2 = -1.0f;
        if (i < 23) {
            f = -1.0f;
        } else {
            f = mo6491r0(this.f27561R, this.f27545J, mo21292E());
        }
        if (f > this.f27593y) {
            f2 = f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C5376l.C5377a v0 = mo6494v0(nVar, this.f27545J, mediaCrypto, f2);
        if (i >= 31) {
            C5383a.m33048a(v0, mo21291D());
        }
        try {
            C5945j0.m35044a("createCodec:" + str);
            this.f27563S = this.f27587v.mo19446a(v0);
            C5945j0.m35046c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f27572g0 = nVar;
            this.f27569d0 = f2;
            this.f27566a0 = this.f27545J;
            this.f27573h0 = m32971T(str);
            this.f27574i0 = m32973U(str, this.f27566a0);
            this.f27575j0 = m32979Z(str);
            this.f27576k0 = m32983b0(str);
            this.f27577l0 = m32976W(str);
            this.f27578m0 = m32977X(str);
            this.f27579n0 = m32975V(str);
            this.f27580o0 = m32981a0(str, this.f27566a0);
            boolean z = false;
            this.f27583r0 = m32978Y(nVar) || mo19507q0();
            if (this.f27563S.mo19431b()) {
                this.f27532C0 = true;
                this.f27534D0 = 1;
                if (this.f27573h0 != 0) {
                    z = true;
                }
                this.f27581p0 = z;
            }
            if ("c2.android.mp3.decoder".equals(nVar.f27515a)) {
                this.f27584s0 = new C5373i();
            }
            if (getState() == 2) {
                this.f27585t0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f27560Q0.f5417a++;
            mo6471J0(str, v0, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            C5945j0.m35046c();
            throw th;
        }
    }

    /* renamed from: C0 */
    private boolean m32962C0(long j) {
        int size = this.f27535E.size();
        for (int i = 0; i < size; i++) {
            if (this.f27535E.get(i).longValue() == j) {
                this.f27535E.remove(i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: D0 */
    private static boolean m32963D0(IllegalStateException illegalStateException) {
        if (C5953m0.f29110a >= 21 && m32964E0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    /* renamed from: E0 */
    private static boolean m32964E0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: F0 */
    private static boolean m32965F0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* renamed from: H0 */
    private void m32966H0(MediaCrypto mediaCrypto, boolean z) throws C5384b {
        if (this.f27570e0 == null) {
            try {
                List<C5381n> n0 = m32998n0(z);
                ArrayDeque<C5381n> arrayDeque = new ArrayDeque<>();
                this.f27570e0 = arrayDeque;
                if (this.f27591x) {
                    arrayDeque.addAll(n0);
                } else if (!n0.isEmpty()) {
                    this.f27570e0.add(n0.get(0));
                }
                this.f27571f0 = null;
            } catch (C5386v.C5389c e) {
                throw new C5384b(this.f27545J, (Throwable) e, z, -49998);
            }
        }
        if (!this.f27570e0.isEmpty()) {
            C5381n peekFirst = this.f27570e0.peekFirst();
            while (this.f27563S == null) {
                C5381n peekFirst2 = this.f27570e0.peekFirst();
                if (mo19498g1(peekFirst2)) {
                    try {
                        m32961B0(peekFirst2, mediaCrypto);
                    } catch (Exception e2) {
                        if (peekFirst2 == peekFirst) {
                            C5961r.m35215i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                            Thread.sleep(50);
                            m32961B0(peekFirst2, mediaCrypto);
                        } else {
                            throw e2;
                        }
                    } catch (Exception e3) {
                        C5961r.m35216j("MediaCodecRenderer", "Failed to initialize decoder: " + peekFirst2, e3);
                        this.f27570e0.removeFirst();
                        C5384b bVar = new C5384b(this.f27545J, (Throwable) e3, z, peekFirst2);
                        mo6469I0(bVar);
                        C5384b bVar2 = this.f27571f0;
                        if (bVar2 == null) {
                            this.f27571f0 = bVar;
                        } else {
                            this.f27571f0 = bVar2.m33051c(bVar);
                        }
                        if (this.f27570e0.isEmpty()) {
                            throw this.f27571f0;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f27570e0 = null;
            return;
        }
        throw new C5384b(this.f27545J, (Throwable) null, z, -49999);
    }

    /* renamed from: Q */
    private void m32967Q() throws C6264q {
        C5917a.m34873f(!this.f27550L0);
        C6279s1 B = mo21289B();
        this.f27529B.mo7029n();
        do {
            this.f27529B.mo7029n();
            int N = mo21294N(B, this.f27529B, 0);
            if (N == -5) {
                mo6475L0(B);
                return;
            } else if (N != -4) {
                if (N != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.f27529B.mo7034s()) {
                this.f27550L0 = true;
                return;
            } else {
                if (this.f27554N0) {
                    C6272r1 r1Var = (C6272r1) C5917a.m34872e(this.f27545J);
                    this.f27547K = r1Var;
                    mo6476M0(r1Var, (MediaFormat) null);
                    this.f27554N0 = false;
                }
                this.f27529B.mo7051y();
            }
        } while (this.f27531C.mo19466C(this.f27529B));
        this.f27528A0 = true;
    }

    /* renamed from: Q0 */
    private void m32968Q0() throws C6264q {
        int i = this.f27538F0;
        if (i == 1) {
            m32994k0();
        } else if (i == 2) {
            m32994k0();
            m32997m1();
        } else if (i != 3) {
            this.f27552M0 = true;
            mo6481W0();
        } else {
            m32974U0();
        }
    }

    /* renamed from: R */
    private boolean m32969R(long j, long j2) throws C6264q {
        C5917a.m34873f(!this.f27552M0);
        if (this.f27531C.mo19470H()) {
            C5372h hVar = this.f27531C;
            if (!mo6479R0(j, j2, (C5376l) null, hVar.f5430c, this.f27588v0, 0, hVar.mo19469G(), this.f27531C.mo19467E(), this.f27531C.mo7033r(), this.f27531C.mo7034s(), this.f27547K)) {
                return false;
            }
            mo19491N0(this.f27531C.mo19468F());
            this.f27531C.mo7029n();
        }
        if (this.f27550L0) {
            this.f27552M0 = true;
            return false;
        }
        if (this.f27528A0) {
            C5917a.m34873f(this.f27531C.mo19466C(this.f27529B));
            this.f27528A0 = false;
        }
        if (this.f27530B0) {
            if (this.f27531C.mo19470H()) {
                return true;
            }
            m32985d0();
            this.f27530B0 = false;
            mo19490G0();
            if (!this.f27596z0) {
                return false;
            }
        }
        m32967Q();
        if (this.f27531C.mo19470H()) {
            this.f27531C.mo7051y();
        }
        return this.f27531C.mo19470H() || this.f27550L0 || this.f27530B0;
    }

    /* renamed from: S0 */
    private void m32970S0() {
        this.f27544I0 = true;
        MediaFormat e = this.f27563S.mo19434e();
        if (this.f27573h0 != 0 && e.getInteger("width") == 32 && e.getInteger("height") == 32) {
            this.f27582q0 = true;
            return;
        }
        if (this.f27580o0) {
            e.setInteger("channel-count", 1);
        }
        this.f27567b0 = e;
        this.f27568c0 = true;
    }

    /* renamed from: T */
    private int m32971T(String str) {
        int i = C5953m0.f29110a;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = C5953m0.f29113d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = C5953m0.f29111b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* renamed from: T0 */
    private boolean m32972T0(int i) throws C6264q {
        C6279s1 B = mo21289B();
        this.f27595z.mo7029n();
        int N = mo21294N(B, this.f27595z, i | 4);
        if (N == -5) {
            mo6475L0(B);
            return true;
        } else if (N != -4 || !this.f27595z.mo7034s()) {
            return false;
        } else {
            this.f27550L0 = true;
            m32968Q0();
            return false;
        }
    }

    /* renamed from: U */
    private static boolean m32973U(String str, C6272r1 r1Var) {
        return C5953m0.f29110a < 21 && r1Var.f30245v.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: U0 */
    private void m32974U0() throws C6264q {
        mo19492V0();
        mo19490G0();
    }

    /* renamed from: V */
    private static boolean m32975V(String str) {
        if (C5953m0.f29110a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C5953m0.f29112c)) {
            String str2 = C5953m0.f29111b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    private static boolean m32976W(String str) {
        int i = C5953m0.f29110a;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = C5953m0.f29111b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: X */
    private static boolean m32977X(String str) {
        return C5953m0.f29110a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: Y */
    private static boolean m32978Y(C5381n nVar) {
        String str = nVar.f27515a;
        int i = C5953m0.f29110a;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(C5953m0.f29112c) && "AFTS".equals(C5953m0.f29113d) && nVar.f27521g));
    }

    /* renamed from: Z */
    private static boolean m32979Z(String str) {
        int i = C5953m0.f29110a;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && C5953m0.f29113d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: Z0 */
    private void m32980Z0() {
        this.f27586u0 = -1;
        this.f27527A.f5430c = null;
    }

    /* renamed from: a0 */
    private static boolean m32981a0(String str, C6272r1 r1Var) {
        if (C5953m0.f29110a > 18 || r1Var.f30224G != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a1 */
    private void m32982a1() {
        this.f27588v0 = -1;
        this.f27590w0 = null;
    }

    /* renamed from: b0 */
    private static boolean m32983b0(String str) {
        return C5953m0.f29110a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* renamed from: b1 */
    private void m32984b1(C4042o oVar) {
        C4040n.m27838a(this.f27549L, oVar);
        this.f27549L = oVar;
    }

    /* renamed from: d0 */
    private void m32985d0() {
        this.f27530B0 = false;
        this.f27531C.mo7029n();
        this.f27529B.mo7029n();
        this.f27528A0 = false;
        this.f27596z0 = false;
    }

    /* renamed from: e0 */
    private boolean m32986e0() {
        if (this.f27540G0) {
            this.f27536E0 = 1;
            if (this.f27575j0 || this.f27577l0) {
                this.f27538F0 = 3;
                return false;
            }
            this.f27538F0 = 1;
        }
        return true;
    }

    /* renamed from: e1 */
    private void m32987e1(C4042o oVar) {
        C4040n.m27838a(this.f27551M, oVar);
        this.f27551M = oVar;
    }

    /* renamed from: f0 */
    private void m32988f0() throws C6264q {
        if (this.f27540G0) {
            this.f27536E0 = 1;
            this.f27538F0 = 3;
            return;
        }
        m32974U0();
    }

    /* renamed from: f1 */
    private boolean m32989f1(long j) {
        return this.f27557P == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.f27557P;
    }

    /* renamed from: g0 */
    private boolean m32990g0() throws C6264q {
        if (this.f27540G0) {
            this.f27536E0 = 1;
            if (this.f27575j0 || this.f27577l0) {
                this.f27538F0 = 3;
                return false;
            }
            this.f27538F0 = 2;
        } else {
            m32997m1();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f9  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m32991h0(long r20, long r22) throws p177z1.C6264q {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.m33000z0()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00c2
            boolean r0 = r15.f27578m0
            if (r0 == 0) goto L_0x0028
            boolean r0 = r15.f27542H0
            if (r0 == 0) goto L_0x0028
            q2.l r0 = r15.f27563S     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.f27537F     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.mo19439i(r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x0030
        L_0x001c:
            r19.m32968Q0()
            boolean r0 = r15.f27552M0
            if (r0 == 0) goto L_0x0027
            r19.mo19492V0()
        L_0x0027:
            return r14
        L_0x0028:
            q2.l r0 = r15.f27563S
            android.media.MediaCodec$BufferInfo r1 = r15.f27537F
            int r0 = r0.mo19439i(r1)
        L_0x0030:
            if (r0 >= 0) goto L_0x004a
            r1 = -2
            if (r0 != r1) goto L_0x0039
            r19.m32970S0()
            return r16
        L_0x0039:
            boolean r0 = r15.f27583r0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r15.f27550L0
            if (r0 != 0) goto L_0x0046
            int r0 = r15.f27536E0
            r1 = 2
            if (r0 != r1) goto L_0x0049
        L_0x0046:
            r19.m32968Q0()
        L_0x0049:
            return r14
        L_0x004a:
            boolean r1 = r15.f27582q0
            if (r1 == 0) goto L_0x0056
            r15.f27582q0 = r14
            q2.l r1 = r15.f27563S
            r1.mo19440j(r0, r14)
            return r16
        L_0x0056:
            android.media.MediaCodec$BufferInfo r1 = r15.f27537F
            int r2 = r1.size
            if (r2 != 0) goto L_0x0066
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0066
            r19.m32968Q0()
            return r14
        L_0x0066:
            r15.f27588v0 = r0
            q2.l r1 = r15.f27563S
            java.nio.ByteBuffer r0 = r1.mo19445o(r0)
            r15.f27590w0 = r0
            if (r0 == 0) goto L_0x0085
            android.media.MediaCodec$BufferInfo r1 = r15.f27537F
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.f27590w0
            android.media.MediaCodec$BufferInfo r1 = r15.f27537F
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x0085:
            boolean r0 = r15.f27579n0
            if (r0 == 0) goto L_0x00a6
            android.media.MediaCodec$BufferInfo r0 = r15.f27537F
            long r1 = r0.presentationTimeUs
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x00a6
            int r1 = r0.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x00a6
            long r1 = r15.f27546J0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00a6
            r0.presentationTimeUs = r1
        L_0x00a6:
            android.media.MediaCodec$BufferInfo r0 = r15.f27537F
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.m32962C0(r0)
            r15.f27592x0 = r0
            long r0 = r15.f27548K0
            android.media.MediaCodec$BufferInfo r2 = r15.f27537F
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            r15.f27594y0 = r0
            r15.mo19503n1(r2)
        L_0x00c2:
            boolean r0 = r15.f27578m0
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r15.f27542H0
            if (r0 == 0) goto L_0x00fd
            q2.l r5 = r15.f27563S     // Catch:{ IllegalStateException -> 0x00f0 }
            java.nio.ByteBuffer r6 = r15.f27590w0     // Catch:{ IllegalStateException -> 0x00f0 }
            int r7 = r15.f27588v0     // Catch:{ IllegalStateException -> 0x00f0 }
            android.media.MediaCodec$BufferInfo r0 = r15.f27537F     // Catch:{ IllegalStateException -> 0x00f0 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00f0 }
            r9 = 1
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r12 = r15.f27592x0     // Catch:{ IllegalStateException -> 0x00f0 }
            boolean r13 = r15.f27594y0     // Catch:{ IllegalStateException -> 0x00f0 }
            z1.r1 r3 = r15.f27547K     // Catch:{ IllegalStateException -> 0x00f0 }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = 0
            r14 = r17
            boolean r0 = r0.mo6479R0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00ee }
            goto L_0x011c
        L_0x00ee:
            goto L_0x00f2
        L_0x00f0:
            r18 = 0
        L_0x00f2:
            r19.m32968Q0()
            boolean r0 = r15.f27552M0
            if (r0 == 0) goto L_0x00fc
            r19.mo19492V0()
        L_0x00fc:
            return r18
        L_0x00fd:
            r18 = 0
            q2.l r5 = r15.f27563S
            java.nio.ByteBuffer r6 = r15.f27590w0
            int r7 = r15.f27588v0
            android.media.MediaCodec$BufferInfo r0 = r15.f27537F
            int r8 = r0.flags
            r9 = 1
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f27592x0
            boolean r13 = r15.f27594y0
            z1.r1 r14 = r15.f27547K
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.mo6479R0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x011c:
            if (r0 == 0) goto L_0x0139
            android.media.MediaCodec$BufferInfo r0 = r15.f27537F
            long r0 = r0.presentationTimeUs
            r15.mo19491N0(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f27537F
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x012f
            r14 = 1
            goto L_0x0130
        L_0x012f:
            r14 = 0
        L_0x0130:
            r19.m32982a1()
            if (r14 != 0) goto L_0x0136
            return r16
        L_0x0136:
            r19.m32968Q0()
        L_0x0139:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5382o.m32991h0(long, long):boolean");
    }

    /* renamed from: i0 */
    private boolean m32992i0(C5381n nVar, C6272r1 r1Var, C4042o oVar, C4042o oVar2) throws C6264q {
        C4030h0 u0;
        boolean z;
        if (oVar == oVar2) {
            return false;
        }
        if (oVar2 == null || oVar == null || C5953m0.f29110a < 23) {
            return true;
        }
        UUID uuid = C6227i.f29964e;
        if (uuid.equals(oVar.mo17178b()) || uuid.equals(oVar2.mo17178b()) || (u0 = m32999u0(oVar2)) == null) {
            return true;
        }
        if (u0.f23098c) {
            z = false;
        } else {
            z = oVar2.mo17182f(r1Var.f30243t);
        }
        return !nVar.f27521g && z;
    }

    /* renamed from: j0 */
    private boolean m32993j0() throws C6264q {
        int i;
        if (this.f27563S == null || (i = this.f27536E0) == 2 || this.f27550L0) {
            return false;
        }
        if (i == 0 && mo19499h1()) {
            m32988f0();
        }
        if (this.f27586u0 < 0) {
            int h = this.f27563S.mo19438h();
            this.f27586u0 = h;
            if (h < 0) {
                return false;
            }
            this.f27527A.f5430c = this.f27563S.mo19442l(h);
            this.f27527A.mo7029n();
        }
        if (this.f27536E0 == 1) {
            if (!this.f27583r0) {
                this.f27542H0 = true;
                this.f27563S.mo19444n(this.f27586u0, 0, 0, 0, 4);
                m32980Z0();
            }
            this.f27536E0 = 2;
            return false;
        } else if (this.f27581p0) {
            this.f27581p0 = false;
            ByteBuffer byteBuffer = this.f27527A.f5430c;
            byte[] bArr = f27526U0;
            byteBuffer.put(bArr);
            this.f27563S.mo19444n(this.f27586u0, 0, bArr.length, 0, 0);
            m32980Z0();
            this.f27540G0 = true;
            return true;
        } else {
            if (this.f27534D0 == 1) {
                for (int i2 = 0; i2 < this.f27566a0.f30245v.size(); i2++) {
                    this.f27527A.f5430c.put(this.f27566a0.f30245v.get(i2));
                }
                this.f27534D0 = 2;
            }
            int position = this.f27527A.f5430c.position();
            C6279s1 B = mo21289B();
            try {
                int N = mo21294N(B, this.f27527A, 0);
                if (mo21222h()) {
                    this.f27548K0 = this.f27546J0;
                }
                if (N == -3) {
                    return false;
                }
                if (N == -5) {
                    if (this.f27534D0 == 2) {
                        this.f27527A.mo7029n();
                        this.f27534D0 = 1;
                    }
                    mo6475L0(B);
                    return true;
                } else if (this.f27527A.mo7034s()) {
                    if (this.f27534D0 == 2) {
                        this.f27527A.mo7029n();
                        this.f27534D0 = 1;
                    }
                    this.f27550L0 = true;
                    if (!this.f27540G0) {
                        m32968Q0();
                        return false;
                    }
                    try {
                        if (!this.f27583r0) {
                            this.f27542H0 = true;
                            this.f27563S.mo19444n(this.f27586u0, 0, 0, 0, 4);
                            m32980Z0();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw mo21296y(e, this.f27545J, C5953m0.m35108U(e.getErrorCode()));
                    }
                } else if (this.f27540G0 || this.f27527A.mo7036u()) {
                    boolean z = this.f27527A.mo7052z();
                    if (z) {
                        this.f27527A.f5429b.mo7039b(position);
                    }
                    if (this.f27574i0 && !z) {
                        C5970w.m35259b(this.f27527A.f5430c);
                        if (this.f27527A.f5430c.position() == 0) {
                            return true;
                        }
                        this.f27574i0 = false;
                    }
                    C1848g gVar = this.f27527A;
                    long j = gVar.f5432e;
                    C5373i iVar = this.f27584s0;
                    if (iVar != null) {
                        j = iVar.mo19474d(this.f27545J, gVar);
                        this.f27546J0 = Math.max(this.f27546J0, this.f27584s0.mo19472b(this.f27545J));
                    }
                    long j2 = j;
                    if (this.f27527A.mo7033r()) {
                        this.f27535E.add(Long.valueOf(j2));
                    }
                    if (this.f27554N0) {
                        this.f27533D.mo20611a(j2, this.f27545J);
                        this.f27554N0 = false;
                    }
                    this.f27546J0 = Math.max(this.f27546J0, j2);
                    this.f27527A.mo7051y();
                    if (this.f27527A.mo7032q()) {
                        mo19511y0(this.f27527A);
                    }
                    mo6478P0(this.f27527A);
                    if (z) {
                        try {
                            this.f27563S.mo19432c(this.f27586u0, 0, this.f27527A.f5429b, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw mo21296y(e2, this.f27545J, C5953m0.m35108U(e2.getErrorCode()));
                        }
                    } else {
                        this.f27563S.mo19444n(this.f27586u0, 0, this.f27527A.f5430c.limit(), j2, 0);
                    }
                    m32980Z0();
                    this.f27540G0 = true;
                    this.f27534D0 = 0;
                    this.f27560Q0.f5419c++;
                    return true;
                } else {
                    this.f27527A.mo7029n();
                    if (this.f27534D0 == 2) {
                        this.f27534D0 = 1;
                    }
                    return true;
                }
            } catch (C1848g.C1849a e3) {
                mo6469I0(e3);
                m32972T0(0);
                m32994k0();
                return true;
            }
        }
    }

    /* renamed from: k0 */
    private void m32994k0() {
        try {
            this.f27563S.flush();
        } finally {
            mo19493X0();
        }
    }

    /* renamed from: k1 */
    protected static boolean m32995k1(C6272r1 r1Var) {
        int i = r1Var.f30230M;
        return i == 0 || i == 2;
    }

    /* renamed from: l1 */
    private boolean m32996l1(C6272r1 r1Var) throws C6264q {
        if (!(C5953m0.f29110a < 23 || this.f27563S == null || this.f27538F0 == 3 || getState() == 0)) {
            float r0 = mo6491r0(this.f27561R, r1Var, mo21292E());
            float f = this.f27569d0;
            if (f == r0) {
                return true;
            }
            if (r0 == -1.0f) {
                m32988f0();
                return false;
            } else if (f == -1.0f && r0 <= this.f27593y) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", r0);
                this.f27563S.mo19435f(bundle);
                this.f27569d0 = r0;
            }
        }
        return true;
    }

    /* renamed from: m1 */
    private void m32997m1() throws C6264q {
        try {
            this.f27553N.setMediaDrmSession(m32999u0(this.f27551M).f23097b);
            m32984b1(this.f27551M);
            this.f27536E0 = 0;
            this.f27538F0 = 0;
        } catch (MediaCryptoException e) {
            throw mo21296y(e, this.f27545J, 6006);
        }
    }

    /* renamed from: n0 */
    private List<C5381n> m32998n0(boolean z) throws C5386v.C5389c {
        List<C5381n> t0 = mo6492t0(this.f27589w, this.f27545J, z);
        if (t0.isEmpty() && z) {
            t0 = mo6492t0(this.f27589w, this.f27545J, false);
            if (!t0.isEmpty()) {
                C5961r.m35215i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f27545J.f30243t + ", but no secure decoder available. Trying to proceed with " + t0 + ".");
            }
        }
        return t0;
    }

    /* renamed from: u0 */
    private C4030h0 m32999u0(C4042o oVar) throws C6264q {
        C1841b h = oVar.mo17185h();
        if (h == null || (h instanceof C4030h0)) {
            return (C4030h0) h;
        }
        throw mo21296y(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + h), this.f27545J, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    /* renamed from: z0 */
    private boolean m33000z0() {
        return this.f27588v0 >= 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo6466G() {
        this.f27545J = null;
        this.f27562R0 = -9223372036854775807L;
        this.f27564S0 = -9223372036854775807L;
        this.f27565T0 = 0;
        mo19502m0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public final void mo19490G0() throws C6264q {
        C6272r1 r1Var;
        if (this.f27563S == null && !this.f27596z0 && (r1Var = this.f27545J) != null) {
            if (this.f27551M != null || !mo6486i1(r1Var)) {
                m32984b1(this.f27551M);
                String str = this.f27545J.f30243t;
                C4042o oVar = this.f27549L;
                if (oVar != null) {
                    if (this.f27553N == null) {
                        C4030h0 u0 = m32999u0(oVar);
                        if (u0 != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(u0.f23096a, u0.f23097b);
                                this.f27553N = mediaCrypto;
                                this.f27555O = !u0.f23098c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw mo21296y(e, this.f27545J, 6006);
                            }
                        } else if (this.f27549L.mo17183g() == null) {
                            return;
                        }
                    }
                    if (C4030h0.f23095d) {
                        int state = this.f27549L.getState();
                        if (state == 1) {
                            C4042o.C4043a aVar = (C4042o.C4043a) C5917a.m34872e(this.f27549L.mo17183g());
                            throw mo21296y(aVar, this.f27545J, aVar.f23121a);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    m32966H0(this.f27553N, this.f27555O);
                } catch (C5384b e2) {
                    throw mo21296y(e2, this.f27545J, 4001);
                }
            } else {
                m32960A0(this.f27545J);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo6467H(boolean z, boolean z2) throws C6264q {
        this.f27560Q0 = new C1846e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo6468I(long j, boolean z) throws C6264q {
        this.f27550L0 = false;
        this.f27552M0 = false;
        this.f27556O0 = false;
        if (this.f27596z0) {
            this.f27531C.mo7029n();
            this.f27529B.mo7029n();
            this.f27528A0 = false;
        } else {
            mo19500l0();
        }
        if (this.f27533D.mo20615k() > 0) {
            this.f27554N0 = true;
        }
        this.f27533D.mo20612c();
        int i = this.f27565T0;
        if (i != 0) {
            this.f27564S0 = this.f27541H[i - 1];
            this.f27562R0 = this.f27539G[i - 1];
            this.f27565T0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public abstract void mo6469I0(Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo6470J() {
        try {
            m32985d0();
            mo19492V0();
        } finally {
            m32987e1((C4042o) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public abstract void mo6471J0(String str, C5376l.C5377a aVar, long j, long j2);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo6472K() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public abstract void mo6473K0(String str);

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6474L() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (m32990g0() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (m32990g0() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cf, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00eb A[RETURN] */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p021c2.C1852i mo6475L0(p177z1.C6279s1 r12) throws p177z1.C6264q {
        /*
            r11 = this;
            r0 = 1
            r11.f27554N0 = r0
            z1.r1 r1 = r12.f30328b
            java.lang.Object r1 = p161w3.C5917a.m34872e(r1)
            r5 = r1
            z1.r1 r5 = (p177z1.C6272r1) r5
            java.lang.String r1 = r5.f30243t
            if (r1 == 0) goto L_0x00ec
            d2.o r12 = r12.f30327a
            r11.m32987e1(r12)
            r11.f27545J = r5
            boolean r12 = r11.f27596z0
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.f27530B0 = r0
            return r1
        L_0x001f:
            q2.l r12 = r11.f27563S
            if (r12 != 0) goto L_0x0029
            r11.f27570e0 = r1
            r11.mo19490G0()
            return r1
        L_0x0029:
            q2.n r1 = r11.f27572g0
            z1.r1 r4 = r11.f27566a0
            d2.o r2 = r11.f27549L
            d2.o r3 = r11.f27551M
            boolean r2 = r11.m32992i0(r1, r5, r2, r3)
            if (r2 == 0) goto L_0x0046
            r11.m32988f0()
            c2.i r12 = new c2.i
            java.lang.String r3 = r1.f27515a
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            d2.o r2 = r11.f27551M
            d2.o r3 = r11.f27549L
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = p161w3.C5953m0.f29110a
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            goto L_0x005c
        L_0x005b:
            r3 = 1
        L_0x005c:
            p161w3.C5917a.m34873f(r3)
            c2.i r3 = r11.mo6480S(r1, r4, r5)
            int r7 = r3.f5443d
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00d1
            if (r7 == r0) goto L_0x00b5
            if (r7 == r10) goto L_0x0089
            if (r7 != r8) goto L_0x0083
            boolean r0 = r11.m32996l1(r5)
            if (r0 != 0) goto L_0x0078
            goto L_0x00bb
        L_0x0078:
            r11.f27566a0 = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.m32990g0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x0083:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0089:
            boolean r7 = r11.m32996l1(r5)
            if (r7 != 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            r11.f27532C0 = r0
            r11.f27534D0 = r0
            int r7 = r11.f27573h0
            if (r7 == r10) goto L_0x00a8
            if (r7 != r0) goto L_0x00a7
            int r7 = r5.f30248y
            int r9 = r4.f30248y
            if (r7 != r9) goto L_0x00a7
            int r7 = r5.f30249z
            int r9 = r4.f30249z
            if (r7 != r9) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r11.f27581p0 = r0
            r11.f27566a0 = r5
            if (r2 == 0) goto L_0x00d4
            boolean r0 = r11.m32990g0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00b5:
            boolean r0 = r11.m32996l1(r5)
            if (r0 != 0) goto L_0x00be
        L_0x00bb:
            r7 = 16
            goto L_0x00d5
        L_0x00be:
            r11.f27566a0 = r5
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r11.m32990g0()
            if (r0 != 0) goto L_0x00d4
            goto L_0x00cf
        L_0x00c9:
            boolean r0 = r11.m32986e0()
            if (r0 != 0) goto L_0x00d4
        L_0x00cf:
            r7 = 2
            goto L_0x00d5
        L_0x00d1:
            r11.m32988f0()
        L_0x00d4:
            r7 = 0
        L_0x00d5:
            int r0 = r3.f5443d
            if (r0 == 0) goto L_0x00eb
            q2.l r0 = r11.f27563S
            if (r0 != r12) goto L_0x00e1
            int r12 = r11.f27538F0
            if (r12 != r8) goto L_0x00eb
        L_0x00e1:
            c2.i r12 = new c2.i
            java.lang.String r3 = r1.f27515a
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00eb:
            return r3
        L_0x00ec:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            z1.q r12 = r11.mo21296y(r12, r5, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5382o.mo6475L0(z1.s1):c2.i");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo18662M(C6272r1[] r1VarArr, long j, long j2) throws C6264q {
        boolean z = true;
        if (this.f27564S0 == -9223372036854775807L) {
            if (this.f27562R0 != -9223372036854775807L) {
                z = false;
            }
            C5917a.m34873f(z);
            this.f27562R0 = j;
            this.f27564S0 = j2;
            return;
        }
        int i = this.f27565T0;
        if (i == this.f27541H.length) {
            C5961r.m35215i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f27541H[this.f27565T0 - 1]);
        } else {
            this.f27565T0 = i + 1;
        }
        long[] jArr = this.f27539G;
        int i2 = this.f27565T0;
        jArr[i2 - 1] = j;
        this.f27541H[i2 - 1] = j2;
        this.f27543I[i2 - 1] = this.f27546J0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public abstract void mo6476M0(C6272r1 r1Var, MediaFormat mediaFormat) throws C6264q;

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo19491N0(long j) {
        while (true) {
            int i = this.f27565T0;
            if (i != 0 && j >= this.f27543I[0]) {
                long[] jArr = this.f27539G;
                this.f27562R0 = jArr[0];
                this.f27564S0 = this.f27541H[0];
                int i2 = i - 1;
                this.f27565T0 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f27541H;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f27565T0);
                long[] jArr3 = this.f27543I;
                System.arraycopy(jArr3, 1, jArr3, 0, this.f27565T0);
                mo6477O0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo6477O0() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public abstract void mo6478P0(C1848g gVar) throws C6264q;

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public abstract boolean mo6479R0(long j, long j2, C5376l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6272r1 r1Var) throws C6264q;

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public abstract C1852i mo6480S(C5381n nVar, C6272r1 r1Var, C6272r1 r1Var2);

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public void mo19492V0() {
        try {
            C5376l lVar = this.f27563S;
            if (lVar != null) {
                lVar.mo19430a();
                this.f27560Q0.f5418b++;
                mo6473K0(this.f27572g0.f27515a);
            }
            this.f27563S = null;
            try {
                MediaCrypto mediaCrypto = this.f27553N;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f27553N = null;
                m32984b1((C4042o) null);
                mo19494Y0();
            }
        } catch (Throwable th) {
            this.f27563S = null;
            MediaCrypto mediaCrypto2 = this.f27553N;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.f27553N = null;
            m32984b1((C4042o) null);
            mo19494Y0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public void mo6481W0() throws C6264q {
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo19493X0() {
        m32980Z0();
        m32982a1();
        this.f27585t0 = -9223372036854775807L;
        this.f27542H0 = false;
        this.f27540G0 = false;
        this.f27581p0 = false;
        this.f27582q0 = false;
        this.f27592x0 = false;
        this.f27594y0 = false;
        this.f27535E.clear();
        this.f27546J0 = -9223372036854775807L;
        this.f27548K0 = -9223372036854775807L;
        C5373i iVar = this.f27584s0;
        if (iVar != null) {
            iVar.mo19473c();
        }
        this.f27536E0 = 0;
        this.f27538F0 = 0;
        this.f27534D0 = this.f27532C0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y0 */
    public void mo19494Y0() {
        mo19493X0();
        this.f27558P0 = null;
        this.f27584s0 = null;
        this.f27570e0 = null;
        this.f27572g0 = null;
        this.f27566a0 = null;
        this.f27567b0 = null;
        this.f27568c0 = false;
        this.f27544I0 = false;
        this.f27569d0 = -1.0f;
        this.f27573h0 = 0;
        this.f27574i0 = false;
        this.f27575j0 = false;
        this.f27576k0 = false;
        this.f27577l0 = false;
        this.f27578m0 = false;
        this.f27579n0 = false;
        this.f27580o0 = false;
        this.f27583r0 = false;
        this.f27532C0 = false;
        this.f27534D0 = 0;
        this.f27555O = false;
    }

    /* renamed from: a */
    public final int mo18664a(C6272r1 r1Var) throws C6264q {
        try {
            return mo6488j1(this.f27589w, r1Var);
        } catch (C5386v.C5389c e) {
            throw mo21296y(e, r1Var, 4002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C5380m mo19495c0(Throwable th, C5381n nVar) {
        return new C5380m(th, nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public final void mo19496c1() {
        this.f27556O0 = true;
    }

    /* renamed from: d */
    public boolean mo6484d() {
        return this.f27552M0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d1 */
    public final void mo19497d1(C6264q qVar) {
        this.f27558P0 = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public boolean mo19498g1(C5381n nVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public boolean mo19499h1() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i1 */
    public boolean mo6486i1(C6272r1 r1Var) {
        return false;
    }

    public boolean isReady() {
        return this.f27545J != null && (mo21293F() || m33000z0() || (this.f27585t0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f27585t0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public abstract int mo6488j1(C5385q qVar, C6272r1 r1Var) throws C5386v.C5389c;

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final boolean mo19500l0() throws C6264q {
        boolean m0 = mo19502m0();
        if (m0) {
            mo19490G0();
        }
        return m0;
    }

    /* renamed from: m */
    public void mo19501m(float f, float f2) throws C6264q {
        this.f27559Q = f;
        this.f27561R = f2;
        m32996l1(this.f27566a0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public boolean mo19502m0() {
        if (this.f27563S == null) {
            return false;
        }
        int i = this.f27538F0;
        if (i == 3 || this.f27575j0 || ((this.f27576k0 && !this.f27544I0) || (this.f27577l0 && this.f27542H0))) {
            mo19492V0();
            return true;
        }
        if (i == 2) {
            int i2 = C5953m0.f29110a;
            C5917a.m34873f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m32997m1();
                } catch (C6264q e) {
                    C5961r.m35216j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    mo19492V0();
                    return true;
                }
            }
        }
        m32994k0();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public final void mo19503n1(long j) throws C6264q {
        boolean z;
        C6272r1 i = this.f27533D.mo20614i(j);
        if (i == null && this.f27568c0) {
            i = this.f27533D.mo20613h();
        }
        if (i != null) {
            this.f27547K = i;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.f27568c0 && this.f27547K != null)) {
            mo6476M0(this.f27547K, this.f27567b0);
            this.f27568c0 = false;
        }
    }

    /* renamed from: o */
    public final int mo19504o() {
        return 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final C5376l mo19505o0() {
        return this.f27563S;
    }

    /* renamed from: p */
    public void mo18666p(long j, long j2) throws C6264q {
        boolean z = false;
        if (this.f27556O0) {
            this.f27556O0 = false;
            m32968Q0();
        }
        C6264q qVar = this.f27558P0;
        if (qVar == null) {
            try {
                if (this.f27552M0) {
                    mo6481W0();
                } else if (this.f27545J != null || m32972T0(2)) {
                    mo19490G0();
                    if (this.f27596z0) {
                        C5945j0.m35044a("bypassRender");
                        while (m32969R(j, j2)) {
                        }
                        C5945j0.m35046c();
                    } else if (this.f27563S != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        C5945j0.m35044a("drainAndFeed");
                        while (m32991h0(j, j2) && m32989f1(elapsedRealtime)) {
                        }
                        while (m32993j0() && m32989f1(elapsedRealtime)) {
                        }
                        C5945j0.m35046c();
                    } else {
                        this.f27560Q0.f5420d += mo21295P(j);
                        m32972T0(1);
                    }
                    this.f27560Q0.mo7047c();
                }
            } catch (IllegalStateException e) {
                if (m32963D0(e)) {
                    mo6469I0(e);
                    if (C5953m0.f29110a >= 21 && m32965F0(e)) {
                        z = true;
                    }
                    if (z) {
                        mo19492V0();
                    }
                    throw mo21297z(mo19495c0(e, mo19506p0()), this.f27545J, z, 4003);
                }
                throw e;
            }
        } else {
            this.f27558P0 = null;
            throw qVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public final C5381n mo19506p0() {
        return this.f27572g0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public boolean mo19507q0() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public abstract float mo6491r0(float f, C6272r1 r1Var, C6272r1[] r1VarArr);

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public final MediaFormat mo19508s0() {
        return this.f27567b0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public abstract List<C5381n> mo6492t0(C5385q qVar, C6272r1 r1Var, boolean z) throws C5386v.C5389c;

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public abstract C5376l.C5377a mo6494v0(C5381n nVar, C6272r1 r1Var, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public final long mo19509w0() {
        return this.f27564S0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public float mo19510x0() {
        return this.f27559Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo19511y0(C1848g gVar) throws C6264q {
    }

    /* renamed from: q2.o$b */
    /* compiled from: MediaCodecRenderer */
    public static class C5384b extends Exception {

        /* renamed from: a */
        public final String f27597a;

        /* renamed from: b */
        public final boolean f27598b;

        /* renamed from: c */
        public final C5381n f27599c;

        /* renamed from: d */
        public final String f27600d;

        /* renamed from: e */
        public final C5384b f27601e;

        public C5384b(C6272r1 r1Var, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + r1Var, th, r1Var.f30243t, z, (C5381n) null, m33050b(i), (C5384b) null);
        }

        /* renamed from: b */
        private static String m33050b(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + str + Math.abs(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C5384b m33051c(C5384b bVar) {
            return new C5384b(getMessage(), getCause(), this.f27597a, this.f27598b, this.f27599c, this.f27600d, bVar);
        }

        /* renamed from: d */
        private static String m33052d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C5384b(C6272r1 r1Var, Throwable th, boolean z, C5381n nVar) {
            this("Decoder init failed: " + nVar.f27515a + ", " + r1Var, th, r1Var.f30243t, z, nVar, C5953m0.f29110a >= 21 ? m33052d(th) : null, (C5384b) null);
        }

        private C5384b(String str, Throwable th, String str2, boolean z, C5381n nVar, String str3, C5384b bVar) {
            super(str, th);
            this.f27597a = str2;
            this.f27598b = z;
            this.f27599c = nVar;
            this.f27600d = str3;
            this.f27601e = bVar;
        }
    }
}
