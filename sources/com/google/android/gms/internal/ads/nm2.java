package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p060h4.C4596v;
import p073j4.C4785k1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class nm2 implements Callable {

    /* renamed from: a */
    public static final /* synthetic */ nm2 f14113a = new nm2();

    private /* synthetic */ nm2() {
    }

    public final Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) C4596v.m30088c().mo12227b(C2679nz.f14322I);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14332J)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, C4785k1.m30681a(str2));
                }
            }
        }
        return new pm2(hashMap);
    }
}
