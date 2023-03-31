package com.onesignal;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.c1 */
/* compiled from: OSInAppMessageInternal */
class C8323c1 extends C8640w0 {

    /* renamed from: b */
    public HashMap<String, HashMap<String, String>> f35367b;

    /* renamed from: c */
    public ArrayList<ArrayList<C8687z2>> f35368c;

    /* renamed from: d */
    private Set<String> f35369d;

    /* renamed from: e */
    private C8481l1 f35370e = new C8481l1();

    /* renamed from: f */
    private double f35371f;

    /* renamed from: g */
    private boolean f35372g = false;

    /* renamed from: h */
    private boolean f35373h = false;

    /* renamed from: i */
    private boolean f35374i;

    /* renamed from: j */
    private Date f35375j;

    /* renamed from: k */
    boolean f35376k;

    /* renamed from: l */
    private boolean f35377l;

    C8323c1(boolean z) {
        super("");
        this.f35376k = z;
    }

    /* renamed from: k */
    private Date m46343k(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("end_time");
            if (string.equals("null")) {
                return null;
            }
            try {
                return C8580q3.m47552a().parse(string);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private HashMap<String, HashMap<String, String>> m46344m(JSONObject jSONObject) throws JSONException {
        HashMap<String, HashMap<String, String>> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            HashMap hashMap2 = new HashMap();
            Iterator<String> keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                hashMap2.put(next2, jSONObject2.getString(next2));
            }
            hashMap.put(next, hashMap2);
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27640b(String str) {
        this.f35369d.add(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo27641c() {
        this.f35369d.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Set<String> mo27642d() {
        return this.f35369d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo27643e() {
        return this.f35377l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f36098a.equals(((C8323c1) obj).f36098a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C8481l1 mo27645f() {
        return this.f35370e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo27646g(String str) {
        return !this.f35369d.contains(str);
    }

    /* renamed from: h */
    public boolean mo27647h() {
        return this.f35372g;
    }

    public int hashCode() {
        return this.f36098a.hashCode();
    }

    /* renamed from: i */
    public boolean mo27649i() {
        if (this.f35375j == null) {
            return false;
        }
        return this.f35375j.before(new Date());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo27650j() {
        return this.f35373h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public ArrayList<ArrayList<C8687z2>> mo27651l(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<C8687z2>> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new C8687z2(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo27652n(String str) {
        this.f35369d.remove(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo27653o(double d) {
        this.f35371f = d;
    }

    /* renamed from: p */
    public void mo27654p(boolean z) {
        this.f35372g = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo27655q(boolean z) {
        this.f35373h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo27656r() {
        if (this.f35374i) {
            return false;
        }
        this.f35374i = true;
        return true;
    }

    public String toString() {
        return "OSInAppMessage{messageId='" + this.f36098a + '\'' + ", variants=" + this.f35367b + ", triggers=" + this.f35368c + ", clickedClickIds=" + this.f35369d + ", redisplayStats=" + this.f35370e + ", displayDuration=" + this.f35371f + ", displayedInSession=" + this.f35372g + ", triggerChanged=" + this.f35373h + ", actionTaken=" + this.f35374i + ", isPreview=" + this.f35376k + ", endTime=" + this.f35375j + ", hasLiquid=" + this.f35377l + '}';
    }

    C8323c1(String str, Set<String> set, boolean z, C8481l1 l1Var) {
        super(str);
        this.f35369d = set;
        this.f35372g = z;
        this.f35370e = l1Var;
    }

    C8323c1(JSONObject jSONObject) throws JSONException {
        super(jSONObject.getString("id"));
        this.f35367b = m46344m(jSONObject.getJSONObject("variants"));
        this.f35368c = mo27651l(jSONObject.getJSONArray("triggers"));
        this.f35369d = new HashSet();
        this.f35375j = m46343k(jSONObject);
        if (jSONObject.has("has_liquid")) {
            this.f35377l = jSONObject.getBoolean("has_liquid");
        }
        if (jSONObject.has("redisplay")) {
            this.f35370e = new C8481l1(jSONObject.getJSONObject("redisplay"));
        }
    }
}
