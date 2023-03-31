package p401xd;

import kotlin.jvm.internal.C11669k;

/* renamed from: xd.n */
/* compiled from: StringsJVM.kt */
class C13010n extends C13009m {
    /* renamed from: h */
    public static final boolean m61254h(String str, String str2, boolean z) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return m61258l(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m61255i(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m61254h(str, str2, z);
    }

    /* renamed from: j */
    public static boolean m61256j(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m61257k(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C11669k.m56787e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            ud.c r0 = p401xd.C13011o.m61301s(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            hd.w r3 = (p252hd.C10535w) r3
            int r3 = r3.mo33733a()
            char r3 = r4.charAt(r3)
            boolean r3 = p401xd.C12993a.m61216c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p401xd.C13010n.m61257k(java.lang.CharSequence):boolean");
    }

    /* renamed from: l */
    public static final boolean m61258l(String str, int i, String str2, int i2, int i3, boolean z) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    /* renamed from: m */
    public static final boolean m61259m(String str, String str2, boolean z) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return m61258l(str, 0, str2, 0, str2.length(), z);
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m61260n(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m61259m(str, str2, z);
    }
}
