package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class tz3 implements Iterator {

    /* renamed from: a */
    private final ArrayDeque f18301a;

    /* renamed from: b */
    private ew3 f18302b;

    /* synthetic */ tz3(jw3 jw3, sz3 sz3) {
        if (jw3 instanceof vz3) {
            vz3 vz3 = (vz3) jw3;
            ArrayDeque arrayDeque = new ArrayDeque(vz3.mo10024s());
            this.f18301a = arrayDeque;
            arrayDeque.push(vz3);
            this.f18302b = m21356c(vz3.f19387f);
            return;
        }
        this.f18301a = null;
        this.f18302b = (ew3) jw3;
    }

    /* renamed from: c */
    private final ew3 m21356c(jw3 jw3) {
        while (jw3 instanceof vz3) {
            vz3 vz3 = (vz3) jw3;
            this.f18301a.push(vz3);
            jw3 = vz3.f19387f;
        }
        return (ew3) jw3;
    }

    /* renamed from: a */
    public final ew3 next() {
        ew3 ew3;
        ew3 ew32 = this.f18302b;
        if (ew32 != null) {
            do {
                ArrayDeque arrayDeque = this.f18301a;
                ew3 = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.f18302b = ew3;
                } else {
                    ew3 = m21356c(((vz3) this.f18301a.pop()).f19388g);
                }
            } while (ew3.mo11529i());
            this.f18302b = ew3;
            return ew32;
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f18302b != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
