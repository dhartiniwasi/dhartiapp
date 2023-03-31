package p391wc;

import p371uc.C12731e;

/* renamed from: wc.b */
/* compiled from: Request */
public final class C12945b {

    /* renamed from: a */
    private final C12942a f47194a;

    /* renamed from: b */
    private final C12731e f47195b;

    /* renamed from: wc.b$b */
    /* compiled from: Request */
    public static class C12947b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C12942a f47196a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C12731e.C12733b f47197b = new C12731e.C12733b();

        /* renamed from: c */
        public C12945b mo37999c() {
            if (this.f47196a != null) {
                return new C12945b(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: d */
        public C12947b mo38000d(String str, String str2) {
            this.f47197b.mo37650f(str, str2);
            return this;
        }

        /* renamed from: e */
        public C12947b mo38001e(C12942a aVar) {
            if (aVar != null) {
                this.f47196a = aVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    /* renamed from: a */
    public C12731e mo37996a() {
        return this.f47195b;
    }

    /* renamed from: b */
    public C12942a mo37997b() {
        return this.f47194a;
    }

    public String toString() {
        return "Request{url=" + this.f47194a + '}';
    }

    private C12945b(C12947b bVar) {
        this.f47194a = bVar.f47196a;
        this.f47195b = bVar.f47197b.mo37648c();
    }
}
