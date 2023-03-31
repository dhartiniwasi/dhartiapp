package p060h4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.cg0;
import com.google.android.gms.internal.ads.fl0;
import com.google.android.gms.internal.ads.ii0;
import com.google.android.gms.internal.ads.p40;
import com.google.android.gms.internal.ads.pm0;
import com.google.android.gms.internal.ads.q40;
import com.google.android.gms.internal.ads.qb0;
import com.google.android.gms.internal.ads.te0;
import com.google.android.gms.internal.ads.ui0;
import com.google.android.gms.internal.ads.v20;
import com.google.android.gms.internal.ads.xe0;

/* renamed from: h4.r */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C4572r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4535k4 f24987a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4523i4 f24988b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4534k3 f24989c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final p40 f24990d;

    /* renamed from: e */
    private final ui0 f24991e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final xe0 f24992f;

    /* renamed from: g */
    private final q40 f24993g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public cg0 f24994h;

    public C4572r(C4535k4 k4Var, C4523i4 i4Var, C4534k3 k3Var, p40 p40, ui0 ui0, xe0 xe0, q40 q40) {
        this.f24987a = k4Var;
        this.f24988b = i4Var;
        this.f24989c = k3Var;
        this.f24990d = p40;
        this.f24991e = ui0;
        this.f24992f = xe0;
        this.f24993g = q40;
    }

    /* renamed from: p */
    static /* bridge */ /* synthetic */ void m29994p(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C4584t.m30036b().mo11164o(context, C4584t.m30037c().f19150a, "gmob-apps", bundle, true);
    }

    /* renamed from: c */
    public final C4543m0 mo18126c(Context context, String str, qb0 qb0) {
        return (C4543m0) new C4536l(this, context, str, qb0).mo18139d(context, false);
    }

    /* renamed from: d */
    public final C4567q0 mo18127d(Context context, C4571q4 q4Var, String str, qb0 qb0) {
        return (C4567q0) new C4512h(this, context, q4Var, str, qb0).mo18139d(context, false);
    }

    /* renamed from: e */
    public final C4567q0 mo18128e(Context context, C4571q4 q4Var, String str, qb0 qb0) {
        return (C4567q0) new C4524j(this, context, q4Var, str, qb0).mo18139d(context, false);
    }

    /* renamed from: g */
    public final v20 mo18129g(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (v20) new C4560p(this, frameLayout, frameLayout2, context).mo18139d(context, false);
    }

    /* renamed from: i */
    public final te0 mo18130i(Context context, qb0 qb0) {
        return (te0) new C4500f(this, context, qb0).mo18139d(context, false);
    }

    /* renamed from: k */
    public final bf0 mo18131k(Activity activity) {
        C4476b bVar = new C4476b(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            pm0.m18664d("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (bf0) bVar.mo18139d(activity, z);
    }

    /* renamed from: m */
    public final ii0 mo18132m(Context context, String str, qb0 qb0) {
        return (ii0) new C4566q(this, context, str, qb0).mo18139d(context, false);
    }

    /* renamed from: n */
    public final fl0 mo18133n(Context context, qb0 qb0) {
        return (fl0) new C4488d(this, context, qb0).mo18139d(context, false);
    }
}
