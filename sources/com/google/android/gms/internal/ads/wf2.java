package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class wf2 implements tj2 {

    /* renamed from: a */
    private final bp2 f19617a;

    wf2(bp2 bp2) {
        this.f19617a = bp2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14921a(Bundle bundle) {
        bundle.putString("key_schema", this.f19617a.mo8917a());
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        bp2 bp2 = this.f19617a;
        vf2 vf2 = null;
        if (!(bp2 == null || bp2.mo8917a() == null || bp2.mo8917a().isEmpty())) {
            vf2 = new vf2(this);
        }
        return cf3.m10911i(vf2);
    }

    public final int zza() {
        return 15;
    }
}
