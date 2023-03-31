package p099n2;

import java.util.Arrays;
import java.util.List;
import p014b2.C1640g0;
import p037e2.C4205h0;
import p099n2.C5114i;
import p127r2.C5432a;
import p161w3.C5917a;
import p161w3.C5918a0;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p190b7.C6685q;

/* renamed from: n2.h */
/* compiled from: OpusReader */
final class C5113h extends C5114i {

    /* renamed from: o */
    private static final byte[] f26599o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p */
    private static final byte[] f26600p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n */
    private boolean f26601n;

    C5113h() {
    }

    /* renamed from: n */
    private long m31964n(byte[] bArr) {
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return ((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2));
    }

    /* renamed from: o */
    private static boolean m31965o(C5918a0 a0Var, byte[] bArr) {
        if (a0Var.mo20548a() < bArr.length) {
            return false;
        }
        int e = a0Var.mo20552e();
        byte[] bArr2 = new byte[bArr.length];
        a0Var.mo20557j(bArr2, 0, bArr.length);
        a0Var.mo20546O(e);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: p */
    public static boolean m31966p(C5918a0 a0Var) {
        return m31965o(a0Var, f26599o);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public long mo19071f(C5918a0 a0Var) {
        return mo19085c(m31964n(a0Var.mo20551d()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo19072i(C5918a0 a0Var, long j, C5114i.C5116b bVar) throws C6249m2 {
        if (m31965o(a0Var, f26599o)) {
            byte[] copyOf = Arrays.copyOf(a0Var.mo20551d(), a0Var.mo20553f());
            int c = C1640g0.m7538c(copyOf);
            List<byte[]> a = C1640g0.m7536a(copyOf);
            if (bVar.f26615a != null) {
                return true;
            }
            bVar.f26615a = new C6272r1.C6274b().mo21517e0("audio/opus").mo21494H(c).mo21518f0(48000).mo21506T(a).mo21491E();
            return true;
        }
        byte[] bArr = f26600p;
        if (m31965o(a0Var, bArr)) {
            C5917a.m34875h(bVar.f26615a);
            if (this.f26601n) {
                return true;
            }
            this.f26601n = true;
            a0Var.mo20547P(bArr.length);
            C5432a c2 = C4205h0.m28426c(C6685q.m38444u(C4205h0.m28433j(a0Var, false, false).f23528b));
            if (c2 == null) {
                return true;
            }
            bVar.f26615a = bVar.f26615a.mo21483b().mo21510X(c2.mo19694b(bVar.f26615a.f30241r)).mo21491E();
            return true;
        }
        C5917a.m34875h(bVar.f26615a);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo19073l(boolean z) {
        super.mo19073l(z);
        if (z) {
            this.f26601n = false;
        }
    }
}
