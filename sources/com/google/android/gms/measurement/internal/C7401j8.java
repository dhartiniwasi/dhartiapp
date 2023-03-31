package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7031jd;

/* renamed from: com.google.android.gms.measurement.internal.j8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7401j8 {

    /* renamed from: a */
    protected long f32650a;

    /* renamed from: b */
    protected long f32651b;

    /* renamed from: c */
    private final C7447o f32652c;

    /* renamed from: d */
    final /* synthetic */ C7423l8 f32653d;

    public C7401j8(C7423l8 l8Var) {
        this.f32653d = l8Var;
        this.f32652c = new C7379h8(this, l8Var.f32389a);
        long b = l8Var.f32389a.mo24116a().mo18371b();
        this.f32650a = b;
        this.f32651b = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24447a() {
        this.f32652c.mo24587b();
        this.f32650a = 0;
        this.f32651b = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24448b(long j) {
        this.f32652c.mo24587b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo24449c(long j) {
        this.f32653d.mo24189f();
        this.f32652c.mo24587b();
        this.f32650a = j;
        this.f32651b = j;
    }

    /* renamed from: d */
    public final boolean mo24450d(boolean z, boolean z2, long j) {
        this.f32653d.mo24189f();
        this.f32653d.mo24741g();
        C7031jd.m40299b();
        if (!this.f32653d.f32389a.mo24443z().mo24279B((String) null, C7516u2.f33049f0)) {
            this.f32653d.f32389a.mo24416F().f32957o.mo24605b(this.f32653d.f32389a.mo24116a().mo18370a());
        } else if (this.f32653d.f32389a.mo24436n()) {
            this.f32653d.f32389a.mo24416F().f32957o.mo24605b(this.f32653d.f32389a.mo24116a().mo18370a());
        }
        long j2 = j - this.f32650a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f32651b;
                this.f32651b = j;
            }
            this.f32653d.f32389a.mo24135l().mo24260v().mo24209b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C7391i9.m41605y(this.f32653d.f32389a.mo24420K().mo24700r(!this.f32653d.f32389a.mo24443z().mo24281D()), bundle, true);
            if (!z2) {
                this.f32653d.f32389a.mo24418I().mo24356u("auto", "_e", bundle);
            }
            this.f32650a = j;
            this.f32652c.mo24587b();
            this.f32652c.mo24588d(3600000);
            return true;
        }
        this.f32653d.f32389a.mo24135l().mo24260v().mo24209b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
