package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ar */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2188ar {

    /* renamed from: a */
    public final List f6732a;

    /* renamed from: b */
    public final int f6733b;

    private C2188ar(List list, int i) {
        this.f6732a = list;
        this.f6733b = i;
    }

    /* renamed from: a */
    public static C2188ar m9951a(C2633mq mqVar) throws C2885ti {
        List list;
        try {
            mqVar.mo12412w(21);
            int g = mqVar.mo12396g() & 3;
            int g2 = mqVar.mo12396g();
            int c = mqVar.mo12392c();
            int i = 0;
            for (int i2 = 0; i2 < g2; i2++) {
                mqVar.mo12412w(1);
                int j = mqVar.mo12399j();
                for (int i3 = 0; i3 < j; i3++) {
                    int j2 = mqVar.mo12399j();
                    i += j2 + 4;
                    mqVar.mo12412w(j2);
                }
            }
            mqVar.mo12411v(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < g2; i5++) {
                mqVar.mo12412w(1);
                int j3 = mqVar.mo12399j();
                for (int i6 = 0; i6 < j3; i6++) {
                    int j4 = mqVar.mo12399j();
                    System.arraycopy(C2559kq.f12213a, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(mqVar.f13448a, mqVar.mo12392c(), bArr, i7, j4);
                    i4 = i7 + j4;
                    mqVar.mo12412w(j4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C2188ar(list, g + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C2885ti("Error parsing HEVC config", e);
        }
    }
}
