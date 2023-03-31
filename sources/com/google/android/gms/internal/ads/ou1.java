package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.C0576b;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.regex.Pattern;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4541l4;
import p060h4.C4596v;
import p060h4.C4623z2;
import p073j4.C4751b2;
import p115p4.C5315w;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ou1 implements re1, C4470a, qa1, aa1 {

    /* renamed from: a */
    private final Context f15359a;

    /* renamed from: b */
    private final tt2 f15360b;

    /* renamed from: c */
    private final gv1 f15361c;

    /* renamed from: d */
    private final us2 f15362d;

    /* renamed from: e */
    private final is2 f15363e;

    /* renamed from: f */
    private final o42 f15364f;

    /* renamed from: g */
    private Boolean f15365g;

    /* renamed from: h */
    private final boolean f15366h = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14448U5)).booleanValue();

    public ou1(Context context, tt2 tt2, gv1 gv1, us2 us2, is2 is2, o42 o42) {
        this.f15359a = context;
        this.f15360b = tt2;
        this.f15361c = gv1;
        this.f15362d = us2;
        this.f15363e = is2;
        this.f15364f = o42;
    }

    /* renamed from: c */
    private final fv1 m18085c(String str) {
        fv1 a = this.f15361c.mo10653a();
        a.mo10306e(this.f15362d.f18723b.f18244b);
        a.mo10305d(this.f15363e);
        a.mo10303b("action", str);
        boolean z = false;
        if (!this.f15363e.f11004u.isEmpty()) {
            a.mo10303b("ancn", (String) this.f15363e.f11004u.get(0));
        }
        if (this.f15363e.f10989k0) {
            a.mo10303b("device_connectivity", true != C4409t.m29325q().mo15128v(this.f15359a) ? "offline" : C0576b.ONLINE_EXTRAS_KEY);
            a.mo10303b("event_timestamp", String.valueOf(C4409t.m29310b().mo18370a()));
            a.mo10303b("offline_ad", "1");
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14534d6)).booleanValue()) {
            if (C5315w.m32641d(this.f15362d.f18722a.f17091a) != 1) {
                z = true;
            }
            a.mo10303b("scar", String.valueOf(z));
            if (z) {
                C4541l4 l4Var = this.f15362d.f18722a.f17091a.f8933d;
                a.mo10304c("ragent", l4Var.f24904x);
                a.mo10304c("rtype", C5315w.m32638a(C5315w.m32639b(l4Var)));
            }
        }
        return a;
    }

    /* renamed from: e */
    private final void m18086e(fv1 fv1) {
        if (this.f15363e.f10989k0) {
            this.f15364f.mo12822g(new q42(C4409t.m29310b().mo18370a(), this.f15362d.f18723b.f18244b.f12930b, fv1.mo10307f(), 2));
            return;
        }
        fv1.mo10308g();
    }

    /* renamed from: f */
    private final boolean m18087f() {
        if (this.f15365g == null) {
            synchronized (this) {
                if (this.f15365g == null) {
                    String str = (String) C4596v.m30088c().mo12227b(C2679nz.f14619m1);
                    C4409t.m29326r();
                    String L = C4751b2.m30594L(this.f15359a);
                    boolean z = false;
                    if (!(str == null || L == null)) {
                        try {
                            z = Pattern.matches(str, L);
                        } catch (RuntimeException e) {
                            C4409t.m29325q().mo15126t(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f15365g = Boolean.valueOf(z);
                }
            }
        }
        return this.f15365g.booleanValue();
    }

    /* renamed from: Z */
    public final void mo9822Z() {
        if (m18087f() || this.f15363e.f10989k0) {
            m18086e(m18085c(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }

    /* renamed from: a */
    public final void mo13036a() {
        if (m18087f()) {
            m18085c("adapter_impression").mo10308g();
        }
    }

    /* renamed from: b */
    public final void mo13037b() {
        if (m18087f()) {
            m18085c("adapter_shown").mo10308g();
        }
    }

    /* renamed from: d */
    public final void mo8287d() {
        if (this.f15366h) {
            fv1 c = m18085c("ifts");
            c.mo10303b("reason", "blocked");
            c.mo10308g();
        }
    }

    /* renamed from: e0 */
    public final void mo8288e0(tj1 tj1) {
        if (this.f15366h) {
            fv1 c = m18085c("ifts");
            c.mo10303b("reason", "exception");
            if (!TextUtils.isEmpty(tj1.getMessage())) {
                c.mo10303b("msg", tj1.getMessage());
            }
            c.mo10308g();
        }
    }

    /* renamed from: g */
    public final void mo8289g(C4623z2 z2Var) {
        C4623z2 z2Var2;
        if (this.f15366h) {
            fv1 c = m18085c("ifts");
            c.mo10303b("reason", "adapter");
            int i = z2Var.f25062a;
            String str = z2Var.f25063b;
            if (z2Var.f25064c.equals("com.google.android.gms.ads") && (z2Var2 = z2Var.f25065d) != null && !z2Var2.f25064c.equals("com.google.android.gms.ads")) {
                C4623z2 z2Var3 = z2Var.f25065d;
                i = z2Var3.f25062a;
                str = z2Var3.f25063b;
            }
            if (i >= 0) {
                c.mo10303b("arec", String.valueOf(i));
            }
            String a = this.f15360b.mo14382a(str);
            if (a != null) {
                c.mo10303b("areec", a);
            }
            c.mo10308g();
        }
    }

    public final void onAdClicked() {
        if (this.f15363e.f10989k0) {
            m18086e(m18085c("click"));
        }
    }
}
