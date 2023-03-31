package com.google.firebase.firestore;

/* renamed from: com.google.firebase.firestore.t0 */
/* compiled from: SnapshotMetadata */
public class C7949t0 {

    /* renamed from: a */
    private final boolean f34416a;

    /* renamed from: b */
    private final boolean f34417b;

    C7949t0(boolean z, boolean z2) {
        this.f34416a = z;
        this.f34417b = z2;
    }

    /* renamed from: a */
    public boolean mo26456a() {
        return this.f34416a;
    }

    /* renamed from: b */
    public boolean mo26457b() {
        return this.f34417b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7949t0)) {
            return false;
        }
        C7949t0 t0Var = (C7949t0) obj;
        if (this.f34416a == t0Var.f34416a && this.f34417b == t0Var.f34417b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f34416a ? 1 : 0) * true) + (this.f34417b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f34416a + ", isFromCache=" + this.f34417b + '}';
    }
}
