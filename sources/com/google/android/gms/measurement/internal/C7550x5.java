package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7550x5 implements C7380h9 {

    /* renamed from: a */
    final /* synthetic */ C7388i6 f33180a;

    C7550x5(C7388i6 i6Var) {
        this.f33180a = i6Var;
    }

    /* renamed from: a */
    public final void mo24319a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f33180a.mo24355t("auto", "_err", bundle, str);
        } else {
            this.f33180a.mo24353q("auto", "_err", bundle);
        }
    }
}
