package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import p033d5.C4141r;
import p053g4.C4409t;
import p060h4.C4471a0;
import p060h4.C4484c1;
import p060h4.C4489d0;
import p060h4.C4491d2;
import p060h4.C4499e4;
import p060h4.C4502f1;
import p060h4.C4507g0;
import p060h4.C4509g2;
import p060h4.C4527j2;
import p060h4.C4541l4;
import p060h4.C4551n2;
import p060h4.C4561p0;
import p060h4.C4571q4;
import p060h4.C4591u0;
import p060h4.C4607w4;
import p060h4.C4609x0;
import p073j4.C4751b2;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ob2 extends C4561p0 {

    /* renamed from: a */
    private final Context f15025a;

    /* renamed from: b */
    private final C4489d0 f15026b;

    /* renamed from: c */
    private final et2 f15027c;

    /* renamed from: d */
    private final r31 f15028d;

    /* renamed from: e */
    private final ViewGroup f15029e;

    public ob2(Context context, C4489d0 d0Var, et2 et2, r31 r31) {
        this.f15025a = context;
        this.f15026b = d0Var;
        this.f15027c = et2;
        this.f15028d = r31;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View i = r31.mo8207i();
        C4409t.m29326r();
        frameLayout.addView(i, C4751b2.m30593K());
        frameLayout.setMinimumHeight(mo10863c().f24974c);
        frameLayout.setMinimumWidth(mo10863c().f24977f);
        this.f15029e = frameLayout;
    }

    /* renamed from: E6 */
    public final void mo10844E6(kf0 kf0) throws RemoteException {
    }

    /* renamed from: H5 */
    public final boolean mo10845H5() throws RemoteException {
        return false;
    }

    /* renamed from: J2 */
    public final void mo10846J2(String str) throws RemoteException {
    }

    /* renamed from: M5 */
    public final void mo10847M5(C4571q4 q4Var) throws RemoteException {
        C4141r.m28216f("setAdSize must be called on the main UI thread.");
        r31 r31 = this.f15028d;
        if (r31 != null) {
            r31.mo8212n(this.f15029e, q4Var);
        }
    }

    /* renamed from: O0 */
    public final boolean mo10848O0() throws RemoteException {
        return false;
    }

    /* renamed from: R0 */
    public final void mo10849R0(C4541l4 l4Var, C4507g0 g0Var) {
    }

    /* renamed from: R2 */
    public final void mo10850R2(C4484c1 c1Var) throws RemoteException {
        pm0.m18666f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: S */
    public final void mo10851S() throws RemoteException {
    }

    /* renamed from: T1 */
    public final void mo10852T1(uh0 uh0) throws RemoteException {
    }

    /* renamed from: V */
    public final C4489d0 mo10853V() throws RemoteException {
        return this.f15026b;
    }

    /* renamed from: V1 */
    public final void mo10854V1(C4489d0 d0Var) throws RemoteException {
        pm0.m18666f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: W */
    public final C4609x0 mo10855W() throws RemoteException {
        return this.f15027c.f8943n;
    }

    /* renamed from: X */
    public final C4509g2 mo10856X() {
        return this.f15028d.mo14679c();
    }

    /* renamed from: Y5 */
    public final void mo10858Y5(C4609x0 x0Var) throws RemoteException {
        nc2 nc2 = this.f15027c.f8932c;
        if (nc2 != null) {
            nc2.mo12586p(x0Var);
        }
    }

    /* renamed from: Z */
    public final C4527j2 mo10859Z() throws RemoteException {
        return this.f15028d.mo8208j();
    }

    /* renamed from: Z2 */
    public final boolean mo10860Z2(C4541l4 l4Var) throws RemoteException {
        pm0.m18666f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    /* renamed from: a0 */
    public final C4954a mo10861a0() throws RemoteException {
        return C4956b.m31385o3(this.f15029e);
    }

    /* renamed from: b */
    public final Bundle mo10862b() throws RemoteException {
        pm0.m18666f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    /* renamed from: c */
    public final C4571q4 mo10863c() {
        C4141r.m28216f("getAdSize must be called on the main UI thread.");
        return it2.m14548a(this.f15025a, Collections.singletonList(this.f15028d.mo8209k()));
    }

    /* renamed from: c1 */
    public final void mo10865c1(C4591u0 u0Var) throws RemoteException {
        pm0.m18666f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: d0 */
    public final String mo10866d0() throws RemoteException {
        if (this.f15028d.mo14679c() != null) {
            return this.f15028d.mo14679c().mo12867c();
        }
        return null;
    }

    /* renamed from: d1 */
    public final void mo10867d1(String str) throws RemoteException {
    }

    /* renamed from: e0 */
    public final String mo10868e0() throws RemoteException {
        return this.f15027c.f8935f;
    }

    /* renamed from: e3 */
    public final void mo10869e3(i00 i00) throws RemoteException {
        pm0.m18666f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: g */
    public final String mo10870g() throws RemoteException {
        if (this.f15028d.mo14679c() != null) {
            return this.f15028d.mo14679c().mo12867c();
        }
        return null;
    }

    /* renamed from: h0 */
    public final void mo10871h0() throws RemoteException {
        this.f15028d.mo8211m();
    }

    /* renamed from: j0 */
    public final void mo10872j0() throws RemoteException {
        C4141r.m28216f("destroy must be called on the main UI thread.");
        this.f15028d.mo14680d().mo14702q0((Context) null);
    }

    /* renamed from: l0 */
    public final void mo10873l0() throws RemoteException {
        C4141r.m28216f("destroy must be called on the main UI thread.");
        this.f15028d.mo14680d().mo14703s0((Context) null);
    }

    /* renamed from: n4 */
    public final void mo10874n4(C4471a0 a0Var) throws RemoteException {
        pm0.m18666f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: o5 */
    public final void mo10875o5(boolean z) throws RemoteException {
    }

    /* renamed from: o6 */
    public final void mo10876o6(C4954a aVar) {
    }

    /* renamed from: p4 */
    public final void mo10877p4(C4499e4 e4Var) throws RemoteException {
        pm0.m18666f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: q */
    public final void mo10878q() throws RemoteException {
        C4141r.m28216f("destroy must be called on the main UI thread.");
        this.f15028d.mo11305a();
    }

    /* renamed from: t3 */
    public final void mo10879t3(C4551n2 n2Var) throws RemoteException {
    }

    /* renamed from: w1 */
    public final void mo10880w1(nf0 nf0, String str) throws RemoteException {
    }

    /* renamed from: x4 */
    public final void mo10881x4(C4491d2 d2Var) {
        pm0.m18666f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: y3 */
    public final void mo10882y3(C2822rt rtVar) throws RemoteException {
    }

    /* renamed from: y5 */
    public final void mo10883y5(C4607w4 w4Var) throws RemoteException {
    }

    /* renamed from: y6 */
    public final void mo10884y6(boolean z) throws RemoteException {
        pm0.m18666f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    /* renamed from: z4 */
    public final void mo10885z4(C4502f1 f1Var) {
    }
}
