package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.C0576b;
import androidx.browser.customtabs.C0577c;
import androidx.browser.customtabs.C0586e;
import androidx.browser.customtabs.C0588f;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class m00 {

    /* renamed from: a */
    private C0588f f13133a;

    /* renamed from: b */
    private C0577c f13134b;

    /* renamed from: c */
    private C0586e f13135c;

    /* renamed from: d */
    private j00 f13136d;

    /* renamed from: g */
    public static boolean m16334g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(p44.m18330a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C0588f mo12237a() {
        C0577c cVar = this.f13134b;
        if (cVar == null) {
            this.f13133a = null;
        } else if (this.f13133a == null) {
            this.f13133a = cVar.mo2673c((C0576b) null);
        }
        return this.f13133a;
    }

    /* renamed from: b */
    public final void mo12238b(Activity activity) {
        String a;
        if (this.f13134b == null && (a = p44.m18330a(activity)) != null) {
            q44 q44 = new q44(this, (byte[]) null);
            this.f13135c = q44;
            C0577c.m2736a(activity, a, q44);
        }
    }

    /* renamed from: c */
    public final void mo12239c(C0577c cVar) {
        this.f13134b = cVar;
        cVar.mo2674e(0);
        j00 j00 = this.f13136d;
        if (j00 != null) {
            j00.zza();
        }
    }

    /* renamed from: d */
    public final void mo12240d() {
        this.f13134b = null;
        this.f13133a = null;
    }

    /* renamed from: e */
    public final void mo12241e(j00 j00) {
        this.f13136d = j00;
    }

    /* renamed from: f */
    public final void mo12242f(Activity activity) {
        C0586e eVar = this.f13135c;
        if (eVar != null) {
            activity.unbindService(eVar);
            this.f13134b = null;
            this.f13133a = null;
            this.f13135c = null;
        }
    }
}
