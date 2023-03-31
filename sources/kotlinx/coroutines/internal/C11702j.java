package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p243gd.C10341m;
import p243gd.C10344n;
import p335qd.C12224a;
import p344rd.C12439l;
import p410yd.C13269b0;

/* renamed from: kotlinx.coroutines.internal.j */
/* compiled from: ExceptionsConstructor.kt */
public final class C11702j {

    /* renamed from: a */
    private static final int f44274a = m56892f(Throwable.class, -1);

    /* renamed from: b */
    private static final C11693g f44275b;

    /* renamed from: kotlinx.coroutines.internal.j$a */
    /* compiled from: Comparisons.kt */
    public static final class C11703a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C10610b.m53194a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$b */
    /* compiled from: ExceptionsConstructor.kt */
    static final class C11704b extends C11670l implements C12439l {

        /* renamed from: a */
        public static final C11704b f44276a = new C11704b();

        C11704b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$c */
    /* compiled from: ExceptionsConstructor.kt */
    public static final class C11705c extends C11670l implements C12439l<Throwable, Throwable> {

        /* renamed from: a */
        final /* synthetic */ Constructor f44277a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11705c(Constructor constructor) {
            super(1);
            this.f44277a = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10341m.C10342a aVar = C10341m.f40958a;
                Object newInstance = this.f44277a.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    obj = C10341m.m52240a((Throwable) newInstance);
                    if (C10341m.m52242c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C10341m.C10342a aVar2 = C10341m.f40958a;
                obj = C10341m.m52240a(C10344n.m52244a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$d */
    /* compiled from: ExceptionsConstructor.kt */
    public static final class C11706d extends C11670l implements C12439l<Throwable, Throwable> {

        /* renamed from: a */
        final /* synthetic */ Constructor f44278a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11706d(Constructor constructor) {
            super(1);
            this.f44278a = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10341m.C10342a aVar = C10341m.f40958a;
                Object newInstance = this.f44278a.newInstance(new Object[]{th});
                if (newInstance != null) {
                    obj = C10341m.m52240a((Throwable) newInstance);
                    if (C10341m.m52242c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th2) {
                C10341m.C10342a aVar2 = C10341m.f40958a;
                obj = C10341m.m52240a(C10344n.m52244a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$e */
    /* compiled from: ExceptionsConstructor.kt */
    public static final class C11707e extends C11670l implements C12439l<Throwable, Throwable> {

        /* renamed from: a */
        final /* synthetic */ Constructor f44279a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11707e(Constructor constructor) {
            super(1);
            this.f44279a = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10341m.C10342a aVar = C10341m.f40958a;
                Object newInstance = this.f44279a.newInstance(new Object[]{th.getMessage()});
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C10341m.m52240a(th2);
                    if (C10341m.m52242c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C10341m.C10342a aVar2 = C10341m.f40958a;
                obj = C10341m.m52240a(C10344n.m52244a(th3));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.j$f */
    /* compiled from: ExceptionsConstructor.kt */
    public static final class C11708f extends C11670l implements C12439l<Throwable, Throwable> {

        /* renamed from: a */
        final /* synthetic */ Constructor f44280a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11708f(Constructor constructor) {
            super(1);
            this.f44280a = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th) {
            Object obj;
            try {
                C10341m.C10342a aVar = C10341m.f40958a;
                Object newInstance = this.f44280a.newInstance(new Object[0]);
                if (newInstance != null) {
                    Throwable th2 = (Throwable) newInstance;
                    th2.initCause(th);
                    obj = C10341m.m52240a(th2);
                    if (C10341m.m52242c(obj)) {
                        obj = null;
                    }
                    return (Throwable) obj;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
            } catch (Throwable th3) {
                C10341m.C10342a aVar2 = C10341m.f40958a;
                obj = C10341m.m52240a(C10344n.m52244a(th3));
            }
        }
    }

    static {
        C11693g gVar;
        try {
            if (C11712l.m56922a()) {
                gVar = C11717n0.f44293a;
            } else {
                gVar = C11686d.f44252a;
            }
        } catch (Throwable unused) {
            gVar = C11717n0.f44293a;
        }
        f44275b = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final <E extends Throwable> C12439l<Throwable, Throwable> m56888b(Class<E> cls) {
        C11704b bVar = C11704b.f44276a;
        if (f44274a != m56892f(cls, 0)) {
            return bVar;
        }
        for (Constructor c : C10515f.m52938n(cls.getConstructors(), new C11703a())) {
            C12439l<Throwable, Throwable> c2 = m56889c(c);
            if (c2 != null) {
                return c2;
            }
        }
        return bVar;
    }

    /* renamed from: c */
    private static final C12439l<Throwable, Throwable> m56889c(Constructor<?> constructor) {
        Class<String> cls = String.class;
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new C11708f(constructor);
        }
        if (length == 1) {
            Class cls2 = parameterTypes[0];
            if (C11669k.m56783a(cls2, Throwable.class)) {
                return new C11706d(constructor);
            }
            if (C11669k.m56783a(cls2, cls)) {
                return new C11707e(constructor);
            }
            return null;
        } else if (length == 2 && C11669k.m56783a(parameterTypes[0], cls) && C11669k.m56783a(parameterTypes[1], Throwable.class)) {
            return new C11705c(constructor);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    private static final int m56890d(Class<?> cls, int i) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            int i3 = 0;
            Class<? super Object> cls2 = cls;
            while (i2 < length) {
                Field field = declaredFields[i2];
                i2++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i3++;
                }
            }
            i += i3;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i;
    }

    /* renamed from: e */
    static /* synthetic */ int m56891e(Class cls, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m56890d(cls, i);
    }

    /* renamed from: f */
    private static final int m56892f(Class<?> cls, int i) {
        Integer num;
        C12224a.m58667c(cls);
        try {
            C10341m.C10342a aVar = C10341m.f40958a;
            num = C10341m.m52240a(Integer.valueOf(m56891e(cls, 0, 1, (Object) null)));
        } catch (Throwable th) {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            num = C10341m.m52240a(C10344n.m52244a(th));
        }
        Integer valueOf = Integer.valueOf(i);
        if (C10341m.m52242c(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /* renamed from: g */
    public static final <E extends Throwable> E m56893g(E e) {
        E e2;
        if (!(e instanceof C13269b0)) {
            return (Throwable) f44275b.mo35886a(e.getClass()).invoke(e);
        }
        try {
            C10341m.C10342a aVar = C10341m.f40958a;
            e2 = C10341m.m52240a(((C13269b0) e).mo38393a());
        } catch (Throwable th) {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            e2 = C10341m.m52240a(C10344n.m52244a(th));
        }
        if (C10341m.m52242c(e2)) {
            e2 = null;
        }
        return (Throwable) e2;
    }
}
