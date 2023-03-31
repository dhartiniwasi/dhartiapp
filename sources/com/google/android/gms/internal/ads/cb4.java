package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class cb4 {

    /* renamed from: a */
    private static final AudioAttributes f7678a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    /* renamed from: a */
    public static int m10821a(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(gb2.m13150T(i3)).build(), f7678a)) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int[] m10822b() {
        ra3 q = ua3.m21502q();
        uc3 j = db4.f8178e.keySet().iterator();
        while (j.hasNext()) {
            int intValue = ((Integer) j.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f7678a)) {
                q.mo13701f(Integer.valueOf(intValue));
            }
        }
        q.mo13701f(2);
        Object[] array = q.mo13703h().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            Objects.requireNonNull(obj);
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
