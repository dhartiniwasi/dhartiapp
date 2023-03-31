package p190b7;

import java.util.Comparator;
import p219e7.C10001f;
import p219e7.C9995a;
import p219e7.C9998d;

/* renamed from: b7.k */
/* compiled from: ComparisonChain */
public abstract class C6659k {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C6659k f31139a = new C6660a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C6659k f31140b = new C6661b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C6659k f31141c = new C6661b(1);

    /* renamed from: b7.k$a */
    /* compiled from: ComparisonChain */
    class C6660a extends C6659k {
        C6660a() {
            super((C6660a) null);
        }

        /* renamed from: d */
        public C6659k mo22454d(int i, int i2) {
            return mo22460k(C9998d.m51070e(i, i2));
        }

        /* renamed from: e */
        public C6659k mo22455e(long j, long j2) {
            return mo22460k(C10001f.m51080a(j, j2));
        }

        /* renamed from: f */
        public <T> C6659k mo22456f(T t, T t2, Comparator<T> comparator) {
            return mo22460k(comparator.compare(t, t2));
        }

        /* renamed from: g */
        public C6659k mo22457g(boolean z, boolean z2) {
            return mo22460k(C9995a.m51063a(z, z2));
        }

        /* renamed from: h */
        public C6659k mo22458h(boolean z, boolean z2) {
            return mo22460k(C9995a.m51063a(z2, z));
        }

        /* renamed from: i */
        public int mo22459i() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C6659k mo22460k(int i) {
            if (i < 0) {
                return C6659k.f31140b;
            }
            return i > 0 ? C6659k.f31141c : C6659k.f31139a;
        }
    }

    /* renamed from: b7.k$b */
    /* compiled from: ComparisonChain */
    private static final class C6661b extends C6659k {

        /* renamed from: d */
        final int f31142d;

        C6661b(int i) {
            super((C6660a) null);
            this.f31142d = i;
        }

        /* renamed from: d */
        public C6659k mo22454d(int i, int i2) {
            return this;
        }

        /* renamed from: e */
        public C6659k mo22455e(long j, long j2) {
            return this;
        }

        /* renamed from: f */
        public <T> C6659k mo22456f(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        /* renamed from: g */
        public C6659k mo22457g(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: h */
        public C6659k mo22458h(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: i */
        public int mo22459i() {
            return this.f31142d;
        }
    }

    /* synthetic */ C6659k(C6660a aVar) {
        this();
    }

    /* renamed from: j */
    public static C6659k m38354j() {
        return f31139a;
    }

    /* renamed from: d */
    public abstract C6659k mo22454d(int i, int i2);

    /* renamed from: e */
    public abstract C6659k mo22455e(long j, long j2);

    /* renamed from: f */
    public abstract <T> C6659k mo22456f(T t, T t2, Comparator<T> comparator);

    /* renamed from: g */
    public abstract C6659k mo22457g(boolean z, boolean z2);

    /* renamed from: h */
    public abstract C6659k mo22458h(boolean z, boolean z2);

    /* renamed from: i */
    public abstract int mo22459i();

    private C6659k() {
    }
}
