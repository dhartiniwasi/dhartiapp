package com.startapp.sdk.adsbase;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.C8842b3;
import com.startapp.C9023i4;
import com.startapp.C9153n9;
import com.startapp.C9219p7;
import com.startapp.C9605vb;
import com.startapp.C9654y3;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.sdk.adsbase.f */
/* compiled from: Sta */
public class C9444f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f38877a;

    /* renamed from: b */
    public final /* synthetic */ ComponentLocator f38878b;

    /* renamed from: c */
    public final /* synthetic */ C9441e f38879c;

    public C9444f(StartAppSDKInternal startAppSDKInternal, Context context, ComponentLocator componentLocator, C9441e eVar) {
        this.f38877a = context;
        this.f38878b = componentLocator;
        this.f38879c = eVar;
    }

    public void run() {
        C9654y3 l;
        Boolean bool;
        C9219p7.C9220a aVar;
        try {
            C9153n9 n9Var = new C9153n9(this.f38877a);
            n9Var.mo31505a(this.f38877a, new AdPreferences());
            l = this.f38878b.mo31176l();
            StringBuilder sb = new StringBuilder();
            MetaData metaData = MetaData.f38952k;
            String str = metaData.trackDownloadHost;
            if (str == null) {
                str = metaData.mo31021d();
            }
            sb.append(str);
            sb.append(AdsConstants.f38628c);
            bool = null;
            aVar = l.mo31383a(sb.toString(), n9Var, (C8842b3<Throwable, Void>) null);
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return;
        }
        if (aVar != null) {
            String str2 = aVar.f38066b;
            if (!TextUtils.isEmpty(str2)) {
                String a = C9605vb.m50452a(str2, "@ct@", "@ct@");
                String a2 = C9605vb.m50452a(str2, "@tsc@", "@tsc@");
                String a3 = C9605vb.m50452a(str2, "@apc@", "@apc@");
                try {
                    Integer valueOf = !TextUtils.isEmpty(a) ? Integer.valueOf(Integer.parseInt(a)) : null;
                    Long valueOf2 = !TextUtils.isEmpty(a2) ? Long.valueOf(Long.parseLong(a2)) : null;
                    if (!TextUtils.isEmpty(a3)) {
                        bool = Boolean.valueOf(Boolean.parseBoolean(a3));
                    }
                    Boolean bool2 = bool;
                    if (!(valueOf == null && valueOf2 == null && bool2 == null)) {
                        this.f38878b.mo31170f().mo29321a(valueOf, valueOf2, bool2, false, true);
                    }
                } catch (Throwable th2) {
                    C9023i4.m48681a(th2);
                }
            }
        }
        C9441e.C9442a a4 = this.f38879c.edit();
        a4.mo30812a("shared_prefs_first_init", Boolean.FALSE);
        a4.f38873a.putBoolean("shared_prefs_first_init", false);
        a4.apply();
    }
}
