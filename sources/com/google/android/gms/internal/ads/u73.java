package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class u73 {

    /* renamed from: a */
    private final String f18437a;

    /* renamed from: b */
    private final t73 f18438b;

    /* renamed from: c */
    private t73 f18439c;

    /* synthetic */ u73(String str, s73 s73) {
        t73 t73 = new t73((s73) null);
        this.f18438b = t73;
        this.f18439c = t73;
        Objects.requireNonNull(str);
        this.f18437a = str;
    }

    /* renamed from: a */
    public final u73 mo14455a(Object obj) {
        t73 t73 = new t73((s73) null);
        this.f18439c.f17881b = t73;
        this.f18439c = t73;
        t73.f17880a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f18437a);
        sb.append('{');
        t73 t73 = this.f18438b.f17881b;
        String str = "";
        while (t73 != null) {
            Object obj = t73.f17880a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            t73 = t73.f17881b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
