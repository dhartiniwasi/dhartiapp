package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.ys */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3080ys {

    /* renamed from: a */
    private final int f20796a;

    /* renamed from: b */
    private final C2969vs f20797b = new C2190at();

    public C3080ys(int i) {
        this.f20796a = i;
    }

    /* renamed from: a */
    public final String mo15504a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append(10);
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        C3043xs xsVar = new C3043xs();
        PriorityQueue priorityQueue = new PriorityQueue(this.f20796a, new C3006ws(this));
        for (String b : split) {
            String[] b2 = C3117zs.m24770b(b, false);
            if (b2.length != 0) {
                C2301dt.m11665c(b2, this.f20796a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                xsVar.f20335b.write(this.f20797b.mo8528b(((C2264ct) it.next()).f7893b));
            } catch (IOException e) {
                pm0.m18665e("Error while writing hash to byteStream", e);
            }
        }
        return xsVar.toString();
    }
}
