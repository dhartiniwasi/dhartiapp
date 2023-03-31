package com.google.firebase.firestore;

/* renamed from: com.google.firebase.firestore.y0 */
/* compiled from: TransactionOptions */
public final class C7961y0 {

    /* renamed from: b */
    static final C7961y0 f34455b = new C7963b().mo26475a();

    /* renamed from: a */
    private final int f34456a;

    /* renamed from: com.google.firebase.firestore.y0$b */
    /* compiled from: TransactionOptions */
    public static final class C7963b {

        /* renamed from: a */
        private int f34457a = 5;

        /* renamed from: a */
        public C7961y0 mo26475a() {
            return new C7961y0(this.f34457a);
        }

        /* renamed from: b */
        public C7963b mo26476b(int i) {
            if (i >= 1) {
                this.f34457a = i;
                return this;
            }
            throw new IllegalArgumentException("Max attempts must be at least 1");
        }
    }

    /* renamed from: a */
    public int mo26471a() {
        return this.f34456a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7961y0.class == obj.getClass() && this.f34456a == ((C7961y0) obj).f34456a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f34456a;
    }

    public String toString() {
        return "TransactionOptions{maxAttempts=" + this.f34456a + '}';
    }

    private C7961y0(int i) {
        this.f34456a = i;
    }
}
