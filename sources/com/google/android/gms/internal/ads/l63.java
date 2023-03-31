package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class l63 extends C2847sh implements n63 {
    l63(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    /* renamed from: j2 */
    public final void mo11903j2(Bundle bundle, p63 p63) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, bundle);
        C2958vh.m22238g(p, p63);
        mo14005o3(2, p);
    }

    /* renamed from: p3 */
    public final void mo11904p3(String str, Bundle bundle, p63 p63) throws RemoteException {
        Parcel p = mo14006p();
        p.writeString(str);
        C2958vh.m22236e(p, bundle);
        C2958vh.m22238g(p, p63);
        mo14005o3(1, p);
    }

    /* renamed from: q6 */
    public final void mo11905q6(Bundle bundle, p63 p63) throws RemoteException {
        Parcel p = mo14006p();
        C2958vh.m22236e(p, bundle);
        C2958vh.m22238g(p, p63);
        mo14005o3(3, p);
    }
}
