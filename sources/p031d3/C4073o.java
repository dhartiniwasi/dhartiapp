package p031d3;

import java.util.NoSuchElementException;

/* renamed from: d3.o */
/* compiled from: MediaChunkIterator */
public interface C4073o {

    /* renamed from: a */
    public static final C4073o f23214a = new C4074a();

    /* renamed from: d3.o$a */
    /* compiled from: MediaChunkIterator */
    class C4074a implements C4073o {
        C4074a() {
        }

        /* renamed from: a */
        public long mo7774a() {
            throw new NoSuchElementException();
        }

        /* renamed from: b */
        public long mo7775b() {
            throw new NoSuchElementException();
        }

        public boolean next() {
            return false;
        }
    }

    /* renamed from: a */
    long mo7774a();

    /* renamed from: b */
    long mo7775b();

    boolean next();
}
