package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.l */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7049l implements Iterator {

    /* renamed from: a */
    final /* synthetic */ Iterator f31801a;

    C7049l(Iterator it) {
        this.f31801a = it;
    }

    public final boolean hasNext() {
        return this.f31801a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new C7193u((String) this.f31801a.next());
    }
}
