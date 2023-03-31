package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p088l5.C4956b;
import p088l5.C4957c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class xe0 extends C4957c {
    public xe0() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo13128a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof ef0 ? (ef0) queryLocalInterface : new cf0(iBinder);
    }

    /* renamed from: c */
    public final bf0 mo15089c(Activity activity) {
        try {
            IBinder zze = ((ef0) mo18828b(activity)).zze(C4956b.m31385o3(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof bf0 ? (bf0) queryLocalInterface : new ze0(zze);
        } catch (RemoteException e) {
            pm0.m18668h("Could not create remote AdOverlay.", e);
            return null;
        } catch (C4957c.C4958a e2) {
            pm0.m18668h("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
