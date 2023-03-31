package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import p081k5.C4888c;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class tz1 implements b44 {

    /* renamed from: a */
    private final o44 f18298a;

    /* renamed from: b */
    private final o44 f18299b;

    public tz1(o44 o44, o44 o442) {
        this.f18298a = o44;
        this.f18299b = o442;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        try {
            return C4888c.m31075a((Context) this.f18298a.mo8155d()).mo18673f(((oz1) this.f18299b).mo8155d().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
