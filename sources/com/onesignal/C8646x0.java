package com.onesignal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.x0 */
/* compiled from: OSInAppMessageAction */
public class C8646x0 {

    /* renamed from: a */
    private String f36107a;

    /* renamed from: b */
    private String f36108b;

    /* renamed from: c */
    private C8647a f36109c;

    /* renamed from: d */
    private String f36110d;

    /* renamed from: e */
    private String f36111e;

    /* renamed from: f */
    private List<C8418f1> f36112f = new ArrayList();

    /* renamed from: g */
    private List<C8460i1> f36113g = new ArrayList();

    /* renamed from: h */
    private C8506n1 f36114h;

    /* renamed from: i */
    private boolean f36115i;

    /* renamed from: j */
    private boolean f36116j;

    /* renamed from: com.onesignal.x0$a */
    /* compiled from: OSInAppMessageAction */
    public enum C8647a {
        IN_APP_WEBVIEW("webview"),
        BROWSER("browser"),
        REPLACE_CONTENT("replacement");
        

        /* renamed from: a */
        private String f36121a;

        private C8647a(String str) {
            this.f36121a = str;
        }

        /* renamed from: a */
        public static C8647a m47834a(String str) {
            for (C8647a aVar : values()) {
                if (aVar.f36121a.equalsIgnoreCase(str)) {
                    return aVar;
                }
            }
            return null;
        }

        public String toString() {
            return this.f36121a;
        }
    }

    C8646x0(JSONObject jSONObject) throws JSONException {
        this.f36107a = jSONObject.optString("id", (String) null);
        this.f36108b = jSONObject.optString(MediationMetaData.KEY_NAME, (String) null);
        this.f36110d = jSONObject.optString("url", (String) null);
        this.f36111e = jSONObject.optString("pageId", (String) null);
        C8647a a = C8647a.m47834a(jSONObject.optString("url_target", (String) null));
        this.f36109c = a;
        if (a == null) {
            this.f36109c = C8647a.IN_APP_WEBVIEW;
        }
        this.f36116j = jSONObject.optBoolean("close", true);
        if (jSONObject.has("outcomes")) {
            m47822j(jSONObject);
        }
        if (jSONObject.has("tags")) {
            this.f36114h = new C8506n1(jSONObject.getJSONObject("tags"));
        }
        if (jSONObject.has("prompts")) {
            m47823k(jSONObject);
        }
    }

    /* renamed from: j */
    private void m47822j(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("outcomes");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f36112f.add(new C8418f1((JSONObject) jSONArray.get(i)));
        }
    }

    /* renamed from: k */
    private void m47823k(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("prompts");
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            string.hashCode();
            if (string.equals("push")) {
                this.f36113g.add(new C8473k1());
            } else if (string.equals("location")) {
                this.f36113g.add(new C8406e1());
            }
        }
    }

    /* renamed from: a */
    public boolean mo28291a() {
        return this.f36116j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo28292b() {
        return this.f36107a;
    }

    /* renamed from: c */
    public String mo28293c() {
        return this.f36108b;
    }

    /* renamed from: d */
    public String mo28294d() {
        return this.f36110d;
    }

    /* renamed from: e */
    public List<C8418f1> mo28295e() {
        return this.f36112f;
    }

    /* renamed from: f */
    public List<C8460i1> mo28296f() {
        return this.f36113g;
    }

    /* renamed from: g */
    public C8506n1 mo28297g() {
        return this.f36114h;
    }

    /* renamed from: h */
    public C8647a mo28298h() {
        return this.f36109c;
    }

    /* renamed from: i */
    public boolean mo28299i() {
        return this.f36115i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo28300l(boolean z) {
        this.f36115i = z;
    }
}
