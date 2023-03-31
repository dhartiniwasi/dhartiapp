package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p060h4.C4527j2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class l62 implements t51 {

    /* renamed from: a */
    public final /* synthetic */ g52 f12662a;

    public /* synthetic */ l62(g52 g52) {
        this.f12662a = g52;
    }

    public final C4527j2 zza() {
        try {
            return ((kd0) this.f12662a.f9705b).mo11088a();
        } catch (RemoteException e) {
            throw new jt2(e);
        }
    }
}
