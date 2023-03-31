package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pz3 extends bw3 {

    /* renamed from: a */
    final tz3 f16098a;

    /* renamed from: b */
    dw3 f16099b = m18988a();

    /* renamed from: c */
    final /* synthetic */ vz3 f16100c;

    pz3(vz3 vz3) {
        this.f16100c = vz3;
        this.f16098a = new tz3(vz3, (sz3) null);
    }

    /* renamed from: a */
    private final dw3 m18988a() {
        tz3 tz3 = this.f16098a;
        if (tz3.hasNext()) {
            return tz3.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f16099b != null;
    }

    public final byte zza() {
        dw3 dw3 = this.f16099b;
        if (dw3 != null) {
            byte zza = dw3.zza();
            if (!this.f16099b.hasNext()) {
                this.f16099b = m18988a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
