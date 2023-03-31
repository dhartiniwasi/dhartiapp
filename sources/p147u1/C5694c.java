package p147u1;

import java.util.Map;
import java.util.Objects;
import p084l1.C4904d;
import p147u1.C5699g;
import p165x1.C6034a;

/* renamed from: u1.c */
/* compiled from: AutoValue_SchedulerConfig */
final class C5694c extends C5699g {

    /* renamed from: a */
    private final C6034a f28453a;

    /* renamed from: b */
    private final Map<C4904d, C5699g.C5701b> f28454b;

    C5694c(C6034a aVar, Map<C4904d, C5699g.C5701b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f28453a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f28454b = map;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6034a mo20076e() {
        return this.f28453a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5699g)) {
            return false;
        }
        C5699g gVar = (C5699g) obj;
        if (!this.f28453a.equals(gVar.mo20076e()) || !this.f28454b.equals(gVar.mo20078h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Map<C4904d, C5699g.C5701b> mo20078h() {
        return this.f28454b;
    }

    public int hashCode() {
        return ((this.f28453a.hashCode() ^ 1000003) * 1000003) ^ this.f28454b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f28453a + ", values=" + this.f28454b + "}";
    }
}
