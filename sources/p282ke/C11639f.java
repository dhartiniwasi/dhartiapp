package p282ke;

/* renamed from: ke.f */
/* compiled from: HttpMethod */
public final class C11639f {
    /* renamed from: a */
    public static boolean m56734a(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* renamed from: b */
    public static boolean m56735b(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    /* renamed from: c */
    public static boolean m56736c(String str) {
        return !str.equals("PROPFIND");
    }

    /* renamed from: d */
    public static boolean m56737d(String str) {
        return str.equals("PROPFIND");
    }

    /* renamed from: e */
    public static boolean m56738e(String str) {
        return str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
