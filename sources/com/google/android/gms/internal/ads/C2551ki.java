package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ki */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2551ki {

    /* renamed from: a */
    public final C2259co f12085a;

    /* renamed from: b */
    public final Object f12086b;

    /* renamed from: c */
    public final int f12087c;

    /* renamed from: d */
    public final C2705oo[] f12088d = new C2705oo[2];

    /* renamed from: e */
    public final boolean[] f12089e = new boolean[2];

    /* renamed from: f */
    public final long f12090f;

    /* renamed from: g */
    public int f12091g;

    /* renamed from: h */
    public long f12092h;

    /* renamed from: i */
    public boolean f12093i;

    /* renamed from: j */
    public boolean f12094j;

    /* renamed from: k */
    public boolean f12095k;

    /* renamed from: l */
    public C2551ki f12096l;

    /* renamed from: m */
    public C2521jp f12097m;

    /* renamed from: n */
    private final C2996wi[] f12098n;

    /* renamed from: o */
    private final C3033xi[] f12099o;

    /* renamed from: p */
    private final C2484ip f12100p;

    /* renamed from: q */
    private final C2333eo f12101q;

    /* renamed from: r */
    private C2521jp f12102r;

    /* renamed from: s */
    private final yp0 f12103s;

    public C2551ki(C2996wi[] wiVarArr, C3033xi[] xiVarArr, long j, C2484ip ipVar, yp0 yp0, C2333eo eoVar, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.f12098n = wiVarArr;
        this.f12099o = xiVarArr;
        this.f12090f = j;
        this.f12100p = ipVar;
        this.f12103s = yp0;
        this.f12101q = eoVar;
        Objects.requireNonNull(obj);
        this.f12086b = obj;
        this.f12087c = i;
        this.f12091g = i2;
        this.f12093i = z;
        this.f12092h = j2;
        this.f12085a = eoVar.mo8444a(i2, yp0.mo15491l());
    }

    /* renamed from: a */
    public final long mo11702a(long j, boolean z) {
        return mo11703b(j, false, new boolean[2]);
    }

    /* renamed from: b */
    public final long mo11703b(long j, boolean z, boolean[] zArr) {
        C2409gp gpVar = this.f12097m.f11731b;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.f12089e;
            if (z || !this.f12097m.mo11474a(this.f12102r, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long f0 = this.f12085a.mo9237f0(gpVar.mo10597b(), this.f12089e, this.f12088d, zArr, j);
        this.f12102r = this.f12097m;
        this.f12095k = false;
        int i2 = 0;
        while (true) {
            C2705oo[] ooVarArr = this.f12088d;
            if (i2 < 2) {
                if (ooVarArr[i2] != null) {
                    C2335eq.m12245e(gpVar.mo10596a(i2) != null);
                    this.f12095k = true;
                } else {
                    C2335eq.m12245e(gpVar.mo10596a(i2) == null);
                }
                i2++;
            } else {
                this.f12103s.mo15483d(this.f12098n, this.f12097m.f11730a, gpVar);
                return f0;
            }
        }
    }

    /* renamed from: c */
    public final void mo11704c() {
        try {
            this.f12101q.mo8448e(this.f12085a);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }

    /* renamed from: d */
    public final boolean mo11705d() {
        return this.f12094j && (!this.f12095k || this.f12085a.mo9234c() == Long.MIN_VALUE);
    }

    /* renamed from: e */
    public final boolean mo11706e() throws C2253ci {
        C2521jp a = this.f12100p.mo9989a(this.f12099o, this.f12085a.mo9233a0());
        C2521jp jpVar = this.f12102r;
        if (jpVar != null) {
            int i = 0;
            while (i < 2) {
                if (a.mo11474a(jpVar, i)) {
                    i++;
                }
            }
            return false;
        }
        this.f12097m = a;
        return true;
    }
}
