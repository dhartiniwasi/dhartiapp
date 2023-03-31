package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p402y5.C13044v;

/* renamed from: com.google.android.gms.measurement.internal.h6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7377h6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C7388i6 f32544a;

    /* synthetic */ C7377h6(C7388i6 i6Var, C13044v vVar) {
        this.f32544a = i6Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C7397j4 j4Var;
        try {
            this.f32544a.f32389a.mo24135l().mo24260v().mo24208a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                j4Var = this.f32544a.f32389a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f32544a.f32389a.mo24423N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f32544a.f32389a.mo24143s().mo24309z(new C7366g6(this, z, data, str, queryParameter));
                        j4Var = this.f32544a.f32389a;
                    }
                }
                j4Var = this.f32544a.f32389a;
            }
        } catch (RuntimeException e) {
            this.f32544a.f32389a.mo24135l().mo24256q().mo24209b("Throwable caught in onActivityCreated", e);
            j4Var = this.f32544a.f32389a;
        } catch (Throwable th) {
            this.f32544a.f32389a.mo24420K().mo24702y(activity, bundle);
            throw th;
        }
        j4Var.mo24420K().mo24702y(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f32544a.f32389a.mo24420K().mo24703z(activity);
    }

    public final void onActivityPaused(Activity activity) {
        this.f32544a.f32389a.mo24420K().mo24694A(activity);
        C7423l8 M = this.f32544a.f32389a.mo24422M();
        M.f32389a.mo24143s().mo24309z(new C7335d8(M, M.f32389a.mo24116a().mo18371b()));
    }

    public final void onActivityResumed(Activity activity) {
        C7423l8 M = this.f32544a.f32389a.mo24422M();
        M.f32389a.mo24143s().mo24309z(new C7324c8(M, M.f32389a.mo24116a().mo18371b()));
        this.f32544a.f32389a.mo24420K().mo24695B(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f32544a.f32389a.mo24420K().mo24696C(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
