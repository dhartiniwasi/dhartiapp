package com.startapp;

import com.startapp.C8935ee;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.startapp.te */
/* compiled from: Sta */
public class C9571te extends C9626wd {
    public C9571te(C8935ee.C8937b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* renamed from: a */
    public void mo29340a(String str) {
        C9228pd pdVar = C9228pd.f38085c;
        if (pdVar != null) {
            for (T t : Collections.unmodifiableCollection(pdVar.f38086a)) {
                if (this.f39339c.contains(t.f38171h)) {
                    t.f38168e.mo22945a(str, this.f39341e);
                }
            }
        }
        super.onPostExecute(str);
    }

    public Object doInBackground(Object[] objArr) {
        return this.f39340d.toString();
    }
}
