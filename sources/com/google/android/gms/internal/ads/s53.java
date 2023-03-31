package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class s53 extends k63 {

    /* renamed from: a */
    private final String f17267a;

    /* renamed from: b */
    private final String f17268b;

    /* synthetic */ s53(String str, String str2, r53 r53) {
        this.f17267a = str;
        this.f17268b = str2;
    }

    /* renamed from: a */
    public final String mo11581a() {
        return this.f17268b;
    }

    /* renamed from: b */
    public final String mo11582b() {
        return this.f17267a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k63) {
            k63 k63 = (k63) obj;
            String str = this.f17267a;
            if (str != null ? str.equals(k63.mo11582b()) : k63.mo11582b() == null) {
                String str2 = this.f17268b;
                if (str2 != null ? str2.equals(k63.mo11581a()) : k63.mo11581a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f17267a;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.f17268b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String str = this.f17267a;
        String str2 = this.f17268b;
        return "OverlayDisplayUpdateRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}
