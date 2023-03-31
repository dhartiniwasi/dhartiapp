package p177z1;

import java.util.HashSet;

/* renamed from: z1.o1 */
/* compiled from: ExoPlayerLibraryInfo */
public final class C6260o1 {

    /* renamed from: a */
    private static final HashSet<String> f30162a = new HashSet<>();

    /* renamed from: b */
    private static String f30163b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized void m36802a(String str) {
        synchronized (C6260o1.class) {
            if (f30162a.add(str)) {
                f30163b += ", " + str;
            }
        }
    }

    /* renamed from: b */
    public static synchronized String m36803b() {
        String str;
        synchronized (C6260o1.class) {
            str = f30163b;
        }
        return str;
    }
}
