package com.startapp;

import android.content.Context;
import com.startapp.C9641x9;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.o0 */
/* compiled from: Sta */
public class C9181o0 extends GetAdRequest {

    /* renamed from: U0 */
    public boolean f37969U0;

    /* renamed from: V0 */
    public int f37970V0;

    /* renamed from: a */
    public void mo29314a(C9152n8 n8Var) throws SDKException {
        super.mo29314a(n8Var);
        n8Var.mo29310a("fixedSize", (Object) Boolean.valueOf(this.f37969U0), false, true);
        n8Var.mo29310a("bnrt", (Object) Integer.valueOf(this.f37970V0), false, true);
    }

    /* renamed from: f */
    public void mo29776f(Context context) {
        String str;
        C9641x9 t = ComponentLocator.m50248a(context).mo31184t();
        AdPreferences.Placement placement = this.f38910h0;
        int i = this.f37970V0;
        if (placement == null) {
            str = null;
        } else {
            str = t.f39385a.get(new C9641x9.C9642a(placement, i));
        }
        this.f38924w0 = str;
    }
}
