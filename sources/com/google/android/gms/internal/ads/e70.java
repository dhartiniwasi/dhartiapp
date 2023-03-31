package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p033d5.C4087c;
import p053g4.C4392c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class e70 extends C4392c {
    e70(Context context, Looper looper, C4087c.C4088a aVar, C4087c.C4089b bVar) {
        super(mh0.m16529a(context), looper, 166, aVar, bVar, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final String mo9818I() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final String mo9819J() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* renamed from: n0 */
    public final l70 mo9820n0() throws DeadObjectException {
        return (l70) super.mo17324H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final /* synthetic */ IInterface mo9821w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof l70 ? (l70) queryLocalInterface : new l70(iBinder);
    }
}
