package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ia */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2468ia {

    /* renamed from: a */
    long f10704a;

    /* renamed from: b */
    final String f10705b;

    /* renamed from: c */
    final String f10706c;

    /* renamed from: d */
    final long f10707d;

    /* renamed from: e */
    final long f10708e;

    /* renamed from: f */
    final long f10709f;

    /* renamed from: g */
    final long f10710g;

    /* renamed from: h */
    final List f10711h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2468ia(java.lang.String r14, com.google.android.gms.internal.ads.C3023x8 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f20024b
            long r3 = r15.f20025c
            long r5 = r15.f20026d
            long r7 = r15.f20027e
            long r9 = r15.f20028f
            java.util.List r0 = r15.f20030h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map r15 = r15.f20029g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.g9 r11 = new com.google.android.gms.internal.ads.g9
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2468ia.<init>(java.lang.String, com.google.android.gms.internal.ads.x8):void");
    }

    /* renamed from: a */
    static C2468ia m14245a(C2506ja jaVar) throws IOException {
        List list;
        if (C2580la.m15894a(jaVar) == 538247942) {
            String e = C2580la.m15896e(jaVar);
            String e2 = C2580la.m15896e(jaVar);
            long b = C2580la.m15895b(jaVar);
            long b2 = C2580la.m15895b(jaVar);
            long b3 = C2580la.m15895b(jaVar);
            long b4 = C2580la.m15895b(jaVar);
            int a = C2580la.m15894a(jaVar);
            if (a >= 0) {
                if (a == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new ArrayList();
                }
                List list2 = list;
                for (int i = 0; i < a; i++) {
                    list2.add(new C2393g9(C2580la.m15896e(jaVar).intern(), C2580la.m15896e(jaVar).intern()));
                }
                return new C2468ia(e, e2, b, b2, b3, b4, list2);
            }
            throw new IOException("readHeaderList size=" + a);
        }
        throw new IOException();
    }

    private C2468ia(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f10705b = str;
        this.f10706c = true == "".equals(str2) ? null : str2;
        this.f10707d = j;
        this.f10708e = j2;
        this.f10709f = j3;
        this.f10710g = j4;
        this.f10711h = list;
    }
}
