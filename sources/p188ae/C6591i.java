package p188ae;

import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

/* renamed from: ae.i */
/* compiled from: Channel.kt */
public final class C6591i<T> {

    /* renamed from: a */
    public static final C6593b f31055a = new C6593b((C11665g) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C6594c f31056b = new C6594c();

    /* renamed from: ae.i$a */
    /* compiled from: Channel.kt */
    public static final class C6592a extends C6594c {

        /* renamed from: a */
        public final Throwable f31057a;

        public C6592a(Throwable th) {
            this.f31057a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C6592a) && C11669k.m56783a(this.f31057a, ((C6592a) obj).f31057a);
        }

        public int hashCode() {
            Throwable th = this.f31057a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public String toString() {
            return "Closed(" + this.f31057a + ')';
        }
    }

    /* renamed from: ae.i$b */
    /* compiled from: Channel.kt */
    public static final class C6593b {
        private C6593b() {
        }

        public /* synthetic */ C6593b(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final <E> Object mo22226a(Throwable th) {
            return C6591i.m38198b(new C6592a(th));
        }

        /* renamed from: b */
        public final <E> Object mo22227b() {
            return C6591i.m38198b(C6591i.f31056b);
        }

        /* renamed from: c */
        public final <E> Object mo22228c(E e) {
            return C6591i.m38198b(e);
        }
    }

    /* renamed from: ae.i$c */
    /* compiled from: Channel.kt */
    public static class C6594c {
        public String toString() {
            return "Failed";
        }
    }

    /* renamed from: b */
    public static <T> Object m38198b(Object obj) {
        return obj;
    }
}
