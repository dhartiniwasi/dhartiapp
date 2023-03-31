package com.google.android.gms.internal.ads;

import java.util.List;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class rt3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final rt3 zzb;
    private String zze = "";
    private by3 zzf = sx3.m20713x();

    static {
        rt3 rt3 = new rt3();
        zzb = rt3;
        sx3.m20701B(rt3.class, rt3);
    }

    private rt3() {
    }

    /* renamed from: H */
    public static rt3 m20025H() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", ps3.class});
        } else if (i2 == 3) {
            return new rt3();
        } else {
            if (i2 == 4) {
                return new qt3((pt3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: I */
    public final List mo13881I() {
        return this.zzf;
    }
}
