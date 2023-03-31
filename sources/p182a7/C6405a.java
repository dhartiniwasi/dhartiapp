package p182a7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a7.a */
/* compiled from: AbstractIterator */
abstract class C6405a<T> implements Iterator<T> {

    /* renamed from: a */
    private C6407b f30649a = C6407b.NOT_READY;

    /* renamed from: b */
    private T f30650b;

    /* renamed from: a7.a$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C6406a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30651a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                a7.a$b[] r0 = p182a7.C6405a.C6407b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30651a = r0
                a7.a$b r1 = p182a7.C6405a.C6407b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30651a     // Catch:{ NoSuchFieldError -> 0x001d }
                a7.a$b r1 = p182a7.C6405a.C6407b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p182a7.C6405a.C6406a.<clinit>():void");
        }
    }

    /* renamed from: a7.a$b */
    /* compiled from: AbstractIterator */
    private enum C6407b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C6405a() {
    }

    /* renamed from: d */
    private boolean m37498d() {
        this.f30649a = C6407b.FAILED;
        this.f30650b = mo21821a();
        if (this.f30649a == C6407b.DONE) {
            return false;
        }
        this.f30649a = C6407b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo21821a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final T mo21822c() {
        this.f30649a = C6407b.DONE;
        return null;
    }

    public final boolean hasNext() {
        C6431n.m37567t(this.f30649a != C6407b.FAILED);
        int i = C6406a.f30651a[this.f30649a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m37498d();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f30649a = C6407b.NOT_READY;
            T a = C6424i.m37540a(this.f30650b);
            this.f30650b = null;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
