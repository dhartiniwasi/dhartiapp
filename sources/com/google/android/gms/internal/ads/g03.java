package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g03 {

    /* renamed from: a */
    private final String f9635a;

    /* renamed from: b */
    private final String f9636b;

    private g03(String str, String str2) {
        this.f9635a = str;
        this.f9636b = str2;
    }

    /* renamed from: a */
    public static g03 m12983a(String str, String str2) {
        e13.m11813a(str, "Name is null or empty");
        e13.m11813a(str2, "Version is null or empty");
        return new g03(str, str2);
    }

    /* renamed from: b */
    public final String mo10372b() {
        return this.f9635a;
    }

    /* renamed from: c */
    public final String mo10373c() {
        return this.f9636b;
    }
}
