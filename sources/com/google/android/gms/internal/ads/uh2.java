package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.ArrayList;
import p073j4.C4800p1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class uh2 implements tj2 {

    /* renamed from: a */
    private final mf3 f18535a;

    /* renamed from: b */
    private final et2 f18536b;

    /* renamed from: c */
    private final PackageInfo f18537c;

    /* renamed from: d */
    private final C4800p1 f18538d;

    public uh2(mf3 mf3, et2 et2, PackageInfo packageInfo, C4800p1 p1Var) {
        this.f18535a = mf3;
        this.f18536b = et2;
        this.f18537c = packageInfo;
        this.f18538d = p1Var;
    }

    /* renamed from: a */
    public static /* synthetic */ vh2 m21642a(uh2 uh2) {
        ArrayList arrayList = uh2.f18536b.f8936g;
        if (arrayList == null) {
            return qh2.f16376a;
        }
        return arrayList.isEmpty() ? rh2.f16950a : new sh2(uh2, arrayList);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        if (r9 == 3) goto L_0x0105;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo14515b(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.String r0 = "native_version"
            r1 = 3
            r10.putInt(r0, r1)
            java.lang.String r0 = "native_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            java.util.ArrayList r9 = r9.f8937h
            java.lang.String r0 = "native_custom_templates"
            r10.putStringArrayList(r0, r9)
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            com.google.android.gms.internal.ads.f20 r9 = r9.f8938i
            int r9 = r9.f9087a
            java.lang.String r0 = "landscape"
            java.lang.String r2 = "portrait"
            java.lang.String r3 = "any"
            java.lang.String r4 = "unknown"
            r5 = 2
            r6 = 1
            if (r9 <= r1) goto L_0x004f
            java.lang.String r9 = "enable_native_media_orientation"
            r10.putBoolean(r9, r6)
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            com.google.android.gms.internal.ads.f20 r9 = r9.f8938i
            int r9 = r9.f9094h
            if (r9 == r6) goto L_0x0043
            if (r9 == r5) goto L_0x0041
            if (r9 == r1) goto L_0x003f
            r7 = 4
            if (r9 == r7) goto L_0x003c
            r9 = r4
            goto L_0x0044
        L_0x003c:
            java.lang.String r9 = "square"
            goto L_0x0044
        L_0x003f:
            r9 = r2
            goto L_0x0044
        L_0x0041:
            r9 = r0
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            boolean r7 = r4.equals(r9)
            if (r7 != 0) goto L_0x004f
            java.lang.String r7 = "native_media_orientation"
            r10.putString(r7, r9)
        L_0x004f:
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            com.google.android.gms.internal.ads.f20 r9 = r9.f8938i
            int r9 = r9.f9089c
            if (r9 == 0) goto L_0x005f
            if (r9 == r6) goto L_0x005d
            if (r9 == r5) goto L_0x0060
            r0 = r4
            goto L_0x0060
        L_0x005d:
            r0 = r2
            goto L_0x0060
        L_0x005f:
            r0 = r3
        L_0x0060:
            boolean r9 = r4.equals(r0)
            if (r9 != 0) goto L_0x006b
            java.lang.String r9 = "native_image_orientation"
            r10.putString(r9, r0)
        L_0x006b:
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            com.google.android.gms.internal.ads.f20 r9 = r9.f8938i
            boolean r9 = r9.f9090d
            java.lang.String r0 = "native_multiple_images"
            r10.putBoolean(r0, r9)
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            com.google.android.gms.internal.ads.f20 r9 = r9.f8938i
            boolean r9 = r9.f9093g
            java.lang.String r0 = "use_custom_mute"
            r10.putBoolean(r0, r9)
            android.content.pm.PackageInfo r9 = r8.f18537c
            if (r9 != 0) goto L_0x0087
            r9 = 0
            goto L_0x0089
        L_0x0087:
            int r9 = r9.versionCode
        L_0x0089:
            j4.p1 r0 = r8.f18538d
            int r0 = r0.zza()
            if (r9 <= r0) goto L_0x009b
            j4.p1 r0 = r8.f18538d
            r0.mo18498d0()
            j4.p1 r0 = r8.f18538d
            r0.mo18506k(r9)
        L_0x009b:
            j4.p1 r9 = r8.f18538d
            org.json.JSONObject r9 = r9.mo18494b0()
            r0 = 0
            if (r9 == 0) goto L_0x00b2
            com.google.android.gms.internal.ads.et2 r2 = r8.f18536b
            java.lang.String r2 = r2.f8935f
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r9 == 0) goto L_0x00b2
            java.lang.String r0 = r9.toString()
        L_0x00b2:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 != 0) goto L_0x00bd
            java.lang.String r9 = "native_advanced_settings"
            r10.putString(r9, r0)
        L_0x00bd:
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            int r9 = r9.f8940k
            if (r9 <= r6) goto L_0x00c8
            java.lang.String r0 = "max_num_ads"
            r10.putInt(r0, r9)
        L_0x00c8:
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            com.google.android.gms.internal.ads.f80 r9 = r9.f8931b
            if (r9 == 0) goto L_0x0117
            java.lang.String r0 = r9.f9184c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x010b
            int r0 = r9.f9182a
            java.lang.String r2 = "p"
            java.lang.String r3 = "l"
            if (r0 < r5) goto L_0x00e5
            int r9 = r9.f9185d
            if (r9 == r5) goto L_0x0104
            if (r9 == r1) goto L_0x0105
            goto L_0x0104
        L_0x00e5:
            int r9 = r9.f9183b
            if (r9 == r6) goto L_0x0104
            if (r9 == r5) goto L_0x0105
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Instream ad video aspect ratio "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = " is wrong."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.google.android.gms.internal.ads.pm0.m18664d(r9)
        L_0x0104:
            r2 = r3
        L_0x0105:
            java.lang.String r9 = "ia_var"
            r10.putString(r9, r2)
            goto L_0x0112
        L_0x010b:
            java.lang.String r9 = r9.f9184c
            java.lang.String r0 = "ad_tag"
            r10.putString(r0, r9)
        L_0x0112:
            java.lang.String r9 = "instr"
            r10.putBoolean(r9, r6)
        L_0x0117:
            com.google.android.gms.internal.ads.et2 r9 = r8.f18536b
            com.google.android.gms.internal.ads.h40 r9 = r9.mo10012a()
            if (r9 == 0) goto L_0x0124
            java.lang.String r9 = "has_delayed_banner_listener"
            r10.putBoolean(r9, r6)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uh2.mo14515b(java.util.ArrayList, android.os.Bundle):void");
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f18535a.mo12324a(new th2(this));
    }

    public final int zza() {
        return 26;
    }
}
