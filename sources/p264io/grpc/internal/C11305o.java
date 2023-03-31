package p264io.grpc.internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p182a7.C6431n;
import p343rc.C12308e0;
import p343rc.C12312f;
import p343rc.C12334j0;

/* renamed from: io.grpc.internal.o */
/* compiled from: ChannelTracer */
final class C11305o {

    /* renamed from: f */
    static final Logger f43441f = Logger.getLogger(C12312f.class.getName());

    /* renamed from: a */
    private final Object f43442a = new Object();

    /* renamed from: b */
    private final C12334j0 f43443b;

    /* renamed from: c */
    private final Collection<C12308e0> f43444c;

    /* renamed from: d */
    private final long f43445d;

    /* renamed from: e */
    private int f43446e;

    /* renamed from: io.grpc.internal.o$a */
    /* compiled from: ChannelTracer */
    class C11306a extends ArrayDeque<C12308e0> {

        /* renamed from: a */
        final /* synthetic */ int f43447a;

        C11306a(int i) {
            this.f43447a = i;
        }

        /* renamed from: b */
        public boolean add(C12308e0 e0Var) {
            if (size() == this.f43447a) {
                removeFirst();
            }
            C11305o.m55676a(C11305o.this);
            return super.add(e0Var);
        }
    }

    /* renamed from: io.grpc.internal.o$b */
    /* compiled from: ChannelTracer */
    static /* synthetic */ class C11307b {

        /* renamed from: a */
        static final /* synthetic */ int[] f43449a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                rc.e0$b[] r0 = p343rc.C12308e0.C12310b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43449a = r0
                rc.e0$b r1 = p343rc.C12308e0.C12310b.CT_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43449a     // Catch:{ NoSuchFieldError -> 0x001d }
                rc.e0$b r1 = p343rc.C12308e0.C12310b.CT_WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11305o.C11307b.<clinit>():void");
        }
    }

    C11305o(C12334j0 j0Var, int i, long j, String str) {
        C6431n.m37562o(str, "description");
        this.f43443b = (C12334j0) C6431n.m37562o(j0Var, "logId");
        if (i > 0) {
            this.f43444c = new C11306a(i);
        } else {
            this.f43444c = null;
        }
        this.f43445d = j;
        C12308e0.C12309a aVar = new C12308e0.C12309a();
        mo35265e(aVar.mo37006b(str + " created").mo37007c(C12308e0.C12310b.CT_INFO).mo37009e(j).mo37005a());
    }

    /* renamed from: a */
    static /* synthetic */ int m55676a(C11305o oVar) {
        int i = oVar.f43446e;
        oVar.f43446e = i + 1;
        return i;
    }

    /* renamed from: d */
    static void m55677d(C12334j0 j0Var, Level level, String str) {
        Logger logger = f43441f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + j0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C12334j0 mo35263b() {
        return this.f43443b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo35264c() {
        boolean z;
        synchronized (this.f43442a) {
            z = this.f43444c != null;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo35265e(C12308e0 e0Var) {
        Level level;
        int i = C11307b.f43449a[e0Var.f45567b.ordinal()];
        if (i == 1) {
            level = Level.FINE;
        } else if (i != 2) {
            level = Level.FINEST;
        } else {
            level = Level.FINER;
        }
        mo35266f(e0Var);
        m55677d(this.f43443b, level, e0Var.f45566a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo35266f(C12308e0 e0Var) {
        synchronized (this.f43442a) {
            Collection<C12308e0> collection = this.f43444c;
            if (collection != null) {
                collection.add(e0Var);
            }
        }
    }
}
