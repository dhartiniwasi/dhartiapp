package p340r9;

import java.util.ArrayList;
import java.util.List;

/* renamed from: r9.c */
/* compiled from: ExpandedRow */
final class C12261c {

    /* renamed from: a */
    private final List<C12260b> f45435a;

    /* renamed from: b */
    private final int f45436b;

    /* renamed from: c */
    private final boolean f45437c;

    C12261c(List<C12260b> list, int i, boolean z) {
        this.f45435a = new ArrayList(list);
        this.f45436b = i;
        this.f45437c = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C12260b> mo36892a() {
        return this.f45435a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo36893b() {
        return this.f45436b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo36894c(List<C12260b> list) {
        return this.f45435a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12261c)) {
            return false;
        }
        C12261c cVar = (C12261c) obj;
        if (!this.f45435a.equals(cVar.mo36892a()) || this.f45437c != cVar.f45437c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f45435a.hashCode() ^ Boolean.valueOf(this.f45437c).hashCode();
    }

    public String toString() {
        return "{ " + this.f45435a + " }";
    }
}
