package p031d3;

import java.io.IOException;
import java.util.Arrays;
import p155v3.C5828l;
import p155v3.C5835o;
import p155v3.C5837p;
import p161w3.C5953m0;
import p177z1.C6272r1;

/* renamed from: d3.l */
/* compiled from: DataChunk */
public abstract class C4070l extends C4060f {

    /* renamed from: j */
    private byte[] f23207j;

    /* renamed from: k */
    private volatile boolean f23208k;

    public C4070l(C5828l lVar, C5837p pVar, int i, C6272r1 r1Var, int i2, Object obj, byte[] bArr) {
        super(lVar, pVar, i, r1Var, i2, obj, -9223372036854775807L, -9223372036854775807L);
        C4070l lVar2;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = C5953m0.f29115f;
            lVar2 = this;
        } else {
            lVar2 = this;
            bArr2 = bArr;
        }
        lVar2.f23207j = bArr2;
    }

    /* renamed from: i */
    private void m27992i(int i) {
        byte[] bArr = this.f23207j;
        if (bArr.length < i + 16384) {
            this.f23207j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    /* renamed from: b */
    public final void mo6786b() throws IOException {
        try {
            this.f23170i.mo6819o(this.f23163b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f23208k) {
                m27992i(i2);
                i = this.f23170i.read(this.f23207j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f23208k) {
                mo17299g(this.f23207j, i2);
            }
        } finally {
            C5835o.m34625a(this.f23170i);
        }
    }

    /* renamed from: c */
    public final void mo6787c() {
        this.f23208k = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo17299g(byte[] bArr, int i) throws IOException;

    /* renamed from: h */
    public byte[] mo17300h() {
        return this.f23207j;
    }
}
