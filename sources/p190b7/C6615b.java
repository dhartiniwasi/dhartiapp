package p190b7;

import java.util.NoSuchElementException;
import p182a7.C6431n;

/* renamed from: b7.b */
/* compiled from: AbstractIterator */
public abstract class C6615b<T> extends C6695s0<T> {

    /* renamed from: a */
    private C6617b f31081a = C6617b.NOT_READY;

    /* renamed from: b */
    private T f31082b;

    /* renamed from: b7.b$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C6616a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31083a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                b7.b$b[] r0 = p190b7.C6615b.C6617b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31083a = r0
                b7.b$b r1 = p190b7.C6615b.C6617b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31083a     // Catch:{ NoSuchFieldError -> 0x001d }
                b7.b$b r1 = p190b7.C6615b.C6617b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p190b7.C6615b.C6616a.<clinit>():void");
        }
    }

    /* renamed from: b7.b$b */
    /* compiled from: AbstractIterator */
    private enum C6617b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C6615b() {
    }

    /* renamed from: d */
    private boolean m38242d() {
        this.f31081a = C6617b.FAILED;
        this.f31082b = mo22251a();
        if (this.f31081a == C6617b.DONE) {
            return false;
        }
        this.f31081a = C6617b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo22251a();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final T mo22252c() {
        this.f31081a = C6617b.DONE;
        return null;
    }

    public final boolean hasNext() {
        C6431n.m37567t(this.f31081a != C6617b.FAILED);
        int i = C6616a.f31083a[this.f31081a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m38242d();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f31081a = C6617b.NOT_READY;
            T a = C6649f0.m38329a(this.f31082b);
            this.f31082b = null;
            return a;
        }
        throw new NoSuchElementException();
    }
}
