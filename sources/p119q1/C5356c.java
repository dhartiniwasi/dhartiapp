package p119q1;

import p386w7.C12913c;
import p386w7.C12914d;

/* renamed from: q1.c */
/* compiled from: LogEventDropped */
public final class C5356c {

    /* renamed from: c */
    private static final C5356c f27428c = new C5357a().mo19411a();

    /* renamed from: a */
    private final long f27429a;

    /* renamed from: b */
    private final C5358b f27430b;

    /* renamed from: q1.c$a */
    /* compiled from: LogEventDropped */
    public static final class C5357a {

        /* renamed from: a */
        private long f27431a = 0;

        /* renamed from: b */
        private C5358b f27432b = C5358b.REASON_UNKNOWN;

        C5357a() {
        }

        /* renamed from: a */
        public C5356c mo19411a() {
            return new C5356c(this.f27431a, this.f27432b);
        }

        /* renamed from: b */
        public C5357a mo19412b(long j) {
            this.f27431a = j;
            return this;
        }

        /* renamed from: c */
        public C5357a mo19413c(C5358b bVar) {
            this.f27432b = bVar;
            return this;
        }
    }

    /* renamed from: q1.c$b */
    /* compiled from: LogEventDropped */
    public enum C5358b implements C12913c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a */
        private final int f27441a;

        private C5358b(int i) {
            this.f27441a = i;
        }

        /* renamed from: f */
        public int mo19414f() {
            return this.f27441a;
        }
    }

    C5356c(long j, C5358b bVar) {
        this.f27429a = j;
        this.f27430b = bVar;
    }

    /* renamed from: c */
    public static C5357a m32803c() {
        return new C5357a();
    }

    @C12914d(tag = 1)
    /* renamed from: a */
    public long mo19409a() {
        return this.f27429a;
    }

    @C12914d(tag = 3)
    /* renamed from: b */
    public C5358b mo19410b() {
        return this.f27430b;
    }
}
