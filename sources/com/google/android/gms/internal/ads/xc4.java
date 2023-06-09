package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xc4 implements ic4 {
    protected xc4(wc4 wc4) {
    }

    /* renamed from: a */
    protected static int m23180a(int i, int i2, int i3) {
        return ad3.m9691a(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* renamed from: b */
    protected static int m23181b(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            default:
                throw new IllegalArgumentException();
        }
    }
}
