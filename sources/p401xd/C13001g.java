package p401xd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p344rd.C12439l;

/* renamed from: xd.g */
/* compiled from: Indent.kt */
class C13001g extends C13000f {

    /* renamed from: xd.g$a */
    /* compiled from: Indent.kt */
    static final class C13002a extends C11670l implements C12439l<String, String> {

        /* renamed from: a */
        public static final C13002a f47266a = new C13002a();

        C13002a() {
            super(1);
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C11669k.m56787e(str, "line");
            return str;
        }
    }

    /* renamed from: xd.g$b */
    /* compiled from: Indent.kt */
    static final class C13003b extends C11670l implements C12439l<String, String> {

        /* renamed from: a */
        final /* synthetic */ String f47267a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13003b(String str) {
            super(1);
            this.f47267a = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C11669k.m56787e(str, "line");
            return this.f47267a + str;
        }
    }

    /* renamed from: b */
    private static final C12439l<String, String> m61246b(String str) {
        if (str.length() == 0) {
            return C13002a.f47266a;
        }
        return new C13003b(str);
    }

    /* renamed from: c */
    private static final int m61247c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!C12993a.m61216c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        return i == -1 ? str.length() : i;
    }

    /* renamed from: d */
    public static final String m61248d(String str, String str2) {
        String invoke;
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "newIndent");
        List<String> H = C13011o.m61268H(str);
        ArrayList<String> arrayList = new ArrayList<>();
        for (T next : H) {
            if (!C13010n.m61257k((String) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C10523k.m52973i(arrayList, 10));
        for (String c : arrayList) {
            arrayList2.add(Integer.valueOf(m61247c(c)));
        }
        Integer num = (Integer) C10530r.m52987t(arrayList2);
        int i = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * H.size());
        C12439l<String, String> b = m61246b(str2);
        int e = C10522j.m52969e(H);
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : H) {
            int i2 = i + 1;
            if (i < 0) {
                C10522j.m52972h();
            }
            String str3 = (String) next2;
            if ((i == 0 || i == e) && C13010n.m61257k(str3)) {
                str3 = null;
            } else {
                String k0 = C13016q.m61312k0(str3, intValue);
                if (!(k0 == null || (invoke = b.invoke(k0)) == null)) {
                    str3 = invoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        String sb = ((StringBuilder) C10530r.m52983p(arrayList3, new StringBuilder(length), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C12439l) null, 124, (Object) null)).toString();
        C11669k.m56786d(sb, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb;
    }

    /* renamed from: e */
    public static String m61249e(String str) {
        C11669k.m56787e(str, "<this>");
        return m61248d(str, "");
    }
}
