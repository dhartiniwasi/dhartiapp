package com.google.firebase.auth;

import android.app.Activity;
import android.util.Log;
import com.google.firebase.auth.C7837p0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p218e6.C9965d;
import p218e6.C9975i;
import p293m7.C11857t0;

/* renamed from: com.google.firebase.auth.z1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C7871z1 implements C9965d {

    /* renamed from: a */
    final /* synthetic */ String f34230a;

    /* renamed from: b */
    final /* synthetic */ long f34231b;

    /* renamed from: c */
    final /* synthetic */ TimeUnit f34232c;

    /* renamed from: d */
    final /* synthetic */ C7837p0.C7839b f34233d;

    /* renamed from: e */
    final /* synthetic */ Activity f34234e;

    /* renamed from: f */
    final /* synthetic */ Executor f34235f;

    /* renamed from: g */
    final /* synthetic */ boolean f34236g;

    /* renamed from: h */
    final /* synthetic */ FirebaseAuth f34237h;

    C7871z1(FirebaseAuth firebaseAuth, String str, long j, TimeUnit timeUnit, C7837p0.C7839b bVar, Activity activity, Executor executor, boolean z) {
        this.f34237h = firebaseAuth;
        this.f34230a = str;
        this.f34231b = j;
        this.f34232c = timeUnit;
        this.f34233d = bVar;
        this.f34234e = activity;
        this.f34235f = executor;
        this.f34236g = z;
    }

    /* renamed from: a */
    public final void mo283a(C9975i iVar) {
        String str;
        String str2;
        if (!iVar.mo26362q()) {
            Log.e("FirebaseAuth", "Error while validating application identity: ".concat(String.valueOf(iVar.mo26357l() != null ? iVar.mo26357l().getMessage() : "")));
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str2 = null;
            str = null;
        } else {
            String b = ((C11857t0) iVar.mo26358m()).mo36109b();
            str2 = ((C11857t0) iVar.mo26358m()).mo36108a();
            str = b;
        }
        this.f34237h.mo26000Q(this.f34230a, this.f34231b, this.f34232c, this.f34233d, this.f34234e, this.f34235f, this.f34236g, str2, str);
    }
}
