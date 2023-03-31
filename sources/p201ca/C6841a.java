package p201ca;

import android.os.Build;
import android.webkit.WebView;
import com.startapp.C8919de;
import com.startapp.C8957fe;
import com.startapp.C8999h6;
import com.startapp.C9101l;
import com.startapp.C9140me;
import com.startapp.C9205p;
import com.startapp.C9230q;
import com.startapp.C9267rd;
import com.startapp.C9268re;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: ca.a */
/* compiled from: Sta */
public abstract class C6841a {

    /* renamed from: a */
    public C8957fe f31483a = new C8957fe((WebView) null);

    /* renamed from: b */
    public C9101l f31484b;

    /* renamed from: c */
    public C8999h6 f31485c;

    /* renamed from: d */
    public C6842a f31486d;

    /* renamed from: e */
    public long f31487e;

    /* renamed from: ca.a$a */
    /* compiled from: Sta */
    public enum C6842a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public C6841a() {
        mo22940a();
    }

    /* renamed from: a */
    public void mo22940a() {
        this.f31487e = System.nanoTime();
        this.f31486d = C6842a.AD_STATE_IDLE;
    }

    /* renamed from: a */
    public void mo22941a(WebView webView) {
        this.f31483a = new C8957fe(webView);
    }

    /* renamed from: a */
    public void mo22943a(C9267rd rdVar, C9230q qVar) {
        mo22944a(rdVar, qVar, (JSONObject) null);
    }

    /* renamed from: b */
    public void mo22946b() {
        this.f31483a.clear();
    }

    /* renamed from: b */
    public void mo22947b(String str, long j) {
        if (j >= this.f31487e) {
            this.f31486d = C6842a.AD_STATE_VISIBLE;
            C9268re.f38174a.mo29889a(mo22948c(), "setNativeViewHierarchy", str);
        }
    }

    /* renamed from: c */
    public WebView mo22948c() {
        return (WebView) this.f31483a.get();
    }

    /* renamed from: d */
    public void mo22949d() {
    }

    /* renamed from: a */
    public void mo22942a(C9205p pVar) {
        C9268re reVar = C9268re.f38174a;
        WebView c = mo22948c();
        pVar.getClass();
        JSONObject jSONObject = new JSONObject();
        C8919de.m48529a(jSONObject, "impressionOwner", pVar.f38034a);
        C8919de.m48529a(jSONObject, "mediaEventsOwner", pVar.f38035b);
        C8919de.m48529a(jSONObject, "creativeType", pVar.f38037d);
        C8919de.m48529a(jSONObject, "impressionType", pVar.f38038e);
        C8919de.m48529a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(pVar.f38036c));
        reVar.mo29889a(c, "init", jSONObject);
    }

    /* renamed from: a */
    public void mo22944a(C9267rd rdVar, C9230q qVar, JSONObject jSONObject) {
        String str = rdVar.f38171h;
        JSONObject jSONObject2 = new JSONObject();
        C8919de.m48529a(jSONObject2, "environment", "app");
        C8919de.m48529a(jSONObject2, "adSessionType", qVar.f38100h);
        JSONObject jSONObject3 = new JSONObject();
        C8919de.m48529a(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        C8919de.m48529a(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        C8919de.m48529a(jSONObject3, "os", "Android");
        C8919de.m48529a(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C8919de.m48529a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        C8919de.m48529a(jSONObject4, "partnerName", qVar.f38093a.f39555a);
        C8919de.m48529a(jSONObject4, "partnerVersion", qVar.f38093a.f39556b);
        C8919de.m48529a(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        C8919de.m48529a(jSONObject5, "libraryVersion", "1.3.31-Startio");
        C8919de.m48529a(jSONObject5, "appId", C9140me.f37312b.f37313a.getApplicationContext().getPackageName());
        C8919de.m48529a(jSONObject2, "app", jSONObject5);
        String str2 = qVar.f38099g;
        if (str2 != null) {
            C8919de.m48529a(jSONObject2, "contentUrl", str2);
        }
        String str3 = qVar.f38098f;
        if (str3 != null) {
            C8919de.m48529a(jSONObject2, "customReferenceData", str3);
        }
        JSONObject jSONObject6 = new JSONObject();
        for (T t : Collections.unmodifiableList(qVar.f38095c)) {
            C8919de.m48529a(jSONObject6, t.f36873a, t.f36875c);
        }
        C9268re.f38174a.mo29889a(mo22948c(), "startSession", str, jSONObject2, jSONObject6, jSONObject);
    }

    /* renamed from: a */
    public void mo22945a(String str, long j) {
        C6842a aVar;
        if (j >= this.f31487e && this.f31486d != (aVar = C6842a.AD_STATE_NOTVISIBLE)) {
            this.f31486d = aVar;
            C9268re.f38174a.mo29889a(mo22948c(), "setNativeViewHierarchy", str);
        }
    }
}
