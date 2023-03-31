package p264io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: io.flutter.plugins.webviewflutter.i2 */
/* compiled from: InstanceManager */
public class C10932i2 {

    /* renamed from: a */
    private final WeakHashMap<Object, Long> f42493a = new WeakHashMap<>();

    /* renamed from: b */
    private final HashMap<Long, WeakReference<Object>> f42494b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<Long, Object> f42495c = new HashMap<>();

    /* renamed from: d */
    private final ReferenceQueue<Object> f42496d = new ReferenceQueue<>();

    /* renamed from: e */
    private final HashMap<WeakReference<Object>, Long> f42497e = new HashMap<>();

    /* renamed from: f */
    private final Handler f42498f;

    /* renamed from: g */
    private final C10933a f42499g;

    /* renamed from: h */
    private long f42500h;

    /* renamed from: i */
    private boolean f42501i;

    /* renamed from: io.flutter.plugins.webviewflutter.i2$a */
    /* compiled from: InstanceManager */
    public interface C10933a {
        /* renamed from: a */
        void mo34673a(long j);
    }

    private C10932i2(C10933a aVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f42498f = handler;
        this.f42500h = 65536;
        this.f42501i = false;
        this.f42499g = aVar;
        handler.postDelayed(new C10927h2(this), 30000);
    }

    /* renamed from: c */
    private void m54409c(Object obj, long j) {
        if (j >= 0) {
            WeakReference weakReference = new WeakReference(obj, this.f42496d);
            this.f42493a.put(obj, Long.valueOf(j));
            this.f42494b.put(Long.valueOf(j), weakReference);
            this.f42497e.put(weakReference, Long.valueOf(j));
            this.f42495c.put(Long.valueOf(j), obj);
            return;
        }
        throw new IllegalArgumentException("Identifier must be >= 0.");
    }

    /* renamed from: d */
    private void m54410d() {
        if (this.f42501i) {
            throw new AssertionError("Manager has already been closed.");
        }
    }

    /* renamed from: i */
    public static C10932i2 m54411i(C10933a aVar) {
        return new C10932i2(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m54412j() {
        while (true) {
            WeakReference weakReference = (WeakReference) this.f42496d.poll();
            if (weakReference != null) {
                Long remove = this.f42497e.remove(weakReference);
                if (remove != null) {
                    this.f42494b.remove(remove);
                    this.f42495c.remove(remove);
                    this.f42499g.mo34673a(remove.longValue());
                }
            } else {
                this.f42498f.postDelayed(new C10927h2(this), 30000);
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo34667b(Object obj, long j) {
        m54410d();
        m54409c(obj, j);
    }

    /* renamed from: e */
    public void mo34668e() {
        this.f42498f.removeCallbacks(new C10927h2(this));
        this.f42501i = true;
    }

    /* renamed from: f */
    public boolean mo34669f(Object obj) {
        m54410d();
        return this.f42493a.containsKey(obj);
    }

    /* renamed from: g */
    public Long mo34670g(Object obj) {
        m54410d();
        Long l = this.f42493a.get(obj);
        if (l != null) {
            this.f42495c.put(l, obj);
        }
        return l;
    }

    /* renamed from: h */
    public <T> T mo34671h(long j) {
        m54410d();
        WeakReference weakReference = this.f42494b.get(Long.valueOf(j));
        if (weakReference != null) {
            return weakReference.get();
        }
        return this.f42495c.get(Long.valueOf(j));
    }

    /* renamed from: k */
    public <T> T mo34672k(long j) {
        m54410d();
        return this.f42495c.remove(Long.valueOf(j));
    }
}
