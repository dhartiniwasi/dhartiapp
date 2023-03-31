package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class nn1 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ View f14122a;

    /* renamed from: b */
    public final /* synthetic */ vs0 f14123b;

    /* renamed from: c */
    public final /* synthetic */ String f14124c;

    /* renamed from: d */
    public final /* synthetic */ WindowManager.LayoutParams f14125d;

    /* renamed from: e */
    public final /* synthetic */ int f14126e;

    /* renamed from: f */
    public final /* synthetic */ WindowManager f14127f;

    public /* synthetic */ nn1(View view, vs0 vs0, String str, WindowManager.LayoutParams layoutParams, int i, WindowManager windowManager) {
        this.f14122a = view;
        this.f14123b = vs0;
        this.f14124c = str;
        this.f14125d = layoutParams;
        this.f14126e = i;
        this.f14127f = windowManager;
    }

    public final void onScrollChanged() {
        View view = this.f14122a;
        vs0 vs0 = this.f14123b;
        String str = this.f14124c;
        WindowManager.LayoutParams layoutParams = this.f14125d;
        int i = this.f14126e;
        WindowManager windowManager = this.f14127f;
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect) && vs0.mo10647w().getWindowToken() != null) {
            if ("1".equals(str) || "2".equals(str)) {
                layoutParams.y = rect.bottom - i;
            } else {
                layoutParams.y = rect.top - i;
            }
            windowManager.updateViewLayout(vs0.mo10647w(), layoutParams);
        }
    }
}
