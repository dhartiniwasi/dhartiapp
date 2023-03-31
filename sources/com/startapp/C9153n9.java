package com.startapp;

import android.content.Context;
import android.os.Build;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.common.SDKException;

/* renamed from: com.startapp.n9 */
/* compiled from: Sta */
public class C9153n9 extends C9671z0 {

    /* renamed from: h0 */
    public C9133m8 f37347h0;

    /* renamed from: i0 */
    public String f37348i0;

    public C9153n9(Context context) {
        super(1);
        this.f37347h0 = C8982g8.m48648a(context);
        this.f37348i0 = C8837b0.m48295a(context);
    }

    /* renamed from: a */
    public void mo29314a(C9152n8 n8Var) throws SDKException {
        super.mo29314a(n8Var);
        n8Var.mo29310a("placement", (Object) "INAPP_DOWNLOAD", true, true);
        C9133m8 m8Var = this.f37347h0;
        if (m8Var != null) {
            n8Var.mo29310a("install_referrer", (Object) m8Var.f37299a.getString("install_referrer"), true, true);
            n8Var.mo29310a("referrer_click_timestamp_seconds", (Object) Long.valueOf(this.f37347h0.f37299a.getLong("referrer_click_timestamp_seconds")), true, true);
            n8Var.mo29310a("install_begin_timestamp_seconds", (Object) Long.valueOf(this.f37347h0.f37299a.getLong("install_begin_timestamp_seconds")), true, true);
        }
        n8Var.mo29310a("apkSig", (Object) this.f37348i0, true, true);
        if (Build.VERSION.SDK_INT >= 9) {
            long j = SimpleTokenUtils.f38641c;
            if (j != 0) {
                n8Var.mo29310a("firstInstalledAppTS", (Object) Long.valueOf(j), false, true);
            }
        }
    }
}
