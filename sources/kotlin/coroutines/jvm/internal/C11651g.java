package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C11669k;

/* renamed from: kotlin.coroutines.jvm.internal.g */
/* compiled from: DebugMetadata.kt */
public final class C11651g {
    /* renamed from: a */
    private static final void m56765a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C11650f m56766b(C11645a aVar) {
        return (C11650f) aVar.getClass().getAnnotation(C11650f.class);
    }

    /* renamed from: c */
    private static final int m56767c(C11645a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m56768d(C11645a aVar) {
        int i;
        String str;
        C11669k.m56787e(aVar, "<this>");
        C11650f b = m56766b(aVar);
        if (b == null) {
            return null;
        }
        m56765a(1, b.mo35813v());
        int c = m56767c(aVar);
        if (c < 0) {
            i = -1;
        } else {
            i = b.mo35811l()[c];
        }
        String b2 = C11653i.f44221a.mo35814b(aVar);
        if (b2 == null) {
            str = b.mo35809c();
        } else {
            str = b2 + '/' + b.mo35809c();
        }
        return new StackTraceElement(str, b.mo35812m(), b.mo35810f(), i);
    }
}
