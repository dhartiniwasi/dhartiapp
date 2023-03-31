package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class eb2 {

    /* renamed from: a */
    private final ConcurrentHashMap f8724a = new ConcurrentHashMap();

    /* renamed from: b */
    private final zs1 f8725b;

    public eb2(zs1 zs1) {
        this.f8725b = zs1;
    }

    /* renamed from: a */
    public final kd0 mo9870a(String str) {
        if (this.f8724a.containsKey(str)) {
            return (kd0) this.f8724a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public final void mo9871b(String str) {
        try {
            this.f8724a.put(str, this.f8725b.mo15656b(str));
        } catch (RemoteException e) {
            pm0.m18665e("Couldn't create RTB adapter : ", e);
        }
    }
}
