package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class r44 implements e74 {

    /* renamed from: a */
    private final d84 f16827a;

    /* renamed from: b */
    private final s34 f16828b;

    /* renamed from: c */
    private x74 f16829c;

    /* renamed from: d */
    private e74 f16830d;

    /* renamed from: e */
    private boolean f16831e = true;

    /* renamed from: f */
    private boolean f16832f;

    public r44(s34 s34, wa1 wa1) {
        this.f16828b = s34;
        this.f16827a = new d84(wa1);
    }

    /* renamed from: a */
    public final long mo13676a(boolean z) {
        x74 x74 = this.f16829c;
        if (x74 == null || x74.mo9159y() || (!this.f16829c.mo9152m() && (z || this.f16829c.mo13081o()))) {
            this.f16831e = true;
            if (this.f16832f) {
                this.f16827a.mo9463b();
            }
        } else {
            e74 e74 = this.f16830d;
            Objects.requireNonNull(e74);
            long zza = e74.zza();
            if (this.f16831e) {
                if (zza < this.f16827a.zza()) {
                    this.f16827a.mo9464d();
                } else {
                    this.f16831e = false;
                    if (this.f16832f) {
                        this.f16827a.mo9463b();
                    }
                }
            }
            this.f16827a.mo9462a(zza);
            fe0 e = e74.mo9148e();
            if (!e.equals(this.f16827a.mo9148e())) {
                this.f16827a.mo9147c(e);
                this.f16828b.mo13948a(e);
            }
        }
        if (this.f16831e) {
            return this.f16827a.zza();
        }
        e74 e742 = this.f16830d;
        Objects.requireNonNull(e742);
        return e742.zza();
    }

    /* renamed from: b */
    public final void mo13677b(x74 x74) {
        if (x74 == this.f16829c) {
            this.f16830d = null;
            this.f16829c = null;
            this.f16831e = true;
        }
    }

    /* renamed from: c */
    public final void mo9147c(fe0 fe0) {
        e74 e74 = this.f16830d;
        if (e74 != null) {
            e74.mo9147c(fe0);
            fe0 = this.f16830d.mo9148e();
        }
        this.f16827a.mo9147c(fe0);
    }

    /* renamed from: d */
    public final void mo13678d(x74 x74) throws u44 {
        e74 e74;
        e74 V = x74.mo9146V();
        if (V != null && V != (e74 = this.f16830d)) {
            if (e74 == null) {
                this.f16830d = V;
                this.f16829c = x74;
                V.mo9147c(this.f16827a.mo9148e());
                return;
            }
            throw u44.m21411d(new IllegalStateException("Multiple renderer media clocks enabled."), AdError.NETWORK_ERROR_CODE);
        }
    }

    /* renamed from: e */
    public final fe0 mo9148e() {
        e74 e74 = this.f16830d;
        return e74 != null ? e74.mo9148e() : this.f16827a.mo9148e();
    }

    /* renamed from: f */
    public final void mo13679f(long j) {
        this.f16827a.mo9462a(j);
    }

    /* renamed from: g */
    public final void mo13680g() {
        this.f16832f = true;
        this.f16827a.mo9463b();
    }

    /* renamed from: h */
    public final void mo13681h() {
        this.f16832f = false;
        this.f16827a.mo9464d();
    }

    public final long zza() {
        throw null;
    }
}
