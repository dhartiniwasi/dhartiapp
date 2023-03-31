package p037e2;

import java.io.EOFException;
import java.io.IOException;
import p037e2.C4200e0;
import p155v3.C5819i;
import p161w3.C5918a0;
import p177z1.C6272r1;

/* renamed from: e2.k */
/* compiled from: DummyTrackOutput */
public final class C4214k implements C4200e0 {

    /* renamed from: a */
    private final byte[] f23562a = new byte[4096];

    /* renamed from: a */
    public void mo6838a(long j, int i, int i2, int i3, C4200e0.C4201a aVar) {
    }

    /* renamed from: b */
    public /* synthetic */ int mo6840b(C5819i iVar, int i, boolean z) {
        return C4198d0.m28382a(this, iVar, i, z);
    }

    /* renamed from: c */
    public int mo6842c(C5819i iVar, int i, boolean z, int i2) throws IOException {
        int read = iVar.read(this.f23562a, 0, Math.min(this.f23562a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: d */
    public /* synthetic */ void mo6843d(C5918a0 a0Var, int i) {
        C4198d0.m28383b(this, a0Var, i);
    }

    /* renamed from: e */
    public void mo6845e(C6272r1 r1Var) {
    }

    /* renamed from: f */
    public void mo6847f(C5918a0 a0Var, int i, int i2) {
        a0Var.mo20547P(i);
    }
}
