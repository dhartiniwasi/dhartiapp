package com.startapp;

import android.app.Activity;
import android.content.Context;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.C9450c;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.startapp.u9 */
/* compiled from: Sta */
public class C9584u9 {

    /* renamed from: d */
    public static final C9584u9 f39253d = new C9584u9();

    /* renamed from: a */
    public String f39254a = "";

    /* renamed from: b */
    public long f39255b = 0;

    /* renamed from: c */
    public MetaDataRequest.RequestReason f39256c = MetaDataRequest.RequestReason.LAUNCH;

    /* renamed from: a */
    public String mo31308a() {
        return this.f39254a;
    }

    /* renamed from: b */
    public long mo31310b() {
        return this.f39255b;
    }

    /* renamed from: a */
    public synchronized void mo31309a(Context context, MetaDataRequest.RequestReason requestReason) {
        this.f39254a = UUID.randomUUID().toString();
        this.f39255b = System.currentTimeMillis();
        this.f39256c = requestReason;
        Map<Activity, Integer> map = C9605vb.f39316a;
        C8938f fVar = C8938f.f36742d;
        fVar.f36743a.clear();
        fVar.f36744b.clear();
        fVar.f36745c.clear();
        MetaData.f38952k.mo31015a(context, new AdPreferences(), requestReason, false, (C9450c) null, true);
    }
}
