package com.google.android.gms.internal.ads;

import android.content.Context;
import p060h4.C4541l4;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class my2 {
    /* renamed from: a */
    public static ny2 m16825a(Context context, int i) {
        boolean z;
        if (az2.m10140a()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        z = ((Boolean) x00.f19923c.mo13438e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        z = ((Boolean) x00.f19924d.mo13438e()).booleanValue();
                        break;
                    case 5:
                        z = ((Boolean) x00.f19922b.mo13438e()).booleanValue();
                        break;
                }
            } else {
                z = ((Boolean) x00.f19925e.mo13438e()).booleanValue();
            }
            if (z) {
                return new py2(context, i);
            }
        }
        return new kz2();
    }

    /* renamed from: b */
    public static ny2 m16826b(Context context, int i, int i2, C4541l4 l4Var) {
        ny2 a = m16825a(context, i);
        if (!(a instanceof py2)) {
            return a;
        }
        a.mo11828T();
        a.mo11827H(i2);
        if (xy2.m23613e(l4Var.f24904x)) {
            a.mo11836z(l4Var.f24904x);
        }
        return a;
    }
}
