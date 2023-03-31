package p401xd;

import kotlin.jvm.internal.C11669k;
import p344rd.C12439l;

/* renamed from: xd.f */
/* compiled from: Appendable.kt */
class C13000f {
    /* renamed from: a */
    public static <T> void m61245a(Appendable appendable, T t, C12439l<? super T, ? extends CharSequence> lVar) {
        boolean z;
        C11669k.m56787e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t == null) {
            z = true;
        } else {
            z = t instanceof CharSequence;
        }
        if (z) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
