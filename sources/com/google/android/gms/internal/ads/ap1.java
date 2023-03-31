package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p053g4.C4390a;
import p053g4.C4391b;
import p053g4.C4401l;
import p053g4.C4409t;
import p060h4.C4504f3;
import p060h4.C4571q4;
import p060h4.C4596v;
import p073j4.C4820w0;
import p179z3.C6337h;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ap1 {

    /* renamed from: a */
    private final Context f6700a;

    /* renamed from: b */
    private final io1 f6701b;

    /* renamed from: c */
    private final C2955ve f6702c;

    /* renamed from: d */
    private final vm0 f6703d;

    /* renamed from: e */
    private final C4390a f6704e;

    /* renamed from: f */
    private final C2971vu f6705f;

    /* renamed from: g */
    private final Executor f6706g;

    /* renamed from: h */
    private final f20 f6707h;

    /* renamed from: i */
    private final tp1 f6708i;

    /* renamed from: j */
    private final ls1 f6709j;

    /* renamed from: k */
    private final ScheduledExecutorService f6710k;

    /* renamed from: l */
    private final fr1 f6711l;

    /* renamed from: m */
    private final gv1 f6712m;

    /* renamed from: n */
    private final ux2 f6713n;

    /* renamed from: o */
    private final rz2 f6714o;

    /* renamed from: p */
    private final o42 f6715p;

    public ap1(Context context, io1 io1, C2955ve veVar, vm0 vm0, C4390a aVar, C2971vu vuVar, Executor executor, et2 et2, tp1 tp1, ls1 ls1, ScheduledExecutorService scheduledExecutorService, gv1 gv1, ux2 ux2, rz2 rz2, o42 o42, fr1 fr1) {
        this.f6700a = context;
        this.f6701b = io1;
        this.f6702c = veVar;
        this.f6703d = vm0;
        this.f6704e = aVar;
        this.f6705f = vuVar;
        this.f6706g = executor;
        this.f6707h = et2.f8938i;
        this.f6708i = tp1;
        this.f6709j = ls1;
        this.f6710k = scheduledExecutorService;
        this.f6712m = gv1;
        this.f6713n = ux2;
        this.f6714o = rz2;
        this.f6715p = o42;
        this.f6711l = fr1;
    }

    /* renamed from: i */
    public static final C4504f3 m9897i(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return m9906r(optJSONObject);
    }

    /* renamed from: j */
    public static final List m9898j(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return ua3.m21508w();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return ua3.m21508w();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C4504f3 r = m9906r(optJSONArray.optJSONObject(i));
            if (r != null) {
                arrayList.add(r);
            }
        }
        return ua3.m21506u(arrayList);
    }

    /* renamed from: k */
    private final C4571q4 m9899k(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return C4571q4.m29983K1();
            }
            i = 0;
        }
        return new C4571q4(this.f6700a, new C6337h(i, i2));
    }

    /* renamed from: l */
    private static lf3 m9900l(lf3 lf3, Object obj) {
        return cf3.m10909g(lf3, Exception.class, new xo1((Object) null), dn0.f8330f);
    }

    /* renamed from: m */
    private static lf3 m9901m(boolean z, lf3 lf3, Object obj) {
        if (z) {
            return cf3.m10916n(lf3, new vo1(lf3), dn0.f8330f);
        }
        return m9900l(lf3, (Object) null);
    }

    /* renamed from: n */
    private final lf3 m9902n(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return cf3.m10911i((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return cf3.m10911i((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return cf3.m10911i(new d20((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return m9901m(jSONObject.optBoolean("require"), cf3.m10915m(this.f6701b.mo11182b(optString, optDouble, optBoolean), new yo1(optString, optDouble, optInt, optInt2), this.f6706g), (Object) null);
    }

    /* renamed from: o */
    private final lf3 m9903o(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return cf3.m10911i(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m9902n(jSONArray.optJSONObject(i), z));
        }
        return cf3.m10915m(cf3.m10907e(arrayList), wo1.f19731a, this.f6706g);
    }

    /* renamed from: p */
    private final lf3 m9904p(JSONObject jSONObject, is2 is2, ls2 ls2) {
        lf3 b = this.f6708i.mo14359b(jSONObject.optString("base_url"), jSONObject.optString("html"), is2, ls2, m9899k(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return cf3.m10916n(b, new zo1(b), dn0.f8330f);
    }

    /* renamed from: q */
    private static Integer m9905q(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: r */
    private static final C4504f3 m9906r(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new C4504f3(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ a20 mo8478a(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer q = m9905q(jSONObject, "bg_color");
        Integer q2 = m9905q(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", AdError.NETWORK_ERROR_CODE);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new a20(optString, list, q, q2, num, optInt3 + optInt2, this.f6707h.f9091e, optBoolean);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ lf3 mo8479b(C4571q4 q4Var, is2 is2, ls2 ls2, String str, String str2, Object obj) throws Exception {
        vs0 a = this.f6709j.mo12076a(q4Var, is2, ls2);
        hn0 f = hn0.m13926f(a);
        cr1 b = this.f6711l.mo10266b();
        cr1 cr1 = b;
        ku0 f0 = a.mo12108f0();
        C4391b bVar = r3;
        C4391b bVar2 = new C4391b(this.f6700a, (nj0) null, (lg0) null);
        f0.mo9308g0(b, cr1, b, b, b, false, (h60) null, bVar, (me0) null, (nj0) null, this.f6715p, this.f6714o, this.f6712m, this.f6713n, (f60) null, b, (x60) null, (r60) null);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14435T2)).booleanValue()) {
            a.mo12105d1("/getNativeAdViewSignals", d60.f8096s);
        }
        a.mo12105d1("/getNativeClickMeta", d60.f8097t);
        a.mo12108f0().mo9283G(new uo1(f));
        a.mo12115i1(str, str2, (String) null);
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo8480c(String str, Object obj) throws Exception {
        C4409t.m29308B();
        vs0 a = it0.m14546a(this.f6700a, mu0.m16708a(), "native-omid", false, false, this.f6702c, (n00) null, this.f6703d, (c00) null, (C4401l) null, this.f6704e, this.f6705f, (is2) null, (ls2) null);
        hn0 f = hn0.m13926f(a);
        a.mo12108f0().mo9283G(new qo1(f));
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14592j4)).booleanValue()) {
            a.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            a.loadData(str, "text/html", "UTF-8");
        }
        return f;
    }

    /* renamed from: d */
    public final lf3 mo8481d(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return cf3.m10911i((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return m9901m(optJSONObject.optBoolean("require"), cf3.m10915m(m9903o(optJSONArray, false, true), new ro1(this, optJSONObject), this.f6706g), (Object) null);
    }

    /* renamed from: e */
    public final lf3 mo8482e(JSONObject jSONObject, String str) {
        return m9902n(jSONObject.optJSONObject(str), this.f6707h.f9088b);
    }

    /* renamed from: f */
    public final lf3 mo8483f(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        f20 f20 = this.f6707h;
        return m9903o(optJSONArray, f20.f9088b, f20.f9090d);
    }

    /* renamed from: g */
    public final lf3 mo8484g(JSONObject jSONObject, String str, is2 is2, ls2 ls2) {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14606k8)).booleanValue()) {
            return cf3.m10911i((Object) null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return cf3.m10911i((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return cf3.m10911i((Object) null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        C4571q4 k = m9899k(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return cf3.m10911i((Object) null);
        }
        lf3 n = cf3.m10916n(cf3.m10911i((Object) null), new so1(this, k, is2, ls2, optString, optString2), dn0.f8329e);
        return cf3.m10916n(n, new to1(n), dn0.f8330f);
    }

    /* renamed from: h */
    public final lf3 mo8485h(JSONObject jSONObject, is2 is2, ls2 ls2) {
        lf3 lf3;
        JSONObject g = C4820w0.m30817g(jSONObject, "html_containers", "instream");
        if (g != null) {
            return m9904p(g, is2, ls2);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return cf3.m10911i((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14596j8)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                pm0.m18667g("Required field 'vast_xml' or 'html' is missing");
                return cf3.m10911i((Object) null);
            }
        } else if (!z) {
            lf3 = this.f6708i.mo14358a(optJSONObject);
            return m9900l(cf3.m10917o(lf3, (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14445U2)).intValue(), TimeUnit.SECONDS, this.f6710k), (Object) null);
        }
        lf3 = m9904p(optJSONObject, is2, ls2);
        return m9900l(cf3.m10917o(lf3, (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14445U2)).intValue(), TimeUnit.SECONDS, this.f6710k), (Object) null);
    }
}
