package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p033d5.C4141r;
import p053g4.C4409t;
import p060h4.C4473a2;
import p060h4.C4491d2;
import p060h4.C4509g2;
import p060h4.C4541l4;
import p060h4.C4596v;
import p060h4.C4623z2;
import p073j4.C4751b2;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zr2 extends hi0 {

    /* renamed from: a */
    private final ur2 f21253a;

    /* renamed from: b */
    private final kr2 f21254b;

    /* renamed from: c */
    private final String f21255c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final vs2 f21256d;

    /* renamed from: e */
    private final Context f21257e;

    /* renamed from: f */
    private final vm0 f21258f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public pr1 f21259g;

    /* renamed from: h */
    private boolean f21260h = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14243A0)).booleanValue();

    public zr2(String str, ur2 ur2, Context context, kr2 kr2, vs2 vs2, vm0 vm0) {
        this.f21255c = str;
        this.f21253a = ur2;
        this.f21254b = kr2;
        this.f21256d = vs2;
        this.f21257e = context;
        this.f21258f = vm0;
    }

    /* renamed from: M6 */
    private final synchronized void m24750M6(C4541l4 l4Var, pi0 pi0, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) c10.f7566l.mo13438e()).booleanValue()) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14371M8)).booleanValue()) {
                z = true;
            }
        }
        if (this.f21258f.f19152c < ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14381N8)).intValue() || !z) {
            C4141r.m28216f("#008 Must be called on the main UI thread.");
        }
        this.f21254b.mo11777D(pi0);
        C4409t.m29326r();
        if (C4751b2.m30609d(this.f21257e)) {
            if (l4Var.f24883A == null) {
                pm0.m18664d("Failed to load the ad because app ID is missing.");
                this.f21254b.mo9420g(eu2.m12271d(4, (String) null, (C4623z2) null));
                return;
            }
        }
        if (this.f21259g == null) {
            mr2 mr2 = new mr2((String) null);
            this.f21253a.mo14600i(i);
            this.f21253a.mo9556a(l4Var, this.f21255c, mr2, new yr2(this));
        }
    }

    /* renamed from: D5 */
    public final void mo11111D5(qi0 qi0) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        this.f21254b.mo11780M(qi0);
    }

    /* renamed from: H4 */
    public final synchronized void mo10536H4(C4541l4 l4Var, pi0 pi0) throws RemoteException {
        m24750M6(l4Var, pi0, 3);
    }

    /* renamed from: V0 */
    public final synchronized void mo10537V0(C4954a aVar) throws RemoteException {
        mo11116m5(aVar, this.f21260h);
    }

    /* renamed from: V3 */
    public final void mo10538V3(C4491d2 d2Var) {
        C4141r.m28216f("setOnPaidEventListener must be called on the main UI thread.");
        this.f21254b.mo11783t(d2Var);
    }

    /* renamed from: Y */
    public final boolean mo11112Y() {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pr1 pr1 = this.f21259g;
        return pr1 != null && !pr1.mo13347l();
    }

    /* renamed from: Y3 */
    public final synchronized void mo10539Y3(C4541l4 l4Var, pi0 pi0) throws RemoteException {
        m24750M6(l4Var, pi0, 2);
    }

    /* renamed from: a */
    public final synchronized String mo11113a() throws RemoteException {
        pr1 pr1 = this.f21259g;
        if (pr1 == null || pr1.mo14679c() == null) {
            return null;
        }
        return pr1.mo14679c().mo12867c();
    }

    /* renamed from: b */
    public final fi0 mo11114b() {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pr1 pr1 = this.f21259g;
        if (pr1 != null) {
            return pr1.mo13344i();
        }
        return null;
    }

    /* renamed from: d */
    public final Bundle mo11115d() {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        pr1 pr1 = this.f21259g;
        return pr1 != null ? pr1.mo13343h() : new Bundle();
    }

    /* renamed from: d6 */
    public final void mo10540d6(li0 li0) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        this.f21254b.mo11784v(li0);
    }

    /* renamed from: e */
    public final C4509g2 mo10541e() {
        pr1 pr1;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14408Q5)).booleanValue() && (pr1 = this.f21259g) != null) {
            return pr1.mo14679c();
        }
        return null;
    }

    /* renamed from: m5 */
    public final synchronized void mo11116m5(C4954a aVar, boolean z) throws RemoteException {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        if (this.f21259g == null) {
            pm0.m18667g("Rewarded can not be shown before loaded");
            this.f21254b.mo10490R(eu2.m12271d(9, (String) null, (C4623z2) null));
            return;
        }
        this.f21259g.mo13349n(z, (Activity) C4956b.m31384P0(aVar));
    }

    /* renamed from: s3 */
    public final void mo10542s3(C4473a2 a2Var) {
        if (a2Var == null) {
            this.f21254b.mo11782k((y13) null);
        } else {
            this.f21254b.mo11782k(new wr2(this, a2Var));
        }
    }

    /* renamed from: u0 */
    public final synchronized void mo10543u0(boolean z) {
        C4141r.m28216f("setImmersiveMode must be called on the main UI thread.");
        this.f21260h = z;
    }

    /* renamed from: u4 */
    public final synchronized void mo10544u4(wi0 wi0) {
        C4141r.m28216f("#008 Must be called on the main UI thread.");
        vs2 vs2 = this.f21256d;
        vs2.f19233a = wi0.f19637a;
        vs2.f19234b = wi0.f19638b;
    }
}
