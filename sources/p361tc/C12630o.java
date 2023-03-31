package p361tc;

import p264io.grpc.internal.C11328p2;
import p336qe.C12231c;

/* renamed from: tc.o */
/* compiled from: OkHttpWritableBuffer */
class C12630o implements C11328p2 {

    /* renamed from: a */
    private final C12231c f46368a;

    /* renamed from: b */
    private int f46369b;

    /* renamed from: c */
    private int f46370c;

    C12630o(C12231c cVar, int i) {
        this.f46368a = cVar;
        this.f46369b = i;
    }

    /* renamed from: a */
    public void mo35289a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C12231c mo37516b() {
        return this.f46368a;
    }

    /* renamed from: k */
    public int mo35290k() {
        return this.f46370c;
    }

    /* renamed from: s */
    public void mo35291s(byte[] bArr, int i, int i2) {
        this.f46368a.mo36816s(bArr, i, i2);
        this.f46369b -= i2;
        this.f46370c += i2;
    }

    /* renamed from: t */
    public int mo35292t() {
        return this.f46369b;
    }

    /* renamed from: u */
    public void mo35293u(byte b) {
        this.f46368a.mo36787a0(b);
        this.f46369b--;
        this.f46370c++;
    }
}
