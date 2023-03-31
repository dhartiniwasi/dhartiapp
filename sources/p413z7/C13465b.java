package p413z7;

import p211d8.C9888l;
import p211d8.C9899s;

/* renamed from: z7.b */
/* compiled from: BundleDocument */
public class C13465b implements C13466c {

    /* renamed from: a */
    private C9899s f47810a;

    public C13465b(C9899s sVar) {
        this.f47810a = sVar;
    }

    /* renamed from: a */
    public C9899s mo38558a() {
        return this.f47810a;
    }

    /* renamed from: b */
    public C9888l mo38559b() {
        return this.f47810a.getKey();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f47810a.equals(((C13465b) obj).f47810a);
    }

    public int hashCode() {
        return this.f47810a.hashCode();
    }
}
