package com.startapp;

import android.content.Context;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;

/* renamed from: com.startapp.o6 */
/* compiled from: Sta */
public final class C9194o6 {
    /* renamed from: a */
    public static void m49099a(MraidState mraidState, WebView webView) {
        C9605vb.m50458a(webView, true, "mraid.fireStateChangeEvent", mraidState.name().toLowerCase());
    }

    /* renamed from: b */
    public static void m49101b(Context context, int i, int i2, WebView webView) {
        C9605vb.m50458a(webView, true, "mraid.setScreenSize", Integer.valueOf(Math.round(((float) i) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i2) / context.getResources().getDisplayMetrics().density)));
    }

    /* renamed from: a */
    public static void m49096a(Context context, int i, int i2, WebView webView) {
        C9605vb.m50458a(webView, true, "mraid.setMaxSize", Integer.valueOf(Math.round(((float) i) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i2) / context.getResources().getDisplayMetrics().density)));
    }

    /* renamed from: b */
    public static void m49100b(Context context, int i, int i2, int i3, int i4, WebView webView) {
        C9605vb.m50458a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(Math.round(((float) i) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i2) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i3) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i4) / context.getResources().getDisplayMetrics().density)));
    }

    /* renamed from: a */
    public static void m49095a(Context context, int i, int i2, int i3, int i4, WebView webView) {
        C9605vb.m50458a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(Math.round(((float) i) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i2) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i3) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i4) / context.getResources().getDisplayMetrics().density)));
    }

    /* renamed from: a */
    public static void m49097a(WebView webView, String str, String str2) {
        C9605vb.m50458a(webView, true, "mraid.fireErrorEvent", str, str2);
    }

    /* renamed from: a */
    public static void m49098a(WebView webView, String str, boolean z) {
        C9605vb.m50458a(webView, false, "mraid.setSupports", str, Boolean.valueOf(z));
    }
}
