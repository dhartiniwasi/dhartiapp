package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.C2043a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ne0 extends C2043a.C2044a {

    /* renamed from: a */
    private final List f13981a = new ArrayList();

    /* renamed from: b */
    private String f13982b;

    public ne0(j20 j20) {
        try {
            this.f13982b = j20.mo8184c();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            this.f13982b = "";
        }
        try {
            for (Object next : j20.mo8181U()) {
                r20 I6 = next instanceof IBinder ? q20.m19033I6((IBinder) next) : null;
                if (I6 != null) {
                    this.f13981a.add(new oe0(I6));
                }
            }
        } catch (RemoteException e2) {
            pm0.m18665e("", e2);
        }
    }
}
