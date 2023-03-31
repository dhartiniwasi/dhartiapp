package p167x3;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;
import p021c2.C1846e;
import p021c2.C1848g;
import p021c2.C1852i;
import p120q2.C5376l;
import p120q2.C5380m;
import p120q2.C5381n;
import p120q2.C5382o;
import p120q2.C5385q;
import p120q2.C5386v;
import p161w3.C5917a;
import p161w3.C5945j0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5966u;
import p161w3.C5967v;
import p167x3.C6074x;
import p177z1.C6217e3;
import p177z1.C6264q;
import p177z1.C6272r1;
import p177z1.C6279s1;
import p190b7.C6685q;

/* renamed from: x3.h */
/* compiled from: MediaCodecVideoRenderer */
public class C6059h extends C5382o {

    /* renamed from: E1 */
    private static final int[] f29362E1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: F1 */
    private static boolean f29363F1;

    /* renamed from: G1 */
    private static boolean f29364G1;

    /* renamed from: A1 */
    private boolean f29365A1;

    /* renamed from: B1 */
    private int f29366B1;

    /* renamed from: C1 */
    C6061b f29367C1;

    /* renamed from: D1 */
    private C6065j f29368D1;

    /* renamed from: V0 */
    private final Context f29369V0;

    /* renamed from: W0 */
    private final C6066l f29370W0;

    /* renamed from: X0 */
    private final C6074x.C6075a f29371X0;

    /* renamed from: Y0 */
    private final long f29372Y0;

    /* renamed from: Z0 */
    private final int f29373Z0;

    /* renamed from: a1 */
    private final boolean f29374a1;

    /* renamed from: b1 */
    private C6060a f29375b1;

    /* renamed from: c1 */
    private boolean f29376c1;

    /* renamed from: d1 */
    private boolean f29377d1;

    /* renamed from: e1 */
    private Surface f29378e1;

    /* renamed from: f1 */
    private C6062i f29379f1;

    /* renamed from: g1 */
    private boolean f29380g1;

    /* renamed from: h1 */
    private int f29381h1;

    /* renamed from: i1 */
    private boolean f29382i1;

    /* renamed from: j1 */
    private boolean f29383j1;

    /* renamed from: k1 */
    private boolean f29384k1;

    /* renamed from: l1 */
    private long f29385l1;

    /* renamed from: m1 */
    private long f29386m1;

    /* renamed from: n1 */
    private long f29387n1;

    /* renamed from: o1 */
    private int f29388o1;

    /* renamed from: p1 */
    private int f29389p1;

    /* renamed from: q1 */
    private int f29390q1;

    /* renamed from: r1 */
    private long f29391r1;

    /* renamed from: s1 */
    private long f29392s1;

    /* renamed from: t1 */
    private long f29393t1;

    /* renamed from: u1 */
    private int f29394u1;

    /* renamed from: v1 */
    private int f29395v1;

    /* renamed from: w1 */
    private int f29396w1;

    /* renamed from: x1 */
    private int f29397x1;

    /* renamed from: y1 */
    private float f29398y1;

    /* renamed from: z1 */
    private C6076z f29399z1;

    /* renamed from: x3.h$a */
    /* compiled from: MediaCodecVideoRenderer */
    protected static final class C6060a {

        /* renamed from: a */
        public final int f29400a;

        /* renamed from: b */
        public final int f29401b;

        /* renamed from: c */
        public final int f29402c;

        public C6060a(int i, int i2, int i3) {
            this.f29400a = i;
            this.f29401b = i2;
            this.f29402c = i3;
        }
    }

    /* renamed from: x3.h$b */
    /* compiled from: MediaCodecVideoRenderer */
    private final class C6061b implements C5376l.C5379c, Handler.Callback {

        /* renamed from: a */
        private final Handler f29403a;

        public C6061b(C5376l lVar) {
            Handler x = C5953m0.m35166x(this);
            this.f29403a = x;
            lVar.mo19433d(this, x);
        }

        /* renamed from: b */
        private void m35587b(long j) {
            C6059h hVar = C6059h.this;
            if (this == hVar.f29367C1) {
                if (j == Long.MAX_VALUE) {
                    hVar.m35528O1();
                    return;
                }
                try {
                    hVar.mo20812N1(j);
                } catch (C6264q e) {
                    C6059h.this.mo19497d1(e);
                }
            }
        }

        /* renamed from: a */
        public void mo19479a(C5376l lVar, long j, long j2) {
            if (C5953m0.f29110a < 30) {
                this.f29403a.sendMessageAtFrontOfQueue(Message.obtain(this.f29403a, 0, (int) (j >> 32), (int) j));
                return;
            }
            m35587b(j);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m35587b(C5953m0.m35111V0(message.arg1, message.arg2));
            return true;
        }
    }

    public C6059h(Context context, C5376l.C5378b bVar, C5385q qVar, long j, boolean z, Handler handler, C6074x xVar, int i) {
        this(context, bVar, qVar, j, z, handler, xVar, i, 30.0f);
    }

    /* renamed from: A1 */
    private static List<C5381n> m35518A1(C5385q qVar, C6272r1 r1Var, boolean z, boolean z2) throws C5386v.C5389c {
        String str = r1Var.f30243t;
        if (str == null) {
            return C6685q.m38445x();
        }
        List<C5381n> a = qVar.mo19512a(str, z, z2);
        String m = C5386v.m33084m(r1Var);
        if (m == null) {
            return C6685q.m38443t(a);
        }
        return C6685q.m38441r().mo22546g(a).mo22546g(qVar.mo19512a(m, z, z2)).mo22547h();
    }

    /* renamed from: B1 */
    protected static int m35519B1(C5381n nVar, C6272r1 r1Var) {
        if (r1Var.f30244u == -1) {
            return m35541x1(nVar, r1Var);
        }
        int size = r1Var.f30245v.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += r1Var.f30245v.get(i2).length;
        }
        return r1Var.f30244u + i;
    }

    /* renamed from: D1 */
    private static boolean m35520D1(long j) {
        return j < -30000;
    }

    /* renamed from: E1 */
    private static boolean m35521E1(long j) {
        return j < -500000;
    }

    /* renamed from: G1 */
    private void m35522G1() {
        if (this.f29388o1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f29371X0.mo20868n(this.f29388o1, elapsedRealtime - this.f29387n1);
            this.f29388o1 = 0;
            this.f29387n1 = elapsedRealtime;
        }
    }

    /* renamed from: I1 */
    private void m35523I1() {
        int i = this.f29394u1;
        if (i != 0) {
            this.f29371X0.mo20862B(this.f29393t1, i);
            this.f29393t1 = 0;
            this.f29394u1 = 0;
        }
    }

    /* renamed from: J1 */
    private void m35524J1() {
        int i = this.f29395v1;
        if (i != -1 || this.f29396w1 != -1) {
            C6076z zVar = this.f29399z1;
            if (zVar == null || zVar.f29445a != i || zVar.f29446b != this.f29396w1 || zVar.f29447c != this.f29397x1 || zVar.f29448d != this.f29398y1) {
                C6076z zVar2 = new C6076z(this.f29395v1, this.f29396w1, this.f29397x1, this.f29398y1);
                this.f29399z1 = zVar2;
                this.f29371X0.mo20864D(zVar2);
            }
        }
    }

    /* renamed from: K1 */
    private void m35525K1() {
        if (this.f29380g1) {
            this.f29371X0.mo20861A(this.f29378e1);
        }
    }

    /* renamed from: L1 */
    private void m35526L1() {
        C6076z zVar = this.f29399z1;
        if (zVar != null) {
            this.f29371X0.mo20864D(zVar);
        }
    }

    /* renamed from: M1 */
    private void m35527M1(long j, long j2, C6272r1 r1Var) {
        C6065j jVar = this.f29368D1;
        if (jVar != null) {
            jVar.mo20830a(j, j2, r1Var, mo19508s0());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public void m35528O1() {
        mo19496c1();
    }

    /* renamed from: P1 */
    private void m35529P1() {
        Surface surface = this.f29378e1;
        C6062i iVar = this.f29379f1;
        if (surface == iVar) {
            this.f29378e1 = null;
        }
        iVar.release();
        this.f29379f1 = null;
    }

    /* renamed from: S1 */
    private static void m35530S1(C5376l lVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        lVar.mo19435f(bundle);
    }

    /* renamed from: T1 */
    private void m35531T1() {
        this.f29386m1 = this.f29372Y0 > 0 ? SystemClock.elapsedRealtime() + this.f29372Y0 : -9223372036854775807L;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: U1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m35532U1(java.lang.Object r5) throws p177z1.C6264q {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.view.Surface
            if (r0 == 0) goto L_0x0007
            android.view.Surface r5 = (android.view.Surface) r5
            goto L_0x0008
        L_0x0007:
            r5 = 0
        L_0x0008:
            if (r5 != 0) goto L_0x0026
            x3.i r0 = r4.f29379f1
            if (r0 == 0) goto L_0x0010
            r5 = r0
            goto L_0x0026
        L_0x0010:
            q2.n r0 = r4.mo19506p0()
            if (r0 == 0) goto L_0x0026
            boolean r1 = r4.m35533Z1(r0)
            if (r1 == 0) goto L_0x0026
            android.content.Context r5 = r4.f29369V0
            boolean r0 = r0.f27521g
            x3.i r5 = p167x3.C6062i.m35591c(r5, r0)
            r4.f29379f1 = r5
        L_0x0026:
            android.view.Surface r0 = r4.f29378e1
            if (r0 == r5) goto L_0x006e
            r4.f29378e1 = r5
            x3.l r0 = r4.f29370W0
            r0.mo20838m(r5)
            r0 = 0
            r4.f29380g1 = r0
            int r0 = r4.getState()
            q2.l r1 = r4.mo19505o0()
            if (r1 == 0) goto L_0x0054
            int r2 = p161w3.C5953m0.f29110a
            r3 = 23
            if (r2 < r3) goto L_0x004e
            if (r5 == 0) goto L_0x004e
            boolean r2 = r4.f29376c1
            if (r2 != 0) goto L_0x004e
            r4.mo20815V1(r1, r5)
            goto L_0x0054
        L_0x004e:
            r4.mo19492V0()
            r4.mo19490G0()
        L_0x0054:
            if (r5 == 0) goto L_0x0067
            x3.i r1 = r4.f29379f1
            if (r5 == r1) goto L_0x0067
            r4.m35526L1()
            r4.m35536q1()
            r5 = 2
            if (r0 != r5) goto L_0x007a
            r4.m35531T1()
            goto L_0x007a
        L_0x0067:
            r4.m35537r1()
            r4.m35536q1()
            goto L_0x007a
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            x3.i r0 = r4.f29379f1
            if (r5 == r0) goto L_0x007a
            r4.m35526L1()
            r4.m35525K1()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p167x3.C6059h.m35532U1(java.lang.Object):void");
    }

    /* renamed from: Z1 */
    private boolean m35533Z1(C5381n nVar) {
        return C5953m0.f29110a >= 23 && !this.f29365A1 && !mo20822s1(nVar.f27515a) && (!nVar.f27521g || C6062i.m35590b(this.f29369V0));
    }

    /* renamed from: q1 */
    private void m35536q1() {
        C5376l o0;
        this.f29382i1 = false;
        if (C5953m0.f29110a >= 23 && this.f29365A1 && (o0 = mo19505o0()) != null) {
            this.f29367C1 = new C6061b(o0);
        }
    }

    /* renamed from: r1 */
    private void m35537r1() {
        this.f29399z1 = null;
    }

    /* renamed from: t1 */
    private static void m35538t1(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    /* renamed from: u1 */
    private static boolean m35539u1() {
        return "NVIDIA".equals(C5953m0.f29112c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x07d0, code lost:
        if (r0.equals("PGN528") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x083e, code lost:
        if (r0.equals("AFTN") == false) goto L_0x0836;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x085a, code lost:
        return true;
     */
    /* renamed from: w1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m35540w1() {
        /*
            int r0 = p161w3.C5953m0.f29110a
            r1 = 7
            r2 = 6
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 28
            r7 = 2
            r8 = -1
            r9 = 0
            r10 = 1
            if (r0 > r6) goto L_0x007a
            java.lang.String r11 = p161w3.C5953m0.f29111b
            r11.hashCode()
            int r12 = r11.hashCode()
            switch(r12) {
                case -1339091551: goto L_0x006b;
                case -1220081023: goto L_0x0060;
                case -1220066608: goto L_0x0055;
                case -1012436106: goto L_0x004a;
                case -760312546: goto L_0x003f;
                case -64886864: goto L_0x0034;
                case 3415681: goto L_0x0029;
                case 825323514: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            r11 = -1
            goto L_0x0075
        L_0x001e:
            java.lang.String r12 = "machuca"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0027
            goto L_0x001b
        L_0x0027:
            r11 = 7
            goto L_0x0075
        L_0x0029:
            java.lang.String r12 = "once"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0032
            goto L_0x001b
        L_0x0032:
            r11 = 6
            goto L_0x0075
        L_0x0034:
            java.lang.String r12 = "magnolia"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x003d
            goto L_0x001b
        L_0x003d:
            r11 = 5
            goto L_0x0075
        L_0x003f:
            java.lang.String r12 = "aquaman"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0048
            goto L_0x001b
        L_0x0048:
            r11 = 4
            goto L_0x0075
        L_0x004a:
            java.lang.String r12 = "oneday"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0053
            goto L_0x001b
        L_0x0053:
            r11 = 3
            goto L_0x0075
        L_0x0055:
            java.lang.String r12 = "dangalUHD"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x005e
            goto L_0x001b
        L_0x005e:
            r11 = 2
            goto L_0x0075
        L_0x0060:
            java.lang.String r12 = "dangalFHD"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0069
            goto L_0x001b
        L_0x0069:
            r11 = 1
            goto L_0x0075
        L_0x006b:
            java.lang.String r12 = "dangal"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0074
            goto L_0x001b
        L_0x0074:
            r11 = 0
        L_0x0075:
            switch(r11) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0079;
                case 2: goto L_0x0079;
                case 3: goto L_0x0079;
                case 4: goto L_0x0079;
                case 5: goto L_0x0079;
                case 6: goto L_0x0079;
                case 7: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x007a
        L_0x0079:
            return r10
        L_0x007a:
            r11 = 27
            if (r0 > r11) goto L_0x0089
            java.lang.String r12 = p161w3.C5953m0.f29111b
            java.lang.String r13 = "HWEML"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x0089
            return r10
        L_0x0089:
            r12 = 26
            if (r0 > r12) goto L_0x085b
            java.lang.String r0 = p161w3.C5953m0.f29111b
            r0.hashCode()
            int r13 = r0.hashCode()
            switch(r13) {
                case -2144781245: goto L_0x081c;
                case -2144781185: goto L_0x0810;
                case -2144781160: goto L_0x0804;
                case -2097309513: goto L_0x07f8;
                case -2022874474: goto L_0x07ec;
                case -1978993182: goto L_0x07e0;
                case -1978990237: goto L_0x07d4;
                case -1936688988: goto L_0x07ca;
                case -1936688066: goto L_0x07bd;
                case -1936688065: goto L_0x07af;
                case -1931988508: goto L_0x07a1;
                case -1885099851: goto L_0x0793;
                case -1696512866: goto L_0x0785;
                case -1680025915: goto L_0x0777;
                case -1615810839: goto L_0x0769;
                case -1600724499: goto L_0x075b;
                case -1554255044: goto L_0x074d;
                case -1481772737: goto L_0x073f;
                case -1481772730: goto L_0x0731;
                case -1481772729: goto L_0x0723;
                case -1320080169: goto L_0x0715;
                case -1217592143: goto L_0x0707;
                case -1180384755: goto L_0x06f9;
                case -1139198265: goto L_0x06eb;
                case -1052835013: goto L_0x06dd;
                case -993250464: goto L_0x06cf;
                case -993250458: goto L_0x06c1;
                case -965403638: goto L_0x06b3;
                case -958336948: goto L_0x06a5;
                case -879245230: goto L_0x0697;
                case -842500323: goto L_0x0689;
                case -821392978: goto L_0x067b;
                case -797483286: goto L_0x066d;
                case -794946968: goto L_0x065f;
                case -788334647: goto L_0x0651;
                case -782144577: goto L_0x0643;
                case -575125681: goto L_0x0635;
                case -521118391: goto L_0x0627;
                case -430914369: goto L_0x0619;
                case -290434366: goto L_0x060b;
                case -282781963: goto L_0x05fd;
                case -277133239: goto L_0x05ef;
                case -173639913: goto L_0x05e1;
                case -56598463: goto L_0x05d3;
                case 2126: goto L_0x05c5;
                case 2564: goto L_0x05b7;
                case 2715: goto L_0x05a9;
                case 2719: goto L_0x059b;
                case 3091: goto L_0x058d;
                case 3483: goto L_0x057f;
                case 73405: goto L_0x0571;
                case 75537: goto L_0x0563;
                case 75739: goto L_0x0555;
                case 76779: goto L_0x0547;
                case 78669: goto L_0x0539;
                case 79305: goto L_0x052b;
                case 80618: goto L_0x051d;
                case 88274: goto L_0x050f;
                case 98846: goto L_0x0501;
                case 98848: goto L_0x04f3;
                case 99329: goto L_0x04e5;
                case 101481: goto L_0x04d7;
                case 1513190: goto L_0x04c9;
                case 1514184: goto L_0x04bb;
                case 1514185: goto L_0x04ad;
                case 2133089: goto L_0x049f;
                case 2133091: goto L_0x0491;
                case 2133120: goto L_0x0483;
                case 2133151: goto L_0x0475;
                case 2133182: goto L_0x0467;
                case 2133184: goto L_0x0459;
                case 2436959: goto L_0x044b;
                case 2463773: goto L_0x043d;
                case 2464648: goto L_0x042f;
                case 2689555: goto L_0x0421;
                case 3154429: goto L_0x0413;
                case 3284551: goto L_0x0405;
                case 3351335: goto L_0x03f7;
                case 3386211: goto L_0x03e9;
                case 41325051: goto L_0x03db;
                case 51349633: goto L_0x03cd;
                case 51350594: goto L_0x03bf;
                case 55178625: goto L_0x03b1;
                case 61542055: goto L_0x03a3;
                case 65355429: goto L_0x0395;
                case 66214468: goto L_0x0387;
                case 66214470: goto L_0x0379;
                case 66214473: goto L_0x036b;
                case 66215429: goto L_0x035d;
                case 66215431: goto L_0x034f;
                case 66215433: goto L_0x0341;
                case 66216390: goto L_0x0333;
                case 76402249: goto L_0x0325;
                case 76404105: goto L_0x0317;
                case 76404911: goto L_0x0309;
                case 80963634: goto L_0x02fb;
                case 82882791: goto L_0x02ed;
                case 98715550: goto L_0x02df;
                case 101370885: goto L_0x02d1;
                case 102844228: goto L_0x02c3;
                case 165221241: goto L_0x02b5;
                case 182191441: goto L_0x02a7;
                case 245388979: goto L_0x0299;
                case 287431619: goto L_0x028b;
                case 307593612: goto L_0x027d;
                case 308517133: goto L_0x026f;
                case 316215098: goto L_0x0261;
                case 316215116: goto L_0x0253;
                case 316246811: goto L_0x0245;
                case 316246818: goto L_0x0237;
                case 407160593: goto L_0x0229;
                case 507412548: goto L_0x021b;
                case 793982701: goto L_0x020d;
                case 794038622: goto L_0x01ff;
                case 794040393: goto L_0x01f1;
                case 835649806: goto L_0x01e3;
                case 917340916: goto L_0x01d5;
                case 958008161: goto L_0x01c7;
                case 1060579533: goto L_0x01b9;
                case 1150207623: goto L_0x01ab;
                case 1176899427: goto L_0x019d;
                case 1280332038: goto L_0x018f;
                case 1306947716: goto L_0x0181;
                case 1349174697: goto L_0x0173;
                case 1522194893: goto L_0x0165;
                case 1691543273: goto L_0x0157;
                case 1691544261: goto L_0x0149;
                case 1709443163: goto L_0x013b;
                case 1865889110: goto L_0x012d;
                case 1906253259: goto L_0x011f;
                case 1977196784: goto L_0x0111;
                case 2006372676: goto L_0x0104;
                case 2019281702: goto L_0x00f7;
                case 2029784656: goto L_0x00ea;
                case 2030379515: goto L_0x00dd;
                case 2033393791: goto L_0x00d0;
                case 2047190025: goto L_0x00c3;
                case 2047252157: goto L_0x00b6;
                case 2048319463: goto L_0x00a9;
                case 2048855701: goto L_0x009c;
                default: goto L_0x0099;
            }
        L_0x0099:
            r1 = -1
            goto L_0x0827
        L_0x009c:
            java.lang.String r1 = "HWWAS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x0099
        L_0x00a5:
            r1 = 139(0x8b, float:1.95E-43)
            goto L_0x0827
        L_0x00a9:
            java.lang.String r1 = "HWVNS-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b2
            goto L_0x0099
        L_0x00b2:
            r1 = 138(0x8a, float:1.93E-43)
            goto L_0x0827
        L_0x00b6:
            java.lang.String r1 = "ELUGA_Prim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00bf
            goto L_0x0099
        L_0x00bf:
            r1 = 137(0x89, float:1.92E-43)
            goto L_0x0827
        L_0x00c3:
            java.lang.String r1 = "ELUGA_Note"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cc
            goto L_0x0099
        L_0x00cc:
            r1 = 136(0x88, float:1.9E-43)
            goto L_0x0827
        L_0x00d0:
            java.lang.String r1 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d9
            goto L_0x0099
        L_0x00d9:
            r1 = 135(0x87, float:1.89E-43)
            goto L_0x0827
        L_0x00dd:
            java.lang.String r1 = "HWCAM-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00e6
            goto L_0x0099
        L_0x00e6:
            r1 = 134(0x86, float:1.88E-43)
            goto L_0x0827
        L_0x00ea:
            java.lang.String r1 = "HWBLN-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f3
            goto L_0x0099
        L_0x00f3:
            r1 = 133(0x85, float:1.86E-43)
            goto L_0x0827
        L_0x00f7:
            java.lang.String r1 = "DM-01K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0100
            goto L_0x0099
        L_0x0100:
            r1 = 132(0x84, float:1.85E-43)
            goto L_0x0827
        L_0x0104:
            java.lang.String r1 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x010d
            goto L_0x0099
        L_0x010d:
            r1 = 131(0x83, float:1.84E-43)
            goto L_0x0827
        L_0x0111:
            java.lang.String r1 = "Infinix-X572"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x011b
            goto L_0x0099
        L_0x011b:
            r1 = 130(0x82, float:1.82E-43)
            goto L_0x0827
        L_0x011f:
            java.lang.String r1 = "PB2-670M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0129
            goto L_0x0099
        L_0x0129:
            r1 = 129(0x81, float:1.81E-43)
            goto L_0x0827
        L_0x012d:
            java.lang.String r1 = "santoni"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0137
            goto L_0x0099
        L_0x0137:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0827
        L_0x013b:
            java.lang.String r1 = "iball8735_9806"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0145
            goto L_0x0099
        L_0x0145:
            r1 = 127(0x7f, float:1.78E-43)
            goto L_0x0827
        L_0x0149:
            java.lang.String r1 = "CPH1715"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0153
            goto L_0x0099
        L_0x0153:
            r1 = 126(0x7e, float:1.77E-43)
            goto L_0x0827
        L_0x0157:
            java.lang.String r1 = "CPH1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0161
            goto L_0x0099
        L_0x0161:
            r1 = 125(0x7d, float:1.75E-43)
            goto L_0x0827
        L_0x0165:
            java.lang.String r1 = "woods_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016f
            goto L_0x0099
        L_0x016f:
            r1 = 124(0x7c, float:1.74E-43)
            goto L_0x0827
        L_0x0173:
            java.lang.String r1 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017d
            goto L_0x0099
        L_0x017d:
            r1 = 123(0x7b, float:1.72E-43)
            goto L_0x0827
        L_0x0181:
            java.lang.String r1 = "EverStar_S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018b
            goto L_0x0099
        L_0x018b:
            r1 = 122(0x7a, float:1.71E-43)
            goto L_0x0827
        L_0x018f:
            java.lang.String r1 = "hwALE-H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0199
            goto L_0x0099
        L_0x0199:
            r1 = 121(0x79, float:1.7E-43)
            goto L_0x0827
        L_0x019d:
            java.lang.String r1 = "itel_S41"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a7
            goto L_0x0099
        L_0x01a7:
            r1 = 120(0x78, float:1.68E-43)
            goto L_0x0827
        L_0x01ab:
            java.lang.String r1 = "LS-5017"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b5
            goto L_0x0099
        L_0x01b5:
            r1 = 119(0x77, float:1.67E-43)
            goto L_0x0827
        L_0x01b9:
            java.lang.String r1 = "panell_d"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c3
            goto L_0x0099
        L_0x01c3:
            r1 = 118(0x76, float:1.65E-43)
            goto L_0x0827
        L_0x01c7:
            java.lang.String r1 = "j2xlteins"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01d1
            goto L_0x0099
        L_0x01d1:
            r1 = 117(0x75, float:1.64E-43)
            goto L_0x0827
        L_0x01d5:
            java.lang.String r1 = "A7000plus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01df
            goto L_0x0099
        L_0x01df:
            r1 = 116(0x74, float:1.63E-43)
            goto L_0x0827
        L_0x01e3:
            java.lang.String r1 = "manning"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ed
            goto L_0x0099
        L_0x01ed:
            r1 = 115(0x73, float:1.61E-43)
            goto L_0x0827
        L_0x01f1:
            java.lang.String r1 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01fb
            goto L_0x0099
        L_0x01fb:
            r1 = 114(0x72, float:1.6E-43)
            goto L_0x0827
        L_0x01ff:
            java.lang.String r1 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0209
            goto L_0x0099
        L_0x0209:
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x0827
        L_0x020d:
            java.lang.String r1 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0217
            goto L_0x0099
        L_0x0217:
            r1 = 112(0x70, float:1.57E-43)
            goto L_0x0827
        L_0x021b:
            java.lang.String r1 = "QM16XE_U"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0225
            goto L_0x0099
        L_0x0225:
            r1 = 111(0x6f, float:1.56E-43)
            goto L_0x0827
        L_0x0229:
            java.lang.String r1 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0233
            goto L_0x0099
        L_0x0233:
            r1 = 110(0x6e, float:1.54E-43)
            goto L_0x0827
        L_0x0237:
            java.lang.String r1 = "TB3-850M"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0241
            goto L_0x0099
        L_0x0241:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x0827
        L_0x0245:
            java.lang.String r1 = "TB3-850F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x024f
            goto L_0x0099
        L_0x024f:
            r1 = 108(0x6c, float:1.51E-43)
            goto L_0x0827
        L_0x0253:
            java.lang.String r1 = "TB3-730X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x025d
            goto L_0x0099
        L_0x025d:
            r1 = 107(0x6b, float:1.5E-43)
            goto L_0x0827
        L_0x0261:
            java.lang.String r1 = "TB3-730F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x026b
            goto L_0x0099
        L_0x026b:
            r1 = 106(0x6a, float:1.49E-43)
            goto L_0x0827
        L_0x026f:
            java.lang.String r1 = "A7020a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0279
            goto L_0x0099
        L_0x0279:
            r1 = 105(0x69, float:1.47E-43)
            goto L_0x0827
        L_0x027d:
            java.lang.String r1 = "A7010a48"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0287
            goto L_0x0099
        L_0x0287:
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x0827
        L_0x028b:
            java.lang.String r1 = "griffin"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0295
            goto L_0x0099
        L_0x0295:
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x0827
        L_0x0299:
            java.lang.String r1 = "marino_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02a3
            goto L_0x0099
        L_0x02a3:
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x0827
        L_0x02a7:
            java.lang.String r1 = "CPY83_I00"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02b1
            goto L_0x0099
        L_0x02b1:
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x0827
        L_0x02b5:
            java.lang.String r1 = "A2016a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02bf
            goto L_0x0099
        L_0x02bf:
            r1 = 100
            goto L_0x0827
        L_0x02c3:
            java.lang.String r1 = "le_x6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02cd
            goto L_0x0099
        L_0x02cd:
            r1 = 99
            goto L_0x0827
        L_0x02d1:
            java.lang.String r1 = "l5460"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02db
            goto L_0x0099
        L_0x02db:
            r1 = 98
            goto L_0x0827
        L_0x02df:
            java.lang.String r1 = "i9031"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02e9
            goto L_0x0099
        L_0x02e9:
            r1 = 97
            goto L_0x0827
        L_0x02ed:
            java.lang.String r1 = "X3_HK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x02f7
            goto L_0x0099
        L_0x02f7:
            r1 = 96
            goto L_0x0827
        L_0x02fb:
            java.lang.String r1 = "V23GB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0305
            goto L_0x0099
        L_0x0305:
            r1 = 95
            goto L_0x0827
        L_0x0309:
            java.lang.String r1 = "Q4310"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0313
            goto L_0x0099
        L_0x0313:
            r1 = 94
            goto L_0x0827
        L_0x0317:
            java.lang.String r1 = "Q4260"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0321
            goto L_0x0099
        L_0x0321:
            r1 = 93
            goto L_0x0827
        L_0x0325:
            java.lang.String r1 = "PRO7S"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x032f
            goto L_0x0099
        L_0x032f:
            r1 = 92
            goto L_0x0827
        L_0x0333:
            java.lang.String r1 = "F3311"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x033d
            goto L_0x0099
        L_0x033d:
            r1 = 91
            goto L_0x0827
        L_0x0341:
            java.lang.String r1 = "F3215"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x034b
            goto L_0x0099
        L_0x034b:
            r1 = 90
            goto L_0x0827
        L_0x034f:
            java.lang.String r1 = "F3213"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0359
            goto L_0x0099
        L_0x0359:
            r1 = 89
            goto L_0x0827
        L_0x035d:
            java.lang.String r1 = "F3211"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0367
            goto L_0x0099
        L_0x0367:
            r1 = 88
            goto L_0x0827
        L_0x036b:
            java.lang.String r1 = "F3116"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0375
            goto L_0x0099
        L_0x0375:
            r1 = 87
            goto L_0x0827
        L_0x0379:
            java.lang.String r1 = "F3113"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0383
            goto L_0x0099
        L_0x0383:
            r1 = 86
            goto L_0x0827
        L_0x0387:
            java.lang.String r1 = "F3111"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0391
            goto L_0x0099
        L_0x0391:
            r1 = 85
            goto L_0x0827
        L_0x0395:
            java.lang.String r1 = "E5643"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x039f
            goto L_0x0099
        L_0x039f:
            r1 = 84
            goto L_0x0827
        L_0x03a3:
            java.lang.String r1 = "A1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ad
            goto L_0x0099
        L_0x03ad:
            r1 = 83
            goto L_0x0827
        L_0x03b1:
            java.lang.String r1 = "Aura_Note_2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03bb
            goto L_0x0099
        L_0x03bb:
            r1 = 82
            goto L_0x0827
        L_0x03bf:
            java.lang.String r1 = "602LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03c9
            goto L_0x0099
        L_0x03c9:
            r1 = 81
            goto L_0x0827
        L_0x03cd:
            java.lang.String r1 = "601LV"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03d7
            goto L_0x0099
        L_0x03d7:
            r1 = 80
            goto L_0x0827
        L_0x03db:
            java.lang.String r1 = "MEIZU_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03e5
            goto L_0x0099
        L_0x03e5:
            r1 = 79
            goto L_0x0827
        L_0x03e9:
            java.lang.String r1 = "p212"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03f3
            goto L_0x0099
        L_0x03f3:
            r1 = 78
            goto L_0x0827
        L_0x03f7:
            java.lang.String r1 = "mido"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0401
            goto L_0x0099
        L_0x0401:
            r1 = 77
            goto L_0x0827
        L_0x0405:
            java.lang.String r1 = "kate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x040f
            goto L_0x0099
        L_0x040f:
            r1 = 76
            goto L_0x0827
        L_0x0413:
            java.lang.String r1 = "fugu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x041d
            goto L_0x0099
        L_0x041d:
            r1 = 75
            goto L_0x0827
        L_0x0421:
            java.lang.String r1 = "XE2X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x042b
            goto L_0x0099
        L_0x042b:
            r1 = 74
            goto L_0x0827
        L_0x042f:
            java.lang.String r1 = "Q427"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0439
            goto L_0x0099
        L_0x0439:
            r1 = 73
            goto L_0x0827
        L_0x043d:
            java.lang.String r1 = "Q350"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0447
            goto L_0x0099
        L_0x0447:
            r1 = 72
            goto L_0x0827
        L_0x044b:
            java.lang.String r1 = "P681"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0455
            goto L_0x0099
        L_0x0455:
            r1 = 71
            goto L_0x0827
        L_0x0459:
            java.lang.String r1 = "F04J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0463
            goto L_0x0099
        L_0x0463:
            r1 = 70
            goto L_0x0827
        L_0x0467:
            java.lang.String r1 = "F04H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0471
            goto L_0x0099
        L_0x0471:
            r1 = 69
            goto L_0x0827
        L_0x0475:
            java.lang.String r1 = "F03H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x047f
            goto L_0x0099
        L_0x047f:
            r1 = 68
            goto L_0x0827
        L_0x0483:
            java.lang.String r1 = "F02H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x048d
            goto L_0x0099
        L_0x048d:
            r1 = 67
            goto L_0x0827
        L_0x0491:
            java.lang.String r1 = "F01J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x049b
            goto L_0x0099
        L_0x049b:
            r1 = 66
            goto L_0x0827
        L_0x049f:
            java.lang.String r1 = "F01H"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04a9
            goto L_0x0099
        L_0x04a9:
            r1 = 65
            goto L_0x0827
        L_0x04ad:
            java.lang.String r1 = "1714"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04b7
            goto L_0x0099
        L_0x04b7:
            r1 = 64
            goto L_0x0827
        L_0x04bb:
            java.lang.String r1 = "1713"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04c5
            goto L_0x0099
        L_0x04c5:
            r1 = 63
            goto L_0x0827
        L_0x04c9:
            java.lang.String r1 = "1601"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04d3
            goto L_0x0099
        L_0x04d3:
            r1 = 62
            goto L_0x0827
        L_0x04d7:
            java.lang.String r1 = "flo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04e1
            goto L_0x0099
        L_0x04e1:
            r1 = 61
            goto L_0x0827
        L_0x04e5:
            java.lang.String r1 = "deb"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04ef
            goto L_0x0099
        L_0x04ef:
            r1 = 60
            goto L_0x0827
        L_0x04f3:
            java.lang.String r1 = "cv3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x04fd
            goto L_0x0099
        L_0x04fd:
            r1 = 59
            goto L_0x0827
        L_0x0501:
            java.lang.String r1 = "cv1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x050b
            goto L_0x0099
        L_0x050b:
            r1 = 58
            goto L_0x0827
        L_0x050f:
            java.lang.String r1 = "Z80"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0519
            goto L_0x0099
        L_0x0519:
            r1 = 57
            goto L_0x0827
        L_0x051d:
            java.lang.String r1 = "QX1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0527
            goto L_0x0099
        L_0x0527:
            r1 = 56
            goto L_0x0827
        L_0x052b:
            java.lang.String r1 = "PLE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0535
            goto L_0x0099
        L_0x0535:
            r1 = 55
            goto L_0x0827
        L_0x0539:
            java.lang.String r1 = "P85"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0543
            goto L_0x0099
        L_0x0543:
            r1 = 54
            goto L_0x0827
        L_0x0547:
            java.lang.String r1 = "MX6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0551
            goto L_0x0099
        L_0x0551:
            r1 = 53
            goto L_0x0827
        L_0x0555:
            java.lang.String r1 = "M5c"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x055f
            goto L_0x0099
        L_0x055f:
            r1 = 52
            goto L_0x0827
        L_0x0563:
            java.lang.String r1 = "M04"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x056d
            goto L_0x0099
        L_0x056d:
            r1 = 51
            goto L_0x0827
        L_0x0571:
            java.lang.String r1 = "JGZ"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x057b
            goto L_0x0099
        L_0x057b:
            r1 = 50
            goto L_0x0827
        L_0x057f:
            java.lang.String r1 = "mh"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0589
            goto L_0x0099
        L_0x0589:
            r1 = 49
            goto L_0x0827
        L_0x058d:
            java.lang.String r1 = "b5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0597
            goto L_0x0099
        L_0x0597:
            r1 = 48
            goto L_0x0827
        L_0x059b:
            java.lang.String r1 = "V5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05a5
            goto L_0x0099
        L_0x05a5:
            r1 = 47
            goto L_0x0827
        L_0x05a9:
            java.lang.String r1 = "V1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05b3
            goto L_0x0099
        L_0x05b3:
            r1 = 46
            goto L_0x0827
        L_0x05b7:
            java.lang.String r1 = "Q5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05c1
            goto L_0x0099
        L_0x05c1:
            r1 = 45
            goto L_0x0827
        L_0x05c5:
            java.lang.String r1 = "C1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05cf
            goto L_0x0099
        L_0x05cf:
            r1 = 44
            goto L_0x0827
        L_0x05d3:
            java.lang.String r1 = "woods_fn"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05dd
            goto L_0x0099
        L_0x05dd:
            r1 = 43
            goto L_0x0827
        L_0x05e1:
            java.lang.String r1 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05eb
            goto L_0x0099
        L_0x05eb:
            r1 = 42
            goto L_0x0827
        L_0x05ef:
            java.lang.String r1 = "Z12_PRO"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x05f9
            goto L_0x0099
        L_0x05f9:
            r1 = 41
            goto L_0x0827
        L_0x05fd:
            java.lang.String r1 = "BLACK-1X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0607
            goto L_0x0099
        L_0x0607:
            r1 = 40
            goto L_0x0827
        L_0x060b:
            java.lang.String r1 = "taido_row"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0615
            goto L_0x0099
        L_0x0615:
            r1 = 39
            goto L_0x0827
        L_0x0619:
            java.lang.String r1 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0623
            goto L_0x0099
        L_0x0623:
            r1 = 38
            goto L_0x0827
        L_0x0627:
            java.lang.String r1 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0631
            goto L_0x0099
        L_0x0631:
            r1 = 37
            goto L_0x0827
        L_0x0635:
            java.lang.String r1 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x063f
            goto L_0x0099
        L_0x063f:
            r1 = 36
            goto L_0x0827
        L_0x0643:
            java.lang.String r1 = "OnePlus5T"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x064d
            goto L_0x0099
        L_0x064d:
            r1 = 35
            goto L_0x0827
        L_0x0651:
            java.lang.String r1 = "whyred"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x065b
            goto L_0x0099
        L_0x065b:
            r1 = 34
            goto L_0x0827
        L_0x065f:
            java.lang.String r1 = "watson"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0669
            goto L_0x0099
        L_0x0669:
            r1 = 33
            goto L_0x0827
        L_0x066d:
            java.lang.String r1 = "SVP-DTV15"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0677
            goto L_0x0099
        L_0x0677:
            r1 = 32
            goto L_0x0827
        L_0x067b:
            java.lang.String r1 = "A7000-a"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0685
            goto L_0x0099
        L_0x0685:
            r1 = 31
            goto L_0x0827
        L_0x0689:
            java.lang.String r1 = "nicklaus_f"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0693
            goto L_0x0099
        L_0x0693:
            r1 = 30
            goto L_0x0827
        L_0x0697:
            java.lang.String r1 = "tcl_eu"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06a1
            goto L_0x0099
        L_0x06a1:
            r1 = 29
            goto L_0x0827
        L_0x06a5:
            java.lang.String r1 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06af
            goto L_0x0099
        L_0x06af:
            r1 = 28
            goto L_0x0827
        L_0x06b3:
            java.lang.String r1 = "s905x018"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06bd
            goto L_0x0099
        L_0x06bd:
            r1 = 27
            goto L_0x0827
        L_0x06c1:
            java.lang.String r1 = "A10-70L"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06cb
            goto L_0x0099
        L_0x06cb:
            r1 = 26
            goto L_0x0827
        L_0x06cf:
            java.lang.String r1 = "A10-70F"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06d9
            goto L_0x0099
        L_0x06d9:
            r1 = 25
            goto L_0x0827
        L_0x06dd:
            java.lang.String r1 = "namath"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06e7
            goto L_0x0099
        L_0x06e7:
            r1 = 24
            goto L_0x0827
        L_0x06eb:
            java.lang.String r1 = "Slate_Pro"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x06f5
            goto L_0x0099
        L_0x06f5:
            r1 = 23
            goto L_0x0827
        L_0x06f9:
            java.lang.String r1 = "iris60"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0703
            goto L_0x0099
        L_0x0703:
            r1 = 22
            goto L_0x0827
        L_0x0707:
            java.lang.String r1 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0711
            goto L_0x0099
        L_0x0711:
            r1 = 21
            goto L_0x0827
        L_0x0715:
            java.lang.String r1 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x071f
            goto L_0x0099
        L_0x071f:
            r1 = 20
            goto L_0x0827
        L_0x0723:
            java.lang.String r1 = "panell_dt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x072d
            goto L_0x0099
        L_0x072d:
            r1 = 19
            goto L_0x0827
        L_0x0731:
            java.lang.String r1 = "panell_ds"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x073b
            goto L_0x0099
        L_0x073b:
            r1 = 18
            goto L_0x0827
        L_0x073f:
            java.lang.String r1 = "panell_dl"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0749
            goto L_0x0099
        L_0x0749:
            r1 = 17
            goto L_0x0827
        L_0x074d:
            java.lang.String r1 = "vernee_M5"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0757
            goto L_0x0099
        L_0x0757:
            r1 = 16
            goto L_0x0827
        L_0x075b:
            java.lang.String r1 = "pacificrim"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0765
            goto L_0x0099
        L_0x0765:
            r1 = 15
            goto L_0x0827
        L_0x0769:
            java.lang.String r1 = "Phantom6"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0773
            goto L_0x0099
        L_0x0773:
            r1 = 14
            goto L_0x0827
        L_0x0777:
            java.lang.String r1 = "ComioS1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0781
            goto L_0x0099
        L_0x0781:
            r1 = 13
            goto L_0x0827
        L_0x0785:
            java.lang.String r1 = "XT1663"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x078f
            goto L_0x0099
        L_0x078f:
            r1 = 12
            goto L_0x0827
        L_0x0793:
            java.lang.String r1 = "RAIJIN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x079d
            goto L_0x0099
        L_0x079d:
            r1 = 11
            goto L_0x0827
        L_0x07a1:
            java.lang.String r1 = "AquaPowerM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ab
            goto L_0x0099
        L_0x07ab:
            r1 = 10
            goto L_0x0827
        L_0x07af:
            java.lang.String r1 = "PGN611"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07b9
            goto L_0x0099
        L_0x07b9:
            r1 = 9
            goto L_0x0827
        L_0x07bd:
            java.lang.String r1 = "PGN610"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07c7
            goto L_0x0099
        L_0x07c7:
            r1 = 8
            goto L_0x0827
        L_0x07ca:
            java.lang.String r2 = "PGN528"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0827
            goto L_0x0099
        L_0x07d4:
            java.lang.String r1 = "NX573J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07de
            goto L_0x0099
        L_0x07de:
            r1 = 6
            goto L_0x0827
        L_0x07e0:
            java.lang.String r1 = "NX541J"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07ea
            goto L_0x0099
        L_0x07ea:
            r1 = 5
            goto L_0x0827
        L_0x07ec:
            java.lang.String r1 = "CP8676_I02"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x07f6
            goto L_0x0099
        L_0x07f6:
            r1 = 4
            goto L_0x0827
        L_0x07f8:
            java.lang.String r1 = "K50a40"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0802
            goto L_0x0099
        L_0x0802:
            r1 = 3
            goto L_0x0827
        L_0x0804:
            java.lang.String r1 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x080e
            goto L_0x0099
        L_0x080e:
            r1 = 2
            goto L_0x0827
        L_0x0810:
            java.lang.String r1 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x081a
            goto L_0x0099
        L_0x081a:
            r1 = 1
            goto L_0x0827
        L_0x081c:
            java.lang.String r1 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0826
            goto L_0x0099
        L_0x0826:
            r1 = 0
        L_0x0827:
            switch(r1) {
                case 0: goto L_0x085a;
                case 1: goto L_0x085a;
                case 2: goto L_0x085a;
                case 3: goto L_0x085a;
                case 4: goto L_0x085a;
                case 5: goto L_0x085a;
                case 6: goto L_0x085a;
                case 7: goto L_0x085a;
                case 8: goto L_0x085a;
                case 9: goto L_0x085a;
                case 10: goto L_0x085a;
                case 11: goto L_0x085a;
                case 12: goto L_0x085a;
                case 13: goto L_0x085a;
                case 14: goto L_0x085a;
                case 15: goto L_0x085a;
                case 16: goto L_0x085a;
                case 17: goto L_0x085a;
                case 18: goto L_0x085a;
                case 19: goto L_0x085a;
                case 20: goto L_0x085a;
                case 21: goto L_0x085a;
                case 22: goto L_0x085a;
                case 23: goto L_0x085a;
                case 24: goto L_0x085a;
                case 25: goto L_0x085a;
                case 26: goto L_0x085a;
                case 27: goto L_0x085a;
                case 28: goto L_0x085a;
                case 29: goto L_0x085a;
                case 30: goto L_0x085a;
                case 31: goto L_0x085a;
                case 32: goto L_0x085a;
                case 33: goto L_0x085a;
                case 34: goto L_0x085a;
                case 35: goto L_0x085a;
                case 36: goto L_0x085a;
                case 37: goto L_0x085a;
                case 38: goto L_0x085a;
                case 39: goto L_0x085a;
                case 40: goto L_0x085a;
                case 41: goto L_0x085a;
                case 42: goto L_0x085a;
                case 43: goto L_0x085a;
                case 44: goto L_0x085a;
                case 45: goto L_0x085a;
                case 46: goto L_0x085a;
                case 47: goto L_0x085a;
                case 48: goto L_0x085a;
                case 49: goto L_0x085a;
                case 50: goto L_0x085a;
                case 51: goto L_0x085a;
                case 52: goto L_0x085a;
                case 53: goto L_0x085a;
                case 54: goto L_0x085a;
                case 55: goto L_0x085a;
                case 56: goto L_0x085a;
                case 57: goto L_0x085a;
                case 58: goto L_0x085a;
                case 59: goto L_0x085a;
                case 60: goto L_0x085a;
                case 61: goto L_0x085a;
                case 62: goto L_0x085a;
                case 63: goto L_0x085a;
                case 64: goto L_0x085a;
                case 65: goto L_0x085a;
                case 66: goto L_0x085a;
                case 67: goto L_0x085a;
                case 68: goto L_0x085a;
                case 69: goto L_0x085a;
                case 70: goto L_0x085a;
                case 71: goto L_0x085a;
                case 72: goto L_0x085a;
                case 73: goto L_0x085a;
                case 74: goto L_0x085a;
                case 75: goto L_0x085a;
                case 76: goto L_0x085a;
                case 77: goto L_0x085a;
                case 78: goto L_0x085a;
                case 79: goto L_0x085a;
                case 80: goto L_0x085a;
                case 81: goto L_0x085a;
                case 82: goto L_0x085a;
                case 83: goto L_0x085a;
                case 84: goto L_0x085a;
                case 85: goto L_0x085a;
                case 86: goto L_0x085a;
                case 87: goto L_0x085a;
                case 88: goto L_0x085a;
                case 89: goto L_0x085a;
                case 90: goto L_0x085a;
                case 91: goto L_0x085a;
                case 92: goto L_0x085a;
                case 93: goto L_0x085a;
                case 94: goto L_0x085a;
                case 95: goto L_0x085a;
                case 96: goto L_0x085a;
                case 97: goto L_0x085a;
                case 98: goto L_0x085a;
                case 99: goto L_0x085a;
                case 100: goto L_0x085a;
                case 101: goto L_0x085a;
                case 102: goto L_0x085a;
                case 103: goto L_0x085a;
                case 104: goto L_0x085a;
                case 105: goto L_0x085a;
                case 106: goto L_0x085a;
                case 107: goto L_0x085a;
                case 108: goto L_0x085a;
                case 109: goto L_0x085a;
                case 110: goto L_0x085a;
                case 111: goto L_0x085a;
                case 112: goto L_0x085a;
                case 113: goto L_0x085a;
                case 114: goto L_0x085a;
                case 115: goto L_0x085a;
                case 116: goto L_0x085a;
                case 117: goto L_0x085a;
                case 118: goto L_0x085a;
                case 119: goto L_0x085a;
                case 120: goto L_0x085a;
                case 121: goto L_0x085a;
                case 122: goto L_0x085a;
                case 123: goto L_0x085a;
                case 124: goto L_0x085a;
                case 125: goto L_0x085a;
                case 126: goto L_0x085a;
                case 127: goto L_0x085a;
                case 128: goto L_0x085a;
                case 129: goto L_0x085a;
                case 130: goto L_0x085a;
                case 131: goto L_0x085a;
                case 132: goto L_0x085a;
                case 133: goto L_0x085a;
                case 134: goto L_0x085a;
                case 135: goto L_0x085a;
                case 136: goto L_0x085a;
                case 137: goto L_0x085a;
                case 138: goto L_0x085a;
                case 139: goto L_0x085a;
                default: goto L_0x082a;
            }
        L_0x082a:
            java.lang.String r0 = p161w3.C5953m0.f29113d
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -594534941: goto L_0x084c;
                case 2006354: goto L_0x0841;
                case 2006367: goto L_0x0838;
                default: goto L_0x0836;
            }
        L_0x0836:
            r7 = -1
            goto L_0x0856
        L_0x0838:
            java.lang.String r1 = "AFTN"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0856
            goto L_0x0836
        L_0x0841:
            java.lang.String r1 = "AFTA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x084a
            goto L_0x0836
        L_0x084a:
            r7 = 1
            goto L_0x0856
        L_0x084c:
            java.lang.String r1 = "JSN-L21"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0855
            goto L_0x0836
        L_0x0855:
            r7 = 0
        L_0x0856:
            switch(r7) {
                case 0: goto L_0x085a;
                case 1: goto L_0x085a;
                case 2: goto L_0x085a;
                default: goto L_0x0859;
            }
        L_0x0859:
            goto L_0x085b
        L_0x085a:
            return r10
        L_0x085b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p167x3.C6059h.m35540w1():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r3.equals("video/av01") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r11 = ((java.lang.Integer) r11.first).intValue();
     */
    /* renamed from: x1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m35541x1(p120q2.C5381n r10, p177z1.C6272r1 r11) {
        /*
            int r0 = r11.f30248y
            int r1 = r11.f30249z
            r2 = -1
            if (r0 == r2) goto L_0x00d3
            if (r1 != r2) goto L_0x000b
            goto L_0x00d3
        L_0x000b:
            java.lang.String r3 = r11.f30243t
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r11 = p120q2.C5386v.m33088q(r11)
            if (r11 == 0) goto L_0x0033
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L_0x0031
            if (r11 == r7) goto L_0x0031
            if (r11 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            r3.hashCode()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L_0x007e;
                case -1662735862: goto L_0x0075;
                case -1662541442: goto L_0x006c;
                case 1187890754: goto L_0x0061;
                case 1331836730: goto L_0x0058;
                case 1599127256: goto L_0x004d;
                case 1599127257: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            r7 = -1
            goto L_0x0088
        L_0x0042:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x004b
            goto L_0x0040
        L_0x004b:
            r7 = 6
            goto L_0x0088
        L_0x004d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x0056
            goto L_0x0040
        L_0x0056:
            r7 = 5
            goto L_0x0088
        L_0x0058:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L_0x005f
            goto L_0x0040
        L_0x005f:
            r7 = 4
            goto L_0x0088
        L_0x0061:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x006a
            goto L_0x0040
        L_0x006a:
            r7 = 3
            goto L_0x0088
        L_0x006c:
            boolean r11 = r3.equals(r6)
            if (r11 != 0) goto L_0x0073
            goto L_0x0040
        L_0x0073:
            r7 = 2
            goto L_0x0088
        L_0x0075:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x0088
            goto L_0x0040
        L_0x007e:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L_0x0087
            goto L_0x0040
        L_0x0087:
            r7 = 0
        L_0x0088:
            switch(r7) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00ca;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00ca;
                case 4: goto L_0x008c;
                case 5: goto L_0x00ca;
                case 6: goto L_0x00c7;
                default: goto L_0x008b;
            }
        L_0x008b:
            return r2
        L_0x008c:
            java.lang.String r11 = p161w3.C5953m0.f29113d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00c6
            java.lang.String r3 = p161w3.C5953m0.f29112c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b5
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00c6
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x00b5
            boolean r10 = r10.f27521g
            if (r10 == 0) goto L_0x00b5
            goto L_0x00c6
        L_0x00b5:
            r10 = 16
            int r11 = p161w3.C5953m0.m35142l(r0, r10)
            int r0 = p161w3.C5953m0.m35142l(r1, r10)
            int r11 = r11 * r0
            int r11 = r11 * 16
            int r11 = r11 * 16
            goto L_0x00cc
        L_0x00c6:
            return r2
        L_0x00c7:
            int r11 = r0 * r1
            goto L_0x00cd
        L_0x00ca:
            int r11 = r0 * r1
        L_0x00cc:
            r4 = 2
        L_0x00cd:
            int r11 = r11 * 3
            int r4 = r4 * 2
            int r11 = r11 / r4
            return r11
        L_0x00d3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p167x3.C6059h.m35541x1(q2.n, z1.r1):int");
    }

    /* renamed from: y1 */
    private static Point m35542y1(C5381n nVar, C6272r1 r1Var) {
        int i = r1Var.f30249z;
        int i2 = r1Var.f30248y;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = ((float) i) / ((float) i3);
        for (int i4 : f29362E1) {
            int i5 = (int) (((float) i4) * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (C5953m0.f29110a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point b = nVar.mo19480b(i6, i4);
                if (nVar.mo19489u(b.x, b.y, (double) r1Var.f30218A)) {
                    return b;
                }
            } else {
                try {
                    int l = C5953m0.m35142l(i4, 16) * 16;
                    int l2 = C5953m0.m35142l(i5, 16) * 16;
                    if (l * l2 <= C5386v.m33067N()) {
                        int i7 = z ? l2 : l;
                        if (!z) {
                            l = l2;
                        }
                        return new Point(i7, l);
                    }
                } catch (C5386v.C5389c unused) {
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public MediaFormat mo20809C1(C6272r1 r1Var, String str, C6060a aVar, float f, boolean z, int i) {
        Pair<Integer, Integer> q;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", r1Var.f30248y);
        mediaFormat.setInteger("height", r1Var.f30249z);
        C5966u.m35236e(mediaFormat, r1Var.f30245v);
        C5966u.m35234c(mediaFormat, "frame-rate", r1Var.f30218A);
        C5966u.m35235d(mediaFormat, "rotation-degrees", r1Var.f30219B);
        C5966u.m35233b(mediaFormat, r1Var.f30223F);
        if ("video/dolby-vision".equals(r1Var.f30243t) && (q = C5386v.m33088q(r1Var)) != null) {
            C5966u.m35235d(mediaFormat, "profile", ((Integer) q.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f29400a);
        mediaFormat.setInteger("max-height", aVar.f29401b);
        C5966u.m35235d(mediaFormat, "max-input-size", aVar.f29402c);
        if (C5953m0.f29110a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m35538t1(mediaFormat, i);
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F1 */
    public boolean mo20810F1(long j, boolean z) throws C6264q {
        int P = mo21295P(j);
        if (P == 0) {
            return false;
        }
        if (z) {
            C1846e eVar = this.f27560Q0;
            eVar.f5420d += P;
            eVar.f5422f += this.f29390q1;
        } else {
            this.f27560Q0.f5426j++;
            mo20820b2(P, this.f29390q1);
        }
        mo19500l0();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo6466G() {
        m35537r1();
        m35536q1();
        this.f29380g1 = false;
        this.f29367C1 = null;
        try {
            super.mo6466G();
        } finally {
            this.f29371X0.mo20867m(this.f27560Q0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo6467H(boolean z, boolean z2) throws C6264q {
        super.mo6467H(z, z2);
        boolean z3 = mo21288A().f29959a;
        C5917a.m34873f(!z3 || this.f29366B1 != 0);
        if (this.f29365A1 != z3) {
            this.f29365A1 = z3;
            mo19492V0();
        }
        this.f29371X0.mo20869o(this.f27560Q0);
        this.f29383j1 = z2;
        this.f29384k1 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public void mo20811H1() {
        this.f29384k1 = true;
        if (!this.f29382i1) {
            this.f29382i1 = true;
            this.f29371X0.mo20861A(this.f29378e1);
            this.f29380g1 = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo6468I(long j, boolean z) throws C6264q {
        super.mo6468I(j, z);
        m35536q1();
        this.f29370W0.mo20835j();
        this.f29391r1 = -9223372036854775807L;
        this.f29385l1 = -9223372036854775807L;
        this.f29389p1 = 0;
        if (z) {
            m35531T1();
        } else {
            this.f29386m1 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo6469I0(Exception exc) {
        C5961r.m35210d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f29371X0.mo20863C(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo6470J() {
        try {
            super.mo6470J();
        } finally {
            if (this.f29379f1 != null) {
                m35529P1();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public void mo6471J0(String str, C5376l.C5377a aVar, long j, long j2) {
        this.f29371X0.mo20865k(str, j, j2);
        this.f29376c1 = mo20822s1(str);
        this.f29377d1 = ((C5381n) C5917a.m34872e(mo19506p0())).mo19486n();
        if (C5953m0.f29110a >= 23 && this.f29365A1) {
            this.f29367C1 = new C6061b((C5376l) C5917a.m34872e(mo19505o0()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo6472K() {
        super.mo6472K();
        this.f29388o1 = 0;
        this.f29387n1 = SystemClock.elapsedRealtime();
        this.f29392s1 = SystemClock.elapsedRealtime() * 1000;
        this.f29393t1 = 0;
        this.f29394u1 = 0;
        this.f29370W0.mo20836k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo6473K0(String str) {
        this.f29371X0.mo20866l(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6474L() {
        this.f29386m1 = -9223372036854775807L;
        m35522G1();
        m35523I1();
        this.f29370W0.mo20837l();
        super.mo6474L();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public C1852i mo6475L0(C6279s1 s1Var) throws C6264q {
        C1852i L0 = super.mo6475L0(s1Var);
        this.f29371X0.mo20870p(s1Var.f30328b, L0);
        return L0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public void mo6476M0(C6272r1 r1Var, MediaFormat mediaFormat) {
        int i;
        int i2;
        C5376l o0 = mo19505o0();
        if (o0 != null) {
            o0.mo19441k(this.f29381h1);
        }
        if (this.f29365A1) {
            this.f29395v1 = r1Var.f30248y;
            this.f29396w1 = r1Var.f30249z;
        } else {
            C5917a.m34872e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = mediaFormat.getInteger("width");
            }
            this.f29395v1 = i;
            if (z) {
                i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                i2 = mediaFormat.getInteger("height");
            }
            this.f29396w1 = i2;
        }
        float f = r1Var.f30220C;
        this.f29398y1 = f;
        if (C5953m0.f29110a >= 21) {
            int i3 = r1Var.f30219B;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f29395v1;
                this.f29395v1 = this.f29396w1;
                this.f29396w1 = i4;
                this.f29398y1 = 1.0f / f;
            }
        } else {
            this.f29397x1 = r1Var.f30219B;
        }
        this.f29370W0.mo20832g(r1Var.f30218A);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo19491N0(long j) {
        super.mo19491N0(j);
        if (!this.f29365A1) {
            this.f29390q1--;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N1 */
    public void mo20812N1(long j) throws C6264q {
        mo19503n1(j);
        m35524J1();
        this.f27560Q0.f5421e++;
        mo20811H1();
        mo19491N0(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo6477O0() {
        super.mo6477O0();
        m35536q1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo6478P0(C1848g gVar) throws C6264q {
        boolean z = this.f29365A1;
        if (!z) {
            this.f29390q1++;
        }
        if (C5953m0.f29110a < 23 && z) {
            mo20812N1(gVar.f5432e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public void mo20813Q1(C5376l lVar, int i, long j) {
        m35524J1();
        C5945j0.m35044a("releaseOutputBuffer");
        lVar.mo19440j(i, true);
        C5945j0.m35046c();
        this.f29392s1 = SystemClock.elapsedRealtime() * 1000;
        this.f27560Q0.f5421e++;
        this.f29389p1 = 0;
        mo20811H1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public boolean mo6479R0(long j, long j2, C5376l lVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C6272r1 r1Var) throws C6264q {
        long j4;
        boolean z3;
        long j5 = j;
        C5376l lVar2 = lVar;
        int i4 = i;
        long j6 = j3;
        C5917a.m34872e(lVar);
        if (this.f29385l1 == -9223372036854775807L) {
            this.f29385l1 = j5;
        }
        if (j6 != this.f29391r1) {
            this.f29370W0.mo20833h(j6);
            this.f29391r1 = j6;
        }
        long w0 = mo19509w0();
        long j7 = j6 - w0;
        if (!z || z2) {
            double x0 = (double) mo19510x0();
            boolean z4 = getState() == 2;
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j8 = (long) (((double) (j6 - j5)) / x0);
            if (z4) {
                j8 -= elapsedRealtime - j2;
            }
            if (this.f29378e1 != this.f29379f1) {
                long j9 = elapsedRealtime - this.f29392s1;
                if (this.f29384k1 ? this.f29382i1 : !z4 && !this.f29383j1) {
                    j4 = j9;
                    z3 = false;
                } else {
                    j4 = j9;
                    z3 = true;
                }
                if (this.f29386m1 == -9223372036854775807L && j5 >= w0 && (z3 || (z4 && mo20818Y1(j8, j4)))) {
                    long nanoTime = System.nanoTime();
                    m35527M1(j7, nanoTime, r1Var);
                    if (C5953m0.f29110a >= 21) {
                        mo20814R1(lVar, i, j7, nanoTime);
                    } else {
                        mo20813Q1(lVar2, i4, j7);
                    }
                    mo20821c2(j8);
                    return true;
                }
                if (z4 && j5 != this.f29385l1) {
                    long nanoTime2 = System.nanoTime();
                    long b = this.f29370W0.mo20831b((j8 * 1000) + nanoTime2);
                    long j10 = (b - nanoTime2) / 1000;
                    long j11 = j10;
                    boolean z5 = this.f29386m1 != -9223372036854775807L;
                    if (mo20816W1(j10, j2, z2) && mo20810F1(j5, z5)) {
                        return false;
                    }
                    if (mo20817X1(j11, j2, z2)) {
                        if (z5) {
                            mo20819a2(lVar2, i4, j7);
                        } else {
                            mo20823v1(lVar2, i4, j7);
                        }
                        mo20821c2(j11);
                        return true;
                    }
                    long j12 = j11;
                    if (C5953m0.f29110a >= 21) {
                        if (j12 < 50000) {
                            m35527M1(j7, b, r1Var);
                            mo20814R1(lVar, i, j7, b);
                            mo20821c2(j12);
                            return true;
                        }
                    } else if (j12 < 30000) {
                        if (j12 > 11000) {
                            try {
                                Thread.sleep((j12 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        m35527M1(j7, b, r1Var);
                        mo20813Q1(lVar2, i4, j7);
                        mo20821c2(j12);
                        return true;
                    }
                }
                return false;
            } else if (!m35520D1(j8)) {
                return false;
            } else {
                mo20819a2(lVar2, i4, j7);
                mo20821c2(j8);
                return true;
            }
        } else {
            mo20819a2(lVar2, i4, j7);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: R1 */
    public void mo20814R1(C5376l lVar, int i, long j, long j2) {
        m35524J1();
        C5945j0.m35044a("releaseOutputBuffer");
        lVar.mo19437g(i, j2);
        C5945j0.m35046c();
        this.f29392s1 = SystemClock.elapsedRealtime() * 1000;
        this.f27560Q0.f5421e++;
        this.f29389p1 = 0;
        mo20811H1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public C1852i mo6480S(C5381n nVar, C6272r1 r1Var, C6272r1 r1Var2) {
        int i;
        C1852i e = nVar.mo19481e(r1Var, r1Var2);
        int i2 = e.f5444e;
        int i3 = r1Var2.f30248y;
        C6060a aVar = this.f29375b1;
        if (i3 > aVar.f29400a || r1Var2.f30249z > aVar.f29401b) {
            i2 |= 256;
        }
        if (m35519B1(nVar, r1Var2) > this.f29375b1.f29402c) {
            i2 |= 64;
        }
        int i4 = i2;
        String str = nVar.f27515a;
        if (i4 != 0) {
            i = 0;
        } else {
            i = e.f5443d;
        }
        return new C1852i(str, r1Var, r1Var2, i, i4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V1 */
    public void mo20815V1(C5376l lVar, Surface surface) {
        lVar.mo19443m(surface);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W1 */
    public boolean mo20816W1(long j, long j2, boolean z) {
        return m35521E1(j) && !z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X0 */
    public void mo19493X0() {
        super.mo19493X0();
        this.f29390q1 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X1 */
    public boolean mo20817X1(long j, long j2, boolean z) {
        return m35520D1(j) && !z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y1 */
    public boolean mo20818Y1(long j, long j2) {
        return m35520D1(j) && j2 > 100000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a2 */
    public void mo20819a2(C5376l lVar, int i, long j) {
        C5945j0.m35044a("skipVideoBuffer");
        lVar.mo19440j(i, false);
        C5945j0.m35046c();
        this.f27560Q0.f5422f++;
    }

    /* renamed from: b */
    public String mo6482b() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public void mo20820b2(int i, int i2) {
        C1846e eVar = this.f27560Q0;
        eVar.f5424h += i;
        int i3 = i + i2;
        eVar.f5423g += i3;
        this.f29388o1 += i3;
        int i4 = this.f29389p1 + i3;
        this.f29389p1 = i4;
        eVar.f5425i = Math.max(i4, eVar.f5425i);
        int i5 = this.f29373Z0;
        if (i5 > 0 && this.f29388o1 >= i5) {
            m35522G1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C5380m mo19495c0(Throwable th, C5381n nVar) {
        return new C6058g(th, nVar, this.f29378e1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c2 */
    public void mo20821c2(long j) {
        this.f27560Q0.mo7046a(j);
        this.f29393t1 += j;
        this.f29394u1++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public boolean mo19498g1(C5381n nVar) {
        return this.f29378e1 != null || m35533Z1(nVar);
    }

    public boolean isReady() {
        C6062i iVar;
        if (super.isReady() && (this.f29382i1 || (((iVar = this.f29379f1) != null && this.f29378e1 == iVar) || mo19505o0() == null || this.f29365A1))) {
            this.f29386m1 = -9223372036854775807L;
            return true;
        } else if (this.f29386m1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f29386m1) {
                return true;
            }
            this.f29386m1 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public int mo6488j1(C5385q qVar, C6272r1 r1Var) throws C5386v.C5389c {
        boolean z;
        int i = 0;
        if (!C5967v.m35255s(r1Var.f30243t)) {
            return C6217e3.m36424a(0);
        }
        boolean z2 = r1Var.f30246w != null;
        List<C5381n> A1 = m35518A1(qVar, r1Var, z2, false);
        if (z2 && A1.isEmpty()) {
            A1 = m35518A1(qVar, r1Var, false, false);
        }
        if (A1.isEmpty()) {
            return C6217e3.m36424a(1);
        }
        if (!C5382o.m32995k1(r1Var)) {
            return C6217e3.m36424a(2);
        }
        C5381n nVar = A1.get(0);
        boolean m = nVar.mo19485m(r1Var);
        if (!m) {
            int i2 = 1;
            while (true) {
                if (i2 >= A1.size()) {
                    break;
                }
                C5381n nVar2 = A1.get(i2);
                if (nVar2.mo19485m(r1Var)) {
                    nVar = nVar2;
                    z = false;
                    m = true;
                    break;
                }
                i2++;
            }
        }
        z = true;
        int i3 = m ? 4 : 3;
        int i4 = nVar.mo19487p(r1Var) ? 16 : 8;
        int i5 = nVar.f27522h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (m) {
            List<C5381n> A12 = m35518A1(qVar, r1Var, z2, true);
            if (!A12.isEmpty()) {
                C5381n nVar3 = C5386v.m33092u(A12, r1Var).get(0);
                if (nVar3.mo19485m(r1Var) && nVar3.mo19487p(r1Var)) {
                    i = 32;
                }
            }
        }
        return C6217e3.m36426c(i3, i4, i, i5, i6);
    }

    /* renamed from: m */
    public void mo19501m(float f, float f2) throws C6264q {
        super.mo19501m(f, f2);
        this.f29370W0.mo20834i(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public boolean mo19507q0() {
        return this.f29365A1 && C5953m0.f29110a < 23;
    }

    /* renamed from: r */
    public void mo6490r(int i, Object obj) throws C6264q {
        if (i == 1) {
            m35532U1(obj);
        } else if (i == 7) {
            this.f29368D1 = (C6065j) obj;
        } else if (i == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f29366B1 != intValue) {
                this.f29366B1 = intValue;
                if (this.f29365A1) {
                    mo19492V0();
                }
            }
        } else if (i == 4) {
            this.f29381h1 = ((Integer) obj).intValue();
            C5376l o0 = mo19505o0();
            if (o0 != null) {
                o0.mo19441k(this.f29381h1);
            }
        } else if (i != 5) {
            super.mo6490r(i, obj);
        } else {
            this.f29370W0.mo20839o(((Integer) obj).intValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public float mo6491r0(float f, C6272r1 r1Var, C6272r1[] r1VarArr) {
        float f2 = -1.0f;
        for (C6272r1 r1Var2 : r1VarArr) {
            float f3 = r1Var2.f30218A;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s1 */
    public boolean mo20822s1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C6059h.class) {
            if (!f29363F1) {
                f29364G1 = m35540w1();
                f29363F1 = true;
            }
        }
        return f29364G1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public List<C5381n> mo6492t0(C5385q qVar, C6272r1 r1Var, boolean z) throws C5386v.C5389c {
        return C5386v.m33092u(m35518A1(qVar, r1Var, z, this.f29365A1), r1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public C5376l.C5377a mo6494v0(C5381n nVar, C6272r1 r1Var, MediaCrypto mediaCrypto, float f) {
        C6062i iVar = this.f29379f1;
        if (!(iVar == null || iVar.f29407a == nVar.f27521g)) {
            m35529P1();
        }
        String str = nVar.f27517c;
        C6060a z1 = mo20824z1(nVar, r1Var, mo21292E());
        this.f29375b1 = z1;
        MediaFormat C1 = mo20809C1(r1Var, str, z1, f, this.f29374a1, this.f29365A1 ? this.f29366B1 : 0);
        if (this.f29378e1 == null) {
            if (m35533Z1(nVar)) {
                if (this.f29379f1 == null) {
                    this.f29379f1 = C6062i.m35591c(this.f29369V0, nVar.f27521g);
                }
                this.f29378e1 = this.f29379f1;
            } else {
                throw new IllegalStateException();
            }
        }
        return C5376l.C5377a.m32927b(nVar, C1, r1Var, this.f29378e1, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo20823v1(C5376l lVar, int i, long j) {
        C5945j0.m35044a("dropVideoBuffer");
        lVar.mo19440j(i, false);
        C5945j0.m35046c();
        mo20820b2(0, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo19511y0(C1848g gVar) throws C6264q {
        if (this.f29377d1) {
            ByteBuffer byteBuffer = (ByteBuffer) C5917a.m34872e(gVar.f5433f);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    m35530S1(mo19505o0(), bArr);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z1 */
    public C6060a mo20824z1(C5381n nVar, C6272r1 r1Var, C6272r1[] r1VarArr) {
        int x1;
        int i = r1Var.f30248y;
        int i2 = r1Var.f30249z;
        int B1 = m35519B1(nVar, r1Var);
        if (r1VarArr.length == 1) {
            if (!(B1 == -1 || (x1 = m35541x1(nVar, r1Var)) == -1)) {
                B1 = Math.min((int) (((float) B1) * 1.5f), x1);
            }
            return new C6060a(i, i2, B1);
        }
        int length = r1VarArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            C6272r1 r1Var2 = r1VarArr[i3];
            if (r1Var.f30223F != null && r1Var2.f30223F == null) {
                r1Var2 = r1Var2.mo21483b().mo21496J(r1Var.f30223F).mo21491E();
            }
            if (nVar.mo19481e(r1Var, r1Var2).f5443d != 0) {
                int i4 = r1Var2.f30248y;
                z |= i4 == -1 || r1Var2.f30249z == -1;
                i = Math.max(i, i4);
                i2 = Math.max(i2, r1Var2.f30249z);
                B1 = Math.max(B1, m35519B1(nVar, r1Var2));
            }
        }
        if (z) {
            C5961r.m35215i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point y1 = m35542y1(nVar, r1Var);
            if (y1 != null) {
                i = Math.max(i, y1.x);
                i2 = Math.max(i2, y1.y);
                B1 = Math.max(B1, m35541x1(nVar, r1Var.mo21483b().mo21522j0(i).mo21503Q(i2).mo21491E()));
                C5961r.m35215i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new C6060a(i, i2, B1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6059h(Context context, C5376l.C5378b bVar, C5385q qVar, long j, boolean z, Handler handler, C6074x xVar, int i, float f) {
        super(2, bVar, qVar, z, f);
        this.f29372Y0 = j;
        this.f29373Z0 = i;
        Context applicationContext = context.getApplicationContext();
        this.f29369V0 = applicationContext;
        this.f29370W0 = new C6066l(applicationContext);
        Handler handler2 = handler;
        C6074x xVar2 = xVar;
        this.f29371X0 = new C6074x.C6075a(handler, xVar);
        this.f29374a1 = m35539u1();
        this.f29386m1 = -9223372036854775807L;
        this.f29395v1 = -1;
        this.f29396w1 = -1;
        this.f29398y1 = -1.0f;
        this.f29381h1 = 1;
        this.f29366B1 = 0;
        m35537r1();
    }
}
