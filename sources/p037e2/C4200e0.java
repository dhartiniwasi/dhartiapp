package p037e2;

import java.io.IOException;
import java.util.Arrays;
import p155v3.C5819i;
import p161w3.C5918a0;
import p177z1.C6272r1;

/* renamed from: e2.e0 */
/* compiled from: TrackOutput */
public interface C4200e0 {

    /* renamed from: e2.e0$a */
    /* compiled from: TrackOutput */
    public static final class C4201a {

        /* renamed from: a */
        public final int f23500a;

        /* renamed from: b */
        public final byte[] f23501b;

        /* renamed from: c */
        public final int f23502c;

        /* renamed from: d */
        public final int f23503d;

        public C4201a(int i, byte[] bArr, int i2, int i3) {
            this.f23500a = i;
            this.f23501b = bArr;
            this.f23502c = i2;
            this.f23503d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4201a.class != obj.getClass()) {
                return false;
            }
            C4201a aVar = (C4201a) obj;
            if (this.f23500a == aVar.f23500a && this.f23502c == aVar.f23502c && this.f23503d == aVar.f23503d && Arrays.equals(this.f23501b, aVar.f23501b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f23500a * 31) + Arrays.hashCode(this.f23501b)) * 31) + this.f23502c) * 31) + this.f23503d;
        }
    }

    /* renamed from: a */
    void mo6838a(long j, int i, int i2, int i3, C4201a aVar);

    /* renamed from: b */
    int mo6840b(C5819i iVar, int i, boolean z) throws IOException;

    /* renamed from: c */
    int mo6842c(C5819i iVar, int i, boolean z, int i2) throws IOException;

    /* renamed from: d */
    void mo6843d(C5918a0 a0Var, int i);

    /* renamed from: e */
    void mo6845e(C6272r1 r1Var);

    /* renamed from: f */
    void mo6847f(C5918a0 a0Var, int i, int i2);
}
