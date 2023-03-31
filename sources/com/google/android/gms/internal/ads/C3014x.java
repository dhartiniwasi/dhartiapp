package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.x */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3014x {
    /* renamed from: a */
    public static int m22983a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static k60 m22984b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] I = gb2.m13139I(str, "=");
            if (I.length != 2) {
                ot1.m18060e("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (I[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C2608m1.m16352a(new y22(Base64.decode(I[1], 0))));
                } catch (RuntimeException e) {
                    ot1.m18061f("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new C2275d3(I[0], I[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k60((List) arrayList);
    }

    /* renamed from: c */
    public static C2903u m22985c(y22 y22, boolean z, boolean z2) throws ea0 {
        if (z) {
            m22986d(3, y22, false);
        }
        String F = y22.mo15285F((int) y22.mo15312y(), o73.f14986c);
        long y = y22.mo15312y();
        String[] strArr = new String[((int) y)];
        int length = F.length() + 15;
        for (int i = 0; ((long) i) < y; i++) {
            String F2 = y22.mo15285F((int) y22.mo15312y(), o73.f14986c);
            strArr[i] = F2;
            length = length + 4 + F2.length();
        }
        if (!z2 || (y22.mo15306s() & 1) != 0) {
            return new C2903u(F, strArr, length + 1);
        }
        throw ea0.m11990a("framing bit expected to be set", (Throwable) null);
    }

    /* renamed from: d */
    public static boolean m22986d(int i, y22 y22, boolean z) throws ea0 {
        if (y22.mo15296i() < 7) {
            if (z) {
                return false;
            }
            int i2 = y22.mo15296i();
            throw ea0.m11990a("too short header: " + i2, (Throwable) null);
        } else if (y22.mo15306s() != i) {
            if (z) {
                return false;
            }
            throw ea0.m11990a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), (Throwable) null);
        } else if (y22.mo15306s() == 118 && y22.mo15306s() == 111 && y22.mo15306s() == 114 && y22.mo15306s() == 98 && y22.mo15306s() == 105 && y22.mo15306s() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ea0.m11990a("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
