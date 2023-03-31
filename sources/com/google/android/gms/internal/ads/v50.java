package com.google.android.gms.internal.ads;

import java.util.Map;
import p066i4.C4678r;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class v50 implements e60 {
    v50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8220a(Object obj, Map map) {
        vs0 vs0 = (vs0) obj;
        if (vs0.mo12087I() != null) {
            vs0.mo12087I().zza();
        }
        C4678r m = vs0.mo12123m();
        if (m != null) {
            m.mo18361d();
            return;
        }
        C4678r i = vs0.mo12113i();
        if (i != null) {
            i.mo18361d();
        } else {
            pm0.m18667g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
