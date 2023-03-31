package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gx */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2417gx extends sx3 implements dz3 {
    private static final yx3 zzb = new C2342ex();
    /* access modifiers changed from: private */
    public static final C2417gx zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private xx3 zzk = sx3.m20710t();
    private C2231bx zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private long zzs;

    static {
        C2417gx gxVar = new C2417gx();
        zze = gxVar;
        sx3.m20701B(C2417gx.class, gxVar);
    }

    private C2417gx() {
    }

    /* renamed from: G */
    static /* synthetic */ void m13564G(C2417gx gxVar, int i) {
        gxVar.zzn = i - 1;
        gxVar.zzf |= 64;
    }

    /* renamed from: H */
    static /* synthetic */ void m13565H(C2417gx gxVar, int i) {
        gxVar.zzo = i - 1;
        gxVar.zzf |= 128;
    }

    /* renamed from: I */
    static /* synthetic */ void m13566I(C2417gx gxVar, int i) {
        gxVar.zzq = i - 1;
        gxVar.zzf |= 512;
    }

    /* renamed from: O */
    public static C2380fx m13567O() {
        return (C2380fx) zze.mo14160D();
    }

    /* renamed from: Q */
    public static C2417gx m13569Q(byte[] bArr) throws ey3 {
        return (C2417gx) sx3.m20706p(zze, bArr);
    }

    /* renamed from: T */
    static /* synthetic */ void m13570T(C2417gx gxVar, long j) {
        gxVar.zzf |= 1;
        gxVar.zzg = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m13571U(C2417gx gxVar, long j) {
        gxVar.zzf |= 4;
        gxVar.zzi = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m13572V(C2417gx gxVar, long j) {
        gxVar.zzf |= 8;
        gxVar.zzj = j;
    }

    /* renamed from: W */
    static /* synthetic */ void m13573W(C2417gx gxVar, Iterable iterable) {
        xx3 xx3 = gxVar.zzk;
        if (!xx3.mo8988e()) {
            gxVar.zzk = sx3.m20711u(xx3);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            gxVar.zzk.mo14422i0(((C2935uv) it.next()).zza());
        }
    }

    /* renamed from: X */
    static /* synthetic */ void m13574X(C2417gx gxVar, C2231bx bxVar) {
        bxVar.getClass();
        gxVar.zzl = bxVar;
        gxVar.zzf |= 16;
    }

    /* renamed from: Y */
    static /* synthetic */ void m13575Y(C2417gx gxVar, int i) {
        gxVar.zzf |= 256;
        gxVar.zzp = i;
    }

    /* renamed from: Z */
    static /* synthetic */ void m13576Z(C2417gx gxVar, C2603lx lxVar) {
        gxVar.zzr = lxVar.zza();
        gxVar.zzf |= 1024;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m13577a0(C2417gx gxVar, long j) {
        gxVar.zzf |= 2048;
        gxVar.zzs = j;
    }

    /* renamed from: g0 */
    static /* synthetic */ void m13578g0(C2417gx gxVar, int i) {
        gxVar.zzh = i - 1;
        gxVar.zzf |= 2;
    }

    /* renamed from: h0 */
    static /* synthetic */ void m13579h0(C2417gx gxVar, int i) {
        gxVar.zzm = i - 1;
        gxVar.zzf |= 32;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            wx3 wx3 = C2565kw.f12309a;
            return sx3.m20700A(zze, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zzf", "zzg", "zzh", wx3, "zzi", "zzj", "zzk", C2935uv.m21866b(), "zzl", "zzm", wx3, "zzn", wx3, "zzo", wx3, "zzp", "zzq", wx3, "zzr", C2603lx.m16295b(), "zzs"});
        } else if (i2 == 3) {
            return new C2417gx();
        } else {
            if (i2 == 4) {
                return new C2380fx((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }

    /* renamed from: J */
    public final int mo10663J() {
        return this.zzp;
    }

    /* renamed from: K */
    public final long mo10664K() {
        return this.zzj;
    }

    /* renamed from: L */
    public final long mo10665L() {
        return this.zzi;
    }

    /* renamed from: M */
    public final long mo10666M() {
        return this.zzg;
    }

    /* renamed from: N */
    public final C2231bx mo10667N() {
        C2231bx bxVar = this.zzl;
        return bxVar == null ? C2231bx.m10614I() : bxVar;
    }

    /* renamed from: R */
    public final C2603lx mo10668R() {
        C2603lx a = C2603lx.m16294a(this.zzr);
        return a == null ? C2603lx.UNSPECIFIED : a;
    }

    /* renamed from: S */
    public final List mo10669S() {
        return new zx3(this.zzk, zzb);
    }

    /* renamed from: b0 */
    public final int mo10670b0() {
        int a = C2602lw.m16240a(this.zzn);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: c0 */
    public final int mo10671c0() {
        int a = C2602lw.m16240a(this.zzo);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: d0 */
    public final int mo10672d0() {
        int a = C2602lw.m16240a(this.zzq);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: e0 */
    public final int mo10673e0() {
        int a = C2602lw.m16240a(this.zzh);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: f0 */
    public final int mo10674f0() {
        int a = C2602lw.m16240a(this.zzm);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
