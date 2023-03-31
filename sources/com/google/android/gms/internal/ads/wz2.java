package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class wz2 {
    /* renamed from: a */
    public static wz2 m22968a(xz2 xz2, yz2 yz2) {
        if (uz2.m21913b()) {
            return new a03(xz2, yz2);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    /* renamed from: b */
    public abstract void mo8157b(View view, c03 c03, String str);

    /* renamed from: c */
    public abstract void mo8158c();

    /* renamed from: d */
    public abstract void mo8159d(View view);

    /* renamed from: e */
    public abstract void mo8160e();
}
