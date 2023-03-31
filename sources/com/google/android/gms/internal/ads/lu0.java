package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class lu0 extends MutableContextWrapper {

    /* renamed from: a */
    private Activity f12951a;

    /* renamed from: b */
    private Context f12952b;

    /* renamed from: c */
    private Context f12953c;

    public lu0(Context context) {
        super(context);
        setBaseContext(context);
    }

    /* renamed from: a */
    public final Activity mo12147a() {
        return this.f12951a;
    }

    /* renamed from: b */
    public final Context mo12148b() {
        return this.f12953c;
    }

    public final Object getSystemService(String str) {
        return this.f12953c.getSystemService(str);
    }

    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12952b = applicationContext;
        this.f12951a = context instanceof Activity ? (Activity) context : null;
        this.f12953c = context;
        super.setBaseContext(applicationContext);
    }

    public final void startActivity(Intent intent) {
        Activity activity = this.f12951a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f12952b.startActivity(intent);
    }
}
