package p307nc;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import p264io.flutter.plugins.urllauncher.WebViewActivity;

/* renamed from: nc.b */
/* compiled from: UrlLauncher */
class C11994b {

    /* renamed from: a */
    private final Context f44938a;

    /* renamed from: b */
    private Activity f44939b;

    /* renamed from: nc.b$a */
    /* compiled from: UrlLauncher */
    enum C11995a {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    C11994b(Context context, Activity activity) {
        this.f44938a = context;
        this.f44939b = activity;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo36351a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.f44938a.getPackageManager());
        if (resolveActivity == null) {
            Log.i("UrlLauncher", "component name for " + str + " is null");
            return false;
        }
        Log.i("UrlLauncher", "component name for " + str + " is " + resolveActivity.toShortString());
        return !"{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo36352b() {
        this.f44938a.sendBroadcast(new Intent(WebViewActivity.f42429e));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C11995a mo36353c(String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intent intent;
        Activity activity = this.f44939b;
        if (activity == null) {
            return C11995a.NO_ACTIVITY;
        }
        if (z) {
            intent = WebViewActivity.m54285b(activity, str, z2, z3, bundle);
        } else {
            intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle);
        }
        try {
            this.f44939b.startActivity(intent);
            return C11995a.OK;
        } catch (ActivityNotFoundException unused) {
            return C11995a.ACTIVITY_NOT_FOUND;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo36354d(Activity activity) {
        this.f44939b = activity;
    }
}
