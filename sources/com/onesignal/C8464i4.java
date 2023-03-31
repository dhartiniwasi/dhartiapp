package com.onesignal;

import com.onesignal.C8592r3;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.onesignal.i4 */
/* compiled from: UserStateEmailSynchronizer */
class C8464i4 extends C8516n4 {
    C8464i4() {
        super(C8592r3.C8597d.EMAIL);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo27863B() {
        return C8338d3.m46521h0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public C8451g4 mo27864P(String str, boolean z) {
        return new C8457h4(str, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo27865V(String str) {
        C8338d3.m46495a2(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo27866g0(String str) {
        C8338d3.m46446L2(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo27867i0() {
        C8338d3.m46459P();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo27868j0(JSONObject jSONObject) {
        C8338d3.m46462Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public String mo27869k0() {
        return "email_auth_hash";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public String mo27870l0() {
        return "email";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public int mo27871m0() {
        return 11;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo27872p0() {
        C8338d3.m46495a2("");
        mo28035T();
        mo28029G().mo27832w("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add("email_auth_hash");
        arrayList.add("device_player_id");
        arrayList.add("external_user_id");
        mo28029G().mo27833x(arrayList);
        mo28029G().mo27826q();
        C8338d3.m46525i0().mo28208a();
    }
}
