package com.onesignal;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p249ha.C10490c;
import p278ka.C11603b;
import p278ka.C11605d;

/* renamed from: com.onesignal.c2 */
/* compiled from: OSOutcomeEvent */
public class C8324c2 {

    /* renamed from: a */
    private C10490c f35378a;

    /* renamed from: b */
    private JSONArray f35379b;

    /* renamed from: c */
    private String f35380c;

    /* renamed from: d */
    private long f35381d;

    /* renamed from: e */
    private Float f35382e;

    public C8324c2(C10490c cVar, JSONArray jSONArray, String str, long j, float f) {
        this.f35378a = cVar;
        this.f35379b = jSONArray;
        this.f35380c = str;
        this.f35381d = j;
        this.f35382e = Float.valueOf(f);
    }

    /* renamed from: a */
    public static C8324c2 m46360a(C11603b bVar) {
        JSONArray jSONArray;
        C10490c cVar = C10490c.UNATTRIBUTED;
        if (bVar.mo35757b() != null) {
            C11605d b = bVar.mo35757b();
            if (b.mo35764a() != null && b.mo35764a().mo35771b() != null && b.mo35764a().mo35771b().length() > 0) {
                cVar = C10490c.DIRECT;
                jSONArray = b.mo35764a().mo35771b();
                return new C8324c2(cVar, jSONArray, bVar.mo35756a(), bVar.mo35758c(), bVar.mo35759d());
            } else if (!(b.mo35765b() == null || b.mo35765b().mo35771b() == null || b.mo35765b().mo35771b().length() <= 0)) {
                cVar = C10490c.INDIRECT;
                jSONArray = b.mo35765b().mo35771b();
                return new C8324c2(cVar, jSONArray, bVar.mo35756a(), bVar.mo35758c(), bVar.mo35759d());
            }
        }
        jSONArray = null;
        return new C8324c2(cVar, jSONArray, bVar.mo35756a(), bVar.mo35758c(), bVar.mo35759d());
    }

    /* renamed from: b */
    public String mo27658b() {
        return this.f35380c;
    }

    /* renamed from: c */
    public JSONArray mo27659c() {
        return this.f35379b;
    }

    /* renamed from: d */
    public C10490c mo27660d() {
        return this.f35378a;
    }

    /* renamed from: e */
    public long mo27661e() {
        return this.f35381d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8324c2 c2Var = (C8324c2) obj;
        if (!this.f35378a.equals(c2Var.f35378a) || !this.f35379b.equals(c2Var.f35379b) || !this.f35380c.equals(c2Var.f35380c) || this.f35381d != c2Var.f35381d || !this.f35382e.equals(c2Var.f35382e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public float mo27663f() {
        return this.f35382e.floatValue();
    }

    /* renamed from: g */
    public JSONObject mo27664g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = this.f35379b;
        if (jSONArray != null && jSONArray.length() > 0) {
            jSONObject.put("notification_ids", this.f35379b);
        }
        jSONObject.put("id", this.f35380c);
        if (this.f35382e.floatValue() > 0.0f) {
            jSONObject.put("weight", this.f35382e);
        }
        long j = this.f35381d;
        if (j > 0) {
            jSONObject.put("timestamp", j);
        }
        return jSONObject;
    }

    public int hashCode() {
        int i;
        int i2 = 1;
        Object[] objArr = {this.f35378a, this.f35379b, this.f35380c, Long.valueOf(this.f35381d), this.f35382e};
        for (int i3 = 0; i3 < 5; i3++) {
            Object obj = objArr[i3];
            int i4 = i2 * 31;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i2 = i4 + i;
        }
        return i2;
    }

    public String toString() {
        return "OutcomeEvent{session=" + this.f35378a + ", notificationIds=" + this.f35379b + ", name='" + this.f35380c + '\'' + ", timestamp=" + this.f35381d + ", weight=" + this.f35382e + '}';
    }
}
