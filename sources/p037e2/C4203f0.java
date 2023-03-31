package p037e2;

import java.io.IOException;
import p014b2.C1613b;
import p037e2.C4200e0;
import p161w3.C5917a;

/* renamed from: e2.f0 */
/* compiled from: TrueHdSampleRechunker */
public final class C4203f0 {

    /* renamed from: a */
    private final byte[] f23511a = new byte[10];

    /* renamed from: b */
    private boolean f23512b;

    /* renamed from: c */
    private int f23513c;

    /* renamed from: d */
    private long f23514d;

    /* renamed from: e */
    private int f23515e;

    /* renamed from: f */
    private int f23516f;

    /* renamed from: g */
    private int f23517g;

    /* renamed from: a */
    public void mo17566a(C4200e0 e0Var, C4200e0.C4201a aVar) {
        if (this.f23513c > 0) {
            e0Var.mo6838a(this.f23514d, this.f23515e, this.f23516f, this.f23517g, aVar);
            this.f23513c = 0;
        }
    }

    /* renamed from: b */
    public void mo17567b() {
        this.f23512b = false;
        this.f23513c = 0;
    }

    /* renamed from: c */
    public void mo17568c(C4200e0 e0Var, long j, int i, int i2, int i3, C4200e0.C4201a aVar) {
        C5917a.m34874g(this.f23517g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f23512b) {
            int i4 = this.f23513c;
            int i5 = i4 + 1;
            this.f23513c = i5;
            if (i4 == 0) {
                this.f23514d = j;
                this.f23515e = i;
                this.f23516f = 0;
            }
            this.f23516f += i2;
            this.f23517g = i3;
            if (i5 >= 16) {
                mo17566a(e0Var, aVar);
            }
        }
    }

    /* renamed from: d */
    public void mo17569d(C4216m mVar) throws IOException {
        if (!this.f23512b) {
            mVar.mo17563p(this.f23511a, 0, 10);
            mVar.mo17560j();
            if (C1613b.m7416i(this.f23511a) != 0) {
                this.f23512b = true;
            }
        }
    }
}
