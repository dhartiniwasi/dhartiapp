package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.zg */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3105zg extends C2513jh {

    /* renamed from: i */
    private List f21081i = null;

    public C3105zg(C2993wf wfVar, String str, String str2, C3063yb ybVar, int i, int i2) {
        super(wfVar, "tPxcLkiesd8JzrYIyuRbLGxWAQfsX+C1jrJaS2rsRu6lU/ve1b9hEzSSzo6VwqXx", "0RWQk7vrKrAXtxwBYq7T9nI/JnUnK0yiZtx30+mk7/g=", ybVar, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo8332a() throws IllegalAccessException, InvocationTargetException {
        this.f11603e.mo15373O(-1);
        this.f11603e.mo15369K(-1);
        if (this.f21081i == null) {
            this.f21081i = (List) this.f11604f.invoke((Object) null, new Object[]{this.f11600b.mo14902b()});
        }
        List list = this.f21081i;
        if (list != null && list.size() == 2) {
            synchronized (this.f11603e) {
                this.f11603e.mo15373O(((Long) this.f21081i.get(0)).longValue());
                this.f11603e.mo15369K(((Long) this.f21081i.get(1)).longValue());
            }
        }
    }
}
