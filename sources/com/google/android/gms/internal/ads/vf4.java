package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class vf4 implements fi4 {

    /* renamed from: a */
    protected final fi4[] f19086a;

    public vf4(fi4[] fi4Arr) {
        this.f19086a = fi4Arr;
    }

    /* renamed from: a */
    public final boolean mo8350a(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long e = mo8355e();
            if (e != Long.MIN_VALUE) {
                boolean z2 = false;
                for (fi4 fi4 : this.f19086a) {
                    long e2 = fi4.mo8355e();
                    boolean z3 = e2 != Long.MIN_VALUE && e2 <= j2;
                    if (e2 == e || z3) {
                        z2 |= fi4.mo8350a(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: b0 */
    public final boolean mo8352b0() {
        for (fi4 b0 : this.f19086a) {
            if (b0.mo8352b0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final long mo8354d() {
        long j = Long.MAX_VALUE;
        for (fi4 d : this.f19086a) {
            long d2 = d.mo8354d();
            if (d2 != Long.MIN_VALUE) {
                j = Math.min(j, d2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: e */
    public final long mo8355e() {
        long j = Long.MAX_VALUE;
        for (fi4 e : this.f19086a) {
            long e2 = e.mo8355e();
            if (e2 != Long.MIN_VALUE) {
                j = Math.min(j, e2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: j0 */
    public final void mo8361j0(long j) {
        for (fi4 j0 : this.f19086a) {
            j0.mo8361j0(j);
        }
    }
}
