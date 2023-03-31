package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class g02 implements f12 {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final Pattern f9627h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a */
    private final gz1 f9628a;

    /* renamed from: b */
    private final mf3 f9629b;

    /* renamed from: c */
    private final et2 f9630c;

    /* renamed from: d */
    private final ScheduledExecutorService f9631d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final n32 f9632e;

    /* renamed from: f */
    private final yy2 f9633f;

    /* renamed from: g */
    private final Context f9634g;

    g02(Context context, et2 et2, gz1 gz1, mf3 mf3, ScheduledExecutorService scheduledExecutorService, n32 n32, yy2 yy2) {
        this.f9634g = context;
        this.f9630c = et2;
        this.f9628a = gz1;
        this.f9629b = mf3;
        this.f9631d = scheduledExecutorService;
        this.f9632e = n32;
        this.f9633f = yy2;
    }

    /* renamed from: a */
    public final lf3 mo9421a(yg0 yg0) {
        lf3 b = this.f9628a.mo10701b(yg0);
        ny2 a = my2.m16825a(this.f9634g, 11);
        xy2.m23612d(b, a);
        lf3 n = cf3.m10916n(b, new d02(this), this.f9629b);
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14277D4)).booleanValue()) {
            n = cf3.m10909g(cf3.m10917o(n, (long) ((Integer) C4596v.m30088c().mo12227b(C2679nz.f14287E4)).intValue(), TimeUnit.SECONDS, this.f9631d), TimeoutException.class, e02.f8549a, dn0.f8330f);
        }
        xy2.m23609a(n, this.f9633f, a);
        cf3.m10920r(n, new f02(this), dn0.f8330f);
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ lf3 mo10371c(InputStream inputStream) throws Exception {
        return cf3.m10911i(new us2(new rs2(this.f9630c), ts2.m21215a(new InputStreamReader(inputStream))));
    }
}
