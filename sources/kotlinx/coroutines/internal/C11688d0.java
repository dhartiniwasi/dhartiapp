package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.C11649e;
import kotlin.jvm.internal.C11669k;
import p243gd.C10340l;
import p243gd.C10341m;
import p243gd.C10344n;
import p243gd.C10346p;
import p410yd.C13269b0;
import p410yd.C13330n0;

/* renamed from: kotlinx.coroutines.internal.d0 */
/* compiled from: StackTraceRecovery.kt */
public final class C11688d0 {

    /* renamed from: a */
    private static final String f44254a;

    /* renamed from: b */
    private static final String f44255b;

    static {
        Object obj;
        Object obj2;
        try {
            C10341m.C10342a aVar = C10341m.f40958a;
            obj = C10341m.m52240a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            C10341m.C10342a aVar2 = C10341m.f40958a;
            obj = C10341m.m52240a(C10344n.m52244a(th));
        }
        if (C10341m.m52241b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f44254a = (String) obj;
        try {
            C10341m.C10342a aVar3 = C10341m.f40958a;
            obj2 = C10341m.m52240a(C11688d0.class.getCanonicalName());
        } catch (Throwable th2) {
            C10341m.C10342a aVar4 = C10341m.f40958a;
            obj2 = C10341m.m52240a(C10344n.m52244a(th2));
        }
        if (C10341m.m52241b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f44255b = (String) obj2;
    }

    /* renamed from: b */
    public static final StackTraceElement m56838b(String str) {
        return new StackTraceElement(C11669k.m56792j("\b\b\b(", str), "\b", "\b", -1);
    }

    /* renamed from: c */
    private static final <E extends Throwable> C10340l<E, StackTraceElement[]> m56839c(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C11669k.m56783a(cause.getClass(), e.getClass())) {
            return C10346p.m52247a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            i++;
            if (m56844h(stackTraceElement)) {
                z = true;
                break;
            }
        }
        if (z) {
            return C10346p.m52247a(cause, stackTrace);
        }
        return C10346p.m52247a(e, new StackTraceElement[0]);
    }

    /* renamed from: d */
    private static final <E extends Throwable> E m56840d(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m56838b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int g = m56843g(stackTrace, f44254a);
        int i = 0;
        if (g == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e2.setStackTrace((StackTraceElement[]) array);
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + g)];
        for (int i2 = 0; i2 < g; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i3 = i + 1;
            stackTraceElementArr[i + g] = it.next();
            i = i3;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /* renamed from: e */
    private static final ArrayDeque<StackTraceElement> m56841e(C11649e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    /* renamed from: f */
    private static final boolean m56842f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C11669k.m56783a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C11669k.m56783a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C11669k.m56783a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: g */
    private static final int m56843g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (C11669k.m56783a(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: h */
    public static final boolean m56844h(StackTraceElement stackTraceElement) {
        return C13010n.m61260n(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    /* renamed from: i */
    private static final void m56845i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            int i2 = i + 1;
            if (m56844h(stackTraceElementArr[i])) {
                break;
            }
            i = i2;
        }
        int i3 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 <= length2) {
            while (true) {
                int i4 = length2 - 1;
                if (m56842f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i3) {
                    length2 = i4;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final <E extends Throwable> E m56846j(E e, C11649e eVar) {
        C10340l c = m56839c(e);
        E e2 = (Throwable) c.mo33173a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.mo33174b();
        Throwable m = m56849m(e2);
        if (m == null) {
            return e;
        }
        ArrayDeque e3 = m56841e(eVar);
        if (e3.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m56845i(stackTraceElementArr, e3);
        }
        return m56840d(e2, m, e3);
    }

    /* renamed from: k */
    public static final <E extends Throwable> E m56847k(E e) {
        Throwable m;
        if (C13330n0.m62284d() && (m = m56849m(e)) != null) {
            return m56848l(m);
        }
        return e;
    }

    /* renamed from: l */
    private static final <E extends Throwable> E m56848l(E e) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int g = m56843g(stackTrace, f44255b);
        int i = g + 1;
        int g2 = m56843g(stackTrace, f44254a);
        int i2 = (length - g) - (g2 == -1 ? 0 : length - g2);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == 0) {
                stackTraceElement = m56838b("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i + i3) - 1];
            }
            stackTraceElementArr[i3] = stackTraceElement;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    /* renamed from: m */
    private static final <E extends Throwable> E m56849m(E e) {
        E g = C11702j.m56893g(e);
        if (g == null) {
            return null;
        }
        if ((e instanceof C13269b0) || C11669k.m56783a(g.getMessage(), e.getMessage())) {
            return g;
        }
        return null;
    }

    /* renamed from: n */
    public static final <E extends Throwable> E m56850n(E e) {
        E cause = e.getCause();
        if (cause != null && C11669k.m56783a(cause.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                i++;
                if (m56844h(stackTraceElement)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return cause;
            }
        }
        return e;
    }
}
