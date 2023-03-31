package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class gv1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final lv1 f10068a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f10069b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map f10070c;

    public gv1(lv1 lv1, Executor executor) {
        this.f10068a = lv1;
        this.f10070c = lv1.mo12155f();
        this.f10069b = executor;
    }

    /* renamed from: a */
    public final fv1 mo10653a() {
        fv1 fv1 = new fv1(this);
        fv1 unused = fv1.f9470a.putAll(fv1.f9471b.f10070c);
        return fv1;
    }
}
