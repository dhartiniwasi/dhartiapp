package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.dt */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2301dt {
    /* renamed from: a */
    static long m11663a(long j, int i) {
        if (i == 1) {
            return j;
        }
        return ((i & 1) == 0 ? m11663a((j * j) % 1073807359, i >> 1) : j * (m11663a((j * j) % 1073807359, i >> 1) % 1073807359)) % 1073807359;
    }

    /* renamed from: b */
    static String m11664b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            pm0.m18664d("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: c */
    public static void m11665c(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        String[] strArr2 = strArr;
        int length = strArr2.length;
        if (length < 6) {
            m11666d(i, m11667e(strArr2, 0, length), m11664b(strArr2, 0, length), length, priorityQueue);
            return;
        }
        long e = m11667e(strArr2, 0, 6);
        m11666d(i, e, m11664b(strArr2, 0, 6), 6, priorityQueue);
        long a = m11663a(16785407, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr2.length;
            if (i3 < length2 - 5) {
                e = ((((((e + 1073807359) - ((((((long) C3117zs.m24769a(strArr2[i3 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) C3117zs.m24769a(strArr2[i3 + 5])) + 2147483647L) % 1073807359)) % 1073807359;
                m11666d(i, e, m11664b(strArr2, i3, 6), length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    static void m11666d(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        C2264ct ctVar = new C2264ct(j, str, i2);
        if ((priorityQueue.size() != i || (((C2264ct) priorityQueue.peek()).f7894c <= ctVar.f7894c && ((C2264ct) priorityQueue.peek()).f7892a <= ctVar.f7892a)) && !priorityQueue.contains(ctVar)) {
            priorityQueue.add(ctVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: e */
    private static long m11667e(String[] strArr, int i, int i2) {
        long a = (((long) C3117zs.m24769a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) C3117zs.m24769a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
