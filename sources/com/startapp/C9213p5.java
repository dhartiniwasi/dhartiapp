package com.startapp;

import android.text.TextUtils;
import com.startapp.sdk.common.SDKException;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.startapp.p5 */
/* compiled from: Sta */
public class C9213p5 extends C9152n8 {

    /* renamed from: a */
    public final JSONObject f38053a = new JSONObject();

    /* renamed from: a */
    public void mo29310a(String str, Object obj, boolean z, boolean z2) throws SDKException {
        if (z && obj == null) {
            throw new SDKException(str, (Throwable) null);
        } else if (obj != null && !TextUtils.isEmpty(obj.toString())) {
            try {
                this.f38053a.put(str, obj);
            } catch (JSONException e) {
                if (z) {
                    throw new SDKException(str, e);
                }
            }
        }
    }

    public String toString() {
        return this.f38053a.toString();
    }

    /* renamed from: a */
    public void mo29311a(String str, Set<String> set, boolean z, boolean z2) throws SDKException {
        if (z && (set == null || set.size() == 0)) {
            throw new SDKException(str, (Throwable) null);
        } else if (set != null && set.size() > 0) {
            try {
                this.f38053a.put(str, new JSONArray(set));
            } catch (JSONException e) {
                if (z) {
                    throw new SDKException(str, e);
                }
            }
        }
    }
}
