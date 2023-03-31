package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class y83 extends lb3 {

    /* renamed from: a */
    final /* synthetic */ a93 f20529a;

    y83(a93 a93) {
        this.f20529a = a93;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Map mo11963b() {
        return this.f20529a;
    }

    public final boolean contains(Object obj) {
        return u93.m21494a(this.f20529a.f6490c.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new z83(this.f20529a);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        o93.m17642t(this.f20529a.f6491d, entry.getKey());
        return true;
    }
}
