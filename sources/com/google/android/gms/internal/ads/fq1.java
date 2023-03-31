package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.List;
import p053g4.C4409t;
import p060h4.C4527j2;
import p088l5.C4954a;
import p088l5.C4956b;
import p124r.C5413a;
import p124r.C5426g;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class fq1 extends i30 {

    /* renamed from: a */
    private final Context f9397a;

    /* renamed from: b */
    private final xl1 f9398b;

    /* renamed from: c */
    private ym1 f9399c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public sl1 f9400d;

    public fq1(Context context, xl1 xl1, ym1 ym1, sl1 sl1) {
        this.f9397a = context;
        this.f9398b = xl1;
        this.f9399c = ym1;
        this.f9400d = sl1;
    }

    /* renamed from: A6 */
    public final void mo10246A6(C4954a aVar) {
        sl1 sl1;
        Object P0 = C4956b.m31384P0(aVar);
        if ((P0 instanceof View) && this.f9398b.mo15152c0() != null && (sl1 = this.f9400d) != null) {
            sl1.mo14063j((View) P0);
        }
    }

    /* renamed from: F5 */
    public final String mo10247F5(String str) {
        return (String) this.f9398b.mo15138Q().get(str);
    }

    /* renamed from: J */
    public final void mo10248J(String str) {
        sl1 sl1 = this.f9400d;
        if (sl1 != null) {
            sl1.mo14059T(str);
        }
    }

    /* renamed from: O */
    public final r20 mo10249O(String str) {
        return (r20) this.f9398b.mo15137P().get(str);
    }

    /* renamed from: P */
    public final boolean mo10250P(C4954a aVar) {
        ym1 ym1;
        Object P0 = C4956b.m31384P0(aVar);
        if (!(P0 instanceof ViewGroup) || (ym1 = this.f9399c) == null || !ym1.mo15461f((ViewGroup) P0)) {
            return false;
        }
        this.f9398b.mo15147Z().mo12095U0(new eq1(this));
        return true;
    }

    /* renamed from: T */
    public final o20 mo10251T() throws RemoteException {
        return this.f9400d.mo14045C().mo14533a();
    }

    /* renamed from: U */
    public final C4954a mo10252U() {
        return C4956b.m31385o3(this.f9397a);
    }

    /* renamed from: V */
    public final String mo10253V() {
        return this.f9398b.mo15160g0();
    }

    /* renamed from: X */
    public final List mo10254X() {
        C5426g P = this.f9398b.mo15137P();
        C5426g Q = this.f9398b.mo15138Q();
        String[] strArr = new String[(P.size() + Q.size())];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < P.size()) {
            strArr[i3] = (String) P.mo19668j(i2);
            i2++;
            i3++;
        }
        while (i < Q.size()) {
            strArr[i3] = (String) Q.mo19668j(i);
            i++;
            i3++;
        }
        return Arrays.asList(strArr);
    }

    /* renamed from: Y */
    public final void mo10255Y() {
        sl1 sl1 = this.f9400d;
        if (sl1 != null) {
            sl1.mo14062i();
        }
    }

    /* renamed from: Z */
    public final void mo10256Z() {
        sl1 sl1 = this.f9400d;
        if (sl1 != null) {
            sl1.mo11305a();
        }
        this.f9400d = null;
        this.f9399c = null;
    }

    /* renamed from: a */
    public final C4527j2 mo10257a() {
        return this.f9398b.mo15139R();
    }

    /* renamed from: c0 */
    public final void mo10258c0() {
        String a = this.f9398b.mo15148a();
        if ("Google".equals(a)) {
            pm0.m18667g("Illegal argument specified for omid partner name.");
        } else if (TextUtils.isEmpty(a)) {
            pm0.m18667g("Not starting OMID session. OM partner name has not been configured.");
        } else {
            sl1 sl1 = this.f9400d;
            if (sl1 != null) {
                sl1.mo14051L(a, false);
            }
        }
    }

    /* renamed from: d0 */
    public final boolean mo10259d0() {
        C4954a c0 = this.f9398b.mo15152c0();
        if (c0 != null) {
            C4409t.m29309a().mo15326D(c0);
            if (this.f9398b.mo15146Y() == null) {
                return true;
            }
            this.f9398b.mo15146Y().mo9081R("onSdkLoaded", new C5413a());
            return true;
        }
        pm0.m18667g("Trying to start OMID session before creation.");
        return false;
    }

    /* renamed from: h */
    public final boolean mo10260h() {
        sl1 sl1 = this.f9400d;
        if ((sl1 == null || sl1.mo14075v()) && this.f9398b.mo15146Y() != null && this.f9398b.mo15147Z() == null) {
            return true;
        }
        return false;
    }
}
