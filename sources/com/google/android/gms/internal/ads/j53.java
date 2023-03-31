package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class j53 extends u53 {

    /* renamed from: a */
    private final String f11238a;

    /* renamed from: b */
    private final String f11239b;

    /* synthetic */ j53(String str, String str2, i53 i53) {
        this.f11238a = str;
        this.f11239b = str2;
    }

    /* renamed from: a */
    public final String mo11323a() {
        return this.f11239b;
    }

    /* renamed from: b */
    public final String mo11324b() {
        return this.f11238a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u53) {
            u53 u53 = (u53) obj;
            String str = this.f11238a;
            if (str != null ? str.equals(u53.mo11324b()) : u53.mo11324b() == null) {
                String str2 = this.f11239b;
                if (str2 != null ? str2.equals(u53.mo11323a()) : u53.mo11323a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f11238a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.f11239b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f11238a;
        String str2 = this.f11239b;
        return "OverlayDisplayDismissRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}
