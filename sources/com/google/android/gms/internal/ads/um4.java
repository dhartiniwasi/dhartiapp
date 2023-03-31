package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class um4 {

    /* renamed from: a */
    public final List f18628a;

    /* renamed from: b */
    public final int f18629b;

    /* renamed from: c */
    public final int f18630c;

    /* renamed from: d */
    public final int f18631d;

    /* renamed from: e */
    public final float f18632e;

    /* renamed from: f */
    public final String f18633f;

    private um4(List list, int i, int i2, int i3, float f, String str) {
        this.f18628a = list;
        this.f18629b = i;
        this.f18630c = i2;
        this.f18631d = i3;
        this.f18632e = f;
        this.f18633f = str;
    }

    /* renamed from: a */
    public static um4 m21731a(y22 y22) throws ea0 {
        String str;
        float f;
        int i;
        int i2;
        try {
            y22.mo15294g(4);
            int s = (y22.mo15306s() & 3) + 1;
            if (s != 3) {
                ArrayList arrayList = new ArrayList();
                int s2 = y22.mo15306s() & 31;
                for (int i3 = 0; i3 < s2; i3++) {
                    arrayList.add(m21732b(y22));
                }
                int s3 = y22.mo15306s();
                for (int i4 = 0; i4 < s3; i4++) {
                    arrayList.add(m21732b(y22));
                }
                if (s2 > 0) {
                    C2383g d = C2420h.m13649d((byte[]) arrayList.get(0), s + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = d.f9619e;
                    int i6 = d.f9620f;
                    float f2 = d.f9621g;
                    str = xb1.m23166a(d.f9615a, d.f9616b, d.f9617c);
                    i2 = i5;
                    i = i6;
                    f = f2;
                } else {
                    str = null;
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new um4(arrayList, s, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ea0.m11990a("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m21732b(y22 y22) {
        int w = y22.mo15310w();
        int k = y22.mo15298k();
        y22.mo15294g(w);
        return xb1.m23168c(y22.mo15295h(), k, w);
    }
}
