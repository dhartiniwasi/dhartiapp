package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class w24 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final w24 zzb;
    private v24 zzA;
    private by3 zzB = sx3.m20713x();
    private w14 zzC;
    private String zzD = "";
    private n14 zzE;
    private byte zzF = 2;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private s14 zzk;
    private by3 zzl = sx3.m20713x();
    private by3 zzm = sx3.m20713x();
    private String zzn = "";
    private j24 zzo;
    private boolean zzp;
    private by3 zzq = sx3.m20713x();
    private String zzr = "";
    private boolean zzs;
    private boolean zzt;
    private jw3 zzu = jw3.f11808b;
    private s24 zzv;
    private boolean zzw;
    private String zzx = "";
    private by3 zzy = sx3.m20713x();
    private by3 zzz = sx3.m20713x();

    static {
        w24 w24 = new w24();
        zzb = w24;
        sx3.m20701B(w24.class, w24);
    }

    private w24() {
    }

    /* renamed from: G */
    public static p14 m22540G() {
        return (p14) zzb.mo14160D();
    }

    /* renamed from: L */
    static /* synthetic */ void m22542L(w24 w24, String str) {
        str.getClass();
        w24.zze |= 4;
        w24.zzh = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m22543M(w24 w24, String str) {
        str.getClass();
        w24.zze |= 8;
        w24.zzi = str;
    }

    /* renamed from: N */
    static /* synthetic */ void m22544N(w24 w24, s14 s14) {
        s14.getClass();
        w24.zzk = s14;
        w24.zze |= 32;
    }

    /* renamed from: O */
    static /* synthetic */ void m22545O(w24 w24, p24 p24) {
        p24.getClass();
        by3 by3 = w24.zzl;
        if (!by3.mo8988e()) {
            w24.zzl = sx3.m20714y(by3);
        }
        w24.zzl.add(p24);
    }

    /* renamed from: P */
    static /* synthetic */ void m22546P(w24 w24, String str) {
        w24.zze |= 64;
        w24.zzn = str;
    }

    /* renamed from: Q */
    static /* synthetic */ void m22547Q(w24 w24) {
        w24.zze &= -65;
        w24.zzn = zzb.zzn;
    }

    /* renamed from: R */
    static /* synthetic */ void m22548R(w24 w24, j24 j24) {
        j24.getClass();
        w24.zzo = j24;
        w24.zze |= 128;
    }

    /* renamed from: S */
    static /* synthetic */ void m22549S(w24 w24, s24 s24) {
        s24.getClass();
        w24.zzv = s24;
        w24.zze |= 8192;
    }

    /* renamed from: T */
    static /* synthetic */ void m22550T(w24 w24, Iterable iterable) {
        by3 by3 = w24.zzy;
        if (!by3.mo8988e()) {
            w24.zzy = sx3.m20714y(by3);
        }
        sv3.m20652h(iterable, w24.zzy);
    }

    /* renamed from: U */
    static /* synthetic */ void m22551U(w24 w24, Iterable iterable) {
        by3 by3 = w24.zzz;
        if (!by3.mo8988e()) {
            w24.zzz = sx3.m20714y(by3);
        }
        sv3.m20652h(iterable, w24.zzz);
    }

    /* renamed from: V */
    static /* synthetic */ void m22552V(w24 w24, int i) {
        w24.zzf = i - 1;
        w24.zze |= 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzF);
        }
        byte b = 1;
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0006\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013", new Object[]{"zze", "zzh", "zzi", "zzj", "zzl", p24.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzf", k24.f11882a, "zzg", o14.f14801a, "zzk", "zzn", "zzo", "zzu", "zzm", a34.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", g34.class, "zzC", "zzD", "zzE"});
        } else if (i2 == 3) {
            return new w24();
        } else {
            if (i2 == 4) {
                return new p14((g14) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzF = b;
            return null;
        }
    }

    /* renamed from: I */
    public final String mo14862I() {
        return this.zzn;
    }

    /* renamed from: J */
    public final String mo14863J() {
        return this.zzh;
    }

    /* renamed from: K */
    public final List mo14864K() {
        return this.zzl;
    }
}
