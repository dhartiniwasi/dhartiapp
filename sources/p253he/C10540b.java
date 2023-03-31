package p253he;

/* renamed from: he.b */
/* compiled from: NamedRunnable */
public abstract class C10540b implements Runnable {

    /* renamed from: a */
    protected final String f41556a;

    public C10540b(String str, Object... objArr) {
        this.f41556a = C10543e.m53055p(str, objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33250a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f41556a);
        try {
            mo33250a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
