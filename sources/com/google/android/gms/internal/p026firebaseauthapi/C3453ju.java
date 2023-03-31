package com.google.android.gms.internal.p026firebaseauthapi;

import android.app.Activity;
import com.google.firebase.auth.C7837p0;
import java.util.Map;
import java.util.concurrent.Executor;
import p067i5.C4694h;
import p124r.C5413a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ju */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3453ju {

    /* renamed from: a */
    private static final Map f22249a = new C5413a();

    /* renamed from: a */
    public static C7837p0.C7839b m25949a(String str, C7837p0.C7839b bVar, C3848vt vtVar) {
        m25953e(str, vtVar);
        return new C3387hu(bVar, str);
    }

    /* renamed from: c */
    public static void m25951c() {
        f22249a.clear();
    }

    /* renamed from: d */
    public static boolean m25952d(String str, C7837p0.C7839b bVar, Activity activity, Executor executor) {
        Map map = f22249a;
        if (map.containsKey(str)) {
            C3420iu iuVar = (C3420iu) map.get(str);
            if (C4694h.m30388d().mo18370a() - iuVar.f22183b < 120000) {
                C3848vt vtVar = iuVar.f22182a;
                if (vtVar == null) {
                    return true;
                }
                vtVar.mo16968g(bVar, activity, executor, str);
                return true;
            }
            m25953e(str, (C3848vt) null);
            return false;
        }
        m25953e(str, (C3848vt) null);
        return false;
    }

    /* renamed from: e */
    private static void m25953e(String str, C3848vt vtVar) {
        f22249a.put(str, new C3420iu(vtVar, C4694h.m30388d().mo18370a()));
    }
}
