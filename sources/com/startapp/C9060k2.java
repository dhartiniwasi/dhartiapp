package com.startapp;

import android.content.Context;
import com.facebook.ads.AdError;
import com.startapp.networkTest.data.TimeInfo;
import java.util.TimeZone;

/* renamed from: com.startapp.k2 */
/* compiled from: Sta */
public class C9060k2 {
    /* renamed from: a */
    public static String m48732a(long j) {
        return m48733a(j, false);
    }

    /* renamed from: b */
    public static String m48736b(long j) {
        return m48733a(j, true);
    }

    /* renamed from: c */
    public static C9040j2 m48737c(long j) {
        return m48726a(j, TimeZone.getDefault().getOffset(j));
    }

    /* renamed from: a */
    public static String m48734a(Context context) {
        return m48736b(C9603va.m50435d());
    }

    /* renamed from: b */
    public static String m48735b(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        if (i < 10) {
            sb.append("0");
        }
        sb.append(i);
        sb.append("-");
        if (i2 < 10) {
            sb.append("0");
        }
        sb.append(i2);
        sb.append("-");
        if (i3 < 10) {
            sb.append("0");
        }
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m48733a(long j, boolean z) {
        C9040j2 c = m48737c(j);
        return m48731a(c.f36981a, c.f36982b, c.f36983c, c.f36984d, c.f36985e, c.f36986f, c.f36987g, z, c.f36988h);
    }

    /* renamed from: a */
    public static C9040j2 m48726a(long j, int i) {
        int i2;
        long j2 = ((long) i) + j;
        long j3 = j2 / 1000;
        int i3 = (int) (j2 % 1000);
        long j4 = j3 / 60;
        int i4 = (int) (j3 % 60);
        long j5 = j4 / 60;
        int i5 = (int) (j4 % 60);
        int i6 = (int) (j5 / 24);
        int i7 = (int) (j5 % 24);
        int i8 = 365;
        int i9 = 1;
        int i10 = 1970;
        int i11 = 0;
        boolean z = false;
        while (true) {
            i2 = i6 + 1;
            if (i8 >= i2) {
                break;
            }
            i10++;
            int i12 = i8 + 365;
            if ((i10 % 4 != 0 || i10 % 100 == 0) && i10 % 400 != 0) {
                z = false;
            } else {
                i12++;
                z = true;
            }
            int i13 = i12;
            i11 = i8;
            i8 = i13;
        }
        int i14 = i2 - i11;
        int i15 = 0;
        int i16 = 31;
        while (i16 < i14) {
            i9++;
            int i17 = i16;
            i16 = (!z || i9 != 2) ? i9 == 2 ? i16 + 28 : (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) ? i16 + 30 : i16 + 31 : i16 + 29;
            i15 = i17;
        }
        return new C9040j2(i10, i9, i14 - i15, i7, i5, i4, i3, i);
    }

    /* renamed from: a */
    public static String m48728a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("-");
        if (i2 < 10) {
            sb.append("0");
        }
        sb.append(i2);
        sb.append("-");
        if (i3 < 10) {
            sb.append("0");
        }
        sb.append(i3);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m48729a(int i, int i2, int i3, int i4, int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("-");
        if (i2 < 10) {
            sb.append("0");
        }
        sb.append(i2);
        sb.append("-");
        if (i3 < 10) {
            sb.append("0");
        }
        sb.append(i3);
        sb.append("-");
        if (i4 < 10) {
            sb.append("0");
        }
        sb.append(i4);
        sb.append("-");
        if (i5 < 10) {
            sb.append("0");
        }
        sb.append(i5);
        sb.append("-");
        if (i6 < 10) {
            sb.append("0");
        }
        sb.append(i6);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m48730a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String a = m48729a(i, i2, i3, i4, i5, i6);
        String a2 = C9183o2.m49083a("", i7);
        if (i7 < 10) {
            a2 = C9183o2.m49083a("00", i7);
        } else if (i7 < 100) {
            a2 = C9183o2.m49083a("0", i7);
        }
        return a + "-" + a2;
    }

    /* renamed from: a */
    public static String m48731a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8) {
        int i9 = i2;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        int i13 = i6;
        int i14 = i7;
        int i15 = i8;
        String a = C9183o2.m49083a("", i10);
        String a2 = C9183o2.m49083a("", i9);
        String a3 = C9183o2.m49083a("", i11);
        String a4 = C9183o2.m49083a("", i12);
        String a5 = C9183o2.m49083a("", i13);
        String a6 = C9183o2.m49083a("", i14);
        if (i10 < 10) {
            a = C9183o2.m49083a("0", i10);
        }
        if (i9 < 10) {
            a2 = C9183o2.m49083a("0", i9);
        }
        if (i11 < 10) {
            a3 = C9183o2.m49083a("0", i11);
        }
        if (i12 < 10) {
            a4 = C9183o2.m49083a("0", i12);
        }
        if (i13 < 10) {
            a5 = C9183o2.m49083a("0", i13);
        }
        if (i14 < 10) {
            a6 = C9183o2.m49083a("00", i14);
        } else if (i14 < 100) {
            a6 = C9183o2.m49083a("0", i14);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String str = "-";
        sb.append(str);
        sb.append(a2);
        sb.append(str);
        sb.append(a);
        sb.append(" ");
        sb.append(a3);
        sb.append(":");
        sb.append(a4);
        sb.append(":");
        sb.append(a5);
        sb.append(".");
        sb.append(a6);
        String sb2 = sb.toString();
        if (!z) {
            return sb2;
        }
        int i16 = (i15 / AdError.NETWORK_ERROR_CODE) / 60;
        if (i15 < 0) {
            i16 *= -1;
        } else {
            str = "+";
        }
        int i17 = i16 / 60;
        int i18 = i16 % 60;
        String a7 = C9183o2.m49083a("", i17);
        String a8 = C9183o2.m49083a("", i18);
        if (i17 < 10) {
            a7 = C9183o2.m49083a("0", i17);
        }
        if (i18 < 10) {
            a8 = C9183o2.m49083a("0", i18);
        }
        return sb2 + " " + str + a7 + a8;
    }

    /* renamed from: a */
    public static TimeInfo m48727a(TimeInfo timeInfo, long j) {
        TimeInfo timeInfo2 = new TimeInfo();
        timeInfo2.DeviceDriftMillis = timeInfo.DeviceDriftMillis;
        timeInfo2.IsSynced = timeInfo.IsSynced;
        timeInfo2.MillisSinceLastSync = timeInfo.MillisSinceLastSync;
        timeInfo2.TimeSource = timeInfo.TimeSource;
        timeInfo2.TimestampDateTime = m48732a(timeInfo.TimestampMillis + j);
        timeInfo2.TimestampMillis = timeInfo.TimestampMillis + j;
        timeInfo2.TimestampOffset = timeInfo.TimestampOffset;
        timeInfo2.TimestampTableau = m48736b(timeInfo.TimestampMillis + j);
        return timeInfo2;
    }
}
