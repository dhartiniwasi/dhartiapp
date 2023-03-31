package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.C0681a;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class md2 implements tj2 {

    /* renamed from: a */
    private final Context f13308a;

    md2(Context context) {
        this.f13308a = context;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14690t2)).booleanValue()) {
            return cf3.m10911i((Object) null);
        }
        return cf3.m10911i(new nd2(C0681a.m3145a(this.f13308a, "com.google.android.gms.permission.AD_ID") == 0));
    }

    public final int zza() {
        return 2;
    }
}
