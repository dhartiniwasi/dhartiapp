package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class p83 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final n73 f15748a;

    /* renamed from: b */
    private final o83 f15749b;

    private p83(o83 o83) {
        m73 m73 = m73.f13249b;
        this.f15749b = o83;
        this.f15748a = m73;
    }

    /* renamed from: b */
    public static p83 m18399b(int i) {
        return new p83(new l83(4000));
    }

    /* renamed from: c */
    public static p83 m18400c(n73 n73) {
        return new p83(new j83(n73));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final Iterator m18402g(CharSequence charSequence) {
        return this.f15749b.mo11340a(this, charSequence);
    }

    /* renamed from: d */
    public final Iterable mo13167d(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new m83(this, charSequence);
    }

    /* renamed from: f */
    public final List mo13168f(CharSequence charSequence) {
        Iterator g = m18402g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
