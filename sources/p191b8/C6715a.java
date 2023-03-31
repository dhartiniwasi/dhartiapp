package p191b8;

import java.util.Arrays;
import java.util.Objects;
import p211d8.C9888l;

/* renamed from: b8.a */
/* compiled from: AutoValue_IndexEntry */
final class C6715a extends C6722e {

    /* renamed from: a */
    private final int f31209a;

    /* renamed from: b */
    private final C9888l f31210b;

    /* renamed from: c */
    private final byte[] f31211c;

    /* renamed from: d */
    private final byte[] f31212d;

    C6715a(int i, C9888l lVar, byte[] bArr, byte[] bArr2) {
        this.f31209a = i;
        Objects.requireNonNull(lVar, "Null documentKey");
        this.f31210b = lVar;
        Objects.requireNonNull(bArr, "Null arrayValue");
        this.f31211c = bArr;
        Objects.requireNonNull(bArr2, "Null directionalValue");
        this.f31212d = bArr2;
    }

    /* renamed from: c */
    public byte[] mo22610c() {
        return this.f31211c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6722e)) {
            return false;
        }
        C6722e eVar = (C6722e) obj;
        if (this.f31209a == eVar.mo22615n() && this.f31210b.equals(eVar.mo22614k())) {
            boolean z = eVar instanceof C6715a;
            if (Arrays.equals(this.f31211c, z ? ((C6715a) eVar).f31211c : eVar.mo22610c())) {
                if (Arrays.equals(this.f31212d, z ? ((C6715a) eVar).f31212d : eVar.mo22613j())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f31209a ^ 1000003) * 1000003) ^ this.f31210b.hashCode()) * 1000003) ^ Arrays.hashCode(this.f31211c)) * 1000003) ^ Arrays.hashCode(this.f31212d);
    }

    /* renamed from: j */
    public byte[] mo22613j() {
        return this.f31212d;
    }

    /* renamed from: k */
    public C9888l mo22614k() {
        return this.f31210b;
    }

    /* renamed from: n */
    public int mo22615n() {
        return this.f31209a;
    }

    public String toString() {
        return "IndexEntry{indexId=" + this.f31209a + ", documentKey=" + this.f31210b + ", arrayValue=" + Arrays.toString(this.f31211c) + ", directionalValue=" + Arrays.toString(this.f31212d) + "}";
    }
}
