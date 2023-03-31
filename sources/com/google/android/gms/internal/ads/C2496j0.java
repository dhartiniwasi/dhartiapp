package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2496j0 implements C2161a0 {

    /* renamed from: a */
    public final ua3 f11152a;

    /* renamed from: b */
    private final int f11153b;

    private C2496j0(int i, ua3 ua3) {
        this.f11153b = i;
        this.f11152a = ua3;
    }

    /* renamed from: b */
    public static C2496j0 m14614b(int i, y22 y22) {
        String str;
        y22 y222 = y22;
        ra3 ra3 = new ra3();
        int l = y22.mo15299l();
        int i2 = -2;
        while (y22.mo15296i() > 8) {
            int o = y22.mo15302o();
            int k = y22.mo15298k() + y22.mo15302o();
            y222.mo15292e(k);
            C2161a0 a0Var = null;
            if (o != 1414744396) {
                switch (o) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 != 1) {
                                ot1.m18060e("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(gb2.m13181o(i2)));
                                break;
                            } else {
                                int q = y22.mo15304q();
                                String str2 = q != 1 ? q != 85 ? q != 255 ? q != 8192 ? q != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int q2 = y22.mo15304q();
                                    int o2 = y22.mo15302o();
                                    y222.mo15294g(6);
                                    int X = gb2.m13154X(y22.mo15310w());
                                    int q3 = y22.mo15304q();
                                    byte[] bArr = new byte[q3];
                                    y222.mo15289b(bArr, 0, q3);
                                    C2311e2 e2Var = new C2311e2();
                                    e2Var.mo9776s(str2);
                                    e2Var.mo9759e0(q2);
                                    e2Var.mo9777t(o2);
                                    if ("audio/raw".equals(str2) && X != 0) {
                                        e2Var.mo9771n(X);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && q3 > 0) {
                                        e2Var.mo9766i(ua3.m21509x(bArr));
                                    }
                                    a0Var = new C2533k0(e2Var.mo9782y());
                                    break;
                                } else {
                                    ot1.m18060e("StreamFormatChunk", "Ignoring track with unsupported format tag " + q);
                                    break;
                                }
                            }
                        } else {
                            y222.mo15294g(4);
                            int o3 = y22.mo15302o();
                            int o4 = y22.mo15302o();
                            y222.mo15294g(4);
                            int o5 = y22.mo15302o();
                            switch (o5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                C2311e2 e2Var2 = new C2311e2();
                                e2Var2.mo9781x(o3);
                                e2Var2.mo9760f(o4);
                                e2Var2.mo9776s(str);
                                a0Var = new C2533k0(e2Var2.mo9782y());
                                break;
                            } else {
                                ot1.m18060e("StreamFormatChunk", "Ignoring track with unsupported compression " + o5);
                                break;
                            }
                        }
                    case 1751742049:
                        a0Var = C2384g0.m12975a(y22);
                        break;
                    case 1752331379:
                        a0Var = C2421h0.m13651a(y22);
                        break;
                    case 1852994675:
                        a0Var = C2570l0.m15717a(y22);
                        break;
                }
            } else {
                a0Var = m14614b(y22.mo15302o(), y222);
            }
            if (a0Var != null) {
                if (a0Var.zza() == 1752331379) {
                    int i3 = ((C2421h0) a0Var).f10134a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        ot1.m18060e("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                ra3.mo13701f(a0Var);
            }
            y222.mo15293f(k);
            y222.mo15292e(l);
        }
        return new C2496j0(i, ra3.mo13703h());
    }

    /* renamed from: a */
    public final C2161a0 mo11272a(Class cls) {
        ua3 ua3 = this.f11152a;
        int size = ua3.size();
        int i = 0;
        while (i < size) {
            C2161a0 a0Var = (C2161a0) ua3.get(i);
            i++;
            if (a0Var.getClass() == cls) {
                return a0Var;
            }
        }
        return null;
    }

    public final int zza() {
        return this.f11153b;
    }
}
