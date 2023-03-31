package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p125r0.C5428a;
import p125r0.C5429b;
import p125r0.C5430c;
import p139t0.C5497a;

/* renamed from: androidx.startup.a */
/* compiled from: AppInitializer */
public final class C1464a {

    /* renamed from: d */
    private static volatile C1464a f4189d;

    /* renamed from: e */
    private static final Object f4190e = new Object();

    /* renamed from: a */
    final Map<Class<?>, Object> f4191a = new HashMap();

    /* renamed from: b */
    final Set<Class<? extends C5428a<?>>> f4192b = new HashSet();

    /* renamed from: c */
    final Context f4193c;

    C1464a(Context context) {
        this.f4193c = context.getApplicationContext();
    }

    /* renamed from: d */
    private <T> T m6834d(Class<? extends C5428a<?>> cls, Set<Class<?>> set) {
        T t;
        if (C5497a.m33451h()) {
            try {
                C5497a.m33446c(cls.getSimpleName());
            } catch (Throwable th) {
                C5497a.m33449f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f4191a.containsKey(cls)) {
                set.add(cls);
                C5428a aVar = (C5428a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends C5428a<?>>> a = aVar.mo3604a();
                if (!a.isEmpty()) {
                    for (Class next : a) {
                        if (!this.f4191a.containsKey(next)) {
                            m6834d(next, set);
                        }
                    }
                }
                t = aVar.mo3605b(this.f4193c);
                set.remove(cls);
                this.f4191a.put(cls, t);
            } else {
                t = this.f4191a.get(cls);
            }
            C5497a.m33449f();
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    /* renamed from: e */
    public static C1464a m6835e(Context context) {
        if (f4189d == null) {
            synchronized (f4190e) {
                if (f4189d == null) {
                    f4189d = new C1464a(context);
                }
            }
        }
        return f4189d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5648a() {
        try {
            C5497a.m33446c("Startup");
            mo5649b(this.f4193c.getPackageManager().getProviderInfo(new ComponentName(this.f4193c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            C5497a.m33449f();
        } catch (PackageManager.NameNotFoundException e) {
            throw new C5430c((Throwable) e);
        } catch (Throwable th) {
            C5497a.m33449f();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5649b(Bundle bundle) {
        String string = this.f4193c.getString(C5429b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (C5428a.class.isAssignableFrom(cls)) {
                            this.f4192b.add(cls);
                        }
                    }
                }
                for (Class<? extends C5428a<?>> d : this.f4192b) {
                    m6834d(d, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new C5430c((Throwable) e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public <T> T mo5650c(Class<? extends C5428a<?>> cls) {
        T t;
        synchronized (f4190e) {
            t = this.f4191a.get(cls);
            if (t == null) {
                t = m6834d(cls, new HashSet());
            }
        }
        return t;
    }

    /* renamed from: f */
    public <T> T mo5651f(Class<? extends C5428a<T>> cls) {
        return mo5650c(cls);
    }

    /* renamed from: g */
    public boolean mo5652g(Class<? extends C5428a<?>> cls) {
        return this.f4192b.contains(cls);
    }
}
