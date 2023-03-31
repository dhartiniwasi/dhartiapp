package p004a2;

import android.media.metrics.LogSessionId;
import p161w3.C5917a;
import p161w3.C5953m0;

/* renamed from: a2.u1 */
/* compiled from: PlayerId */
public final class C0079u1 {

    /* renamed from: b */
    public static final C0079u1 f228b = (C5953m0.f29110a < 31 ? new C0079u1() : new C0079u1(C0080a.f230b));

    /* renamed from: a */
    private final C0080a f229a;

    /* renamed from: a2.u1$a */
    /* compiled from: PlayerId */
    private static final class C0080a {

        /* renamed from: b */
        public static final C0080a f230b = new C0080a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a */
        public final LogSessionId f231a;

        public C0080a(LogSessionId logSessionId) {
            this.f231a = logSessionId;
        }
    }

    public C0079u1() {
        this((C0080a) null);
        C5917a.m34873f(C5953m0.f29110a < 31);
    }

    /* renamed from: a */
    public LogSessionId mo214a() {
        return ((C0080a) C5917a.m34872e(this.f229a)).f231a;
    }

    public C0079u1(LogSessionId logSessionId) {
        this(new C0080a(logSessionId));
    }

    private C0079u1(C0080a aVar) {
        this.f229a = aVar;
    }
}
