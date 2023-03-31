package p015b3;

/* renamed from: b3.h */
/* compiled from: CompositeSequenceableLoader */
public class C1710h implements C1752r0 {

    /* renamed from: a */
    protected final C1752r0[] f5015a;

    public C1710h(C1752r0[] r0VarArr) {
        this.f5015a = r0VarArr;
    }

    /* renamed from: d */
    public final long mo6682d() {
        long j = Long.MAX_VALUE;
        for (C1752r0 d : this.f5015a) {
            long d2 = d.mo6682d();
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
    public boolean mo6683e(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long d = mo6682d();
            if (d != Long.MIN_VALUE) {
                boolean z2 = false;
                for (C1752r0 r0Var : this.f5015a) {
                    long d2 = r0Var.mo6682d();
                    boolean z3 = d2 != Long.MIN_VALUE && d2 <= j2;
                    if (d2 == d || z3) {
                        z2 |= r0Var.mo6683e(j2);
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

    /* renamed from: g */
    public final long mo6685g() {
        long j = Long.MAX_VALUE;
        for (C1752r0 g : this.f5015a) {
            long g2 = g.mo6685g();
            if (g2 != Long.MIN_VALUE) {
                j = Math.min(j, g2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: h */
    public final void mo6686h(long j) {
        for (C1752r0 h : this.f5015a) {
            h.mo6686h(j);
        }
    }

    public boolean isLoading() {
        for (C1752r0 isLoading : this.f5015a) {
            if (isLoading.isLoading()) {
                return true;
            }
        }
        return false;
    }
}
