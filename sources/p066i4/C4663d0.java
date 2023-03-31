package p066i4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.af0;
import com.google.android.gms.internal.ads.qh1;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4596v;
import p088l5.C4954a;

/* renamed from: i4.d0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4663d0 extends af0 {

    /* renamed from: a */
    private final AdOverlayInfoParcel f25195a;

    /* renamed from: b */
    private final Activity f25196b;

    /* renamed from: c */
    private boolean f25197c = false;

    /* renamed from: d */
    private boolean f25198d = false;

    public C4663d0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f25195a = adOverlayInfoParcel;
        this.f25196b = activity;
    }

    /* renamed from: d */
    private final synchronized void m30301d() {
        if (!this.f25198d) {
            C4680t tVar = this.f25195a.f5960c;
            if (tVar != null) {
                tVar.mo8935p(4);
            }
            this.f25198d = true;
        }
    }

    /* renamed from: B */
    public final void mo8763B(C4954a aVar) throws RemoteException {
    }

    /* renamed from: Q4 */
    public final void mo8764Q4(Bundle bundle) {
        C4680t tVar;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14270C7)).booleanValue()) {
            this.f25196b.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f25195a;
        if (adOverlayInfoParcel == null) {
            this.f25196b.finish();
        } else if (z) {
            this.f25196b.finish();
        } else {
            if (bundle == null) {
                C4470a aVar = adOverlayInfoParcel.f5959b;
                if (aVar != null) {
                    aVar.onAdClicked();
                }
                qh1 qh1 = this.f25195a.f5957G;
                if (qh1 != null) {
                    qh1.mo9272h();
                }
                if (!(this.f25196b.getIntent() == null || !this.f25196b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) || (tVar = this.f25195a.f5960c) == null)) {
                    tVar.mo8932d();
                }
            }
            C4409t.m29318j();
            Activity activity = this.f25196b;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f25195a;
            C4669i iVar = adOverlayInfoParcel2.f5958a;
            if (!C4656a.m30283b(activity, iVar, adOverlayInfoParcel2.f5966i, iVar.f25207i)) {
                this.f25196b.finish();
            }
        }
    }

    /* renamed from: U */
    public final void mo8765U() throws RemoteException {
    }

    /* renamed from: Y */
    public final void mo8766Y() throws RemoteException {
    }

    /* renamed from: Z */
    public final void mo8767Z() throws RemoteException {
        if (this.f25196b.isFinishing()) {
            m30301d();
        }
    }

    /* renamed from: a0 */
    public final void mo8768a0() throws RemoteException {
        C4680t tVar = this.f25195a.f5960c;
        if (tVar != null) {
            tVar.mo8934o3();
        }
        if (this.f25196b.isFinishing()) {
            m30301d();
        }
    }

    /* renamed from: b0 */
    public final void mo8769b0() throws RemoteException {
        if (this.f25197c) {
            this.f25196b.finish();
            return;
        }
        this.f25197c = true;
        C4680t tVar = this.f25195a.f5960c;
        if (tVar != null) {
            tVar.mo8933i5();
        }
    }

    /* renamed from: d0 */
    public final void mo8770d0() throws RemoteException {
        if (this.f25196b.isFinishing()) {
            m30301d();
        }
    }

    /* renamed from: e0 */
    public final void mo8771e0() throws RemoteException {
    }

    /* renamed from: g */
    public final void mo8772g() throws RemoteException {
        C4680t tVar = this.f25195a.f5960c;
        if (tVar != null) {
            tVar.mo8931a();
        }
    }

    /* renamed from: g0 */
    public final void mo8773g0() throws RemoteException {
    }

    /* renamed from: g3 */
    public final void mo8774g3(int i, int i2, Intent intent) throws RemoteException {
    }

    /* renamed from: k0 */
    public final boolean mo8775k0() throws RemoteException {
        return false;
    }

    /* renamed from: n0 */
    public final void mo8776n0(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f25197c);
    }
}
