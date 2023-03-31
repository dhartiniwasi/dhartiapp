package com.startapp;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.view.WindowManager;

/* renamed from: com.startapp.u7 */
/* compiled from: Sta */
public final class C9582u7 {

    /* renamed from: a */
    public static C9250qd f39250a = new C9250qd();

    /* renamed from: a */
    public static void m50395a(Context context) {
        C9250qd qdVar = f39250a;
        Context applicationContext = context.getApplicationContext();
        C9542se.m50338a((Object) applicationContext, "Application Context cannot be null");
        if (!qdVar.f38131a) {
            qdVar.f38131a = true;
            C9647xe a = C9647xe.m50536a();
            a.f39414c.getClass();
            C9666yd ydVar = new C9666yd();
            C9590ue ueVar = a.f39413b;
            Handler handler = new Handler();
            ueVar.getClass();
            a.f39415d = new C9229pe(handler, applicationContext, ydVar, a);
            C8832ae aeVar = C8832ae.f36432d;
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(aeVar);
            }
            WindowManager windowManager = C8919de.f36706a;
            C8919de.f36708c = applicationContext.getResources().getDisplayMetrics().density;
            C8919de.f36706a = (WindowManager) applicationContext.getSystemService("window");
            C9140me.f37312b.f37313a = applicationContext.getApplicationContext();
        }
    }
}
