package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lh */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C2587lh implements PackageManager.OnChecksumsReadyListener {

    /* renamed from: a */
    public final /* synthetic */ uf3 f12800a;

    public /* synthetic */ C2587lh(uf3 uf3) {
        this.f12800a = uf3;
    }

    public final void onChecksumsReady(List list) {
        uf3 uf3 = this.f12800a;
        if (list == null) {
            uf3.mo9805g((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    uf3.mo9805g(C3104zf.m24567c(apkChecksum.getValue()));
                    return;
                }
            }
            uf3.mo9805g((Object) null);
        } catch (Throwable unused) {
            uf3.mo9805g((Object) null);
        }
    }
}
