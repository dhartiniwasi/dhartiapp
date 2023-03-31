package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class bb3 extends v83 {

    /* renamed from: c */
    final /* synthetic */ Iterator f7198c;

    /* renamed from: d */
    final /* synthetic */ c83 f7199d;

    bb3(Iterator it, c83 c83) {
        this.f7198c = it;
        this.f7199d = c83;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo8716a() {
        while (this.f7198c.hasNext()) {
            Object next = this.f7198c.next();
            if (this.f7199d.mo8567b(next)) {
                return next;
            }
        }
        mo14695c();
        return null;
    }
}
