package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.C0584d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import p053g4.C4409t;
import p060h4.C4470a;
import p066i4.C4661c0;
import p066i4.C4665e0;
import p066i4.C4669i;
import p073j4.C4751b2;
import p087l4.C4933e;
import p087l4.C4942n;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbxu implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f21732a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4942n f21733b;

    /* renamed from: c */
    private Uri f21734c;

    public final void onDestroy() {
        pm0.m18662b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        pm0.m18662b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        pm0.m18662b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, C4942n nVar, Bundle bundle, C4933e eVar, Bundle bundle2) {
        this.f21733b = nVar;
        if (nVar == null) {
            pm0.m18667g("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            pm0.m18667g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f21733b.mo13760d(this, 0);
        } else if (!m00.m16334g(context)) {
            pm0.m18667g("Default browser does not support custom tabs. Bailing out.");
            this.f21733b.mo13760d(this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                pm0.m18667g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f21733b.mo13760d(this, 0);
                return;
            }
            this.f21732a = (Activity) context;
            this.f21734c = Uri.parse(string);
            this.f21733b.mo13768l(this);
        }
    }

    public final void showInterstitial() {
        C0584d b = new C0584d.C0585a().mo2688b();
        b.f1914a.setData(this.f21734c);
        C4751b2.f25403i.post(new zd0(this, new AdOverlayInfoParcel(new C4669i(b.f1914a, (C4661c0) null), (C4470a) null, new yd0(this), (C4665e0) null, new vm0(0, 0, false, false, false), (vs0) null, (qh1) null)));
        C4409t.m29325q().mo15121o();
    }
}
