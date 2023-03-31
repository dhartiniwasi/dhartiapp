package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class cn4 {
    /* renamed from: a */
    public static void m11017a(long j, y22 y22, C2792r[] rVarArr) {
        int i;
        while (true) {
            boolean z = true;
            if (y22.mo15296i() > 1) {
                int c = m11019c(y22);
                int c2 = m11019c(y22);
                int k = y22.mo15298k() + c2;
                if (c2 == -1 || c2 > y22.mo15296i()) {
                    ot1.m18060e("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    k = y22.mo15299l();
                } else if (c == 4 && c2 >= 8) {
                    int s = y22.mo15306s();
                    int w = y22.mo15310w();
                    if (w == 49) {
                        i = y22.mo15300m();
                        w = 49;
                    } else {
                        i = 0;
                    }
                    int s2 = y22.mo15306s();
                    if (w == 47) {
                        y22.mo15294g(1);
                        w = 47;
                    }
                    boolean z2 = s == 181 && (w == 49 || w == 47) && s2 == 3;
                    if (w == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m11018b(j, y22, rVarArr);
                    }
                }
                y22.mo15293f(k);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m11018b(long j, y22 y22, C2792r[] rVarArr) {
        int s = y22.mo15306s();
        if ((s & 64) != 0) {
            y22.mo15294g(1);
            int i = (s & 31) * 3;
            int k = y22.mo15298k();
            for (C2792r rVar : rVarArr) {
                y22.mo15293f(k);
                rVar.mo8821c(y22, i);
                if (j != -9223372036854775807L) {
                    rVar.mo8824f(j, 1, i, 0, (C2755q) null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m11019c(y22 y22) {
        int i = 0;
        while (y22.mo15296i() != 0) {
            int s = y22.mo15306s();
            i += s;
            if (s != 255) {
                return i;
            }
        }
        return -1;
    }
}
