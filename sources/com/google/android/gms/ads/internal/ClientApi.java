package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.a30;
import com.google.android.gms.internal.ads.a70;
import com.google.android.gms.internal.ads.an2;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.bn2;
import com.google.android.gms.internal.ads.bs2;
import com.google.android.gms.internal.ads.c70;
import com.google.android.gms.internal.ads.fl0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.lq2;
import com.google.android.gms.internal.ads.po2;
import com.google.android.gms.internal.ads.pw1;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.qb2;
import com.google.android.gms.internal.ads.rh0;
import com.google.android.gms.internal.ads.sm1;
import com.google.android.gms.internal.ads.su0;
import com.google.android.gms.internal.ads.te0;
import com.google.android.gms.internal.ads.um1;
import com.google.android.gms.internal.ads.v20;
import com.google.android.gms.internal.ads.vm0;
import java.util.HashMap;
import p053g4.C4408s;
import p060h4.C4472a1;
import p060h4.C4538l1;
import p060h4.C4543m0;
import p060h4.C4567q0;
import p060h4.C4571q4;
import p060h4.C4596v;
import p066i4.C4662d;
import p066i4.C4663d0;
import p066i4.C4666f;
import p066i4.C4667g;
import p066i4.C4684x;
import p066i4.C4685y;
import p088l5.C4954a;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class ClientApi extends C4472a1 {
    /* renamed from: D3 */
    public final C4567q0 mo7825D3(C4954a aVar, C4571q4 q4Var, String str, qb0 qb0, int i) {
        Context context = (Context) C4956b.m31384P0(aVar);
        lq2 w = su0.m20616e(context, qb0, i).mo9730w();
        w.mo8982a(context);
        w.mo8984c(q4Var);
        w.mo8985i(str);
        return w.mo8983b().zza();
    }

    /* renamed from: F1 */
    public final C4567q0 mo7826F1(C4954a aVar, C4571q4 q4Var, String str, qb0 qb0, int i) {
        Context context = (Context) C4956b.m31384P0(aVar);
        an2 u = su0.m20616e(context, qb0, i).mo9728u();
        u.mo8441f(str);
        u.mo8439a(context);
        bn2 e = u.mo8440e();
        if (i >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14662q4)).intValue()) {
            return e.mo8891d();
        }
        return e.zza();
    }

    /* renamed from: I4 */
    public final ii0 mo7827I4(C4954a aVar, String str, qb0 qb0, int i) {
        Context context = (Context) C4956b.m31384P0(aVar);
        bs2 x = su0.m20616e(context, qb0, i).mo9731x();
        x.mo8925a(context);
        x.mo8927f(str);
        return x.mo8926e().zza();
    }

    /* renamed from: L0 */
    public final C4538l1 mo7828L0(C4954a aVar, int i) {
        return su0.m20616e((Context) C4956b.m31384P0(aVar), (qb0) null, i).mo9713f();
    }

    /* renamed from: M3 */
    public final te0 mo7829M3(C4954a aVar, qb0 qb0, int i) {
        return su0.m20616e((Context) C4956b.m31384P0(aVar), qb0, i).mo9723p();
    }

    /* renamed from: R5 */
    public final rh0 mo7830R5(C4954a aVar, qb0 qb0, int i) {
        Context context = (Context) C4956b.m31384P0(aVar);
        bs2 x = su0.m20616e(context, qb0, i).mo9731x();
        x.mo8925a(context);
        return x.mo8926e().mo9274d();
    }

    /* renamed from: V5 */
    public final C4567q0 mo7831V5(C4954a aVar, C4571q4 q4Var, String str, int i) {
        return new C4408s((Context) C4956b.m31384P0(aVar), q4Var, str, new vm0(223104000, i, true, false));
    }

    /* renamed from: X1 */
    public final C4543m0 mo7832X1(C4954a aVar, String str, qb0 qb0, int i) {
        Context context = (Context) C4956b.m31384P0(aVar);
        return new qb2(su0.m20616e(context, qb0, i), context, str);
    }

    /* renamed from: a3 */
    public final C4567q0 mo7833a3(C4954a aVar, C4571q4 q4Var, String str, qb0 qb0, int i) {
        Context context = (Context) C4956b.m31384P0(aVar);
        po2 v = su0.m20616e(context, qb0, i).mo9729v();
        v.mo9363a(context);
        v.mo9365c(q4Var);
        v.mo9366i(str);
        return v.mo9364b().zza();
    }

    /* renamed from: j1 */
    public final v20 mo7834j1(C4954a aVar, C4954a aVar2) {
        return new um1((FrameLayout) C4956b.m31384P0(aVar), (FrameLayout) C4956b.m31384P0(aVar2), 223104000);
    }

    /* renamed from: r3 */
    public final a30 mo7835r3(C4954a aVar, C4954a aVar2, C4954a aVar3) {
        return new sm1((View) C4956b.m31384P0(aVar), (HashMap) C4956b.m31384P0(aVar2), (HashMap) C4956b.m31384P0(aVar3));
    }

    /* renamed from: s0 */
    public final bf0 mo7836s0(C4954a aVar) {
        Activity activity = (Activity) C4956b.m31384P0(aVar);
        AdOverlayInfoParcel I1 = AdOverlayInfoParcel.m9009I1(activity.getIntent());
        if (I1 == null) {
            return new C4685y(activity);
        }
        int i = I1.f5968s;
        if (i == 1) {
            return new C4684x(activity);
        }
        if (i == 2) {
            return new C4666f(activity);
        }
        if (i == 3) {
            return new C4667g(activity);
        }
        if (i == 4) {
            return new C4663d0(activity, I1);
        }
        if (i != 5) {
            return new C4685y(activity);
        }
        return new C4662d(activity);
    }

    /* renamed from: w5 */
    public final c70 mo7837w5(C4954a aVar, qb0 qb0, int i, a70 a70) {
        Context context = (Context) C4956b.m31384P0(aVar);
        pw1 n = su0.m20616e(context, qb0, i).mo9721n();
        n.mo13414a(context);
        n.mo13415b(a70);
        return n.mo13416e().mo13609b();
    }

    /* renamed from: y1 */
    public final fl0 mo7838y1(C4954a aVar, qb0 qb0, int i) {
        return su0.m20616e((Context) C4956b.m31384P0(aVar), qb0, i).mo9726s();
    }
}
