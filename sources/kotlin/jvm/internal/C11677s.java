package kotlin.jvm.internal;

import p382vd.C12890c;
import p382vd.C12891d;
import p382vd.C12892e;
import p382vd.C12893f;

/* renamed from: kotlin.jvm.internal.s */
/* compiled from: Reflection */
public class C11677s {

    /* renamed from: a */
    private static final C11678t f44242a;

    /* renamed from: b */
    private static final C12890c[] f44243b = new C12890c[0];

    static {
        C11678t tVar = null;
        try {
            tVar = (C11678t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (tVar == null) {
            tVar = new C11678t();
        }
        f44242a = tVar;
    }

    /* renamed from: a */
    public static C12892e m56800a(C11667i iVar) {
        return f44242a.mo35860a(iVar);
    }

    /* renamed from: b */
    public static C12890c m56801b(Class cls) {
        return f44242a.mo35861b(cls);
    }

    /* renamed from: c */
    public static C12891d m56802c(Class cls) {
        return f44242a.mo35862c(cls, "");
    }

    /* renamed from: d */
    public static C12893f m56803d(C11672n nVar) {
        return f44242a.mo35863d(nVar);
    }

    /* renamed from: e */
    public static String m56804e(C11666h hVar) {
        return f44242a.mo35864e(hVar);
    }

    /* renamed from: f */
    public static String m56805f(C11670l lVar) {
        return f44242a.mo35865f(lVar);
    }
}
