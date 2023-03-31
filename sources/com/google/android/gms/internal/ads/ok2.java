package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ok2 implements tj2 {

    /* renamed from: a */
    private final Executor f15169a;

    /* renamed from: b */
    private final String f15170b;

    /* renamed from: c */
    private final PackageInfo f15171c;

    /* renamed from: d */
    private final ol0 f15172d;

    public ok2(ol0 ol0, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.f15172d = ol0;
        this.f15169a = executor;
        this.f15170b = str;
        this.f15171c = packageInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ lf3 mo12965a(Throwable th) throws Exception {
        return cf3.m10911i(new qk2(this.f15170b));
    }

    /* renamed from: d */
    public final lf3 mo8340d() {
        return cf3.m10909g(cf3.m10915m(cf3.m10911i(this.f15170b), mk2.f13357a, this.f15169a), Throwable.class, new nk2(this), this.f15169a);
    }

    public final int zza() {
        return 41;
    }
}
