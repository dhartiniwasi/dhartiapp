package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ul4 implements tl4 {

    /* renamed from: a */
    private final WindowManager f18610a;

    private ul4(WindowManager windowManager) {
        this.f18610a = windowManager;
    }

    /* renamed from: b */
    public static tl4 m21703b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new ul4(windowManager);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo14324a(rl4 rl4) {
        xl4.m23368b(rl4.f17015a, this.f18610a.getDefaultDisplay());
    }

    public final void zza() {
    }
}
