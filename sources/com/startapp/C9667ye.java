package com.startapp;

import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AppSessionConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.ye */
/* compiled from: Sta */
public class C9667ye {

    /* renamed from: a */
    public final C9668a f39453a;

    /* renamed from: b */
    public final C8908d3<AppSessionConfig> f39454b;

    /* renamed from: c */
    public final Map<AdPreferences.Placement, Integer> f39455c = new ConcurrentHashMap();

    /* renamed from: d */
    public long f39456d;

    /* renamed from: e */
    public long f39457e;

    /* renamed from: com.startapp.ye$a */
    /* compiled from: Sta */
    public interface C9668a {
    }

    public C9667ye(C9668a aVar, C8908d3<AppSessionConfig> d3Var) {
        this.f39453a = aVar;
        this.f39454b = d3Var;
    }
}
