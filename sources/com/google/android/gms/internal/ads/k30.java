package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p023c4.C1860b;
import p023c4.C1865f;
import p088l5.C4956b;
import p179z3.C6355x;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class k30 implements C1865f {

    /* renamed from: a */
    private final j30 f11884a;

    /* renamed from: b */
    private final C1860b f11885b;

    /* renamed from: c */
    private final C6355x f11886c = new C6355x();

    public k30(j30 j30) {
        Context context;
        this.f11884a = j30;
        C1860b bVar = null;
        try {
            context = (Context) C4956b.m31384P0(j30.mo10252U());
        } catch (RemoteException | NullPointerException e) {
            pm0.m18665e("", e);
            context = null;
        }
        if (context != null) {
            C1860b bVar2 = new C1860b(context);
            try {
                if (true == this.f11884a.mo10250P(C4956b.m31385o3(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e2) {
                pm0.m18665e("", e2);
            }
        }
        this.f11885b = bVar;
    }

    /* renamed from: a */
    public final String mo7105a() {
        try {
            return this.f11884a.mo10253V();
        } catch (RemoteException e) {
            pm0.m18665e("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final j30 mo11558b() {
        return this.f11884a;
    }
}
