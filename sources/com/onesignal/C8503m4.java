package com.onesignal;

import com.onesignal.C8592r3;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.onesignal.m4 */
/* compiled from: UserStateSMSSynchronizer */
class C8503m4 extends C8516n4 {
    C8503m4() {
        super(C8592r3.C8597d.SMS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo27863B() {
        return C8338d3.m46404B0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public C8451g4 mo27864P(String str, boolean z) {
        return new C8484l4(str, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo27865V(String str) {
        C8338d3.m46499b2(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo27866g0(String str) {
        C8338d3.m46450M2(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public void mo27867i0() {
        C8338d3.m46471T();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public void mo27868j0(JSONObject jSONObject) {
        C8338d3.m46474U(jSONObject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public String mo27869k0() {
        return "sms_auth_hash";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public String mo27870l0() {
        return "sms_number";
    }

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public int mo27871m0() {
        return 14;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public void mo27969p0() {
        mo27865V("");
        mo28035T();
        mo28029G().mo27832w("identifier");
        ArrayList arrayList = new ArrayList();
        arrayList.add("sms_auth_hash");
        arrayList.add("device_player_id");
        arrayList.add("external_user_id");
        mo28029G().mo27833x(arrayList);
        mo28029G().mo27826q();
        C8338d3.m46408C0().mo27889a();
    }
}
