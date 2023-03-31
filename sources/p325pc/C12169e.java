package p325pc;

import p139t0.C5497a;

/* renamed from: pc.e */
/* compiled from: TraceSection */
public final class C12169e {
    /* renamed from: a */
    public static void m58443a(String str) {
        C5497a.m33446c(m58445c(str));
    }

    /* renamed from: b */
    public static void m58444b(String str, int i) {
        C5497a.m33444a(m58445c(str), i);
    }

    /* renamed from: c */
    private static String m58445c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    /* renamed from: d */
    public static void m58446d() throws RuntimeException {
        C5497a.m33449f();
    }

    /* renamed from: e */
    public static void m58447e(String str, int i) {
        C5497a.m33447d(m58445c(str), i);
    }
}
