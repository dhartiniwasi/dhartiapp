package com.unity3d.scar.adapter.common;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.unity3d.scar.adapter.common.k */
/* compiled from: Utils */
public class C9705k {
    /* renamed from: a */
    public static void m50625a(Runnable runnable) {
        m50626b(runnable, 0);
    }

    /* renamed from: b */
    public static void m50626b(Runnable runnable, long j) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j);
    }
}
