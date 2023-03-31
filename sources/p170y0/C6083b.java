package p170y0;

import android.os.Build;

/* renamed from: y0.b */
/* compiled from: Constraints */
public final class C6083b {

    /* renamed from: i */
    public static final C6083b f29454i = new C6084a().mo20900a();

    /* renamed from: a */
    private C6096k f29455a = C6096k.NOT_REQUIRED;

    /* renamed from: b */
    private boolean f29456b;

    /* renamed from: c */
    private boolean f29457c;

    /* renamed from: d */
    private boolean f29458d;

    /* renamed from: e */
    private boolean f29459e;

    /* renamed from: f */
    private long f29460f = -1;

    /* renamed from: g */
    private long f29461g = -1;

    /* renamed from: h */
    private C6085c f29462h = new C6085c();

    /* renamed from: y0.b$a */
    /* compiled from: Constraints */
    public static final class C6084a {

        /* renamed from: a */
        boolean f29463a = false;

        /* renamed from: b */
        boolean f29464b = false;

        /* renamed from: c */
        C6096k f29465c = C6096k.NOT_REQUIRED;

        /* renamed from: d */
        boolean f29466d = false;

        /* renamed from: e */
        boolean f29467e = false;

        /* renamed from: f */
        long f29468f = -1;

        /* renamed from: g */
        long f29469g = -1;

        /* renamed from: h */
        C6085c f29470h = new C6085c();

        /* renamed from: a */
        public C6083b mo20900a() {
            return new C6083b(this);
        }

        /* renamed from: b */
        public C6084a mo20901b(C6096k kVar) {
            this.f29465c = kVar;
            return this;
        }

        /* renamed from: c */
        public C6084a mo20902c(boolean z) {
            this.f29467e = z;
            return this;
        }
    }

    public C6083b() {
    }

    /* renamed from: a */
    public C6085c mo20881a() {
        return this.f29462h;
    }

    /* renamed from: b */
    public C6096k mo20882b() {
        return this.f29455a;
    }

    /* renamed from: c */
    public long mo20883c() {
        return this.f29460f;
    }

    /* renamed from: d */
    public long mo20884d() {
        return this.f29461g;
    }

    /* renamed from: e */
    public boolean mo20885e() {
        return this.f29462h.mo20905c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6083b.class != obj.getClass()) {
            return false;
        }
        C6083b bVar = (C6083b) obj;
        if (this.f29456b == bVar.f29456b && this.f29457c == bVar.f29457c && this.f29458d == bVar.f29458d && this.f29459e == bVar.f29459e && this.f29460f == bVar.f29460f && this.f29461g == bVar.f29461g && this.f29455a == bVar.f29455a) {
            return this.f29462h.equals(bVar.f29462h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo20887f() {
        return this.f29458d;
    }

    /* renamed from: g */
    public boolean mo20888g() {
        return this.f29456b;
    }

    /* renamed from: h */
    public boolean mo20889h() {
        return this.f29457c;
    }

    public int hashCode() {
        long j = this.f29460f;
        long j2 = this.f29461g;
        return (((((((((((((this.f29455a.hashCode() * 31) + (this.f29456b ? 1 : 0)) * 31) + (this.f29457c ? 1 : 0)) * 31) + (this.f29458d ? 1 : 0)) * 31) + (this.f29459e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f29462h.hashCode();
    }

    /* renamed from: i */
    public boolean mo20891i() {
        return this.f29459e;
    }

    /* renamed from: j */
    public void mo20892j(C6085c cVar) {
        this.f29462h = cVar;
    }

    /* renamed from: k */
    public void mo20893k(C6096k kVar) {
        this.f29455a = kVar;
    }

    /* renamed from: l */
    public void mo20894l(boolean z) {
        this.f29458d = z;
    }

    /* renamed from: m */
    public void mo20895m(boolean z) {
        this.f29456b = z;
    }

    /* renamed from: n */
    public void mo20896n(boolean z) {
        this.f29457c = z;
    }

    /* renamed from: o */
    public void mo20897o(boolean z) {
        this.f29459e = z;
    }

    /* renamed from: p */
    public void mo20898p(long j) {
        this.f29460f = j;
    }

    /* renamed from: q */
    public void mo20899q(long j) {
        this.f29461g = j;
    }

    C6083b(C6084a aVar) {
        this.f29456b = aVar.f29463a;
        int i = Build.VERSION.SDK_INT;
        this.f29457c = i >= 23 && aVar.f29464b;
        this.f29455a = aVar.f29465c;
        this.f29458d = aVar.f29466d;
        this.f29459e = aVar.f29467e;
        if (i >= 24) {
            this.f29462h = aVar.f29470h;
            this.f29460f = aVar.f29468f;
            this.f29461g = aVar.f29469g;
        }
    }

    public C6083b(C6083b bVar) {
        this.f29456b = bVar.f29456b;
        this.f29457c = bVar.f29457c;
        this.f29455a = bVar.f29455a;
        this.f29458d = bVar.f29458d;
        this.f29459e = bVar.f29459e;
        this.f29462h = bVar.f29462h;
    }
}
