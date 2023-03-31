package p340r9;

import p331q9.C12195b;
import p331q9.C12196c;

/* renamed from: r9.b */
/* compiled from: ExpandedPair */
final class C12260b {

    /* renamed from: a */
    private final boolean f45431a;

    /* renamed from: b */
    private final C12195b f45432b;

    /* renamed from: c */
    private final C12195b f45433c;

    /* renamed from: d */
    private final C12196c f45434d;

    C12260b(C12195b bVar, C12195b bVar2, C12196c cVar, boolean z) {
        this.f45432b = bVar;
        this.f45433c = bVar2;
        this.f45434d = cVar;
        this.f45431a = z;
    }

    /* renamed from: a */
    private static boolean m58898a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m58899e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C12196c mo36885b() {
        return this.f45434d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C12195b mo36886c() {
        return this.f45432b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12195b mo36887d() {
        return this.f45433c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12260b)) {
            return false;
        }
        C12260b bVar = (C12260b) obj;
        if (!m58898a(this.f45432b, bVar.f45432b) || !m58898a(this.f45433c, bVar.f45433c) || !m58898a(this.f45434d, bVar.f45434d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean mo36889f() {
        return this.f45433c == null;
    }

    public int hashCode() {
        return (m58899e(this.f45432b) ^ m58899e(this.f45433c)) ^ m58899e(this.f45434d);
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f45432b);
        sb.append(" , ");
        sb.append(this.f45433c);
        sb.append(" : ");
        C12196c cVar = this.f45434d;
        if (cVar == null) {
            obj = "null";
        } else {
            obj = Integer.valueOf(cVar.mo36720c());
        }
        sb.append(obj);
        sb.append(" ]");
        return sb.toString();
    }
}
