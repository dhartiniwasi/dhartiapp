package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ct */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2264ct {

    /* renamed from: a */
    final long f7892a;

    /* renamed from: b */
    final String f7893b;

    /* renamed from: c */
    final int f7894c;

    C2264ct(long j, String str, int i) {
        this.f7892a = j;
        this.f7893b = str;
        this.f7894c = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2264ct)) {
            C2264ct ctVar = (C2264ct) obj;
            if (ctVar.f7892a == this.f7892a && ctVar.f7894c == this.f7894c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f7892a;
    }
}
