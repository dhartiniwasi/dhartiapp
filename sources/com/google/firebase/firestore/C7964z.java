package com.google.firebase.firestore;

import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.z */
/* compiled from: FirebaseFirestoreSettings */
public final class C7964z {

    /* renamed from: a */
    private final String f34458a;

    /* renamed from: b */
    private final boolean f34459b;

    /* renamed from: c */
    private final boolean f34460c;

    /* renamed from: d */
    private final long f34461d;

    /* renamed from: com.google.firebase.firestore.z$b */
    /* compiled from: FirebaseFirestoreSettings */
    public static final class C7966b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f34462a = "firestore.googleapis.com";
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f34463b = true;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f34464c = true;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f34465d = 104857600;

        /* renamed from: e */
        public C7964z mo26484e() {
            if (this.f34463b || !this.f34462a.equals("firestore.googleapis.com")) {
                return new C7964z(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        /* renamed from: f */
        public C7966b mo26485f(long j) {
            if (j == -1 || j >= 1048576) {
                this.f34465d = j;
                return this;
            }
            throw new IllegalArgumentException("Cache size must be set to at least 1048576 bytes");
        }

        /* renamed from: g */
        public C7966b mo26486g(String str) {
            this.f34462a = (String) C10472x.m52786c(str, "Provided host must not be null.");
            return this;
        }

        /* renamed from: h */
        public C7966b mo26487h(boolean z) {
            this.f34464c = z;
            return this;
        }

        /* renamed from: i */
        public C7966b mo26488i(boolean z) {
            this.f34463b = z;
            return this;
        }
    }

    /* renamed from: a */
    public long mo26477a() {
        return this.f34461d;
    }

    /* renamed from: b */
    public String mo26478b() {
        return this.f34458a;
    }

    /* renamed from: c */
    public boolean mo26479c() {
        return this.f34460c;
    }

    /* renamed from: d */
    public boolean mo26480d() {
        return this.f34459b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7964z.class != obj.getClass()) {
            return false;
        }
        C7964z zVar = (C7964z) obj;
        if (this.f34458a.equals(zVar.f34458a) && this.f34459b == zVar.f34459b && this.f34460c == zVar.f34460c && this.f34461d == zVar.f34461d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f34458a.hashCode() * 31) + (this.f34459b ? 1 : 0)) * 31) + (this.f34460c ? 1 : 0)) * 31) + ((int) this.f34461d);
    }

    public String toString() {
        return "FirebaseFirestoreSettings{host=" + this.f34458a + ", sslEnabled=" + this.f34459b + ", persistenceEnabled=" + this.f34460c + ", cacheSizeBytes=" + this.f34461d + "}";
    }

    private C7964z(C7966b bVar) {
        this.f34458a = bVar.f34462a;
        this.f34459b = bVar.f34463b;
        this.f34460c = bVar.f34464c;
        this.f34461d = bVar.f34465d;
    }
}
