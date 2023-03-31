package p098n1;

import java.util.Arrays;
import java.util.Objects;
import p084l1.C4902b;

/* renamed from: n1.h */
/* compiled from: EncodedPayload */
public final class C5084h {

    /* renamed from: a */
    private final C4902b f26536a;

    /* renamed from: b */
    private final byte[] f26537b;

    public C5084h(C4902b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f26536a = bVar;
        this.f26537b = bArr;
    }

    /* renamed from: a */
    public byte[] mo19038a() {
        return this.f26537b;
    }

    /* renamed from: b */
    public C4902b mo19039b() {
        return this.f26536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5084h)) {
            return false;
        }
        C5084h hVar = (C5084h) obj;
        if (!this.f26536a.equals(hVar.f26536a)) {
            return false;
        }
        return Arrays.equals(this.f26537b, hVar.f26537b);
    }

    public int hashCode() {
        return ((this.f26536a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f26537b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f26536a + ", bytes=[...]}";
    }
}
