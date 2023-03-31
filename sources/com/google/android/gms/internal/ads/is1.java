package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class is1 implements iu0 {

    /* renamed from: a */
    public final /* synthetic */ in0 f10941a;

    public /* synthetic */ is1(in0 in0) {
        this.f10941a = in0;
    }

    /* renamed from: b */
    public final void mo10295b(boolean z) {
        in0 in0 = this.f10941a;
        if (z) {
            in0.mo11172d((Object) null);
        } else {
            in0.mo11173e(new Exception("Ad Web View failed to load."));
        }
    }
}
