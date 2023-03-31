package p401xd;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;

/* renamed from: xd.d */
/* compiled from: Regex.kt */
public final class C12997d implements Serializable {

    /* renamed from: b */
    public static final C12998a f47264b = new C12998a((C11665g) null);

    /* renamed from: a */
    private final Pattern f47265a;

    /* renamed from: xd.d$a */
    /* compiled from: Regex.kt */
    public static final class C12998a {
        private C12998a() {
        }

        public /* synthetic */ C12998a(C11665g gVar) {
            this();
        }
    }

    public C12997d(Pattern pattern) {
        C11669k.m56787e(pattern, "nativePattern");
        this.f47265a = pattern;
    }

    /* renamed from: a */
    public final String mo38059a(CharSequence charSequence, String str) {
        C11669k.m56787e(charSequence, "input");
        C11669k.m56787e(str, "replacement");
        String replaceAll = this.f47265a.matcher(charSequence).replaceAll(str);
        C11669k.m56786d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.f47265a.toString();
        C11669k.m56786d(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12997d(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.C11669k.m56787e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            kotlin.jvm.internal.C11669k.m56786d(r2, r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p401xd.C12997d.<init>(java.lang.String):void");
    }
}
