package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import p033d5.C4141r;
import p060h4.C4491d2;
import p060h4.C4509g2;
import p060h4.C4567q0;
import p060h4.C4596v;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class k31 extends C2673nt {

    /* renamed from: a */
    private final j31 f11887a;

    /* renamed from: b */
    private final C4567q0 f11888b;

    /* renamed from: c */
    private final zn2 f11889c;

    /* renamed from: d */
    private boolean f11890d = false;

    public k31(j31 j31, C4567q0 q0Var, zn2 zn2) {
        this.f11887a = j31;
        this.f11888b = q0Var;
        this.f11889c = zn2;
    }

    /* renamed from: H2 */
    public final void mo11559H2(C4491d2 d2Var) {
        C4141r.m28216f("setOnPaidEventListener must be called on the main UI thread.");
        zn2 zn2 = this.f11889c;
        if (zn2 != null) {
            zn2.mo15633v(d2Var);
        }
    }

    /* renamed from: T */
    public final C4509g2 mo11560T() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14408Q5)).booleanValue()) {
            return null;
        }
        return this.f11887a.mo14679c();
    }

    /* renamed from: Y2 */
    public final void mo11561Y2(C2859st stVar) {
    }

    /* renamed from: a */
    public final C4567q0 mo11562a() {
        return this.f11888b;
    }

    /* renamed from: p6 */
    public final void mo11563p6(boolean z) {
        this.f11890d = z;
    }

    /* renamed from: y4 */
    public final void mo11564y4(C4954a aVar, C2970vt vtVar) {
        try {
            this.f11889c.mo15635z(vtVar);
            this.f11887a.mo11308j((Activity) C4956b.m31384P0(aVar), vtVar, this.f11890d);
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }
}
