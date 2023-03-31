package com.onesignal;

import com.onesignal.C8338d3;
import com.onesignal.C8592r3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.n4 */
/* compiled from: UserStateSecondaryChannelSynchronizer */
abstract class C8516n4 extends C8532o4 {
    C8516n4(C8592r3.C8597d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract String mo27863B();

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public C8338d3.C8384r0 mo27905C() {
        return C8338d3.C8384r0.INFO;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo27906Q(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(mo27870l0(), jSONObject.get("identifier"));
                if (jSONObject.has(mo27869k0())) {
                    jSONObject2.put(mo27869k0(), jSONObject.get(mo27869k0()));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mo27868j0(jSONObject2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public void mo27907W() {
        if (!(mo27863B() == null && mo28027E() == null) && C8338d3.m46463Q0() != null) {
            mo28026D(0).mo28047c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i0 */
    public abstract void mo27867i0();

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public abstract void mo27868j0(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public abstract String mo27869k0();

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public abstract String mo27870l0();

    /* access modifiers changed from: protected */
    /* renamed from: m0 */
    public abstract int mo27871m0();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo27912n(JSONObject jSONObject) {
        try {
            jSONObject.put("device_type", mo27871m0());
            jSONObject.putOpt("device_player_id", C8338d3.m46463Q0());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo27995n0() {
        mo27907W();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* renamed from: o0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27996o0(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            com.onesignal.g4 r0 = r6.mo28030H()
            com.onesignal.x r1 = r0.mo27822l()
            java.lang.String r2 = "identifier"
            java.lang.String r3 = r1.mo28288f(r2)
            boolean r3 = r7.equals(r3)
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x002b
            java.lang.String r3 = r6.mo27869k0()
            java.lang.String r3 = r1.mo28288f(r3)
            if (r8 != 0) goto L_0x0022
            r5 = r4
            goto L_0x0023
        L_0x0022:
            r5 = r8
        L_0x0023:
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x002b
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            if (r3 == 0) goto L_0x004a
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r6.mo27870l0()     // Catch:{ JSONException -> 0x0042 }
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0042 }
            java.lang.String r7 = r6.mo27869k0()     // Catch:{ JSONException -> 0x0042 }
            r0.put(r7, r8)     // Catch:{ JSONException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0046:
            r6.mo27868j0(r0)
            return
        L_0x004a:
            r3 = 0
            java.lang.String r1 = r1.mo28289g(r2, r3)
            if (r1 != 0) goto L_0x0054
            r6.mo28039c0()
        L_0x0054:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007f }
            r5.<init>()     // Catch:{ JSONException -> 0x007f }
            r5.put(r2, r7)     // Catch:{ JSONException -> 0x007f }
            if (r8 == 0) goto L_0x0065
            java.lang.String r2 = r6.mo27869k0()     // Catch:{ JSONException -> 0x007f }
            r5.put(r2, r8)     // Catch:{ JSONException -> 0x007f }
        L_0x0065:
            if (r8 != 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            boolean r7 = r1.equals(r7)     // Catch:{ JSONException -> 0x007f }
            if (r7 != 0) goto L_0x0078
            r6.mo27865V(r4)     // Catch:{ JSONException -> 0x007f }
            r6.mo28035T()     // Catch:{ JSONException -> 0x007f }
            r6.mo28039c0()     // Catch:{ JSONException -> 0x007f }
        L_0x0078:
            r0.mo27819h(r5, r3)     // Catch:{ JSONException -> 0x007f }
            r6.mo27907W()     // Catch:{ JSONException -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r7 = move-exception
            r7.printStackTrace()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8516n4.mo27996o0(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo27919w(JSONObject jSONObject) {
        if (jSONObject.has("identifier")) {
            mo27867i0();
        }
    }
}
