package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tx2 {

    /* renamed from: a */
    private final HashMap f18287a;

    /* renamed from: b */
    private final zx2 f18288b = new zx2(C4409t.m29310b());

    private tx2() {
        HashMap hashMap = new HashMap();
        this.f18287a = hashMap;
        hashMap.put("new_csi", "1");
    }

    /* renamed from: b */
    public static tx2 m21328b(String str) {
        tx2 tx2 = new tx2();
        tx2.f18287a.put("action", str);
        return tx2;
    }

    /* renamed from: c */
    public static tx2 m21329c(String str) {
        tx2 tx2 = new tx2();
        tx2.f18287a.put("request_id", str);
        return tx2;
    }

    /* renamed from: a */
    public final tx2 mo14409a(String str, String str2) {
        this.f18287a.put(str, str2);
        return this;
    }

    /* renamed from: d */
    public final tx2 mo14410d(String str) {
        this.f18288b.mo15675b(str);
        return this;
    }

    /* renamed from: e */
    public final tx2 mo14411e(String str, String str2) {
        this.f18288b.mo15676c(str, str2);
        return this;
    }

    /* renamed from: f */
    public final tx2 mo14412f(is2 is2) {
        this.f18287a.put("aai", is2.f11007x);
        return this;
    }

    /* renamed from: g */
    public final tx2 mo14413g(ls2 ls2) {
        if (!TextUtils.isEmpty(ls2.f12930b)) {
            this.f18287a.put("gqi", ls2.f12930b);
        }
        return this;
    }

    /* renamed from: h */
    public final tx2 mo14414h(us2 us2, cm0 cm0) {
        ts2 ts2 = us2.f18723b;
        mo14413g(ts2.f18244b);
        if (!ts2.f18243a.isEmpty()) {
            switch (((is2) ts2.f18243a.get(0)).f10970b) {
                case 1:
                    this.f18287a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f18287a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f18287a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f18287a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f18287a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f18287a.put("ad_format", "app_open_ad");
                    if (cm0 != null) {
                        this.f18287a.put("as", true != cm0.mo9221j() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.f18287a.put("ad_format", "unknown");
                    break;
            }
        }
        return this;
    }

    /* renamed from: i */
    public final tx2 mo14415i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f18287a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f18287a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* renamed from: j */
    public final Map mo14416j() {
        HashMap hashMap = new HashMap(this.f18287a);
        for (yx2 yx2 : this.f18288b.mo15674a()) {
            hashMap.put(yx2.f20839a, yx2.f20840b);
        }
        return hashMap;
    }
}
