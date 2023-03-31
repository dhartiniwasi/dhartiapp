package com.google.android.gms.internal.ads;

import android.content.Context;
import p053g4.C4409t;
import p060h4.C4584t;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yt2 {
    /* renamed from: a */
    public static void m24195a(Context context, boolean z) {
        if (z) {
            pm0.m18666f("This request is sent from a test device.");
            return;
        }
        C4584t.m30036b();
        String z2 = im0.m14419z(context);
        pm0.m18666f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + z2 + "\")) to get test ads on this device.");
    }

    /* renamed from: b */
    public static void m24196b(int i, Throwable th, String str) {
        pm0.m18666f("Ad failed to load : " + i);
        C4794n1.m30694l(str, th);
        if (i != 3) {
            C4409t.m29325q().mo15125s(th, str);
        }
    }
}
