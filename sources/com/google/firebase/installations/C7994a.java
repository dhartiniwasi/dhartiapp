package com.google.firebase.installations;

import com.google.firebase.installations.C8005g;
import java.util.Objects;

/* renamed from: com.google.firebase.installations.a */
/* compiled from: AutoValue_InstallationTokenResult */
final class C7994a extends C8005g {

    /* renamed from: a */
    private final String f34536a;

    /* renamed from: b */
    private final long f34537b;

    /* renamed from: c */
    private final long f34538c;

    /* renamed from: com.google.firebase.installations.a$b */
    /* compiled from: AutoValue_InstallationTokenResult */
    static final class C7996b extends C8005g.C8006a {

        /* renamed from: a */
        private String f34539a;

        /* renamed from: b */
        private Long f34540b;

        /* renamed from: c */
        private Long f34541c;

        C7996b() {
        }

        /* renamed from: a */
        public C8005g mo26557a() {
            String str = "";
            if (this.f34539a == null) {
                str = str + " token";
            }
            if (this.f34540b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f34541c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C7994a(this.f34539a, this.f34540b.longValue(), this.f34541c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public C8005g.C8006a mo26558b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f34539a = str;
            return this;
        }

        /* renamed from: c */
        public C8005g.C8006a mo26559c(long j) {
            this.f34541c = Long.valueOf(j);
            return this;
        }

        /* renamed from: d */
        public C8005g.C8006a mo26560d(long j) {
            this.f34540b = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: b */
    public String mo26551b() {
        return this.f34536a;
    }

    /* renamed from: c */
    public long mo26552c() {
        return this.f34538c;
    }

    /* renamed from: d */
    public long mo26553d() {
        return this.f34537b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8005g)) {
            return false;
        }
        C8005g gVar = (C8005g) obj;
        if (this.f34536a.equals(gVar.mo26551b()) && this.f34537b == gVar.mo26553d() && this.f34538c == gVar.mo26552c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f34537b;
        long j2 = this.f34538c;
        return ((((this.f34536a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f34536a + ", tokenExpirationTimestamp=" + this.f34537b + ", tokenCreationTimestamp=" + this.f34538c + "}";
    }

    private C7994a(String str, long j, long j2) {
        this.f34536a = str;
        this.f34537b = j;
        this.f34538c = j2;
    }
}
