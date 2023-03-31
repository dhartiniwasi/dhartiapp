package com.startapp;

import com.startapp.simple.bloomfilter.algo.OpenBitSet;
import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.startapp.aa */
/* compiled from: Sta */
public class C8828aa {
    /* renamed from: a */
    public static String m48273a(List<String> list) {
        C9020i1 i1Var = new C9020i1();
        long currentTimeMillis = System.currentTimeMillis();
        BloomVersion bloomVersion = BloomVersion.FOUR;
        C8899d1 d1Var = i1Var.f36943b.f36970a.get(bloomVersion).f36930b;
        d1Var.getClass();
        OpenBitSet openBitSet = new OpenBitSet((long) (d1Var.f36666a * d1Var.f36667b));
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ByteBuffer wrap = ByteBuffer.wrap(it.next().getBytes());
            long c = openBitSet.mo31259c();
            int i = d1Var.f36666a;
            long[] jArr = new long[i];
            long j = c / ((long) i);
            long j2 = currentTimeMillis;
            long a = C8824a7.m48263a(wrap, wrap.position(), wrap.remaining(), 0);
            long a2 = C8824a7.m48263a(wrap, wrap.position(), wrap.remaining(), a);
            Iterator<String> it2 = it;
            int i2 = 0;
            while (i2 < d1Var.f36666a) {
                BloomVersion bloomVersion2 = bloomVersion;
                long j3 = (long) i2;
                jArr[i2] = Math.abs(((j3 * a2) + a) % j) + (j3 * j);
                i2++;
                bloomVersion = bloomVersion2;
                d1Var = d1Var;
            }
            BloomVersion bloomVersion3 = bloomVersion;
            C8899d1 d1Var2 = d1Var;
            for (int i3 = 0; i3 < i; i3++) {
                openBitSet.mo31258b(jArr[i3]);
            }
            bloomVersion = bloomVersion3;
            currentTimeMillis = j2;
            it = it2;
            d1Var = d1Var2;
        }
        long j4 = currentTimeMillis;
        BloomVersion bloomVersion4 = bloomVersion;
        C9643xa xaVar = i1Var.f36942a;
        xaVar.getClass();
        try {
            String a3 = xaVar.f39388a.mo29907a(openBitSet);
            C9663ya yaVar = xaVar.f39389b.f36970a.get(bloomVersion4).f36929a;
            return j4 + "-" + bloomVersion4.mo31270c() + "-" + yaVar.mo29326a(a3);
        } catch (Throwable unused) {
            return null;
        }
    }
}
