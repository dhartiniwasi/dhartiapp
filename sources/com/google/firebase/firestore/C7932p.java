package com.google.firebase.firestore;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import p211d8.C9898r;
import p247h8.C10472x;

/* renamed from: com.google.firebase.firestore.p */
/* compiled from: FieldPath */
public final class C7932p {

    /* renamed from: b */
    private static final Pattern f34388b = Pattern.compile("[~*/\\[\\]]");

    /* renamed from: c */
    private static final C7932p f34389c = new C7932p(C9898r.f39731b);

    /* renamed from: a */
    private final C9898r f34390a;

    private C7932p(List<String> list) {
        this.f34390a = C9898r.m50741v(list);
    }

    /* renamed from: a */
    public static C7932p m43829a() {
        return f34389c;
    }

    /* renamed from: b */
    static C7932p m43830b(String str) {
        C10472x.m52786c(str, "Provided field path must not be null.");
        C10472x.m52784a(!f34388b.matcher(str).find(), "Use FieldPath.of() for field names containing '~*/[]'.", new Object[0]);
        try {
            return m43831d(str.split("\\.", -1));
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
        }
    }

    /* renamed from: d */
    public static C7932p m43831d(String... strArr) {
        C10472x.m52784a(strArr.length > 0, "Invalid field path. Provided path must not be empty.", new Object[0]);
        int i = 0;
        while (i < strArr.length) {
            boolean z = strArr[i] != null && !strArr[i].isEmpty();
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid field name at argument ");
            i++;
            sb.append(i);
            sb.append(". Field names must not be null or empty.");
            C10472x.m52784a(z, sb.toString(), new Object[0]);
        }
        return new C7932p((List<String>) Arrays.asList(strArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C9898r mo26428c() {
        return this.f34390a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7932p.class != obj.getClass()) {
            return false;
        }
        return this.f34390a.equals(((C7932p) obj).f34390a);
    }

    public int hashCode() {
        return this.f34390a.hashCode();
    }

    public String toString() {
        return this.f34390a.toString();
    }

    private C7932p(C9898r rVar) {
        this.f34390a = rVar;
    }
}
