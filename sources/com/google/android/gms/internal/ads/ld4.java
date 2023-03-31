package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ld4 {

    /* renamed from: a */
    public final int f12748a;

    /* renamed from: b */
    public final mg4 f12749b;

    /* renamed from: c */
    private final CopyOnWriteArrayList f12750c;

    public ld4() {
        this(new CopyOnWriteArrayList(), 0, (mg4) null);
    }

    private ld4(CopyOnWriteArrayList copyOnWriteArrayList, int i, mg4 mg4) {
        this.f12750c = copyOnWriteArrayList;
        this.f12748a = i;
        this.f12749b = mg4;
    }

    /* renamed from: a */
    public final ld4 mo11980a(int i, mg4 mg4) {
        return new ld4(this.f12750c, i, mg4);
    }

    /* renamed from: b */
    public final void mo11981b(Handler handler, md4 md4) {
        Objects.requireNonNull(md4);
        this.f12750c.add(new kd4(handler, md4));
    }

    /* renamed from: c */
    public final void mo11982c(md4 md4) {
        Iterator it = this.f12750c.iterator();
        while (it.hasNext()) {
            kd4 kd4 = (kd4) it.next();
            if (kd4.f12044b == md4) {
                this.f12750c.remove(kd4);
            }
        }
    }
}
