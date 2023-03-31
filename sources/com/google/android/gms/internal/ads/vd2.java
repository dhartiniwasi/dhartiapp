package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p033d5.C4141r;
import p060h4.C4541l4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vd2 implements sj2 {

    /* renamed from: a */
    final et2 f19071a;

    /* renamed from: b */
    private final long f19072b;

    public vd2(et2 et2, long j) {
        C4141r.m28222l(et2, "the targeting must not be null");
        this.f19071a = et2;
        this.f19072b = j;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Bundle bundle = (Bundle) obj;
        C4541l4 l4Var = this.f19071a.f8933d;
        bundle.putInt("http_timeout_millis", l4Var.f24887E);
        bundle.putString("slotname", this.f19071a.f8935f);
        int i = this.f19071a.f8944o.f16514a;
        int i2 = i - 1;
        if (i != 0) {
            boolean z = true;
            if (i2 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i2 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.f19072b);
            pt2.m18898f(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(l4Var.f24890b)), l4Var.f24890b != -1);
            pt2.m18894b(bundle, "extras", l4Var.f24891c);
            int i3 = l4Var.f24892d;
            pt2.m18897e(bundle, "cust_gender", i3, i3 != -1);
            pt2.m18896d(bundle, "kw", l4Var.f24893e);
            int i4 = l4Var.f24895g;
            pt2.m18897e(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
            if (l4Var.f24894f) {
                bundle.putBoolean("test_request", true);
            }
            pt2.m18897e(bundle, "d_imp_hdr", 1, l4Var.f24889a >= 2 && l4Var.f24896h);
            String str = l4Var.f24897i;
            pt2.m18898f(bundle, "ppid", str, l4Var.f24889a >= 2 && !TextUtils.isEmpty(str));
            Location location = l4Var.f24899s;
            if (location != null) {
                float accuracy = location.getAccuracy();
                long time = location.getTime();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", accuracy * 1000.0f);
                bundle2.putLong("lat", (long) (latitude * 1.0E7d));
                bundle2.putLong("long", (long) (longitude * 1.0E7d));
                bundle2.putLong("time", time * 1000);
                bundle.putBundle("uule", bundle2);
            }
            pt2.m18895c(bundle, "url", l4Var.f24900t);
            pt2.m18896d(bundle, "neighboring_content_urls", l4Var.f24886D);
            pt2.m18894b(bundle, "custom_targeting", l4Var.f24902v);
            pt2.m18896d(bundle, "category_exclusions", l4Var.f24903w);
            pt2.m18895c(bundle, "request_agent", l4Var.f24904x);
            pt2.m18895c(bundle, "request_pkg", l4Var.f24905y);
            pt2.m18899g(bundle, "is_designed_for_families", l4Var.f24906z, l4Var.f24889a >= 7);
            if (l4Var.f24889a >= 8) {
                int i5 = l4Var.f24884B;
                if (i5 == -1) {
                    z = false;
                }
                pt2.m18897e(bundle, "tag_for_under_age_of_consent", i5, z);
                pt2.m18895c(bundle, "max_ad_content_rating", l4Var.f24885C);
                return;
            }
            return;
        }
        throw null;
    }
}
