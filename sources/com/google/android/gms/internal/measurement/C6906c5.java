package com.google.android.gms.internal.measurement;

import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.c5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6906c5 extends C6995h9 implements C7108oa {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C6906c5 zzd;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    /* access modifiers changed from: private */
    public C7091n9 zzG = C6995h9.m40157n();
    private String zzH = "";
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL = "";
    private long zzM;
    private long zzN;
    private String zzO = "";
    private String zzP = "";
    private int zzQ;
    private String zzR = "";
    private C6957f5 zzS;
    private C7059l9 zzT = C6995h9.m40154k();
    private long zzU;
    private long zzV;
    private String zzW = "";
    private String zzX = "";
    private int zzY;
    private boolean zzZ;
    private String zzaa = "";
    private boolean zzab;
    private C7246x4 zzac;
    private String zzad = "";
    private C7091n9 zzae = C6995h9.m40157n();
    private String zzaf = "";
    private int zze;
    private int zzf;
    private int zzg;
    /* access modifiers changed from: private */
    public C7091n9 zzh = C6995h9.m40157n();
    private C7091n9 zzi = C6995h9.m40157n();
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        C6906c5 c5Var = new C6906c5();
        zzd = c5Var;
        C6995h9.m40161u(C6906c5.class, c5Var);
    }

    private C6906c5() {
    }

    /* renamed from: D0 */
    static /* synthetic */ void m39745D0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zzf |= 8192;
        c5Var.zzad = str;
    }

    /* renamed from: E0 */
    static /* synthetic */ void m39746E0(C6906c5 c5Var) {
        c5Var.zzf &= -8193;
        c5Var.zzad = zzd.zzad;
    }

    /* renamed from: G0 */
    static /* synthetic */ void m39747G0(C6906c5 c5Var, Iterable iterable) {
        C7091n9 n9Var = c5Var.zzae;
        if (!n9Var.mo23698e()) {
            c5Var.zzae = C6995h9.m40158o(n9Var);
        }
        C7121p7.m40558g(iterable, c5Var.zzae);
    }

    /* renamed from: I0 */
    static /* synthetic */ void m39749I0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zzf |= 16384;
        c5Var.zzaf = str;
    }

    /* renamed from: J0 */
    static /* synthetic */ void m39750J0(C6906c5 c5Var, int i) {
        c5Var.m39787f1();
        c5Var.zzh.remove(i);
    }

    /* renamed from: K0 */
    static /* synthetic */ void m39751K0(C6906c5 c5Var, int i, C7055l5 l5Var) {
        l5Var.getClass();
        c5Var.m39789g1();
        c5Var.zzi.set(i, l5Var);
    }

    /* renamed from: L0 */
    static /* synthetic */ void m39752L0(C6906c5 c5Var, C7055l5 l5Var) {
        l5Var.getClass();
        c5Var.m39789g1();
        c5Var.zzi.add(l5Var);
    }

    /* renamed from: M0 */
    static /* synthetic */ void m39753M0(C6906c5 c5Var, Iterable iterable) {
        c5Var.m39789g1();
        C7121p7.m40558g(iterable, c5Var.zzi);
    }

    /* renamed from: N0 */
    static /* synthetic */ void m39754N0(C6906c5 c5Var, int i) {
        c5Var.m39789g1();
        c5Var.zzi.remove(i);
    }

    /* renamed from: O0 */
    static /* synthetic */ void m39755O0(C6906c5 c5Var, long j) {
        c5Var.zze |= 2;
        c5Var.zzj = j;
    }

    /* renamed from: P0 */
    static /* synthetic */ void m39756P0(C6906c5 c5Var, long j) {
        c5Var.zze |= 4;
        c5Var.zzk = j;
    }

    /* renamed from: P1 */
    public static C6889b5 m39757P1() {
        return (C6889b5) zzd.mo23500y();
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m39758Q0(C6906c5 c5Var, long j) {
        c5Var.zze |= 8;
        c5Var.zzl = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m39760R(C6906c5 c5Var) {
        c5Var.zze &= Integer.MAX_VALUE;
        c5Var.zzO = zzd.zzO;
    }

    /* renamed from: R0 */
    static /* synthetic */ void m39761R0(C6906c5 c5Var, long j) {
        c5Var.zze |= 16;
        c5Var.zzm = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m39762S(C6906c5 c5Var, int i) {
        c5Var.zzf |= 2;
        c5Var.zzQ = i;
    }

    /* renamed from: S0 */
    static /* synthetic */ void m39763S0(C6906c5 c5Var) {
        c5Var.zze &= -17;
        c5Var.zzm = 0;
    }

    /* renamed from: T */
    static /* synthetic */ void m39764T(C6906c5 c5Var, int i, C7150r4 r4Var) {
        r4Var.getClass();
        c5Var.m39787f1();
        c5Var.zzh.set(i, r4Var);
    }

    /* renamed from: T0 */
    static /* synthetic */ void m39765T0(C6906c5 c5Var, long j) {
        c5Var.zze |= 32;
        c5Var.zzn = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m39766U(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zzf |= 4;
        c5Var.zzR = str;
    }

    /* renamed from: U0 */
    static /* synthetic */ void m39767U0(C6906c5 c5Var) {
        c5Var.zze &= -33;
        c5Var.zzn = 0;
    }

    /* renamed from: V */
    static /* synthetic */ void m39768V(C6906c5 c5Var, C6957f5 f5Var) {
        f5Var.getClass();
        c5Var.zzS = f5Var;
        c5Var.zzf |= 8;
    }

    /* renamed from: V0 */
    static /* synthetic */ void m39769V0(C6906c5 c5Var, String str) {
        c5Var.zze |= 64;
        c5Var.zzo = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    /* renamed from: W */
    static /* synthetic */ void m39770W(C6906c5 c5Var, Iterable iterable) {
        C7059l9 l9Var = c5Var.zzT;
        if (!l9Var.mo23698e()) {
            int size = l9Var.size();
            c5Var.zzT = l9Var.mo23529f0(size == 0 ? 10 : size + size);
        }
        C7121p7.m40558g(iterable, c5Var.zzT);
    }

    /* renamed from: W0 */
    static /* synthetic */ void m39771W0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 128;
        c5Var.zzp = str;
    }

    /* renamed from: X */
    static /* synthetic */ void m39772X(C6906c5 c5Var, C7150r4 r4Var) {
        r4Var.getClass();
        c5Var.m39787f1();
        c5Var.zzh.add(r4Var);
    }

    /* renamed from: X0 */
    static /* synthetic */ void m39773X0(C6906c5 c5Var) {
        c5Var.zze &= -129;
        c5Var.zzp = zzd.zzp;
    }

    /* renamed from: Y */
    static /* synthetic */ void m39774Y(C6906c5 c5Var, long j) {
        c5Var.zzf |= 16;
        c5Var.zzU = j;
    }

    /* renamed from: Y0 */
    static /* synthetic */ void m39775Y0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 256;
        c5Var.zzq = str;
    }

    /* renamed from: Z */
    static /* synthetic */ void m39776Z(C6906c5 c5Var, long j) {
        c5Var.zzf |= 32;
        c5Var.zzV = j;
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m39777Z0(C6906c5 c5Var) {
        c5Var.zze &= -257;
        c5Var.zzq = zzd.zzq;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m39778a0(C6906c5 c5Var, String str) {
        c5Var.zzf |= 128;
        c5Var.zzX = str;
    }

    /* renamed from: a1 */
    static /* synthetic */ void m39779a1(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 512;
        c5Var.zzr = str;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m39780b0(C6906c5 c5Var, Iterable iterable) {
        c5Var.m39787f1();
        C7121p7.m40558g(iterable, c5Var.zzh);
    }

    /* renamed from: b1 */
    static /* synthetic */ void m39781b1(C6906c5 c5Var, int i) {
        c5Var.zze |= 1024;
        c5Var.zzs = i;
    }

    /* renamed from: c1 */
    static /* synthetic */ void m39782c1(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 2048;
        c5Var.zzt = str;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m39783d0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 8192;
        c5Var.zzv = str;
    }

    /* renamed from: d1 */
    static /* synthetic */ void m39784d1(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 4096;
        c5Var.zzu = str;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m39785e0(C6906c5 c5Var, long j) {
        c5Var.zze |= 16384;
        c5Var.zzw = j;
    }

    /* renamed from: f0 */
    static /* synthetic */ void m39786f0(C6906c5 c5Var, long j) {
        c5Var.zze |= 32768;
        c5Var.zzx = 74029;
    }

    /* renamed from: f1 */
    private final void m39787f1() {
        C7091n9 n9Var = this.zzh;
        if (!n9Var.mo23698e()) {
            this.zzh = C6995h9.m40158o(n9Var);
        }
    }

    /* renamed from: g0 */
    static /* synthetic */ void m39788g0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 65536;
        c5Var.zzy = str;
    }

    /* renamed from: g1 */
    private final void m39789g1() {
        C7091n9 n9Var = this.zzi;
        if (!n9Var.mo23698e()) {
            this.zzi = C6995h9.m40158o(n9Var);
        }
    }

    /* renamed from: h0 */
    static /* synthetic */ void m39790h0(C6906c5 c5Var) {
        c5Var.zze &= -65537;
        c5Var.zzy = zzd.zzy;
    }

    /* renamed from: i0 */
    static /* synthetic */ void m39791i0(C6906c5 c5Var, boolean z) {
        c5Var.zze |= 131072;
        c5Var.zzz = z;
    }

    /* renamed from: j0 */
    static /* synthetic */ void m39792j0(C6906c5 c5Var) {
        c5Var.zze &= -131073;
        c5Var.zzz = false;
    }

    /* renamed from: k0 */
    static /* synthetic */ void m39793k0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 262144;
        c5Var.zzA = str;
    }

    /* renamed from: l0 */
    static /* synthetic */ void m39794l0(C6906c5 c5Var) {
        c5Var.zze &= -262145;
        c5Var.zzA = zzd.zzA;
    }

    /* renamed from: m0 */
    static /* synthetic */ void m39795m0(C6906c5 c5Var, long j) {
        c5Var.zze |= 524288;
        c5Var.zzB = j;
    }

    /* renamed from: n0 */
    static /* synthetic */ void m39796n0(C6906c5 c5Var, int i) {
        c5Var.zze |= 1048576;
        c5Var.zzC = i;
    }

    /* renamed from: o0 */
    static /* synthetic */ void m39797o0(C6906c5 c5Var, String str) {
        c5Var.zze |= 2097152;
        c5Var.zzD = str;
    }

    /* renamed from: p0 */
    static /* synthetic */ void m39798p0(C6906c5 c5Var) {
        c5Var.zze &= -2097153;
        c5Var.zzD = zzd.zzD;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m39799q0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 4194304;
        c5Var.zzE = str;
    }

    /* renamed from: r0 */
    static /* synthetic */ void m39800r0(C6906c5 c5Var, boolean z) {
        c5Var.zze |= 8388608;
        c5Var.zzF = z;
    }

    /* renamed from: s0 */
    static /* synthetic */ void m39801s0(C6906c5 c5Var, Iterable iterable) {
        C7091n9 n9Var = c5Var.zzG;
        if (!n9Var.mo23698e()) {
            c5Var.zzG = C6995h9.m40158o(n9Var);
        }
        C7121p7.m40558g(iterable, c5Var.zzG);
    }

    /* renamed from: u0 */
    static /* synthetic */ void m39803u0(C6906c5 c5Var, String str) {
        str.getClass();
        c5Var.zze |= 16777216;
        c5Var.zzH = str;
    }

    /* renamed from: v0 */
    static /* synthetic */ void m39804v0(C6906c5 c5Var, int i) {
        c5Var.zze |= 33554432;
        c5Var.zzI = i;
    }

    /* renamed from: w0 */
    static /* synthetic */ void m39805w0(C6906c5 c5Var, int i) {
        c5Var.zze |= 1;
        c5Var.zzg = 1;
    }

    /* renamed from: x0 */
    static /* synthetic */ void m39806x0(C6906c5 c5Var) {
        c5Var.zze &= -268435457;
        c5Var.zzL = zzd.zzL;
    }

    /* renamed from: y0 */
    static /* synthetic */ void m39807y0(C6906c5 c5Var, long j) {
        c5Var.zze |= 536870912;
        c5Var.zzM = j;
    }

    /* renamed from: A0 */
    public final boolean mo23185A0() {
        return this.zzF;
    }

    /* renamed from: A1 */
    public final int mo23186A1() {
        return this.zzQ;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zzd, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zze", "zzf", "zzg", "zzh", C7150r4.class, "zzi", C7055l5.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", C7086n4.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", C7022j4.f31781a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf"});
        } else if (i2 == 3) {
            return new C6906c5();
        } else {
            if (i2 == 4) {
                return new C6889b5((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }

    /* renamed from: B0 */
    public final boolean mo23187B0() {
        return (this.zze & 33554432) != 0;
    }

    /* renamed from: B1 */
    public final int mo23188B1() {
        return this.zzs;
    }

    /* renamed from: C */
    public final String mo23189C() {
        return this.zzv;
    }

    /* renamed from: C0 */
    public final boolean mo23190C0() {
        return (this.zze & 1048576) != 0;
    }

    /* renamed from: C1 */
    public final int mo23191C1() {
        return this.zzi.size();
    }

    /* renamed from: D */
    public final String mo23192D() {
        return this.zzX;
    }

    /* renamed from: D1 */
    public final long mo23193D1() {
        return this.zzM;
    }

    /* renamed from: E */
    public final String mo23194E() {
        return this.zzq;
    }

    /* renamed from: E1 */
    public final long mo23195E1() {
        return this.zzB;
    }

    /* renamed from: F */
    public final String mo23196F() {
        return this.zzO;
    }

    /* renamed from: F1 */
    public final long mo23197F1() {
        return this.zzU;
    }

    /* renamed from: G */
    public final String mo23198G() {
        return this.zzH;
    }

    /* renamed from: G1 */
    public final long mo23199G1() {
        return this.zzl;
    }

    /* renamed from: H */
    public final String mo23200H() {
        return this.zzE;
    }

    /* renamed from: I */
    public final String mo23201I() {
        return this.zzD;
    }

    /* renamed from: I1 */
    public final long mo23202I1() {
        return this.zzw;
    }

    /* renamed from: J */
    public final String mo23203J() {
        return this.zzp;
    }

    /* renamed from: J1 */
    public final long mo23204J1() {
        return this.zzn;
    }

    /* renamed from: K */
    public final String mo23205K() {
        return this.zzo;
    }

    /* renamed from: K1 */
    public final long mo23206K1() {
        return this.zzm;
    }

    /* renamed from: L */
    public final String mo23207L() {
        return this.zzy;
    }

    /* renamed from: L1 */
    public final long mo23208L1() {
        return this.zzk;
    }

    /* renamed from: M */
    public final String mo23209M() {
        return this.zzad;
    }

    /* renamed from: M1 */
    public final long mo23210M1() {
        return this.zzj;
    }

    /* renamed from: N */
    public final String mo23211N() {
        return this.zzr;
    }

    /* renamed from: N1 */
    public final long mo23212N1() {
        return this.zzx;
    }

    /* renamed from: O */
    public final List mo23213O() {
        return this.zzG;
    }

    /* renamed from: O1 */
    public final C7150r4 mo23214O1(int i) {
        return (C7150r4) this.zzh.get(i);
    }

    /* renamed from: P */
    public final List mo23215P() {
        return this.zzh;
    }

    /* renamed from: Q */
    public final List mo23216Q() {
        return this.zzi;
    }

    /* renamed from: R1 */
    public final C7055l5 mo23217R1(int i) {
        return (C7055l5) this.zzi.get(i);
    }

    /* renamed from: S1 */
    public final String mo23218S1() {
        return this.zzR;
    }

    /* renamed from: T1 */
    public final String mo23219T1() {
        return this.zzu;
    }

    /* renamed from: U1 */
    public final String mo23220U1() {
        return this.zzA;
    }

    /* renamed from: V1 */
    public final String mo23221V1() {
        return this.zzt;
    }

    /* renamed from: c0 */
    public final int mo23222c0() {
        return this.zzI;
    }

    /* renamed from: e1 */
    public final int mo23223e1() {
        return this.zzC;
    }

    /* renamed from: h1 */
    public final boolean mo23224h1() {
        return (this.zze & 536870912) != 0;
    }

    /* renamed from: i1 */
    public final boolean mo23225i1() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: j1 */
    public final boolean mo23226j1() {
        return (this.zze & 524288) != 0;
    }

    /* renamed from: k1 */
    public final boolean mo23227k1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: l1 */
    public final boolean mo23228l1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: m1 */
    public final boolean mo23229m1() {
        return (this.zze & 16384) != 0;
    }

    /* renamed from: n1 */
    public final boolean mo23230n1() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: o1 */
    public final boolean mo23231o1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: p1 */
    public final boolean mo23232p1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: q1 */
    public final boolean mo23233q1() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: r1 */
    public final boolean mo23234r1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: s1 */
    public final boolean mo23235s1() {
        return (this.zze & 8388608) != 0;
    }

    /* renamed from: t1 */
    public final boolean mo23236t1() {
        return (this.zzf & 8192) != 0;
    }

    /* renamed from: u1 */
    public final boolean mo23237u1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: v1 */
    public final boolean mo23238v1() {
        return (this.zze & 1024) != 0;
    }

    /* renamed from: w1 */
    public final boolean mo23239w1() {
        return (this.zze & 2) != 0;
    }

    /* renamed from: x1 */
    public final boolean mo23240x1() {
        return (this.zze & 32768) != 0;
    }

    /* renamed from: y1 */
    public final int mo23241y1() {
        return this.zzh.size();
    }

    /* renamed from: z0 */
    public final boolean mo23242z0() {
        return this.zzz;
    }

    /* renamed from: z1 */
    public final int mo23243z1() {
        return this.zzg;
    }
}
