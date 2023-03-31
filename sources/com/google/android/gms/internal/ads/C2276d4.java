package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d4 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class C2276d4 {

    /* renamed from: a */
    public final int f8046a;

    public C2276d4(int i) {
        this.f8046a = i;
    }

    /* renamed from: a */
    public static int m11303a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static String m11304b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m11304b(this.f8046a);
    }
}
