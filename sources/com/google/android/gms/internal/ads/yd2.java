package com.google.android.gms.internal.ads;

import p060h4.C4596v;
import p115p4.C5315w;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class yd2 implements tj2 {

    /* renamed from: a */
    private final mf3 f20560a;

    /* renamed from: b */
    private final et2 f20561b;

    /* renamed from: c */
    private final qt2 f20562c;

    yd2(mf3 mf3, et2 et2, qt2 qt2) {
        this.f20560a = mf3;
        this.f20561b = et2;
        this.f20562c = qt2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zd2 mo15429a() throws Exception {
        String str = null;
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14634n6)).booleanValue() && "requester_type_2".equals(C5315w.m32639b(this.f20561b.f8933d))) {
            str = qt2.m19347a();
        }
        return new zd2(str);
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return this.f20560a.mo12324a(new xd2(this));
    }

    public final int zza() {
        return 5;
    }
}
