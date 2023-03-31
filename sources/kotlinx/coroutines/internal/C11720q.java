package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.q */
/* compiled from: LockFreeLinkedList.kt */
public final class C11720q {

    /* renamed from: a */
    private static final Object f44296a = new C11690e0("CONDITION_FALSE");

    /* renamed from: b */
    private static final Object f44297b = new C11690e0("LIST_EMPTY");

    /* renamed from: a */
    public static final Object m56934a() {
        return f44296a;
    }

    /* renamed from: b */
    public static final C11721r m56935b(Object obj) {
        C11721r rVar = null;
        C11681a0 a0Var = obj instanceof C11681a0 ? (C11681a0) obj : null;
        if (a0Var != null) {
            rVar = a0Var.f44247a;
        }
        return rVar == null ? (C11721r) obj : rVar;
    }
}
