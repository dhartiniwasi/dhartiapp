package p401xd;

import kotlin.jvm.internal.C11669k;

/* renamed from: xd.q */
/* compiled from: _Strings.kt */
class C13016q extends C13015p {
    /* renamed from: k0 */
    public static final String m61312k0(String str, int i) {
        C11669k.m56787e(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(C12756f.m60451c(i, str.length()));
            C11669k.m56786d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
