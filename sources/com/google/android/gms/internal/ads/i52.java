package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import p060h4.C4595u4;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class i52 {

    /* renamed from: a */
    private final List f10619a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private final Map f10620b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private final String f10621c;

    /* renamed from: d */
    private ls2 f10622d = null;

    /* renamed from: e */
    private is2 f10623e = null;

    /* renamed from: f */
    private C4595u4 f10624f = null;

    public i52(String str) {
        this.f10621c = str;
    }

    /* renamed from: h */
    private final void m14163h(is2 is2, long j, C4623z2 z2Var, boolean z) {
        String str = is2.f11007x;
        if (this.f10620b.containsKey(str)) {
            if (this.f10623e == null) {
                this.f10623e = is2;
            }
            C4595u4 u4Var = (C4595u4) this.f10620b.get(str);
            u4Var.f25034b = j;
            u4Var.f25035c = z2Var;
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14428S5)).booleanValue() && z) {
                this.f10624f = u4Var;
            }
        }
    }

    /* renamed from: a */
    public final C4595u4 mo11019a() {
        return this.f10624f;
    }

    /* renamed from: b */
    public final o91 mo11020b() {
        return new o91(this.f10623e, "", this, this.f10622d, this.f10621c);
    }

    /* renamed from: c */
    public final List mo11021c() {
        return this.f10619a;
    }

    /* renamed from: d */
    public final void mo11022d(is2 is2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = is2.f11007x;
        if (!this.f10620b.containsKey(str5)) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = is2.f11006w.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    bundle.putString(next, is2.f11006w.getString(next));
                } catch (JSONException unused) {
                }
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14418R5)).booleanValue()) {
                String str6 = is2.f10948G;
                String str7 = is2.f10949H;
                str4 = str6;
                str3 = str7;
                str2 = is2.f10950I;
                str = is2.f10951J;
            } else {
                str4 = "";
                str3 = str4;
                str2 = str3;
                str = str2;
            }
            C4595u4 u4Var = new C4595u4(is2.f10947F, 0, (C4623z2) null, bundle, str4, str3, str2, str);
            this.f10619a.add(u4Var);
            this.f10620b.put(str5, u4Var);
        }
    }

    /* renamed from: e */
    public final void mo11023e(is2 is2, long j, C4623z2 z2Var) {
        m14163h(is2, j, z2Var, false);
    }

    /* renamed from: f */
    public final void mo11024f(is2 is2, long j, C4623z2 z2Var) {
        m14163h(is2, j, (C4623z2) null, true);
    }

    /* renamed from: g */
    public final void mo11025g(ls2 ls2) {
        this.f10622d = ls2;
    }
}
