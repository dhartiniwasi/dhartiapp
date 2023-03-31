package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.g0 */
/* compiled from: ViewModel */
public abstract class C1194g0 {

    /* renamed from: a */
    private final Map<String, Object> f3311a = new HashMap();

    /* renamed from: b */
    private final Set<Closeable> f3312b = new LinkedHashSet();

    /* renamed from: c */
    private volatile boolean f3313c = false;

    /* renamed from: b */
    private static void m5397b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4392a() {
        this.f3313c = true;
        Map<String, Object> map = this.f3311a;
        if (map != null) {
            synchronized (map) {
                for (Object b : this.f3311a.values()) {
                    m5397b(b);
                }
            }
        }
        Set<Closeable> set = this.f3312b;
        if (set != null) {
            synchronized (set) {
                for (Closeable b2 : this.f3312b) {
                    m5397b(b2);
                }
            }
        }
        mo4218d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo4393c(String str) {
        T t;
        Map<String, Object> map = this.f3311a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.f3311a.get(str);
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo4218d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public <T> T mo4394e(String str, T t) {
        T t2;
        synchronized (this.f3311a) {
            t2 = this.f3311a.get(str);
            if (t2 == null) {
                this.f3311a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f3313c) {
            m5397b(t);
        }
        return t;
    }
}
