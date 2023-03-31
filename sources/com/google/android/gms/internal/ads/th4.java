package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class th4 extends mf4 implements kh4 {

    /* renamed from: h */
    private final C2453hw f18002h;

    /* renamed from: i */
    private final C3112zn f18003i;

    /* renamed from: j */
    private final pk2 f18004j;

    /* renamed from: k */
    private final rd4 f18005k;

    /* renamed from: l */
    private final int f18006l;

    /* renamed from: m */
    private boolean f18007m = true;

    /* renamed from: n */
    private long f18008n = -9223372036854775807L;

    /* renamed from: o */
    private boolean f18009o;

    /* renamed from: p */
    private boolean f18010p;

    /* renamed from: q */
    private ve3 f18011q;

    /* renamed from: r */
    private final qh4 f18012r;

    /* renamed from: s */
    private final rk4 f18013s;

    /* synthetic */ th4(C2453hw hwVar, pk2 pk2, qh4 qh4, rd4 rd4, rk4 rk4, int i, sh4 sh4, byte[] bArr) {
        C3112zn znVar = hwVar.f10509b;
        Objects.requireNonNull(znVar);
        this.f18003i = znVar;
        this.f18002h = hwVar;
        this.f18004j = pk2;
        this.f18012r = qh4;
        this.f18005k = rd4;
        this.f18013s = rk4;
        this.f18006l = i;
    }

    /* renamed from: z */
    private final void m21031z() {
        long j = this.f18008n;
        boolean z = this.f18009o;
        boolean z2 = this.f18010p;
        C2453hw hwVar = this.f18002h;
        hi4 hi4 = r1;
        hi4 hi42 = new hi4(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0, 0, z, false, false, (Object) null, hwVar, z2 ? hwVar.f10511d : null);
        mo12342w(this.f18007m ? new ph4(this, hi4) : hi4);
    }

    /* renamed from: c */
    public final void mo11701c(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f18008n;
        }
        if (this.f18007m || this.f18008n != j || this.f18009o != z || this.f18010p != z2) {
            this.f18008n = j;
            this.f18009o = z;
            this.f18010p = z2;
            this.f18007m = false;
            m21031z();
        }
    }

    /* renamed from: d */
    public final void mo9587d(kg4 kg4) {
        ((oh4) kg4).mo12931x();
    }

    /* renamed from: j0 */
    public final C2453hw mo9588j0() {
        return this.f18002h;
    }

    /* renamed from: k */
    public final kg4 mo9589k(mg4 mg4, nk4 nk4, long j) {
        ql2 zza = this.f18004j.zza();
        ve3 ve3 = this.f18011q;
        if (ve3 != null) {
            zza.mo8795k(ve3);
        }
        Uri uri = this.f18003i.f21169a;
        qh4 qh4 = this.f18012r;
        mo12334m();
        of4 of4 = new of4(qh4.f16377a);
        rd4 rd4 = this.f18005k;
        ld4 n = mo12335n(mg4);
        rk4 rk4 = this.f18013s;
        vg4 q = mo12338q(mg4);
        String str = this.f18003i.f21172d;
        return new oh4(uri, zza, of4, rd4, n, rk4, q, this, nk4, (String) null, this.f18006l, (byte[]) null);
    }

    /* renamed from: t */
    public final void mo9590t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo9591v(ve3 ve3) {
        this.f18011q = ve3;
        Objects.requireNonNull(Looper.myLooper());
        mo12334m();
        m21031z();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo9592x() {
    }
}
