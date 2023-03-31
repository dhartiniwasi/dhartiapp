package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import p218e6.C9977j;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class d63 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final q63 f8105c = new q63("OverlayDisplayService");

    /* renamed from: d */
    private static final Intent f8106d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    final b73 f8107a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f8108b;

    d63(Context context) {
        if (f73.m12447a(context)) {
            this.f8107a = new b73(context.getApplicationContext(), f8105c, "OverlayDisplayService", f8106d, y53.f20468a, (w63) null, (byte[]) null);
        } else {
            this.f8107a = null;
        }
        this.f8108b = context.getPackageName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9439c() {
        if (this.f8107a != null) {
            f8105c.mo13479d("unbind LMD display overlay service", new Object[0]);
            this.f8107a.mo8690r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo9440d(u53 u53, i63 i63) {
        if (this.f8107a == null) {
            f8105c.mo13477b("error: %s", "Play Store not found.");
            return;
        }
        C9977j jVar = new C9977j();
        this.f8107a.mo8688p(new a63(this, jVar, u53, i63, jVar), jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo9441e(f63 f63, i63 i63) {
        if (this.f8107a == null) {
            f8105c.mo13477b("error: %s", "Play Store not found.");
        } else if (f63.mo10081g() == null) {
            f8105c.mo13477b("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            g63 c = h63.m13733c();
            c.mo10400b(8160);
            i63.mo11027a(c.mo10401c());
        } else {
            C9977j jVar = new C9977j();
            this.f8107a.mo8688p(new z53(this, jVar, f63, i63, jVar), jVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo9442f(k63 k63, i63 i63, int i) {
        if (this.f8107a == null) {
            f8105c.mo13477b("error: %s", "Play Store not found.");
            return;
        }
        C9977j jVar = new C9977j();
        this.f8107a.mo8688p(new b63(this, jVar, k63, i, i63, jVar), jVar);
    }
}
