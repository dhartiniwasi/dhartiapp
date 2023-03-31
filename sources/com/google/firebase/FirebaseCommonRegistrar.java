package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p246h7.C10417h;
import p246h7.C10418i;
import p246h7.C10419j;
import p246h7.C10420k;
import p257i8.C10557f;
import p302n7.C11934c;
import p367u8.C12702c;
import p367u8.C12704e;
import p367u8.C12707h;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m43198e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m43199f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m43200g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (i >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m43201h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m43202i(installerPackageName) : "";
    }

    /* renamed from: i */
    private static String m43202i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<C11934c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C12702c.m60237c());
        arrayList.add(C10557f.m53083g());
        arrayList.add(C12707h.m60249b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C12707h.m60249b("fire-core", "20.3.0"));
        arrayList.add(C12707h.m60249b("device-name", m43202i(Build.PRODUCT)));
        arrayList.add(C12707h.m60249b("device-model", m43202i(Build.DEVICE)));
        arrayList.add(C12707h.m60249b("device-brand", m43202i(Build.BRAND)));
        arrayList.add(C12707h.m60250c("android-target-sdk", C10418i.f41350a));
        arrayList.add(C12707h.m60250c("android-min-sdk", C10419j.f41351a));
        arrayList.add(C12707h.m60250c("android-platform", C10420k.f41352a));
        arrayList.add(C12707h.m60250c("android-installer", C10417h.f41349a));
        String a = C12704e.m60243a();
        if (a != null) {
            arrayList.add(C12707h.m60249b("kotlin", a));
        }
        return arrayList;
    }
}
