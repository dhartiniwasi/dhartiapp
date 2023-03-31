package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class kk4 {

    /* renamed from: a */
    private final CopyOnWriteArrayList f12141a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void mo11718a(Handler handler, lk4 lk4) {
        mo11720c(lk4);
        this.f12141a.add(new jk4(handler, lk4));
    }

    /* renamed from: b */
    public final void mo11719b(int i, long j, long j2) {
        Iterator it = this.f12141a.iterator();
        while (it.hasNext()) {
            jk4 jk4 = (jk4) it.next();
            if (!jk4.f11683c) {
                jk4.f11681a.post(new ik4(jk4, i, j, j2));
            }
        }
    }

    /* renamed from: c */
    public final void mo11720c(lk4 lk4) {
        Iterator it = this.f12141a.iterator();
        while (it.hasNext()) {
            jk4 jk4 = (jk4) it.next();
            if (jk4.f11682b == lk4) {
                jk4.mo11421c();
                this.f12141a.remove(jk4);
            }
        }
    }
}
