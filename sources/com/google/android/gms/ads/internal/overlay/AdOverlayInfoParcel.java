package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.a50;
import com.google.android.gms.internal.ads.gv1;
import com.google.android.gms.internal.ads.ja1;
import com.google.android.gms.internal.ads.o42;
import com.google.android.gms.internal.ads.qh1;
import com.google.android.gms.internal.ads.ux2;
import com.google.android.gms.internal.ads.vm0;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.y40;
import p040e5.C4240a;
import p040e5.C4243c;
import p053g4.C4399j;
import p060h4.C4470a;
import p060h4.C4596v;
import p066i4.C4665e0;
import p066i4.C4669i;
import p066i4.C4680t;
import p073j4.C4811t0;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class AdOverlayInfoParcel extends C4240a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C2039a();

    /* renamed from: A */
    public final gv1 f5951A;

    /* renamed from: B */
    public final ux2 f5952B;

    /* renamed from: C */
    public final C4811t0 f5953C;

    /* renamed from: D */
    public final String f5954D;

    /* renamed from: E */
    public final String f5955E;

    /* renamed from: F */
    public final ja1 f5956F;

    /* renamed from: G */
    public final qh1 f5957G;

    /* renamed from: a */
    public final C4669i f5958a;

    /* renamed from: b */
    public final C4470a f5959b;

    /* renamed from: c */
    public final C4680t f5960c;

    /* renamed from: d */
    public final vs0 f5961d;

    /* renamed from: e */
    public final a50 f5962e;

    /* renamed from: f */
    public final String f5963f;

    /* renamed from: g */
    public final boolean f5964g;

    /* renamed from: h */
    public final String f5965h;

    /* renamed from: i */
    public final C4665e0 f5966i;

    /* renamed from: r */
    public final int f5967r;

    /* renamed from: s */
    public final int f5968s;

    /* renamed from: t */
    public final String f5969t;

    /* renamed from: u */
    public final vm0 f5970u;

    /* renamed from: v */
    public final String f5971v;

    /* renamed from: w */
    public final C4399j f5972w;

    /* renamed from: x */
    public final y40 f5973x;

    /* renamed from: y */
    public final String f5974y;

    /* renamed from: z */
    public final o42 f5975z;

    public AdOverlayInfoParcel(C4470a aVar, C4680t tVar, y40 y40, a50 a50, C4665e0 e0Var, vs0 vs0, boolean z, int i, String str, vm0 vm0, qh1 qh1) {
        this.f5958a = null;
        this.f5959b = aVar;
        this.f5960c = tVar;
        this.f5961d = vs0;
        this.f5973x = y40;
        this.f5962e = a50;
        this.f5963f = null;
        this.f5964g = z;
        this.f5965h = null;
        this.f5966i = e0Var;
        this.f5967r = i;
        this.f5968s = 3;
        this.f5969t = str;
        this.f5970u = vm0;
        this.f5971v = null;
        this.f5972w = null;
        this.f5974y = null;
        this.f5954D = null;
        this.f5975z = null;
        this.f5951A = null;
        this.f5952B = null;
        this.f5953C = null;
        this.f5955E = null;
        this.f5956F = null;
        this.f5957G = qh1;
    }

    /* renamed from: I1 */
    public static AdOverlayInfoParcel m9009I1(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28619p(parcel, 2, this.f5958a, i, false);
        C4243c.m28613j(parcel, 3, C4956b.m31385o3(this.f5959b).asBinder(), false);
        C4243c.m28613j(parcel, 4, C4956b.m31385o3(this.f5960c).asBinder(), false);
        C4243c.m28613j(parcel, 5, C4956b.m31385o3(this.f5961d).asBinder(), false);
        C4243c.m28613j(parcel, 6, C4956b.m31385o3(this.f5962e).asBinder(), false);
        C4243c.m28620q(parcel, 7, this.f5963f, false);
        C4243c.m28606c(parcel, 8, this.f5964g);
        C4243c.m28620q(parcel, 9, this.f5965h, false);
        C4243c.m28613j(parcel, 10, C4956b.m31385o3(this.f5966i).asBinder(), false);
        C4243c.m28614k(parcel, 11, this.f5967r);
        C4243c.m28614k(parcel, 12, this.f5968s);
        C4243c.m28620q(parcel, 13, this.f5969t, false);
        C4243c.m28619p(parcel, 14, this.f5970u, i, false);
        C4243c.m28620q(parcel, 16, this.f5971v, false);
        C4243c.m28619p(parcel, 17, this.f5972w, i, false);
        C4243c.m28613j(parcel, 18, C4956b.m31385o3(this.f5973x).asBinder(), false);
        C4243c.m28620q(parcel, 19, this.f5974y, false);
        C4243c.m28613j(parcel, 20, C4956b.m31385o3(this.f5975z).asBinder(), false);
        C4243c.m28613j(parcel, 21, C4956b.m31385o3(this.f5951A).asBinder(), false);
        C4243c.m28613j(parcel, 22, C4956b.m31385o3(this.f5952B).asBinder(), false);
        C4243c.m28613j(parcel, 23, C4956b.m31385o3(this.f5953C).asBinder(), false);
        C4243c.m28620q(parcel, 24, this.f5954D, false);
        C4243c.m28620q(parcel, 25, this.f5955E, false);
        C4243c.m28613j(parcel, 26, C4956b.m31385o3(this.f5956F).asBinder(), false);
        C4243c.m28613j(parcel, 27, C4956b.m31385o3(this.f5957G).asBinder(), false);
        C4243c.m28605b(parcel, a);
    }

    public AdOverlayInfoParcel(C4470a aVar, C4680t tVar, y40 y40, a50 a50, C4665e0 e0Var, vs0 vs0, boolean z, int i, String str, String str2, vm0 vm0, qh1 qh1) {
        this.f5958a = null;
        this.f5959b = aVar;
        this.f5960c = tVar;
        this.f5961d = vs0;
        this.f5973x = y40;
        this.f5962e = a50;
        this.f5963f = str2;
        this.f5964g = z;
        this.f5965h = str;
        this.f5966i = e0Var;
        this.f5967r = i;
        this.f5968s = 3;
        this.f5969t = null;
        this.f5970u = vm0;
        this.f5971v = null;
        this.f5972w = null;
        this.f5974y = null;
        this.f5954D = null;
        this.f5975z = null;
        this.f5951A = null;
        this.f5952B = null;
        this.f5953C = null;
        this.f5955E = null;
        this.f5956F = null;
        this.f5957G = qh1;
    }

    public AdOverlayInfoParcel(C4470a aVar, C4680t tVar, C4665e0 e0Var, vs0 vs0, int i, vm0 vm0, String str, C4399j jVar, String str2, String str3, String str4, ja1 ja1) {
        this.f5958a = null;
        this.f5959b = null;
        this.f5960c = tVar;
        this.f5961d = vs0;
        this.f5973x = null;
        this.f5962e = null;
        this.f5964g = false;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14263C0)).booleanValue()) {
            this.f5963f = null;
            this.f5965h = null;
        } else {
            this.f5963f = str2;
            this.f5965h = str3;
        }
        this.f5966i = null;
        this.f5967r = i;
        this.f5968s = 1;
        this.f5969t = null;
        this.f5970u = vm0;
        this.f5971v = str;
        this.f5972w = jVar;
        this.f5974y = null;
        this.f5954D = null;
        this.f5975z = null;
        this.f5951A = null;
        this.f5952B = null;
        this.f5953C = null;
        this.f5955E = str4;
        this.f5956F = ja1;
        this.f5957G = null;
    }

    public AdOverlayInfoParcel(C4470a aVar, C4680t tVar, C4665e0 e0Var, vs0 vs0, boolean z, int i, vm0 vm0, qh1 qh1) {
        this.f5958a = null;
        this.f5959b = aVar;
        this.f5960c = tVar;
        this.f5961d = vs0;
        this.f5973x = null;
        this.f5962e = null;
        this.f5963f = null;
        this.f5964g = z;
        this.f5965h = null;
        this.f5966i = e0Var;
        this.f5967r = i;
        this.f5968s = 2;
        this.f5969t = null;
        this.f5970u = vm0;
        this.f5971v = null;
        this.f5972w = null;
        this.f5974y = null;
        this.f5954D = null;
        this.f5975z = null;
        this.f5951A = null;
        this.f5952B = null;
        this.f5953C = null;
        this.f5955E = null;
        this.f5956F = null;
        this.f5957G = qh1;
    }

    AdOverlayInfoParcel(C4669i iVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, vm0 vm0, String str4, C4399j jVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.f5958a = iVar;
        this.f5959b = (C4470a) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder));
        this.f5960c = (C4680t) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder2));
        this.f5961d = (vs0) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder3));
        this.f5973x = (y40) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder6));
        this.f5962e = (a50) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder4));
        this.f5963f = str;
        this.f5964g = z;
        this.f5965h = str2;
        this.f5966i = (C4665e0) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder5));
        this.f5967r = i;
        this.f5968s = i2;
        this.f5969t = str3;
        this.f5970u = vm0;
        this.f5971v = str4;
        this.f5972w = jVar;
        this.f5974y = str5;
        this.f5954D = str6;
        this.f5975z = (o42) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder7));
        this.f5951A = (gv1) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder8));
        this.f5952B = (ux2) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder9));
        this.f5953C = (C4811t0) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder10));
        this.f5955E = str7;
        this.f5956F = (ja1) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder11));
        this.f5957G = (qh1) C4956b.m31384P0(C4954a.C4955a.m31383B0(iBinder12));
    }

    public AdOverlayInfoParcel(C4669i iVar, C4470a aVar, C4680t tVar, C4665e0 e0Var, vm0 vm0, vs0 vs0, qh1 qh1) {
        this.f5958a = iVar;
        this.f5959b = aVar;
        this.f5960c = tVar;
        this.f5961d = vs0;
        this.f5973x = null;
        this.f5962e = null;
        this.f5963f = null;
        this.f5964g = false;
        this.f5965h = null;
        this.f5966i = e0Var;
        this.f5967r = -1;
        this.f5968s = 4;
        this.f5969t = null;
        this.f5970u = vm0;
        this.f5971v = null;
        this.f5972w = null;
        this.f5974y = null;
        this.f5954D = null;
        this.f5975z = null;
        this.f5951A = null;
        this.f5952B = null;
        this.f5953C = null;
        this.f5955E = null;
        this.f5956F = null;
        this.f5957G = qh1;
    }

    public AdOverlayInfoParcel(C4680t tVar, vs0 vs0, int i, vm0 vm0) {
        this.f5960c = tVar;
        this.f5961d = vs0;
        this.f5967r = 1;
        this.f5970u = vm0;
        this.f5958a = null;
        this.f5959b = null;
        this.f5973x = null;
        this.f5962e = null;
        this.f5963f = null;
        this.f5964g = false;
        this.f5965h = null;
        this.f5966i = null;
        this.f5968s = 1;
        this.f5969t = null;
        this.f5971v = null;
        this.f5972w = null;
        this.f5974y = null;
        this.f5954D = null;
        this.f5975z = null;
        this.f5951A = null;
        this.f5952B = null;
        this.f5953C = null;
        this.f5955E = null;
        this.f5956F = null;
        this.f5957G = null;
    }

    public AdOverlayInfoParcel(vs0 vs0, vm0 vm0, C4811t0 t0Var, o42 o42, gv1 gv1, ux2 ux2, String str, String str2, int i) {
        this.f5958a = null;
        this.f5959b = null;
        this.f5960c = null;
        this.f5961d = vs0;
        this.f5973x = null;
        this.f5962e = null;
        this.f5963f = null;
        this.f5964g = false;
        this.f5965h = null;
        this.f5966i = null;
        this.f5967r = 14;
        this.f5968s = 5;
        this.f5969t = null;
        this.f5970u = vm0;
        this.f5971v = null;
        this.f5972w = null;
        this.f5974y = str;
        this.f5954D = str2;
        this.f5975z = o42;
        this.f5951A = gv1;
        this.f5952B = ux2;
        this.f5953C = t0Var;
        this.f5955E = null;
        this.f5956F = null;
        this.f5957G = null;
    }
}
