package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7553x8 implements C7380h9 {

    /* renamed from: a */
    final /* synthetic */ C7303a9 f33191a;

    C7553x8(C7303a9 a9Var) {
        this.f33191a = a9Var;
    }

    /* renamed from: a */
    public final void mo24319a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            C7303a9 a9Var = this.f33191a;
            if (a9Var.f32345l != null) {
                a9Var.f32345l.mo24135l().mo24256q().mo24209b("AppId not known when logging event", "_err");
                return;
            }
            return;
        }
        this.f33191a.mo24143s().mo24309z(new C7543w8(this, str, "_err", bundle));
    }
}
