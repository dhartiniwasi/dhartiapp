package p161w3;

/* renamed from: w3.g */
/* compiled from: ConditionVariable */
public class C5933g {

    /* renamed from: a */
    private final C5923d f29076a;

    /* renamed from: b */
    private boolean f29077b;

    public C5933g() {
        this(C5923d.f29058a);
    }

    /* renamed from: a */
    public synchronized void mo20592a() throws InterruptedException {
        while (!this.f29077b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized void mo20593b() {
        boolean z = false;
        while (!this.f29077b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public synchronized boolean mo20594c() {
        boolean z;
        z = this.f29077b;
        this.f29077b = false;
        return z;
    }

    /* renamed from: d */
    public synchronized boolean mo20595d() {
        return this.f29077b;
    }

    /* renamed from: e */
    public synchronized boolean mo20596e() {
        if (this.f29077b) {
            return false;
        }
        this.f29077b = true;
        notifyAll();
        return true;
    }

    public C5933g(C5923d dVar) {
        this.f29076a = dVar;
    }
}
