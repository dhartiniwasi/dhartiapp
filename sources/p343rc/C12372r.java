package p343rc;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: rc.r */
/* compiled from: Context */
public class C12372r {

    /* renamed from: c */
    static final Logger f45707c = Logger.getLogger(C12372r.class.getName());

    /* renamed from: d */
    public static final C12372r f45708d = new C12372r();

    /* renamed from: a */
    final C12311e1<Object, Object> f45709a = null;

    /* renamed from: b */
    final int f45710b = 0;

    /* renamed from: rc.r$a */
    /* compiled from: Context */
    public interface C12373a {
    }

    /* renamed from: rc.r$b */
    /* compiled from: Context */
    private static final class C12374b {

        /* renamed from: a */
        static final C12375c f45711a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            f45711a = m59200a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                C12372r.f45707c.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        /* renamed from: a */
        private static C12375c m59200a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (C12375c) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(C12375c.class).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new C12366o1();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    /* renamed from: rc.r$c */
    /* compiled from: Context */
    public static abstract class C12375c {
        @Deprecated
        /* renamed from: a */
        public void mo37092a(C12372r rVar) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        /* renamed from: b */
        public abstract C12372r mo37077b();

        /* renamed from: c */
        public abstract void mo37078c(C12372r rVar, C12372r rVar2);

        /* renamed from: d */
        public C12372r mo37079d(C12372r rVar) {
            C12372r b = mo37077b();
            mo37092a(rVar);
            return b;
        }
    }

    private C12372r() {
        m59192k(0);
    }

    /* renamed from: d */
    static <T> T m59189d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: e */
    public static C12372r m59190e() {
        C12372r b = m59191j().mo37077b();
        return b == null ? f45708d : b;
    }

    /* renamed from: j */
    static C12375c m59191j() {
        return C12374b.f45711a;
    }

    /* renamed from: k */
    private static void m59192k(int i) {
        if (i == 1000) {
            f45707c.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    /* renamed from: a */
    public void mo37085a(C12373a aVar, Executor executor) {
        m59189d(aVar, "cancellationListener");
        m59189d(executor, "executor");
    }

    /* renamed from: b */
    public C12372r mo37086b() {
        C12372r d = m59191j().mo37079d(this);
        return d == null ? f45708d : d;
    }

    /* renamed from: c */
    public Throwable mo37087c() {
        return null;
    }

    /* renamed from: f */
    public void mo37088f(C12372r rVar) {
        m59189d(rVar, "toAttach");
        m59191j().mo37078c(this, rVar);
    }

    /* renamed from: g */
    public C12392t mo37089g() {
        return null;
    }

    /* renamed from: h */
    public boolean mo37090h() {
        return false;
    }

    /* renamed from: i */
    public void mo37091i(C12373a aVar) {
    }
}
