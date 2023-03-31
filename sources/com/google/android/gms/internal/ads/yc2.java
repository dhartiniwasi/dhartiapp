package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p060h4.C4509g2;
import p060h4.C4541l4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yc2 {

    /* renamed from: a */
    private final dd2 f20552a;

    /* renamed from: b */
    private final String f20553b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4509g2 f20554c;

    public yc2(dd2 dd2, String str) {
        this.f20552a = dd2;
        this.f20553b = str;
    }

    /* renamed from: a */
    public final synchronized String mo15424a() {
        String str;
        str = null;
        try {
            C4509g2 g2Var = this.f20554c;
            if (g2Var != null) {
                str = g2Var.mo12867c();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: b */
    public final synchronized String mo15425b() {
        String str;
        str = null;
        try {
            C4509g2 g2Var = this.f20554c;
            if (g2Var != null) {
                str = g2Var.mo12867c();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    /* renamed from: d */
    public final synchronized void mo15426d(C4541l4 l4Var, int i) throws RemoteException {
        this.f20554c = null;
        this.f20552a.mo9556a(l4Var, this.f20553b, new ed2(i), new xc2(this));
    }

    /* renamed from: e */
    public final synchronized boolean mo15427e() throws RemoteException {
        return this.f20552a.zza();
    }
}
