package p343rc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p343rc.C12328i1;
import p361tc.C12611g;

/* renamed from: rc.x0 */
/* compiled from: ManagedChannelRegistry */
public final class C12407x0 {

    /* renamed from: c */
    private static final Logger f45754c = Logger.getLogger(C12407x0.class.getName());

    /* renamed from: d */
    private static C12407x0 f45755d;

    /* renamed from: a */
    private final LinkedHashSet<C12404w0> f45756a = new LinkedHashSet<>();

    /* renamed from: b */
    private List<C12404w0> f45757b = Collections.emptyList();

    /* renamed from: rc.x0$a */
    /* compiled from: ManagedChannelRegistry */
    class C12408a implements Comparator<C12404w0> {
        C12408a() {
        }

        /* renamed from: a */
        public int compare(C12404w0 w0Var, C12404w0 w0Var2) {
            return w0Var.mo37148c() - w0Var2.mo37148c();
        }
    }

    /* renamed from: rc.x0$b */
    /* compiled from: ManagedChannelRegistry */
    private static final class C12409b implements C12328i1.C12330b<C12404w0> {
        private C12409b() {
        }

        /* renamed from: c */
        public int mo36992b(C12404w0 w0Var) {
            return w0Var.mo37148c();
        }

        /* renamed from: d */
        public boolean mo36991a(C12404w0 w0Var) {
            return w0Var.mo37147b();
        }

        /* synthetic */ C12409b(C12408a aVar) {
            this();
        }
    }

    /* renamed from: a */
    private synchronized void m59310a(C12404w0 w0Var) {
        C6431n.m37552e(w0Var.mo37147b(), "isAvailable() returned false");
        this.f45756a.add(w0Var);
    }

    /* renamed from: b */
    public static synchronized C12407x0 m59311b() {
        C12407x0 x0Var;
        Class<C12404w0> cls = C12404w0.class;
        synchronized (C12407x0.class) {
            if (f45755d == null) {
                List<T> e = C12328i1.m59081e(cls, m59312c(), cls.getClassLoader(), new C12409b((C12408a) null));
                f45755d = new C12407x0();
                for (T t : e) {
                    Logger logger = f45754c;
                    logger.fine("Service loader found " + t);
                    if (t.mo37147b()) {
                        f45755d.m59310a(t);
                    }
                }
                f45755d.m59313f();
            }
            x0Var = f45755d;
        }
        return x0Var;
    }

    /* renamed from: c */
    static List<Class<?>> m59312c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C12611g.class);
        } catch (ClassNotFoundException e) {
            f45754c.log(Level.FINE, "Unable to find OkHttpChannelProvider", e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
            f45754c.log(Level.FINE, "Unable to find NettyChannelProvider", e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            f45754c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", e3);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: f */
    private synchronized void m59313f() {
        ArrayList arrayList = new ArrayList(this.f45756a);
        Collections.sort(arrayList, Collections.reverseOrder(new C12408a()));
        this.f45757b = Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C12404w0 mo37154d() {
        List<C12404w0> e = mo37155e();
        if (e.isEmpty()) {
            return null;
        }
        return e.get(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized List<C12404w0> mo37155e() {
        return this.f45757b;
    }
}
