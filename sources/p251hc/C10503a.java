package p251hc;

import android.util.Log;
import com.google.firebase.firestore.C7959y;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p233fc.C10176a;

/* renamed from: hc.a */
/* compiled from: ExceptionConverter */
public class C10503a {
    /* renamed from: a */
    public static Map<String, String> m52898a(Exception exc) {
        Throwable th;
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        C10176a aVar = null;
        if (exc instanceof C7959y) {
            aVar = new C10176a((C7959y) exc, exc.getCause());
        } else if (exc.getCause() != null && (exc.getCause() instanceof C7959y)) {
            C7959y yVar = (C7959y) exc.getCause();
            if (exc.getCause().getCause() != null) {
                th = exc.getCause().getCause();
            } else {
                th = exc.getCause();
            }
            aVar = new C10176a(yVar, th);
        }
        if (aVar != null) {
            hashMap.put("code", aVar.mo32849a());
            hashMap.put("message", aVar.getMessage());
        }
        if (hashMap.containsKey("code")) {
            String str = (String) hashMap.get("code");
            Objects.requireNonNull(str);
            if (str.equals("unknown")) {
                Log.e("FLTFirebaseFirestore", "An unknown error occurred", exc);
            }
        }
        return hashMap;
    }
}
