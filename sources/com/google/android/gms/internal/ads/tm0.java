package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class tm0 {
    /* renamed from: a */
    public static Context m21078a(Context context) throws sm0 {
        return m21080c(context).mo8135b();
    }

    /* renamed from: b */
    public static Object m21079b(Context context, String str, rm0 rm0) throws sm0 {
        try {
            return rm0.mo10780b(m21080c(context).mo8136d(str));
        } catch (Exception e) {
            throw new sm0(e);
        }
    }

    /* renamed from: c */
    private static DynamiteModule m21080c(Context context) throws sm0 {
        try {
            return DynamiteModule.m9486e(context, DynamiteModule.f6325b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e) {
            throw new sm0(e);
        }
    }
}
