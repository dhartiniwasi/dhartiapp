package p218e6;

import java.util.concurrent.ExecutionException;

/* renamed from: e6.p */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9984p<T> implements C9983o<T> {

    /* renamed from: a */
    private final Object f39920a = new Object();

    /* renamed from: b */
    private final int f39921b;

    /* renamed from: c */
    private final C9976i0 f39922c;

    /* renamed from: d */
    private int f39923d;

    /* renamed from: e */
    private int f39924e;

    /* renamed from: f */
    private int f39925f;

    /* renamed from: g */
    private Exception f39926g;

    /* renamed from: h */
    private boolean f39927h;

    public C9984p(int i, C9976i0 i0Var) {
        this.f39921b = i;
        this.f39922c = i0Var;
    }

    /* renamed from: b */
    private final void m51041b() {
        if (this.f39923d + this.f39924e + this.f39925f != this.f39921b) {
            return;
        }
        if (this.f39926g != null) {
            C9976i0 i0Var = this.f39922c;
            int i = this.f39924e;
            int i2 = this.f39921b;
            i0Var.mo32537t(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f39926g));
        } else if (this.f39927h) {
            this.f39922c.mo32539v();
        } else {
            this.f39922c.mo32538u((Object) null);
        }
    }

    /* renamed from: a */
    public final void mo277a(T t) {
        synchronized (this.f39920a) {
            this.f39923d++;
            m51041b();
        }
    }

    /* renamed from: c */
    public final void mo32531c() {
        synchronized (this.f39920a) {
            this.f39925f++;
            this.f39927h = true;
            m51041b();
        }
    }

    /* renamed from: d */
    public final void mo272d(Exception exc) {
        synchronized (this.f39920a) {
            this.f39924e++;
            this.f39926g = exc;
            m51041b();
        }
    }
}
