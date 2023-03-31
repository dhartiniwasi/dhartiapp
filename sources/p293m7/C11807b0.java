package p293m7;

import com.google.android.gms.internal.p026firebaseauthapi.C3709rm;
import com.google.firebase.auth.C7782b0;
import java.util.HashMap;
import java.util.Map;
import p054g5.C4410a;

/* renamed from: m7.b0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11807b0 {

    /* renamed from: a */
    private static final C4410a f44473a = new C4410a("GetTokenResultFactory", new String[0]);

    /* renamed from: a */
    public static C7782b0 m57198a(String str) {
        Map map;
        try {
            map = C11810c0.m57201b(str);
        } catch (C3709rm e) {
            f44473a.mo17929b("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        return new C7782b0(str, map);
    }
}
