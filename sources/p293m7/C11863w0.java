package p293m7;

import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import com.google.firebase.auth.C7786c0;
import com.google.firebase.auth.C7795e0;
import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.C7821l;
import com.google.firebase.auth.C7840p1;
import com.google.firebase.auth.C7851t0;
import com.google.firebase.auth.C7857v0;
import p033d5.C4141r;

/* renamed from: m7.w0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11863w0 {
    /* renamed from: a */
    public static C3126a0 m57342a(C7806h hVar, String str) {
        C4141r.m28221k(hVar);
        if (C7795e0.class.isAssignableFrom(hVar.getClass())) {
            return C7795e0.m43361L1((C7795e0) hVar, str);
        }
        if (C7821l.class.isAssignableFrom(hVar.getClass())) {
            return C7821l.m43426L1((C7821l) hVar, str);
        }
        if (C7857v0.class.isAssignableFrom(hVar.getClass())) {
            return C7857v0.m43512L1((C7857v0) hVar, str);
        }
        if (C7786c0.class.isAssignableFrom(hVar.getClass())) {
            return C7786c0.m43325L1((C7786c0) hVar, str);
        }
        if (C7851t0.class.isAssignableFrom(hVar.getClass())) {
            return C7851t0.m43503L1((C7851t0) hVar, str);
        }
        if (C7840p1.class.isAssignableFrom(hVar.getClass())) {
            return C7840p1.m43488O1((C7840p1) hVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
