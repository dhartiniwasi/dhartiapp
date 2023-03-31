package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rz3 {

    /* renamed from: a */
    private final ArrayDeque f17152a = new ArrayDeque();

    /* synthetic */ rz3(qz3 qz3) {
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ jw3 m20089a(rz3 rz3, jw3 jw3, jw3 jw32) {
        rz3.m20090b(jw3);
        rz3.m20090b(jw32);
        jw3 jw33 = (jw3) rz3.f17152a.pop();
        while (!rz3.f17152a.isEmpty()) {
            jw33 = new vz3((jw3) rz3.f17152a.pop(), jw33);
        }
        return jw33;
    }

    /* renamed from: b */
    private final void m20090b(jw3 jw3) {
        if (jw3.mo10025t()) {
            int c = m20091c(jw3.mo9361q());
            int V = vz3.m22500V(c + 1);
            if (this.f17152a.isEmpty() || ((jw3) this.f17152a.peek()).mo9361q() >= V) {
                this.f17152a.push(jw3);
                return;
            }
            int V2 = vz3.m22500V(c);
            jw3 jw32 = (jw3) this.f17152a.pop();
            while (!this.f17152a.isEmpty() && ((jw3) this.f17152a.peek()).mo9361q() < V2) {
                jw32 = new vz3((jw3) this.f17152a.pop(), jw32);
            }
            vz3 vz3 = new vz3(jw32, jw3);
            while (!this.f17152a.isEmpty() && ((jw3) this.f17152a.peek()).mo9361q() < vz3.m22500V(m20091c(vz3.mo9361q()) + 1)) {
                vz3 = new vz3((jw3) this.f17152a.pop(), vz3);
            }
            this.f17152a.push(vz3);
        } else if (jw3 instanceof vz3) {
            vz3 vz32 = (vz3) jw3;
            m20090b(vz32.f19387f);
            m20090b(vz32.f19388g);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(jw3.getClass())));
        }
    }

    /* renamed from: c */
    private static final int m20091c(int i) {
        int binarySearch = Arrays.binarySearch(vz3.f19385r, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
