package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import p053g4.C4409t;
import p060h4.C4596v;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yh2 implements tj2 {

    /* renamed from: a */
    private final mf3 f20619a;

    /* renamed from: b */
    private final Context f20620b;

    /* renamed from: c */
    private final Set f20621c;

    public yh2(mf3 mf3, Context context, Set set) {
        this.f20619a = mf3;
        this.f20620b = context;
        this.f20621c = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zh2 mo15439a() throws Exception {
        C2344ez ezVar = C2679nz.f14562g4;
        String str = null;
        if (((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
            Set set = this.f20621c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                C4409t.m29309a();
                if (true == ((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
                    str = "a.1.3.31-google_20220407";
                }
                return new zh2(str);
            }
        }
        return new zh2((String) null);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f20619a.mo12324a(new xh2(this));
    }

    public final int zza() {
        return 27;
    }
}
