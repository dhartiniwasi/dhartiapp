package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p033d5.C4141r;
import p053g4.C4409t;
import p060h4.C4562p1;
import p060h4.C4580s1;
import p060h4.C4584t;
import p060h4.C4596v;
import p067i5.C4691e;
import p067i5.C4699m;
import p073j4.C4751b2;
import p073j4.C4829z0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wk1 implements fm1 {

    /* renamed from: A */
    private C4562p1 f19663A;

    /* renamed from: a */
    private final Context f19664a;

    /* renamed from: b */
    private final jm1 f19665b;

    /* renamed from: c */
    private final JSONObject f19666c;

    /* renamed from: d */
    private final zq1 f19667d;

    /* renamed from: e */
    private final xl1 f19668e;

    /* renamed from: f */
    private final C2955ve f19669f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final oa1 f19670g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final t91 f19671h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final oh1 f19672i;

    /* renamed from: j */
    private final is2 f19673j;

    /* renamed from: k */
    private final vm0 f19674k;

    /* renamed from: l */
    private final et2 f19675l;

    /* renamed from: m */
    private final x11 f19676m;

    /* renamed from: n */
    private final bn1 f19677n;

    /* renamed from: o */
    private final C4691e f19678o;

    /* renamed from: p */
    private final lh1 f19679p;

    /* renamed from: q */
    private final rz2 f19680q;

    /* renamed from: r */
    private final yy2 f19681r;

    /* renamed from: s */
    private boolean f19682s = false;

    /* renamed from: t */
    private boolean f19683t;

    /* renamed from: u */
    private boolean f19684u = false;

    /* renamed from: v */
    private boolean f19685v = false;

    /* renamed from: w */
    private Point f19686w = new Point();

    /* renamed from: x */
    private Point f19687x = new Point();

    /* renamed from: y */
    private long f19688y = 0;

    /* renamed from: z */
    private long f19689z = 0;

    public wk1(Context context, jm1 jm1, JSONObject jSONObject, zq1 zq1, xl1 xl1, C2955ve veVar, oa1 oa1, t91 t91, oh1 oh1, is2 is2, vm0 vm0, et2 et2, x11 x11, bn1 bn1, C4691e eVar, lh1 lh1, rz2 rz2, yy2 yy2) {
        this.f19664a = context;
        this.f19665b = jm1;
        this.f19666c = jSONObject;
        this.f19667d = zq1;
        this.f19668e = xl1;
        this.f19669f = veVar;
        this.f19670g = oa1;
        this.f19671h = t91;
        this.f19672i = oh1;
        this.f19673j = is2;
        this.f19674k = vm0;
        this.f19675l = et2;
        this.f19676m = x11;
        this.f19677n = bn1;
        this.f19678o = eVar;
        this.f19679p = lh1;
        this.f19680q = rz2;
        this.f19681r = yy2;
    }

    /* renamed from: s */
    private final String m22804s(View view, Map map) {
        if (!(map == null || view == null)) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int K = this.f19668e.mo15132K();
        if (K == 1) {
            return "1099";
        }
        if (K == 2) {
            return "2099";
        }
        if (K != 6) {
            return null;
        }
        return "3099";
    }

    /* renamed from: t */
    private final boolean m22805t(String str) {
        JSONObject optJSONObject = this.f19666c.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private final boolean m22806u() {
        return this.f19666c.optBoolean("allow_custom_click_gesture", false);
    }

    /* renamed from: v */
    private final boolean m22807v(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        C4141r.m28216f("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f19666c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14325I2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f19664a;
            JSONObject jSONObject7 = new JSONObject();
            C4409t.m29326r();
            DisplayMetrics O = C4751b2.m30597O((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", C4584t.m30036b().mo11157d(context, O.widthPixels));
                jSONObject7.put("height", C4584t.m30036b().mo11157d(context, O.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14625m7)).booleanValue()) {
                this.f19667d.mo15647i("/clickRecorded", new tk1(this, (sk1) null));
            } else {
                this.f19667d.mo15647i("/logScionEvent", new rk1(this, (qk1) null));
            }
            this.f19667d.mo15647i("/nativeImpression", new vk1(this, (uk1) null));
            gn0.m13405a(this.f19667d.mo15642d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f19682s) {
                return true;
            }
            this.f19682s = C4409t.m29329u().mo18567n(this.f19664a, this.f19674k.f19150a, this.f19673j.f10945D.toString(), this.f19675l.f8935f);
            return true;
        } catch (JSONException e) {
            pm0.m18665e("Unable to create impression JSON.", e);
            return false;
        }
    }

    /* renamed from: T */
    public final void mo10191T() {
        try {
            C4562p1 p1Var = this.f19663A;
            if (p1Var != null) {
                p1Var.mo18082a();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: U */
    public final void mo10192U() {
        this.f19667d.mo15644f();
    }

    /* renamed from: Y */
    public final void mo10193Y() {
        C4141r.m28216f("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f19666c);
            gn0.m13405a(this.f19667d.mo15642d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            pm0.m18665e("", e);
        }
    }

    /* renamed from: a */
    public final void mo10194a(j40 j40) {
        if (!this.f19666c.optBoolean("custom_one_point_five_click_enabled", false)) {
            pm0.m18667g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.f19677n.mo8889c(j40);
        }
    }

    /* renamed from: b */
    public final JSONObject mo10195b(View view, Map map, Map map2) {
        JSONObject d = C4829z0.m30850d(this.f19664a, map, map2, view);
        JSONObject g = C4829z0.m30853g(this.f19664a, view);
        JSONObject f = C4829z0.m30852f(view);
        JSONObject e = C4829z0.m30851e(this.f19664a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d);
            jSONObject.put("ad_view_signal", g);
            jSONObject.put("scroll_view_signal", f);
            jSONObject.put("lock_screen_signal", e);
            return jSONObject;
        } catch (JSONException e2) {
            pm0.m18665e("Unable to create native ad view signals JSON.", e2);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo10196c() {
        if (this.f19666c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f19677n.mo8888b();
        }
    }

    /* renamed from: d */
    public final void mo10197d(View view, MotionEvent motionEvent, View view2) {
        this.f19686w = C4829z0.m30847a(motionEvent, view2);
        long a = this.f19678o.mo18370a();
        this.f19689z = a;
        if (motionEvent.getAction() == 0) {
            this.f19688y = a;
            this.f19687x = this.f19686w;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f19686w;
        obtain.setLocation((float) point.x, (float) point.y);
        this.f19669f.mo14738d(obtain);
        obtain.recycle();
    }

    /* renamed from: e */
    public final void mo10198e(String str) {
        mo14942z((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    /* renamed from: f */
    public final void mo10199f(View view, View view2, Map map, Map map2, boolean z) {
        View view3 = view2;
        Map map3 = map;
        JSONObject d = C4829z0.m30850d(this.f19664a, map, map2, view2);
        JSONObject g = C4829z0.m30853g(this.f19664a, view2);
        JSONObject f = C4829z0.m30852f(view2);
        JSONObject e = C4829z0.m30851e(this.f19664a, view2);
        View view4 = view;
        String s = m22804s(view, map);
        mo14942z(true == ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14345K2)).booleanValue() ? view3 : view4, g, d, f, e, s, C4829z0.m30849c(s, this.f19664a, this.f19687x, this.f19686w), (JSONObject) null, z, false);
    }

    /* renamed from: g */
    public final void mo10200g(View view) {
        if (!this.f19666c.optBoolean("custom_one_point_five_click_enabled", false)) {
            pm0.m18667g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        bn1 bn1 = this.f19677n;
        if (view != null) {
            view.setOnClickListener(bn1);
            view.setClickable(true);
            bn1.f7378g = new WeakReference(view);
        }
    }

    /* renamed from: h */
    public final void mo10201h() {
        m22807v((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false);
    }

    /* renamed from: i */
    public final void mo10202i(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f19686w = new Point();
        this.f19687x = new Point();
        if (!this.f19683t) {
            this.f19679p.mo12019p0(view);
            this.f19683t = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f19676m.mo15030h(this);
        boolean i = C4829z0.m30855i(this.f19674k.f19152c);
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (i) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (i) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo10203j() {
        this.f19685v = true;
    }

    /* renamed from: j0 */
    public final boolean mo10204j0() {
        return m22806u();
    }

    /* renamed from: k */
    public final boolean mo10205k(Bundle bundle) {
        if (!m22805t("impression_reporting")) {
            pm0.m18664d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return m22807v((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, C4584t.m30036b().mo11161l(bundle, (JSONObject) null), false);
    }

    /* renamed from: l */
    public final void mo10206l(Bundle bundle) {
        if (bundle == null) {
            pm0.m18662b("Click data is null. No click is reported.");
        } else if (!m22805t("click_reporting")) {
            pm0.m18664d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            mo14942z((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, C4584t.m30036b().mo11161l(bundle, (JSONObject) null), false, false);
        }
    }

    /* renamed from: m */
    public final void mo10207m(View view, Map map, Map map2) {
        String str;
        JSONObject d = C4829z0.m30850d(this.f19664a, map, map2, view);
        JSONObject g = C4829z0.m30853g(this.f19664a, view);
        JSONObject f = C4829z0.m30852f(view);
        JSONObject e = C4829z0.m30851e(this.f19664a, view);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14325I2)).booleanValue()) {
            try {
                str = this.f19669f.mo14737c().mo12595f(this.f19664a, view, (Activity) null);
            } catch (Exception unused) {
                pm0.m18664d("Exception getting data.");
            }
            m22807v(g, d, f, e, str, (JSONObject) null, C4829z0.m30854h(this.f19664a, this.f19673j));
        }
        str = null;
        m22807v(g, d, f, e, str, (JSONObject) null, C4829z0.m30854h(this.f19664a, this.f19673j));
    }

    /* renamed from: n */
    public final void mo10208n(C4562p1 p1Var) {
        this.f19663A = p1Var;
    }

    /* renamed from: o */
    public final void mo10209o(View view, Map map) {
        this.f19686w = new Point();
        this.f19687x = new Point();
        if (view != null) {
            this.f19679p.mo12020q0(view);
        }
        this.f19683t = false;
    }

    /* renamed from: p */
    public final void mo10210p(C4580s1 s1Var) {
        try {
            if (!this.f19684u) {
                if (s1Var == null) {
                    xl1 xl1 = this.f19668e;
                    if (xl1.mo15140S() != null) {
                        this.f19684u = true;
                        this.f19680q.mo13909c(xl1.mo15140S().mo18053T(), this.f19681r);
                        mo10191T();
                        return;
                    }
                }
                this.f19684u = true;
                this.f19680q.mo13909c(s1Var.mo18053T(), this.f19681r);
                mo10191T();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: q */
    public final void mo10211q(View view, Map map, Map map2, boolean z) {
        View view2 = view;
        Map map3 = map;
        if (!this.f19685v) {
            pm0.m18662b("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!m22806u()) {
            pm0.m18662b("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            Map map4 = map2;
            JSONObject d = C4829z0.m30850d(this.f19664a, map, map2, view);
            JSONObject g = C4829z0.m30853g(this.f19664a, view);
            JSONObject f = C4829z0.m30852f(view);
            JSONObject e = C4829z0.m30851e(this.f19664a, view);
            String s = m22804s((View) null, map);
            mo14942z(view, g, d, f, e, s, C4829z0.m30849c(s, this.f19664a, this.f19687x, this.f19686w), (JSONObject) null, z, true);
        }
    }

    /* renamed from: r */
    public final JSONObject mo10212r(View view, Map map, Map map2) {
        JSONObject b = mo10195b(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f19685v && m22806u()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (b != null) {
                jSONObject.put("nas", b);
            }
        } catch (JSONException e) {
            pm0.m18665e("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo14942z(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        C4141r.m28216f("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f19666c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.f19665b.mo11441c(this.f19668e.mo15160g0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f19668e.mo15132K());
            jSONObject8.put("view_aware_api_used", z);
            f20 f20 = this.f19675l.f8938i;
            jSONObject8.put("custom_mute_requested", f20 != null && f20.f9093g);
            jSONObject8.put("custom_mute_enabled", !this.f19668e.mo15157f().isEmpty() && this.f19668e.mo15140S() != null);
            if (this.f19677n.mo8887a() != null && this.f19666c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f19678o.mo18370a());
            if (this.f19685v && m22806u()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f19665b.mo11441c(this.f19668e.mo15160g0()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            try {
                JSONObject optJSONObject = this.f19666c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f19669f.mo14737c().mo12596g(this.f19664a, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                pm0.m18665e("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14346K3)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14665q7)).booleanValue() && C4699m.m30421l()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14675r7)).booleanValue() && C4699m.m30421l()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a = this.f19678o.mo18370a();
            jSONObject9.put("time_from_last_touch_down", a - this.f19688y);
            jSONObject9.put("time_from_last_touch", a - this.f19689z);
            jSONObject7.put("touch_signal", jSONObject9);
            gn0.m13405a(this.f19667d.mo15642d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            pm0.m18665e("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: z0 */
    public final void mo10213z0(Bundle bundle) {
        if (bundle == null) {
            pm0.m18662b("Touch event data is null. No touch event is reported.");
        } else if (!m22805t("touch_reporting")) {
            pm0.m18664d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f = bundle.getFloat("x");
            float f2 = bundle.getFloat("y");
            this.f19669f.mo14737c().mo12592c((int) f, (int) f2, bundle.getInt("duration_ms"));
        }
    }
}
