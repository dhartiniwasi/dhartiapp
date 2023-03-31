package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import org.json.JSONException;
import org.json.JSONObject;
import p060h4.C4596v;
import p081k5.C4888c;
import p180z4.C6378j;

/* renamed from: com.google.android.gms.internal.ads.lz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2605lz implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final Object f13114a = new Object();

    /* renamed from: b */
    private final ConditionVariable f13115b = new ConditionVariable();

    /* renamed from: c */
    private volatile boolean f13116c = false;

    /* renamed from: d */
    volatile boolean f13117d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SharedPreferences f13118e = null;

    /* renamed from: f */
    private Bundle f13119f = new Bundle();

    /* renamed from: g */
    private Context f13120g;

    /* renamed from: h */
    private JSONObject f13121h = new JSONObject();

    /* renamed from: f */
    private final void m16319f() {
        if (this.f13118e != null) {
            try {
                this.f13121h = new JSONObject((String) C2754pz.m18985a(new C2494iz(this)));
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: b */
    public final Object mo12227b(C2344ez ezVar) {
        if (!this.f13115b.block(5000)) {
            synchronized (this.f13114a) {
                if (!this.f13117d) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.f13116c || this.f13118e == null) {
            synchronized (this.f13114a) {
                if (this.f13116c) {
                    if (this.f13118e == null) {
                    }
                }
                Object m = ezVar.mo10051m();
                return m;
            }
        }
        if (ezVar.mo10049e() == 2) {
            Bundle bundle = this.f13119f;
            if (bundle == null) {
                return ezVar.mo10051m();
            }
            return ezVar.mo8626b(bundle);
        } else if (ezVar.mo10049e() != 1 || !this.f13121h.has(ezVar.mo10052n())) {
            return C2754pz.m18985a(new C2456hz(this, ezVar));
        } else {
            return ezVar.mo8625a(this.f13121h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo12228c(C2344ez ezVar) {
        return ezVar.mo8627c(this.f13118e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ String mo12229d() {
        return this.f13118e.getString("flag_configuration", "{}");
    }

    /* renamed from: e */
    public final void mo12230e(Context context) {
        if (!this.f13116c) {
            synchronized (this.f13114a) {
                if (!this.f13116c) {
                    if (!this.f13117d) {
                        this.f13117d = true;
                    }
                    Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
                    this.f13120g = applicationContext;
                    try {
                        this.f13119f = C4888c.m31075a(applicationContext).mo18670c(this.f13120g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context e = C6378j.m37456e(context);
                        if (!(e == null && (e = context.getApplicationContext()) == null)) {
                            context = e;
                        }
                        if (context != null) {
                            C4596v.m30087b();
                            SharedPreferences a = C2419gz.m13608a(context);
                            this.f13118e = a;
                            if (a != null) {
                                a.registerOnSharedPreferenceChangeListener(this);
                            }
                            w10.m22534c(new C2531jz(this));
                            m16319f();
                            this.f13116c = true;
                            this.f13117d = false;
                            this.f13115b.open();
                        }
                    } finally {
                        this.f13117d = false;
                        this.f13115b.open();
                    }
                }
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m16319f();
        }
    }
}
