package p293m7;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.p026firebaseauthapi.C3126a0;
import com.google.firebase.auth.C7806h;
import com.google.firebase.auth.C7840p1;
import com.google.firebase.auth.C7869z;
import com.google.firebase.auth.FirebaseAuth;
import p033d5.C4141r;
import p040e5.C4245e;
import p063i0.C4643a;
import p218e6.C9977j;

/* renamed from: m7.a0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11804a0 {

    /* renamed from: c */
    private static C11804a0 f44469c;

    /* renamed from: a */
    private boolean f44470a = false;

    /* renamed from: b */
    private BroadcastReceiver f44471b;

    private C11804a0() {
    }

    /* renamed from: a */
    public static C11804a0 m57184a() {
        if (f44469c == null) {
            f44469c = new C11804a0();
        }
        return f44469c;
    }

    /* renamed from: e */
    static void m57188e(Context context) {
        C11804a0 a0Var = f44469c;
        a0Var.f44470a = false;
        if (a0Var.f44471b != null) {
            C4643a.m30235b(context).mo18318e(f44469c.f44471b);
        }
        f44469c.f44471b = null;
    }

    /* renamed from: h */
    private final void m57189h(Activity activity, BroadcastReceiver broadcastReceiver) {
        this.f44471b = broadcastReceiver;
        C4643a.m30235b(activity).mo18316c(broadcastReceiver, new IntentFilter("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT"));
    }

    /* renamed from: i */
    private static final C7806h m57190i(Intent intent) {
        C4141r.m28221k(intent);
        C3126a0 a0Var = (C3126a0) C4245e.m28630b(intent, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", C3126a0.CREATOR);
        a0Var.mo15691L1(true);
        return C7840p1.m43486M1(a0Var);
    }

    /* renamed from: f */
    public final boolean mo36032f(Activity activity, C9977j jVar, FirebaseAuth firebaseAuth, C7869z zVar) {
        if (this.f44470a) {
            return false;
        }
        m57189h(activity, new C11866y(this, activity, jVar, firebaseAuth, zVar));
        this.f44470a = true;
        return true;
    }

    /* renamed from: g */
    public final boolean mo36033g(Activity activity, C9977j jVar) {
        if (this.f44470a) {
            return false;
        }
        m57189h(activity, new C11868z(this, activity, jVar));
        this.f44470a = true;
        return true;
    }
}
