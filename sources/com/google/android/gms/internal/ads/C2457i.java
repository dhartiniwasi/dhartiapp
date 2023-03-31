package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2457i {
    /* renamed from: a */
    public static List m14087a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m14089c(m14088b((long) (((b & 255) << 8) | (b2 & 255)))));
        arrayList.add(m14089c(m14088b(3840)));
        return arrayList;
    }

    /* renamed from: b */
    private static long m14088b(long j) {
        return (j * 1000000000) / 48000;
    }

    /* renamed from: c */
    private static byte[] m14089c(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
