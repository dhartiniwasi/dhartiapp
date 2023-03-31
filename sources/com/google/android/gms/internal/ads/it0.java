package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import p053g4.C4390a;
import p053g4.C4401l;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class it0 {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.vs0, java.lang.Object] */
    /* renamed from: a */
    public static final vs0 m14546a(Context context, mu0 mu0, String str, boolean z, boolean z2, C2955ve veVar, n00 n00, vm0 vm0, c00 c00, C4401l lVar, C4390a aVar, C2971vu vuVar, is2 is2, ls2 ls2) throws ht0 {
        StrictMode.ThreadPolicy threadPolicy;
        C2679nz.m17343c(context);
        try {
            dt0 dt0 = new dt0(context, mu0, str, z, z2, veVar, n00, vm0, (c00) null, lVar, aVar, vuVar, is2, ls2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza = dt0.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new ht0("Webview initialization failed.", th);
        }
    }
}
