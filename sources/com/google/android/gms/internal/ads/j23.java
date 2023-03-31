package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class j23 extends f23 {

    /* renamed from: a */
    private String f11196a;

    /* renamed from: b */
    private boolean f11197b;

    /* renamed from: c */
    private boolean f11198c;

    /* renamed from: d */
    private byte f11199d;

    j23() {
    }

    /* renamed from: a */
    public final f23 mo10062a(String str) {
        Objects.requireNonNull(str, "Null clientVersion");
        this.f11196a = str;
        return this;
    }

    /* renamed from: b */
    public final f23 mo10063b(boolean z) {
        this.f11198c = true;
        this.f11199d = (byte) (this.f11199d | 2);
        return this;
    }

    /* renamed from: c */
    public final f23 mo10064c(boolean z) {
        this.f11197b = z;
        this.f11199d = (byte) (this.f11199d | 1);
        return this;
    }

    /* renamed from: d */
    public final g23 mo10065d() {
        String str;
        if (this.f11199d == 3 && (str = this.f11196a) != null) {
            return new l23(str, this.f11197b, this.f11198c, (k23) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11196a == null) {
            sb.append(" clientVersion");
        }
        if ((this.f11199d & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.f11199d & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
