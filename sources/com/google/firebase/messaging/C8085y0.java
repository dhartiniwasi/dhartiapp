package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;
import p033d5.C4133p;

/* renamed from: com.google.firebase.messaging.y0 */
/* compiled from: TopicOperation */
final class C8085y0 {

    /* renamed from: d */
    private static final Pattern f34790d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f34791a;

    /* renamed from: b */
    private final String f34792b;

    /* renamed from: c */
    private final String f34793c;

    private C8085y0(String str, String str2) {
        this.f34791a = m44461d(str2, str);
        this.f34792b = str;
        this.f34793c = str + "!" + str2;
    }

    /* renamed from: a */
    static C8085y0 m44460a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C8085y0(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m44461d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", new Object[]{str2}));
            str = str.substring(8);
        }
        if (str != null && f34790d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    /* renamed from: f */
    public static C8085y0 m44462f(String str) {
        return new C8085y0("S", str);
    }

    /* renamed from: g */
    public static C8085y0 m44463g(String str) {
        return new C8085y0("U", str);
    }

    /* renamed from: b */
    public String mo26755b() {
        return this.f34792b;
    }

    /* renamed from: c */
    public String mo26756c() {
        return this.f34791a;
    }

    /* renamed from: e */
    public String mo26757e() {
        return this.f34793c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8085y0)) {
            return false;
        }
        C8085y0 y0Var = (C8085y0) obj;
        if (!this.f34791a.equals(y0Var.f34791a) || !this.f34792b.equals(y0Var.f34792b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4133p.m28194b(this.f34792b, this.f34791a);
    }
}
