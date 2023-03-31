package p413z7;

import p211d8.C9905w;

/* renamed from: z7.e */
/* compiled from: BundleMetadata */
public class C13468e implements C13466c {

    /* renamed from: a */
    private final String f47818a;

    /* renamed from: b */
    private final int f47819b;

    /* renamed from: c */
    private final C9905w f47820c;

    /* renamed from: d */
    private final int f47821d;

    /* renamed from: e */
    private final long f47822e;

    public C13468e(String str, int i, C9905w wVar, int i2, long j) {
        this.f47818a = str;
        this.f47819b = i;
        this.f47820c = wVar;
        this.f47821d = i2;
        this.f47822e = j;
    }

    /* renamed from: a */
    public String mo38564a() {
        return this.f47818a;
    }

    /* renamed from: b */
    public C9905w mo38565b() {
        return this.f47820c;
    }

    /* renamed from: c */
    public int mo38566c() {
        return this.f47819b;
    }

    /* renamed from: d */
    public long mo38567d() {
        return this.f47822e;
    }

    /* renamed from: e */
    public int mo38568e() {
        return this.f47821d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13468e eVar = (C13468e) obj;
        if (this.f47819b == eVar.f47819b && this.f47821d == eVar.f47821d && this.f47822e == eVar.f47822e && this.f47818a.equals(eVar.f47818a)) {
            return this.f47820c.equals(eVar.f47820c);
        }
        return false;
    }

    public int hashCode() {
        long j = this.f47822e;
        return (((((((this.f47818a.hashCode() * 31) + this.f47819b) * 31) + this.f47821d) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f47820c.hashCode();
    }
}
