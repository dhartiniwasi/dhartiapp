package com.google.android.gms.internal.ads;

import android.os.StrictMode;

/* renamed from: com.google.android.gms.internal.ads.pz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2754pz {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static Object m18985a(s83 s83) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object zza = s83.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
