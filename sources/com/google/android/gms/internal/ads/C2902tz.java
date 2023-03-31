package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* renamed from: com.google.android.gms.internal.ads.tz */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2902tz {
    /* renamed from: a */
    public static final void m21353a(C2865sz szVar, C2791qz qzVar) {
        if (qzVar.mo13627a() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(qzVar.mo13628b())) {
            szVar.mo14170d(qzVar.mo13627a(), qzVar.mo13628b(), qzVar.mo13629c(), qzVar.mo13630d());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
