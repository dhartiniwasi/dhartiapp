package p335qd;

import kotlin.jvm.internal.C11661d;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11677s;
import p382vd.C12890c;

/* renamed from: qd.a */
/* compiled from: JvmClassMapping.kt */
public final class C12224a {
    /* renamed from: a */
    public static final <T> Class<T> m58665a(C12890c<T> cVar) {
        C11669k.m56787e(cVar, "<this>");
        Class<?> b = ((C11661d) cVar).mo35837b();
        C11669k.m56785c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return b;
    }

    /* renamed from: b */
    public static final <T> Class<T> m58666b(C12890c<T> cVar) {
        C11669k.m56787e(cVar, "<this>");
        Class b = ((C11661d) cVar).mo35837b();
        if (!b.isPrimitive()) {
            C11669k.m56785c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b;
        }
        String name = b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b = Short.class;
                    break;
                }
                break;
        }
        C11669k.m56785c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b;
    }

    /* renamed from: c */
    public static final <T> C12890c<T> m58667c(Class<T> cls) {
        C11669k.m56787e(cls, "<this>");
        return C11677s.m56801b(cls);
    }
}
