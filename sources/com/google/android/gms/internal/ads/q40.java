package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import p088l5.C4957c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class q40 extends C4957c {
    public q40() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo13128a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof c30 ? (c30) queryLocalInterface : new b30(iBinder);
    }
}
