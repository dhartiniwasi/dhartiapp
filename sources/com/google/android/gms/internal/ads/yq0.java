package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yq0 implements Iterable {

    /* renamed from: a */
    private final List f20783a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final xq0 mo15495b(ap0 ap0) {
        Iterator it = iterator();
        while (it.hasNext()) {
            xq0 xq0 = (xq0) it.next();
            if (xq0.f20325c == ap0) {
                return xq0;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo15496c(xq0 xq0) {
        this.f20783a.add(xq0);
    }

    /* renamed from: f */
    public final void mo15497f(xq0 xq0) {
        this.f20783a.remove(xq0);
    }

    /* renamed from: i */
    public final boolean mo15498i(ap0 ap0) {
        ArrayList<xq0> arrayList = new ArrayList<>();
        Iterator it = iterator();
        while (it.hasNext()) {
            xq0 xq0 = (xq0) it.next();
            if (xq0.f20325c == ap0) {
                arrayList.add(xq0);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (xq0 xq02 : arrayList) {
            xq02.f20326d.mo10621h();
        }
        return true;
    }

    public final Iterator iterator() {
        return this.f20783a.iterator();
    }
}
