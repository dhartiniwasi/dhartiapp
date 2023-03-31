package com.onesignal;

import android.app.Activity;
import com.onesignal.C8317c;
import com.onesignal.C8338d3;
import com.onesignal.PermissionsActivity;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.c0 */
/* compiled from: LocationPermissionController.kt */
public final class C8321c0 implements PermissionsActivity.C8288c {

    /* renamed from: a */
    public static final C8321c0 f35365a;

    /* renamed from: com.onesignal.c0$a */
    /* compiled from: LocationPermissionController.kt */
    public static final class C8322a implements C8317c.C8318a {

        /* renamed from: a */
        final /* synthetic */ Activity f35366a;

        C8322a(Activity activity) {
            this.f35366a = activity;
        }

        /* renamed from: a */
        public void mo27635a() {
            C8328d0.f35384a.mo27678a(this.f35366a);
            C8303b0.m46296n(true, C8338d3.C8359g1.PERMISSION_DENIED);
        }

        /* renamed from: b */
        public void mo27636b() {
            C8303b0.m46296n(true, C8338d3.C8359g1.PERMISSION_DENIED);
        }
    }

    static {
        C8321c0 c0Var = new C8321c0();
        f35365a = c0Var;
        PermissionsActivity.m46226e("LOCATION", c0Var);
    }

    private C8321c0() {
    }

    /* renamed from: c */
    private final void m46336c(C8338d3.C8359g1 g1Var) {
        C8303b0.m46296n(true, g1Var);
    }

    /* renamed from: e */
    private final void m46337e() {
        Activity Y = C8338d3.m46486Y();
        if (Y != null) {
            C11669k.m56786d(Y, "OneSignal.getCurrentActivity() ?: return");
            C8317c cVar = C8317c.f35362a;
            String string = Y.getString(C8300a4.location_permission_name_for_title);
            C11669k.m56786d(string, "activity.getString(R.str…ermission_name_for_title)");
            String string2 = Y.getString(C8300a4.location_permission_settings_message);
            C11669k.m56786d(string2, "activity.getString(R.str…mission_settings_message)");
            cVar.mo27634a(Y, string, string2, new C8322a(Y));
        }
    }

    /* renamed from: a */
    public void mo27566a() {
        m46336c(C8338d3.C8359g1.PERMISSION_GRANTED);
        C8303b0.m46298p();
    }

    /* renamed from: b */
    public void mo27567b(boolean z) {
        m46336c(C8338d3.C8359g1.PERMISSION_DENIED);
        if (z) {
            m46337e();
        }
        C8303b0.m46287e();
    }

    /* renamed from: d */
    public final void mo27639d(boolean z, String str) {
        C11669k.m56787e(str, "androidPermissionString");
        PermissionsActivity.m46230i(z, "LOCATION", str, C8321c0.class);
    }
}
