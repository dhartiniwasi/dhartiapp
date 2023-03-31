package p066i4;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C2679nz;
import com.google.android.gms.internal.ads.dn0;
import com.google.android.gms.internal.ads.f63;
import com.google.android.gms.internal.ads.f73;
import com.google.android.gms.internal.ads.h63;
import com.google.android.gms.internal.ads.i63;
import com.google.android.gms.internal.ads.j63;
import com.google.android.gms.internal.ads.k63;
import com.google.android.gms.internal.ads.t53;
import com.google.android.gms.internal.ads.u53;
import com.google.android.gms.internal.ads.v53;
import com.google.android.gms.internal.ads.vs0;
import com.google.android.gms.internal.ads.w53;
import java.util.HashMap;
import java.util.Map;
import p053g4.C4409t;
import p060h4.C4596v;
import p073j4.C4794n1;

/* renamed from: i4.b0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C4659b0 {

    /* renamed from: a */
    private String f25189a = null;

    /* renamed from: b */
    private String f25190b = null;

    /* renamed from: c */
    private vs0 f25191c = null;

    /* renamed from: d */
    private v53 f25192d = null;

    /* renamed from: e */
    private boolean f25193e = false;

    /* renamed from: f */
    private i63 f25194f;

    /* renamed from: l */
    private final k63 m30286l() {
        j63 c = k63.m15227c();
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14441T8)).booleanValue() || TextUtils.isEmpty(this.f25190b)) {
            String str = this.f25189a;
            if (str != null) {
                c.mo11333b(str);
            } else {
                mo18337f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c.mo11332a(this.f25190b);
        }
        return c.mo11334c();
    }

    /* renamed from: m */
    private final void m30287m() {
        if (this.f25194f == null) {
            this.f25194f = new C4657a0(this);
        }
    }

    /* renamed from: a */
    public final synchronized void mo18332a(vs0 vs0, Context context) {
        this.f25191c = vs0;
        if (!mo18342k(context)) {
            mo18337f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        mo18336e("on_play_store_bind", hashMap);
    }

    /* renamed from: b */
    public final void mo18333b() {
        v53 v53;
        if (!this.f25193e || (v53 = this.f25192d) == null) {
            C4794n1.m30693k("LastMileDelivery not connected");
            return;
        }
        v53.mo14688d(m30286l(), this.f25194f);
        mo18335d("onLMDOverlayCollapse");
    }

    /* renamed from: c */
    public final void mo18334c() {
        v53 v53;
        if (!this.f25193e || (v53 = this.f25192d) == null) {
            C4794n1.m30693k("LastMileDelivery not connected");
            return;
        }
        t53 c = u53.m21426c();
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14441T8)).booleanValue() || TextUtils.isEmpty(this.f25190b)) {
            String str = this.f25189a;
            if (str != null) {
                c.mo10738b(str);
            } else {
                mo18337f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            c.mo10737a(this.f25190b);
        }
        v53.mo14685a(c.mo10739c(), this.f25194f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo18335d(String str) {
        mo18336e(str, new HashMap());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo18336e(String str, Map map) {
        dn0.f8329e.execute(new C4686z(this, str, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo18337f(String str, String str2) {
        C4794n1.m30693k(str);
        if (this.f25191c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            mo18336e("onError", hashMap);
        }
    }

    /* renamed from: g */
    public final void mo18338g() {
        v53 v53;
        if (!this.f25193e || (v53 = this.f25192d) == null) {
            C4794n1.m30693k("LastMileDelivery not connected");
            return;
        }
        v53.mo14686b(m30286l(), this.f25194f);
        mo18335d("onLMDOverlayExpand");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo18339h(String str, Map map) {
        vs0 vs0 = this.f25191c;
        if (vs0 != null) {
            vs0.mo9081R(str, map);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo18340i(h63 h63) {
        if (!TextUtils.isEmpty(h63.mo10747b())) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14441T8)).booleanValue()) {
                this.f25189a = h63.mo10747b();
            }
        }
        switch (h63.mo10746a()) {
            case 8152:
                mo18335d("onLMDOverlayOpened");
                return;
            case 8153:
                mo18335d("onLMDOverlayClicked");
                return;
            case 8155:
                mo18335d("onLMDOverlayClose");
                return;
            case 8157:
                this.f25189a = null;
                this.f25190b = null;
                this.f25193e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(h63.mo10746a()));
                mo18336e("onLMDOverlayFailedToOpen", hashMap);
                return;
            default:
                return;
        }
    }

    /* renamed from: j */
    public final void mo18341j(vs0 vs0, f63 f63) {
        if (vs0 == null) {
            mo18337f("adWebview missing", "onLMDShow");
            return;
        }
        this.f25191c = vs0;
        if (this.f25193e || mo18342k(vs0.getContext())) {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14441T8)).booleanValue()) {
                this.f25190b = f63.mo10081g();
            }
            m30287m();
            v53 v53 = this.f25192d;
            if (v53 != null) {
                v53.mo14687c(f63, this.f25194f);
                return;
            }
            return;
        }
        mo18337f("LMDOverlay not bound", "on_play_store_bind");
    }

    /* renamed from: k */
    public final synchronized boolean mo18342k(Context context) {
        if (!f73.m12447a(context)) {
            return false;
        }
        try {
            this.f25192d = w53.m22598a(context);
        } catch (NullPointerException e) {
            C4794n1.m30693k("Error connecting LMD Overlay service");
            C4409t.m29325q().mo15126t(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f25192d == null) {
            this.f25193e = false;
            return false;
        }
        m30287m();
        this.f25193e = true;
        return true;
    }
}
