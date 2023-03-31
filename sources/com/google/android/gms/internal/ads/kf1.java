package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class kf1 {

    /* renamed from: a */
    protected final Map f12066a = new HashMap();

    protected kf1(Set set) {
        mo11670n0(set);
    }

    /* renamed from: l0 */
    public final synchronized void mo11668l0(jh1 jh1) {
        mo11669m0(jh1.f11607a, jh1.f11608b);
    }

    /* renamed from: m0 */
    public final synchronized void mo11669m0(Object obj, Executor executor) {
        this.f12066a.put(obj, executor);
    }

    /* renamed from: n0 */
    public final synchronized void mo11670n0(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            mo11668l0((jh1) it.next());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final synchronized void mo11671o0(jf1 jf1) {
        for (Map.Entry entry : this.f12066a.entrySet()) {
            ((Executor) entry.getValue()).execute(new if1(jf1, entry.getKey()));
        }
    }
}
