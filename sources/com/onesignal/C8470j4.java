package com.onesignal;

import org.json.JSONException;

/* renamed from: com.onesignal.j4 */
/* compiled from: UserStatePush */
class C8470j4 extends C8451g4 {
    C8470j4(String str, boolean z) {
        super(str, z);
    }

    /* renamed from: B */
    private int m46926B() {
        int d = mo27820i().mo28286d("subscribableStatus", 1);
        if (d < -2) {
            return d;
        }
        if (!mo27820i().mo28285c("androidPermission", true)) {
            return 0;
        }
        return !mo27820i().mo28285c("userSubscribePref", true) ? -2 : 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27813a() {
        try {
            mo27829t("notification_types", Integer.valueOf(m46926B()));
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C8451g4 mo27825p(String str) {
        return new C8470j4(str, false);
    }
}
