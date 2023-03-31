package p293m7;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.C7869z;
import com.google.firebase.auth.FirebaseAuth;
import p033d5.C4141r;
import p067i5.C4694h;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: m7.q0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C11851q0 {

    /* renamed from: c */
    private static final C11851q0 f44566c = new C11851q0();

    /* renamed from: a */
    private final C11825h0 f44567a;

    /* renamed from: b */
    private final C11804a0 f44568b;

    private C11851q0() {
        C11825h0 b = C11825h0.m57227b();
        C11804a0 a = C11804a0.m57184a();
        this.f44567a = b;
        this.f44568b = a;
    }

    /* renamed from: b */
    public static C11851q0 m57317b() {
        return f44566c;
    }

    /* renamed from: a */
    public final C9975i mo36100a() {
        return this.f44567a.mo36047a();
    }

    /* renamed from: c */
    public final void mo36101c(Context context) {
        this.f44567a.mo36048c(context);
    }

    /* renamed from: d */
    public final void mo36102d(FirebaseAuth firebaseAuth) {
        this.f44567a.mo36049d(firebaseAuth);
    }

    /* renamed from: e */
    public final void mo36103e(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.mo7950J1());
        edit.putString("statusMessage", status.mo7951K1());
        edit.putLong("timestamp", C4694h.m30388d().mo18370a());
        edit.commit();
    }

    /* renamed from: f */
    public final void mo36104f(Context context, FirebaseAuth firebaseAuth) {
        C4141r.m28221k(context);
        C4141r.m28221k(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.mo26030l().mo33470q());
        edit.commit();
    }

    /* renamed from: g */
    public final void mo36105g(Context context, FirebaseAuth firebaseAuth, C7869z zVar) {
        C4141r.m28221k(context);
        C4141r.m28221k(firebaseAuth);
        C4141r.m28221k(zVar);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putString("firebaseAppName", firebaseAuth.mo26030l().mo33470q());
        edit.putString("firebaseUserUid", zVar.mo26209b());
        edit.commit();
    }

    /* renamed from: h */
    public final boolean mo36106h(Activity activity, C9977j jVar, FirebaseAuth firebaseAuth) {
        return this.f44568b.mo36032f(activity, jVar, firebaseAuth, (C7869z) null);
    }

    /* renamed from: i */
    public final boolean mo36107i(Activity activity, C9977j jVar, FirebaseAuth firebaseAuth, C7869z zVar) {
        return this.f44568b.mo36032f(activity, jVar, firebaseAuth, zVar);
    }
}
