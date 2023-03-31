package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import p053g4.C4409t;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class m50 implements e60 {
    m50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        C4409t.m29326r();
        DisplayMetrics O = C4751b2.m30597O((WindowManager) vs0.getContext().getSystemService("window"));
        int i = O.widthPixels;
        int i2 = O.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) vs0).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        vs0.mo9081R("locationReady", hashMap);
        pm0.m18667g("GET LOCATION COMPILED");
    }
}
