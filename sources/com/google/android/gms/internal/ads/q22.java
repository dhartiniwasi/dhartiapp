package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.C0576b;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.regex.Pattern;
import p053g4.C4409t;
import p060h4.C4470a;
import p060h4.C4596v;
import p060h4.C4623z2;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class q22 implements re1, C4470a, qa1, aa1 {

    /* renamed from: a */
    private final Context f16149a;

    /* renamed from: b */
    private final tt2 f16150b;

    /* renamed from: c */
    private final us2 f16151c;

    /* renamed from: d */
    private final is2 f16152d;

    /* renamed from: e */
    private final o42 f16153e;

    /* renamed from: f */
    private Boolean f16154f;

    /* renamed from: g */
    private final boolean f16155g = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14448U5)).booleanValue();

    /* renamed from: h */
    private final ux2 f16156h;

    /* renamed from: i */
    private final String f16157i;

    public q22(Context context, tt2 tt2, us2 us2, is2 is2, o42 o42, ux2 ux2, String str) {
        this.f16149a = context;
        this.f16150b = tt2;
        this.f16151c = us2;
        this.f16152d = is2;
        this.f16153e = o42;
        this.f16156h = ux2;
        this.f16157i = str;
    }

    /* renamed from: c */
    private final tx2 m19036c(String str) {
        tx2 b = tx2.m21328b(str);
        b.mo14414h(this.f16151c, (cm0) null);
        b.mo14412f(this.f16152d);
        b.mo14409a("request_id", this.f16157i);
        if (!this.f16152d.f11004u.isEmpty()) {
            b.mo14409a("ancn", (String) this.f16152d.f11004u.get(0));
        }
        if (this.f16152d.f10989k0) {
            b.mo14409a("device_connectivity", true != C4409t.m29325q().mo15128v(this.f16149a) ? "offline" : C0576b.ONLINE_EXTRAS_KEY);
            b.mo14409a("event_timestamp", String.valueOf(C4409t.m29310b().mo18370a()));
            b.mo14409a("offline_ad", "1");
        }
        return b;
    }

    /* renamed from: e */
    private final void m19037e(tx2 tx2) {
        if (this.f16152d.f10989k0) {
            this.f16153e.mo12822g(new q42(C4409t.m29310b().mo18370a(), this.f16151c.f18723b.f18244b.f12930b, this.f16156h.mo8623b(tx2), 2));
            return;
        }
        this.f16156h.mo8622a(tx2);
    }

    /* renamed from: f */
    private final boolean m19038f() {
        if (this.f16154f == null) {
            synchronized (this) {
                if (this.f16154f == null) {
                    String str = (String) C4596v.m30088c().mo12227b(C2679nz.f14619m1);
                    C4409t.m29326r();
                    String L = C4751b2.m30594L(this.f16149a);
                    boolean z = false;
                    if (!(str == null || L == null)) {
                        try {
                            z = Pattern.matches(str, L);
                        } catch (RuntimeException e) {
                            C4409t.m29325q().mo15126t(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f16154f = Boolean.valueOf(z);
                }
            }
        }
        return this.f16154f.booleanValue();
    }

    /* renamed from: Z */
    public final void mo9822Z() {
        if (m19038f() || this.f16152d.f10989k0) {
            m19037e(m19036c(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }

    /* renamed from: a */
    public final void mo13036a() {
        if (m19038f()) {
            this.f16156h.mo8622a(m19036c("adapter_impression"));
        }
    }

    /* renamed from: b */
    public final void mo13037b() {
        if (m19038f()) {
            this.f16156h.mo8622a(m19036c("adapter_shown"));
        }
    }

    /* renamed from: d */
    public final void mo8287d() {
        if (this.f16155g) {
            ux2 ux2 = this.f16156h;
            tx2 c = m19036c("ifts");
            c.mo14409a("reason", "blocked");
            ux2.mo8622a(c);
        }
    }

    /* renamed from: e0 */
    public final void mo8288e0(tj1 tj1) {
        if (this.f16155g) {
            tx2 c = m19036c("ifts");
            c.mo14409a("reason", "exception");
            if (!TextUtils.isEmpty(tj1.getMessage())) {
                c.mo14409a("msg", tj1.getMessage());
            }
            this.f16156h.mo8622a(c);
        }
    }

    /* renamed from: g */
    public final void mo8289g(C4623z2 z2Var) {
        C4623z2 z2Var2;
        if (this.f16155g) {
            int i = z2Var.f25062a;
            String str = z2Var.f25063b;
            if (z2Var.f25064c.equals("com.google.android.gms.ads") && (z2Var2 = z2Var.f25065d) != null && !z2Var2.f25064c.equals("com.google.android.gms.ads")) {
                C4623z2 z2Var3 = z2Var.f25065d;
                i = z2Var3.f25062a;
                str = z2Var3.f25063b;
            }
            String a = this.f16150b.mo14382a(str);
            tx2 c = m19036c("ifts");
            c.mo14409a("reason", "adapter");
            if (i >= 0) {
                c.mo14409a("arec", String.valueOf(i));
            }
            if (a != null) {
                c.mo14409a("areec", a);
            }
            this.f16156h.mo8622a(c);
        }
    }

    public final void onAdClicked() {
        if (this.f16152d.f10989k0) {
            m19037e(m19036c("click"));
        }
    }
}
