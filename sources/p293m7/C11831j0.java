package p293m7;

import android.text.TextUtils;
import android.util.Log;
import p411z5.C13447d;

/* renamed from: m7.j0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11831j0 {

    /* renamed from: a */
    private static final String f44524a = "j0";

    /* renamed from: a */
    public static boolean m57248a(C13447d.C13448a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.mo38539c())) {
            Log.e(f44524a, "No SafetyNet AttestationResponse passed.");
            return false;
        }
        C11828i0 a = C11828i0.m57232a(aVar.mo38539c());
        if (a == null) {
            Log.e(f44524a, "Unable to parse SafetyNet AttestationResponse");
            return false;
        } else if (!a.mo36055c()) {
            Log.e(f44524a, "SafetyNet Attestation fails basic integrity.");
            return false;
        } else if (TextUtils.isEmpty(a.mo36054b())) {
            return true;
        } else {
            Log.e(f44524a, "SafetyNet Attestation has advice: \n".concat(String.valueOf(a.mo36054b())));
            return false;
        }
    }
}
