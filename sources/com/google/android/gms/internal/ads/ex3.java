package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ex3 {

    /* renamed from: b */
    private static volatile ex3 f9003b;

    /* renamed from: c */
    private static volatile ex3 f9004c;

    /* renamed from: d */
    static final ex3 f9005d = new ex3(true);

    /* renamed from: a */
    private final Map f9006a;

    ex3() {
        this.f9006a = new HashMap();
    }

    /* renamed from: a */
    public static ex3 m12308a() {
        ex3 ex3 = f9003b;
        if (ex3 == null) {
            synchronized (ex3.class) {
                ex3 = f9003b;
                if (ex3 == null) {
                    ex3 = f9005d;
                    f9003b = ex3;
                }
            }
        }
        return ex3;
    }

    /* renamed from: b */
    public static ex3 m12309b() {
        Class<ex3> cls = ex3.class;
        ex3 ex3 = f9004c;
        if (ex3 != null) {
            return ex3;
        }
        synchronized (cls) {
            ex3 ex32 = f9004c;
            if (ex32 != null) {
                return ex32;
            }
            ex3 b = mx3.m16802b(cls);
            f9004c = b;
            return b;
        }
    }

    /* renamed from: c */
    public final rx3 mo10029c(cz3 cz3, int i) {
        return (rx3) this.f9006a.get(new dx3(cz3, i));
    }

    ex3(boolean z) {
        this.f9006a = Collections.emptyMap();
    }
}
