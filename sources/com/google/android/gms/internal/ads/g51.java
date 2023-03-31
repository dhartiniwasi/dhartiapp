package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;
import p053g4.C4409t;
import p060h4.C4584t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g51 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final Context f9702a;

    /* renamed from: b */
    private View f9703b;

    private g51(Context context) {
        super(context);
        this.f9702a = context;
    }

    /* renamed from: a */
    public static g51 m13041a(Context context, View view, is2 is2) {
        Resources resources;
        DisplayMetrics displayMetrics;
        g51 g51 = new g51(context);
        if (!(is2.f11005v.isEmpty() || (resources = g51.f9702a.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            js2 js2 = (js2) is2.f11005v.get(0);
            float f = displayMetrics.density;
            g51.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) js2.f11783a) * f), (int) (((float) js2.f11784b) * f)));
        }
        g51.f9703b = view;
        g51.addView(view);
        C4409t.m29334z();
        qn0.m19300b(g51, g51);
        C4409t.m29334z();
        qn0.m19299a(g51, g51);
        JSONObject jSONObject = is2.f10987j0;
        RelativeLayout relativeLayout = new RelativeLayout(g51.f9702a);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            g51.m13043c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            g51.m13043c(optJSONObject2, relativeLayout, 12);
        }
        g51.addView(relativeLayout);
        return g51;
    }

    /* renamed from: b */
    private final int m13042b(double d) {
        C4584t.m30036b();
        return im0.m14418y(this.f9702a, (int) d);
    }

    /* renamed from: c */
    private final void m13043c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f9702a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b = m13042b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b, 0, b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m13042b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f9703b.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f9703b.setY((float) (-iArr[1]));
    }
}
