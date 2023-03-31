package p037e2;

import java.io.EOFException;
import java.io.IOException;
import p127r2.C5432a;
import p160w2.C5903h;
import p161w3.C5918a0;

/* renamed from: e2.y */
/* compiled from: Id3Peeker */
public final class C4231y {

    /* renamed from: a */
    private final C5918a0 f23587a = new C5918a0(10);

    /* renamed from: a */
    public C5432a mo17595a(C4216m mVar, C5903h.C5904a aVar) throws IOException {
        C5432a aVar2 = null;
        int i = 0;
        while (true) {
            try {
                mVar.mo17563p(this.f23587a.mo20551d(), 0, 10);
                this.f23587a.mo20546O(0);
                if (this.f23587a.mo20537F() != 4801587) {
                    break;
                }
                this.f23587a.mo20547P(3);
                int B = this.f23587a.mo20533B();
                int i2 = B + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f23587a.mo20551d(), 0, bArr, 0, 10);
                    mVar.mo17563p(bArr, 10, B);
                    aVar2 = new C5903h(aVar).mo20495e(bArr, i2);
                } else {
                    mVar.mo17558g(B);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        mVar.mo17560j();
        mVar.mo17558g(i);
        return aVar2;
    }
}
