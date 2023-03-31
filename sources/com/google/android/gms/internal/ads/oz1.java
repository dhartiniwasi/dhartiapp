package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class oz1 implements b44 {

    /* renamed from: a */
    private final o44 f15627a;

    public oz1(o44 o44) {
        this.f15627a = o44;
    }

    /* renamed from: a */
    public final ApplicationInfo mo8155d() {
        ApplicationInfo applicationInfo = ((Context) this.f15627a.mo8155d()).getApplicationInfo();
        j44.m14699b(applicationInfo);
        return applicationInfo;
    }
}
