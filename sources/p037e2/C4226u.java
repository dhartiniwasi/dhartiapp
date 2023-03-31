package p037e2;

import p037e2.C4192b0;
import p037e2.C4227v;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: e2.u */
/* compiled from: FlacSeekTableSeekMap */
public final class C4226u implements C4192b0 {

    /* renamed from: a */
    private final C4227v f23567a;

    /* renamed from: b */
    private final long f23568b;

    public C4226u(C4227v vVar, long j) {
        this.f23567a = vVar;
        this.f23568b = j;
    }

    /* renamed from: a */
    private C4196c0 m28510a(long j, long j2) {
        return new C4196c0((j * 1000000) / ((long) this.f23567a.f23573e), this.f23568b + j2);
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return true;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        long j2;
        C5917a.m34875h(this.f23567a.f23579k);
        C4227v vVar = this.f23567a;
        C4227v.C4228a aVar = vVar.f23579k;
        long[] jArr = aVar.f23581a;
        long[] jArr2 = aVar.f23582b;
        int i = C5953m0.m35136i(jArr, vVar.mo17591i(j), true, false);
        long j3 = 0;
        if (i == -1) {
            j2 = 0;
        } else {
            j2 = jArr[i];
        }
        if (i != -1) {
            j3 = jArr2[i];
        }
        C4196c0 a = m28510a(j2, j3);
        if (a.f23485a == j || i == jArr.length - 1) {
            return new C4192b0.C4193a(a);
        }
        int i2 = i + 1;
        return new C4192b0.C4193a(a, m28510a(jArr[i2], jArr2[i2]));
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f23567a.mo17588f();
    }
}
