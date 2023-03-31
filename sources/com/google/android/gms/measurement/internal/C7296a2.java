package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Map;
import p033d5.C4141r;
import p124r.C5413a;

/* renamed from: com.google.android.gms.measurement.internal.a2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7296a2 extends C7557y2 {

    /* renamed from: b */
    private final Map f32308b = new C5413a();

    /* renamed from: c */
    private final Map f32309c = new C5413a();

    /* renamed from: d */
    private long f32310d;

    public C7296a2(C7397j4 j4Var) {
        super(j4Var);
    }

    /* renamed from: g */
    static /* synthetic */ void m41251g(C7296a2 a2Var, String str, long j) {
        a2Var.mo24189f();
        C4141r.m28217g(str);
        if (a2Var.f32309c.isEmpty()) {
            a2Var.f32310d = j;
        }
        Integer num = (Integer) a2Var.f32309c.get(str);
        if (num != null) {
            a2Var.f32309c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (a2Var.f32309c.size() >= 100) {
            a2Var.f32389a.mo24135l().mo24261w().mo24208a("Too many ads visible");
        } else {
            a2Var.f32309c.put(str, 1);
            a2Var.f32308b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m41252h(C7296a2 a2Var, String str, long j) {
        a2Var.mo24189f();
        C4141r.m28217g(str);
        Integer num = (Integer) a2Var.f32309c.get(str);
        if (num != null) {
            C7454o6 r = a2Var.f32389a.mo24420K().mo24700r(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                a2Var.f32309c.remove(str);
                Long l = (Long) a2Var.f32308b.get(str);
                if (l == null) {
                    a2Var.f32389a.mo24135l().mo24256q().mo24208a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    a2Var.f32308b.remove(str);
                    a2Var.m41255o(str, j - longValue, r);
                }
                if (a2Var.f32309c.isEmpty()) {
                    long j2 = a2Var.f32310d;
                    if (j2 == 0) {
                        a2Var.f32389a.mo24135l().mo24256q().mo24208a("First ad exposure time was never set");
                        return;
                    }
                    a2Var.m41254n(j - j2, r);
                    a2Var.f32310d = 0;
                    return;
                }
                return;
            }
            a2Var.f32309c.put(str, Integer.valueOf(intValue));
            return;
        }
        a2Var.f32389a.mo24135l().mo24256q().mo24209b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    /* renamed from: n */
    private final void m41254n(long j, C7454o6 o6Var) {
        if (o6Var == null) {
            this.f32389a.mo24135l().mo24260v().mo24208a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f32389a.mo24135l().mo24260v().mo24209b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C7391i9.m41605y(o6Var, bundle, true);
            this.f32389a.mo24418I().mo24356u("am", "_xa", bundle);
        }
    }

    /* renamed from: o */
    private final void m41255o(String str, long j, C7454o6 o6Var) {
        if (o6Var == null) {
            this.f32389a.mo24135l().mo24260v().mo24208a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f32389a.mo24135l().mo24260v().mo24209b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C7391i9.m41605y(o6Var, bundle, true);
            this.f32389a.mo24418I().mo24356u("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m41256p(long j) {
        for (String put : this.f32308b.keySet()) {
            this.f32308b.put(put, Long.valueOf(j));
        }
        if (!this.f32308b.isEmpty()) {
            this.f32310d = j;
        }
    }

    /* renamed from: j */
    public final void mo24089j(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Ad unit id must be a non-empty string");
        } else {
            this.f32389a.mo24143s().mo24309z(new C7293a(this, str, j));
        }
    }

    /* renamed from: k */
    public final void mo24090k(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f32389a.mo24135l().mo24256q().mo24208a("Ad unit id must be a non-empty string");
        } else {
            this.f32389a.mo24143s().mo24309z(new C7554y(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo24091m(long j) {
        C7454o6 r = this.f32389a.mo24420K().mo24700r(false);
        for (String str : this.f32308b.keySet()) {
            m41255o(str, j - ((Long) this.f32308b.get(str)).longValue(), r);
        }
        if (!this.f32308b.isEmpty()) {
            m41254n(j - this.f32310d, r);
        }
        m41256p(j);
    }
}
