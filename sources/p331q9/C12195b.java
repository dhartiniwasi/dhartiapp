package p331q9;

/* renamed from: q9.b */
/* compiled from: DataCharacter */
public class C12195b {

    /* renamed from: a */
    private final int f45287a;

    /* renamed from: b */
    private final int f45288b;

    public C12195b(int i, int i2) {
        this.f45287a = i;
        this.f45288b = i2;
    }

    /* renamed from: a */
    public final int mo36713a() {
        return this.f45288b;
    }

    /* renamed from: b */
    public final int mo36714b() {
        return this.f45287a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12195b)) {
            return false;
        }
        C12195b bVar = (C12195b) obj;
        if (this.f45287a == bVar.f45287a && this.f45288b == bVar.f45288b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45287a ^ this.f45288b;
    }

    public final String toString() {
        return this.f45287a + "(" + this.f45288b + ')';
    }
}
