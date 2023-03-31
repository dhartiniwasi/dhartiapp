package com.google.android.gms.internal.p026firebaseauthapi;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3555n0 {
    /* renamed from: a */
    public static C3219cr m26257a(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        Log.e(str, "Failed to parse " + str + " for string [" + str2 + "] with exception: " + message);
        return new C3219cr("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }

    /* renamed from: b */
    public static List m26258b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }
}
