package p409yc;

import java.util.logging.Logger;
import p182a7.C6443s;
import p343rc.C12292c;

/* renamed from: yc.c */
/* compiled from: ClientCalls */
public final class C13262c {

    /* renamed from: a */
    private static final Logger f47588a = Logger.getLogger(C13262c.class.getName());

    /* renamed from: b */
    static boolean f47589b = (!C6443s.m37600a(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")));

    /* renamed from: c */
    static final C12292c.C12293a<C13263a> f47590c = C12292c.C12293a.m59009b("internal-stub-type");

    /* renamed from: yc.c$a */
    /* compiled from: ClientCalls */
    enum C13263a {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    private C13262c() {
    }
}
