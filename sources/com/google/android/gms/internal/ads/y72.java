package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p060h4.C4596v;
import p067i5.C4699m;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class y72 implements s72 {

    /* renamed from: a */
    private final jk1 f20508a;

    /* renamed from: b */
    private final mf3 f20509b;

    /* renamed from: c */
    private final no1 f20510c;

    /* renamed from: d */
    private final bu2 f20511d;

    /* renamed from: e */
    private final fr1 f20512e;

    public y72(jk1 jk1, mf3 mf3, no1 no1, bu2 bu2, fr1 fr1) {
        this.f20508a = jk1;
        this.f20509b = mf3;
        this.f20510c = no1;
        this.f20511d = bu2;
        this.f20512e = fr1;
    }

    /* renamed from: g */
    private final lf3 m23791g(us2 us2, is2 is2, JSONObject jSONObject) {
        lf3 a = this.f20511d.mo8946a();
        lf3 a2 = this.f20510c.mo12681a(us2, is2, jSONObject);
        return cf3.m10906d(a, a2).mo8777a(new t72(this, a2, a, us2, is2, jSONObject), this.f20509b);
    }

    /* renamed from: a */
    public final boolean mo9436a(us2 us2, is2 is2) {
        ns2 ns2 = is2.f11003t;
        return (ns2 == null || ns2.f14185c == null) ? false : true;
    }

    /* renamed from: b */
    public final lf3 mo9437b(us2 us2, is2 is2) {
        return cf3.m10916n(cf3.m10916n(this.f20511d.mo8946a(), new v72(this, is2), this.f20509b), new w72(this, us2, is2), this.f20509b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ sl1 mo15335c(lf3 lf3, lf3 lf32, us2 us2, is2 is2, JSONObject jSONObject) throws Exception {
        xl1 xl1 = (xl1) lf3.get();
        zq1 zq1 = (zq1) lf32.get();
        yl1 c = this.f20508a.mo11418c(new k61(us2, is2, (String) null), new km1(xl1), new yk1(jSONObject, zq1));
        c.mo12212j().mo11478b();
        c.mo12213k().mo14806a(zq1);
        c.mo12211i().mo14115a(xl1.mo15147Z());
        c.mo12214l().mo10000a(this.f20512e);
        return c.mo8435h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ lf3 mo15336d(zq1 zq1, JSONObject jSONObject) throws Exception {
        this.f20511d.mo8947b(cf3.m10911i(zq1));
        if (jSONObject.optBoolean("success")) {
            return cf3.m10911i(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new da0("process json failed");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ lf3 mo15337e(is2 is2, zq1 zq1) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14655p7)).booleanValue() && C4699m.m30421l()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", is2.f11003t.f14185c);
        jSONObject2.put("sdk_params", jSONObject);
        return cf3.m10916n(zq1.mo15642d("google.afma.nativeAds.preProcessJson", jSONObject2), new u72(this, zq1), this.f20509b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ lf3 mo15338f(us2 us2, is2 is2, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return cf3.m10910h(new cz1(3));
        }
        if (us2.f18722a.f17091a.f8940k <= 1) {
            return cf3.m10915m(m23791g(us2, is2, jSONArray.getJSONObject(0)), x72.f20022a, this.f20509b);
        }
        int length = jSONArray.length();
        this.f20511d.mo8948c(Math.min(length, us2.f18722a.f17091a.f8940k));
        ArrayList arrayList = new ArrayList(us2.f18722a.f17091a.f8940k);
        for (int i = 0; i < us2.f18722a.f17091a.f8940k; i++) {
            if (i < length) {
                arrayList.add(m23791g(us2, is2, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(cf3.m10910h(new cz1(3)));
            }
        }
        return cf3.m10911i(arrayList);
    }
}
