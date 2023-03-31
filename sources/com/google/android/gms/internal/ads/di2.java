package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class di2 implements tj2, sj2 {

    /* renamed from: a */
    private final ApplicationInfo f8284a;

    /* renamed from: b */
    private final PackageInfo f8285b;

    di2(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f8284a = applicationInfo;
        this.f8285b = packageInfo;
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return cf3.m10911i(this);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo8321e(Object obj) {
        Integer num;
        Bundle bundle = (Bundle) obj;
        String str = this.f8284a.packageName;
        PackageInfo packageInfo = this.f8285b;
        String str2 = null;
        if (packageInfo == null) {
            num = null;
        } else {
            num = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        PackageInfo packageInfo2 = this.f8285b;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    public final int zza() {
        return 29;
    }
}
