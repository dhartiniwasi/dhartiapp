package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class lr0 {

    /* renamed from: a */
    private final ArrayList f12895a = new ArrayList();

    /* renamed from: b */
    private long f12896b;

    lr0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo12067a() {
        Iterator it = this.f12895a.iterator();
        while (it.hasNext()) {
            Map a = ((C2818rp) it.next()).mo13020a();
            if (a != null) {
                for (Map.Entry entry : a.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            this.f12896b = Math.max(this.f12896b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f12896b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12068b(C2818rp rpVar) {
        this.f12895a.add(rpVar);
    }
}
