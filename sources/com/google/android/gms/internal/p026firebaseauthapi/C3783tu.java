package com.google.android.gms.internal.p026firebaseauthapi;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p124r.C5413a;
import p246h7.C10412f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3783tu {

    /* renamed from: a */
    private static final Map f22743a = new C5413a();

    /* renamed from: b */
    private static final Map f22744b = new C5413a();

    /* renamed from: a */
    public static String m27051a(String str) {
        C3717ru ruVar;
        Map map = f22743a;
        synchronized (map) {
            ruVar = (C3717ru) map.get(str);
        }
        if (ruVar != null) {
            return m27058h(ruVar.mo16693b(), ruVar.mo16692a(), ruVar.mo16693b().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    /* renamed from: b */
    public static String m27052b(String str) {
        C3717ru ruVar;
        Map map = f22743a;
        synchronized (map) {
            ruVar = (C3717ru) map.get(str);
        }
        return (ruVar != null ? "".concat(m27058h(ruVar.mo16693b(), ruVar.mo16692a(), ruVar.mo16693b().contains(":"))) : "https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    /* renamed from: c */
    public static String m27053c(String str) {
        C3717ru ruVar;
        Map map = f22743a;
        synchronized (map) {
            ruVar = (C3717ru) map.get(str);
        }
        return (ruVar != null ? "".concat(m27058h(ruVar.mo16693b(), ruVar.mo16692a(), ruVar.mo16693b().contains(":"))) : "https://").concat("identitytoolkit.googleapis.com/v2");
    }

    /* renamed from: d */
    public static String m27054d(String str) {
        C3717ru ruVar;
        Map map = f22743a;
        synchronized (map) {
            ruVar = (C3717ru) map.get(str);
        }
        return (ruVar != null ? "".concat(m27058h(ruVar.mo16693b(), ruVar.mo16692a(), ruVar.mo16693b().contains(":"))) : "https://").concat("securetoken.googleapis.com/v1");
    }

    /* renamed from: e */
    public static void m27055e(String str, C3750su suVar) {
        Map map = f22744b;
        synchronized (map) {
            if (map.containsKey(str)) {
                ((List) map.get(str)).add(new WeakReference(suVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(suVar));
                map.put(str, arrayList);
            }
        }
    }

    /* renamed from: f */
    public static void m27056f(C10412f fVar, String str, int i) {
        String b = fVar.mo33471r().mo33479b();
        Map map = f22743a;
        synchronized (map) {
            map.put(b, new C3717ru(str, i));
        }
        Map map2 = f22744b;
        synchronized (map2) {
            if (map2.containsKey(b)) {
                boolean z = false;
                for (WeakReference weakReference : (List) map2.get(b)) {
                    C3750su suVar = (C3750su) weakReference.get();
                    if (suVar != null) {
                        suVar.mo16194V();
                        z = true;
                    }
                }
                if (!z) {
                    f22743a.remove(b);
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m27057g(C10412f fVar) {
        return f22743a.containsKey(fVar.mo33471r().mo33479b());
    }

    /* renamed from: h */
    private static String m27058h(String str, int i, boolean z) {
        if (z) {
            return "http://[" + str + "]:" + i + "/";
        }
        return "http://" + str + ":" + i + "/";
    }
}
