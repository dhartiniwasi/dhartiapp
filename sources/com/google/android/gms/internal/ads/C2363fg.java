package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.fg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2363fg {

    /* renamed from: e */
    private static final String[] f9267e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f9268a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f9269b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f9270c = -1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f9271d = false;

    C2363fg(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C2325eg(this));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
    }

    /* renamed from: d */
    public static C2363fg m12594d(Context context, Executor executor) {
        return new C2363fg(context, executor, f9267e);
    }

    /* renamed from: b */
    public final long mo10158b() {
        long j = this.f9270c;
        this.f9270c = -1;
        return j;
    }

    /* renamed from: c */
    public final long mo10159c() {
        if (this.f9271d) {
            return this.f9269b - this.f9268a;
        }
        return -1;
    }

    /* renamed from: h */
    public final void mo10160h() {
        if (this.f9271d) {
            this.f9269b = System.currentTimeMillis();
        }
    }
}
