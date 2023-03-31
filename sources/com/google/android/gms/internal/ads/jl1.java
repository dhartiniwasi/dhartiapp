package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import p060h4.C4527j2;
import p060h4.C4596v;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jl1 extends n20 {

    /* renamed from: a */
    private final xl1 f11688a;

    /* renamed from: b */
    private C4954a f11689b;

    public jl1(xl1 xl1) {
        this.f11688a = xl1;
    }

    /* renamed from: I6 */
    private static float m14937I6(C4954a aVar) {
        Drawable drawable;
        if (aVar == null || (drawable = (Drawable) C4956b.m31384P0(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
    }

    /* renamed from: B */
    public final void mo11423B(C4954a aVar) {
        this.f11689b = aVar;
    }

    /* renamed from: P5 */
    public final void mo11424P5(y30 y30) {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14663q5)).booleanValue() && (this.f11688a.mo15139R() instanceof st0)) {
            ((st0) this.f11688a.mo15139R()).mo14140O6(y30);
        }
    }

    /* renamed from: T */
    public final float mo11425T() throws RemoteException {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14663q5)).booleanValue() && this.f11688a.mo15139R() != null) {
            return this.f11688a.mo15139R().mo10783T();
        }
        return 0.0f;
    }

    /* renamed from: U */
    public final C4527j2 mo11426U() throws RemoteException {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14663q5)).booleanValue()) {
            return null;
        }
        return this.f11688a.mo15139R();
    }

    /* renamed from: V */
    public final C4954a mo11427V() throws RemoteException {
        C4954a aVar = this.f11689b;
        if (aVar != null) {
            return aVar;
        }
        r20 U = this.f11688a.mo15142U();
        if (U == null) {
            return null;
        }
        return U.mo9422T();
    }

    /* renamed from: X */
    public final boolean mo11428X() throws RemoteException {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14663q5)).booleanValue() && this.f11688a.mo15139R() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo11429a() throws RemoteException {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14653p5)).booleanValue()) {
            return 0.0f;
        }
        if (this.f11688a.mo15131J() != 0.0f) {
            return this.f11688a.mo15131J();
        }
        if (this.f11688a.mo15139R() != null) {
            try {
                return this.f11688a.mo15139R().mo10789a();
            } catch (RemoteException e) {
                pm0.m18665e("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        } else {
            C4954a aVar = this.f11689b;
            if (aVar != null) {
                return m14937I6(aVar);
            }
            r20 U = this.f11688a.mo15142U();
            if (U == null) {
                return 0.0f;
            }
            float b = (U.mo9424b() == -1 || U.mo9426e() == -1) ? 0.0f : ((float) U.mo9424b()) / ((float) U.mo9426e());
            return b == 0.0f ? m14937I6(U.mo9422T()) : b;
        }
    }

    /* renamed from: c */
    public final float mo11430c() throws RemoteException {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14663q5)).booleanValue() && this.f11688a.mo15139R() != null) {
            return this.f11688a.mo15139R().mo10792c();
        }
        return 0.0f;
    }
}
