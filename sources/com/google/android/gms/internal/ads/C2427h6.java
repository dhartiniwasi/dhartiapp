package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.h6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2427h6 implements C3022x7 {

    /* renamed from: a */
    private final List f10204a = ua3.m21508w();

    public C2427h6(int i) {
    }

    /* renamed from: b */
    private final C2651n7 m13721b(C2985w7 w7Var) {
        return new C2651n7(m13723d(w7Var));
    }

    /* renamed from: c */
    private final C2206b8 m13722c(C2985w7 w7Var) {
        return new C2206b8(m13723d(w7Var));
    }

    /* renamed from: d */
    private final List m13723d(C2985w7 w7Var) {
        String str;
        int i;
        List list;
        y22 y22 = new y22(w7Var.f19514d);
        List list2 = this.f10204a;
        while (y22.mo15296i() > 0) {
            int s = y22.mo15306s();
            int k = y22.mo15298k() + y22.mo15306s();
            if (s == 134) {
                list2 = new ArrayList();
                int s2 = y22.mo15306s() & 31;
                for (int i2 = 0; i2 < s2; i2++) {
                    String F = y22.mo15285F(3, o73.f14986c);
                    int s3 = y22.mo15306s();
                    int i3 = s3 & 128;
                    if (i3 != 0) {
                        i = s3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte s4 = (byte) y22.mo15306s();
                    y22.mo15294g(1);
                    if (i3 != 0) {
                        int i4 = xb1.f20063c;
                        list = Collections.singletonList((s4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C2311e2 e2Var = new C2311e2();
                    e2Var.mo9776s(str);
                    e2Var.mo9768k(F);
                    e2Var.mo9755c0(i);
                    e2Var.mo9766i(list);
                    list2.add(e2Var.mo9782y());
                }
            }
            y22.mo15293f(k);
        }
        return list2;
    }

    /* renamed from: a */
    public final C3096z7 mo10740a(int i, C2985w7 w7Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C2242c7(new C3095z6(w7Var.f19512b));
            }
            if (i == 21) {
                return new C2242c7(new C3021x6());
            }
            if (i == 27) {
                return new C2242c7(new C2910u6(m13721b(w7Var), false, false));
            }
            if (i == 36) {
                return new C2242c7(new C2984w6(m13721b(w7Var)));
            }
            if (i == 89) {
                return new C2242c7(new C2539k6(w7Var.f19513c));
            }
            if (i == 138) {
                return new C2242c7(new C2502j6(w7Var.f19512b));
            }
            if (i == 172) {
                return new C2242c7(new C2278d6(w7Var.f19512b));
            }
            if (i == 257) {
                return new C2614m7(new C2205b7("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new C2614m7(new C2205b7("application/x-scte35"));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new C2242c7(new C2390g6(false, w7Var.f19512b));
                            case 16:
                                return new C2242c7(new C2762q6(m13722c(w7Var)));
                            case 17:
                                return new C2242c7(new C3058y6(w7Var.f19512b));
                            default:
                                return null;
                        }
                    }
                }
                return new C2242c7(new C2167a6(w7Var.f19512b));
            }
        }
        return new C2242c7(new C2650n6(m13722c(w7Var)));
    }
}
