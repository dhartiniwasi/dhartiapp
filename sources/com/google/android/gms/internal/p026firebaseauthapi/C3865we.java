package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.we */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3865we {

    /* renamed from: a */
    private final C3635pe f22882a;

    /* renamed from: b */
    private final List f22883b;

    /* renamed from: c */
    private final Integer f22884c;

    /* synthetic */ C3865we(C3635pe peVar, List list, Integer num, C3833ve veVar) {
        this.f22882a = peVar;
        this.f22883b = list;
        this.f22884c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3865we)) {
            return false;
        }
        C3865we weVar = (C3865we) obj;
        if (this.f22882a.equals(weVar.f22882a) && this.f22883b.equals(weVar.f22883b)) {
            Integer num = this.f22884c;
            Integer num2 = weVar.f22884c;
            if (num == num2) {
                return true;
            }
            if (num == null || !num.equals(num2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22882a, this.f22883b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", new Object[]{this.f22882a, this.f22883b, this.f22884c});
    }
}
