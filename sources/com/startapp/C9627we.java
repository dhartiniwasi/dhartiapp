package com.startapp;

import android.text.TextUtils;
import com.startapp.C8935ee;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.startapp.we */
/* compiled from: Sta */
public class C9627we extends C9626wd {
    public C9627we(C8935ee.C8937b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: a */
    public void mo29340a(String str) {
        C9228pd pdVar;
        if (!TextUtils.isEmpty(str) && (pdVar = C9228pd.f38085c) != null) {
            for (T t : Collections.unmodifiableCollection(pdVar.f38086a)) {
                if (this.f39339c.contains(t.f38171h)) {
                    t.f38168e.mo22947b(str, this.f39341e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public Object doInBackground(Object[] objArr) {
        if (C8919de.m48533c(this.f39340d, ((C9609vd) this.f36741b).f39321a)) {
            return null;
        }
        C8935ee.C8937b bVar = this.f36741b;
        JSONObject jSONObject = this.f39340d;
        ((C9609vd) bVar).f39321a = jSONObject;
        return jSONObject.toString();
    }
}
