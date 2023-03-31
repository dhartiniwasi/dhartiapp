package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p170y0.C6090g;
import p170y0.C6092i;
import p170y0.C6108q;
import p170y0.C6114v;
import p176z0.C6182a;

/* renamed from: androidx.work.a */
/* compiled from: Configuration */
public final class C1532a {

    /* renamed from: a */
    final Executor f4396a;

    /* renamed from: b */
    final Executor f4397b;

    /* renamed from: c */
    final C6114v f4398c;

    /* renamed from: d */
    final C6092i f4399d;

    /* renamed from: e */
    final C6108q f4400e;

    /* renamed from: f */
    final C6090g f4401f;

    /* renamed from: g */
    final String f4402g;

    /* renamed from: h */
    final int f4403h;

    /* renamed from: i */
    final int f4404i;

    /* renamed from: j */
    final int f4405j;

    /* renamed from: k */
    final int f4406k;

    /* renamed from: l */
    private final boolean f4407l;

    /* renamed from: androidx.work.a$a */
    /* compiled from: Configuration */
    class C1533a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f4408a = new AtomicInteger(0);

        /* renamed from: b */
        final /* synthetic */ boolean f4409b;

        C1533a(boolean z) {
            this.f4409b = z;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f4409b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f4408a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.a$b */
    /* compiled from: Configuration */
    public static final class C1534b {

        /* renamed from: a */
        Executor f4411a;

        /* renamed from: b */
        C6114v f4412b;

        /* renamed from: c */
        C6092i f4413c;

        /* renamed from: d */
        Executor f4414d;

        /* renamed from: e */
        C6108q f4415e;

        /* renamed from: f */
        C6090g f4416f;

        /* renamed from: g */
        String f4417g;

        /* renamed from: h */
        int f4418h = 4;

        /* renamed from: i */
        int f4419i = 0;

        /* renamed from: j */
        int f4420j = Integer.MAX_VALUE;

        /* renamed from: k */
        int f4421k = 20;

        /* renamed from: a */
        public C1532a mo6297a() {
            return new C1532a(this);
        }

        /* renamed from: b */
        public C1534b mo6298b(Executor executor) {
            this.f4411a = executor;
            return this;
        }
    }

    /* renamed from: androidx.work.a$c */
    /* compiled from: Configuration */
    public interface C1535c {
        /* renamed from: a */
        C1532a mo6299a();
    }

    C1532a(C1534b bVar) {
        Executor executor = bVar.f4411a;
        if (executor == null) {
            this.f4396a = m7105a(false);
        } else {
            this.f4396a = executor;
        }
        Executor executor2 = bVar.f4414d;
        if (executor2 == null) {
            this.f4407l = true;
            this.f4397b = m7105a(true);
        } else {
            this.f4407l = false;
            this.f4397b = executor2;
        }
        C6114v vVar = bVar.f4412b;
        if (vVar == null) {
            this.f4398c = C6114v.m35760c();
        } else {
            this.f4398c = vVar;
        }
        C6092i iVar = bVar.f4413c;
        if (iVar == null) {
            this.f4399d = C6092i.m35713c();
        } else {
            this.f4399d = iVar;
        }
        C6108q qVar = bVar.f4415e;
        if (qVar == null) {
            this.f4400e = new C6182a();
        } else {
            this.f4400e = qVar;
        }
        this.f4403h = bVar.f4418h;
        this.f4404i = bVar.f4419i;
        this.f4405j = bVar.f4420j;
        this.f4406k = bVar.f4421k;
        this.f4401f = bVar.f4416f;
        this.f4402g = bVar.f4417g;
    }

    /* renamed from: a */
    private Executor m7105a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m7106b(z));
    }

    /* renamed from: b */
    private ThreadFactory m7106b(boolean z) {
        return new C1533a(z);
    }

    /* renamed from: c */
    public String mo6285c() {
        return this.f4402g;
    }

    /* renamed from: d */
    public C6090g mo6286d() {
        return this.f4401f;
    }

    /* renamed from: e */
    public Executor mo6287e() {
        return this.f4396a;
    }

    /* renamed from: f */
    public C6092i mo6288f() {
        return this.f4399d;
    }

    /* renamed from: g */
    public int mo6289g() {
        return this.f4405j;
    }

    /* renamed from: h */
    public int mo6290h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f4406k / 2;
        }
        return this.f4406k;
    }

    /* renamed from: i */
    public int mo6291i() {
        return this.f4404i;
    }

    /* renamed from: j */
    public int mo6292j() {
        return this.f4403h;
    }

    /* renamed from: k */
    public C6108q mo6293k() {
        return this.f4400e;
    }

    /* renamed from: l */
    public Executor mo6294l() {
        return this.f4397b;
    }

    /* renamed from: m */
    public C6114v mo6295m() {
        return this.f4398c;
    }
}
