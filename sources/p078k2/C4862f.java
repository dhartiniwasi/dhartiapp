package p078k2;

import java.io.IOException;
import p037e2.C4216m;
import p161w3.C5918a0;

/* renamed from: k2.f */
/* compiled from: Sniffer */
final class C4862f {

    /* renamed from: a */
    private final C5918a0 f25750a = new C5918a0(8);

    /* renamed from: b */
    private int f25751b;

    /* renamed from: a */
    private long m30965a(C4216m mVar) throws IOException {
        int i = 0;
        mVar.mo17563p(this.f25750a.mo20551d(), 0, 1);
        byte b = this.f25750a.mo20551d()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        mVar.mo17563p(this.f25750a.mo20551d(), 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f25750a.mo20551d()[i] & 255) + (i4 << 8);
        }
        this.f25751b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: b */
    public boolean mo18617b(C4216m mVar) throws IOException {
        long a;
        int i;
        C4216m mVar2 = mVar;
        long b = mVar.mo17553b();
        long j = 1024;
        int i2 = (b > -1 ? 1 : (b == -1 ? 0 : -1));
        if (i2 != 0 && b <= 1024) {
            j = b;
        }
        int i3 = (int) j;
        mVar2.mo17563p(this.f25750a.mo20551d(), 0, 4);
        this.f25751b = 4;
        for (long E = this.f25750a.mo20536E(); E != 440786851; E = ((E << 8) & -256) | ((long) (this.f25750a.mo20551d()[0] & 255))) {
            int i4 = this.f25751b + 1;
            this.f25751b = i4;
            if (i4 == i3) {
                return false;
            }
            mVar2.mo17563p(this.f25750a.mo20551d(), 0, 1);
        }
        long a2 = m30965a(mVar);
        long j2 = (long) this.f25751b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + a2 >= b) {
            return false;
        }
        while (true) {
            int i5 = this.f25751b;
            long j3 = j2 + a2;
            if (((long) i5) < j3) {
                if (m30965a(mVar) != Long.MIN_VALUE && a >= 0 && a <= 2147483647L) {
                    if (i != 0) {
                        int a3 = (int) (a = m30965a(mVar));
                        mVar2.mo17558g(a3);
                        this.f25751b += a3;
                    }
                }
            } else if (((long) i5) == j3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
