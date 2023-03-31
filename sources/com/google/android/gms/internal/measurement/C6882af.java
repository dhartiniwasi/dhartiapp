package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.af */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6882af extends C7017j {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C7272ye f31574c;

    public C6882af(C7272ye yeVar) {
        super("internal.logger");
        this.f31574c = yeVar;
        this.f31777b.put("log", new C7288ze(this, false, true));
        this.f31777b.put("silent", new C6949ee(this, "silent"));
        ((C7017j) this.f31777b.get("silent")).mo23376i("log", new C7288ze(this, true, true));
        this.f31777b.put("unmonitored", new C7256xe(this, "unmonitored"));
        ((C7017j) this.f31777b.get("unmonitored")).mo23376i("log", new C7288ze(this, false, false));
    }

    /* renamed from: a */
    public final C7129q mo23023a(C7262y4 y4Var, List list) {
        return C7129q.f31955m;
    }
}
