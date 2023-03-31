package com.onesignal;

import com.onesignal.C8551p4;
import kotlin.jvm.internal.C11669k;
import org.json.JSONObject;

/* renamed from: com.onesignal.y0 */
/* compiled from: OSInAppMessageContent.kt */
public class C8662y0 {

    /* renamed from: a */
    private String f36165a;

    /* renamed from: b */
    private boolean f36166b = true;

    /* renamed from: c */
    private boolean f36167c = true;

    /* renamed from: d */
    private boolean f36168d;

    /* renamed from: e */
    private C8551p4.C8565m f36169e;

    /* renamed from: f */
    private Double f36170f;

    /* renamed from: g */
    private int f36171g;

    public C8662y0(JSONObject jSONObject) {
        C11669k.m56787e(jSONObject, "jsonObject");
        this.f36165a = jSONObject.optString("html");
        this.f36170f = Double.valueOf(jSONObject.optDouble("display_duration"));
        JSONObject optJSONObject = jSONObject.optJSONObject("styles");
        boolean z = false;
        this.f36166b = !(optJSONObject != null ? optJSONObject.optBoolean("remove_height_margin", false) : false);
        this.f36167c = !(optJSONObject != null ? optJSONObject.optBoolean("remove_width_margin", false) : z);
        this.f36168d = !this.f36166b;
    }

    /* renamed from: a */
    public final String mo28324a() {
        return this.f36165a;
    }

    /* renamed from: b */
    public final Double mo28325b() {
        return this.f36170f;
    }

    /* renamed from: c */
    public final C8551p4.C8565m mo28326c() {
        return this.f36169e;
    }

    /* renamed from: d */
    public final int mo28327d() {
        return this.f36171g;
    }

    /* renamed from: e */
    public final boolean mo28328e() {
        return this.f36166b;
    }

    /* renamed from: f */
    public final boolean mo28329f() {
        return this.f36167c;
    }

    /* renamed from: g */
    public final boolean mo28330g() {
        return this.f36168d;
    }

    /* renamed from: h */
    public final void mo28331h(String str) {
        this.f36165a = str;
    }

    /* renamed from: i */
    public final void mo28332i(C8551p4.C8565m mVar) {
        this.f36169e = mVar;
    }

    /* renamed from: j */
    public final void mo28333j(int i) {
        this.f36171g = i;
    }
}
