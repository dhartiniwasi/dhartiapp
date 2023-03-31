package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import p007a5.C0104a;
import p017b5.C1787b;
import p033d5.C4087c;
import p033d5.C4099e;
import p033d5.C4130o;
import p033d5.C4144s;
import p033d5.C4147t;
import p067i5.C4688b;
import p180z4.C6362b;
import p218e6.C9965d;
import p218e6.C9975i;

/* renamed from: com.google.android.gms.common.api.internal.s0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class C2124s0<T> implements C9965d<T> {

    /* renamed from: a */
    private final C2076c f6280a;

    /* renamed from: b */
    private final int f6281b;

    /* renamed from: c */
    private final C1787b<?> f6282c;

    /* renamed from: d */
    private final long f6283d;

    /* renamed from: e */
    private final long f6284e;

    C2124s0(C2076c cVar, int i, C1787b<?> bVar, long j, long j2, String str, String str2) {
        this.f6280a = cVar;
        this.f6281b = i;
        this.f6282c = bVar;
        this.f6283d = j;
        this.f6284e = j2;
    }

    /* renamed from: b */
    static <T> C2124s0<T> m9453b(C2076c cVar, int i, C1787b<?> bVar) {
        boolean z;
        if (!cVar.mo8043f()) {
            return null;
        }
        C4147t a = C4144s.m28227b().mo17459a();
        if (a == null) {
            z = true;
        } else if (!a.mo17465K1()) {
            return null;
        } else {
            z = a.mo17466L1();
            C2115o0 w = cVar.mo8047w(bVar);
            if (w != null) {
                if (!(w.mo8113t() instanceof C4087c)) {
                    return null;
                }
                C4087c cVar2 = (C4087c) w.mo8113t();
                if (cVar2.mo17328N() && !cVar2.mo17344f()) {
                    C4099e c = m9454c(w, cVar2, i);
                    if (c == null) {
                        return null;
                    }
                    w.mo8100E();
                    z = c.mo17380M1();
                }
            }
        }
        return new C2124s0(cVar, i, bVar, z ? System.currentTimeMillis() : 0, z ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    /* renamed from: c */
    private static C4099e m9454c(C2115o0<?> o0Var, C4087c<?> cVar, int i) {
        int[] J1;
        int[] K1;
        C4099e L = cVar.mo17326L();
        if (L == null || !L.mo17379L1() || ((J1 = L.mo17377J1()) != null ? !C4688b.m30367b(J1, i) : !((K1 = L.mo17378K1()) == null || !C4688b.m30367b(K1, i))) || o0Var.mo8111q() >= L.mo17376I1()) {
            return null;
        }
        return L;
    }

    /* renamed from: a */
    public final void mo283a(C9975i<T> iVar) {
        C2115o0 w;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int i7;
        if (this.f6280a.mo8043f()) {
            C4147t a = C4144s.m28227b().mo17459a();
            if ((a == null || a.mo17465K1()) && (w = this.f6280a.mo8047w(this.f6282c)) != null && (w.mo8113t() instanceof C4087c)) {
                C4087c cVar = (C4087c) w.mo8113t();
                boolean z = true;
                boolean z2 = this.f6283d > 0;
                int D = cVar.mo17320D();
                if (a != null) {
                    boolean L1 = z2 & a.mo17466L1();
                    int I1 = a.mo17463I1();
                    int J1 = a.mo17464J1();
                    i3 = a.mo17467M1();
                    if (cVar.mo17328N() && !cVar.mo17344f()) {
                        C4099e c = m9454c(w, cVar, this.f6281b);
                        if (c != null) {
                            if (!c.mo17380M1() || this.f6283d <= 0) {
                                z = false;
                            }
                            J1 = c.mo17376I1();
                            L1 = z;
                        } else {
                            return;
                        }
                    }
                    i2 = I1;
                    i = J1;
                } else {
                    i3 = 0;
                    i2 = 5000;
                    i = 100;
                }
                C2076c cVar2 = this.f6280a;
                if (iVar.mo26362q()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (iVar.mo26360o()) {
                        i5 = 100;
                    } else {
                        Exception l = iVar.mo26357l();
                        if (l instanceof C0104a) {
                            Status a2 = ((C0104a) l).mo251a();
                            int J12 = a2.mo7950J1();
                            C6362b I12 = a2.mo7949I1();
                            if (I12 == null) {
                                i7 = -1;
                            } else {
                                i7 = I12.mo21751I1();
                            }
                            i4 = i7;
                            i5 = J12;
                        } else {
                            i5 = C8710R.styleable.AppCompatTheme_switchStyle;
                        }
                    }
                    i4 = -1;
                }
                if (z2) {
                    long j3 = this.f6283d;
                    j = System.currentTimeMillis();
                    j2 = j3;
                    i6 = (int) (SystemClock.elapsedRealtime() - this.f6284e);
                } else {
                    j2 = 0;
                    j = 0;
                    i6 = -1;
                }
                cVar2.mo8037F(new C4130o(this.f6281b, i5, i4, j2, j, (String) null, (String) null, D, i6), i3, (long) i2, i);
            }
        }
    }
}
