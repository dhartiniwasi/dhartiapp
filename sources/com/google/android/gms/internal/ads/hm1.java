package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class hm1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CopyOnWriteArraySet f10421a;

    /* renamed from: b */
    public final /* synthetic */ int f10422b;

    /* renamed from: c */
    public final /* synthetic */ in1 f10423c;

    public /* synthetic */ hm1(CopyOnWriteArraySet copyOnWriteArraySet, int i, in1 in1) {
        this.f10421a = copyOnWriteArraySet;
        this.f10422b = i;
        this.f10423c = in1;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.f10421a;
        int i = this.f10422b;
        in1 in1 = this.f10423c;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((kp1) it.next()).mo11751a(i, in1);
        }
    }
}
