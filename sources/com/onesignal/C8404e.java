package com.onesignal;

import android.app.Activity;
import androidx.core.app.C0615b;

/* renamed from: com.onesignal.e */
/* compiled from: AndroidSupportV4Compat */
class C8404e {
    /* renamed from: a */
    static void m46644a(Activity activity, String[] strArr, int i) {
        if (activity instanceof C8446g) {
            ((C8446g) activity).validateRequestPermissionsRequestCode(i);
        }
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: b */
    static boolean m46645b(Activity activity, String str) {
        return C0615b.m2926x(activity, str);
    }
}
