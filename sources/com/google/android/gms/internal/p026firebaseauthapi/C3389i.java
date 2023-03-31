package com.google.android.gms.internal.p026firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p040e5.C4240a;
import p040e5.C4243c;
import p067i5.C4703q;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3389i extends C4240a {
    public static final Parcelable.Creator<C3389i> CREATOR = new C3422j();

    /* renamed from: a */
    private final List f22115a;

    public C3389i() {
        this.f22115a = new ArrayList();
    }

    /* renamed from: I1 */
    public static C3389i m25730I1(JSONArray jSONArray) throws JSONException {
        C3323g gVar;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new C3389i(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject == null) {
                gVar = new C3323g();
            } else {
                gVar = new C3323g(C4703q.m30425a(jSONObject.optString("federatedId", (String) null)), C4703q.m30425a(jSONObject.optString("displayName", (String) null)), C4703q.m30425a(jSONObject.optString("photoUrl", (String) null)), C4703q.m30425a(jSONObject.optString("providerId", (String) null)), (String) null, C4703q.m30425a(jSONObject.optString("phoneNumber", (String) null)), C4703q.m30425a(jSONObject.optString("email", (String) null)));
            }
            arrayList.add(gVar);
        }
        return new C3389i(arrayList);
    }

    /* renamed from: J1 */
    public static C3389i m25731J1(C3389i iVar) {
        List list = iVar.f22115a;
        C3389i iVar2 = new C3389i();
        if (list != null) {
            iVar2.f22115a.addAll(list);
        }
        return iVar2;
    }

    /* renamed from: K1 */
    public final List mo16115K1() {
        return this.f22115a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4243c.m28604a(parcel);
        C4243c.m28624u(parcel, 2, this.f22115a, false);
        C4243c.m28605b(parcel, a);
    }

    C3389i(List list) {
        if (list == null || list.isEmpty()) {
            this.f22115a = Collections.emptyList();
        } else {
            this.f22115a = Collections.unmodifiableList(list);
        }
    }
}
