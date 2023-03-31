package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class ea0 extends IOException {

    /* renamed from: a */
    public final boolean f8714a;

    /* renamed from: b */
    public final int f8715b;

    protected ea0(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f8714a = z;
        this.f8715b = i;
    }

    /* renamed from: a */
    public static ea0 m11990a(String str, Throwable th) {
        return new ea0(str, th, true, 1);
    }

    /* renamed from: b */
    public static ea0 m11991b(String str, Throwable th) {
        return new ea0(str, th, true, 0);
    }

    /* renamed from: c */
    public static ea0 m11992c(String str) {
        return new ea0(str, (Throwable) null, false, 1);
    }
}
