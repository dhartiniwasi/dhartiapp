package p092m2;

import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: m2.r */
/* compiled from: TrackSampleTable */
final class C5031r {

    /* renamed from: a */
    public final C5028o f26373a;

    /* renamed from: b */
    public final int f26374b;

    /* renamed from: c */
    public final long[] f26375c;

    /* renamed from: d */
    public final int[] f26376d;

    /* renamed from: e */
    public final int f26377e;

    /* renamed from: f */
    public final long[] f26378f;

    /* renamed from: g */
    public final int[] f26379g;

    /* renamed from: h */
    public final long f26380h;

    public C5031r(C5028o oVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        C5917a.m34868a(iArr.length == jArr2.length);
        C5917a.m34868a(jArr.length == jArr2.length);
        C5917a.m34868a(iArr2.length == jArr2.length ? true : z);
        this.f26373a = oVar;
        this.f26375c = jArr;
        this.f26376d = iArr;
        this.f26377e = i;
        this.f26378f = jArr2;
        this.f26379g = iArr2;
        this.f26380h = j;
        this.f26374b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int mo18962a(long j) {
        for (int i = C5953m0.m35136i(this.f26378f, j, true, false); i >= 0; i--) {
            if ((this.f26379g[i] & 1) != 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo18963b(long j) {
        for (int e = C5953m0.m35128e(this.f26378f, j, true, false); e < this.f26378f.length; e++) {
            if ((this.f26379g[e] & 1) != 0) {
                return e;
            }
        }
        return -1;
    }
}
