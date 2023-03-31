package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p033d5.C4087c;
import p053g4.C4392c;
import p060h4.C4596v;
import p067i5.C4688b;
import p179z3.C6333f0;
import p180z4.C6366d;

/* renamed from: com.google.android.gms.internal.ads.gu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2414gu extends C4392c {
    C2414gu(Context context, Looper looper, C4087c.C4088a aVar, C4087c.C4089b bVar) {
        super(mh0.m16529a(context), looper, 123, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: n0 */
    public final boolean mo10644n0() {
        return ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14274D1)).booleanValue() && C4688b.m30368c(mo17351n(), C6333f0.f30514a);
    }

    /* renamed from: o0 */
    public final C2526ju mo10645o0() throws DeadObjectException {
        return (C2526ju) super.mo17324H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof C2526ju ? (C2526ju) queryLocalInterface : new C2526ju(iBinder);
    }

    /* renamed from: z */
    public final C6366d[] mo10646z() {
        return C6333f0.f30515b;
    }
}
