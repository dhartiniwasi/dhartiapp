package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p053g4.C4391b;
import p060h4.C4571q4;
import p060h4.C4584t;
import p060h4.C4596v;
import p073j4.C4829z0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class sn1 {

    /* renamed from: a */
    private final ls1 f17597a;

    /* renamed from: b */
    private final zq1 f17598b;

    /* renamed from: c */
    private ViewTreeObserver.OnScrollChangedListener f17599c = null;

    public sn1(ls1 ls1, zq1 zq1) {
        this.f17597a = ls1;
        this.f17598b = zq1;
    }

    /* renamed from: f */
    private static final int m20529f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C4584t.m30036b();
        return im0.m14418y(context, i);
    }

    /* renamed from: a */
    public final View mo14102a(View view, WindowManager windowManager) throws ht0 {
        vs0 a = this.f17597a.mo12076a(C4571q4.m29983K1(), (is2) null, (ls2) null);
        View view2 = (View) a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        a.mo12105d1("/sendMessageToSdk", new on1(this));
        a.mo12105d1("/hideValidatorOverlay", new pn1(this, windowManager, view));
        a.mo12105d1("/open", new q60((C4391b) null, (ee0) null, (o42) null, (gv1) null, (ux2) null));
        this.f17598b.mo15648j(new WeakReference(a), "/loadNativeAdPolicyViolations", new qn1(this, view, windowManager));
        this.f17598b.mo15648j(new WeakReference(a), "/showValidatorOverlay", rn1.f17025a);
        return (View) a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo14103b(vs0 vs0, Map map) {
        this.f17598b.mo15645g("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14104c(WindowManager windowManager, View view, vs0 vs0, Map map) {
        pm0.m18662b("Hide native ad policy validator overlay.");
        vs0.mo10647w().setVisibility(8);
        if (vs0.mo10647w().getWindowToken() != null) {
            windowManager.removeView(vs0.mo10647w());
        }
        vs0.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f17599c != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.f17599c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo14105d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f17598b.mo15645g("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo14106e(View view, WindowManager windowManager, vs0 vs0, Map map) {
        int i;
        vs0.mo12108f0().mo9283G(new mn1(this, map));
        if (map != null) {
            Context context = view.getContext();
            int f = m20529f(context, (String) map.get("validator_width"), ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14449U6)).intValue());
            int f2 = m20529f(context, (String) map.get("validator_height"), ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14459V6)).intValue());
            int f3 = m20529f(context, (String) map.get("validator_x"), 0);
            int f4 = m20529f(context, (String) map.get("validator_y"), 0);
            vs0.mo12100Z0(mu0.m16709b(f, f2));
            try {
                vs0.mo12086A().getSettings().setUseWideViewPort(((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14468W6)).booleanValue());
                vs0.mo12086A().getSettings().setLoadWithOverviewMode(((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14477X6)).booleanValue());
            } catch (NullPointerException unused) {
            }
            WindowManager.LayoutParams b = C4829z0.m30848b();
            b.x = f3;
            b.y = f4;
            windowManager.updateViewLayout(vs0.mo10647w(), b);
            String str = (String) map.get(AdUnitActivity.EXTRA_ORIENTATION);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if ("1".equals(str) || "2".equals(str)) {
                    i = rect.bottom;
                } else {
                    i = rect.top;
                }
                this.f17599c = new nn1(view, vs0, str, b, i - f4, windowManager);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.f17599c);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                vs0.loadUrl(str2);
            }
        }
    }
}
