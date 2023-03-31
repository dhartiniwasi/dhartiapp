package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p060h4.C4596v;
import p115p4.C5315w;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class bv1 {

    /* renamed from: a */
    private final ConcurrentHashMap f7467a;

    /* renamed from: b */
    private final cm0 f7468b;

    /* renamed from: c */
    private final et2 f7469c;

    /* renamed from: d */
    private final String f7470d;

    /* renamed from: e */
    private final String f7471e;

    public bv1(lv1 lv1, cm0 cm0, et2 et2, String str, String str2) {
        ConcurrentHashMap c = lv1.mo12715c();
        this.f7467a = c;
        this.f7468b = cm0;
        this.f7469c = et2;
        this.f7470d = str;
        this.f7471e = str2;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14534d6)).booleanValue()) {
            int d = C5315w.m32641d(et2);
            int i = d - 1;
            if (i != 0) {
                if (i == 1) {
                    c.put("se", "query_g");
                } else if (i == 2) {
                    c.put("se", "r_adinfo");
                } else if (i != 3) {
                    c.put("se", "r_both");
                } else {
                    c.put("se", "r_adstring");
                }
                c.put("scar", "true");
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14289E6)).booleanValue()) {
                    c.put("ad_format", str2);
                }
                if (d == 2) {
                    c.put("rid", str);
                }
                m10589d("ragent", et2.f8933d.f24904x);
                m10589d("rtype", C5315w.m32638a(C5315w.m32639b(et2.f8933d)));
                return;
            }
            c.put("scar", "false");
        }
    }

    /* renamed from: d */
    private final void m10589d(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f7467a.put(str, str2);
        }
    }

    /* renamed from: a */
    public final Map mo8951a() {
        return this.f7467a;
    }

    /* renamed from: b */
    public final void mo8952b(us2 us2) {
        if (us2.f18723b.f18243a.size() > 0) {
            switch (((is2) us2.f18723b.f18243a.get(0)).f10970b) {
                case 1:
                    this.f7467a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f7467a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f7467a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f7467a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f7467a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f7467a.put("ad_format", "app_open_ad");
                    this.f7467a.put("as", true != this.f7468b.mo9221j() ? "0" : "1");
                    break;
                default:
                    this.f7467a.put("ad_format", "unknown");
                    break;
            }
        }
        m10589d("gqi", us2.f18723b.f18244b.f12930b);
    }

    /* renamed from: c */
    public final void mo8953c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f7467a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f7467a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
