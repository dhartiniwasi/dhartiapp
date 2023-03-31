package p085l2;

import android.util.Pair;
import p037e2.C4192b0;
import p037e2.C4196c0;
import p160w2.C5909k;
import p161w3.C5953m0;

/* renamed from: l2.c */
/* compiled from: MlltSeeker */
final class C4911c implements C4913g {

    /* renamed from: a */
    private final long[] f25871a;

    /* renamed from: b */
    private final long[] f25872b;

    /* renamed from: c */
    private final long f25873c;

    private C4911c(long[] jArr, long[] jArr2, long j) {
        this.f25871a = jArr;
        this.f25872b = jArr2;
        this.f25873c = j == -9223372036854775807L ? C5953m0.m35071B0(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: a */
    public static C4911c m31142a(long j, C5909k kVar, long j2) {
        int length = kVar.f29039e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (kVar.f29037c + kVar.f29039e[i3]);
            j3 += (long) (kVar.f29038d + kVar.f29040f[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C4911c(jArr, jArr2, j2);
    }

    /* renamed from: c */
    private static Pair<Long, Long> m31143c(long j, long[] jArr, long[] jArr2) {
        int i = C5953m0.m35136i(jArr, j, true, true);
        long j2 = jArr[i];
        long j3 = jArr2[i];
        int i2 = i + 1;
        if (i2 == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i2];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i2] - j3)))) + j3));
    }

    /* renamed from: b */
    public long mo18735b(long j) {
        return C5953m0.m35071B0(((Long) m31143c(j, this.f25871a, this.f25872b).second).longValue());
    }

    /* renamed from: f */
    public long mo18736f() {
        return -1;
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return true;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        Pair<Long, Long> c = m31143c(C5953m0.m35117Y0(C5953m0.m35154r(j, 0, this.f25873c)), this.f25872b, this.f25871a);
        return new C4192b0.C4193a(new C4196c0(C5953m0.m35071B0(((Long) c.first).longValue()), ((Long) c.second).longValue()));
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f25873c;
    }
}
