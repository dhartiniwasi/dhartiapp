package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import p088l5.C4956b;
import p088l5.C4957c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class p40 extends C4957c {
    public p40() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo13128a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof y20 ? (y20) queryLocalInterface : new w20(iBinder);
    }

    /* renamed from: c */
    public final v20 mo13129c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder w4 = ((y20) mo18828b(context)).mo14861w4(C4956b.m31385o3(context), C4956b.m31385o3(frameLayout), C4956b.m31385o3(frameLayout2), 223104000);
            if (w4 == null) {
                return null;
            }
            IInterface queryLocalInterface = w4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof v20 ? (v20) queryLocalInterface : new t20(w4);
        } catch (RemoteException | C4957c.C4958a e) {
            pm0.m18668h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
