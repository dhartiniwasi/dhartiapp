package p343rc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p264io.grpc.internal.C11357s1;
import p343rc.C12328i1;
import p418zc.C13589i;

/* renamed from: rc.t0 */
/* compiled from: LoadBalancerRegistry */
public final class C12396t0 {

    /* renamed from: c */
    private static final Logger f45739c = Logger.getLogger(C12396t0.class.getName());

    /* renamed from: d */
    private static C12396t0 f45740d;

    /* renamed from: e */
    private static final Iterable<Class<?>> f45741e = m59278c();

    /* renamed from: a */
    private final LinkedHashSet<C12390s0> f45742a = new LinkedHashSet<>();

    /* renamed from: b */
    private final LinkedHashMap<String, C12390s0> f45743b = new LinkedHashMap<>();

    /* renamed from: rc.t0$a */
    /* compiled from: LoadBalancerRegistry */
    private static final class C12397a implements C12328i1.C12330b<C12390s0> {
        C12397a() {
        }

        /* renamed from: c */
        public int mo36992b(C12390s0 s0Var) {
            return s0Var.mo35328c();
        }

        /* renamed from: d */
        public boolean mo36991a(C12390s0 s0Var) {
            return s0Var.mo35329d();
        }
    }

    /* renamed from: a */
    private synchronized void m59276a(C12390s0 s0Var) {
        C6431n.m37552e(s0Var.mo35329d(), "isAvailable() returned false");
        this.f45742a.add(s0Var);
    }

    /* renamed from: b */
    public static synchronized C12396t0 m59277b() {
        C12396t0 t0Var;
        Class<C12390s0> cls = C12390s0.class;
        synchronized (C12396t0.class) {
            if (f45740d == null) {
                List<Class<?>> e = C12328i1.m59081e(cls, f45741e, cls.getClassLoader(), new C12397a());
                f45740d = new C12396t0();
                Iterator<Class<?>> it = e.iterator();
                while (it.hasNext()) {
                    C12390s0 s0Var = (C12390s0) it.next();
                    Logger logger = f45739c;
                    logger.fine("Service loader found " + s0Var);
                    if (s0Var.mo35329d()) {
                        f45740d.m59276a(s0Var);
                    }
                }
                f45740d.m59279e();
            }
            t0Var = f45740d;
        }
        return t0Var;
    }

    /* renamed from: c */
    static List<Class<?>> m59278c() {
        ArrayList arrayList = new ArrayList();
        Class<C11357s1> cls = C11357s1.class;
        try {
            int i = C11357s1.f43608b;
            arrayList.add(cls);
        } catch (ClassNotFoundException e) {
            f45739c.log(Level.WARNING, "Unable to find pick-first LoadBalancer", e);
        }
        Class<C13589i> cls2 = C13589i.class;
        try {
            int i2 = C13589i.f48167b;
            arrayList.add(cls2);
        } catch (ClassNotFoundException e2) {
            f45739c.log(Level.FINE, "Unable to find round-robin LoadBalancer", e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    private synchronized void m59279e() {
        this.f45743b.clear();
        Iterator it = this.f45742a.iterator();
        while (it.hasNext()) {
            C12390s0 s0Var = (C12390s0) it.next();
            String b = s0Var.mo35327b();
            C12390s0 s0Var2 = this.f45743b.get(b);
            if (s0Var2 == null || s0Var2.mo35328c() < s0Var.mo35328c()) {
                this.f45743b.put(b, s0Var);
            }
        }
    }

    /* renamed from: d */
    public synchronized C12390s0 mo37136d(String str) {
        return this.f45743b.get(C6431n.m37562o(str, "policy"));
    }
}
