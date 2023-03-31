package p343rc;

import androidx.recyclerview.widget.RecyclerView;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p190b7.C6690r;
import p264io.grpc.internal.C11158d0;
import p343rc.C12276a1;
import p343rc.C12328i1;

/* renamed from: rc.c1 */
/* compiled from: NameResolverRegistry */
public final class C12297c1 {

    /* renamed from: e */
    private static final Logger f45548e = Logger.getLogger(C12297c1.class.getName());

    /* renamed from: f */
    private static C12297c1 f45549f;

    /* renamed from: a */
    private final C12276a1.C12281d f45550a = new C12299b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f45551b = "unknown";

    /* renamed from: c */
    private final LinkedHashSet<C12291b1> f45552c = new LinkedHashSet<>();

    /* renamed from: d */
    private C6690r<String, C12291b1> f45553d = C6690r.m38472k();

    /* renamed from: rc.c1$b */
    /* compiled from: NameResolverRegistry */
    private final class C12299b extends C12276a1.C12281d {
        private C12299b() {
        }

        /* renamed from: a */
        public String mo35026a() {
            String a;
            synchronized (C12297c1.this) {
                a = C12297c1.this.f45551b;
            }
            return a;
        }

        /* renamed from: b */
        public C12276a1 mo35027b(URI uri, C12276a1.C12278b bVar) {
            C12291b1 b1Var = C12297c1.this.mo36990f().get(uri.getScheme());
            if (b1Var == null) {
                return null;
            }
            return b1Var.mo35027b(uri, bVar);
        }
    }

    /* renamed from: rc.c1$c */
    /* compiled from: NameResolverRegistry */
    private static final class C12300c implements C12328i1.C12330b<C12291b1> {
        private C12300c() {
        }

        /* renamed from: c */
        public int mo36992b(C12291b1 b1Var) {
            return b1Var.mo35029e();
        }

        /* renamed from: d */
        public boolean mo36991a(C12291b1 b1Var) {
            return b1Var.mo35028d();
        }
    }

    /* renamed from: b */
    private synchronized void m59021b(C12291b1 b1Var) {
        C6431n.m37552e(b1Var.mo35028d(), "isAvailable() returned false");
        this.f45552c.add(b1Var);
    }

    /* renamed from: d */
    public static synchronized C12297c1 m59022d() {
        C12297c1 c1Var;
        Class<C12291b1> cls = C12291b1.class;
        synchronized (C12297c1.class) {
            if (f45549f == null) {
                List<T> e = C12328i1.m59081e(cls, m59023e(), cls.getClassLoader(), new C12300c());
                if (e.isEmpty()) {
                    f45548e.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                f45549f = new C12297c1();
                for (T t : e) {
                    Logger logger = f45548e;
                    logger.fine("Service loader found " + t);
                    if (t.mo35028d()) {
                        f45549f.m59021b(t);
                    }
                }
                f45549f.m59024g();
            }
            c1Var = f45549f;
        }
        return c1Var;
    }

    /* renamed from: e */
    static List<Class<?>> m59023e() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C11158d0.class);
        } catch (ClassNotFoundException e) {
            f45548e.log(Level.FINE, "Unable to find DNS NameResolver", e);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: g */
    private synchronized void m59024g() {
        HashMap hashMap = new HashMap();
        int i = RecyclerView.UNDEFINED_DURATION;
        String str = "unknown";
        Iterator it = this.f45552c.iterator();
        while (it.hasNext()) {
            C12291b1 b1Var = (C12291b1) it.next();
            String c = b1Var.mo36955c();
            C12291b1 b1Var2 = (C12291b1) hashMap.get(c);
            if (b1Var2 == null || b1Var2.mo35029e() < b1Var.mo35029e()) {
                hashMap.put(c, b1Var);
            }
            if (i < b1Var.mo35029e()) {
                i = b1Var.mo35029e();
                str = b1Var.mo36955c();
            }
        }
        this.f45553d = C6690r.m38471d(hashMap);
        this.f45551b = str;
    }

    /* renamed from: c */
    public C12276a1.C12281d mo36989c() {
        return this.f45550a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized Map<String, C12291b1> mo36990f() {
        return this.f45553d;
    }
}
