package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class m83 implements Iterable {

    /* renamed from: a */
    final /* synthetic */ CharSequence f13267a;

    /* renamed from: b */
    final /* synthetic */ p83 f13268b;

    m83(p83 p83, CharSequence charSequence) {
        this.f13268b = p83;
        this.f13267a = charSequence;
    }

    public final Iterator iterator() {
        return this.f13268b.m18402g(this.f13267a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(r73.m19603a(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append(", ");
                    sb.append(r73.m19603a(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
