package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class a00 {

    /* renamed from: a */
    private final Map f6349a = new HashMap();

    /* renamed from: b */
    private final c00 f6350b;

    public a00(c00 c00) {
        this.f6350b = c00;
    }

    /* renamed from: a */
    public final c00 mo8152a() {
        return this.f6350b;
    }

    /* renamed from: b */
    public final void mo8153b(String str, C3124zz zzVar) {
        this.f6349a.put(str, zzVar);
    }

    /* renamed from: c */
    public final void mo8154c(String str, String str2, long j) {
        c00 c00 = this.f6350b;
        C3124zz zzVar = (C3124zz) this.f6349a.get(str2);
        String[] strArr = {str};
        if (zzVar != null) {
            c00.mo9001e(zzVar, j, strArr);
        }
        this.f6349a.put(str, new C3124zz(j, (String) null, (C3124zz) null));
    }
}
