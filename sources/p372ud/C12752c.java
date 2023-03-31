package p372ud;

import kotlin.jvm.internal.C11665g;

/* renamed from: ud.c */
/* compiled from: PrimitiveRanges.kt */
public final class C12752c extends C12749a {

    /* renamed from: e */
    public static final C12753a f46707e = new C12753a((C11665g) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C12752c f46708f = new C12752c(1, 0);

    /* renamed from: ud.c$a */
    /* compiled from: PrimitiveRanges.kt */
    public static final class C12753a {
        private C12753a() {
        }

        public /* synthetic */ C12753a(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final C12752c mo37686a() {
            return C12752c.f46708f;
        }
    }

    public C12752c(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12752c) {
            if (!isEmpty() || !((C12752c) obj).isEmpty()) {
                C12752c cVar = (C12752c) obj;
                if (!(mo37672b() == cVar.mo37672b() && mo37673c() == cVar.mo37673c())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo37672b() * 31) + mo37673c();
    }

    public boolean isEmpty() {
        return mo37672b() > mo37673c();
    }

    /* renamed from: k */
    public boolean mo37683k(int i) {
        return mo37672b() <= i && i <= mo37673c();
    }

    /* renamed from: l */
    public Integer mo37684l() {
        return Integer.valueOf(mo37673c());
    }

    /* renamed from: o */
    public Integer mo37685o() {
        return Integer.valueOf(mo37672b());
    }

    public String toString() {
        return mo37672b() + ".." + mo37673c();
    }
}
