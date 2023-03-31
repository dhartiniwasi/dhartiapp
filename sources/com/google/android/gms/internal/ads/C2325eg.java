package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* renamed from: com.google.android.gms.internal.ads.eg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2325eg implements AppOpsManager.OnOpActiveChangedListener {

    /* renamed from: a */
    final /* synthetic */ C2363fg f8791a;

    C2325eg(C2363fg fgVar) {
        this.f8791a = fgVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.f8791a.f9268a = System.currentTimeMillis();
            this.f8791a.f9271d = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C2363fg fgVar = this.f8791a;
        if (fgVar.f9269b > 0 && currentTimeMillis >= fgVar.f9269b) {
            fgVar.f9270c = currentTimeMillis - fgVar.f9269b;
        }
        this.f8791a.f9271d = false;
    }
}
