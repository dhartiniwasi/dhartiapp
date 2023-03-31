package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import p053g4.C4409t;
import p060h4.C4503f2;
import p060h4.C4595u4;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class o91 extends C4503f2 {

    /* renamed from: a */
    private final String f14997a;

    /* renamed from: b */
    private final String f14998b;

    /* renamed from: c */
    private final String f14999c;

    /* renamed from: d */
    private final String f15000d;

    /* renamed from: e */
    private final List f15001e;

    /* renamed from: f */
    private final long f15002f;

    /* renamed from: g */
    private final String f15003g;

    /* renamed from: h */
    private final i52 f15004h;

    /* renamed from: i */
    private final Bundle f15005i;

    public o91(is2 is2, String str, i52 i52, ls2 ls2, String str2) {
        String str3;
        String str4;
        String str5 = null;
        if (is2 == null) {
            str3 = null;
        } else {
            str3 = is2.f10973c0;
        }
        this.f14998b = str3;
        this.f14999c = str2;
        if (ls2 == null) {
            str4 = null;
        } else {
            str4 = ls2.f12930b;
        }
        this.f15000d = str4;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str5 = is2.f11006w.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f14997a = str5 != null ? str5 : str;
        this.f15001e = i52.mo11021c();
        this.f15004h = i52;
        this.f15002f = C4409t.m29310b().mo18370a() / 1000;
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14438T5)).booleanValue() || ls2 == null) {
            this.f15005i = new Bundle();
        } else {
            this.f15005i = ls2.f12938j;
        }
        this.f15003g = (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14460V7)).booleanValue() || ls2 == null || TextUtils.isEmpty(ls2.f12936h)) ? "" : ls2.f12936h;
    }

    /* renamed from: T */
    public final C4595u4 mo12860T() {
        i52 i52 = this.f15004h;
        if (i52 != null) {
            return i52.mo11019a();
        }
        return null;
    }

    /* renamed from: U */
    public final String mo12861U() {
        return this.f14999c;
    }

    /* renamed from: V */
    public final String mo12862V() {
        return this.f14998b;
    }

    /* renamed from: W */
    public final List mo12863W() {
        return this.f15001e;
    }

    /* renamed from: X */
    public final String mo12864X() {
        return this.f15000d;
    }

    /* renamed from: a */
    public final Bundle mo12865a() {
        return this.f15005i;
    }

    /* renamed from: b */
    public final String mo12866b() {
        return this.f15003g;
    }

    /* renamed from: c */
    public final String mo12867c() {
        return this.f14997a;
    }

    /* renamed from: e */
    public final long mo12868e() {
        return this.f15002f;
    }
}
