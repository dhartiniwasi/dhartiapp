package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p060h4.C4596v;
import p073j4.C4794n1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class nv1 {

    /* renamed from: a */
    protected final String f14201a = ((String) y00.f20407b.mo13438e());

    /* renamed from: b */
    protected final Map f14202b = new HashMap();

    /* renamed from: c */
    protected final Executor f14203c;

    /* renamed from: d */
    protected final um0 f14204d;

    /* renamed from: e */
    protected final boolean f14205e;

    /* renamed from: f */
    private final fy2 f14206f;

    /* renamed from: g */
    private final boolean f14207g;

    /* renamed from: h */
    private final boolean f14208h;

    protected nv1(Executor executor, um0 um0, fy2 fy2) {
        this.f14203c = executor;
        this.f14204d = um0;
        this.f14205e = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14354L1)).booleanValue();
        this.f14206f = fy2;
        this.f14207g = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14384O1)).booleanValue();
        this.f14208h = ((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14544e6)).booleanValue();
    }

    /* renamed from: a */
    private final void m17279a(Map map, boolean z) {
        if (!map.isEmpty()) {
            String a = this.f14206f.mo10349a(map);
            C4794n1.m30693k(a);
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("scar"));
            if (!this.f14205e) {
                return;
            }
            if (z && !this.f14207g) {
                return;
            }
            if (!parseBoolean || this.f14208h) {
                this.f14203c.execute(new mv1(this, a));
                return;
            }
            return;
        }
        pm0.m18662b("Empty paramMap.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo12714b(Map map) {
        return this.f14206f.mo10349a(map);
    }

    /* renamed from: c */
    public final ConcurrentHashMap mo12715c() {
        return new ConcurrentHashMap(this.f14202b);
    }

    /* renamed from: d */
    public final void mo12716d(Map map) {
        m17279a(map, true);
    }

    /* renamed from: e */
    public final void mo12717e(Map map) {
        m17279a(map, false);
    }
}
