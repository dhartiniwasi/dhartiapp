package com.startapp;

import android.os.Build;
import android.view.View;

/* renamed from: com.startapp.ve */
/* compiled from: Sta */
public final class C9610ve {
    /* renamed from: a */
    public static String m50486a(View view) {
        if (Build.VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }
}
