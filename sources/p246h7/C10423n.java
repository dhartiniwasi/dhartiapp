package p246h7;

import android.content.Context;
import android.text.TextUtils;
import p033d5.C4133p;
import p033d5.C4141r;
import p033d5.C4150u;
import p067i5.C4703q;

/* renamed from: h7.n */
/* compiled from: FirebaseOptions */
public final class C10423n {

    /* renamed from: a */
    private final String f41353a;

    /* renamed from: b */
    private final String f41354b;

    /* renamed from: c */
    private final String f41355c;

    /* renamed from: d */
    private final String f41356d;

    /* renamed from: e */
    private final String f41357e;

    /* renamed from: f */
    private final String f41358f;

    /* renamed from: g */
    private final String f41359g;

    /* renamed from: h7.n$b */
    /* compiled from: FirebaseOptions */
    public static final class C10425b {

        /* renamed from: a */
        private String f41360a;

        /* renamed from: b */
        private String f41361b;

        /* renamed from: c */
        private String f41362c;

        /* renamed from: d */
        private String f41363d;

        /* renamed from: e */
        private String f41364e;

        /* renamed from: f */
        private String f41365f;

        /* renamed from: g */
        private String f41366g;

        /* renamed from: a */
        public C10423n mo33489a() {
            return new C10423n(this.f41361b, this.f41360a, this.f41362c, this.f41363d, this.f41364e, this.f41365f, this.f41366g);
        }

        /* renamed from: b */
        public C10425b mo33490b(String str) {
            this.f41360a = C4141r.m28218h(str, "ApiKey must be set.");
            return this;
        }

        /* renamed from: c */
        public C10425b mo33491c(String str) {
            this.f41361b = C4141r.m28218h(str, "ApplicationId must be set.");
            return this;
        }

        /* renamed from: d */
        public C10425b mo33492d(String str) {
            this.f41362c = str;
            return this;
        }

        /* renamed from: e */
        public C10425b mo33493e(String str) {
            this.f41363d = str;
            return this;
        }

        /* renamed from: f */
        public C10425b mo33494f(String str) {
            this.f41364e = str;
            return this;
        }

        /* renamed from: g */
        public C10425b mo33495g(String str) {
            this.f41366g = str;
            return this;
        }

        /* renamed from: h */
        public C10425b mo33496h(String str) {
            this.f41365f = str;
            return this;
        }
    }

    /* renamed from: a */
    public static C10423n m52613a(Context context) {
        C4150u uVar = new C4150u(context);
        String a = uVar.mo17475a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C10423n(a, uVar.mo17475a("google_api_key"), uVar.mo17475a("firebase_database_url"), uVar.mo17475a("ga_trackingId"), uVar.mo17475a("gcm_defaultSenderId"), uVar.mo17475a("google_storage_bucket"), uVar.mo17475a("project_id"));
    }

    /* renamed from: b */
    public String mo33479b() {
        return this.f41353a;
    }

    /* renamed from: c */
    public String mo33480c() {
        return this.f41354b;
    }

    /* renamed from: d */
    public String mo33481d() {
        return this.f41355c;
    }

    /* renamed from: e */
    public String mo33482e() {
        return this.f41356d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10423n)) {
            return false;
        }
        C10423n nVar = (C10423n) obj;
        if (!C4133p.m28193a(this.f41354b, nVar.f41354b) || !C4133p.m28193a(this.f41353a, nVar.f41353a) || !C4133p.m28193a(this.f41355c, nVar.f41355c) || !C4133p.m28193a(this.f41356d, nVar.f41356d) || !C4133p.m28193a(this.f41357e, nVar.f41357e) || !C4133p.m28193a(this.f41358f, nVar.f41358f) || !C4133p.m28193a(this.f41359g, nVar.f41359g)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public String mo33484f() {
        return this.f41357e;
    }

    /* renamed from: g */
    public String mo33485g() {
        return this.f41359g;
    }

    /* renamed from: h */
    public String mo33486h() {
        return this.f41358f;
    }

    public int hashCode() {
        return C4133p.m28194b(this.f41354b, this.f41353a, this.f41355c, this.f41356d, this.f41357e, this.f41358f, this.f41359g);
    }

    public String toString() {
        return C4133p.m28195c(this).mo17442a("applicationId", this.f41354b).mo17442a("apiKey", this.f41353a).mo17442a("databaseUrl", this.f41355c).mo17442a("gcmSenderId", this.f41357e).mo17442a("storageBucket", this.f41358f).mo17442a("projectId", this.f41359g).toString();
    }

    private C10423n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C4141r.m28225o(!C4703q.m30426b(str), "ApplicationId must be set.");
        this.f41354b = str;
        this.f41353a = str2;
        this.f41355c = str3;
        this.f41356d = str4;
        this.f41357e = str5;
        this.f41358f = str6;
        this.f41359g = str7;
    }
}
