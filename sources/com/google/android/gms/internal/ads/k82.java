package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p060h4.C4541l4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class k82 implements d52 {
    /* renamed from: d */
    private static Bundle m15282d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        return !TextUtils.isEmpty(is2.f11006w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        is2 is22 = is2;
        String optString = is22.f11006w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        et2 et2 = us2.f18722a.f17091a;
        ct2 ct2 = new ct2();
        ct2.mo9325G(et2);
        ct2.mo9328J(optString);
        Bundle d = m15282d(et2.f8933d.f24901u);
        Bundle d2 = m15282d(d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d2.putInt("gw", 1);
        String optString2 = is22.f11006w.optString("mad_hac", (String) null);
        if (optString2 != null) {
            d2.putString("mad_hac", optString2);
        }
        String optString3 = is22.f11006w.optString("adJson", (String) null);
        if (optString3 != null) {
            d2.putString("_ad", optString3);
        }
        d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = is22.f10946E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = is22.f10946E.optString(next, (String) null);
            if (next != null) {
                d2.putString(next, optString4);
            }
        }
        d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d2);
        C4541l4 l4Var = et2.f8933d;
        C4541l4 l4Var2 = r5;
        C4541l4 l4Var3 = new C4541l4(l4Var.f24889a, l4Var.f24890b, d2, l4Var.f24892d, l4Var.f24893e, l4Var.f24894f, l4Var.f24895g, l4Var.f24896h, l4Var.f24897i, l4Var.f24898r, l4Var.f24899s, l4Var.f24900t, d, l4Var.f24902v, l4Var.f24903w, l4Var.f24904x, l4Var.f24905y, l4Var.f24906z, l4Var.f24883A, l4Var.f24884B, l4Var.f24885C, l4Var.f24886D, l4Var.f24887E, l4Var.f24888F);
        ct2.mo9340e(l4Var2);
        et2 g = ct2.mo9342g();
        Bundle bundle = new Bundle();
        us2 us22 = us2;
        ls2 ls2 = us22.f18723b.f18244b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(ls2.f12929a));
        bundle2.putInt("refresh_interval", ls2.f12931c);
        bundle2.putString("gws_query_id", ls2.f12930b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = us22.f18722a.f17091a.f8935f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        is2 is23 = is2;
        bundle3.putString("allocation_id", is23.f11007x);
        bundle3.putStringArrayList("click_urls", new ArrayList(is23.f10972c));
        bundle3.putStringArrayList("imp_urls", new ArrayList(is23.f10974d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(is23.f11000q));
        bundle3.putStringArrayList("fill_urls", new ArrayList(is23.f10994n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(is23.f10982h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(is23.f10984i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(is23.f10986j));
        bundle3.putString("transaction_id", is23.f10988k);
        bundle3.putString("valid_from_timestamp", is23.f10990l);
        bundle3.putBoolean("is_closable_area_disabled", is23.f10958Q);
        if (is23.f10992m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", is23.f10992m.f7278b);
            bundle4.putString("rb_type", is23.f10992m.f7277a);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo11055c(g, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract lf3 mo11055c(et2 et2, Bundle bundle);
}
