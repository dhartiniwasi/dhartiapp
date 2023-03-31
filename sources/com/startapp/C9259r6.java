package com.startapp;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;

/* renamed from: com.startapp.r6 */
/* compiled from: Sta */
public final class C9259r6 {
    /* renamed from: a */
    public static void m49221a(Context context, WebView webView, C9278s6 s6Var) {
        if (s6Var == null) {
            s6Var = new C9278s6(context);
        }
        boolean z = true;
        C9194o6.m49098a(webView, "mraid.SUPPORTED_FEATURES.CALENDAR", s6Var.f38195b.contains("calendar") && Build.VERSION.SDK_INT >= 14 && C8837b0.m48304a(s6Var.f38194a, "android.permission.WRITE_CALENDAR"));
        C9194o6.m49098a(webView, "mraid.SUPPORTED_FEATURES.INLINEVIDEO", s6Var.f38195b.contains("inlineVideo"));
        C9194o6.m49098a(webView, "mraid.SUPPORTED_FEATURES.SMS", s6Var.f38195b.contains("sms") && C8837b0.m48304a(s6Var.f38194a, "android.permission.SEND_SMS"));
        C9194o6.m49098a(webView, "mraid.SUPPORTED_FEATURES.STOREPICTURE", s6Var.f38195b.contains("storePicture"));
        if (!s6Var.f38195b.contains("tel") || !C8837b0.m48304a(s6Var.f38194a, "android.permission.CALL_PHONE")) {
            z = false;
        }
        C9194o6.m49098a(webView, "mraid.SUPPORTED_FEATURES.TEL", z);
    }
}
