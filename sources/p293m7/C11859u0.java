package p293m7;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026firebaseauthapi.C3386ht;
import com.google.android.gms.internal.p026firebaseauthapi.C3783tu;
import com.google.android.gms.internal.p026firebaseauthapi.C3847vs;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.io.UnsupportedEncodingException;
import p033d5.C4141r;
import p218e6.C9975i;
import p218e6.C9977j;
import p218e6.C9980l;
import p246h7.C10412f;
import p411z5.C13446c;
import p411z5.C13450e;

/* renamed from: m7.u0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11859u0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f44579a = "u0";

    /* renamed from: b */
    private static final C11859u0 f44580b = new C11859u0();

    private C11859u0() {
    }

    /* renamed from: b */
    public static C11859u0 m57334b() {
        return f44580b;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m57337e(FirebaseAuth firebaseAuth, C11851q0 q0Var, Activity activity, C9977j jVar) {
        C9975i iVar;
        q0Var.mo36104f(firebaseAuth.mo26030l().mo33469m(), firebaseAuth);
        C4141r.m28221k(activity);
        C9977j jVar2 = new C9977j();
        if (!C11804a0.m57184a().mo36033g(activity, jVar2)) {
            iVar = C9980l.m51030d(C3847vs.m27245a(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            intent.setClass(activity, RecaptchaActivity.class);
            intent.setPackage(activity.getPackageName());
            intent.putExtra("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.mo26030l().mo33471r().mo33479b());
            if (!TextUtils.isEmpty(firebaseAuth.mo26034p())) {
                intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.mo26034p());
            }
            intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", C3386ht.m25724a().mo16109b());
            intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", firebaseAuth.mo26030l().mo33470q());
            activity.startActivity(intent);
            iVar = jVar2.mo32542a();
        }
        iVar.mo26351f(new C11855s0(this, jVar)).mo26349d(new C11853r0(this, jVar));
    }

    /* renamed from: a */
    public final C9975i mo36110a(FirebaseAuth firebaseAuth, String str, Activity activity, boolean z) {
        C11838l1 l1Var = (C11838l1) firebaseAuth.mo26032n();
        C13450e a = z ? C13446c.m62484a(firebaseAuth.mo26030l().mo33469m()) : null;
        C11851q0 b = C11851q0.m57317b();
        if (C3783tu.m27057g(firebaseAuth.mo26030l()) || l1Var.mo36076h()) {
            return C9980l.m51031e(new C11857t0((String) null, (String) null));
        }
        C9977j jVar = new C9977j();
        C9975i a2 = b.mo36100a();
        if (a2 != null) {
            if (a2.mo26362q()) {
                return C9980l.m51031e(new C11857t0((String) null, (String) a2.mo26358m()));
            }
            String str2 = f44579a;
            Log.e(str2, "Error in previous reCAPTCHA flow: ".concat(String.valueOf(a2.mo26357l().getMessage())));
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (a == null || l1Var.mo36074f()) {
            m57337e(firebaseAuth, b, activity, jVar);
        } else {
            C10412f l = firebaseAuth.mo26030l();
            byte[] bArr = new byte[0];
            if (str != null) {
                try {
                    bArr = str.getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    Log.e(f44579a, "Failed to getBytes with exception: ".concat(String.valueOf(e.getMessage())));
                }
            }
            a.mo38540r(bArr, l.mo33471r().mo33479b()).mo26351f(new C11813d0(this, jVar, firebaseAuth, b, activity)).mo26349d(new C11809c(this, firebaseAuth, b, activity, jVar));
        }
        return jVar.mo32542a();
    }
}
