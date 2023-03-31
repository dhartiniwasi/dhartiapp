package p264io.grpc.internal;

import java.text.MessageFormat;
import java.util.logging.Level;
import p182a7.C6431n;
import p343rc.C12308e0;
import p343rc.C12312f;
import p343rc.C12334j0;

/* renamed from: io.grpc.internal.n */
/* compiled from: ChannelLoggerImpl */
final class C11299n extends C12312f {

    /* renamed from: a */
    private final C11305o f43426a;

    /* renamed from: b */
    private final C11287l2 f43427b;

    /* renamed from: io.grpc.internal.n$a */
    /* compiled from: ChannelLoggerImpl */
    static /* synthetic */ class C11300a {

        /* renamed from: a */
        static final /* synthetic */ int[] f43428a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                rc.f$a[] r0 = p343rc.C12312f.C12313a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43428a = r0
                rc.f$a r1 = p343rc.C12312f.C12313a.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43428a     // Catch:{ NoSuchFieldError -> 0x001d }
                rc.f$a r1 = p343rc.C12312f.C12313a.WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43428a     // Catch:{ NoSuchFieldError -> 0x0028 }
                rc.f$a r1 = p343rc.C12312f.C12313a.INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11299n.C11300a.<clinit>():void");
        }
    }

    C11299n(C11305o oVar, C11287l2 l2Var) {
        this.f43426a = (C11305o) C6431n.m37562o(oVar, "tracer");
        this.f43427b = (C11287l2) C6431n.m37562o(l2Var, "time");
    }

    /* renamed from: c */
    private boolean m55658c(C12312f.C12313a aVar) {
        return aVar != C12312f.C12313a.DEBUG && this.f43426a.mo35264c();
    }

    /* renamed from: d */
    static void m55659d(C12334j0 j0Var, C12312f.C12313a aVar, String str) {
        Level f = m55661f(aVar);
        if (C11305o.f43441f.isLoggable(f)) {
            C11305o.m55677d(j0Var, f, str);
        }
    }

    /* renamed from: e */
    static void m55660e(C12334j0 j0Var, C12312f.C12313a aVar, String str, Object... objArr) {
        Level f = m55661f(aVar);
        if (C11305o.f43441f.isLoggable(f)) {
            C11305o.m55677d(j0Var, f, MessageFormat.format(str, objArr));
        }
    }

    /* renamed from: f */
    private static Level m55661f(C12312f.C12313a aVar) {
        int i = C11300a.f43428a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            return Level.FINE;
        }
        if (i != 3) {
            return Level.FINEST;
        }
        return Level.FINER;
    }

    /* renamed from: g */
    private static C12308e0.C12310b m55662g(C12312f.C12313a aVar) {
        int i = C11300a.f43428a[aVar.ordinal()];
        if (i == 1) {
            return C12308e0.C12310b.CT_ERROR;
        }
        if (i != 2) {
            return C12308e0.C12310b.CT_INFO;
        }
        return C12308e0.C12310b.CT_WARNING;
    }

    /* renamed from: h */
    private void m55663h(C12312f.C12313a aVar, String str) {
        if (aVar != C12312f.C12313a.DEBUG) {
            this.f43426a.mo35266f(new C12308e0.C12309a().mo37006b(str).mo37007c(m55662g(aVar)).mo37009e(this.f43427b.mo35246a()).mo37005a());
        }
    }

    /* renamed from: a */
    public void mo35255a(C12312f.C12313a aVar, String str) {
        m55659d(this.f43426a.mo35263b(), aVar, str);
        if (m55658c(aVar)) {
            m55663h(aVar, str);
        }
    }

    /* renamed from: b */
    public void mo35256b(C12312f.C12313a aVar, String str, Object... objArr) {
        String str2;
        Level f = m55661f(aVar);
        if (m55658c(aVar) || C11305o.f43441f.isLoggable(f)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        mo35255a(aVar, str2);
    }
}
