package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ho4 {

    /* renamed from: a */
    private final y22 f10443a = new y22(10);

    /* renamed from: a */
    public final k60 mo10887a(rn4 rn4, C2348f2 f2Var) throws IOException {
        k60 k60 = null;
        int i = 0;
        while (true) {
            try {
                ((fn4) rn4).mo9986i(this.f10443a.mo15295h(), 0, 10, false);
                this.f10443a.mo15293f(0);
                if (this.f10443a.mo15308u() != 4801587) {
                    break;
                }
                this.f10443a.mo15294g(3);
                int r = this.f10443a.mo15305r();
                int i2 = r + 10;
                if (k60 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f10443a.mo15295h(), 0, bArr, 0, 10);
                    ((fn4) rn4).mo9986i(bArr, 10, r, false);
                    k60 = C2423h2.m13659a(bArr, i2, f2Var, new C2422h1());
                } else {
                    ((fn4) rn4).mo10217m(r, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        rn4.mo9981W();
        ((fn4) rn4).mo10217m(i, false);
        return k60;
    }
}
