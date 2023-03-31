package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class l23 extends g23 {

    /* renamed from: a */
    private final String f12626a;

    /* renamed from: b */
    private final boolean f12627b;

    /* renamed from: c */
    private final boolean f12628c;

    /* synthetic */ l23(String str, boolean z, boolean z2, k23 k23) {
        this.f12626a = str;
        this.f12627b = z;
        this.f12628c = z2;
    }

    /* renamed from: b */
    public final String mo10379b() {
        return this.f12626a;
    }

    /* renamed from: c */
    public final boolean mo10380c() {
        return this.f12628c;
    }

    /* renamed from: d */
    public final boolean mo10381d() {
        return this.f12627b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g23) {
            g23 g23 = (g23) obj;
            return this.f12626a.equals(g23.mo10379b()) && this.f12627b == g23.mo10381d() && this.f12628c == g23.mo10380c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f12626a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f12627b ? 1237 : 1231)) * 1000003;
        if (true == this.f12628c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f12626a;
        boolean z = this.f12627b;
        boolean z2 = this.f12628c;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }
}
