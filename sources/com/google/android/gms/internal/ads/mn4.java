package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mn4 {

    /* renamed from: a */
    public final String f13422a;

    private mn4(int i, int i2, String str) {
        this.f13422a = str;
    }

    /* renamed from: a */
    public static mn4 m16608a(y22 y22) {
        String str;
        y22.mo15294g(2);
        int s = y22.mo15306s();
        int i = s >> 1;
        int s2 = (y22.mo15306s() >> 3) | ((s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = s2 < 10 ? ".0" : ".";
        return new mn4(i, s2, str + ".0" + i + str2 + s2);
    }
}
