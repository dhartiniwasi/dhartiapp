package kotlin.jvm.internal;

import p382vd.C12890c;
import p382vd.C12891d;
import p382vd.C12892e;
import p382vd.C12893f;

/* renamed from: kotlin.jvm.internal.t */
/* compiled from: ReflectionFactory */
public class C11678t {
    /* renamed from: a */
    public C12892e mo35860a(C11667i iVar) {
        return iVar;
    }

    /* renamed from: b */
    public C12890c mo35861b(Class cls) {
        return new C11662e(cls);
    }

    /* renamed from: c */
    public C12891d mo35862c(Class cls, String str) {
        return new C11671m(cls, str);
    }

    /* renamed from: d */
    public C12893f mo35863d(C11672n nVar) {
        return nVar;
    }

    /* renamed from: e */
    public String mo35864e(C11666h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    /* renamed from: f */
    public String mo35865f(C11670l lVar) {
        return mo35864e(lVar);
    }
}
