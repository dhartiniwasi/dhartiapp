package p343rc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: rc.i1 */
/* compiled from: ServiceProviders */
final class C12328i1 {

    /* renamed from: rc.i1$a */
    /* compiled from: ServiceProviders */
    class C12329a implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ C12330b f45596a;

        C12329a(C12330b bVar) {
            this.f45596a = bVar;
        }

        public int compare(T t, T t2) {
            int b = this.f45596a.mo36992b(t) - this.f45596a.mo36992b(t2);
            if (b != 0) {
                return b;
            }
            return t.getClass().getName().compareTo(t2.getClass().getName());
        }
    }

    /* renamed from: rc.i1$b */
    /* compiled from: ServiceProviders */
    public interface C12330b<T> {
        /* renamed from: a */
        boolean mo36991a(T t);

        /* renamed from: b */
        int mo36992b(T t);
    }

    /* renamed from: a */
    private static <T> T m59077a(Class<T> cls, Class<?> cls2) {
        try {
            return cls2.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable th) {
            throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", new Object[]{cls2.getName(), th}), th);
        }
    }

    /* renamed from: b */
    static <T> Iterable<T> m59078b(Class<T> cls, Iterable<Class<?>> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Class<?> a : iterable) {
            T a2 = m59077a(cls, a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static <T> Iterable<T> m59079c(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader<S> load = ServiceLoader.load(cls, classLoader);
        return !load.iterator().hasNext() ? ServiceLoader.load(cls) : load;
    }

    /* renamed from: d */
    static boolean m59080d(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<java.lang.Class<?>>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> java.util.List<T> m59081e(java.lang.Class<T> r1, java.lang.Iterable<java.lang.Class<?>> r2, java.lang.ClassLoader r3, p343rc.C12328i1.C12330b<T> r4) {
        /*
            boolean r0 = m59080d(r3)
            if (r0 == 0) goto L_0x000b
            java.lang.Iterable r1 = m59078b(r1, r2)
            goto L_0x000f
        L_0x000b:
            java.lang.Iterable r1 = m59079c(r1, r3)
        L_0x000f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0018:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r3 = r1.next()
            boolean r0 = r4.mo36991a(r3)
            if (r0 != 0) goto L_0x0029
            goto L_0x0018
        L_0x0029:
            r2.add(r3)
            goto L_0x0018
        L_0x002d:
            rc.i1$a r1 = new rc.i1$a
            r1.<init>(r4)
            java.util.Comparator r1 = java.util.Collections.reverseOrder(r1)
            java.util.Collections.sort(r2, r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p343rc.C12328i1.m59081e(java.lang.Class, java.lang.Iterable, java.lang.ClassLoader, rc.i1$b):java.util.List");
    }
}
