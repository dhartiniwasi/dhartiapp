package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.common.advertisingid.AdvertisingIdResolver;
import java.util.Set;

/* renamed from: com.startapp.d */
/* compiled from: Sta */
public class C8897d {

    /* renamed from: a */
    public final Context f36659a;

    /* renamed from: b */
    public final C9277s5<AdvertisingIdResolver> f36660b;

    /* renamed from: c */
    public final C8908d3<AdDebuggerMetadata> f36661c;

    public C8897d(Context context, C9277s5<AdvertisingIdResolver> s5Var, C8908d3<AdDebuggerMetadata> d3Var) {
        this.f36659a = context;
        this.f36660b = s5Var;
        this.f36661c = d3Var;
    }

    /* renamed from: a */
    public boolean mo29286a() {
        Set<String> a;
        AdDebuggerMetadata call = this.f36661c.call();
        if (call == null || (a = call.mo30912a()) == null) {
            return false;
        }
        return a.contains(this.f36660b.mo29904a().mo31157a().f39228a);
    }
}
