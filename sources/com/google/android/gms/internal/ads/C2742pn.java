package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2742pn implements C2780qo {

    /* renamed from: a */
    private final C2780qo[] f15926a;

    public C2742pn(C2780qo[] qoVarArr) {
        this.f15926a = qoVarArr;
    }

    /* renamed from: e0 */
    public final boolean mo9236e0(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (C2780qo qoVar : this.f15926a) {
                if (qoVar.zza() == zza) {
                    z |= qoVar.mo9236e0(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    public final long zza() {
        long j = Long.MAX_VALUE;
        for (C2780qo zza : this.f15926a) {
            long zza2 = zza.zza();
            if (zza2 != Long.MIN_VALUE) {
                j = Math.min(j, zza2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }
}
