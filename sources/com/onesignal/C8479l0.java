package com.onesignal;

import android.app.Activity;
import android.os.Build;
import com.onesignal.C8317c;
import com.onesignal.C8338d3;
import com.onesignal.PermissionsActivity;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.l0 */
/* compiled from: NotificationPermissionController.kt */
public final class C8479l0 implements PermissionsActivity.C8288c {

    /* renamed from: a */
    private static final Set<C8338d3.C8362h1> f35678a = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f35679b;

    /* renamed from: c */
    private static final boolean f35680c = (Build.VERSION.SDK_INT > 32 && OSUtils.m46204o(C8338d3.f35438f) > 32);

    /* renamed from: d */
    public static final C8479l0 f35681d;

    /* renamed from: com.onesignal.l0$a */
    /* compiled from: NotificationPermissionController.kt */
    public static final class C8480a implements C8317c.C8318a {

        /* renamed from: a */
        final /* synthetic */ Activity f35682a;

        C8480a(Activity activity) {
            this.f35682a = activity;
        }

        /* renamed from: a */
        public void mo27635a() {
            C8405e0.f35564a.mo27761a(this.f35682a);
            C8479l0.f35679b = true;
        }

        /* renamed from: b */
        public void mo27636b() {
            C8479l0.f35681d.m46998e(false);
        }
    }

    static {
        C8479l0 l0Var = new C8479l0();
        f35681d = l0Var;
        PermissionsActivity.m46226e("NOTIFICATION", l0Var);
    }

    private C8479l0() {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m46998e(boolean z) {
        for (C8338d3.C8362h1 n : f35678a) {
            n.mo27722n(z);
        }
        f35678a.clear();
    }

    /* renamed from: f */
    private final boolean m46999f() {
        return OSUtils.m46194a(C8338d3.f35438f);
    }

    /* renamed from: i */
    private final boolean m47000i() {
        Activity Y = C8338d3.m46486Y();
        if (Y == null) {
            return false;
        }
        C11669k.m56786d(Y, "OneSignal.getCurrentActivity() ?: return false");
        C8317c cVar = C8317c.f35362a;
        String string = Y.getString(C8300a4.notification_permission_name_for_title);
        C11669k.m56786d(string, "activity.getString(R.str…ermission_name_for_title)");
        String string2 = Y.getString(C8300a4.notification_permission_settings_message);
        C11669k.m56786d(string2, "activity.getString(R.str…mission_settings_message)");
        cVar.mo27634a(Y, string, string2, new C8480a(Y));
        return true;
    }

    /* renamed from: a */
    public void mo27566a() {
        C8338d3.m46437J1();
        m46998e(true);
    }

    /* renamed from: b */
    public void mo27567b(boolean z) {
        if (!(z ? m47000i() : false)) {
            m46998e(false);
        }
    }

    /* renamed from: g */
    public final void mo27920g() {
        if (f35679b) {
            f35679b = false;
            m46998e(m46999f());
        }
    }

    /* renamed from: h */
    public final void mo27921h(boolean z, C8338d3.C8362h1 h1Var) {
        if (h1Var != null) {
            f35678a.add(h1Var);
        }
        if (m46999f()) {
            m46998e(true);
        } else if (f35680c) {
            PermissionsActivity.m46230i(z, "NOTIFICATION", "android.permission.POST_NOTIFICATIONS", C8479l0.class);
        } else if (z) {
            m47000i();
        } else {
            m46998e(false);
        }
    }
}
