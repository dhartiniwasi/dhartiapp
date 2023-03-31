package p243gd;

import java.io.Serializable;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

/* renamed from: gd.m */
/* compiled from: Result.kt */
public final class C10341m<T> implements Serializable {

    /* renamed from: a */
    public static final C10342a f40958a = new C10342a((C11665g) null);

    /* renamed from: gd.m$a */
    /* compiled from: Result.kt */
    public static final class C10342a {
        private C10342a() {
        }

        public /* synthetic */ C10342a(C11665g gVar) {
            this();
        }
    }

    /* renamed from: gd.m$b */
    /* compiled from: Result.kt */
    public static final class C10343b implements Serializable {

        /* renamed from: a */
        public final Throwable f40959a;

        public C10343b(Throwable th) {
            C11669k.m56787e(th, "exception");
            this.f40959a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C10343b) && C11669k.m56783a(this.f40959a, ((C10343b) obj).f40959a);
        }

        public int hashCode() {
            return this.f40959a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f40959a + ')';
        }
    }

    /* renamed from: a */
    public static <T> Object m52240a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m52241b(Object obj) {
        if (obj instanceof C10343b) {
            return ((C10343b) obj).f40959a;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m52242c(Object obj) {
        return obj instanceof C10343b;
    }

    /* renamed from: d */
    public static final boolean m52243d(Object obj) {
        return !(obj instanceof C10343b);
    }
}
