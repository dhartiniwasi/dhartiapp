package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import p053g4.C4409t;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class ng2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ og2 f14012a;

    public /* synthetic */ ng2(og2 og2) {
        this.f14012a = og2;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        C4409t.m29326r();
        C2895ts c = C4409t.m29325q().mo15117h().mo18495c();
        Bundle bundle = null;
        if (c != null && (!C4409t.m29325q().mo15117h().mo18520y() || !C4409t.m29325q().mo15117h().mo18508m())) {
            if (c.mo14375h()) {
                c.mo14374g();
            }
            C2524js a = c.mo14368a();
            if (a != null) {
                str2 = a.mo11491d();
                str = a.mo11492e();
                str3 = a.mo11494f();
                if (str2 != null) {
                    C4409t.m29325q().mo15117h().mo18512q(str2);
                }
                if (str3 != null) {
                    C4409t.m29325q().mo15117h().mo18517v(str3);
                }
            } else {
                str2 = C4409t.m29325q().mo15117h().mo18488W();
                str3 = C4409t.m29325q().mo15117h().mo18489X();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!C4409t.m29325q().mo15117h().mo18508m()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    bundle2.putString("v_fp_vertical", "no_hash");
                } else {
                    bundle2.putString("v_fp_vertical", str3);
                }
            }
            if (str2 != null && !C4409t.m29325q().mo15117h().mo18520y()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new pg2(bundle);
    }
}
