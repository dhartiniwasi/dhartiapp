package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.dj */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2291dj {

    /* renamed from: a */
    private static final int[] f8287a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f8288b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f8289c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d */
    public static final /* synthetic */ int f8290d = 0;

    /* renamed from: a */
    public static int m11525a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f8287a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: b */
    public static C2774qi m11526b(C2633mq mqVar, String str, String str2, C2813rk rkVar) {
        int i = f8288b[(mqVar.mo12396g() & 192) >> 6];
        int g = mqVar.mo12396g();
        int i2 = f8289c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return C2774qi.m19214g(str, "audio/ac3", (String) null, -1, -1, i2, i, (List) null, rkVar, 0, str2);
    }

    /* renamed from: c */
    public static C2774qi m11527c(C2633mq mqVar, String str, String str2, C2813rk rkVar) {
        C2633mq mqVar2 = mqVar;
        mqVar.mo12412w(2);
        int i = f8288b[(mqVar.mo12396g() & 192) >> 6];
        int g = mqVar.mo12396g();
        int i2 = f8289c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return C2774qi.m19214g(str, "audio/eac3", (String) null, -1, -1, i2, i, (List) null, rkVar, 0, str2);
    }
}
