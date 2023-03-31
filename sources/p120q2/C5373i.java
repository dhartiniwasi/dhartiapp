package p120q2;

import java.nio.ByteBuffer;
import p014b2.C1635f0;
import p021c2.C1848g;
import p161w3.C5917a;
import p161w3.C5961r;
import p177z1.C6272r1;

/* renamed from: q2.i */
/* compiled from: C2Mp3TimestampTracker */
final class C5373i {

    /* renamed from: a */
    private long f27497a;

    /* renamed from: b */
    private long f27498b;

    /* renamed from: c */
    private boolean f27499c;

    C5373i() {
    }

    /* renamed from: a */
    private long m32901a(long j) {
        return this.f27497a + Math.max(0, ((this.f27498b - 529) * 1000000) / j);
    }

    /* renamed from: b */
    public long mo19472b(C6272r1 r1Var) {
        return m32901a((long) r1Var.f30225H);
    }

    /* renamed from: c */
    public void mo19473c() {
        this.f27497a = 0;
        this.f27498b = 0;
        this.f27499c = false;
    }

    /* renamed from: d */
    public long mo19474d(C6272r1 r1Var, C1848g gVar) {
        if (this.f27498b == 0) {
            this.f27497a = gVar.f5432e;
        }
        if (this.f27499c) {
            return gVar.f5432e;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C5917a.m34872e(gVar.f5430c);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int m = C1635f0.m7528m(b);
        if (m == -1) {
            this.f27499c = true;
            this.f27498b = 0;
            this.f27497a = gVar.f5432e;
            C5961r.m35215i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return gVar.f5432e;
        }
        long a = m32901a((long) r1Var.f30225H);
        this.f27498b += (long) m;
        return a;
    }
}
