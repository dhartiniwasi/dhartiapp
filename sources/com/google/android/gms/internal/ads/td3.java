package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class td3 {
    /* renamed from: a */
    public static /* synthetic */ boolean m20985a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!sd3.m20268a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
