package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public abstract class C7241x {

    /* renamed from: a */
    final List f32175a = new ArrayList();

    protected C7241x() {
    }

    /* renamed from: a */
    public abstract C7129q mo22991a(String str, C7262y4 y4Var, List list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C7129q mo23977b(String str) {
        if (this.f32175a.contains(C7279z5.m41179e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
