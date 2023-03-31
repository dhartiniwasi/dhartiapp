package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import p033d5.C4141r;
import p073j4.C4762e1;
import p081k5.C4888c;

/* renamed from: com.google.android.gms.internal.ads.wy */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3012wy {

    /* renamed from: a */
    private final Context f19911a;

    public C3012wy(Context context) {
        C4141r.m28222l(context, "Context can not be null");
        this.f19911a = context;
    }

    /* renamed from: a */
    public final boolean mo14999a(Intent intent) {
        C4141r.m28222l(intent, "Intent can not be null");
        if (!this.f19911a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo15000b() {
        return mo14999a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: c */
    public final boolean mo15001c() {
        return ((Boolean) C4762e1.m30653a(this.f19911a, C2975vy.f19374a)).booleanValue() && C4888c.m31075a(this.f19911a).mo18668a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
