package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class r82 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ long f16865a;

    /* renamed from: b */
    final /* synthetic */ String f16866b;

    /* renamed from: c */
    final /* synthetic */ is2 f16867c;

    /* renamed from: d */
    final /* synthetic */ ls2 f16868d;

    /* renamed from: e */
    final /* synthetic */ nz2 f16869e;

    /* renamed from: f */
    final /* synthetic */ us2 f16870f;

    /* renamed from: g */
    final /* synthetic */ s82 f16871g;

    r82(s82 s82, long j, String str, is2 is2, ls2 ls2, nz2 nz2, us2 us2) {
        this.f16871g = s82;
        this.f16865a = j;
        this.f16866b = str;
        this.f16867c = is2;
        this.f16868d = ls2;
        this.f16869e = nz2;
        this.f16870f = us2;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        Integer num;
        C4623z2 z2Var;
        C4623z2 b;
        long b2 = this.f16871g.f17299a.mo18371b() - this.f16865a;
        int i = 6;
        if (th instanceof TimeoutException) {
            num = null;
            i = 2;
        } else if (th instanceof h82) {
            num = null;
            i = 3;
        } else if (th instanceof CancellationException) {
            num = null;
            i = 4;
        } else if (th instanceof jt2) {
            num = null;
            i = 5;
        } else {
            if (th instanceof cz1) {
                if (eu2.m12268a(th).f25062a == 3) {
                    i = 1;
                }
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14699u1)).booleanValue() && (th instanceof h52) && (b = ((h52) th).mo10736b()) != null) {
                    num = Integer.valueOf(b.f25062a);
                }
            }
            num = null;
        }
        s82.m20199g(this.f16871g, this.f16866b, i, b2, this.f16867c.f10983h0, num);
        s82 s82 = this.f16871g;
        if (s82.f17303e) {
            s82.f17300b.mo14249a(this.f16868d, this.f16867c, i, th instanceof h52 ? (h52) th : null, b2);
        }
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14585i7)).booleanValue()) {
            rz2 c = this.f16871g.f17301c;
            nz2 nz2 = this.f16869e;
            us2 us2 = this.f16870f;
            is2 is2 = this.f16867c;
            c.mo13910d(nz2.mo12731c(us2, is2, is2.f10996o));
        }
        C4623z2 a = eu2.m12268a(th);
        int i2 = a.f25062a;
        if ((i2 == 3 || i2 == 0) && (z2Var = a.f25065d) != null && !z2Var.f25064c.equals("com.google.android.gms.ads")) {
            a = eu2.m12268a(new h52(13, a.f25065d));
        }
        this.f16871g.f17304f.mo11023e(this.f16867c, b2, a);
    }

    /* renamed from: c */
    public final void mo8530c(Object obj) {
        long b = this.f16871g.f17299a.mo18371b() - this.f16865a;
        s82.m20199g(this.f16871g, this.f16866b, 0, b, this.f16867c.f10983h0, (Integer) null);
        s82 s82 = this.f16871g;
        if (s82.f17303e) {
            s82.f17300b.mo14249a(this.f16868d, this.f16867c, 0, (h52) null, b);
        }
        this.f16871g.f17304f.mo11024f(this.f16867c, b, (C4623z2) null);
    }
}
